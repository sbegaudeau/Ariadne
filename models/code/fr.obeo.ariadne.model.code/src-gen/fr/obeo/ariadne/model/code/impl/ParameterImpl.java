/**
 */
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.AnnotationDependency;
import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.Parameter;
import fr.obeo.ariadne.model.code.ReferenceDependency;
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
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ParameterImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ParameterImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ParameterImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ParameterImpl#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ParameterImpl#getTypingDependency <em>Typing Dependency</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ParameterImpl#getReferenceDependencies <em>Reference Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ParameterImpl#getAnnotationDependencies <em>Annotation Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends VersionedElementImpl implements Parameter
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
   * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected static final boolean FINAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected boolean final_ = FINAL_EDEFAULT;

  /**
   * The default value of the '{@link #isImmutable() <em>Immutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImmutable()
   * @generated
   * @ordered
   */
  protected static final boolean IMMUTABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isImmutable() <em>Immutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImmutable()
   * @generated
   * @ordered
   */
  protected boolean immutable = IMMUTABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypingDependency() <em>Typing Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypingDependency()
   * @generated
   * @ordered
   */
  protected TypingDependency typingDependency;

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
  protected ParameterImpl()
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
    return CodePackage.Literals.PARAMETER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.PARAMETER__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.PARAMETER__VISIBILITY, oldVisibility, visibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFinal()
  {
    return final_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinal(boolean newFinal)
  {
    boolean oldFinal = final_;
    final_ = newFinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.PARAMETER__FINAL, oldFinal, final_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isImmutable()
  {
    return immutable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImmutable(boolean newImmutable)
  {
    boolean oldImmutable = immutable;
    immutable = newImmutable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.PARAMETER__IMMUTABLE, oldImmutable, immutable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypingDependency getTypingDependency()
  {
    return typingDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypingDependency(TypingDependency newTypingDependency, NotificationChain msgs)
  {
    TypingDependency oldTypingDependency = typingDependency;
    typingDependency = newTypingDependency;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.PARAMETER__TYPING_DEPENDENCY, oldTypingDependency, newTypingDependency);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypingDependency(TypingDependency newTypingDependency)
  {
    if (newTypingDependency != typingDependency)
    {
      NotificationChain msgs = null;
      if (typingDependency != null)
        msgs = ((InternalEObject)typingDependency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.PARAMETER__TYPING_DEPENDENCY, null, msgs);
      if (newTypingDependency != null)
        msgs = ((InternalEObject)newTypingDependency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.PARAMETER__TYPING_DEPENDENCY, null, msgs);
      msgs = basicSetTypingDependency(newTypingDependency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.PARAMETER__TYPING_DEPENDENCY, newTypingDependency, newTypingDependency));
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
      referenceDependencies = new EObjectContainmentEList<ReferenceDependency>(ReferenceDependency.class, this, CodePackage.PARAMETER__REFERENCE_DEPENDENCIES);
    }
    return referenceDependencies;
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
      annotationDependencies = new EObjectContainmentEList<AnnotationDependency>(AnnotationDependency.class, this, CodePackage.PARAMETER__ANNOTATION_DEPENDENCIES);
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
      case CodePackage.PARAMETER__TYPING_DEPENDENCY:
        return basicSetTypingDependency(null, msgs);
      case CodePackage.PARAMETER__REFERENCE_DEPENDENCIES:
        return ((InternalEList<?>)getReferenceDependencies()).basicRemove(otherEnd, msgs);
      case CodePackage.PARAMETER__ANNOTATION_DEPENDENCIES:
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
      case CodePackage.PARAMETER__QUALIFIED_NAME:
        return getQualifiedName();
      case CodePackage.PARAMETER__VISIBILITY:
        return getVisibility();
      case CodePackage.PARAMETER__FINAL:
        return isFinal();
      case CodePackage.PARAMETER__IMMUTABLE:
        return isImmutable();
      case CodePackage.PARAMETER__TYPING_DEPENDENCY:
        return getTypingDependency();
      case CodePackage.PARAMETER__REFERENCE_DEPENDENCIES:
        return getReferenceDependencies();
      case CodePackage.PARAMETER__ANNOTATION_DEPENDENCIES:
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
      case CodePackage.PARAMETER__QUALIFIED_NAME:
        setQualifiedName((String)newValue);
        return;
      case CodePackage.PARAMETER__VISIBILITY:
        setVisibility((VisibilityKind)newValue);
        return;
      case CodePackage.PARAMETER__FINAL:
        setFinal((Boolean)newValue);
        return;
      case CodePackage.PARAMETER__IMMUTABLE:
        setImmutable((Boolean)newValue);
        return;
      case CodePackage.PARAMETER__TYPING_DEPENDENCY:
        setTypingDependency((TypingDependency)newValue);
        return;
      case CodePackage.PARAMETER__REFERENCE_DEPENDENCIES:
        getReferenceDependencies().clear();
        getReferenceDependencies().addAll((Collection<? extends ReferenceDependency>)newValue);
        return;
      case CodePackage.PARAMETER__ANNOTATION_DEPENDENCIES:
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
      case CodePackage.PARAMETER__QUALIFIED_NAME:
        setQualifiedName(QUALIFIED_NAME_EDEFAULT);
        return;
      case CodePackage.PARAMETER__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case CodePackage.PARAMETER__FINAL:
        setFinal(FINAL_EDEFAULT);
        return;
      case CodePackage.PARAMETER__IMMUTABLE:
        setImmutable(IMMUTABLE_EDEFAULT);
        return;
      case CodePackage.PARAMETER__TYPING_DEPENDENCY:
        setTypingDependency((TypingDependency)null);
        return;
      case CodePackage.PARAMETER__REFERENCE_DEPENDENCIES:
        getReferenceDependencies().clear();
        return;
      case CodePackage.PARAMETER__ANNOTATION_DEPENDENCIES:
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
      case CodePackage.PARAMETER__QUALIFIED_NAME:
        return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
      case CodePackage.PARAMETER__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case CodePackage.PARAMETER__FINAL:
        return final_ != FINAL_EDEFAULT;
      case CodePackage.PARAMETER__IMMUTABLE:
        return immutable != IMMUTABLE_EDEFAULT;
      case CodePackage.PARAMETER__TYPING_DEPENDENCY:
        return typingDependency != null;
      case CodePackage.PARAMETER__REFERENCE_DEPENDENCIES:
        return referenceDependencies != null && !referenceDependencies.isEmpty();
      case CodePackage.PARAMETER__ANNOTATION_DEPENDENCIES:
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
    result.append(", final: ");
    result.append(final_);
    result.append(", immutable: ");
    result.append(immutable);
    result.append(')');
    return result.toString();
  }

} //ParameterImpl
