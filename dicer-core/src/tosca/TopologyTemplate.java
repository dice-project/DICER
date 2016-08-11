/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topology Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.TopologyTemplate#getTosca_definitions_version <em>Tosca definitions version</em>}</li>
 *   <li>{@link tosca.TopologyTemplate#getImports <em>Imports</em>}</li>
 *   <li>{@link tosca.TopologyTemplate#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link tosca.TopologyTemplate#getInputs <em>Inputs</em>}</li>
 *   <li>{@link tosca.TopologyTemplate#getNodeTemplates <em>Node Templates</em>}</li>
 *   <li>{@link tosca.TopologyTemplate#getRealtionships <em>Realtionships</em>}</li>
 *   <li>{@link tosca.TopologyTemplate#getGroups <em>Groups</em>}</li>
 *   <li>{@link tosca.TopologyTemplate#getPolicies <em>Policies</em>}</li>
 *   <li>{@link tosca.TopologyTemplate#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getTopologyTemplate()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='A Topology Template defines the topology of a cloud application. The main ingredients of the topology template are node templates representing components of the application and relationship templates representing links between the components. \nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}\n'"
 * @generated
 */
public interface TopologyTemplate extends EObject {
    /**
     * Returns the value of the '<em><b>Tosca definitions version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tosca definitions version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tosca definitions version</em>' attribute.
     * @see #setTosca_definitions_version(String)
     * @see tosca.ToscaPackage#getTopologyTemplate_Tosca_definitions_version()
     * @model required="true"
     * @generated
     */
    String getTosca_definitions_version();

    /**
     * Sets the value of the '{@link tosca.TopologyTemplate#getTosca_definitions_version <em>Tosca definitions version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tosca definitions version</em>' attribute.
     * @see #getTosca_definitions_version()
     * @generated
     */
    void setTosca_definitions_version(String value);

    /**
     * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Import}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Imports</em>' containment reference list.
     * @see tosca.ToscaPackage#getTopologyTemplate_Imports()
     * @model containment="true"
     * @generated
     */
    EList<Import> getImports();

    /**
     * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Parameter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outputs</em>' containment reference list.
     * @see tosca.ToscaPackage#getTopologyTemplate_Outputs()
     * @model containment="true"
     * @generated
     */
    EList<Parameter> getOutputs();

    /**
     * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Parameter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inputs</em>' containment reference list.
     * @see tosca.ToscaPackage#getTopologyTemplate_Inputs()
     * @model containment="true"
     * @generated
     */
    EList<Parameter> getInputs();

    /**
     * Returns the value of the '<em><b>Node Templates</b></em>' containment reference list.
     * The list contents are of type {@link tosca.NodeTemplate}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node Templates</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node Templates</em>' containment reference list.
     * @see tosca.ToscaPackage#getTopologyTemplate_NodeTemplates()
     * @model containment="true"
     * @generated
     */
    EList<NodeTemplate> getNodeTemplates();

    /**
     * Returns the value of the '<em><b>Realtionships</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Relationship}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Realtionships</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Realtionships</em>' containment reference list.
     * @see tosca.ToscaPackage#getTopologyTemplate_Realtionships()
     * @model containment="true"
     * @generated
     */
    EList<Relationship> getRealtionships();

    /**
     * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Group}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Groups</em>' containment reference list.
     * @see tosca.ToscaPackage#getTopologyTemplate_Groups()
     * @model containment="true"
     * @generated
     */
    EList<Group> getGroups();

    /**
     * Returns the value of the '<em><b>Policies</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Policy}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Policies</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Policies</em>' containment reference list.
     * @see tosca.ToscaPackage#getTopologyTemplate_Policies()
     * @model containment="true"
     * @generated
     */
    EList<Policy> getPolicies();

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
     * @see tosca.ToscaPackage#getTopologyTemplate_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link tosca.TopologyTemplate#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

} // TopologyTemplate
