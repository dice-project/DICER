/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tosca.Import;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.ImportImpl#getImport_name <em>Import name</em>}</li>
 *   <li>{@link tosca.impl.ImportImpl#getFile <em>File</em>}</li>
 *   <li>{@link tosca.impl.ImportImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link tosca.impl.ImportImpl#getNamespace_uri <em>Namespace uri</em>}</li>
 *   <li>{@link tosca.impl.ImportImpl#getNamespace_prefix <em>Namespace prefix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import {
    /**
     * The default value of the '{@link #getImport_name() <em>Import name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImport_name()
     * @generated
     * @ordered
     */
    protected static final String IMPORT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImport_name() <em>Import name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImport_name()
     * @generated
     * @ordered
     */
    protected String import_name = IMPORT_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFile() <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFile()
     * @generated
     * @ordered
     */
    protected static final String FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFile()
     * @generated
     * @ordered
     */
    protected String file = FILE_EDEFAULT;

    /**
     * The default value of the '{@link #getRepository() <em>Repository</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepository()
     * @generated
     * @ordered
     */
    protected static final String REPOSITORY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRepository() <em>Repository</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepository()
     * @generated
     * @ordered
     */
    protected String repository = REPOSITORY_EDEFAULT;

    /**
     * The default value of the '{@link #getNamespace_uri() <em>Namespace uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace_uri()
     * @generated
     * @ordered
     */
    protected static final String NAMESPACE_URI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNamespace_uri() <em>Namespace uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace_uri()
     * @generated
     * @ordered
     */
    protected String namespace_uri = NAMESPACE_URI_EDEFAULT;

    /**
     * The default value of the '{@link #getNamespace_prefix() <em>Namespace prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace_prefix()
     * @generated
     * @ordered
     */
    protected static final String NAMESPACE_PREFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNamespace_prefix() <em>Namespace prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace_prefix()
     * @generated
     * @ordered
     */
    protected String namespace_prefix = NAMESPACE_PREFIX_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ImportImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.IMPORT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getImport_name() {
        return import_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImport_name(String newImport_name) {
        String oldImport_name = import_name;
        import_name = newImport_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.IMPORT__IMPORT_NAME, oldImport_name, import_name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFile() {
        return file;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFile(String newFile) {
        String oldFile = file;
        file = newFile;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.IMPORT__FILE, oldFile, file));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRepository() {
        return repository;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRepository(String newRepository) {
        String oldRepository = repository;
        repository = newRepository;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.IMPORT__REPOSITORY, oldRepository, repository));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNamespace_uri() {
        return namespace_uri;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNamespace_uri(String newNamespace_uri) {
        String oldNamespace_uri = namespace_uri;
        namespace_uri = newNamespace_uri;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.IMPORT__NAMESPACE_URI, oldNamespace_uri, namespace_uri));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNamespace_prefix() {
        return namespace_prefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNamespace_prefix(String newNamespace_prefix) {
        String oldNamespace_prefix = namespace_prefix;
        namespace_prefix = newNamespace_prefix;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.IMPORT__NAMESPACE_PREFIX, oldNamespace_prefix, namespace_prefix));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ToscaPackage.IMPORT__IMPORT_NAME:
                return getImport_name();
            case ToscaPackage.IMPORT__FILE:
                return getFile();
            case ToscaPackage.IMPORT__REPOSITORY:
                return getRepository();
            case ToscaPackage.IMPORT__NAMESPACE_URI:
                return getNamespace_uri();
            case ToscaPackage.IMPORT__NAMESPACE_PREFIX:
                return getNamespace_prefix();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ToscaPackage.IMPORT__IMPORT_NAME:
                setImport_name((String)newValue);
                return;
            case ToscaPackage.IMPORT__FILE:
                setFile((String)newValue);
                return;
            case ToscaPackage.IMPORT__REPOSITORY:
                setRepository((String)newValue);
                return;
            case ToscaPackage.IMPORT__NAMESPACE_URI:
                setNamespace_uri((String)newValue);
                return;
            case ToscaPackage.IMPORT__NAMESPACE_PREFIX:
                setNamespace_prefix((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ToscaPackage.IMPORT__IMPORT_NAME:
                setImport_name(IMPORT_NAME_EDEFAULT);
                return;
            case ToscaPackage.IMPORT__FILE:
                setFile(FILE_EDEFAULT);
                return;
            case ToscaPackage.IMPORT__REPOSITORY:
                setRepository(REPOSITORY_EDEFAULT);
                return;
            case ToscaPackage.IMPORT__NAMESPACE_URI:
                setNamespace_uri(NAMESPACE_URI_EDEFAULT);
                return;
            case ToscaPackage.IMPORT__NAMESPACE_PREFIX:
                setNamespace_prefix(NAMESPACE_PREFIX_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ToscaPackage.IMPORT__IMPORT_NAME:
                return IMPORT_NAME_EDEFAULT == null ? import_name != null : !IMPORT_NAME_EDEFAULT.equals(import_name);
            case ToscaPackage.IMPORT__FILE:
                return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
            case ToscaPackage.IMPORT__REPOSITORY:
                return REPOSITORY_EDEFAULT == null ? repository != null : !REPOSITORY_EDEFAULT.equals(repository);
            case ToscaPackage.IMPORT__NAMESPACE_URI:
                return NAMESPACE_URI_EDEFAULT == null ? namespace_uri != null : !NAMESPACE_URI_EDEFAULT.equals(namespace_uri);
            case ToscaPackage.IMPORT__NAMESPACE_PREFIX:
                return NAMESPACE_PREFIX_EDEFAULT == null ? namespace_prefix != null : !NAMESPACE_PREFIX_EDEFAULT.equals(namespace_prefix);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (import_name: ");
        result.append(import_name);
        result.append(", file: ");
        result.append(file);
        result.append(", repository: ");
        result.append(repository);
        result.append(", namespace_uri: ");
        result.append(namespace_uri);
        result.append(", namespace_prefix: ");
        result.append(namespace_prefix);
        result.append(')');
        return result.toString();
    }

} //ImportImpl
