/**
 */
package org.eclipse.epsilon.sirius.examples.filesystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filesystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.epsilon.sirius.examples.filesystem.Filesystem#getDrives <em>Drives</em>}</li>
 *   <li>{@link org.eclipse.epsilon.sirius.examples.filesystem.Filesystem#getSyncs <em>Syncs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.epsilon.sirius.examples.filesystem.FilesystemPackage#getFilesystem()
 * @model
 * @generated
 */
public interface Filesystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Drives</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.sirius.examples.filesystem.Drive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drives</em>' containment reference list.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.FilesystemPackage#getFilesystem_Drives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Drive> getDrives();

	/**
	 * Returns the value of the '<em><b>Syncs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.epsilon.sirius.examples.filesystem.Sync}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syncs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syncs</em>' containment reference list.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.FilesystemPackage#getFilesystem_Syncs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sync> getSyncs();

} // Filesystem
