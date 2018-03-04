/**
 */
package tosca;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tosca.ToscaPackage
 * @generated
 */
public interface ToscaFactory extends EFactory {
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    ToscaFactory eINSTANCE = tosca.impl.ToscaFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Node Template</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Template</em>'.
	 * @generated
	 */
    NodeTemplate createNodeTemplate();

    /**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
    Interface createInterface();

    /**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
    Relationship createRelationship();

    /**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
    Property createProperty();

    /**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
    Requirement createRequirement();

    /**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
    Operation createOperation();

    /**
	 * Returns a new object of class '<em>Topology Template</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topology Template</em>'.
	 * @generated
	 */
    TopologyTemplate createTopologyTemplate();

    /**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
    Import createImport();

    /**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
    Group createGroup();

    /**
	 * Returns a new object of class '<em>Policy</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy</em>'.
	 * @generated
	 */
    Policy createPolicy();

    /**
	 * Returns a new object of class '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability</em>'.
	 * @generated
	 */
    Capability createCapability();

    /**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
    Parameter createParameter();

    /**
	 * Returns a new object of class '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact</em>'.
	 * @generated
	 */
    Artifact createArtifact();

    /**
	 * Returns a new object of class '<em>Instances</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instances</em>'.
	 * @generated
	 */
    Instances createInstances();

    /**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
    Configuration createConfiguration();

    /**
	 * Returns a new object of class '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument</em>'.
	 * @generated
	 */
    Argument createArgument();

    /**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
    Expression createExpression();

    /**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
    Value createValue();

    /**
	 * Returns a new object of class '<em>Simple Value</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Value</em>'.
	 * @generated
	 */
    SimpleValue createSimpleValue();

    /**
	 * Returns a new object of class '<em>Get Attribute</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Attribute</em>'.
	 * @generated
	 */
    GetAttribute createGetAttribute();

    /**
	 * Returns a new object of class '<em>Firewall Rule</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firewall Rule</em>'.
	 * @generated
	 */
    FirewallRule createFirewallRule();

    /**
	 * Returns a new object of class '<em>Monitoring Property</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitoring Property</em>'.
	 * @generated
	 */
    MonitoringProperty createMonitoringProperty();

    /**
	 * Returns a new object of class '<em>Environment Variable</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Variable</em>'.
	 * @generated
	 */
    EnvironmentVariable createEnvironmentVariable();

    /**
	 * Returns a new object of class '<em>Concat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concat</em>'.
	 * @generated
	 */
	Concat createConcat();

				/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    ToscaPackage getToscaPackage();

} //ToscaFactory
