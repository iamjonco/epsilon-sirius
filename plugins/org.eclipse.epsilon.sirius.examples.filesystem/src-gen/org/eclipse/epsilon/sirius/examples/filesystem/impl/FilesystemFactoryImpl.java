/**
 */
package org.eclipse.epsilon.sirius.examples.filesystem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.epsilon.sirius.examples.filesystem.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilesystemFactoryImpl extends EFactoryImpl implements FilesystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FilesystemFactory init() {
		try {
			FilesystemFactory theFilesystemFactory = (FilesystemFactory) EPackage.Registry.INSTANCE
					.getEFactory(FilesystemPackage.eNS_URI);
			if (theFilesystemFactory != null) {
				return theFilesystemFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FilesystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilesystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FilesystemPackage.FILESYSTEM:
			return createFilesystem();
		case FilesystemPackage.DRIVE:
			return createDrive();
		case FilesystemPackage.FOLDER:
			return createFolder();
		case FilesystemPackage.SHORTCUT:
			return createShortcut();
		case FilesystemPackage.SYNC:
			return createSync();
		case FilesystemPackage.FILE:
			return createFile();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filesystem createFilesystem() {
		FilesystemImpl filesystem = new FilesystemImpl();
		return filesystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drive createDrive() {
		DriveImpl drive = new DriveImpl();
		return drive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shortcut createShortcut() {
		ShortcutImpl shortcut = new ShortcutImpl();
		return shortcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sync createSync() {
		SyncImpl sync = new SyncImpl();
		return sync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilesystemPackage getFilesystemPackage() {
		return (FilesystemPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FilesystemPackage getPackage() {
		return FilesystemPackage.eINSTANCE;
	}

} //FilesystemFactoryImpl
