/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Operation#getOperation_name <em>Operation name</em>}</li>
 *   <li>{@link tosca.Operation#getDescription <em>Description</em>}</li>
 *   <li>{@link tosca.Operation#getInputs <em>Inputs</em>}</li>
 *   <li>{@link tosca.Operation#getDependentArtifacts <em>Dependent Artifacts</em>}</li>
 *   <li>{@link tosca.Operation#getPrimary <em>Primary</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getOperation()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='An operation defines a named function or procedure that can be bound to an implementation artifact (e.g., a script).\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}.'"
 * @generated
 */
public interface Operation extends EObject {
    /**
     * Returns the value of the '<em><b>Operation name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation name</em>' attribute.
     * @see #setOperation_name(String)
     * @see tosca.ToscaPackage#getOperation_Operation_name()
     * @model
     * @generated
     */
    String getOperation_name();

    /**
     * Sets the value of the '{@link tosca.Operation#getOperation_name <em>Operation name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation name</em>' attribute.
     * @see #getOperation_name()
     * @generated
     */
    void setOperation_name(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see tosca.ToscaPackage#getOperation_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link tosca.Operation#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

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
     * @see tosca.ToscaPackage#getOperation_Inputs()
     * @model containment="true"
     * @generated
     */
    EList<Property> getInputs();

    /**
     * Returns the value of the '<em><b>Dependent Artifacts</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependent Artifacts</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dependent Artifacts</em>' attribute list.
     * @see tosca.ToscaPackage#getOperation_DependentArtifacts()
     * @model
     * @generated
     */
    EList<String> getDependentArtifacts();

    /**
     * Returns the value of the '<em><b>Primary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Primary</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Primary</em>' attribute.
     * @see #setPrimary(String)
     * @see tosca.ToscaPackage#getOperation_Primary()
     * @model
     * @generated
     */
    String getPrimary();

    /**
     * Sets the value of the '{@link tosca.Operation#getPrimary <em>Primary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Primary</em>' attribute.
     * @see #getPrimary()
     * @generated
     */
    void setPrimary(String value);

} // Operation
