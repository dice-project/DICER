/**
 */
package tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tosca.Group#getGroup_name <em>Group name</em>}</li>
 *   <li>{@link tosca.Group#getType <em>Type</em>}</li>
 *   <li>{@link tosca.Group#getDescription <em>Description</em>}</li>
 *   <li>{@link tosca.Group#getProperties <em>Properties</em>}</li>
 *   <li>{@link tosca.Group#getTargets <em>Targets</em>}</li>
 *   <li>{@link tosca.Group#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see tosca.ToscaPackage#getGroup()
 * @model annotation="http://es.unizar.disco/dice/profiles/generator description='A group definition defines a logical grouping of node templates, typically for management purposes.\nFor the accurate description refer to the TOSCA standard document \\cite{toscayaml}\n'"
 * @generated
 */
public interface Group extends EObject {
    /**
     * Returns the value of the '<em><b>Group name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group name</em>' attribute.
     * @see #setGroup_name(String)
     * @see tosca.ToscaPackage#getGroup_Group_name()
     * @model id="true" required="true"
     * @generated
     */
    String getGroup_name();

    /**
     * Sets the value of the '{@link tosca.Group#getGroup_name <em>Group name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group name</em>' attribute.
     * @see #getGroup_name()
     * @generated
     */
    void setGroup_name(String value);

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
     * @see tosca.ToscaPackage#getGroup_Type()
     * @model required="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link tosca.Group#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

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
     * @see tosca.ToscaPackage#getGroup_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link tosca.Group#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference.
     * @see #setProperties(Property)
     * @see tosca.ToscaPackage#getGroup_Properties()
     * @model containment="true"
     * @generated
     */
    Property getProperties();

    /**
     * Sets the value of the '{@link tosca.Group#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
    void setProperties(Property value);

    /**
     * Returns the value of the '<em><b>Targets</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Targets</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Targets</em>' attribute list.
     * @see tosca.ToscaPackage#getGroup_Targets()
     * @model
     * @generated
     */
    EList<String> getTargets();

    /**
     * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
     * The list contents are of type {@link tosca.Interface}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interfaces</em>' containment reference list.
     * @see tosca.ToscaPackage#getGroup_Interfaces()
     * @model containment="true"
     * @generated
     */
    EList<Interface> getInterfaces();

} // Group
