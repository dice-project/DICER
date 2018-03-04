/**
 */
package tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Configuration#getProperty_name <em>Property name</em>}</li>
 *   <li>{@link tosca.Configuration#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
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
	 * @see tosca.ToscaPackage#getConfiguration_Property_name()
	 * @model unique="false" required="true"
	 * @generated
	 */
    String getProperty_name();

    /**
	 * Sets the value of the '{@link tosca.Configuration#getProperty_name <em>Property name</em>}' attribute.
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
	 * @see tosca.ToscaPackage#getConfiguration_Value()
	 * @model required="true"
	 * @generated
	 */
    String getValue();

    /**
	 * Sets the value of the '{@link tosca.Configuration#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
    void setValue(String value);

} // Configuration
