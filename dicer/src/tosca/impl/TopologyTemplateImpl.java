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

import tosca.Group;
import tosca.Import;
import tosca.NodeTemplate;
import tosca.Parameter;
import tosca.Policy;
import tosca.Relationship;
import tosca.TopologyTemplate;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topology Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.TopologyTemplateImpl#getTosca_definitions_version <em>Tosca definitions version</em>}</li>
 *   <li>{@link tosca.impl.TopologyTemplateImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link tosca.impl.TopologyTemplateImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link tosca.impl.TopologyTemplateImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link tosca.impl.TopologyTemplateImpl#getNodeTemplates <em>Node Templates</em>}</li>
 *   <li>{@link tosca.impl.TopologyTemplateImpl#getRealtionships <em>Realtionships</em>}</li>
 *   <li>{@link tosca.impl.TopologyTemplateImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link tosca.impl.TopologyTemplateImpl#getPolicies <em>Policies</em>}</li>
 *   <li>{@link tosca.impl.TopologyTemplateImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologyTemplateImpl extends MinimalEObjectImpl.Container implements TopologyTemplate {
    /**
     * The default value of the '{@link #getTosca_definitions_version() <em>Tosca definitions version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTosca_definitions_version()
     * @generated
     * @ordered
     */
    protected static final String TOSCA_DEFINITIONS_VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTosca_definitions_version() <em>Tosca definitions version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTosca_definitions_version()
     * @generated
     * @ordered
     */
    protected String tosca_definitions_version = TOSCA_DEFINITIONS_VERSION_EDEFAULT;

    /**
     * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImports()
     * @generated
     * @ordered
     */
    protected EList<Import> imports;

    /**
     * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputs()
     * @generated
     * @ordered
     */
    protected EList<Parameter> outputs;

    /**
     * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputs()
     * @generated
     * @ordered
     */
    protected EList<Parameter> inputs;

    /**
     * The cached value of the '{@link #getNodeTemplates() <em>Node Templates</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNodeTemplates()
     * @generated
     * @ordered
     */
    protected EList<NodeTemplate> nodeTemplates;

    /**
     * The cached value of the '{@link #getRealtionships() <em>Realtionships</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealtionships()
     * @generated
     * @ordered
     */
    protected EList<Relationship> realtionships;

    /**
     * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroups()
     * @generated
     * @ordered
     */
    protected EList<Group> groups;

    /**
     * The cached value of the '{@link #getPolicies() <em>Policies</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPolicies()
     * @generated
     * @ordered
     */
    protected EList<Policy> policies;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TopologyTemplateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.TOPOLOGY_TEMPLATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTosca_definitions_version() {
        return tosca_definitions_version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTosca_definitions_version(String newTosca_definitions_version) {
        String oldTosca_definitions_version = tosca_definitions_version;
        tosca_definitions_version = newTosca_definitions_version;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOPOLOGY_TEMPLATE__TOSCA_DEFINITIONS_VERSION, oldTosca_definitions_version, tosca_definitions_version));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Import> getImports() {
        if (imports == null) {
            imports = new EObjectContainmentEList<Import>(Import.class, this, ToscaPackage.TOPOLOGY_TEMPLATE__IMPORTS);
        }
        return imports;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Parameter> getOutputs() {
        if (outputs == null) {
            outputs = new EObjectContainmentEList<Parameter>(Parameter.class, this, ToscaPackage.TOPOLOGY_TEMPLATE__OUTPUTS);
        }
        return outputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Parameter> getInputs() {
        if (inputs == null) {
            inputs = new EObjectContainmentEList<Parameter>(Parameter.class, this, ToscaPackage.TOPOLOGY_TEMPLATE__INPUTS);
        }
        return inputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NodeTemplate> getNodeTemplates() {
        if (nodeTemplates == null) {
            nodeTemplates = new EObjectContainmentEList<NodeTemplate>(NodeTemplate.class, this, ToscaPackage.TOPOLOGY_TEMPLATE__NODE_TEMPLATES);
        }
        return nodeTemplates;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Relationship> getRealtionships() {
        if (realtionships == null) {
            realtionships = new EObjectContainmentEList<Relationship>(Relationship.class, this, ToscaPackage.TOPOLOGY_TEMPLATE__REALTIONSHIPS);
        }
        return realtionships;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Group> getGroups() {
        if (groups == null) {
            groups = new EObjectContainmentEList<Group>(Group.class, this, ToscaPackage.TOPOLOGY_TEMPLATE__GROUPS);
        }
        return groups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Policy> getPolicies() {
        if (policies == null) {
            policies = new EObjectContainmentEList<Policy>(Policy.class, this, ToscaPackage.TOPOLOGY_TEMPLATE__POLICIES);
        }
        return policies;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TOPOLOGY_TEMPLATE__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ToscaPackage.TOPOLOGY_TEMPLATE__IMPORTS:
                return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
            case ToscaPackage.TOPOLOGY_TEMPLATE__OUTPUTS:
                return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
            case ToscaPackage.TOPOLOGY_TEMPLATE__INPUTS:
                return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
            case ToscaPackage.TOPOLOGY_TEMPLATE__NODE_TEMPLATES:
                return ((InternalEList<?>)getNodeTemplates()).basicRemove(otherEnd, msgs);
            case ToscaPackage.TOPOLOGY_TEMPLATE__REALTIONSHIPS:
                return ((InternalEList<?>)getRealtionships()).basicRemove(otherEnd, msgs);
            case ToscaPackage.TOPOLOGY_TEMPLATE__GROUPS:
                return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
            case ToscaPackage.TOPOLOGY_TEMPLATE__POLICIES:
                return ((InternalEList<?>)getPolicies()).basicRemove(otherEnd, msgs);
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
            case ToscaPackage.TOPOLOGY_TEMPLATE__TOSCA_DEFINITIONS_VERSION:
                return getTosca_definitions_version();
            case ToscaPackage.TOPOLOGY_TEMPLATE__IMPORTS:
                return getImports();
            case ToscaPackage.TOPOLOGY_TEMPLATE__OUTPUTS:
                return getOutputs();
            case ToscaPackage.TOPOLOGY_TEMPLATE__INPUTS:
                return getInputs();
            case ToscaPackage.TOPOLOGY_TEMPLATE__NODE_TEMPLATES:
                return getNodeTemplates();
            case ToscaPackage.TOPOLOGY_TEMPLATE__REALTIONSHIPS:
                return getRealtionships();
            case ToscaPackage.TOPOLOGY_TEMPLATE__GROUPS:
                return getGroups();
            case ToscaPackage.TOPOLOGY_TEMPLATE__POLICIES:
                return getPolicies();
            case ToscaPackage.TOPOLOGY_TEMPLATE__DESCRIPTION:
                return getDescription();
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
            case ToscaPackage.TOPOLOGY_TEMPLATE__TOSCA_DEFINITIONS_VERSION:
                setTosca_definitions_version((String)newValue);
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__IMPORTS:
                getImports().clear();
                getImports().addAll((Collection<? extends Import>)newValue);
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__OUTPUTS:
                getOutputs().clear();
                getOutputs().addAll((Collection<? extends Parameter>)newValue);
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__INPUTS:
                getInputs().clear();
                getInputs().addAll((Collection<? extends Parameter>)newValue);
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__NODE_TEMPLATES:
                getNodeTemplates().clear();
                getNodeTemplates().addAll((Collection<? extends NodeTemplate>)newValue);
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__REALTIONSHIPS:
                getRealtionships().clear();
                getRealtionships().addAll((Collection<? extends Relationship>)newValue);
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__GROUPS:
                getGroups().clear();
                getGroups().addAll((Collection<? extends Group>)newValue);
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__POLICIES:
                getPolicies().clear();
                getPolicies().addAll((Collection<? extends Policy>)newValue);
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__DESCRIPTION:
                setDescription((String)newValue);
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
            case ToscaPackage.TOPOLOGY_TEMPLATE__TOSCA_DEFINITIONS_VERSION:
                setTosca_definitions_version(TOSCA_DEFINITIONS_VERSION_EDEFAULT);
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__IMPORTS:
                getImports().clear();
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__OUTPUTS:
                getOutputs().clear();
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__INPUTS:
                getInputs().clear();
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__NODE_TEMPLATES:
                getNodeTemplates().clear();
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__REALTIONSHIPS:
                getRealtionships().clear();
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__GROUPS:
                getGroups().clear();
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__POLICIES:
                getPolicies().clear();
                return;
            case ToscaPackage.TOPOLOGY_TEMPLATE__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
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
            case ToscaPackage.TOPOLOGY_TEMPLATE__TOSCA_DEFINITIONS_VERSION:
                return TOSCA_DEFINITIONS_VERSION_EDEFAULT == null ? tosca_definitions_version != null : !TOSCA_DEFINITIONS_VERSION_EDEFAULT.equals(tosca_definitions_version);
            case ToscaPackage.TOPOLOGY_TEMPLATE__IMPORTS:
                return imports != null && !imports.isEmpty();
            case ToscaPackage.TOPOLOGY_TEMPLATE__OUTPUTS:
                return outputs != null && !outputs.isEmpty();
            case ToscaPackage.TOPOLOGY_TEMPLATE__INPUTS:
                return inputs != null && !inputs.isEmpty();
            case ToscaPackage.TOPOLOGY_TEMPLATE__NODE_TEMPLATES:
                return nodeTemplates != null && !nodeTemplates.isEmpty();
            case ToscaPackage.TOPOLOGY_TEMPLATE__REALTIONSHIPS:
                return realtionships != null && !realtionships.isEmpty();
            case ToscaPackage.TOPOLOGY_TEMPLATE__GROUPS:
                return groups != null && !groups.isEmpty();
            case ToscaPackage.TOPOLOGY_TEMPLATE__POLICIES:
                return policies != null && !policies.isEmpty();
            case ToscaPackage.TOPOLOGY_TEMPLATE__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
        result.append(" (tosca_definitions_version: ");
        result.append(tosca_definitions_version);
        result.append(", description: ");
        result.append(description);
        result.append(')');
        return result.toString();
    }

} //TopologyTemplateImpl
