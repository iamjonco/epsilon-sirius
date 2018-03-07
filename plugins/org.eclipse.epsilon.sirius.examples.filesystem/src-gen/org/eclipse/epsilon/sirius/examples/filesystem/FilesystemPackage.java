/**
 */
package org.eclipse.epsilon.sirius.examples.filesystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.epsilon.sirius.examples.filesystem.FilesystemFactory
 * @model kind="package"
 * @generated
 */
public interface FilesystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filesystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.epsilon.sirius.examples/filesystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "filesystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilesystemPackage eINSTANCE = org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemImpl <em>Filesystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemImpl
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemPackageImpl#getFilesystem()
	 * @generated
	 */
	int FILESYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Drives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM__DRIVES = 0;

	/**
	 * The feature id for the '<em><b>Syncs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM__SYNCS = 1;

	/**
	 * The number of structural features of the '<em>Filesystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Filesystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILESYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.sirius.examples.filesystem.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FileImpl
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.sirius.examples.filesystem.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FolderImpl
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__CONTENTS = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.sirius.examples.filesystem.impl.DriveImpl <em>Drive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.DriveImpl
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemPackageImpl#getDrive()
	 * @generated
	 */
	int DRIVE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE__NAME = FOLDER__NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE__CONTENTS = FOLDER__CONTENTS;

	/**
	 * The number of structural features of the '<em>Drive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_FEATURE_COUNT = FOLDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Drive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVE_OPERATION_COUNT = FOLDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.sirius.examples.filesystem.impl.ShortcutImpl <em>Shortcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.ShortcutImpl
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemPackageImpl#getShortcut()
	 * @generated
	 */
	int SHORTCUT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT__TARGET = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shortcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shortcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.epsilon.sirius.examples.filesystem.impl.SyncImpl <em>Sync</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.SyncImpl
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemPackageImpl#getSync()
	 * @generated
	 */
	int SYNC = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Last Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC__LAST_SYNC = 2;

	/**
	 * The number of structural features of the '<em>Sync</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sync</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.sirius.examples.filesystem.Filesystem <em>Filesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filesystem</em>'.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.Filesystem
	 * @generated
	 */
	EClass getFilesystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.sirius.examples.filesystem.Filesystem#getDrives <em>Drives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drives</em>'.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.Filesystem#getDrives()
	 * @see #getFilesystem()
	 * @generated
	 */
	EReference getFilesystem_Drives();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.sirius.examples.filesystem.Filesystem#getSyncs <em>Syncs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Syncs</em>'.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.Filesystem#getSyncs()
	 * @see #getFilesystem()
	 * @generated
	 */
	EReference getFilesystem_Syncs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.sirius.examples.filesystem.Drive <em>Drive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drive</em>'.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.Drive
	 * @generated
	 */
	EClass getDrive();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.sirius.examples.filesystem.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.epsilon.sirius.examples.filesystem.Folder#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.Folder#getContents()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Contents();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.sirius.examples.filesystem.Shortcut <em>Shortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shortcut</em>'.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.Shortcut
	 * @generated
	 */
	EClass getShortcut();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.sirius.examples.filesystem.Shortcut#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.Shortcut#getTarget()
	 * @see #getShortcut()
	 * @generated
	 */
	EReference getShortcut_Target();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.sirius.examples.filesystem.Sync <em>Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sync</em>'.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.Sync
	 * @generated
	 */
	EClass getSync();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.sirius.examples.filesystem.Sync#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.Sync#getSource()
	 * @see #getSync()
	 * @generated
	 */
	EReference getSync_Source();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.epsilon.sirius.examples.filesystem.Sync#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.Sync#getTarget()
	 * @see #getSync()
	 * @generated
	 */
	EReference getSync_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.sirius.examples.filesystem.Sync#getLastSync <em>Last Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Sync</em>'.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.Sync#getLastSync()
	 * @see #getSync()
	 * @generated
	 */
	EAttribute getSync_LastSync();

	/**
	 * Returns the meta object for class '{@link org.eclipse.epsilon.sirius.examples.filesystem.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.epsilon.sirius.examples.filesystem.File#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.epsilon.sirius.examples.filesystem.File#getName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FilesystemFactory getFilesystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemImpl <em>Filesystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemImpl
		 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemPackageImpl#getFilesystem()
		 * @generated
		 */
		EClass FILESYSTEM = eINSTANCE.getFilesystem();

		/**
		 * The meta object literal for the '<em><b>Drives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILESYSTEM__DRIVES = eINSTANCE.getFilesystem_Drives();

		/**
		 * The meta object literal for the '<em><b>Syncs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILESYSTEM__SYNCS = eINSTANCE.getFilesystem_Syncs();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.sirius.examples.filesystem.impl.DriveImpl <em>Drive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.DriveImpl
		 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemPackageImpl#getDrive()
		 * @generated
		 */
		EClass DRIVE = eINSTANCE.getDrive();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.sirius.examples.filesystem.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FolderImpl
		 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__CONTENTS = eINSTANCE.getFolder_Contents();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.sirius.examples.filesystem.impl.ShortcutImpl <em>Shortcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.ShortcutImpl
		 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemPackageImpl#getShortcut()
		 * @generated
		 */
		EClass SHORTCUT = eINSTANCE.getShortcut();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORTCUT__TARGET = eINSTANCE.getShortcut_Target();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.sirius.examples.filesystem.impl.SyncImpl <em>Sync</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.SyncImpl
		 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemPackageImpl#getSync()
		 * @generated
		 */
		EClass SYNC = eINSTANCE.getSync();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNC__SOURCE = eINSTANCE.getSync_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNC__TARGET = eINSTANCE.getSync_Target();

		/**
		 * The meta object literal for the '<em><b>Last Sync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNC__LAST_SYNC = eINSTANCE.getSync_LastSync();

		/**
		 * The meta object literal for the '{@link org.eclipse.epsilon.sirius.examples.filesystem.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FileImpl
		 * @see org.eclipse.epsilon.sirius.examples.filesystem.impl.FilesystemPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__NAME = eINSTANCE.getFile_Name();

	}

} //FilesystemPackage
