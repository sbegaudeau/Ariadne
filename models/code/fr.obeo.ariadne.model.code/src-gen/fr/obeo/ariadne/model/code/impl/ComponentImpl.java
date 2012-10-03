/**
 */
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.ClasspathEntry;
import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.Component;
import fr.obeo.ariadne.model.code.ContainmentDependency;
import fr.obeo.ariadne.model.code.ReferenceDependency;
import fr.obeo.ariadne.model.code.ResourcesContainer;

import fr.obeo.ariadne.model.core.impl.VersionedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ComponentImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ComponentImpl#getClasspathEntries <em>Classpath Entries</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ComponentImpl#getResourcesContainers <em>Resources Containers</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ComponentImpl#getReferenceDependencies <em>Reference Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ComponentImpl#getContainmentDependencies <em>Containment Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends VersionedElementImpl implements Component
{
  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getClasspathEntries() <em>Classpath Entries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasspathEntries()
   * @generated
   * @ordered
   */
  protected EList<ClasspathEntry> classpathEntries;

  /**
   * The cached value of the '{@link #getResourcesContainers() <em>Resources Containers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourcesContainers()
   * @generated
   * @ordered
   */
  protected EList<ResourcesContainer> resourcesContainers;

  /**
   * The cached value of the '{@link #getReferenceDependencies() <em>Reference Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceDependencies()
   * @generated
   * @ordered
   */
  protected EList<ReferenceDependency> referenceDependencies;

  /**
   * The cached value of the '{@link #getContainmentDependencies() <em>Containment Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainmentDependencies()
   * @generated
   * @ordered
   */
  protected EList<ContainmentDependency> containmentDependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentImpl()
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
    return CodePackage.Literals.COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.COMPONENT__IDENTIFIER, oldIdentifier, identifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClasspathEntry> getClasspathEntries()
  {
    if (classpathEntries == null)
    {
      classpathEntries = new EObjectContainmentEList<ClasspathEntry>(ClasspathEntry.class, this, CodePackage.COMPONENT__CLASSPATH_ENTRIES);
    }
    return classpathEntries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourcesContainer> getResourcesContainers()
  {
    if (resourcesContainers == null)
    {
      resourcesContainers = new EObjectContainmentEList<ResourcesContainer>(ResourcesContainer.class, this, CodePackage.COMPONENT__RESOURCES_CONTAINERS);
    }
    return resourcesContainers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceDependency> getReferenceDependencies()
  {
    if (referenceDependencies == null)
    {
      referenceDependencies = new EObjectContainmentEList<ReferenceDependency>(ReferenceDependency.class, this, CodePackage.COMPONENT__REFERENCE_DEPENDENCIES);
    }
    return referenceDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContainmentDependency> getContainmentDependencies()
  {
    if (containmentDependencies == null)
    {
      containmentDependencies = new EObjectContainmentEList<ContainmentDependency>(ContainmentDependency.class, this, CodePackage.COMPONENT__CONTAINMENT_DEPENDENCIES);
    }
    return containmentDependencies;
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
      case CodePackage.COMPONENT__CLASSPATH_ENTRIES:
        return ((InternalEList<?>)getClasspathEntries()).basicRemove(otherEnd, msgs);
      case CodePackage.COMPONENT__RESOURCES_CONTAINERS:
        return ((InternalEList<?>)getResourcesContainers()).basicRemove(otherEnd, msgs);
      case CodePackage.COMPONENT__REFERENCE_DEPENDENCIES:
        return ((InternalEList<?>)getReferenceDependencies()).basicRemove(otherEnd, msgs);
      case CodePackage.COMPONENT__CONTAINMENT_DEPENDENCIES:
        return ((InternalEList<?>)getContainmentDependencies()).basicRemove(otherEnd, msgs);
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
      case CodePackage.COMPONENT__IDENTIFIER:
        return getIdentifier();
      case CodePackage.COMPONENT__CLASSPATH_ENTRIES:
        return getClasspathEntries();
      case CodePackage.COMPONENT__RESOURCES_CONTAINERS:
        return getResourcesContainers();
      case CodePackage.COMPONENT__REFERENCE_DEPENDENCIES:
        return getReferenceDependencies();
      case CodePackage.COMPONENT__CONTAINMENT_DEPENDENCIES:
        return getContainmentDependencies();
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
      case CodePackage.COMPONENT__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case CodePackage.COMPONENT__CLASSPATH_ENTRIES:
        getClasspathEntries().clear();
        getClasspathEntries().addAll((Collection<? extends ClasspathEntry>)newValue);
        return;
      case CodePackage.COMPONENT__RESOURCES_CONTAINERS:
        getResourcesContainers().clear();
        getResourcesContainers().addAll((Collection<? extends ResourcesContainer>)newValue);
        return;
      case CodePackage.COMPONENT__REFERENCE_DEPENDENCIES:
        getReferenceDependencies().clear();
        getReferenceDependencies().addAll((Collection<? extends ReferenceDependency>)newValue);
        return;
      case CodePackage.COMPONENT__CONTAINMENT_DEPENDENCIES:
        getContainmentDependencies().clear();
        getContainmentDependencies().addAll((Collection<? extends ContainmentDependency>)newValue);
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
      case CodePackage.COMPONENT__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case CodePackage.COMPONENT__CLASSPATH_ENTRIES:
        getClasspathEntries().clear();
        return;
      case CodePackage.COMPONENT__RESOURCES_CONTAINERS:
        getResourcesContainers().clear();
        return;
      case CodePackage.COMPONENT__REFERENCE_DEPENDENCIES:
        getReferenceDependencies().clear();
        return;
      case CodePackage.COMPONENT__CONTAINMENT_DEPENDENCIES:
        getContainmentDependencies().clear();
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
      case CodePackage.COMPONENT__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case CodePackage.COMPONENT__CLASSPATH_ENTRIES:
        return classpathEntries != null && !classpathEntries.isEmpty();
      case CodePackage.COMPONENT__RESOURCES_CONTAINERS:
        return resourcesContainers != null && !resourcesContainers.isEmpty();
      case CodePackage.COMPONENT__REFERENCE_DEPENDENCIES:
        return referenceDependencies != null && !referenceDependencies.isEmpty();
      case CodePackage.COMPONENT__CONTAINMENT_DEPENDENCIES:
        return containmentDependencies != null && !containmentDependencies.isEmpty();
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //ComponentImpl
