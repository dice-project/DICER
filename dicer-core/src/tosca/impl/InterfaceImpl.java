/**
 */
package tosca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tosca.Interface;
import tosca.Operation;
import tosca.Property;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.InterfaceImpl#getInterface_name <em>Interface name</em>}</li>
 *   <li>{@link tosca.impl.InterfaceImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link tosca.impl.InterfaceImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link tosca.impl.InterfaceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends MinimalEObjectImpl.Container implements Interface {
    /**
     * The default value of the '{@link #getInterface_name() <em>Interface name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterface_name()
     * @generated
     * @ordered
     */
    protected static final String INTERFACE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInterface_name() <em>Interface name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterface_name()
     * @generated
     * @ordered
     */
    protected String interface_name = INTERFACE_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperations()
     * @generated
     * @ordered
     */
    protected EList<Operation> operations;

    /**
     * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputs()
     * @generated
     * @ordered
     */
    protected EList<Property> inputs;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InterfaceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.INTERFACE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInterface_name() {
        return interface_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInterface_name(String newInterface_name) {
        String oldInterface_name = interface_name;
        interface_name = newInterface_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.INTERFACE__INTERFACE_NAME, oldInterface_name, interface_name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Operation> getOperations() {
        if (operations == null) {
            operations = new EObjectContainmentEList<Operation>(Operation.class, this, ToscaPackage.INTERFACE__OPERATIONS);
        }
        return operations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getInputs() {
        if (inputs == null) {
            inputs = new EObjectContainmentEList<Property>(Property.class, this, ToscaPackage.INTERFACE__INPUTS);
        }
        return inputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.INTERFACE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ToscaPackage.INTERFACE__OPERATIONS:
                return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
            case ToscaPackage.INTERFACE__INPUTS:
                return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ToscaPackage.INTERFACE__INTERFACE_NAME:
                return getInterface_name();
            case ToscaPackage.INTERFACE__OPERATIONS:
                return getOperations();
            case ToscaPackage.INTERFACE__INPUTS:
                return getInputs();
            case ToscaPackage.INTERFACE__TYPE:
                return getType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ToscaPackage.INTERFACE__INTERFACE_NAME:
                setInterface_name((String)newValue);
                return;
            case ToscaPackage.INTERFACE__OPERATIONS:
                getOperations().clear();
                getOperations().addAll((Collection<? extends Operation>)newValue);
                return;
            case ToscaPackage.INTERFACE__INPUTS:
                getInputs().clear();
                getInputs().addAll((Collection<? extends Property>)newValue);
                return;
            case ToscaPackage.INTERFACE__TYPE:
                setType((String)newValue);
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
            case ToscaPackage.INTERFACE__INTERFACE_NAME:
                setInterface_name(INTERFACE_NAME_EDEFAULT);
                return;
            case ToscaPackage.INTERFACE__OPERATIONS:
                getOperations().clear();
                return;
            case ToscaPackage.INTERFACE__INPUTS:
                getInputs().clear();
                return;
            case ToscaPackage.INTERFACE__TYPE:
                setType(TYPE_EDEFAULT);
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
            case ToscaPackage.INTERFACE__INTERFACE_NAME:
                return INTERFACE_NAME_EDEFAULT == null ? interface_name != null : !INTERFACE_NAME_EDEFAULT.equals(interface_name);
            case ToscaPackage.INTERFACE__OPERATIONS:
                return operations != null && !operations.isEmpty();
            case ToscaPackage.INTERFACE__INPUTS:
                return inputs != null && !inputs.isEmpty();
            case ToscaPackage.INTERFACE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
        result.append(" (interface_name: ");
        result.append(interface_name);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //InterfaceImpl
