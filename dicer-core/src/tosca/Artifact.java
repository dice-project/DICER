/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link tosca.Artifact#getArtifactUri <em>Artifact Uri</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see tosca.ToscaPackage#getArtifact_Name()
     * @model id="true" required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link tosca.Artifact#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Artifact Uri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Artifact Uri</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Artifact Uri</em>' attribute.
     * @see #setArtifactUri(String)
     * @see tosca.ToscaPackage#getArtifact_ArtifactUri()
     * @model
     * @generated
     */
    String getArtifactUri();

    /**
     * Sets the value of the '{@link tosca.Artifact#getArtifactUri <em>Artifact Uri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Artifact Uri</em>' attribute.
     * @see #getArtifactUri()
     * @generated
     */
    void setArtifactUri(String value);

} // Artifact
