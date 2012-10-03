/**
 */
package fr.obeo.ariadne.model.code;

import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.Component#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Component#getClasspathEntries <em>Classpath Entries</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Component#getResourcesContainers <em>Resources Containers</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Component#getReferenceDependencies <em>Reference Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.Component#getContainmentDependencies <em>Containment Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see fr.obeo.ariadne.model.code.CodePackage#getComponent_Identifier()
   * @model unique="false"
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.Component#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Classpath Entries</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.ClasspathEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classpath Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classpath Entries</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getComponent_ClasspathEntries()
   * @model containment="true"
   * @generated
   */
  EList<ClasspathEntry> getClasspathEntries();

  /**
   * Returns the value of the '<em><b>Resources Containers</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.ResourcesContainer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources Containers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources Containers</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getComponent_ResourcesContainers()
   * @model containment="true"
   * @generated
   */
  EList<ResourcesContainer> getResourcesContainers();

  /**
   * Returns the value of the '<em><b>Reference Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.ReferenceDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Dependencies</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getComponent_ReferenceDependencies()
   * @model containment="true"
   * @generated
   */
  EList<ReferenceDependency> getReferenceDependencies();

  /**
   * Returns the value of the '<em><b>Containment Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.ContainmentDependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Containment Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Containment Dependencies</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getComponent_ContainmentDependencies()
   * @model containment="true"
   * @generated
   */
  EList<ContainmentDependency> getContainmentDependencies();

} // Component
