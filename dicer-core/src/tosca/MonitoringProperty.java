/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitoring Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.MonitoringProperty#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link tosca.MonitoringProperty#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getMonitoringProperty()
 * @model
 * @generated
 */
public interface MonitoringProperty extends EObject {
    /**
     * Returns the value of the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enabled</em>' attribute.
     * @see #setEnabled(boolean)
     * @see tosca.ToscaPackage#getMonitoringProperty_Enabled()
     * @model required="true"
     * @generated
     */
    boolean isEnabled();

    /**
     * Sets the value of the '{@link tosca.MonitoringProperty#isEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enabled</em>' attribute.
     * @see #isEnabled()
     * @generated
     */
    void setEnabled(boolean value);

    /**
     * Returns the value of the '<em><b>Roles</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Roles</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Roles</em>' attribute list.
     * @see tosca.ToscaPackage#getMonitoringProperty_Roles()
     * @model
     * @generated
     */
    EList<String> getRoles();

} // MonitoringProperty
