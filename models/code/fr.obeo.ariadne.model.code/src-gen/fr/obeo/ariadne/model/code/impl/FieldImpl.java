/**
 */
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.AnnotationDependency;
import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.Field;
import fr.obeo.ariadne.model.code.InheritanceDependency;
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
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.FieldImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.FieldImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.FieldImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.FieldImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.FieldImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.FieldImpl#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.FieldImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.FieldImpl#getTypingDependency <em>Typing Dependency</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.FieldImpl#getInheritanceDependency <em>Inheritance Dependency</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.FieldImpl#getReferenceDependencies <em>Reference Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.FieldImpl#getAnnotationDependencies <em>Annotation Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends VersionedElementImpl implements Field
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
   * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected static final boolean STATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected boolean static_ = STATIC_EDEFAULT;

  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

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
   * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTransient()
   * @generated
   * @ordered
   */
  protected static final boolean TRANSIENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTransient()
   * @generated
   * @ordered
   */
  protected boolean transient_ = TRANSIENT_EDEFAULT;

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
   * The cached value of the '{@link #getInheritanceDependency() <em>Inheritance Dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInheritanceDependency()
   * @generated
   * @ordered
   */
  protected InheritanceDependency inheritanceDependency;

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
  protected FieldImpl()
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
    return CodePackage.Literals.FIELD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.FIELD__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.FIELD__VISIBILITY, oldVisibility, visibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStatic()
  {
    return static_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatic(boolean newStatic)
  {
    boolean oldStatic = static_;
    static_ = newStatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.FIELD__STATIC, oldStatic, static_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.FIELD__ABSTRACT, oldAbstract, abstract_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.FIELD__FINAL, oldFinal, final_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.FIELD__IMMUTABLE, oldImmutable, immutable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTransient()
  {
    return transient_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransient(boolean newTransient)
  {
    boolean oldTransient = transient_;
    transient_ = newTransient;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.FIELD__TRANSIENT, oldTransient, transient_));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.FIELD__TYPING_DEPENDENCY, oldTypingDependency, newTypingDependency);
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
        msgs = ((InternalEObject)typingDependency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.FIELD__TYPING_DEPENDENCY, null, msgs);
      if (newTypingDependency != null)
        msgs = ((InternalEObject)newTypingDependency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.FIELD__TYPING_DEPENDENCY, null, msgs);
      msgs = basicSetTypingDependency(newTypingDependency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.FIELD__TYPING_DEPENDENCY, newTypingDependency, newTypingDependency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InheritanceDependency getInheritanceDependency()
  {
    return inheritanceDependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInheritanceDependency(InheritanceDependency newInheritanceDependency, NotificationChain msgs)
  {
    InheritanceDependency oldInheritanceDependency = inheritanceDependency;
    inheritanceDependency = newInheritanceDependency;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodePackage.FIELD__INHERITANCE_DEPENDENCY, oldInheritanceDependency, newInheritanceDependency);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInheritanceDependency(InheritanceDependency newInheritanceDependency)
  {
    if (newInheritanceDependency != inheritanceDependency)
    {
      NotificationChain msgs = null;
      if (inheritanceDependency != null)
        msgs = ((InternalEObject)inheritanceDependency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodePackage.FIELD__INHERITANCE_DEPENDENCY, null, msgs);
      if (newInheritanceDependency != null)
        msgs = ((InternalEObject)newInheritanceDependency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodePackage.FIELD__INHERITANCE_DEPENDENCY, null, msgs);
      msgs = basicSetInheritanceDependency(newInheritanceDependency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.FIELD__INHERITANCE_DEPENDENCY, newInheritanceDependency, newInheritanceDependency));
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
      referenceDependencies = new EObjectContainmentEList<ReferenceDependency>(ReferenceDependency.class, this, CodePackage.FIELD__REFERENCE_DEPENDENCIES);
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
      annotationDependencies = new EObjectContainmentEList<AnnotationDependency>(AnnotationDependency.class, this, CodePackage.FIELD__ANNOTATION_DEPENDENCIES);
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
      case CodePackage.FIELD__TYPING_DEPENDENCY:
        return basicSetTypingDependency(null, msgs);
      case CodePackage.FIELD__INHERITANCE_DEPENDENCY:
        return basicSetInheritanceDependency(null, msgs);
      case CodePackage.FIELD__REFERENCE_DEPENDENCIES:
        return ((InternalEList<?>)getReferenceDependencies()).basicRemove(otherEnd, msgs);
      case CodePackage.FIELD__ANNOTATION_DEPENDENCIES:
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
      case CodePackage.FIELD__QUALIFIED_NAME:
        return getQualifiedName();
      case CodePackage.FIELD__VISIBILITY:
        return getVisibility();
      case CodePackage.FIELD__STATIC:
        return isStatic();
      case CodePackage.FIELD__ABSTRACT:
        return isAbstract();
      case CodePackage.FIELD__FINAL:
        return isFinal();
      case CodePackage.FIELD__IMMUTABLE:
        return isImmutable();
      case CodePackage.FIELD__TRANSIENT:
        return isTransient();
      case CodePackage.FIELD__TYPING_DEPENDENCY:
        return getTypingDependency();
      case CodePackage.FIELD__INHERITANCE_DEPENDENCY:
        return getInheritanceDependency();
      case CodePackage.FIELD__REFERENCE_DEPENDENCIES:
        return getReferenceDependencies();
      case CodePackage.FIELD__ANNOTATION_DEPENDENCIES:
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
      case CodePackage.FIELD__QUALIFIED_NAME:
        setQualifiedName((String)newValue);
        return;
      case CodePackage.FIELD__VISIBILITY:
        setVisibility((VisibilityKind)newValue);
        return;
      case CodePackage.FIELD__STATIC:
        setStatic((Boolean)newValue);
        return;
      case CodePackage.FIELD__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case CodePackage.FIELD__FINAL:
        setFinal((Boolean)newValue);
        return;
      case CodePackage.FIELD__IMMUTABLE:
        setImmutable((Boolean)newValue);
        return;
      case CodePackage.FIELD__TRANSIENT:
        setTransient((Boolean)newValue);
        return;
      case CodePackage.FIELD__TYPING_DEPENDENCY:
        setTypingDependency((TypingDependency)newValue);
        return;
      case CodePackage.FIELD__INHERITANCE_DEPENDENCY:
        setInheritanceDependency((InheritanceDependency)newValue);
        return;
      case CodePackage.FIELD__REFERENCE_DEPENDENCIES:
        getReferenceDependencies().clear();
        getReferenceDependencies().addAll((Collection<? extends ReferenceDependency>)newValue);
        return;
      case CodePackage.FIELD__ANNOTATION_DEPENDENCIES:
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
      case CodePackage.FIELD__QUALIFIED_NAME:
        setQualifiedName(QUALIFIED_NAME_EDEFAULT);
        return;
      case CodePackage.FIELD__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case CodePackage.FIELD__STATIC:
        setStatic(STATIC_EDEFAULT);
        return;
      case CodePackage.FIELD__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case CodePackage.FIELD__FINAL:
        setFinal(FINAL_EDEFAULT);
        return;
      case CodePackage.FIELD__IMMUTABLE:
        setImmutable(IMMUTABLE_EDEFAULT);
        return;
      case CodePackage.FIELD__TRANSIENT:
        setTransient(TRANSIENT_EDEFAULT);
        return;
      case CodePackage.FIELD__TYPING_DEPENDENCY:
        setTypingDependency((TypingDependency)null);
        return;
      case CodePackage.FIELD__INHERITANCE_DEPENDENCY:
        setInheritanceDependency((InheritanceDependency)null);
        return;
      case CodePackage.FIELD__REFERENCE_DEPENDENCIES:
        getReferenceDependencies().clear();
        return;
      case CodePackage.FIELD__ANNOTATION_DEPENDENCIES:
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
      case CodePackage.FIELD__QUALIFIED_NAME:
        return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
      case CodePackage.FIELD__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case CodePackage.FIELD__STATIC:
        return static_ != STATIC_EDEFAULT;
      case CodePackage.FIELD__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case CodePackage.FIELD__FINAL:
        return final_ != FINAL_EDEFAULT;
      case CodePackage.FIELD__IMMUTABLE:
        return immutable != IMMUTABLE_EDEFAULT;
      case CodePackage.FIELD__TRANSIENT:
        return transient_ != TRANSIENT_EDEFAULT;
      case CodePackage.FIELD__TYPING_DEPENDENCY:
        return typingDependency != null;
      case CodePackage.FIELD__INHERITANCE_DEPENDENCY:
        return inheritanceDependency != null;
      case CodePackage.FIELD__REFERENCE_DEPENDENCIES:
        return referenceDependencies != null && !referenceDependencies.isEmpty();
      case CodePackage.FIELD__ANNOTATION_DEPENDENCIES:
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
    result.append(", static: ");
    result.append(static_);
    result.append(", abstract: ");
    result.append(abstract_);
    result.append(", final: ");
    result.append(final_);
    result.append(", immutable: ");
    result.append(immutable);
    result.append(", transient: ");
    result.append(transient_);
    result.append(')');
    return result.toString();
  }

} //FieldImpl
