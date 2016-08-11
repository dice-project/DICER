/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Property#getProperty_name <em>Property name</em>}</li>
 *   <li>{@link tosca.Property#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getProperty()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='value desr' exclude=''"
 * @generated
 */
public interface Property extends EObject {
    /**
     * Returns the value of the '<em><b>Property name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property name</em>' attribute.
     * @see #setProperty_name(String)
     * @see tosca.ToscaPackage#getProperty_Property_name()
     * @model unique="false" required="true"
     * @generated
     */
    String getProperty_name();

    /**
     * Sets the value of the '{@link tosca.Property#getProperty_name <em>Property name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property name</em>' attribute.
     * @see #getProperty_name()
     * @generated
     */
    void setProperty_name(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see tosca.ToscaPackage#getProperty_Value()
     * @model required="true"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link tosca.Property#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // Property
