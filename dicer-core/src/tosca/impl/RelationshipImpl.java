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
import tosca.Interface;
import tosca.Property;
import tosca.Relationship;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.RelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link tosca.impl.RelationshipImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link tosca.impl.RelationshipImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link tosca.impl.RelationshipImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link tosca.impl.RelationshipImpl#getSource_interfaces <em>Source interfaces</em>}</li>
 *   <li>{@link tosca.impl.RelationshipImpl#getTarget_interfaces <em>Target interfaces</em>}</li>
 *   <li>{@link tosca.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link tosca.impl.RelationshipImpl#getRelationship_name <em>Relationship name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship {
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
     * The cached value of the '{@link #getSource_interfaces() <em>Source interfaces</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource_interfaces()
     * @generated
     * @ordered
     */
    protected EList<Interface> source_interfaces;

    /**
     * The cached value of the '{@link #getTarget_interfaces() <em>Target interfaces</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget_interfaces()
     * @generated
     * @ordered
     */
    protected EList<Interface> target_interfaces;

    /**
     * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected static final String TARGET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected String target = TARGET_EDEFAULT;

    /**
     * The default value of the '{@link #getRelationship_name() <em>Relationship name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelationship_name()
     * @generated
     * @ordered
     */
    protected static final String RELATIONSHIP_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRelationship_name() <em>Relationship name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelationship_name()
     * @generated
     * @ordered
     */
    protected String relationship_name = RELATIONSHIP_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationshipImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.RELATIONSHIP;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.RELATIONSHIP__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Interface> getInterfaces() {
        if (interfaces == null) {
            interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, ToscaPackage.RELATIONSHIP__INTERFACES);
        }
        return interfaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getProperties() {
        if (properties == null) {
            properties = new EObjectContainmentEList<Property>(Property.class, this, ToscaPackage.RELATIONSHIP__PROPERTIES);
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
            attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, ToscaPackage.RELATIONSHIP__ATTRIBUTES);
        }
        return attributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Interface> getSource_interfaces() {
        if (source_interfaces == null) {
            source_interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, ToscaPackage.RELATIONSHIP__SOURCE_INTERFACES);
        }
        return source_interfaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Interface> getTarget_interfaces() {
        if (target_interfaces == null) {
            target_interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, ToscaPackage.RELATIONSHIP__TARGET_INTERFACES);
        }
        return target_interfaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(String newTarget) {
        String oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.RELATIONSHIP__TARGET, oldTarget, target));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRelationship_name() {
        return relationship_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRelationship_name(String newRelationship_name) {
        String oldRelationship_name = relationship_name;
        relationship_name = newRelationship_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.RELATIONSHIP__RELATIONSHIP_NAME, oldRelationship_name, relationship_name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ToscaPackage.RELATIONSHIP__INTERFACES:
                return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
            case ToscaPackage.RELATIONSHIP__PROPERTIES:
                return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
            case ToscaPackage.RELATIONSHIP__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
            case ToscaPackage.RELATIONSHIP__SOURCE_INTERFACES:
                return ((InternalEList<?>)getSource_interfaces()).basicRemove(otherEnd, msgs);
            case ToscaPackage.RELATIONSHIP__TARGET_INTERFACES:
                return ((InternalEList<?>)getTarget_interfaces()).basicRemove(otherEnd, msgs);
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
            case ToscaPackage.RELATIONSHIP__TYPE:
                return getType();
            case ToscaPackage.RELATIONSHIP__INTERFACES:
                return getInterfaces();
            case ToscaPackage.RELATIONSHIP__PROPERTIES:
                return getProperties();
            case ToscaPackage.RELATIONSHIP__ATTRIBUTES:
                return getAttributes();
            case ToscaPackage.RELATIONSHIP__SOURCE_INTERFACES:
                return getSource_interfaces();
            case ToscaPackage.RELATIONSHIP__TARGET_INTERFACES:
                return getTarget_interfaces();
            case ToscaPackage.RELATIONSHIP__TARGET:
                return getTarget();
            case ToscaPackage.RELATIONSHIP__RELATIONSHIP_NAME:
                return getRelationship_name();
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
            case ToscaPackage.RELATIONSHIP__TYPE:
                setType((String)newValue);
                return;
            case ToscaPackage.RELATIONSHIP__INTERFACES:
                getInterfaces().clear();
                getInterfaces().addAll((Collection<? extends Interface>)newValue);
                return;
            case ToscaPackage.RELATIONSHIP__PROPERTIES:
                getProperties().clear();
                getProperties().addAll((Collection<? extends Property>)newValue);
                return;
            case ToscaPackage.RELATIONSHIP__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends Attribute>)newValue);
                return;
            case ToscaPackage.RELATIONSHIP__SOURCE_INTERFACES:
                getSource_interfaces().clear();
                getSource_interfaces().addAll((Collection<? extends Interface>)newValue);
                return;
            case ToscaPackage.RELATIONSHIP__TARGET_INTERFACES:
                getTarget_interfaces().clear();
                getTarget_interfaces().addAll((Collection<? extends Interface>)newValue);
                return;
            case ToscaPackage.RELATIONSHIP__TARGET:
                setTarget((String)newValue);
                return;
            case ToscaPackage.RELATIONSHIP__RELATIONSHIP_NAME:
                setRelationship_name((String)newValue);
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
            case ToscaPackage.RELATIONSHIP__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case ToscaPackage.RELATIONSHIP__INTERFACES:
                getInterfaces().clear();
                return;
            case ToscaPackage.RELATIONSHIP__PROPERTIES:
                getProperties().clear();
                return;
            case ToscaPackage.RELATIONSHIP__ATTRIBUTES:
                getAttributes().clear();
                return;
            case ToscaPackage.RELATIONSHIP__SOURCE_INTERFACES:
                getSource_interfaces().clear();
                return;
            case ToscaPackage.RELATIONSHIP__TARGET_INTERFACES:
                getTarget_interfaces().clear();
                return;
            case ToscaPackage.RELATIONSHIP__TARGET:
                setTarget(TARGET_EDEFAULT);
                return;
            case ToscaPackage.RELATIONSHIP__RELATIONSHIP_NAME:
                setRelationship_name(RELATIONSHIP_NAME_EDEFAULT);
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
            case ToscaPackage.RELATIONSHIP__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case ToscaPackage.RELATIONSHIP__INTERFACES:
                return interfaces != null && !interfaces.isEmpty();
            case ToscaPackage.RELATIONSHIP__PROPERTIES:
                return properties != null && !properties.isEmpty();
            case ToscaPackage.RELATIONSHIP__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
            case ToscaPackage.RELATIONSHIP__SOURCE_INTERFACES:
                return source_interfaces != null && !source_interfaces.isEmpty();
            case ToscaPackage.RELATIONSHIP__TARGET_INTERFACES:
                return target_interfaces != null && !target_interfaces.isEmpty();
            case ToscaPackage.RELATIONSHIP__TARGET:
                return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
            case ToscaPackage.RELATIONSHIP__RELATIONSHIP_NAME:
                return RELATIONSHIP_NAME_EDEFAULT == null ? relationship_name != null : !RELATIONSHIP_NAME_EDEFAULT.equals(relationship_name);
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
        result.append(" (type: ");
        result.append(type);
        result.append(", target: ");
        result.append(target);
        result.append(", relationship_name: ");
        result.append(relationship_name);
        result.append(')');
        return result.toString();
    }

} //RelationshipImpl
