/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tosca.Argument;
import tosca.ToscaPackage;
import tosca.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.ArgumentImpl#getArgument_name <em>Argument name</em>}</li>
 *   <li>{@link tosca.impl.ArgumentImpl#getArgument_value <em>Argument value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentImpl extends MinimalEObjectImpl.Container implements Argument {
    /**
     * The default value of the '{@link #getArgument_name() <em>Argument name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArgument_name()
     * @generated
     * @ordered
     */
    protected static final String ARGUMENT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getArgument_name() <em>Argument name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArgument_name()
     * @generated
     * @ordered
     */
    protected String argument_name = ARGUMENT_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getArgument_value() <em>Argument value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArgument_value()
     * @generated
     * @ordered
     */
    protected Value argument_value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ArgumentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.ARGUMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getArgument_name() {
        return argument_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setArgument_name(String newArgument_name) {
        String oldArgument_name = argument_name;
        argument_name = newArgument_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.ARGUMENT__ARGUMENT_NAME, oldArgument_name, argument_name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Value getArgument_value() {
        return argument_value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetArgument_value(Value newArgument_value, NotificationChain msgs) {
        Value oldArgument_value = argument_value;
        argument_value = newArgument_value;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.ARGUMENT__ARGUMENT_VALUE, oldArgument_value, newArgument_value);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setArgument_value(Value newArgument_value) {
        if (newArgument_value != argument_value) {
            NotificationChain msgs = null;
            if (argument_value != null)
                msgs = ((InternalEObject)argument_value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.ARGUMENT__ARGUMENT_VALUE, null, msgs);
            if (newArgument_value != null)
                msgs = ((InternalEObject)newArgument_value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.ARGUMENT__ARGUMENT_VALUE, null, msgs);
            msgs = basicSetArgument_value(newArgument_value, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.ARGUMENT__ARGUMENT_VALUE, newArgument_value, newArgument_value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ToscaPackage.ARGUMENT__ARGUMENT_VALUE:
                return basicSetArgument_value(null, msgs);
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
            case ToscaPackage.ARGUMENT__ARGUMENT_NAME:
                return getArgument_name();
            case ToscaPackage.ARGUMENT__ARGUMENT_VALUE:
                return getArgument_value();
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
            case ToscaPackage.ARGUMENT__ARGUMENT_NAME:
                setArgument_name((String)newValue);
                return;
            case ToscaPackage.ARGUMENT__ARGUMENT_VALUE:
                setArgument_value((Value)newValue);
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
            case ToscaPackage.ARGUMENT__ARGUMENT_NAME:
                setArgument_name(ARGUMENT_NAME_EDEFAULT);
                return;
            case ToscaPackage.ARGUMENT__ARGUMENT_VALUE:
                setArgument_value((Value)null);
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
            case ToscaPackage.ARGUMENT__ARGUMENT_NAME:
                return ARGUMENT_NAME_EDEFAULT == null ? argument_name != null : !ARGUMENT_NAME_EDEFAULT.equals(argument_name);
            case ToscaPackage.ARGUMENT__ARGUMENT_VALUE:
                return argument_value != null;
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
        result.append(" (argument_name: ");
        result.append(argument_name);
        result.append(')');
        return result.toString();
    }

} //ArgumentImpl
