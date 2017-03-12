/**
 */
package tosca.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tosca.FirewallRule;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Firewall Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.FirewallRuleImpl#getRemote_ip_prefix <em>Remote ip prefix</em>}</li>
 *   <li>{@link tosca.impl.FirewallRuleImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FirewallRuleImpl extends MinimalEObjectImpl.Container implements FirewallRule {
	/**
     * The default value of the '{@link #getRemote_ip_prefix() <em>Remote ip prefix</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRemote_ip_prefix()
     * @generated
     * @ordered
     */
	protected static final String REMOTE_IP_PREFIX_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRemote_ip_prefix() <em>Remote ip prefix</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRemote_ip_prefix()
     * @generated
     * @ordered
     */
	protected String remote_ip_prefix = REMOTE_IP_PREFIX_EDEFAULT;

	/**
     * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
	protected static final String PORT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPort()
     * @generated
     * @ordered
     */
	protected String port = PORT_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FirewallRuleImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return ToscaPackage.Literals.FIREWALL_RULE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getRemote_ip_prefix() {
        return remote_ip_prefix;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRemote_ip_prefix(String newRemote_ip_prefix) {
        String oldRemote_ip_prefix = remote_ip_prefix;
        remote_ip_prefix = newRemote_ip_prefix;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.FIREWALL_RULE__REMOTE_IP_PREFIX, oldRemote_ip_prefix, remote_ip_prefix));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getPort() {
        return port;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPort(String newPort) {
        String oldPort = port;
        port = newPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.FIREWALL_RULE__PORT, oldPort, port));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ToscaPackage.FIREWALL_RULE__REMOTE_IP_PREFIX:
                return getRemote_ip_prefix();
            case ToscaPackage.FIREWALL_RULE__PORT:
                return getPort();
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
            case ToscaPackage.FIREWALL_RULE__REMOTE_IP_PREFIX:
                setRemote_ip_prefix((String)newValue);
                return;
            case ToscaPackage.FIREWALL_RULE__PORT:
                setPort((String)newValue);
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
            case ToscaPackage.FIREWALL_RULE__REMOTE_IP_PREFIX:
                setRemote_ip_prefix(REMOTE_IP_PREFIX_EDEFAULT);
                return;
            case ToscaPackage.FIREWALL_RULE__PORT:
                setPort(PORT_EDEFAULT);
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
            case ToscaPackage.FIREWALL_RULE__REMOTE_IP_PREFIX:
                return REMOTE_IP_PREFIX_EDEFAULT == null ? remote_ip_prefix != null : !REMOTE_IP_PREFIX_EDEFAULT.equals(remote_ip_prefix);
            case ToscaPackage.FIREWALL_RULE__PORT:
                return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
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
        result.append(" (remote_ip_prefix: ");
        result.append(remote_ip_prefix);
        result.append(", port: ");
        result.append(port);
        result.append(')');
        return result.toString();
    }

} //FirewallRuleImpl
