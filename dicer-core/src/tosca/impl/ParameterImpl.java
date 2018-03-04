/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tosca.Parameter;
import tosca.ToscaPackage;
import tosca.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.ParameterImpl#getParameter_name <em>Parameter name</em>}</li>
 *   <li>{@link tosca.impl.ParameterImpl#getParameter_value <em>Parameter value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
    /**
	 * The default value of the '{@link #getParameter_name() <em>Parameter name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getParameter_name()
	 * @generated
	 * @ordered
	 */
    protected static final String PARAMETER_NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getParameter_name() <em>Parameter name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getParameter_name()
	 * @generated
	 * @ordered
	 */
    protected String parameter_name = PARAMETER_NAME_EDEFAULT;

    /**
	 * The cached value of the '{@link #getParameter_value() <em>Parameter value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getParameter_value()
	 * @generated
	 * @ordered
	 */
    protected Value parameter_value;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ParameterImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ToscaPackage.Literals.PARAMETER;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getParameter_name() {
		return parameter_name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setParameter_name(String newParameter_name) {
		String oldParameter_name = parameter_name;
		parameter_name = newParameter_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.PARAMETER__PARAMETER_NAME, oldParameter_name, parameter_name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Value getParameter_value() {
		return parameter_value;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetParameter_value(Value newParameter_value, NotificationChain msgs) {
		Value oldParameter_value = parameter_value;
		parameter_value = newParameter_value;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.PARAMETER__PARAMETER_VALUE, oldParameter_value, newParameter_value);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setParameter_value(Value newParameter_value) {
		if (newParameter_value != parameter_value) {
			NotificationChain msgs = null;
			if (parameter_value != null)
				msgs = ((InternalEObject)parameter_value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.PARAMETER__PARAMETER_VALUE, null, msgs);
			if (newParameter_value != null)
				msgs = ((InternalEObject)newParameter_value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.PARAMETER__PARAMETER_VALUE, null, msgs);
			msgs = basicSetParameter_value(newParameter_value, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.PARAMETER__PARAMETER_VALUE, newParameter_value, newParameter_value));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.PARAMETER__PARAMETER_VALUE:
				return basicSetParameter_value(null, msgs);
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
			case ToscaPackage.PARAMETER__PARAMETER_NAME:
				return getParameter_name();
			case ToscaPackage.PARAMETER__PARAMETER_VALUE:
				return getParameter_value();
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
			case ToscaPackage.PARAMETER__PARAMETER_NAME:
				setParameter_name((String)newValue);
				return;
			case ToscaPackage.PARAMETER__PARAMETER_VALUE:
				setParameter_value((Value)newValue);
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
			case ToscaPackage.PARAMETER__PARAMETER_NAME:
				setParameter_name(PARAMETER_NAME_EDEFAULT);
				return;
			case ToscaPackage.PARAMETER__PARAMETER_VALUE:
				setParameter_value((Value)null);
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
			case ToscaPackage.PARAMETER__PARAMETER_NAME:
				return PARAMETER_NAME_EDEFAULT == null ? parameter_name != null : !PARAMETER_NAME_EDEFAULT.equals(parameter_name);
			case ToscaPackage.PARAMETER__PARAMETER_VALUE:
				return parameter_value != null;
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
		result.append(" (parameter_name: ");
		result.append(parameter_name);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
