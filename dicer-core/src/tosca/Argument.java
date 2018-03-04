/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Argument#getArgument_name <em>Argument name</em>}</li>
 *   <li>{@link tosca.Argument#getArgument_value <em>Argument value</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends EObject {
    /**
	 * Returns the value of the '<em><b>Argument name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Argument name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument name</em>' attribute.
	 * @see #setArgument_name(String)
	 * @see tosca.ToscaPackage#getArgument_Argument_name()
	 * @model id="true" required="true" transient="true"
	 * @generated
	 */
    String getArgument_name();

    /**
	 * Sets the value of the '{@link tosca.Argument#getArgument_name <em>Argument name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument name</em>' attribute.
	 * @see #getArgument_name()
	 * @generated
	 */
    void setArgument_name(String value);

    /**
	 * Returns the value of the '<em><b>Argument value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Argument value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument value</em>' containment reference.
	 * @see #setArgument_value(Value)
	 * @see tosca.ToscaPackage#getArgument_Argument_value()
	 * @model containment="true" required="true"
	 * @generated
	 */
    Value getArgument_value();

    /**
	 * Sets the value of the '{@link tosca.Argument#getArgument_value <em>Argument value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument value</em>' containment reference.
	 * @see #getArgument_value()
	 * @generated
	 */
    void setArgument_value(Value value);

} // Argument
