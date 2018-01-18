/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tosca.EnvironmentVariable;
import tosca.ToscaPackage;
import tosca.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.EnvironmentVariableImpl#getVariable_name <em>Variable name</em>}</li>
 *   <li>{@link tosca.impl.EnvironmentVariableImpl#getVariable_value <em>Variable value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentVariableImpl extends MinimalEObjectImpl.Container implements EnvironmentVariable {
    /**
     * The default value of the '{@link #getVariable_name() <em>Variable name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariable_name()
     * @generated
     * @ordered
     */
    protected static final String VARIABLE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVariable_name() <em>Variable name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariable_name()
     * @generated
     * @ordered
     */
    protected String variable_name = VARIABLE_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getVariable_value() <em>Variable value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariable_value()
     * @generated
     * @ordered
     */
    protected Value variable_value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnvironmentVariableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.ENVIRONMENT_VARIABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVariable_name() {
        return variable_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVariable_name(String newVariable_name) {
        String oldVariable_name = variable_name;
        variable_name = newVariable_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.ENVIRONMENT_VARIABLE__VARIABLE_NAME, oldVariable_name, variable_name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Value getVariable_value() {
        return variable_value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVariable_value(Value newVariable_value, NotificationChain msgs) {
        Value oldVariable_value = variable_value;
        variable_value = newVariable_value;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.ENVIRONMENT_VARIABLE__VARIABLE_VALUE, oldVariable_value, newVariable_value);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVariable_value(Value newVariable_value) {
        if (newVariable_value != variable_value) {
            NotificationChain msgs = null;
            if (variable_value != null)
                msgs = ((InternalEObject)variable_value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.ENVIRONMENT_VARIABLE__VARIABLE_VALUE, null, msgs);
            if (newVariable_value != null)
                msgs = ((InternalEObject)newVariable_value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.ENVIRONMENT_VARIABLE__VARIABLE_VALUE, null, msgs);
            msgs = basicSetVariable_value(newVariable_value, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.ENVIRONMENT_VARIABLE__VARIABLE_VALUE, newVariable_value, newVariable_value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ToscaPackage.ENVIRONMENT_VARIABLE__VARIABLE_VALUE:
                return basicSetVariable_value(null, msgs);
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
            case ToscaPackage.ENVIRONMENT_VARIABLE__VARIABLE_NAME:
                return getVariable_name();
            case ToscaPackage.ENVIRONMENT_VARIABLE__VARIABLE_VALUE:
                return getVariable_value();
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
            case ToscaPackage.ENVIRONMENT_VARIABLE__VARIABLE_NAME:
                setVariable_name((String)newValue);
                return;
            case ToscaPackage.ENVIRONMENT_VARIABLE__VARIABLE_VALUE:
                setVariable_value((Value)newValue);
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
            case ToscaPackage.ENVIRONMENT_VARIABLE__VARIABLE_NAME:
                setVariable_name(VARIABLE_NAME_EDEFAULT);
                return;
            case ToscaPackage.ENVIRONMENT_VARIABLE__VARIABLE_VALUE:
                setVariable_value((Value)null);
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
            case ToscaPackage.ENVIRONMENT_VARIABLE__VARIABLE_NAME:
                return VARIABLE_NAME_EDEFAULT == null ? variable_name != null : !VARIABLE_NAME_EDEFAULT.equals(variable_name);
            case ToscaPackage.ENVIRONMENT_VARIABLE__VARIABLE_VALUE:
                return variable_value != null;
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
        result.append(" (variable_name: ");
        result.append(variable_name);
        result.append(')');
        return result.toString();
    }

} //EnvironmentVariableImpl
