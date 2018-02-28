package org.eclipse.epsilon.sirius.common.ocl.business.internal.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.EolEvaluatorException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.types.EolModelElementType;
import org.eclipse.epsilon.eol.types.EolType;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterContext;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterProvider;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterStatus;
import org.eclipse.sirius.common.tools.api.interpreter.IVariableStatusListener;
import org.eclipse.sirius.common.tools.api.interpreter.VariableManager;
import org.eclipse.sirius.ecore.extender.business.api.accessor.MetamodelDescriptor;
import org.eclipse.sirius.ecore.extender.business.api.accessor.ModelAccessor;

/**
 * Basic implementation of an EOL interpreter for use with Sirius based model
 * editors.
 * 
 * Adapted from {@link org.eclipse.sirius.common.ocl.business.internal.interpreter.OclInterpreter}
 * 
 * @author Jonathan Co
 *
 */
public class EolInterpreter implements IInterpreter, IInterpreterProvider {
	
	public static final String EOL_PREFIX = "eol:";

	private final VariableManager variables = new VariableManager();
	private final Set<IVariableStatusListener> variablesListeners = new HashSet<IVariableStatusListener>();

	@Override
	public void addImport(String dependency) {
		// TODO Auto-generated method stub
	}

	@Override
	public void addVariableStatusListener(IVariableStatusListener newListener) {
		this.variablesListeners.add(newListener);
	}

	@Override
	public void clearImports() {
		// TODO Auto-generated method stub
	}

	@Override
	public void clearVariables() {
		this.variables.clearVariables();
		this.fireVariablesChanged();
	}
	
	protected void fireVariablesChanged() {
		for (final IVariableStatusListener listener : this.variablesListeners) {
			listener.notifyChanged(getVariables());
		}
	}

	@Override
	public void dispose() {
		this.variables.clearVariables();
		this.variablesListeners.clear();
	}

	@Override
	public Collection<String> getImports() {
		return Collections.<String>emptyList();
	}

	@Override
	public String getPrefix() {
		return EolInterpreter.EOL_PREFIX;
	}

	@Override
	public Object getVariable(String name) {
		return this.variables.getVariable(name);
	}

	@Override
	public String getVariablePrefix() {
		return null;
	}

	@Override
	public Map<String, ?> getVariables() {
		return this.variables.getVariables();
	}

	@Override
	public boolean provides(String expression) {
		return expression != null && expression.startsWith(EolInterpreter.EOL_PREFIX);
	}

	@Override
	public void removeImport(String dependency) {
		// TODO Auto-generated method stub
	}

	@Override
	public void removeVariableStatusListener(IVariableStatusListener listener) {
		this.variablesListeners.remove(listener);
	}

	@Override
	public void setProperty(Object key, Object value) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setVariable(String name, Object value) {
		this.variables.setVariable(name, value);
		this.fireVariablesChanged();
	}

	@Override
	public boolean supportsValidation() {
		// TODO Auto-generated method stub
		// FIXME: Fairly sure EOL supports validation
		return false;
	}

	@Override
	public void unSetVariable(String name) {
        this.variables.unSetVariable(name);
        this.fireVariablesChanged();
	}

	@Override
	public Collection<IInterpreterStatus> validateExpression(IInterpreterContext context, String expression) {
        return Collections.<IInterpreterStatus>emptySet();
	}
	
	@Override
	public Collection<EObject> evaluateCollection(EObject target, String expression) throws EvaluationException {
        final Object value = this.evaluate(target, expression);
        Collection<EObject> result = Collections.emptyList();
        if (value instanceof EObject) {
            result = new ArrayList<EObject>(1);
            result.add((EObject) value);
        } else if (value instanceof Collection) {
            result = new ArrayList<EObject>(((Collection<?>) value).size());
            for (final Object object : (Collection<?>) value) {
                if (object instanceof EObject) {
                    result.add((EObject) object);
                }
            }
        } else if (value != null && value.getClass().isArray()) {
            result = new ArrayList<EObject>(((Object[]) value).length);
            for (final Object object : (Object[]) value) {
                if (object instanceof EObject) {
                    result.add((EObject) object);
                }
            }
        }

        return result;
	}

	@Override
	public Object evaluate(EObject target, String expression) throws EvaluationException {
		// Initial checks
		if (expression.trim().equals(EolInterpreter.EOL_PREFIX)) return null;
		this.setVariable("self", target);
		
		Object result = null;
		IEolContext context = null;
		try {
			final EolModule module = new EolModule();
			final Map<Resource, InMemoryEmfModel> models = new HashMap<Resource, InMemoryEmfModel>();
			
			// Setup Semantic Model
			final InMemoryEmfModel semanticModel = new InMemoryEmfModel(target.eResource());
			models.put(target.eResource(), semanticModel);
			semanticModel.setName("Model"); // FIXME: situation where there is more than one model
			context = module.getContext();
			context.getModelRepository().addModel(semanticModel);
			
			// Setup Variables Models
			for (Entry<String, ?> e : this.getVariables().entrySet()) {
				
				InMemoryEmfModel model;
				if (e.getValue() instanceof EObject) {
					final Resource res = ((EObject) e.getValue()).eResource();
					model = models.get(res);
										
					// Model does not exist, create it and store
					if (model == null && res != null) {
						model = new InMemoryEmfModel(res);
						models.put(res, model);
						model.setName(res.getURI().lastSegment());
						context.getModelRepository().addModel(model);						
					}
					
					if (model != null) {
						final String typeName = model.getTypeNameOf(e.getValue());
						final EolType eolType = new EolModelElementType(model.getName() + "!" + typeName, context);
						final Variable variable = new Variable(e.getKey(), e.getValue(), eolType);
						context.getFrameStack().putGlobal(variable);
					}
				}
			}
			
			final String eol = String.format("return %s;", expression.substring(EolInterpreter.EOL_PREFIX.length()));
			module.parse(eol);
			if (module.getParseProblems().size() > 0) {
				throw new EolEvaluatorException(module.getParseProblems());
			}
			
			result = module.execute();
			
		} catch(Exception e) {
			e.printStackTrace();
			throw new EvaluationException(e);
		} finally {
			if (context != null) context.dispose();
		}
		
		return result;
	}

	@Override
	public boolean evaluateBoolean(EObject target, String expression) throws EvaluationException {
        final Object value = this.evaluate(target, expression);
		boolean result = false;
        if (value instanceof Boolean) {
            result = ((Boolean) value).booleanValue();
        } else if (value instanceof String) {
            result = Boolean.parseBoolean((String) value);
        }
        return result;
	}

	@Override
	public EObject evaluateEObject(EObject target, String expression) throws EvaluationException {
		final Object value = evaluate(target, expression);
		if (value instanceof EObject) {
			return (EObject) value;
		}
		return null;
	}

	@Override
	public String evaluateString(EObject target, String expression) throws EvaluationException {
        final Object value = this.evaluate(target, expression);
        if (value != null) {
            return value.toString();
        }
        return null;
	}

	@Override
	public Integer evaluateInteger(EObject target, String expression) throws EvaluationException {
        final Object value = this.evaluate(target, expression);
        Integer result = null;
        if (value instanceof Integer) {
            result = (Integer) value;
        } else if (value instanceof String) {
            try {
                result = new Integer((String) value);
            } catch (final NumberFormatException e) {
            	throw new EvaluationException(e);
            }
        }
        return result;
	}

	@Override
	public void setModelAccessor(ModelAccessor modelAccessor) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setCrossReferencer(ECrossReferenceAdapter crossReferencer) {
		// TODO Auto-generated method stub
	}

	@Override
	public void activateMetamodels(Collection<MetamodelDescriptor> metamodels) {
		// TODO Auto-generated method stub
	}

	@Override
	public IInterpreter createInterpreter() {
		return new EolInterpreter();
	}

}
