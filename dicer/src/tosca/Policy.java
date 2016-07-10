/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Policy#getPolicy_name <em>Policy name</em>}</li>
 *   <li>{@link tosca.Policy#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getPolicy()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='A policy definition defines a policy that can be associated with a TOSCA topology.\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}\n'"
 * @generated
 */
public interface Policy extends EObject {
    /**
     * Returns the value of the '<em><b>Policy name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Policy name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Policy name</em>' attribute.
     * @see #setPolicy_name(String)
     * @see tosca.ToscaPackage#getPolicy_Policy_name()
     * @model id="true" required="true"
     * @generated
     */
    String getPolicy_name();

    /**
     * Sets the value of the '{@link tosca.Policy#getPolicy_name <em>Policy name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Policy name</em>' attribute.
     * @see #getPolicy_name()
     * @generated
     */
    void setPolicy_name(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see tosca.ToscaPackage#getPolicy_Type()
     * @model required="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link tosca.Policy#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // Policy
