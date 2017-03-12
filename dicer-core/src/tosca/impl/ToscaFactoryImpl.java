/**
 */
package tosca.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tosca.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToscaFactoryImpl extends EFactoryImpl implements ToscaFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ToscaFactory init() {
        try {
            ToscaFactory theToscaFactory = (ToscaFactory)EPackage.Registry.INSTANCE.getEFactory(ToscaPackage.eNS_URI);
            if (theToscaFactory != null) {
                return theToscaFactory;
            }
        }
        catch (Exception exception) {
            //EcorePlugin.INSTANCE.log(exception);
        }
        return new ToscaFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ToscaFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ToscaPackage.NODE_TEMPLATE: return createNodeTemplate();
            case ToscaPackage.INTERFACE: return createInterface();
            case ToscaPackage.RELATIONSHIP: return createRelationship();
            case ToscaPackage.PROPERTY: return createProperty();
            case ToscaPackage.REQUIREMENT: return createRequirement();
            case ToscaPackage.OPERATION: return createOperation();
            case ToscaPackage.TOPOLOGY_TEMPLATE: return createTopologyTemplate();
            case ToscaPackage.IMPORT: return createImport();
            case ToscaPackage.GROUP: return createGroup();
            case ToscaPackage.POLICY: return createPolicy();
            case ToscaPackage.CAPABILITY: return createCapability();
            case ToscaPackage.PARAMETER: return createParameter();
            case ToscaPackage.ARTIFACT: return createArtifact();
            case ToscaPackage.INSTANCES: return createInstances();
            case ToscaPackage.CONFIGURATION: return createConfiguration();
            case ToscaPackage.ARGUMENT: return createArgument();
            case ToscaPackage.EXPRESSION: return createExpression();
            case ToscaPackage.VALUE: return createValue();
            case ToscaPackage.SIMPLE_VALUE: return createSimpleValue();
            case ToscaPackage.GET_ATTRIBUTE: return createGetAttribute();
            case ToscaPackage.FIREWALL_RULE: return createFirewallRule();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NodeTemplate createNodeTemplate() {
        NodeTemplateImpl nodeTemplate = new NodeTemplateImpl();
        return nodeTemplate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interface createInterface() {
        InterfaceImpl interface_ = new InterfaceImpl();
        return interface_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Relationship createRelationship() {
        RelationshipImpl relationship = new RelationshipImpl();
        return relationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property createProperty() {
        PropertyImpl property = new PropertyImpl();
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Requirement createRequirement() {
        RequirementImpl requirement = new RequirementImpl();
        return requirement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation createOperation() {
        OperationImpl operation = new OperationImpl();
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopologyTemplate createTopologyTemplate() {
        TopologyTemplateImpl topologyTemplate = new TopologyTemplateImpl();
        return topologyTemplate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Import createImport() {
        ImportImpl import_ = new ImportImpl();
        return import_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Group createGroup() {
        GroupImpl group = new GroupImpl();
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Policy createPolicy() {
        PolicyImpl policy = new PolicyImpl();
        return policy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Capability createCapability() {
        CapabilityImpl capability = new CapabilityImpl();
        return capability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Parameter createParameter() {
        ParameterImpl parameter = new ParameterImpl();
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Artifact createArtifact() {
        ArtifactImpl artifact = new ArtifactImpl();
        return artifact;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Instances createInstances() {
        InstancesImpl instances = new InstancesImpl();
        return instances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Configuration createConfiguration() {
        ConfigurationImpl configuration = new ConfigurationImpl();
        return configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Argument createArgument() {
        ArgumentImpl argument = new ArgumentImpl();
        return argument;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression createExpression() {
        ExpressionImpl expression = new ExpressionImpl();
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Value createValue() {
        ValueImpl value = new ValueImpl();
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleValue createSimpleValue() {
        SimpleValueImpl simpleValue = new SimpleValueImpl();
        return simpleValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GetAttribute createGetAttribute() {
        GetAttributeImpl getAttribute = new GetAttributeImpl();
        return getAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FirewallRule createFirewallRule() {
        FirewallRuleImpl firewallRule = new FirewallRuleImpl();
        return firewallRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ToscaPackage getToscaPackage() {
        return (ToscaPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ToscaPackage getPackage() {
        return ToscaPackage.eINSTANCE;
    }

} //ToscaFactoryImpl
