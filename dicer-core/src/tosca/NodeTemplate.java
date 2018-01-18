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
 *   <li>{@link tosca.NodeTemplate#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getInstances <em>Instances</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getResources <em>Resources</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getArguments <em>Arguments</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getRules <em>Rules</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getPortMapping <em>Port Mapping</em>}</li>
 *   <li>{@link tosca.NodeTemplate#getEnvironment <em>Environment</em>}</li>
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
     * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Argument}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Arguments</em>' containment reference list.
     * @see tosca.ToscaPackage#getNodeTemplate_Arguments()
     * @model containment="true"
     * @generated
     */
    EList<Argument> getArguments();

    /**
     * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
     * The list contents are of type {@link tosca.FirewallRule}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rules</em>' containment reference list.
     * @see tosca.ToscaPackage#getNodeTemplate_Rules()
     * @model containment="true"
     * @generated
     */
    EList<FirewallRule> getRules();

    /**
     * Returns the value of the '<em><b>Monitoring</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Monitoring</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Monitoring</em>' containment reference.
     * @see #setMonitoring(MonitoringProperty)
     * @see tosca.ToscaPackage#getNodeTemplate_Monitoring()
     * @model containment="true"
     * @generated
     */
    MonitoringProperty getMonitoring();

    /**
     * Sets the value of the '{@link tosca.NodeTemplate#getMonitoring <em>Monitoring</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Monitoring</em>' containment reference.
     * @see #getMonitoring()
     * @generated
     */
    void setMonitoring(MonitoringProperty value);

    /**
     * Returns the value of the '<em><b>Port Mapping</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port Mapping</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port Mapping</em>' containment reference list.
     * @see tosca.ToscaPackage#getNodeTemplate_PortMapping()
     * @model containment="true"
     * @generated
     */
    EList<Property> getPortMapping();

    /**
     * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
     * The list contents are of type {@link tosca.EnvironmentVariable}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Environment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Environment</em>' containment reference list.
     * @see tosca.ToscaPackage#getNodeTemplate_Environment()
     * @model containment="true"
     * @generated
     */
    EList<EnvironmentVariable> getEnvironment();

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

    /**
     * Returns the value of the '<em><b>Instances</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instances</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instances</em>' containment reference.
     * @see #setInstances(Instances)
     * @see tosca.ToscaPackage#getNodeTemplate_Instances()
     * @model containment="true"
     * @generated
     */
    Instances getInstances();

    /**
     * Sets the value of the '{@link tosca.NodeTemplate#getInstances <em>Instances</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instances</em>' containment reference.
     * @see #getInstances()
     * @generated
     */
    void setInstances(Instances value);

    /**
     * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Configuration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configurations</em>' containment reference list.
     * @see tosca.ToscaPackage#getNodeTemplate_Configurations()
     * @model containment="true"
     * @generated
     */
    EList<Configuration> getConfigurations();

    /**
     * Returns the value of the '<em><b>Resources</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resources</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resources</em>' attribute list.
     * @see tosca.ToscaPackage#getNodeTemplate_Resources()
     * @model
     * @generated
     */
    EList<String> getResources();

} // NodeTemplate
