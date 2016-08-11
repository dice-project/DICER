/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tosca.Requirement;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.RequirementImpl#getRequirement_name <em>Requirement name</em>}</li>
 *   <li>{@link tosca.impl.RequirementImpl#getNode <em>Node</em>}</li>
 *   <li>{@link tosca.impl.RequirementImpl#getCapabiity <em>Capabiity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement {
    /**
     * The default value of the '{@link #getRequirement_name() <em>Requirement name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequirement_name()
     * @generated
     * @ordered
     */
    protected static final String REQUIREMENT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRequirement_name() <em>Requirement name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequirement_name()
     * @generated
     * @ordered
     */
    protected String requirement_name = REQUIREMENT_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode()
     * @generated
     * @ordered
     */
    protected static final String NODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode()
     * @generated
     * @ordered
     */
    protected String node = NODE_EDEFAULT;

    /**
     * The default value of the '{@link #getCapabiity() <em>Capabiity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabiity()
     * @generated
     * @ordered
     */
    protected static final String CAPABIITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCapabiity() <em>Capabiity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabiity()
     * @generated
     * @ordered
     */
    protected String capabiity = CAPABIITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RequirementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.REQUIREMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRequirement_name() {
        return requirement_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequirement_name(String newRequirement_name) {
        String oldRequirement_name = requirement_name;
        requirement_name = newRequirement_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.REQUIREMENT__REQUIREMENT_NAME, oldRequirement_name, requirement_name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNode() {
        return node;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNode(String newNode) {
        String oldNode = node;
        node = newNode;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.REQUIREMENT__NODE, oldNode, node));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCapabiity() {
        return capabiity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCapabiity(String newCapabiity) {
        String oldCapabiity = capabiity;
        capabiity = newCapabiity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.REQUIREMENT__CAPABIITY, oldCapabiity, capabiity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ToscaPackage.REQUIREMENT__REQUIREMENT_NAME:
                return getRequirement_name();
            case ToscaPackage.REQUIREMENT__NODE:
                return getNode();
            case ToscaPackage.REQUIREMENT__CAPABIITY:
                return getCapabiity();
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
            case ToscaPackage.REQUIREMENT__REQUIREMENT_NAME:
                setRequirement_name((String)newValue);
                return;
            case ToscaPackage.REQUIREMENT__NODE:
                setNode((String)newValue);
                return;
            case ToscaPackage.REQUIREMENT__CAPABIITY:
                setCapabiity((String)newValue);
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
            case ToscaPackage.REQUIREMENT__REQUIREMENT_NAME:
                setRequirement_name(REQUIREMENT_NAME_EDEFAULT);
                return;
            case ToscaPackage.REQUIREMENT__NODE:
                setNode(NODE_EDEFAULT);
                return;
            case ToscaPackage.REQUIREMENT__CAPABIITY:
                setCapabiity(CAPABIITY_EDEFAULT);
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
            case ToscaPackage.REQUIREMENT__REQUIREMENT_NAME:
                return REQUIREMENT_NAME_EDEFAULT == null ? requirement_name != null : !REQUIREMENT_NAME_EDEFAULT.equals(requirement_name);
            case ToscaPackage.REQUIREMENT__NODE:
                return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
            case ToscaPackage.REQUIREMENT__CAPABIITY:
                return CAPABIITY_EDEFAULT == null ? capabiity != null : !CAPABIITY_EDEFAULT.equals(capabiity);
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
        result.append(" (requirement_name: ");
        result.append(requirement_name);
        result.append(", node: ");
        result.append(node);
        result.append(", capabiity: ");
        result.append(capabiity);
        result.append(')');
        return result.toString();
    }

} //RequirementImpl
