/**
 */
package fr.obeo.ariadne.model.code;

import fr.obeo.ariadne.model.core.VersionedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.TypesContainer#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.TypesContainer#getTypesContainers <em>Types Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getTypesContainer()
 * @model
 * @generated
 */
public interface TypesContainer extends VersionedElement
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getTypesContainer_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

  /**
   * Returns the value of the '<em><b>Types Containers</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.TypesContainer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types Containers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types Containers</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getTypesContainer_TypesContainers()
   * @model containment="true"
   * @generated
   */
  EList<TypesContainer> getTypesContainers();

} // TypesContainer
