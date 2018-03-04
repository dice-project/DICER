/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Parameter#getParameter_name <em>Parameter name</em>}</li>
 *   <li>{@link tosca.Parameter#getParameter_value <em>Parameter value</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
    /**
	 * Returns the value of the '<em><b>Parameter name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter name</em>' attribute.
	 * @see #setParameter_name(String)
	 * @see tosca.ToscaPackage#getParameter_Parameter_name()
	 * @model id="true" required="true"
	 * @generated
	 */
    String getParameter_name();

    /**
	 * Sets the value of the '{@link tosca.Parameter#getParameter_name <em>Parameter name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter name</em>' attribute.
	 * @see #getParameter_name()
	 * @generated
	 */
    void setParameter_name(String value);

    /**
	 * Returns the value of the '<em><b>Parameter value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter value</em>' containment reference.
	 * @see #setParameter_value(Value)
	 * @see tosca.ToscaPackage#getParameter_Parameter_value()
	 * @model containment="true" required="true"
	 * @generated
	 */
    Value getParameter_value();

    /**
	 * Sets the value of the '{@link tosca.Parameter#getParameter_value <em>Parameter value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter value</em>' containment reference.
	 * @see #getParameter_value()
	 * @generated
	 */
    void setParameter_value(Value value);

} // Parameter
