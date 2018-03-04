/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Instances#getDeploy <em>Deploy</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getInstances()
 * @model
 * @generated
 */
public interface Instances extends EObject {
    /**
	 * Returns the value of the '<em><b>Deploy</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deploy</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy</em>' attribute.
	 * @see #setDeploy(Integer)
	 * @see tosca.ToscaPackage#getInstances_Deploy()
	 * @model
	 * @generated
	 */
    Integer getDeploy();

    /**
	 * Sets the value of the '{@link tosca.Instances#getDeploy <em>Deploy</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy</em>' attribute.
	 * @see #getDeploy()
	 * @generated
	 */
    void setDeploy(Integer value);

} // Instances
