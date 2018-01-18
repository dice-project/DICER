/**
 */
package tosca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import tosca.Argument;
import tosca.Capability;
import tosca.Configuration;
import tosca.EnvironmentVariable;
import tosca.FirewallRule;
import tosca.Instances;
import tosca.Interface;
import tosca.MonitoringProperty;
import tosca.NodeTemplate;
import tosca.Property;
import tosca.Relationship;
import tosca.Requirement;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getNode_template_name <em>Node template name</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getType <em>Type</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getPortMapping <em>Port Mapping</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeTemplateImpl extends MinimalEObjectImpl.Container implements NodeTemplate {
    /**
     * The default value of the '{@link #getNode_template_name() <em>Node template name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode_template_name()
     * @generated
     * @ordered
     */
    protected static final String NODE_TEMPLATE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNode_template_name() <em>Node template name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNode_template_name()
     * @generated
     * @ordered
     */
    protected String node_template_name = NODE_TEMPLATE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterfaces()
     * @generated
     * @ordered
     */
    protected EList<Interface> interfaces;

    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected EList<Property> properties;

    /**
     * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequirements()
     * @generated
     * @ordered
     */
    protected EList<Requirement> requirements;

    /**
     * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelationships()
     * @generated
     * @ordered
     */
    protected EList<Relationship> relationships;

    /**
     * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilities()
     * @generated
     * @ordered
     */
    protected EList<Capability> capabilities;

    /**
     * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstances()
     * @generated
     * @ordered
     */
    protected Instances instances;

    /**
     * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurations()
     * @generated
     * @ordered
     */
    protected EList<Configuration> configurations;

    /**
     * The cached value of the '{@link #getResources() <em>Resources</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResources()
     * @generated
     * @ordered
     */
    protected EList<String> resources;

    /**
     * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getArguments()
     * @generated
     * @ordered
     */
    protected EList<Argument> arguments;

    /**
     * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRules()
     * @generated
     * @ordered
     */
    protected EList<FirewallRule> rules;

    /**
     * The cached value of the '{@link #getMonitoring() <em>Monitoring</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMonitoring()
     * @generated
     * @ordered
     */
    protected MonitoringProperty monitoring;

    /**
     * The cached value of the '{@link #getPortMapping() <em>Port Mapping</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPortMapping()
     * @generated
     * @ordered
     */
    protected EList<Property> portMapping;

    /**
     * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnvironment()
     * @generated
     * @ordered
     */
    protected EList<EnvironmentVariable> environment;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NodeTemplateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.NODE_TEMPLATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNode_template_name() {
        return node_template_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNode_template_name(String newNode_template_name) {
        String oldNode_template_name = node_template_name;
        node_template_name = newNode_template_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_NAME, oldNode_template_name, node_template_name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.NODE_TEMPLATE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Interface> getInterfaces() {
        if (interfaces == null) {
            interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, ToscaPackage.NODE_TEMPLATE__INTERFACES);
        }
        return interfaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.NODE_TEMPLATE__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<Property>(Property.class, this, ToscaPackage.NODE_TEMPLATE__PROPERTIES);
        }
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Argument> getArguments() {
        if (arguments == null) {
            arguments = new EObjectContainmentEList<Argument>(Argument.class, this, ToscaPackage.NODE_TEMPLATE__ARGUMENTS);
        }
        return arguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FirewallRule> getRules() {
        if (rules == null) {
            rules = new EObjectContainmentEList<FirewallRule>(FirewallRule.class, this, ToscaPackage.NODE_TEMPLATE__RULES);
        }
        return rules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonitoringProperty getMonitoring() {
        return monitoring;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMonitoring(MonitoringProperty newMonitoring, NotificationChain msgs) {
        MonitoringProperty oldMonitoring = monitoring;
        monitoring = newMonitoring;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.NODE_TEMPLATE__MONITORING, oldMonitoring, newMonitoring);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMonitoring(MonitoringProperty newMonitoring) {
        if (newMonitoring != monitoring) {
            NotificationChain msgs = null;
            if (monitoring != null)
                msgs = ((InternalEObject)monitoring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.NODE_TEMPLATE__MONITORING, null, msgs);
            if (newMonitoring != null)
                msgs = ((InternalEObject)newMonitoring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.NODE_TEMPLATE__MONITORING, null, msgs);
            msgs = basicSetMonitoring(newMonitoring, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.NODE_TEMPLATE__MONITORING, newMonitoring, newMonitoring));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getPortMapping() {
        if (portMapping == null) {
            portMapping = new EObjectContainmentEList<Property>(Property.class, this, ToscaPackage.NODE_TEMPLATE__PORT_MAPPING);
        }
        return portMapping;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EnvironmentVariable> getEnvironment() {
        if (environment == null) {
            environment = new EObjectContainmentEList<EnvironmentVariable>(EnvironmentVariable.class, this, ToscaPackage.NODE_TEMPLATE__ENVIRONMENT);
        }
        return environment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Requirement> getRequirements() {
        if (requirements == null) {
            requirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, ToscaPackage.NODE_TEMPLATE__REQUIREMENTS);
        }
        return requirements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Relationship> getRelationships() {
        if (relationships == null) {
            relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, ToscaPackage.NODE_TEMPLATE__RELATIONSHIPS);
        }
        return relationships;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Capability> getCapabilities() {
        if (capabilities == null) {
            capabilities = new EObjectContainmentEList<Capability>(Capability.class, this, ToscaPackage.NODE_TEMPLATE__CAPABILITIES);
        }
        return capabilities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Instances getInstances() {
        return instances;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInstances(Instances newInstances, NotificationChain msgs) {
        Instances oldInstances = instances;
        instances = newInstances;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.NODE_TEMPLATE__INSTANCES, oldInstances, newInstances);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstances(Instances newInstances) {
        if (newInstances != instances) {
            NotificationChain msgs = null;
            if (instances != null)
                msgs = ((InternalEObject)instances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.NODE_TEMPLATE__INSTANCES, null, msgs);
            if (newInstances != null)
                msgs = ((InternalEObject)newInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.NODE_TEMPLATE__INSTANCES, null, msgs);
            msgs = basicSetInstances(newInstances, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.NODE_TEMPLATE__INSTANCES, newInstances, newInstances));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Configuration> getConfigurations() {
        if (configurations == null) {
            configurations = new EObjectContainmentEList<Configuration>(Configuration.class, this, ToscaPackage.NODE_TEMPLATE__CONFIGURATIONS);
        }
        return configurations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getResources() {
        if (resources == null) {
            resources = new EDataTypeUniqueEList<String>(String.class, this, ToscaPackage.NODE_TEMPLATE__RESOURCES);
        }
        return resources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ToscaPackage.NODE_TEMPLATE__INTERFACES:
                return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__REQUIREMENTS:
                return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__RELATIONSHIPS:
                return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__CAPABILITIES:
                return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__INSTANCES:
                return basicSetInstances(null, msgs);
            case ToscaPackage.NODE_TEMPLATE__CONFIGURATIONS:
                return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__ARGUMENTS:
                return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__RULES:
                return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__MONITORING:
                return basicSetMonitoring(null, msgs);
            case ToscaPackage.NODE_TEMPLATE__PORT_MAPPING:
                return ((InternalEList<?>)getPortMapping()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__ENVIRONMENT:
                return ((InternalEList<?>)getEnvironment()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_NAME:
                return getNode_template_name();
            case ToscaPackage.NODE_TEMPLATE__TYPE:
                return getType();
            case ToscaPackage.NODE_TEMPLATE__INTERFACES:
                return getInterfaces();
            case ToscaPackage.NODE_TEMPLATE__DESCRIPTION:
                return getDescription();
            case ToscaPackage.NODE_TEMPLATE__PROPERTIES:
                return getProperties();
            case ToscaPackage.NODE_TEMPLATE__REQUIREMENTS:
                return getRequirements();
            case ToscaPackage.NODE_TEMPLATE__RELATIONSHIPS:
                return getRelationships();
            case ToscaPackage.NODE_TEMPLATE__CAPABILITIES:
                return getCapabilities();
            case ToscaPackage.NODE_TEMPLATE__INSTANCES:
                return getInstances();
            case ToscaPackage.NODE_TEMPLATE__CONFIGURATIONS:
                return getConfigurations();
            case ToscaPackage.NODE_TEMPLATE__RESOURCES:
                return getResources();
            case ToscaPackage.NODE_TEMPLATE__ARGUMENTS:
                return getArguments();
            case ToscaPackage.NODE_TEMPLATE__RULES:
                return getRules();
            case ToscaPackage.NODE_TEMPLATE__MONITORING:
                return getMonitoring();
            case ToscaPackage.NODE_TEMPLATE__PORT_MAPPING:
                return getPortMapping();
            case ToscaPackage.NODE_TEMPLATE__ENVIRONMENT:
                return getEnvironment();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_NAME:
                setNode_template_name((String)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__TYPE:
                setType((String)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__INTERFACES:
                getInterfaces().clear();
                getInterfaces().addAll((Collection<? extends Interface>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends Property>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__REQUIREMENTS:
                getRequirements().clear();
                getRequirements().addAll((Collection<? extends Requirement>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__RELATIONSHIPS:
                getRelationships().clear();
                getRelationships().addAll((Collection<? extends Relationship>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__CAPABILITIES:
                getCapabilities().clear();
                getCapabilities().addAll((Collection<? extends Capability>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__INSTANCES:
                setInstances((Instances)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__CONFIGURATIONS:
                getConfigurations().clear();
                getConfigurations().addAll((Collection<? extends Configuration>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__RESOURCES:
                getResources().clear();
                getResources().addAll((Collection<? extends String>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__ARGUMENTS:
                getArguments().clear();
                getArguments().addAll((Collection<? extends Argument>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__RULES:
                getRules().clear();
                getRules().addAll((Collection<? extends FirewallRule>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__MONITORING:
                setMonitoring((MonitoringProperty)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__PORT_MAPPING:
                getPortMapping().clear();
                getPortMapping().addAll((Collection<? extends Property>)newValue);
                return;
            case ToscaPackage.NODE_TEMPLATE__ENVIRONMENT:
                getEnvironment().clear();
                getEnvironment().addAll((Collection<? extends EnvironmentVariable>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_NAME:
                setNode_template_name(NODE_TEMPLATE_NAME_EDEFAULT);
                return;
            case ToscaPackage.NODE_TEMPLATE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case ToscaPackage.NODE_TEMPLATE__INTERFACES:
                getInterfaces().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case ToscaPackage.NODE_TEMPLATE__PROPERTIES:
                getProperties().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__REQUIREMENTS:
                getRequirements().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__RELATIONSHIPS:
                getRelationships().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__CAPABILITIES:
                getCapabilities().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__INSTANCES:
                setInstances((Instances)null);
                return;
            case ToscaPackage.NODE_TEMPLATE__CONFIGURATIONS:
                getConfigurations().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__RESOURCES:
                getResources().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__ARGUMENTS:
                getArguments().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__RULES:
                getRules().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__MONITORING:
                setMonitoring((MonitoringProperty)null);
                return;
            case ToscaPackage.NODE_TEMPLATE__PORT_MAPPING:
                getPortMapping().clear();
                return;
            case ToscaPackage.NODE_TEMPLATE__ENVIRONMENT:
                getEnvironment().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ToscaPackage.NODE_TEMPLATE__NODE_TEMPLATE_NAME:
                return NODE_TEMPLATE_NAME_EDEFAULT == null ? node_template_name != null : !NODE_TEMPLATE_NAME_EDEFAULT.equals(node_template_name);
            case ToscaPackage.NODE_TEMPLATE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case ToscaPackage.NODE_TEMPLATE__INTERFACES:
                return interfaces != null && !interfaces.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case ToscaPackage.NODE_TEMPLATE__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__REQUIREMENTS:
                return requirements != null && !requirements.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__RELATIONSHIPS:
                return relationships != null && !relationships.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__CAPABILITIES:
                return capabilities != null && !capabilities.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__INSTANCES:
                return instances != null;
            case ToscaPackage.NODE_TEMPLATE__CONFIGURATIONS:
                return configurations != null && !configurations.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__RESOURCES:
                return resources != null && !resources.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__ARGUMENTS:
                return arguments != null && !arguments.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__RULES:
                return rules != null && !rules.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__MONITORING:
                return monitoring != null;
            case ToscaPackage.NODE_TEMPLATE__PORT_MAPPING:
                return portMapping != null && !portMapping.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__ENVIRONMENT:
                return environment != null && !environment.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (node_template_name: ");
        result.append(node_template_name);
        result.append(", type: ");
        result.append(type);
        result.append(", description: ");
        result.append(description);
        result.append(", resources: ");
        result.append(resources);
        result.append(')');
        return result.toString();
    }

} //NodeTemplateImpl
