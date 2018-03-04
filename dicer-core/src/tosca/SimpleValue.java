/**
 */
package tosca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.SimpleValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getSimpleValue()
 * @model
 * @generated
 */
public interface SimpleValue extends Value {
    /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see tosca.ToscaPackage#getSimpleValue_Value()
	 * @model required="true"
	 * @generated
	 */
    String getValue();

    /**
	 * Sets the value of the '{@link tosca.SimpleValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
    void setValue(String value);

} // SimpleValue
