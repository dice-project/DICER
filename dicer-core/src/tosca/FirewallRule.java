/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Firewall Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.FirewallRule#getRemote_ip_prefix <em>Remote ip prefix</em>}</li>
 *   <li>{@link tosca.FirewallRule#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getFirewallRule()
 * @model
 * @generated
 */
public interface FirewallRule extends EObject {
	/**
     * Returns the value of the '<em><b>Remote ip prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote ip prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Remote ip prefix</em>' attribute.
     * @see #setRemote_ip_prefix(String)
     * @see tosca.ToscaPackage#getFirewallRule_Remote_ip_prefix()
     * @model unique="false" required="true"
     * @generated
     */
	String getRemote_ip_prefix();

	/**
     * Sets the value of the '{@link tosca.FirewallRule#getRemote_ip_prefix <em>Remote ip prefix</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote ip prefix</em>' attribute.
     * @see #getRemote_ip_prefix()
     * @generated
     */
	void setRemote_ip_prefix(String value);

	/**
     * Returns the value of the '<em><b>Port</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Port</em>' attribute.
     * @see #setPort(String)
     * @see tosca.ToscaPackage#getFirewallRule_Port()
     * @model required="true"
     * @generated
     */
	String getPort();

	/**
     * Sets the value of the '{@link tosca.FirewallRule#getPort <em>Port</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port</em>' attribute.
     * @see #getPort()
     * @generated
     */
	void setPort(String value);

} // FirewallRule
