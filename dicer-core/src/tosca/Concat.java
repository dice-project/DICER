/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Concat#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getConcat()
 * @model
 * @generated
 */
public interface Concat extends Value {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link tosca.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see tosca.ToscaPackage#getConcat_Items()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Value> getItems();

} // Concat
