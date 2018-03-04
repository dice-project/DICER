/**
 */
package tosca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.GetAttribute#getNode <em>Node</em>}</li>
 *   <li>{@link tosca.GetAttribute#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getGetAttribute()
 * @model
 * @generated
 */
public interface GetAttribute extends Expression {
    /**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(String)
	 * @see tosca.ToscaPackage#getGetAttribute_Node()
	 * @model required="true"
	 * @generated
	 */
    String getNode();

    /**
	 * Sets the value of the '{@link tosca.GetAttribute#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
    void setNode(String value);

    /**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see tosca.ToscaPackage#getGetAttribute_Attribute()
	 * @model required="true"
	 * @generated
	 */
    String getAttribute();

    /**
	 * Sets the value of the '{@link tosca.GetAttribute#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
    void setAttribute(String value);

} // GetAttribute
