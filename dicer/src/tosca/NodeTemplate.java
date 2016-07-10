/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.NodeTemplate#getNode_template_name <em>Node template name</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getType <em>Type</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getDescription <em>Description</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getProperties <em>Properties</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getNodeTemplate()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='A Node Template specifies the occurrence of a manageable software component as part of an application\u2019s topology model.  A Node template is an instance of a specified Node Type and can provide customized properties, constraints or operations which override the defaults provided by its Node Type and its implementations.\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}'"
 * @generated
 */
public interface NodeTemplate extends EObject {
    /**
     * Returns the value of the '<em><b>Node template name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node template name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node template name</em>' attribute.
     * @see #setNode_template_name(String)
     * @see tosca.ToscaPackage#getNodeTemplate_Node_template_name()
     * @model id="true" required="true"
     * @generated
     */
    String getNode_template_name();

    /**
     * Sets the value of the '{@link tosca.NodeTemplate#getNode_template_name <em>Node template name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Node template name</em>' attribute.
     * @see #getNode_template_name()
     * @generated
     */
    void setNode_template_name(String value);

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
     * @see tosca.ToscaPackage#getNodeTemplate_Type()
     * @model required="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link tosca.NodeTemplate#getType <em>Type</em>}' attribute.
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
     * @see tosca.ToscaPackage#getNodeTemplate_Interfaces()
     * @model containment="true"
     * @generated
     */
    EList<Interface> getInterfaces();

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see tosca.ToscaPackage#getNodeTemplate_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link tosca.NodeTemplate#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

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
     * @see tosca.ToscaPackage#getNodeTemplate_Properties()
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
     * @see tosca.ToscaPackage#getNodeTemplate_Attributes()
     * @model containment="true"
     * @generated
     */
    EList<Attribute> getAttributes();

    /**
     * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Requirement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Requirements</em>' containment reference list.
     * @see tosca.ToscaPackage#getNodeTemplate_Requirements()
     * @model containment="true"
     * @generated
     */
    EList<Requirement> getRequirements();

    /**
     * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Relationship}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relationships</em>' containment reference list.
     * @see tosca.ToscaPackage#getNodeTemplate_Relationships()
     * @model containment="true"
     * @generated
     */
    EList<Relationship> getRelationships();

    /**
     * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Capability}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capabilities</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capabilities</em>' containment reference list.
     * @see tosca.ToscaPackage#getNodeTemplate_Capabilities()
     * @model containment="true"
     * @generated
     */
    EList<Capability> getCapabilities();

} // NodeTemplate
