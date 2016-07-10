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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tosca.Attribute;
import tosca.Capability;
import tosca.Interface;
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
 *   <li>{@link tosca.impl.NodeTemplateImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link tosca.impl.NodeTemplateImpl#getCapabilities <em>Capabilities</em>}</li>
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
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<Attribute> attributes;

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
    public EList<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ToscaPackage.NODE_TEMPLATE__ATTRIBUTES);
        }
        return attributes;
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
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ToscaPackage.NODE_TEMPLATE__INTERFACES:
                return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__REQUIREMENTS:
                return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__RELATIONSHIPS:
                return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
            case ToscaPackage.NODE_TEMPLATE__CAPABILITIES:
                return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
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
            case ToscaPackage.NODE_TEMPLATE__ATTRIBUTES:
                return getAttributes();
            case ToscaPackage.NODE_TEMPLATE__REQUIREMENTS:
                return getRequirements();
            case ToscaPackage.NODE_TEMPLATE__RELATIONSHIPS:
                return getRelationships();
            case ToscaPackage.NODE_TEMPLATE__CAPABILITIES:
                return getCapabilities();
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
            case ToscaPackage.NODE_TEMPLATE__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends Attribute>)newValue);
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
            case ToscaPackage.NODE_TEMPLATE__ATTRIBUTES:
                getAttributes().clear();
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
            case ToscaPackage.NODE_TEMPLATE__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__REQUIREMENTS:
                return requirements != null && !requirements.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__RELATIONSHIPS:
                return relationships != null && !relationships.isEmpty();
            case ToscaPackage.NODE_TEMPLATE__CAPABILITIES:
                return capabilities != null && !capabilities.isEmpty();
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
        result.append(')');
        return result.toString();
    }

} //NodeTemplateImpl
