/**
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Stephane Begaudeau (Obeo) - initial API and implementation
 */
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.Annotation;
import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.Constructor;
import fr.obeo.ariadne.model.code.Parameter;
import fr.obeo.ariadne.model.code.Type;
import fr.obeo.ariadne.model.code.VisibilityKind;

import fr.obeo.ariadne.model.core.VersionedElement;

import fr.obeo.ariadne.model.core.impl.VersionedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ConstructorImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ConstructorImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ConstructorImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ConstructorImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ConstructorImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ConstructorImpl#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ConstructorImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ConstructorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ConstructorImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ConstructorImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ConstructorImpl#getOverriddenConstructors <em>Overridden Constructors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstructorImpl extends VersionedElementImpl implements Constructor
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
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<Type> types;

  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> annotations;

  /**
   * The cached value of the '{@link #getOverriddenConstructors() <em>Overridden Constructors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverriddenConstructors()
   * @generated
   * @ordered
   */
  protected EList<Constructor> overriddenConstructors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstructorImpl()
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
    return CodePackage.Literals.CONSTRUCTOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CONSTRUCTOR__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CONSTRUCTOR__VISIBILITY, oldVisibility, visibility));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CONSTRUCTOR__STATIC, oldStatic, static_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CONSTRUCTOR__ABSTRACT, oldAbstract, abstract_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CONSTRUCTOR__FINAL, oldFinal, final_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CONSTRUCTOR__IMMUTABLE, oldImmutable, immutable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CONSTRUCTOR__TRANSIENT, oldTransient, transient_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, CodePackage.CONSTRUCTOR__PARAMETERS);
    }
    return parameters;
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
      types = new EObjectResolvingEList<Type>(Type.class, this, CodePackage.CONSTRUCTOR__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectResolvingEList<Annotation>(Annotation.class, this, CodePackage.CONSTRUCTOR__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constructor> getOverriddenConstructors()
  {
    if (overriddenConstructors == null)
    {
      overriddenConstructors = new EObjectResolvingEList<Constructor>(Constructor.class, this, CodePackage.CONSTRUCTOR__OVERRIDDEN_CONSTRUCTORS);
    }
    return overriddenConstructors;
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
      case CodePackage.CONSTRUCTOR__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case CodePackage.CONSTRUCTOR__QUALIFIED_NAME:
        return getQualifiedName();
      case CodePackage.CONSTRUCTOR__VISIBILITY:
        return getVisibility();
      case CodePackage.CONSTRUCTOR__STATIC:
        return isStatic();
      case CodePackage.CONSTRUCTOR__ABSTRACT:
        return isAbstract();
      case CodePackage.CONSTRUCTOR__FINAL:
        return isFinal();
      case CodePackage.CONSTRUCTOR__IMMUTABLE:
        return isImmutable();
      case CodePackage.CONSTRUCTOR__TRANSIENT:
        return isTransient();
      case CodePackage.CONSTRUCTOR__PARAMETERS:
        return getParameters();
      case CodePackage.CONSTRUCTOR__TYPES:
        return getTypes();
      case CodePackage.CONSTRUCTOR__ANNOTATIONS:
        return getAnnotations();
      case CodePackage.CONSTRUCTOR__OVERRIDDEN_CONSTRUCTORS:
        return getOverriddenConstructors();
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
      case CodePackage.CONSTRUCTOR__QUALIFIED_NAME:
        setQualifiedName((String)newValue);
        return;
      case CodePackage.CONSTRUCTOR__VISIBILITY:
        setVisibility((VisibilityKind)newValue);
        return;
      case CodePackage.CONSTRUCTOR__STATIC:
        setStatic((Boolean)newValue);
        return;
      case CodePackage.CONSTRUCTOR__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case CodePackage.CONSTRUCTOR__FINAL:
        setFinal((Boolean)newValue);
        return;
      case CodePackage.CONSTRUCTOR__IMMUTABLE:
        setImmutable((Boolean)newValue);
        return;
      case CodePackage.CONSTRUCTOR__TRANSIENT:
        setTransient((Boolean)newValue);
        return;
      case CodePackage.CONSTRUCTOR__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case CodePackage.CONSTRUCTOR__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends Type>)newValue);
        return;
      case CodePackage.CONSTRUCTOR__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case CodePackage.CONSTRUCTOR__OVERRIDDEN_CONSTRUCTORS:
        getOverriddenConstructors().clear();
        getOverriddenConstructors().addAll((Collection<? extends Constructor>)newValue);
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
      case CodePackage.CONSTRUCTOR__QUALIFIED_NAME:
        setQualifiedName(QUALIFIED_NAME_EDEFAULT);
        return;
      case CodePackage.CONSTRUCTOR__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case CodePackage.CONSTRUCTOR__STATIC:
        setStatic(STATIC_EDEFAULT);
        return;
      case CodePackage.CONSTRUCTOR__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case CodePackage.CONSTRUCTOR__FINAL:
        setFinal(FINAL_EDEFAULT);
        return;
      case CodePackage.CONSTRUCTOR__IMMUTABLE:
        setImmutable(IMMUTABLE_EDEFAULT);
        return;
      case CodePackage.CONSTRUCTOR__TRANSIENT:
        setTransient(TRANSIENT_EDEFAULT);
        return;
      case CodePackage.CONSTRUCTOR__PARAMETERS:
        getParameters().clear();
        return;
      case CodePackage.CONSTRUCTOR__TYPES:
        getTypes().clear();
        return;
      case CodePackage.CONSTRUCTOR__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case CodePackage.CONSTRUCTOR__OVERRIDDEN_CONSTRUCTORS:
        getOverriddenConstructors().clear();
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
      case CodePackage.CONSTRUCTOR__QUALIFIED_NAME:
        return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
      case CodePackage.CONSTRUCTOR__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case CodePackage.CONSTRUCTOR__STATIC:
        return static_ != STATIC_EDEFAULT;
      case CodePackage.CONSTRUCTOR__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case CodePackage.CONSTRUCTOR__FINAL:
        return final_ != FINAL_EDEFAULT;
      case CodePackage.CONSTRUCTOR__IMMUTABLE:
        return immutable != IMMUTABLE_EDEFAULT;
      case CodePackage.CONSTRUCTOR__TRANSIENT:
        return transient_ != TRANSIENT_EDEFAULT;
      case CodePackage.CONSTRUCTOR__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case CodePackage.CONSTRUCTOR__TYPES:
        return types != null && !types.isEmpty();
      case CodePackage.CONSTRUCTOR__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case CodePackage.CONSTRUCTOR__OVERRIDDEN_CONSTRUCTORS:
        return overriddenConstructors != null && !overriddenConstructors.isEmpty();
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

} //ConstructorImpl
