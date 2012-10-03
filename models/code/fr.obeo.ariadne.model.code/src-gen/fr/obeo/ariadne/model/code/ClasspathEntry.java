/**
 */
package fr.obeo.ariadne.model.code;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classpath Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.ClasspathEntry#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.ClasspathEntry#getInputFolder <em>Input Folder</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.ClasspathEntry#getOutputFolder <em>Output Folder</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.ClasspathEntry#getTypesContainers <em>Types Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getClasspathEntry()
 * @model
 * @generated
 */
public interface ClasspathEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link fr.obeo.ariadne.model.code.ClasspathEntryKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see fr.obeo.ariadne.model.code.ClasspathEntryKind
   * @see #setKind(ClasspathEntryKind)
   * @see fr.obeo.ariadne.model.code.CodePackage#getClasspathEntry_Kind()
   * @model unique="false"
   * @generated
   */
  ClasspathEntryKind getKind();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.ClasspathEntry#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see fr.obeo.ariadne.model.code.ClasspathEntryKind
   * @see #getKind()
   * @generated
   */
  void setKind(ClasspathEntryKind value);

  /**
   * Returns the value of the '<em><b>Input Folder</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Folder</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Folder</em>' attribute.
   * @see #setInputFolder(String)
   * @see fr.obeo.ariadne.model.code.CodePackage#getClasspathEntry_InputFolder()
   * @model unique="false"
   * @generated
   */
  String getInputFolder();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.ClasspathEntry#getInputFolder <em>Input Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Folder</em>' attribute.
   * @see #getInputFolder()
   * @generated
   */
  void setInputFolder(String value);

  /**
   * Returns the value of the '<em><b>Output Folder</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Folder</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Folder</em>' attribute.
   * @see #setOutputFolder(String)
   * @see fr.obeo.ariadne.model.code.CodePackage#getClasspathEntry_OutputFolder()
   * @model unique="false"
   * @generated
   */
  String getOutputFolder();

  /**
   * Sets the value of the '{@link fr.obeo.ariadne.model.code.ClasspathEntry#getOutputFolder <em>Output Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Folder</em>' attribute.
   * @see #getOutputFolder()
   * @generated
   */
  void setOutputFolder(String value);

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
   * @see fr.obeo.ariadne.model.code.CodePackage#getClasspathEntry_TypesContainers()
   * @model containment="true"
   * @generated
   */
  EList<TypesContainer> getTypesContainers();

} // ClasspathEntry
