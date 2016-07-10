/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Relationship#getType <em>Type</em>}</li>
 *   <li>{@link tosca.Relationship#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link tosca.Relationship#getProperties <em>Properties</em>}</li>
 *   <li>{@link tosca.Relationship#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link tosca.Relationship#getSource_interfaces <em>Source interfaces</em>}</li>
 *   <li>{@link tosca.Relationship#getTarget_interfaces <em>Target interfaces</em>}</li>
 *   <li>{@link tosca.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link tosca.Relationship#getRelationship_name <em>Relationship name</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getRelationship()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='A Relationship Template specifies the occurrence of a manageable relationship between node templates as part of an application\u2019s topology model.  A Relationship template is an instance of a specified Relationship Type .\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}.\n'"
 * @generated
 */
public interface Relationship extends EObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see tosca.ToscaPackage#getRelationship_Type()
     * @model required="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link tosca.Relationship#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Interface}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interfaces</em>' containment reference list.
     * @see tosca.ToscaPackage#getRelationship_Interfaces()
     * @model containment="true"
     * @generated
     */
    EList<Interface> getInterfaces();

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see tosca.ToscaPackage#getRelationship_Properties()
     * @model containment="true"
     * @generated
     */
    EList<Property> getProperties();

    /**
     * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Attribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' containment reference list.
     * @see tosca.ToscaPackage#getRelationship_Attributes()
     * @model containment="true"
     * @generated
     */
    EList<Attribute> getAttributes();

    /**
     * Returns the value of the '<em><b>Source interfaces</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Interface}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source interfaces</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source interfaces</em>' containment reference list.
     * @see tosca.ToscaPackage#getRelationship_Source_interfaces()
     * @model containment="true"
     * @generated
     */
    EList<Interface> getSource_interfaces();

    /**
     * Returns the value of the '<em><b>Target interfaces</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Interface}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target interfaces</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target interfaces</em>' containment reference list.
     * @see tosca.ToscaPackage#getRelationship_Target_interfaces()
     * @model containment="true"
     * @generated
     */
    EList<Interface> getTarget_interfaces();

    /**
     * Returns the value of the '<em><b>Target</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' attribute.
     * @see #setTarget(String)
     * @see tosca.ToscaPackage#getRelationship_Target()
     * @model
     * @generated
     */
    String getTarget();

    /**
     * Sets the value of the '{@link tosca.Relationship#getTarget <em>Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' attribute.
     * @see #getTarget()
     * @generated
     */
    void setTarget(String value);

    /**
     * Returns the value of the '<em><b>Relationship name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relationship name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relationship name</em>' attribute.
     * @see #setRelationship_name(String)
     * @see tosca.ToscaPackage#getRelationship_Relationship_name()
     * @model
     * @generated
     */
    String getRelationship_name();

    /**
     * Sets the value of the '{@link tosca.Relationship#getRelationship_name <em>Relationship name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Relationship name</em>' attribute.
     * @see #getRelationship_name()
     * @generated
     */
    void setRelationship_name(String value);

} // Relationship
