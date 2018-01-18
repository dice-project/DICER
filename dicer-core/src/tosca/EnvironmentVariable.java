/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.EnvironmentVariable#getVariable_name <em>Variable name</em>}</li>
 *   <li>{@link tosca.EnvironmentVariable#getVariable_value <em>Variable value</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getEnvironmentVariable()
 * @model
 * @generated
 */
public interface EnvironmentVariable extends EObject {
    /**
     * Returns the value of the '<em><b>Variable name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable name</em>' attribute.
     * @see #setVariable_name(String)
     * @see tosca.ToscaPackage#getEnvironmentVariable_Variable_name()
     * @model required="true"
     * @generated
     */
    String getVariable_name();

    /**
     * Sets the value of the '{@link tosca.EnvironmentVariable#getVariable_name <em>Variable name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable name</em>' attribute.
     * @see #getVariable_name()
     * @generated
     */
    void setVariable_name(String value);

    /**
     * Returns the value of the '<em><b>Variable value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable value</em>' containment reference.
     * @see #setVariable_value(Value)
     * @see tosca.ToscaPackage#getEnvironmentVariable_Variable_value()
     * @model containment="true" required="true"
     * @generated
     */
    Value getVariable_value();

    /**
     * Sets the value of the '{@link tosca.EnvironmentVariable#getVariable_value <em>Variable value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable value</em>' containment reference.
     * @see #getVariable_value()
     * @generated
     */
    void setVariable_value(Value value);

} // EnvironmentVariable
