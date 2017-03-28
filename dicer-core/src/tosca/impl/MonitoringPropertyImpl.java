/**
 */
package tosca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import tosca.MonitoringProperty;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitoring Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.MonitoringPropertyImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link tosca.impl.MonitoringPropertyImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoringPropertyImpl extends MinimalEObjectImpl.Container implements MonitoringProperty {
    /**
     * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEnabled()
     * @generated
     * @ordered
     */
    protected static final boolean ENABLED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEnabled()
     * @generated
     * @ordered
     */
    protected boolean enabled = ENABLED_EDEFAULT;

    /**
     * The cached value of the '{@link #getRoles() <em>Roles</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRoles()
     * @generated
     * @ordered
     */
    protected EList<String> roles;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MonitoringPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.MONITORING_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnabled(boolean newEnabled) {
        boolean oldEnabled = enabled;
        enabled = newEnabled;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.MONITORING_PROPERTY__ENABLED, oldEnabled, enabled));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getRoles() {
        if (roles == null) {
            roles = new EDataTypeUniqueEList<String>(String.class, this, ToscaPackage.MONITORING_PROPERTY__ROLES);
        }
        return roles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ToscaPackage.MONITORING_PROPERTY__ENABLED:
                return isEnabled();
            case ToscaPackage.MONITORING_PROPERTY__ROLES:
                return getRoles();
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
            case ToscaPackage.MONITORING_PROPERTY__ENABLED:
                setEnabled((Boolean)newValue);
                return;
            case ToscaPackage.MONITORING_PROPERTY__ROLES:
                getRoles().clear();
                getRoles().addAll((Collection<? extends String>)newValue);
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
            case ToscaPackage.MONITORING_PROPERTY__ENABLED:
                setEnabled(ENABLED_EDEFAULT);
                return;
            case ToscaPackage.MONITORING_PROPERTY__ROLES:
                getRoles().clear();
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
            case ToscaPackage.MONITORING_PROPERTY__ENABLED:
                return enabled != ENABLED_EDEFAULT;
            case ToscaPackage.MONITORING_PROPERTY__ROLES:
                return roles != null && !roles.isEmpty();
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
        result.append(" (enabled: ");
        result.append(enabled);
        result.append(", roles: ");
        result.append(roles);
        result.append(')');
        return result.toString();
    }

} //MonitoringPropertyImpl
