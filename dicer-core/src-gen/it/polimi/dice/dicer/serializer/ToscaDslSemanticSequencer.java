/*
 * generated by Xtext 2.10.0
 */
package it.polimi.dice.dicer.serializer;

import com.google.inject.Inject;
import it.polimi.dice.dicer.services.ToscaDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import tosca.Argument;
import tosca.Capability;
import tosca.Configuration;
import tosca.Expression;
import tosca.FirewallRule;
import tosca.GetAttribute;
import tosca.Group;
import tosca.Import;
import tosca.Instances;
import tosca.Interface;
import tosca.MonitoringProperty;
import tosca.NodeTemplate;
import tosca.Operation;
import tosca.Policy;
import tosca.Property;
import tosca.Relationship;
import tosca.Requirement;
import tosca.SimpleValue;
import tosca.TopologyTemplate;
import tosca.ToscaPackage;
import tosca.Value;

@SuppressWarnings("all")
public class ToscaDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ToscaDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ToscaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ToscaPackage.ARGUMENT:
				sequence_Argument(context, (Argument) semanticObject); 
				return; 
			case ToscaPackage.CAPABILITY:
				sequence_Capability(context, (Capability) semanticObject); 
				return; 
			case ToscaPackage.CONFIGURATION:
				sequence_Configuration(context, (Configuration) semanticObject); 
				return; 
			case ToscaPackage.EXPRESSION:
				sequence_Expression_Impl(context, (Expression) semanticObject); 
				return; 
			case ToscaPackage.FIREWALL_RULE:
				sequence_FirewallRule(context, (FirewallRule) semanticObject); 
				return; 
			case ToscaPackage.GET_ATTRIBUTE:
				sequence_GetAttribute(context, (GetAttribute) semanticObject); 
				return; 
			case ToscaPackage.GROUP:
				sequence_Group(context, (Group) semanticObject); 
				return; 
			case ToscaPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case ToscaPackage.INSTANCES:
				sequence_Instances(context, (Instances) semanticObject); 
				return; 
			case ToscaPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case ToscaPackage.MONITORING_PROPERTY:
				sequence_MonitoringProperty(context, (MonitoringProperty) semanticObject); 
				return; 
			case ToscaPackage.NODE_TEMPLATE:
				sequence_NodeTemplate(context, (NodeTemplate) semanticObject); 
				return; 
			case ToscaPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case ToscaPackage.PARAMETER:
				sequence_Parameter(context, (tosca.Parameter) semanticObject); 
				return; 
			case ToscaPackage.POLICY:
				sequence_Policy(context, (Policy) semanticObject); 
				return; 
			case ToscaPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case ToscaPackage.RELATIONSHIP:
				sequence_Relationship(context, (Relationship) semanticObject); 
				return; 
			case ToscaPackage.REQUIREMENT:
				sequence_Requirement(context, (Requirement) semanticObject); 
				return; 
			case ToscaPackage.SIMPLE_VALUE:
				sequence_SimpleValue(context, (SimpleValue) semanticObject); 
				return; 
			case ToscaPackage.TOPOLOGY_TEMPLATE:
				sequence_TopologyTemplate(context, (TopologyTemplate) semanticObject); 
				return; 
			case ToscaPackage.VALUE:
				sequence_Value_Impl(context, (Value) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Argument returns Argument
	 *
	 * Constraint:
	 *     argument_value=Value
	 */
	protected void sequence_Argument(ISerializationContext context, Argument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.ARGUMENT__ARGUMENT_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.ARGUMENT__ARGUMENT_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArgumentAccess().getArgument_valueValueParserRuleCall_0(), semanticObject.getArgument_value());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Capability returns Capability
	 *
	 * Constraint:
	 *     (capability_name=STRING type=STRING description=STRING? (properties+=Property properties+=Property*)?)
	 */
	protected void sequence_Capability(ISerializationContext context, Capability semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Configuration returns Configuration
	 *
	 * Constraint:
	 *     (property_name=STRING value=STRING)
	 */
	protected void sequence_Configuration(ISerializationContext context, Configuration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.CONFIGURATION__PROPERTY_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.CONFIGURATION__PROPERTY_NAME));
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.CONFIGURATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.CONFIGURATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConfigurationAccess().getProperty_nameSTRINGTerminalRuleCall_2_0(), semanticObject.getProperty_name());
		feeder.accept(grammarAccess.getConfigurationAccess().getValueSTRINGTerminalRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Expression
	 *     Expression_Impl returns Expression
	 *
	 * Constraint:
	 *     {Expression}
	 */
	protected void sequence_Expression_Impl(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FirewallRule returns FirewallRule
	 *
	 * Constraint:
	 *     (remote_ip_prefix=STRING port=STRING)
	 */
	protected void sequence_FirewallRule(ISerializationContext context, FirewallRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.FIREWALL_RULE__REMOTE_IP_PREFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.FIREWALL_RULE__REMOTE_IP_PREFIX));
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.FIREWALL_RULE__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.FIREWALL_RULE__PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFirewallRuleAccess().getRemote_ip_prefixSTRINGTerminalRuleCall_3_0(), semanticObject.getRemote_ip_prefix());
		feeder.accept(grammarAccess.getFirewallRuleAccess().getPortSTRINGTerminalRuleCall_6_0(), semanticObject.getPort());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns GetAttribute
	 *     GetAttribute returns GetAttribute
	 *
	 * Constraint:
	 *     (node=STRING attribute=STRING)
	 */
	protected void sequence_GetAttribute(ISerializationContext context, GetAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.GET_ATTRIBUTE__NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.GET_ATTRIBUTE__NODE));
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.GET_ATTRIBUTE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.GET_ATTRIBUTE__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGetAttributeAccess().getNodeSTRINGTerminalRuleCall_4_0(), semanticObject.getNode());
		feeder.accept(grammarAccess.getGetAttributeAccess().getAttributeSTRINGTerminalRuleCall_6_0(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Group returns Group
	 *
	 * Constraint:
	 *     (
	 *         group_name=STRING 
	 *         type=STRING 
	 *         description=STRING? 
	 *         (targets+=EString targets+=STRING*)? 
	 *         properties=Property? 
	 *         (interfaces+=Interface interfaces+=Interface*)?
	 *     )
	 */
	protected void sequence_Group(ISerializationContext context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     file=STRING?
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instances returns Instances
	 *
	 * Constraint:
	 *     deploy=INT
	 */
	protected void sequence_Instances(ISerializationContext context, Instances semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.INSTANCES__DEPLOY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.INSTANCES__DEPLOY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInstancesAccess().getDeployINTTerminalRuleCall_2_0(), semanticObject.getDeploy());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Interface returns Interface
	 *
	 * Constraint:
	 *     (type=STRING (operations+=Operation operations+=Operation*)?)
	 */
	protected void sequence_Interface(ISerializationContext context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MonitoringProperty returns MonitoringProperty
	 *
	 * Constraint:
	 *     (
	 *         enabled?='
	 *          "enabled": true'? 
	 *         (roles+=STRING roles+=STRING*)?
	 *     )
	 */
	protected void sequence_MonitoringProperty(ISerializationContext context, MonitoringProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NodeTemplate returns NodeTemplate
	 *
	 * Constraint:
	 *     (
	 *         node_template_name=STRING 
	 *         type=STRING 
	 *         instances=Instances? 
	 *         description=STRING? 
	 *         (relationships+=Relationship relationships+=Relationship*)? 
	 *         (interfaces+=Interface interfaces+=Interface*)? 
	 *         monitoring=MonitoringProperty? 
	 *         (configurations+=Configuration configurations+=Configuration*)? 
	 *         (resources+=STRING resources+=STRING*)? 
	 *         (rules+=FirewallRule rules+=FirewallRule*)? 
	 *         (arguments+=Argument arguments+=Argument*)? 
	 *         (properties+=Property properties+=Property*)? 
	 *         (requirements+=Requirement requirements+=Requirement*)? 
	 *         (capabilities+=Capability capabilities+=Capability*)?
	 *     )
	 */
	protected void sequence_NodeTemplate(ISerializationContext context, NodeTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (operation_name=STRING (inputs+=Property inputs+=Property* (dependentArtifacts+=STRING dependentArtifacts+=STRING*)?)?)
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (parameter_name=STRING parameter_value=Value)
	 */
	protected void sequence_Parameter(ISerializationContext context, tosca.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.PARAMETER__PARAMETER_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.PARAMETER__PARAMETER_NAME));
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.PARAMETER__PARAMETER_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.PARAMETER__PARAMETER_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getParameter_nameSTRINGTerminalRuleCall_1_0(), semanticObject.getParameter_name());
		feeder.accept(grammarAccess.getParameterAccess().getParameter_valueValueParserRuleCall_5_0(), semanticObject.getParameter_value());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Policy returns Policy
	 *
	 * Constraint:
	 *     policy_name=STRING
	 */
	protected void sequence_Policy(ISerializationContext context, Policy semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.POLICY__POLICY_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.POLICY__POLICY_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPolicyAccess().getPolicy_nameSTRINGTerminalRuleCall_1_0(), semanticObject.getPolicy_name());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (property_name=STRING value=STRING)
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.PROPERTY__PROPERTY_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.PROPERTY__PROPERTY_NAME));
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.PROPERTY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyAccess().getProperty_nameSTRINGTerminalRuleCall_2_0(), semanticObject.getProperty_name());
		feeder.accept(grammarAccess.getPropertyAccess().getValueSTRINGTerminalRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Relationship returns Relationship
	 *
	 * Constraint:
	 *     (
	 *         type=STRING 
	 *         target=STRING? 
	 *         (interfaces+=Interface interfaces+=Interface*)? 
	 *         (properties+=Property properties+=Property*)? 
	 *         (source_interfaces+=Interface source_interfaces+=Interface*)? 
	 *         (target_interfaces+=Interface target_interfaces+=Interface*)?
	 *     )
	 */
	protected void sequence_Relationship(ISerializationContext context, Relationship semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Requirement returns Requirement
	 *
	 * Constraint:
	 *     (requirement_name=STRING capabiity=STRING node=STRING?)
	 */
	protected void sequence_Requirement(ISerializationContext context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns SimpleValue
	 *     SimpleValue returns SimpleValue
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_SimpleValue(ISerializationContext context, SimpleValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ToscaPackage.Literals.SIMPLE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToscaPackage.Literals.SIMPLE_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimpleValueAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopologyTemplate returns TopologyTemplate
	 *
	 * Constraint:
	 *     (
	 *         tosca_definitions_version=STRING 
	 *         description=STRING? 
	 *         (imports+=Import imports+=Import*)? 
	 *         (outputs+=Parameter outputs+=Parameter*)? 
	 *         (inputs+=Parameter inputs+=Parameter*)? 
	 *         (nodeTemplates+=NodeTemplate nodeTemplates+=NodeTemplate*)? 
	 *         (realtionships+=Relationship realtionships+=Relationship*)? 
	 *         (groups+=Group groups+=Group*)? 
	 *         (policies+=Policy policies+=Policy*)?
	 *     )
	 */
	protected void sequence_TopologyTemplate(ISerializationContext context, TopologyTemplate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Value
	 *     Value_Impl returns Value
	 *
	 * Constraint:
	 *     {Value}
	 */
	protected void sequence_Value_Impl(ISerializationContext context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
