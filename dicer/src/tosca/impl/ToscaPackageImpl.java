/**
 */
package tosca.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tosca.Artifact;
import tosca.Attribute;
import tosca.Capability;
import tosca.Group;
import tosca.Import;
import tosca.Interface;
import tosca.NodeTemplate;
import tosca.Operation;
import tosca.Parameter;
import tosca.Policy;
import tosca.Property;
import tosca.Relationship;
import tosca.Requirement;
import tosca.TopologyTemplate;
import tosca.ToscaFactory;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToscaPackageImpl extends EPackageImpl implements ToscaPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nodeTemplateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interfaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationshipEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass requirementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass topologyTemplateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass importEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass groupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass policyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass capabilityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass artifactEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see tosca.ToscaPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ToscaPackageImpl() {
        super(eNS_URI, ToscaFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ToscaPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ToscaPackage init() {
        if (isInited) return (ToscaPackage)EPackage.Registry.INSTANCE.getEPackage(ToscaPackage.eNS_URI);

        // Obtain or create and register package
        ToscaPackageImpl theToscaPackage = (ToscaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToscaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToscaPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theToscaPackage.createPackageContents();

        // Initialize created meta-data
        theToscaPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theToscaPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ToscaPackage.eNS_URI, theToscaPackage);
        return theToscaPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNodeTemplate() {
        return nodeTemplateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNodeTemplate_Node_template_name() {
        return (EAttribute)nodeTemplateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNodeTemplate_Type() {
        return (EAttribute)nodeTemplateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNodeTemplate_Interfaces() {
        return (EReference)nodeTemplateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNodeTemplate_Description() {
        return (EAttribute)nodeTemplateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNodeTemplate_Properties() {
        return (EReference)nodeTemplateEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNodeTemplate_Attributes() {
        return (EReference)nodeTemplateEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNodeTemplate_Requirements() {
        return (EReference)nodeTemplateEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNodeTemplate_Relationships() {
        return (EReference)nodeTemplateEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNodeTemplate_Capabilities() {
        return (EReference)nodeTemplateEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterface() {
        return interfaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInterface_Interface_name() {
        return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterface_Operations() {
        return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterface_Inputs() {
        return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInterface_Type() {
        return (EAttribute)interfaceEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelationship() {
        return relationshipEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationship_Type() {
        return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationship_Interfaces() {
        return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationship_Properties() {
        return (EReference)relationshipEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationship_Attributes() {
        return (EReference)relationshipEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationship_Source_interfaces() {
        return (EReference)relationshipEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRelationship_Target_interfaces() {
        return (EReference)relationshipEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationship_Target() {
        return (EAttribute)relationshipEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationship_Relationship_name() {
        return (EAttribute)relationshipEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProperty() {
        return propertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Property_name() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Value() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttribute() {
        return attributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Attribute_name() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRequirement() {
        return requirementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRequirement_Requirement_name() {
        return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRequirement_Node() {
        return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRequirement_Capabiity() {
        return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperation() {
        return operationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_Operation_name() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_Description() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperation_Inputs() {
        return (EReference)operationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_DependentArtifacts() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_Primary() {
        return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTopologyTemplate() {
        return topologyTemplateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTopologyTemplate_Tosca_definitions_version() {
        return (EAttribute)topologyTemplateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTopologyTemplate_Imports() {
        return (EReference)topologyTemplateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTopologyTemplate_Outputs() {
        return (EReference)topologyTemplateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTopologyTemplate_Inputs() {
        return (EReference)topologyTemplateEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTopologyTemplate_NodeTemplates() {
        return (EReference)topologyTemplateEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTopologyTemplate_Realtionships() {
        return (EReference)topologyTemplateEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTopologyTemplate_Groups() {
        return (EReference)topologyTemplateEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTopologyTemplate_Policies() {
        return (EReference)topologyTemplateEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTopologyTemplate_Description() {
        return (EAttribute)topologyTemplateEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getImport() {
        return importEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImport_Import_name() {
        return (EAttribute)importEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImport_File() {
        return (EAttribute)importEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImport_Repository() {
        return (EAttribute)importEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImport_Namespace_uri() {
        return (EAttribute)importEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImport_Namespace_prefix() {
        return (EAttribute)importEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGroup() {
        return groupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGroup_Group_name() {
        return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGroup_Type() {
        return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGroup_Description() {
        return (EAttribute)groupEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGroup_Properties() {
        return (EReference)groupEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGroup_Targets() {
        return (EAttribute)groupEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGroup_Interfaces() {
        return (EReference)groupEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPolicy() {
        return policyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPolicy_Policy_name() {
        return (EAttribute)policyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPolicy_Type() {
        return (EAttribute)policyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCapability() {
        return capabilityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCapability_Type() {
        return (EAttribute)capabilityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCapability_Description() {
        return (EAttribute)capabilityEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCapability_Properties() {
        return (EReference)capabilityEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCapability_Attributes() {
        return (EReference)capabilityEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCapability_Capability_name() {
        return (EAttribute)capabilityEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameter() {
        return parameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameter_Parameter_name() {
        return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getArtifact() {
        return artifactEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArtifact_Name() {
        return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getArtifact_ArtifactUri() {
        return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ToscaFactory getToscaFactory() {
        return (ToscaFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        nodeTemplateEClass = createEClass(NODE_TEMPLATE);
        createEAttribute(nodeTemplateEClass, NODE_TEMPLATE__NODE_TEMPLATE_NAME);
        createEAttribute(nodeTemplateEClass, NODE_TEMPLATE__TYPE);
        createEReference(nodeTemplateEClass, NODE_TEMPLATE__INTERFACES);
        createEAttribute(nodeTemplateEClass, NODE_TEMPLATE__DESCRIPTION);
        createEReference(nodeTemplateEClass, NODE_TEMPLATE__PROPERTIES);
        createEReference(nodeTemplateEClass, NODE_TEMPLATE__ATTRIBUTES);
        createEReference(nodeTemplateEClass, NODE_TEMPLATE__REQUIREMENTS);
        createEReference(nodeTemplateEClass, NODE_TEMPLATE__RELATIONSHIPS);
        createEReference(nodeTemplateEClass, NODE_TEMPLATE__CAPABILITIES);

        interfaceEClass = createEClass(INTERFACE);
        createEAttribute(interfaceEClass, INTERFACE__INTERFACE_NAME);
        createEReference(interfaceEClass, INTERFACE__OPERATIONS);
        createEReference(interfaceEClass, INTERFACE__INPUTS);
        createEAttribute(interfaceEClass, INTERFACE__TYPE);

        relationshipEClass = createEClass(RELATIONSHIP);
        createEAttribute(relationshipEClass, RELATIONSHIP__TYPE);
        createEReference(relationshipEClass, RELATIONSHIP__INTERFACES);
        createEReference(relationshipEClass, RELATIONSHIP__PROPERTIES);
        createEReference(relationshipEClass, RELATIONSHIP__ATTRIBUTES);
        createEReference(relationshipEClass, RELATIONSHIP__SOURCE_INTERFACES);
        createEReference(relationshipEClass, RELATIONSHIP__TARGET_INTERFACES);
        createEAttribute(relationshipEClass, RELATIONSHIP__TARGET);
        createEAttribute(relationshipEClass, RELATIONSHIP__RELATIONSHIP_NAME);

        propertyEClass = createEClass(PROPERTY);
        createEAttribute(propertyEClass, PROPERTY__PROPERTY_NAME);
        createEAttribute(propertyEClass, PROPERTY__VALUE);

        attributeEClass = createEClass(ATTRIBUTE);
        createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_NAME);

        requirementEClass = createEClass(REQUIREMENT);
        createEAttribute(requirementEClass, REQUIREMENT__REQUIREMENT_NAME);
        createEAttribute(requirementEClass, REQUIREMENT__NODE);
        createEAttribute(requirementEClass, REQUIREMENT__CAPABIITY);

        operationEClass = createEClass(OPERATION);
        createEAttribute(operationEClass, OPERATION__OPERATION_NAME);
        createEAttribute(operationEClass, OPERATION__DESCRIPTION);
        createEReference(operationEClass, OPERATION__INPUTS);
        createEAttribute(operationEClass, OPERATION__DEPENDENT_ARTIFACTS);
        createEAttribute(operationEClass, OPERATION__PRIMARY);

        topologyTemplateEClass = createEClass(TOPOLOGY_TEMPLATE);
        createEAttribute(topologyTemplateEClass, TOPOLOGY_TEMPLATE__TOSCA_DEFINITIONS_VERSION);
        createEReference(topologyTemplateEClass, TOPOLOGY_TEMPLATE__IMPORTS);
        createEReference(topologyTemplateEClass, TOPOLOGY_TEMPLATE__OUTPUTS);
        createEReference(topologyTemplateEClass, TOPOLOGY_TEMPLATE__INPUTS);
        createEReference(topologyTemplateEClass, TOPOLOGY_TEMPLATE__NODE_TEMPLATES);
        createEReference(topologyTemplateEClass, TOPOLOGY_TEMPLATE__REALTIONSHIPS);
        createEReference(topologyTemplateEClass, TOPOLOGY_TEMPLATE__GROUPS);
        createEReference(topologyTemplateEClass, TOPOLOGY_TEMPLATE__POLICIES);
        createEAttribute(topologyTemplateEClass, TOPOLOGY_TEMPLATE__DESCRIPTION);

        importEClass = createEClass(IMPORT);
        createEAttribute(importEClass, IMPORT__IMPORT_NAME);
        createEAttribute(importEClass, IMPORT__FILE);
        createEAttribute(importEClass, IMPORT__REPOSITORY);
        createEAttribute(importEClass, IMPORT__NAMESPACE_URI);
        createEAttribute(importEClass, IMPORT__NAMESPACE_PREFIX);

        groupEClass = createEClass(GROUP);
        createEAttribute(groupEClass, GROUP__GROUP_NAME);
        createEAttribute(groupEClass, GROUP__TYPE);
        createEAttribute(groupEClass, GROUP__DESCRIPTION);
        createEReference(groupEClass, GROUP__PROPERTIES);
        createEAttribute(groupEClass, GROUP__TARGETS);
        createEReference(groupEClass, GROUP__INTERFACES);

        policyEClass = createEClass(POLICY);
        createEAttribute(policyEClass, POLICY__POLICY_NAME);
        createEAttribute(policyEClass, POLICY__TYPE);

        capabilityEClass = createEClass(CAPABILITY);
        createEAttribute(capabilityEClass, CAPABILITY__TYPE);
        createEAttribute(capabilityEClass, CAPABILITY__DESCRIPTION);
        createEReference(capabilityEClass, CAPABILITY__PROPERTIES);
        createEReference(capabilityEClass, CAPABILITY__ATTRIBUTES);
        createEAttribute(capabilityEClass, CAPABILITY__CAPABILITY_NAME);

        parameterEClass = createEClass(PARAMETER);
        createEAttribute(parameterEClass, PARAMETER__PARAMETER_NAME);

        artifactEClass = createEClass(ARTIFACT);
        createEAttribute(artifactEClass, ARTIFACT__NAME);
        createEAttribute(artifactEClass, ARTIFACT__ARTIFACT_URI);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(nodeTemplateEClass, NodeTemplate.class, "NodeTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNodeTemplate_Node_template_name(), ecorePackage.getEString(), "node_template_name", null, 1, 1, NodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNodeTemplate_Type(), ecorePackage.getEString(), "type", null, 1, 1, NodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNodeTemplate_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1, NodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNodeTemplate_Description(), ecorePackage.getEString(), "description", null, 0, 1, NodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNodeTemplate_Properties(), this.getProperty(), null, "properties", null, 0, -1, NodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNodeTemplate_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, NodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNodeTemplate_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, NodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNodeTemplate_Relationships(), this.getRelationship(), null, "relationships", null, 0, -1, NodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNodeTemplate_Capabilities(), this.getCapability(), null, "capabilities", null, 0, -1, NodeTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInterface_Interface_name(), ecorePackage.getEString(), "interface_name", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInterface_Operations(), this.getOperation(), null, "operations", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInterface_Inputs(), this.getProperty(), null, "inputs", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getInterface_Type(), ecorePackage.getEString(), "type", null, 1, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRelationship_Type(), ecorePackage.getEString(), "type", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationship_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationship_Properties(), this.getProperty(), null, "properties", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationship_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationship_Source_interfaces(), this.getInterface(), null, "source_interfaces", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationship_Target_interfaces(), this.getInterface(), null, "target_interfaces", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRelationship_Target(), ecorePackage.getEString(), "target", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRelationship_Relationship_name(), ecorePackage.getEString(), "relationship_name", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProperty_Property_name(), ecorePackage.getEString(), "property_name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAttribute_Attribute_name(), ecorePackage.getEString(), "attribute_name", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRequirement_Requirement_name(), ecorePackage.getEString(), "requirement_name", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRequirement_Node(), ecorePackage.getEString(), "node", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRequirement_Capabiity(), ecorePackage.getEString(), "capabiity", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOperation_Operation_name(), ecorePackage.getEString(), "operation_name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperation_Inputs(), this.getProperty(), null, "inputs", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperation_DependentArtifacts(), ecorePackage.getEString(), "dependentArtifacts", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperation_Primary(), ecorePackage.getEString(), "primary", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(topologyTemplateEClass, TopologyTemplate.class, "TopologyTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTopologyTemplate_Tosca_definitions_version(), ecorePackage.getEString(), "tosca_definitions_version", null, 1, 1, TopologyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTopologyTemplate_Imports(), this.getImport(), null, "imports", null, 0, -1, TopologyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTopologyTemplate_Outputs(), this.getParameter(), null, "outputs", null, 0, -1, TopologyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTopologyTemplate_Inputs(), this.getParameter(), null, "inputs", null, 0, -1, TopologyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTopologyTemplate_NodeTemplates(), this.getNodeTemplate(), null, "nodeTemplates", null, 0, -1, TopologyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTopologyTemplate_Realtionships(), this.getRelationship(), null, "realtionships", null, 0, -1, TopologyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTopologyTemplate_Groups(), this.getGroup(), null, "groups", null, 0, -1, TopologyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTopologyTemplate_Policies(), this.getPolicy(), null, "policies", null, 0, -1, TopologyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTopologyTemplate_Description(), ecorePackage.getEString(), "description", null, 0, 1, TopologyTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getImport_Import_name(), ecorePackage.getEString(), "import_name", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getImport_File(), ecorePackage.getEString(), "file", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getImport_Repository(), ecorePackage.getEString(), "repository", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getImport_Namespace_uri(), ecorePackage.getEString(), "namespace_uri", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getImport_Namespace_prefix(), ecorePackage.getEString(), "namespace_prefix", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGroup_Group_name(), ecorePackage.getEString(), "group_name", null, 1, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGroup_Type(), ecorePackage.getEString(), "type", null, 1, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGroup_Properties(), this.getProperty(), null, "properties", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGroup_Targets(), ecorePackage.getEString(), "targets", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGroup_Interfaces(), this.getInterface(), null, "interfaces", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPolicy_Policy_name(), ecorePackage.getEString(), "policy_name", null, 1, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPolicy_Type(), ecorePackage.getEString(), "type", null, 1, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCapability_Type(), ecorePackage.getEString(), "type", null, 1, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCapability_Description(), ecorePackage.getEString(), "description", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCapability_Properties(), this.getProperty(), null, "properties", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCapability_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCapability_Capability_name(), ecorePackage.getEString(), "capability_name", null, 1, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getParameter_Parameter_name(), ecorePackage.getEString(), "parameter_name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getArtifact_Name(), ecorePackage.getEString(), "name", null, 1, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getArtifact_ArtifactUri(), ecorePackage.getEString(), "artifactUri", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://es.unizar.disco/dice/profiles/generator
        createGeneratorAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://es.unizar.disco/dice/profiles/generator</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createGeneratorAnnotations() {
        String source = "http://es.unizar.disco/dice/profiles/generator";	
        addAnnotation
          (this, 
           source, 
           new String[] {
           });	
        addAnnotation
          (nodeTemplateEClass, 
           source, 
           new String[] {
             "description", "A Node Template specifies the occurrence of a manageable software component as part of an application\u2019s topology model.  A Node template is an instance of a specified Node Type and can provide customized properties, constraints or operations which override the defaults provided by its Node Type and its implementations.\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}"
           });	
        addAnnotation
          (interfaceEClass, 
           source, 
           new String[] {
             "description", "An interface defines a named interface that can be associated with a Node or Relationship Type.\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}"
           });	
        addAnnotation
          (relationshipEClass, 
           source, 
           new String[] {
             "description", "A Relationship Template specifies the occurrence of a manageable relationship between node templates as part of an application\u2019s topology model.  A Relationship template is an instance of a specified Relationship Type .\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}.\n"
           });	
        addAnnotation
          (propertyEClass, 
           source, 
           new String[] {
             "description", "value desr",
             "exclude", ""
           });	
        addAnnotation
          (attributeEClass, 
           source, 
           new String[] {
             "description", "value desr",
             "exclude", ""
           });	
        addAnnotation
          (requirementEClass, 
           source, 
           new String[] {
             "description", "A Requirement describes a dependency of a TOSCA Node Type or Node template which needs to be fulfilled by a matching Capability declared by another TOSCA modelable entity. \nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}\n"
           });	
        addAnnotation
          (operationEClass, 
           source, 
           new String[] {
             "description", "An operation defines a named function or procedure that can be bound to an implementation artifact (e.g., a script).\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}."
           });	
        addAnnotation
          (topologyTemplateEClass, 
           source, 
           new String[] {
             "description", "A Topology Template defines the topology of a cloud application. The main ingredients of the topology template are node templates representing components of the application and relationship templates representing links between the components. \nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}\n"
           });	
        addAnnotation
          (importEClass, 
           source, 
           new String[] {
             "description", "An import is used to locate and uniquely name another TOSCA file which has type and template definitions to be imported (included) and referenced.\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}\n"
           });	
        addAnnotation
          (groupEClass, 
           source, 
           new String[] {
             "description", "A group definition defines a logical grouping of node templates, typically for management purposes.\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}\n"
           });	
        addAnnotation
          (policyEClass, 
           source, 
           new String[] {
             "description", "A policy definition defines a policy that can be associated with a TOSCA topology.\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}\n"
           });
        addAnnotation
          (policyEClass, 
           new boolean[] { true },
           "http://es.unizar.disco/dice/profiles/generator",
           new String[] {
             "description", "An operation defines a named function or procedure that can be bound to an implementation artifact (e.g., a script).\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}."
           });	
        addAnnotation
          (capabilityEClass, 
           source, 
           new String[] {
             "description", "A Capability defines a named, typed set of data that can be associated with Node Type or Node Template to describe a transparent capability or feature of the software component the node describes.\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}\n"
           });
    }

} //ToscaPackageImpl
