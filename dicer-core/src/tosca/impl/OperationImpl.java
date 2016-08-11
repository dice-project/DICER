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

import tosca.Operation;
import tosca.Property;
import tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tosca.impl.OperationImpl#getOperation_name <em>Operation name</em>}</li>
 *   <li>{@link tosca.impl.OperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tosca.impl.OperationImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link tosca.impl.OperationImpl#getDependentArtifacts <em>Dependent Artifacts</em>}</li>
 *   <li>{@link tosca.impl.OperationImpl#getPrimary <em>Primary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
    /**
     * The default value of the '{@link #getOperation_name() <em>Operation name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperation_name()
     * @generated
     * @ordered
     */
    protected static final String OPERATION_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOperation_name() <em>Operation name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperation_name()
     * @generated
     * @ordered
     */
    protected String operation_name = OPERATION_NAME_EDEFAULT;

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
     * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputs()
     * @generated
     * @ordered
     */
    protected EList<Property> inputs;

    /**
     * The cached value of the '{@link #getDependentArtifacts() <em>Dependent Artifacts</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDependentArtifacts()
     * @generated
     * @ordered
     */
    protected EList<String> dependentArtifacts;

    /**
     * The default value of the '{@link #getPrimary() <em>Primary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrimary()
     * @generated
     * @ordered
     */
    protected static final String PRIMARY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrimary() <em>Primary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrimary()
     * @generated
     * @ordered
     */
    protected String primary = PRIMARY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ToscaPackage.Literals.OPERATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOperation_name() {
        return operation_name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperation_name(String newOperation_name) {
        String oldOperation_name = operation_name;
        operation_name = newOperation_name;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.OPERATION__OPERATION_NAME, oldOperation_name, operation_name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.OPERATION__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Property> getInputs() {
        if (inputs == null) {
            inputs = new EObjectContainmentEList<Property>(Property.class, this, ToscaPackage.OPERATION__INPUTS);
        }
        return inputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getDependentArtifacts() {
        if (dependentArtifacts == null) {
            dependentArtifacts = new EDataTypeUniqueEList<String>(String.class, this, ToscaPackage.OPERATION__DEPENDENT_ARTIFACTS);
        }
        return dependentArtifacts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPrimary() {
        return primary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrimary(String newPrimary) {
        String oldPrimary = primary;
        primary = newPrimary;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.OPERATION__PRIMARY, oldPrimary, primary));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ToscaPackage.OPERATION__INPUTS:
                return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
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
            case ToscaPackage.OPERATION__OPERATION_NAME:
                return getOperation_name();
            case ToscaPackage.OPERATION__DESCRIPTION:
                return getDescription();
            case ToscaPackage.OPERATION__INPUTS:
                return getInputs();
            case ToscaPackage.OPERATION__DEPENDENT_ARTIFACTS:
                return getDependentArtifacts();
            case ToscaPackage.OPERATION__PRIMARY:
                return getPrimary();
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
            case ToscaPackage.OPERATION__OPERATION_NAME:
                setOperation_name((String)newValue);
                return;
            case ToscaPackage.OPERATION__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case ToscaPackage.OPERATION__INPUTS:
                getInputs().clear();
                getInputs().addAll((Collection<? extends Property>)newValue);
                return;
            case ToscaPackage.OPERATION__DEPENDENT_ARTIFACTS:
                getDependentArtifacts().clear();
                getDependentArtifacts().addAll((Collection<? extends String>)newValue);
                return;
            case ToscaPackage.OPERATION__PRIMARY:
                setPrimary((String)newValue);
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
            case ToscaPackage.OPERATION__OPERATION_NAME:
                setOperation_name(OPERATION_NAME_EDEFAULT);
                return;
            case ToscaPackage.OPERATION__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case ToscaPackage.OPERATION__INPUTS:
                getInputs().clear();
                return;
            case ToscaPackage.OPERATION__DEPENDENT_ARTIFACTS:
                getDependentArtifacts().clear();
                return;
            case ToscaPackage.OPERATION__PRIMARY:
                setPrimary(PRIMARY_EDEFAULT);
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
            case ToscaPackage.OPERATION__OPERATION_NAME:
                return OPERATION_NAME_EDEFAULT == null ? operation_name != null : !OPERATION_NAME_EDEFAULT.equals(operation_name);
            case ToscaPackage.OPERATION__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case ToscaPackage.OPERATION__INPUTS:
                return inputs != null && !inputs.isEmpty();
            case ToscaPackage.OPERATION__DEPENDENT_ARTIFACTS:
                return dependentArtifacts != null && !dependentArtifacts.isEmpty();
            case ToscaPackage.OPERATION__PRIMARY:
                return PRIMARY_EDEFAULT == null ? primary != null : !PRIMARY_EDEFAULT.equals(primary);
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
        result.append(" (operation_name: ");
        result.append(operation_name);
        result.append(", description: ");
        result.append(description);
        result.append(", dependentArtifacts: ");
        result.append(dependentArtifacts);
        result.append(", primary: ");
        result.append(primary);
        result.append(')');
        return result.toString();
    }

} //OperationImpl
