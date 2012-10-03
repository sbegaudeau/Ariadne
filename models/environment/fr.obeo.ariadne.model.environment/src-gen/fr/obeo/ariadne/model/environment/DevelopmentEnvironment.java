/**
 */
package fr.obeo.ariadne.model.environment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Development Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.environment.DevelopmentEnvironment#getDevelopmentTools <em>Development Tools</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.environment.EnvironmentPackage#getDevelopmentEnvironment()
 * @model
 * @generated
 */
public interface DevelopmentEnvironment extends Environment
{
  /**
   * Returns the value of the '<em><b>Development Tools</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.environment.DevelopmentTool}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Development Tools</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Development Tools</em>' containment reference list.
   * @see fr.obeo.ariadne.model.environment.EnvironmentPackage#getDevelopmentEnvironment_DevelopmentTools()
   * @model containment="true"
   * @generated
   */
  EList<DevelopmentTool> getDevelopmentTools();

} // DevelopmentEnvironment
