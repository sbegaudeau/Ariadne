/**
 */
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.ClasspathEntry;
import fr.obeo.ariadne.model.code.ClasspathEntryKind;
import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.TypesContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classpath Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ClasspathEntryImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ClasspathEntryImpl#getInputFolder <em>Input Folder</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ClasspathEntryImpl#getOutputFolder <em>Output Folder</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ClasspathEntryImpl#getTypesContainers <em>Types Containers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClasspathEntryImpl extends MinimalEObjectImpl.Container implements ClasspathEntry
{
  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final ClasspathEntryKind KIND_EDEFAULT = ClasspathEntryKind.SOURCE;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected ClasspathEntryKind kind = KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getInputFolder() <em>Input Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputFolder()
   * @generated
   * @ordered
   */
  protected static final String INPUT_FOLDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInputFolder() <em>Input Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputFolder()
   * @generated
   * @ordered
   */
  protected String inputFolder = INPUT_FOLDER_EDEFAULT;

  /**
   * The default value of the '{@link #getOutputFolder() <em>Output Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputFolder()
   * @generated
   * @ordered
   */
  protected static final String OUTPUT_FOLDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutputFolder() <em>Output Folder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputFolder()
   * @generated
   * @ordered
   */
  protected String outputFolder = OUTPUT_FOLDER_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypesContainers() <em>Types Containers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypesContainers()
   * @generated
   * @ordered
   */
  protected EList<TypesContainer> typesContainers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClasspathEntryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CodePackage.Literals.CLASSPATH_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClasspathEntryKind getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(ClasspathEntryKind newKind)
  {
    ClasspathEntryKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CLASSPATH_ENTRY__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInputFolder()
  {
    return inputFolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputFolder(String newInputFolder)
  {
    String oldInputFolder = inputFolder;
    inputFolder = newInputFolder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CLASSPATH_ENTRY__INPUT_FOLDER, oldInputFolder, inputFolder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutputFolder()
  {
    return outputFolder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputFolder(String newOutputFolder)
  {
    String oldOutputFolder = outputFolder;
    outputFolder = newOutputFolder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CLASSPATH_ENTRY__OUTPUT_FOLDER, oldOutputFolder, outputFolder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypesContainer> getTypesContainers()
  {
    if (typesContainers == null)
    {
      typesContainers = new EObjectContainmentEList<TypesContainer>(TypesContainer.class, this, CodePackage.CLASSPATH_ENTRY__TYPES_CONTAINERS);
    }
    return typesContainers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CodePackage.CLASSPATH_ENTRY__TYPES_CONTAINERS:
        return ((InternalEList<?>)getTypesContainers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CodePackage.CLASSPATH_ENTRY__KIND:
        return getKind();
      case CodePackage.CLASSPATH_ENTRY__INPUT_FOLDER:
        return getInputFolder();
      case CodePackage.CLASSPATH_ENTRY__OUTPUT_FOLDER:
        return getOutputFolder();
      case CodePackage.CLASSPATH_ENTRY__TYPES_CONTAINERS:
        return getTypesContainers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CodePackage.CLASSPATH_ENTRY__KIND:
        setKind((ClasspathEntryKind)newValue);
        return;
      case CodePackage.CLASSPATH_ENTRY__INPUT_FOLDER:
        setInputFolder((String)newValue);
        return;
      case CodePackage.CLASSPATH_ENTRY__OUTPUT_FOLDER:
        setOutputFolder((String)newValue);
        return;
      case CodePackage.CLASSPATH_ENTRY__TYPES_CONTAINERS:
        getTypesContainers().clear();
        getTypesContainers().addAll((Collection<? extends TypesContainer>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CodePackage.CLASSPATH_ENTRY__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case CodePackage.CLASSPATH_ENTRY__INPUT_FOLDER:
        setInputFolder(INPUT_FOLDER_EDEFAULT);
        return;
      case CodePackage.CLASSPATH_ENTRY__OUTPUT_FOLDER:
        setOutputFolder(OUTPUT_FOLDER_EDEFAULT);
        return;
      case CodePackage.CLASSPATH_ENTRY__TYPES_CONTAINERS:
        getTypesContainers().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CodePackage.CLASSPATH_ENTRY__KIND:
        return kind != KIND_EDEFAULT;
      case CodePackage.CLASSPATH_ENTRY__INPUT_FOLDER:
        return INPUT_FOLDER_EDEFAULT == null ? inputFolder != null : !INPUT_FOLDER_EDEFAULT.equals(inputFolder);
      case CodePackage.CLASSPATH_ENTRY__OUTPUT_FOLDER:
        return OUTPUT_FOLDER_EDEFAULT == null ? outputFolder != null : !OUTPUT_FOLDER_EDEFAULT.equals(outputFolder);
      case CodePackage.CLASSPATH_ENTRY__TYPES_CONTAINERS:
        return typesContainers != null && !typesContainers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (kind: ");
    result.append(kind);
    result.append(", inputFolder: ");
    result.append(inputFolder);
    result.append(", outputFolder: ");
    result.append(outputFolder);
    result.append(')');
    return result.toString();
  }

} //ClasspathEntryImpl
