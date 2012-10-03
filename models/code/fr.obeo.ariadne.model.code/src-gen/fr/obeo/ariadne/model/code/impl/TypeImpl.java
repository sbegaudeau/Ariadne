/**
 */
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.AnnotationDependency;
import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.ContainmentDependency;
import fr.obeo.ariadne.model.code.InheritanceDependency;
import fr.obeo.ariadne.model.code.ReferenceDependency;
import fr.obeo.ariadne.model.code.Type;
import fr.obeo.ariadne.model.code.TypingDependency;
import fr.obeo.ariadne.model.code.VisibilityKind;

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
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.TypeImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.TypeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.TypeImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.TypeImpl#getTypingDependencies <em>Typing Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.TypeImpl#getInheritanceDependencies <em>Inheritance Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.TypeImpl#getReferenceDependencies <em>Reference Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.TypeImpl#getContainmentDependencies <em>Containment Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.TypeImpl#getAnnotationDependencies <em>Annotation Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeImpl extends VersionedElementImpl implements Type
{
  /**
   * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedName()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIED_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedName()
   * @generated
   * @ordered
   */
  protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

  /**
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<Type> types;

  /**
   * The cached value of the '{@link #getTypingDependencies() <em>Typing Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypingDependencies()
   * @generated
   * @ordered
   */
  protected EList<TypingDependency> typingDependencies;

  /**
   * The cached value of the '{@link #getInheritanceDependencies() <em>Inheritance Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInheritanceDependencies()
   * @generated
   * @ordered
   */
  protected EList<InheritanceDependency> inheritanceDependencies;

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
   * The cached value of the '{@link #getAnnotationDependencies() <em>Annotation Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationDependencies()
   * @generated
   * @ordered
   */
  protected EList<AnnotationDependency> annotationDependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return CodePackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQualifiedName()
  {
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifiedName(String newQualifiedName)
  {
    String oldQualifiedName = qualifiedName;
    qualifiedName = newQualifiedName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.TYPE__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisibilityKind getVisibility()
  {
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibility(VisibilityKind newVisibility)
  {
    VisibilityKind oldVisibility = visibility;
    visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.TYPE__VISIBILITY, oldVisibility, visibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<Type>(Type.class, this, CodePackage.TYPE__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypingDependency> getTypingDependencies()
  {
    if (typingDependencies == null)
    {
      typingDependencies = new EObjectContainmentEList<TypingDependency>(TypingDependency.class, this, CodePackage.TYPE__TYPING_DEPENDENCIES);
    }
    return typingDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InheritanceDependency> getInheritanceDependencies()
  {
    if (inheritanceDependencies == null)
    {
      inheritanceDependencies = new EObjectContainmentEList<InheritanceDependency>(InheritanceDependency.class, this, CodePackage.TYPE__INHERITANCE_DEPENDENCIES);
    }
    return inheritanceDependencies;
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
      referenceDependencies = new EObjectContainmentEList<ReferenceDependency>(ReferenceDependency.class, this, CodePackage.TYPE__REFERENCE_DEPENDENCIES);
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
      containmentDependencies = new EObjectContainmentEList<ContainmentDependency>(ContainmentDependency.class, this, CodePackage.TYPE__CONTAINMENT_DEPENDENCIES);
    }
    return containmentDependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AnnotationDependency> getAnnotationDependencies()
  {
    if (annotationDependencies == null)
    {
      annotationDependencies = new EObjectContainmentEList<AnnotationDependency>(AnnotationDependency.class, this, CodePackage.TYPE__ANNOTATION_DEPENDENCIES);
    }
    return annotationDependencies;
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
      case CodePackage.TYPE__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case CodePackage.TYPE__TYPING_DEPENDENCIES:
        return ((InternalEList<?>)getTypingDependencies()).basicRemove(otherEnd, msgs);
      case CodePackage.TYPE__INHERITANCE_DEPENDENCIES:
        return ((InternalEList<?>)getInheritanceDependencies()).basicRemove(otherEnd, msgs);
      case CodePackage.TYPE__REFERENCE_DEPENDENCIES:
        return ((InternalEList<?>)getReferenceDependencies()).basicRemove(otherEnd, msgs);
      case CodePackage.TYPE__CONTAINMENT_DEPENDENCIES:
        return ((InternalEList<?>)getContainmentDependencies()).basicRemove(otherEnd, msgs);
      case CodePackage.TYPE__ANNOTATION_DEPENDENCIES:
        return ((InternalEList<?>)getAnnotationDependencies()).basicRemove(otherEnd, msgs);
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
      case CodePackage.TYPE__QUALIFIED_NAME:
        return getQualifiedName();
      case CodePackage.TYPE__VISIBILITY:
        return getVisibility();
      case CodePackage.TYPE__TYPES:
        return getTypes();
      case CodePackage.TYPE__TYPING_DEPENDENCIES:
        return getTypingDependencies();
      case CodePackage.TYPE__INHERITANCE_DEPENDENCIES:
        return getInheritanceDependencies();
      case CodePackage.TYPE__REFERENCE_DEPENDENCIES:
        return getReferenceDependencies();
      case CodePackage.TYPE__CONTAINMENT_DEPENDENCIES:
        return getContainmentDependencies();
      case CodePackage.TYPE__ANNOTATION_DEPENDENCIES:
        return getAnnotationDependencies();
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
      case CodePackage.TYPE__QUALIFIED_NAME:
        setQualifiedName((String)newValue);
        return;
      case CodePackage.TYPE__VISIBILITY:
        setVisibility((VisibilityKind)newValue);
        return;
      case CodePackage.TYPE__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends Type>)newValue);
        return;
      case CodePackage.TYPE__TYPING_DEPENDENCIES:
        getTypingDependencies().clear();
        getTypingDependencies().addAll((Collection<? extends TypingDependency>)newValue);
        return;
      case CodePackage.TYPE__INHERITANCE_DEPENDENCIES:
        getInheritanceDependencies().clear();
        getInheritanceDependencies().addAll((Collection<? extends InheritanceDependency>)newValue);
        return;
      case CodePackage.TYPE__REFERENCE_DEPENDENCIES:
        getReferenceDependencies().clear();
        getReferenceDependencies().addAll((Collection<? extends ReferenceDependency>)newValue);
        return;
      case CodePackage.TYPE__CONTAINMENT_DEPENDENCIES:
        getContainmentDependencies().clear();
        getContainmentDependencies().addAll((Collection<? extends ContainmentDependency>)newValue);
        return;
      case CodePackage.TYPE__ANNOTATION_DEPENDENCIES:
        getAnnotationDependencies().clear();
        getAnnotationDependencies().addAll((Collection<? extends AnnotationDependency>)newValue);
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
      case CodePackage.TYPE__QUALIFIED_NAME:
        setQualifiedName(QUALIFIED_NAME_EDEFAULT);
        return;
      case CodePackage.TYPE__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case CodePackage.TYPE__TYPES:
        getTypes().clear();
        return;
      case CodePackage.TYPE__TYPING_DEPENDENCIES:
        getTypingDependencies().clear();
        return;
      case CodePackage.TYPE__INHERITANCE_DEPENDENCIES:
        getInheritanceDependencies().clear();
        return;
      case CodePackage.TYPE__REFERENCE_DEPENDENCIES:
        getReferenceDependencies().clear();
        return;
      case CodePackage.TYPE__CONTAINMENT_DEPENDENCIES:
        getContainmentDependencies().clear();
        return;
      case CodePackage.TYPE__ANNOTATION_DEPENDENCIES:
        getAnnotationDependencies().clear();
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
      case CodePackage.TYPE__QUALIFIED_NAME:
        return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
      case CodePackage.TYPE__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case CodePackage.TYPE__TYPES:
        return types != null && !types.isEmpty();
      case CodePackage.TYPE__TYPING_DEPENDENCIES:
        return typingDependencies != null && !typingDependencies.isEmpty();
      case CodePackage.TYPE__INHERITANCE_DEPENDENCIES:
        return inheritanceDependencies != null && !inheritanceDependencies.isEmpty();
      case CodePackage.TYPE__REFERENCE_DEPENDENCIES:
        return referenceDependencies != null && !referenceDependencies.isEmpty();
      case CodePackage.TYPE__CONTAINMENT_DEPENDENCIES:
        return containmentDependencies != null && !containmentDependencies.isEmpty();
      case CodePackage.TYPE__ANNOTATION_DEPENDENCIES:
        return annotationDependencies != null && !annotationDependencies.isEmpty();
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
    result.append(" (qualifiedName: ");
    result.append(qualifiedName);
    result.append(", visibility: ");
    result.append(visibility);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
