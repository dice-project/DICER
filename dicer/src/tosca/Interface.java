/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Interface#getInterface_name <em>Interface name</em>}</li>
 *   <li>{@link tosca.Interface#getOperations <em>Operations</em>}</li>
 *   <li>{@link tosca.Interface#getInputs <em>Inputs</em>}</li>
 *   <li>{@link tosca.Interface#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getInterface()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='An interface defines a named interface that can be associated with a Node or Relationship Type.\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}'"
 * @generated
 */
public interface Interface extends EObject {
    /**
     * Returns the value of the '<em><b>Interface name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interface name</em>' attribute.
     * @see #setInterface_name(String)
     * @see tosca.ToscaPackage#getInterface_Interface_name()
     * @model
     * @generated
     */
    String getInterface_name();

    /**
     * Sets the value of the '{@link tosca.Interface#getInterface_name <em>Interface name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interface name</em>' attribute.
     * @see #getInterface_name()
     * @generated
     */
    void setInterface_name(String value);

    /**
     * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Operation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operations</em>' containment reference list.
     * @see tosca.ToscaPackage#getInterface_Operations()
     * @model containment="true"
     * @generated
     */
    EList<Operation> getOperations();

    /**
     * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inputs</em>' containment reference list.
     * @see tosca.ToscaPackage#getInterface_Inputs()
     * @model containment="true"
     * @generated
     */
    EList<Property> getInputs();

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
     * @see tosca.ToscaPackage#getInterface_Type()
     * @model required="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link tosca.Interface#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // Interface
