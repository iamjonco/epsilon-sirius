/**
 */
package org.eclipse.epsilon.sirius.examples.filesystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shortcut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.sirius.examples.filesystem.Shortcut#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.sirius.examples.filesystem.FilesystemPackage#getShortcut()
 * @model
 * @generated
 */
public interface Shortcut extends File {
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
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.FilesystemPackage#getShortcut_Target()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	File getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.epsilon.sirius.examples.filesystem.Shortcut#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(File value);

} // Shortcut
