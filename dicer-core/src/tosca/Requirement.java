/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Requirement#getRequirement_name <em>Requirement name</em>}</li>
 *   <li>{@link tosca.Requirement#getNode <em>Node</em>}</li>
 *   <li>{@link tosca.Requirement#getCapabiity <em>Capabiity</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getRequirement()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='A Requirement describes a dependency of a TOSCA Node Type or Node template which needs to be fulfilled by a matching Capability declared by another TOSCA modelable entity. \nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}\n'"
 * @generated
 */
public interface Requirement extends EObject {
    /**
     * Returns the value of the '<em><b>Requirement name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Requirement name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Requirement name</em>' attribute.
     * @see #setRequirement_name(String)
     * @see tosca.ToscaPackage#getRequirement_Requirement_name()
     * @model id="true" required="true"
     * @generated
     */
    String getRequirement_name();

    /**
     * Sets the value of the '{@link tosca.Requirement#getRequirement_name <em>Requirement name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Requirement name</em>' attribute.
     * @see #getRequirement_name()
     * @generated
     */
    void setRequirement_name(String value);

    /**
     * Returns the value of the '<em><b>Node</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Node</em>' attribute.
     * @see #setNode(String)
     * @see tosca.ToscaPackage#getRequirement_Node()
     * @model
     * @generated
     */
    String getNode();

    /**
     * Sets the value of the '{@link tosca.Requirement#getNode <em>Node</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Node</em>' attribute.
     * @see #getNode()
     * @generated
     */
    void setNode(String value);

    /**
     * Returns the value of the '<em><b>Capabiity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capabiity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capabiity</em>' attribute.
     * @see #setCapabiity(String)
     * @see tosca.ToscaPackage#getRequirement_Capabiity()
     * @model required="true"
     * @generated
     */
    String getCapabiity();

    /**
     * Sets the value of the '{@link tosca.Requirement#getCapabiity <em>Capabiity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capabiity</em>' attribute.
     * @see #getCapabiity()
     * @generated
     */
    void setCapabiity(String value);

} // Requirement
