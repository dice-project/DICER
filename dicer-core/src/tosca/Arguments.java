/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Arguments#getAttribute_name <em>Attribute name</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getArguments()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='value desr' exclude=''"
 * @generated
 */
public interface Arguments extends EObject {
    /**
     * Returns the value of the '<em><b>Attribute name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute name</em>' attribute.
     * @see #setAttribute_name(String)
     * @see tosca.ToscaPackage#getArguments_Attribute_name()
     * @model id="true" required="true"
     * @generated
     */
    String getAttribute_name();

    /**
     * Sets the value of the '{@link tosca.Arguments#getAttribute_name <em>Attribute name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute name</em>' attribute.
     * @see #getAttribute_name()
     * @generated
     */
    void setAttribute_name(String value);

} // Arguments
