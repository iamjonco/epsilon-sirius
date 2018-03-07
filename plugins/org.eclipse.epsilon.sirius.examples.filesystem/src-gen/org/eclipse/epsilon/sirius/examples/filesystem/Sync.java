/**
 */
package org.eclipse.epsilon.sirius.examples.filesystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sync</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.sirius.examples.filesystem.Sync#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.epsilon.sirius.examples.filesystem.Sync#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.epsilon.sirius.examples.filesystem.Sync#getLastSync <em>Last Sync</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.sirius.examples.filesystem.FilesystemPackage#getSync()
 * @model annotation="gmf.link label='lastSync' source='source' target='target' style='dot' width='2'"
 * @generated
 */
public interface Sync extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(File)
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.FilesystemPackage#getSync_Source()
	 * @model
	 * @generated
	 */
	File getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.sirius.examples.filesystem.Sync#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(File value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(File)
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.FilesystemPackage#getSync_Target()
	 * @model
	 * @generated
	 */
	File getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.sirius.examples.filesystem.Sync#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(File value);

	/**
	 * Returns the value of the '<em><b>Last Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Sync</em>' attribute.
	 * @see #setLastSync(String)
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.FilesystemPackage#getSync_LastSync()
	 * @model
	 * @generated
	 */
	String getLastSync();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.sirius.examples.filesystem.Sync#getLastSync <em>Last Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Sync</em>' attribute.
	 * @see #getLastSync()
	 * @generated
	 */
	void setLastSync(String value);

} // Sync
