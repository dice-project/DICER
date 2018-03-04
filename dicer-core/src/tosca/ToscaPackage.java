/**
 */
package tosca;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tosca.ToscaFactory
 * @model kind="package"
 * @generated
 */
public interface ToscaPackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "tosca";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://tosca/1.0";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "tosca";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    ToscaPackage eINSTANCE = tosca.impl.ToscaPackageImpl.init();

    /**
	 * The meta object id for the '{@link tosca.impl.NodeTemplateImpl <em>Node Template</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.NodeTemplateImpl
	 * @see tosca.impl.ToscaPackageImpl#getNodeTemplate()
	 * @generated
	 */
    int NODE_TEMPLATE = 0;

    /**
	 * The feature id for the '<em><b>Node template name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__NODE_TEMPLATE_NAME = 0;

    /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__TYPE = 1;

    /**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__INTERFACES = 2;

    /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__DESCRIPTION = 3;

    /**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__PROPERTIES = 4;

    /**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__REQUIREMENTS = 5;

    /**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__RELATIONSHIPS = 6;

    /**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__CAPABILITIES = 7;

    /**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__INSTANCES = 8;

    /**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__CONFIGURATIONS = 9;

    /**
	 * The feature id for the '<em><b>Resources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__RESOURCES = 10;

    /**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__ARGUMENTS = 11;

    /**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__RULES = 12;

    /**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__MONITORING = 13;

    /**
	 * The feature id for the '<em><b>Port Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__PORT_MAPPING = 14;

    /**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE__ENVIRONMENT = 15;

    /**
	 * The number of structural features of the '<em>Node Template</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE_FEATURE_COUNT = 16;

    /**
	 * The number of operations of the '<em>Node Template</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_TEMPLATE_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link tosca.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.InterfaceImpl
	 * @see tosca.impl.ToscaPackageImpl#getInterface()
	 * @generated
	 */
    int INTERFACE = 1;

    /**
	 * The feature id for the '<em><b>Interface name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTERFACE__INTERFACE_NAME = 0;

    /**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTERFACE__OPERATIONS = 1;

    /**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTERFACE__INPUTS = 2;

    /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTERFACE__TYPE = 3;

    /**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTERFACE_FEATURE_COUNT = 4;

    /**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTERFACE_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link tosca.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.RelationshipImpl
	 * @see tosca.impl.ToscaPackageImpl#getRelationship()
	 * @generated
	 */
    int RELATIONSHIP = 2;

    /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP__TYPE = 0;

    /**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP__INTERFACES = 1;

    /**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP__PROPERTIES = 2;

    /**
	 * The feature id for the '<em><b>Source interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP__SOURCE_INTERFACES = 3;

    /**
	 * The feature id for the '<em><b>Target interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP__TARGET_INTERFACES = 4;

    /**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP__TARGET = 5;

    /**
	 * The feature id for the '<em><b>Relationship name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP__RELATIONSHIP_NAME = 6;

    /**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_FEATURE_COUNT = 7;

    /**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link tosca.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.PropertyImpl
	 * @see tosca.impl.ToscaPackageImpl#getProperty()
	 * @generated
	 */
    int PROPERTY = 3;

    /**
	 * The feature id for the '<em><b>Property name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROPERTY__PROPERTY_NAME = 0;

    /**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROPERTY__VALUE = 1;

    /**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROPERTY_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROPERTY_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link tosca.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.RequirementImpl
	 * @see tosca.impl.ToscaPackageImpl#getRequirement()
	 * @generated
	 */
    int REQUIREMENT = 4;

    /**
	 * The feature id for the '<em><b>Requirement name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REQUIREMENT__REQUIREMENT_NAME = 0;

    /**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REQUIREMENT__NODE = 1;

    /**
	 * The feature id for the '<em><b>Capabiity</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REQUIREMENT__CAPABIITY = 2;

    /**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REQUIREMENT_FEATURE_COUNT = 3;

    /**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REQUIREMENT_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link tosca.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.OperationImpl
	 * @see tosca.impl.ToscaPackageImpl#getOperation()
	 * @generated
	 */
    int OPERATION = 5;

    /**
	 * The feature id for the '<em><b>Operation name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OPERATION__OPERATION_NAME = 0;

    /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OPERATION__DESCRIPTION = 1;

    /**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OPERATION__INPUTS = 2;

    /**
	 * The feature id for the '<em><b>Dependent Artifacts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OPERATION__DEPENDENT_ARTIFACTS = 3;

    /**
	 * The feature id for the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OPERATION__PRIMARY = 4;

    /**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OPERATION_FEATURE_COUNT = 5;

    /**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OPERATION_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link tosca.impl.TopologyTemplateImpl <em>Topology Template</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.TopologyTemplateImpl
	 * @see tosca.impl.ToscaPackageImpl#getTopologyTemplate()
	 * @generated
	 */
    int TOPOLOGY_TEMPLATE = 6;

    /**
	 * The feature id for the '<em><b>Tosca definitions version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TOPOLOGY_TEMPLATE__TOSCA_DEFINITIONS_VERSION = 0;

    /**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TOPOLOGY_TEMPLATE__IMPORTS = 1;

    /**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TOPOLOGY_TEMPLATE__OUTPUTS = 2;

    /**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TOPOLOGY_TEMPLATE__INPUTS = 3;

    /**
	 * The feature id for the '<em><b>Node Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TOPOLOGY_TEMPLATE__NODE_TEMPLATES = 4;

    /**
	 * The feature id for the '<em><b>Realtionships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TOPOLOGY_TEMPLATE__REALTIONSHIPS = 5;

    /**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TOPOLOGY_TEMPLATE__GROUPS = 6;

    /**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TOPOLOGY_TEMPLATE__POLICIES = 7;

    /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TOPOLOGY_TEMPLATE__DESCRIPTION = 8;

    /**
	 * The number of structural features of the '<em>Topology Template</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TOPOLOGY_TEMPLATE_FEATURE_COUNT = 9;

    /**
	 * The number of operations of the '<em>Topology Template</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TOPOLOGY_TEMPLATE_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link tosca.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.ImportImpl
	 * @see tosca.impl.ToscaPackageImpl#getImport()
	 * @generated
	 */
    int IMPORT = 7;

    /**
	 * The feature id for the '<em><b>Import name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IMPORT__IMPORT_NAME = 0;

    /**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IMPORT__FILE = 1;

    /**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IMPORT__REPOSITORY = 2;

    /**
	 * The feature id for the '<em><b>Namespace uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IMPORT__NAMESPACE_URI = 3;

    /**
	 * The feature id for the '<em><b>Namespace prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IMPORT__NAMESPACE_PREFIX = 4;

    /**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IMPORT_FEATURE_COUNT = 5;

    /**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IMPORT_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link tosca.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.GroupImpl
	 * @see tosca.impl.ToscaPackageImpl#getGroup()
	 * @generated
	 */
    int GROUP = 8;

    /**
	 * The feature id for the '<em><b>Group name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GROUP__GROUP_NAME = 0;

    /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GROUP__TYPE = 1;

    /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GROUP__DESCRIPTION = 2;

    /**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GROUP__PROPERTIES = 3;

    /**
	 * The feature id for the '<em><b>Targets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GROUP__TARGETS = 4;

    /**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GROUP__INTERFACES = 5;

    /**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GROUP_FEATURE_COUNT = 6;

    /**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GROUP_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link tosca.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.PolicyImpl
	 * @see tosca.impl.ToscaPackageImpl#getPolicy()
	 * @generated
	 */
    int POLICY = 9;

    /**
	 * The feature id for the '<em><b>Policy name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POLICY__POLICY_NAME = 0;

    /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POLICY__TYPE = 1;

    /**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POLICY_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int POLICY_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link tosca.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.CapabilityImpl
	 * @see tosca.impl.ToscaPackageImpl#getCapability()
	 * @generated
	 */
    int CAPABILITY = 10;

    /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CAPABILITY__TYPE = 0;

    /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CAPABILITY__DESCRIPTION = 1;

    /**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CAPABILITY__PROPERTIES = 2;

    /**
	 * The feature id for the '<em><b>Capability name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CAPABILITY__CAPABILITY_NAME = 3;

    /**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CAPABILITY_FEATURE_COUNT = 4;

    /**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CAPABILITY_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link tosca.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.ParameterImpl
	 * @see tosca.impl.ToscaPackageImpl#getParameter()
	 * @generated
	 */
    int PARAMETER = 11;

    /**
	 * The feature id for the '<em><b>Parameter name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER__PARAMETER_NAME = 0;

    /**
	 * The feature id for the '<em><b>Parameter value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER__PARAMETER_VALUE = 1;

    /**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link tosca.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.ArtifactImpl
	 * @see tosca.impl.ToscaPackageImpl#getArtifact()
	 * @generated
	 */
    int ARTIFACT = 12;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ARTIFACT__NAME = 0;

    /**
	 * The feature id for the '<em><b>Artifact Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ARTIFACT__ARTIFACT_URI = 1;

    /**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ARTIFACT_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ARTIFACT_OPERATION_COUNT = 0;


    /**
	 * The meta object id for the '{@link tosca.impl.InstancesImpl <em>Instances</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.InstancesImpl
	 * @see tosca.impl.ToscaPackageImpl#getInstances()
	 * @generated
	 */
    int INSTANCES = 13;

    /**
	 * The feature id for the '<em><b>Deploy</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INSTANCES__DEPLOY = 0;

    /**
	 * The number of structural features of the '<em>Instances</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INSTANCES_FEATURE_COUNT = 1;

    /**
	 * The number of operations of the '<em>Instances</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INSTANCES_OPERATION_COUNT = 0;


    /**
	 * The meta object id for the '{@link tosca.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.ConfigurationImpl
	 * @see tosca.impl.ToscaPackageImpl#getConfiguration()
	 * @generated
	 */
    int CONFIGURATION = 14;

    /**
	 * The feature id for the '<em><b>Property name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONFIGURATION__PROPERTY_NAME = 0;

    /**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONFIGURATION__VALUE = 1;

    /**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONFIGURATION_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONFIGURATION_OPERATION_COUNT = 0;


    /**
	 * The meta object id for the '{@link tosca.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.ArgumentImpl
	 * @see tosca.impl.ToscaPackageImpl#getArgument()
	 * @generated
	 */
    int ARGUMENT = 15;

    /**
	 * The feature id for the '<em><b>Argument name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ARGUMENT__ARGUMENT_NAME = 0;

    /**
	 * The feature id for the '<em><b>Argument value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ARGUMENT__ARGUMENT_VALUE = 1;

    /**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ARGUMENT_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ARGUMENT_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link tosca.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.ValueImpl
	 * @see tosca.impl.ToscaPackageImpl#getValue()
	 * @generated
	 */
    int VALUE = 17;

    /**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VALUE_FEATURE_COUNT = 0;

    /**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VALUE_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link tosca.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.ExpressionImpl
	 * @see tosca.impl.ToscaPackageImpl#getExpression()
	 * @generated
	 */
    int EXPRESSION = 16;

    /**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXPRESSION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXPRESSION_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link tosca.impl.SimpleValueImpl <em>Simple Value</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.SimpleValueImpl
	 * @see tosca.impl.ToscaPackageImpl#getSimpleValue()
	 * @generated
	 */
    int SIMPLE_VALUE = 18;

    /**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SIMPLE_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Simple Value</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SIMPLE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

    /**
	 * The number of operations of the '<em>Simple Value</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SIMPLE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link tosca.impl.GetAttributeImpl <em>Get Attribute</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.GetAttributeImpl
	 * @see tosca.impl.ToscaPackageImpl#getGetAttribute()
	 * @generated
	 */
    int GET_ATTRIBUTE = 19;

    /**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GET_ATTRIBUTE__NODE = EXPRESSION_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GET_ATTRIBUTE__ATTRIBUTE = EXPRESSION_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Get Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GET_ATTRIBUTE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

    /**
	 * The number of operations of the '<em>Get Attribute</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GET_ATTRIBUTE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;


    /**
	 * The meta object id for the '{@link tosca.impl.FirewallRuleImpl <em>Firewall Rule</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.FirewallRuleImpl
	 * @see tosca.impl.ToscaPackageImpl#getFirewallRule()
	 * @generated
	 */
    int FIREWALL_RULE = 20;

    /**
	 * The feature id for the '<em><b>Remote ip prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FIREWALL_RULE__REMOTE_IP_PREFIX = 0;

    /**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FIREWALL_RULE__PORT = 1;

    /**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FIREWALL_RULE__PROTOCOL = 2;

    /**
	 * The number of structural features of the '<em>Firewall Rule</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FIREWALL_RULE_FEATURE_COUNT = 3;

    /**
	 * The number of operations of the '<em>Firewall Rule</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FIREWALL_RULE_OPERATION_COUNT = 0;


    /**
	 * The meta object id for the '{@link tosca.impl.MonitoringPropertyImpl <em>Monitoring Property</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.MonitoringPropertyImpl
	 * @see tosca.impl.ToscaPackageImpl#getMonitoringProperty()
	 * @generated
	 */
    int MONITORING_PROPERTY = 21;

    /**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MONITORING_PROPERTY__ENABLED = 0;

    /**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MONITORING_PROPERTY__ROLES = 1;

    /**
	 * The number of structural features of the '<em>Monitoring Property</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MONITORING_PROPERTY_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>Monitoring Property</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MONITORING_PROPERTY_OPERATION_COUNT = 0;


    /**
	 * The meta object id for the '{@link tosca.impl.EnvironmentVariableImpl <em>Environment Variable</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see tosca.impl.EnvironmentVariableImpl
	 * @see tosca.impl.ToscaPackageImpl#getEnvironmentVariable()
	 * @generated
	 */
    int ENVIRONMENT_VARIABLE = 22;

    /**
	 * The feature id for the '<em><b>Variable name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENVIRONMENT_VARIABLE__VARIABLE_NAME = 0;

    /**
	 * The feature id for the '<em><b>Variable value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENVIRONMENT_VARIABLE__VARIABLE_VALUE = 1;

    /**
	 * The number of structural features of the '<em>Environment Variable</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENVIRONMENT_VARIABLE_FEATURE_COUNT = 2;

    /**
	 * The number of operations of the '<em>Environment Variable</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENVIRONMENT_VARIABLE_OPERATION_COUNT = 0;


    /**
	 * The meta object id for the '{@link tosca.impl.ConcatImpl <em>Concat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tosca.impl.ConcatImpl
	 * @see tosca.impl.ToscaPackageImpl#getConcat()
	 * @generated
	 */
	int CONCAT = 23;

				/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__ITEMS = VALUE_FEATURE_COUNT + 0;

				/**
	 * The number of structural features of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

				/**
	 * The number of operations of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;


				/**
	 * Returns the meta object for class '{@link tosca.NodeTemplate <em>Node Template</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Template</em>'.
	 * @see tosca.NodeTemplate
	 * @generated
	 */
    EClass getNodeTemplate();

    /**
	 * Returns the meta object for the attribute '{@link tosca.NodeTemplate#getNode_template_name <em>Node template name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node template name</em>'.
	 * @see tosca.NodeTemplate#getNode_template_name()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EAttribute getNodeTemplate_Node_template_name();

    /**
	 * Returns the meta object for the attribute '{@link tosca.NodeTemplate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tosca.NodeTemplate#getType()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EAttribute getNodeTemplate_Type();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.NodeTemplate#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see tosca.NodeTemplate#getInterfaces()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EReference getNodeTemplate_Interfaces();

    /**
	 * Returns the meta object for the attribute '{@link tosca.NodeTemplate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tosca.NodeTemplate#getDescription()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EAttribute getNodeTemplate_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.NodeTemplate#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see tosca.NodeTemplate#getProperties()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EReference getNodeTemplate_Properties();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.NodeTemplate#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see tosca.NodeTemplate#getArguments()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EReference getNodeTemplate_Arguments();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.NodeTemplate#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see tosca.NodeTemplate#getRules()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EReference getNodeTemplate_Rules();

    /**
	 * Returns the meta object for the containment reference '{@link tosca.NodeTemplate#getMonitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitoring</em>'.
	 * @see tosca.NodeTemplate#getMonitoring()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EReference getNodeTemplate_Monitoring();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.NodeTemplate#getPortMapping <em>Port Mapping</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Mapping</em>'.
	 * @see tosca.NodeTemplate#getPortMapping()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EReference getNodeTemplate_PortMapping();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.NodeTemplate#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment</em>'.
	 * @see tosca.NodeTemplate#getEnvironment()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EReference getNodeTemplate_Environment();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.NodeTemplate#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see tosca.NodeTemplate#getRequirements()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EReference getNodeTemplate_Requirements();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.NodeTemplate#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see tosca.NodeTemplate#getRelationships()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EReference getNodeTemplate_Relationships();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.NodeTemplate#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see tosca.NodeTemplate#getCapabilities()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EReference getNodeTemplate_Capabilities();

    /**
	 * Returns the meta object for the containment reference '{@link tosca.NodeTemplate#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instances</em>'.
	 * @see tosca.NodeTemplate#getInstances()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EReference getNodeTemplate_Instances();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.NodeTemplate#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see tosca.NodeTemplate#getConfigurations()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EReference getNodeTemplate_Configurations();

    /**
	 * Returns the meta object for the attribute list '{@link tosca.NodeTemplate#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resources</em>'.
	 * @see tosca.NodeTemplate#getResources()
	 * @see #getNodeTemplate()
	 * @generated
	 */
    EAttribute getNodeTemplate_Resources();

    /**
	 * Returns the meta object for class '{@link tosca.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see tosca.Interface
	 * @generated
	 */
    EClass getInterface();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Interface#getInterface_name <em>Interface name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface name</em>'.
	 * @see tosca.Interface#getInterface_name()
	 * @see #getInterface()
	 * @generated
	 */
    EAttribute getInterface_Interface_name();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.Interface#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see tosca.Interface#getOperations()
	 * @see #getInterface()
	 * @generated
	 */
    EReference getInterface_Operations();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.Interface#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see tosca.Interface#getInputs()
	 * @see #getInterface()
	 * @generated
	 */
    EReference getInterface_Inputs();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Interface#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tosca.Interface#getType()
	 * @see #getInterface()
	 * @generated
	 */
    EAttribute getInterface_Type();

    /**
	 * Returns the meta object for class '{@link tosca.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see tosca.Relationship
	 * @generated
	 */
    EClass getRelationship();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Relationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tosca.Relationship#getType()
	 * @see #getRelationship()
	 * @generated
	 */
    EAttribute getRelationship_Type();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.Relationship#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see tosca.Relationship#getInterfaces()
	 * @see #getRelationship()
	 * @generated
	 */
    EReference getRelationship_Interfaces();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.Relationship#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see tosca.Relationship#getProperties()
	 * @see #getRelationship()
	 * @generated
	 */
    EReference getRelationship_Properties();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.Relationship#getSource_interfaces <em>Source interfaces</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source interfaces</em>'.
	 * @see tosca.Relationship#getSource_interfaces()
	 * @see #getRelationship()
	 * @generated
	 */
    EReference getRelationship_Source_interfaces();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.Relationship#getTarget_interfaces <em>Target interfaces</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target interfaces</em>'.
	 * @see tosca.Relationship#getTarget_interfaces()
	 * @see #getRelationship()
	 * @generated
	 */
    EReference getRelationship_Target_interfaces();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see tosca.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
    EAttribute getRelationship_Target();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Relationship#getRelationship_name <em>Relationship name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship name</em>'.
	 * @see tosca.Relationship#getRelationship_name()
	 * @see #getRelationship()
	 * @generated
	 */
    EAttribute getRelationship_Relationship_name();

    /**
	 * Returns the meta object for class '{@link tosca.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see tosca.Property
	 * @generated
	 */
    EClass getProperty();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Property#getProperty_name <em>Property name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property name</em>'.
	 * @see tosca.Property#getProperty_name()
	 * @see #getProperty()
	 * @generated
	 */
    EAttribute getProperty_Property_name();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tosca.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
    EAttribute getProperty_Value();

    /**
	 * Returns the meta object for class '{@link tosca.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see tosca.Requirement
	 * @generated
	 */
    EClass getRequirement();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Requirement#getRequirement_name <em>Requirement name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement name</em>'.
	 * @see tosca.Requirement#getRequirement_name()
	 * @see #getRequirement()
	 * @generated
	 */
    EAttribute getRequirement_Requirement_name();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Requirement#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see tosca.Requirement#getNode()
	 * @see #getRequirement()
	 * @generated
	 */
    EAttribute getRequirement_Node();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Requirement#getCapabiity <em>Capabiity</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capabiity</em>'.
	 * @see tosca.Requirement#getCapabiity()
	 * @see #getRequirement()
	 * @generated
	 */
    EAttribute getRequirement_Capabiity();

    /**
	 * Returns the meta object for class '{@link tosca.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see tosca.Operation
	 * @generated
	 */
    EClass getOperation();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Operation#getOperation_name <em>Operation name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation name</em>'.
	 * @see tosca.Operation#getOperation_name()
	 * @see #getOperation()
	 * @generated
	 */
    EAttribute getOperation_Operation_name();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Operation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tosca.Operation#getDescription()
	 * @see #getOperation()
	 * @generated
	 */
    EAttribute getOperation_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.Operation#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see tosca.Operation#getInputs()
	 * @see #getOperation()
	 * @generated
	 */
    EReference getOperation_Inputs();

    /**
	 * Returns the meta object for the attribute list '{@link tosca.Operation#getDependentArtifacts <em>Dependent Artifacts</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dependent Artifacts</em>'.
	 * @see tosca.Operation#getDependentArtifacts()
	 * @see #getOperation()
	 * @generated
	 */
    EAttribute getOperation_DependentArtifacts();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Operation#getPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary</em>'.
	 * @see tosca.Operation#getPrimary()
	 * @see #getOperation()
	 * @generated
	 */
    EAttribute getOperation_Primary();

    /**
	 * Returns the meta object for class '{@link tosca.TopologyTemplate <em>Topology Template</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Template</em>'.
	 * @see tosca.TopologyTemplate
	 * @generated
	 */
    EClass getTopologyTemplate();

    /**
	 * Returns the meta object for the attribute '{@link tosca.TopologyTemplate#getTosca_definitions_version <em>Tosca definitions version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tosca definitions version</em>'.
	 * @see tosca.TopologyTemplate#getTosca_definitions_version()
	 * @see #getTopologyTemplate()
	 * @generated
	 */
    EAttribute getTopologyTemplate_Tosca_definitions_version();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.TopologyTemplate#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see tosca.TopologyTemplate#getImports()
	 * @see #getTopologyTemplate()
	 * @generated
	 */
    EReference getTopologyTemplate_Imports();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.TopologyTemplate#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see tosca.TopologyTemplate#getOutputs()
	 * @see #getTopologyTemplate()
	 * @generated
	 */
    EReference getTopologyTemplate_Outputs();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.TopologyTemplate#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see tosca.TopologyTemplate#getInputs()
	 * @see #getTopologyTemplate()
	 * @generated
	 */
    EReference getTopologyTemplate_Inputs();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.TopologyTemplate#getNodeTemplates <em>Node Templates</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Templates</em>'.
	 * @see tosca.TopologyTemplate#getNodeTemplates()
	 * @see #getTopologyTemplate()
	 * @generated
	 */
    EReference getTopologyTemplate_NodeTemplates();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.TopologyTemplate#getRealtionships <em>Realtionships</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realtionships</em>'.
	 * @see tosca.TopologyTemplate#getRealtionships()
	 * @see #getTopologyTemplate()
	 * @generated
	 */
    EReference getTopologyTemplate_Realtionships();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.TopologyTemplate#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see tosca.TopologyTemplate#getGroups()
	 * @see #getTopologyTemplate()
	 * @generated
	 */
    EReference getTopologyTemplate_Groups();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.TopologyTemplate#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policies</em>'.
	 * @see tosca.TopologyTemplate#getPolicies()
	 * @see #getTopologyTemplate()
	 * @generated
	 */
    EReference getTopologyTemplate_Policies();

    /**
	 * Returns the meta object for the attribute '{@link tosca.TopologyTemplate#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tosca.TopologyTemplate#getDescription()
	 * @see #getTopologyTemplate()
	 * @generated
	 */
    EAttribute getTopologyTemplate_Description();

    /**
	 * Returns the meta object for class '{@link tosca.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see tosca.Import
	 * @generated
	 */
    EClass getImport();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Import#getImport_name <em>Import name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import name</em>'.
	 * @see tosca.Import#getImport_name()
	 * @see #getImport()
	 * @generated
	 */
    EAttribute getImport_Import_name();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Import#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see tosca.Import#getFile()
	 * @see #getImport()
	 * @generated
	 */
    EAttribute getImport_File();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Import#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository</em>'.
	 * @see tosca.Import#getRepository()
	 * @see #getImport()
	 * @generated
	 */
    EAttribute getImport_Repository();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Import#getNamespace_uri <em>Namespace uri</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace uri</em>'.
	 * @see tosca.Import#getNamespace_uri()
	 * @see #getImport()
	 * @generated
	 */
    EAttribute getImport_Namespace_uri();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Import#getNamespace_prefix <em>Namespace prefix</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace prefix</em>'.
	 * @see tosca.Import#getNamespace_prefix()
	 * @see #getImport()
	 * @generated
	 */
    EAttribute getImport_Namespace_prefix();

    /**
	 * Returns the meta object for class '{@link tosca.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see tosca.Group
	 * @generated
	 */
    EClass getGroup();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Group#getGroup_name <em>Group name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group name</em>'.
	 * @see tosca.Group#getGroup_name()
	 * @see #getGroup()
	 * @generated
	 */
    EAttribute getGroup_Group_name();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Group#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tosca.Group#getType()
	 * @see #getGroup()
	 * @generated
	 */
    EAttribute getGroup_Type();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Group#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tosca.Group#getDescription()
	 * @see #getGroup()
	 * @generated
	 */
    EAttribute getGroup_Description();

    /**
	 * Returns the meta object for the containment reference '{@link tosca.Group#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see tosca.Group#getProperties()
	 * @see #getGroup()
	 * @generated
	 */
    EReference getGroup_Properties();

    /**
	 * Returns the meta object for the attribute list '{@link tosca.Group#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Targets</em>'.
	 * @see tosca.Group#getTargets()
	 * @see #getGroup()
	 * @generated
	 */
    EAttribute getGroup_Targets();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.Group#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see tosca.Group#getInterfaces()
	 * @see #getGroup()
	 * @generated
	 */
    EReference getGroup_Interfaces();

    /**
	 * Returns the meta object for class '{@link tosca.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see tosca.Policy
	 * @generated
	 */
    EClass getPolicy();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Policy#getPolicy_name <em>Policy name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy name</em>'.
	 * @see tosca.Policy#getPolicy_name()
	 * @see #getPolicy()
	 * @generated
	 */
    EAttribute getPolicy_Policy_name();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Policy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tosca.Policy#getType()
	 * @see #getPolicy()
	 * @generated
	 */
    EAttribute getPolicy_Type();

    /**
	 * Returns the meta object for class '{@link tosca.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see tosca.Capability
	 * @generated
	 */
    EClass getCapability();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Capability#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tosca.Capability#getType()
	 * @see #getCapability()
	 * @generated
	 */
    EAttribute getCapability_Type();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Capability#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tosca.Capability#getDescription()
	 * @see #getCapability()
	 * @generated
	 */
    EAttribute getCapability_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link tosca.Capability#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see tosca.Capability#getProperties()
	 * @see #getCapability()
	 * @generated
	 */
    EReference getCapability_Properties();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Capability#getCapability_name <em>Capability name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability name</em>'.
	 * @see tosca.Capability#getCapability_name()
	 * @see #getCapability()
	 * @generated
	 */
    EAttribute getCapability_Capability_name();

    /**
	 * Returns the meta object for class '{@link tosca.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see tosca.Parameter
	 * @generated
	 */
    EClass getParameter();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Parameter#getParameter_name <em>Parameter name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter name</em>'.
	 * @see tosca.Parameter#getParameter_name()
	 * @see #getParameter()
	 * @generated
	 */
    EAttribute getParameter_Parameter_name();

    /**
	 * Returns the meta object for the containment reference '{@link tosca.Parameter#getParameter_value <em>Parameter value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter value</em>'.
	 * @see tosca.Parameter#getParameter_value()
	 * @see #getParameter()
	 * @generated
	 */
    EReference getParameter_Parameter_value();

    /**
	 * Returns the meta object for class '{@link tosca.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see tosca.Artifact
	 * @generated
	 */
    EClass getArtifact();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tosca.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
    EAttribute getArtifact_Name();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Artifact#getArtifactUri <em>Artifact Uri</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Uri</em>'.
	 * @see tosca.Artifact#getArtifactUri()
	 * @see #getArtifact()
	 * @generated
	 */
    EAttribute getArtifact_ArtifactUri();

    /**
	 * Returns the meta object for class '{@link tosca.Instances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instances</em>'.
	 * @see tosca.Instances
	 * @generated
	 */
    EClass getInstances();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Instances#getDeploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deploy</em>'.
	 * @see tosca.Instances#getDeploy()
	 * @see #getInstances()
	 * @generated
	 */
    EAttribute getInstances_Deploy();

    /**
	 * Returns the meta object for class '{@link tosca.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see tosca.Configuration
	 * @generated
	 */
    EClass getConfiguration();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Configuration#getProperty_name <em>Property name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property name</em>'.
	 * @see tosca.Configuration#getProperty_name()
	 * @see #getConfiguration()
	 * @generated
	 */
    EAttribute getConfiguration_Property_name();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Configuration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tosca.Configuration#getValue()
	 * @see #getConfiguration()
	 * @generated
	 */
    EAttribute getConfiguration_Value();

    /**
	 * Returns the meta object for class '{@link tosca.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see tosca.Argument
	 * @generated
	 */
    EClass getArgument();

    /**
	 * Returns the meta object for the attribute '{@link tosca.Argument#getArgument_name <em>Argument name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument name</em>'.
	 * @see tosca.Argument#getArgument_name()
	 * @see #getArgument()
	 * @generated
	 */
    EAttribute getArgument_Argument_name();

    /**
	 * Returns the meta object for the containment reference '{@link tosca.Argument#getArgument_value <em>Argument value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument value</em>'.
	 * @see tosca.Argument#getArgument_value()
	 * @see #getArgument()
	 * @generated
	 */
    EReference getArgument_Argument_value();

    /**
	 * Returns the meta object for class '{@link tosca.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see tosca.Expression
	 * @generated
	 */
    EClass getExpression();

    /**
	 * Returns the meta object for class '{@link tosca.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see tosca.Value
	 * @generated
	 */
    EClass getValue();

    /**
	 * Returns the meta object for class '{@link tosca.SimpleValue <em>Simple Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Value</em>'.
	 * @see tosca.SimpleValue
	 * @generated
	 */
    EClass getSimpleValue();

    /**
	 * Returns the meta object for the attribute '{@link tosca.SimpleValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tosca.SimpleValue#getValue()
	 * @see #getSimpleValue()
	 * @generated
	 */
    EAttribute getSimpleValue_Value();

    /**
	 * Returns the meta object for class '{@link tosca.GetAttribute <em>Get Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Attribute</em>'.
	 * @see tosca.GetAttribute
	 * @generated
	 */
    EClass getGetAttribute();

    /**
	 * Returns the meta object for the attribute '{@link tosca.GetAttribute#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see tosca.GetAttribute#getNode()
	 * @see #getGetAttribute()
	 * @generated
	 */
    EAttribute getGetAttribute_Node();

    /**
	 * Returns the meta object for the attribute '{@link tosca.GetAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see tosca.GetAttribute#getAttribute()
	 * @see #getGetAttribute()
	 * @generated
	 */
    EAttribute getGetAttribute_Attribute();

    /**
	 * Returns the meta object for class '{@link tosca.FirewallRule <em>Firewall Rule</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firewall Rule</em>'.
	 * @see tosca.FirewallRule
	 * @generated
	 */
    EClass getFirewallRule();

    /**
	 * Returns the meta object for the attribute '{@link tosca.FirewallRule#getRemote_ip_prefix <em>Remote ip prefix</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote ip prefix</em>'.
	 * @see tosca.FirewallRule#getRemote_ip_prefix()
	 * @see #getFirewallRule()
	 * @generated
	 */
    EAttribute getFirewallRule_Remote_ip_prefix();

    /**
	 * Returns the meta object for the attribute '{@link tosca.FirewallRule#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see tosca.FirewallRule#getPort()
	 * @see #getFirewallRule()
	 * @generated
	 */
    EAttribute getFirewallRule_Port();

    /**
	 * Returns the meta object for the attribute '{@link tosca.FirewallRule#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see tosca.FirewallRule#getProtocol()
	 * @see #getFirewallRule()
	 * @generated
	 */
    EAttribute getFirewallRule_Protocol();

    /**
	 * Returns the meta object for class '{@link tosca.MonitoringProperty <em>Monitoring Property</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring Property</em>'.
	 * @see tosca.MonitoringProperty
	 * @generated
	 */
    EClass getMonitoringProperty();

    /**
	 * Returns the meta object for the attribute '{@link tosca.MonitoringProperty#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see tosca.MonitoringProperty#isEnabled()
	 * @see #getMonitoringProperty()
	 * @generated
	 */
    EAttribute getMonitoringProperty_Enabled();

    /**
	 * Returns the meta object for the attribute list '{@link tosca.MonitoringProperty#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roles</em>'.
	 * @see tosca.MonitoringProperty#getRoles()
	 * @see #getMonitoringProperty()
	 * @generated
	 */
    EAttribute getMonitoringProperty_Roles();

    /**
	 * Returns the meta object for class '{@link tosca.EnvironmentVariable <em>Environment Variable</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Variable</em>'.
	 * @see tosca.EnvironmentVariable
	 * @generated
	 */
    EClass getEnvironmentVariable();

    /**
	 * Returns the meta object for the attribute '{@link tosca.EnvironmentVariable#getVariable_name <em>Variable name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable name</em>'.
	 * @see tosca.EnvironmentVariable#getVariable_name()
	 * @see #getEnvironmentVariable()
	 * @generated
	 */
    EAttribute getEnvironmentVariable_Variable_name();

    /**
	 * Returns the meta object for the containment reference '{@link tosca.EnvironmentVariable#getVariable_value <em>Variable value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable value</em>'.
	 * @see tosca.EnvironmentVariable#getVariable_value()
	 * @see #getEnvironmentVariable()
	 * @generated
	 */
    EReference getEnvironmentVariable_Variable_value();

    /**
	 * Returns the meta object for class '{@link tosca.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concat</em>'.
	 * @see tosca.Concat
	 * @generated
	 */
	EClass getConcat();

				/**
	 * Returns the meta object for the containment reference list '{@link tosca.Concat#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see tosca.Concat#getItems()
	 * @see #getConcat()
	 * @generated
	 */
	EReference getConcat_Items();

				/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    ToscaFactory getToscaFactory();

    /**
	 * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
	 * @generated
	 */
    interface Literals {
        /**
		 * The meta object literal for the '{@link tosca.impl.NodeTemplateImpl <em>Node Template</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.NodeTemplateImpl
		 * @see tosca.impl.ToscaPackageImpl#getNodeTemplate()
		 * @generated
		 */
        EClass NODE_TEMPLATE = eINSTANCE.getNodeTemplate();

        /**
		 * The meta object literal for the '<em><b>Node template name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NODE_TEMPLATE__NODE_TEMPLATE_NAME = eINSTANCE.getNodeTemplate_Node_template_name();

        /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NODE_TEMPLATE__TYPE = eINSTANCE.getNodeTemplate_Type();

        /**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE_TEMPLATE__INTERFACES = eINSTANCE.getNodeTemplate_Interfaces();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NODE_TEMPLATE__DESCRIPTION = eINSTANCE.getNodeTemplate_Description();

        /**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE_TEMPLATE__PROPERTIES = eINSTANCE.getNodeTemplate_Properties();

        /**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE_TEMPLATE__ARGUMENTS = eINSTANCE.getNodeTemplate_Arguments();

        /**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE_TEMPLATE__RULES = eINSTANCE.getNodeTemplate_Rules();

        /**
		 * The meta object literal for the '<em><b>Monitoring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE_TEMPLATE__MONITORING = eINSTANCE.getNodeTemplate_Monitoring();

        /**
		 * The meta object literal for the '<em><b>Port Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE_TEMPLATE__PORT_MAPPING = eINSTANCE.getNodeTemplate_PortMapping();

        /**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE_TEMPLATE__ENVIRONMENT = eINSTANCE.getNodeTemplate_Environment();

        /**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE_TEMPLATE__REQUIREMENTS = eINSTANCE.getNodeTemplate_Requirements();

        /**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE_TEMPLATE__RELATIONSHIPS = eINSTANCE.getNodeTemplate_Relationships();

        /**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE_TEMPLATE__CAPABILITIES = eINSTANCE.getNodeTemplate_Capabilities();

        /**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE_TEMPLATE__INSTANCES = eINSTANCE.getNodeTemplate_Instances();

        /**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference NODE_TEMPLATE__CONFIGURATIONS = eINSTANCE.getNodeTemplate_Configurations();

        /**
		 * The meta object literal for the '<em><b>Resources</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NODE_TEMPLATE__RESOURCES = eINSTANCE.getNodeTemplate_Resources();

        /**
		 * The meta object literal for the '{@link tosca.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.InterfaceImpl
		 * @see tosca.impl.ToscaPackageImpl#getInterface()
		 * @generated
		 */
        EClass INTERFACE = eINSTANCE.getInterface();

        /**
		 * The meta object literal for the '<em><b>Interface name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute INTERFACE__INTERFACE_NAME = eINSTANCE.getInterface_Interface_name();

        /**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference INTERFACE__OPERATIONS = eINSTANCE.getInterface_Operations();

        /**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference INTERFACE__INPUTS = eINSTANCE.getInterface_Inputs();

        /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute INTERFACE__TYPE = eINSTANCE.getInterface_Type();

        /**
		 * The meta object literal for the '{@link tosca.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.RelationshipImpl
		 * @see tosca.impl.ToscaPackageImpl#getRelationship()
		 * @generated
		 */
        EClass RELATIONSHIP = eINSTANCE.getRelationship();

        /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

        /**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RELATIONSHIP__INTERFACES = eINSTANCE.getRelationship_Interfaces();

        /**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RELATIONSHIP__PROPERTIES = eINSTANCE.getRelationship_Properties();

        /**
		 * The meta object literal for the '<em><b>Source interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RELATIONSHIP__SOURCE_INTERFACES = eINSTANCE.getRelationship_Source_interfaces();

        /**
		 * The meta object literal for the '<em><b>Target interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RELATIONSHIP__TARGET_INTERFACES = eINSTANCE.getRelationship_Target_interfaces();

        /**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

        /**
		 * The meta object literal for the '<em><b>Relationship name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RELATIONSHIP__RELATIONSHIP_NAME = eINSTANCE.getRelationship_Relationship_name();

        /**
		 * The meta object literal for the '{@link tosca.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.PropertyImpl
		 * @see tosca.impl.ToscaPackageImpl#getProperty()
		 * @generated
		 */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
		 * The meta object literal for the '<em><b>Property name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PROPERTY__PROPERTY_NAME = eINSTANCE.getProperty_Property_name();

        /**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

        /**
		 * The meta object literal for the '{@link tosca.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.RequirementImpl
		 * @see tosca.impl.ToscaPackageImpl#getRequirement()
		 * @generated
		 */
        EClass REQUIREMENT = eINSTANCE.getRequirement();

        /**
		 * The meta object literal for the '<em><b>Requirement name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute REQUIREMENT__REQUIREMENT_NAME = eINSTANCE.getRequirement_Requirement_name();

        /**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute REQUIREMENT__NODE = eINSTANCE.getRequirement_Node();

        /**
		 * The meta object literal for the '<em><b>Capabiity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute REQUIREMENT__CAPABIITY = eINSTANCE.getRequirement_Capabiity();

        /**
		 * The meta object literal for the '{@link tosca.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.OperationImpl
		 * @see tosca.impl.ToscaPackageImpl#getOperation()
		 * @generated
		 */
        EClass OPERATION = eINSTANCE.getOperation();

        /**
		 * The meta object literal for the '<em><b>Operation name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute OPERATION__OPERATION_NAME = eINSTANCE.getOperation_Operation_name();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute OPERATION__DESCRIPTION = eINSTANCE.getOperation_Description();

        /**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference OPERATION__INPUTS = eINSTANCE.getOperation_Inputs();

        /**
		 * The meta object literal for the '<em><b>Dependent Artifacts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute OPERATION__DEPENDENT_ARTIFACTS = eINSTANCE.getOperation_DependentArtifacts();

        /**
		 * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute OPERATION__PRIMARY = eINSTANCE.getOperation_Primary();

        /**
		 * The meta object literal for the '{@link tosca.impl.TopologyTemplateImpl <em>Topology Template</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.TopologyTemplateImpl
		 * @see tosca.impl.ToscaPackageImpl#getTopologyTemplate()
		 * @generated
		 */
        EClass TOPOLOGY_TEMPLATE = eINSTANCE.getTopologyTemplate();

        /**
		 * The meta object literal for the '<em><b>Tosca definitions version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute TOPOLOGY_TEMPLATE__TOSCA_DEFINITIONS_VERSION = eINSTANCE.getTopologyTemplate_Tosca_definitions_version();

        /**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TOPOLOGY_TEMPLATE__IMPORTS = eINSTANCE.getTopologyTemplate_Imports();

        /**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TOPOLOGY_TEMPLATE__OUTPUTS = eINSTANCE.getTopologyTemplate_Outputs();

        /**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TOPOLOGY_TEMPLATE__INPUTS = eINSTANCE.getTopologyTemplate_Inputs();

        /**
		 * The meta object literal for the '<em><b>Node Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TOPOLOGY_TEMPLATE__NODE_TEMPLATES = eINSTANCE.getTopologyTemplate_NodeTemplates();

        /**
		 * The meta object literal for the '<em><b>Realtionships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TOPOLOGY_TEMPLATE__REALTIONSHIPS = eINSTANCE.getTopologyTemplate_Realtionships();

        /**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TOPOLOGY_TEMPLATE__GROUPS = eINSTANCE.getTopologyTemplate_Groups();

        /**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference TOPOLOGY_TEMPLATE__POLICIES = eINSTANCE.getTopologyTemplate_Policies();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute TOPOLOGY_TEMPLATE__DESCRIPTION = eINSTANCE.getTopologyTemplate_Description();

        /**
		 * The meta object literal for the '{@link tosca.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.ImportImpl
		 * @see tosca.impl.ToscaPackageImpl#getImport()
		 * @generated
		 */
        EClass IMPORT = eINSTANCE.getImport();

        /**
		 * The meta object literal for the '<em><b>Import name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute IMPORT__IMPORT_NAME = eINSTANCE.getImport_Import_name();

        /**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute IMPORT__FILE = eINSTANCE.getImport_File();

        /**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute IMPORT__REPOSITORY = eINSTANCE.getImport_Repository();

        /**
		 * The meta object literal for the '<em><b>Namespace uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute IMPORT__NAMESPACE_URI = eINSTANCE.getImport_Namespace_uri();

        /**
		 * The meta object literal for the '<em><b>Namespace prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute IMPORT__NAMESPACE_PREFIX = eINSTANCE.getImport_Namespace_prefix();

        /**
		 * The meta object literal for the '{@link tosca.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.GroupImpl
		 * @see tosca.impl.ToscaPackageImpl#getGroup()
		 * @generated
		 */
        EClass GROUP = eINSTANCE.getGroup();

        /**
		 * The meta object literal for the '<em><b>Group name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute GROUP__GROUP_NAME = eINSTANCE.getGroup_Group_name();

        /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute GROUP__TYPE = eINSTANCE.getGroup_Type();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute GROUP__DESCRIPTION = eINSTANCE.getGroup_Description();

        /**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference GROUP__PROPERTIES = eINSTANCE.getGroup_Properties();

        /**
		 * The meta object literal for the '<em><b>Targets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute GROUP__TARGETS = eINSTANCE.getGroup_Targets();

        /**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference GROUP__INTERFACES = eINSTANCE.getGroup_Interfaces();

        /**
		 * The meta object literal for the '{@link tosca.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.PolicyImpl
		 * @see tosca.impl.ToscaPackageImpl#getPolicy()
		 * @generated
		 */
        EClass POLICY = eINSTANCE.getPolicy();

        /**
		 * The meta object literal for the '<em><b>Policy name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute POLICY__POLICY_NAME = eINSTANCE.getPolicy_Policy_name();

        /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute POLICY__TYPE = eINSTANCE.getPolicy_Type();

        /**
		 * The meta object literal for the '{@link tosca.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.CapabilityImpl
		 * @see tosca.impl.ToscaPackageImpl#getCapability()
		 * @generated
		 */
        EClass CAPABILITY = eINSTANCE.getCapability();

        /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CAPABILITY__TYPE = eINSTANCE.getCapability_Type();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CAPABILITY__DESCRIPTION = eINSTANCE.getCapability_Description();

        /**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CAPABILITY__PROPERTIES = eINSTANCE.getCapability_Properties();

        /**
		 * The meta object literal for the '<em><b>Capability name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CAPABILITY__CAPABILITY_NAME = eINSTANCE.getCapability_Capability_name();

        /**
		 * The meta object literal for the '{@link tosca.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.ParameterImpl
		 * @see tosca.impl.ToscaPackageImpl#getParameter()
		 * @generated
		 */
        EClass PARAMETER = eINSTANCE.getParameter();

        /**
		 * The meta object literal for the '<em><b>Parameter name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PARAMETER__PARAMETER_NAME = eINSTANCE.getParameter_Parameter_name();

        /**
		 * The meta object literal for the '<em><b>Parameter value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PARAMETER__PARAMETER_VALUE = eINSTANCE.getParameter_Parameter_value();

        /**
		 * The meta object literal for the '{@link tosca.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.ArtifactImpl
		 * @see tosca.impl.ToscaPackageImpl#getArtifact()
		 * @generated
		 */
        EClass ARTIFACT = eINSTANCE.getArtifact();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

        /**
		 * The meta object literal for the '<em><b>Artifact Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ARTIFACT__ARTIFACT_URI = eINSTANCE.getArtifact_ArtifactUri();

        /**
		 * The meta object literal for the '{@link tosca.impl.InstancesImpl <em>Instances</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.InstancesImpl
		 * @see tosca.impl.ToscaPackageImpl#getInstances()
		 * @generated
		 */
        EClass INSTANCES = eINSTANCE.getInstances();

        /**
		 * The meta object literal for the '<em><b>Deploy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute INSTANCES__DEPLOY = eINSTANCE.getInstances_Deploy();

        /**
		 * The meta object literal for the '{@link tosca.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.ConfigurationImpl
		 * @see tosca.impl.ToscaPackageImpl#getConfiguration()
		 * @generated
		 */
        EClass CONFIGURATION = eINSTANCE.getConfiguration();

        /**
		 * The meta object literal for the '<em><b>Property name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CONFIGURATION__PROPERTY_NAME = eINSTANCE.getConfiguration_Property_name();

        /**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CONFIGURATION__VALUE = eINSTANCE.getConfiguration_Value();

        /**
		 * The meta object literal for the '{@link tosca.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.ArgumentImpl
		 * @see tosca.impl.ToscaPackageImpl#getArgument()
		 * @generated
		 */
        EClass ARGUMENT = eINSTANCE.getArgument();

        /**
		 * The meta object literal for the '<em><b>Argument name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ARGUMENT__ARGUMENT_NAME = eINSTANCE.getArgument_Argument_name();

        /**
		 * The meta object literal for the '<em><b>Argument value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ARGUMENT__ARGUMENT_VALUE = eINSTANCE.getArgument_Argument_value();

        /**
		 * The meta object literal for the '{@link tosca.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.ExpressionImpl
		 * @see tosca.impl.ToscaPackageImpl#getExpression()
		 * @generated
		 */
        EClass EXPRESSION = eINSTANCE.getExpression();

        /**
		 * The meta object literal for the '{@link tosca.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.ValueImpl
		 * @see tosca.impl.ToscaPackageImpl#getValue()
		 * @generated
		 */
        EClass VALUE = eINSTANCE.getValue();

        /**
		 * The meta object literal for the '{@link tosca.impl.SimpleValueImpl <em>Simple Value</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.SimpleValueImpl
		 * @see tosca.impl.ToscaPackageImpl#getSimpleValue()
		 * @generated
		 */
        EClass SIMPLE_VALUE = eINSTANCE.getSimpleValue();

        /**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SIMPLE_VALUE__VALUE = eINSTANCE.getSimpleValue_Value();

        /**
		 * The meta object literal for the '{@link tosca.impl.GetAttributeImpl <em>Get Attribute</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.GetAttributeImpl
		 * @see tosca.impl.ToscaPackageImpl#getGetAttribute()
		 * @generated
		 */
        EClass GET_ATTRIBUTE = eINSTANCE.getGetAttribute();

        /**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute GET_ATTRIBUTE__NODE = eINSTANCE.getGetAttribute_Node();

        /**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute GET_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getGetAttribute_Attribute();

        /**
		 * The meta object literal for the '{@link tosca.impl.FirewallRuleImpl <em>Firewall Rule</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.FirewallRuleImpl
		 * @see tosca.impl.ToscaPackageImpl#getFirewallRule()
		 * @generated
		 */
        EClass FIREWALL_RULE = eINSTANCE.getFirewallRule();

        /**
		 * The meta object literal for the '<em><b>Remote ip prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute FIREWALL_RULE__REMOTE_IP_PREFIX = eINSTANCE.getFirewallRule_Remote_ip_prefix();

        /**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute FIREWALL_RULE__PORT = eINSTANCE.getFirewallRule_Port();

        /**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute FIREWALL_RULE__PROTOCOL = eINSTANCE.getFirewallRule_Protocol();

        /**
		 * The meta object literal for the '{@link tosca.impl.MonitoringPropertyImpl <em>Monitoring Property</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.MonitoringPropertyImpl
		 * @see tosca.impl.ToscaPackageImpl#getMonitoringProperty()
		 * @generated
		 */
        EClass MONITORING_PROPERTY = eINSTANCE.getMonitoringProperty();

        /**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MONITORING_PROPERTY__ENABLED = eINSTANCE.getMonitoringProperty_Enabled();

        /**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MONITORING_PROPERTY__ROLES = eINSTANCE.getMonitoringProperty_Roles();

        /**
		 * The meta object literal for the '{@link tosca.impl.EnvironmentVariableImpl <em>Environment Variable</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see tosca.impl.EnvironmentVariableImpl
		 * @see tosca.impl.ToscaPackageImpl#getEnvironmentVariable()
		 * @generated
		 */
        EClass ENVIRONMENT_VARIABLE = eINSTANCE.getEnvironmentVariable();

        /**
		 * The meta object literal for the '<em><b>Variable name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ENVIRONMENT_VARIABLE__VARIABLE_NAME = eINSTANCE.getEnvironmentVariable_Variable_name();

        /**
		 * The meta object literal for the '<em><b>Variable value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ENVIRONMENT_VARIABLE__VARIABLE_VALUE = eINSTANCE.getEnvironmentVariable_Variable_value();

								/**
		 * The meta object literal for the '{@link tosca.impl.ConcatImpl <em>Concat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tosca.impl.ConcatImpl
		 * @see tosca.impl.ToscaPackageImpl#getConcat()
		 * @generated
		 */
		EClass CONCAT = eINSTANCE.getConcat();

								/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCAT__ITEMS = eINSTANCE.getConcat_Items();

    }

} //ToscaPackage
