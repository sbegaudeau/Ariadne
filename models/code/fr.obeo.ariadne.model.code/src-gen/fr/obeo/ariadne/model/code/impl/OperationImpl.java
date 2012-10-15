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
import fr.obeo.ariadne.model.code.Classifier;
import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.Operation;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.OperationImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.OperationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.OperationImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.OperationImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.OperationImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.OperationImpl#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.OperationImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.OperationImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.OperationImpl#getReturnTypes <em>Return Types</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.OperationImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.OperationImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.OperationImpl#getOverriddenOperations <em>Overridden Operations</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.OperationImpl#getRelatedElements <em>Related Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends VersionedElementImpl implements Operation
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
   * The cached value of the '{@link #getReturnTypes() <em>Return Types</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnTypes()
   * @generated
   * @ordered
   */
  protected EList<Type> returnTypes;

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
   * The cached value of the '{@link #getOverriddenOperations() <em>Overridden Operations</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverriddenOperations()
   * @generated
   * @ordered
   */
  protected EList<Operation> overriddenOperations;

  /**
   * The cached value of the '{@link #getRelatedElements() <em>Related Elements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelatedElements()
   * @generated
   * @ordered
   */
  protected EList<VersionedElement> relatedElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return CodePackage.Literals.OPERATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.OPERATION__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.OPERATION__VISIBILITY, oldVisibility, visibility));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.OPERATION__STATIC, oldStatic, static_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.OPERATION__ABSTRACT, oldAbstract, abstract_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.OPERATION__FINAL, oldFinal, final_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.OPERATION__IMMUTABLE, oldImmutable, immutable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.OPERATION__TRANSIENT, oldTransient, transient_));
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
      parameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, CodePackage.OPERATION__PARAMETERS, CodePackage.PARAMETER__OPERATION);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier getClassifier()
  {
    if (eContainerFeatureID() != CodePackage.OPERATION__CLASSIFIER) return null;
    return (Classifier)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassifier(Classifier newClassifier, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newClassifier, CodePackage.OPERATION__CLASSIFIER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassifier(Classifier newClassifier)
  {
    if (newClassifier != eInternalContainer() || (eContainerFeatureID() != CodePackage.OPERATION__CLASSIFIER && newClassifier != null))
    {
      if (EcoreUtil.isAncestor(this, newClassifier))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newClassifier != null)
        msgs = ((InternalEObject)newClassifier).eInverseAdd(this, CodePackage.CLASSIFIER__OPERATIONS, Classifier.class, msgs);
      msgs = basicSetClassifier(newClassifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.OPERATION__CLASSIFIER, newClassifier, newClassifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getReturnTypes()
  {
    if (returnTypes == null)
    {
      returnTypes = new EObjectResolvingEList<Type>(Type.class, this, CodePackage.OPERATION__RETURN_TYPES);
    }
    return returnTypes;
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
      types = new EObjectResolvingEList<Type>(Type.class, this, CodePackage.OPERATION__TYPES);
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
      annotations = new EObjectResolvingEList<Annotation>(Annotation.class, this, CodePackage.OPERATION__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOverriddenOperations()
  {
    if (overriddenOperations == null)
    {
      overriddenOperations = new EObjectResolvingEList<Operation>(Operation.class, this, CodePackage.OPERATION__OVERRIDDEN_OPERATIONS);
    }
    return overriddenOperations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VersionedElement> getRelatedElements()
  {
    if (relatedElements == null)
    {
      relatedElements = new EObjectResolvingEList<VersionedElement>(VersionedElement.class, this, CodePackage.OPERATION__RELATED_ELEMENTS);
    }
    return relatedElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CodePackage.OPERATION__PARAMETERS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
      case CodePackage.OPERATION__CLASSIFIER:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetClassifier((Classifier)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case CodePackage.OPERATION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case CodePackage.OPERATION__CLASSIFIER:
        return basicSetClassifier(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case CodePackage.OPERATION__CLASSIFIER:
        return eInternalContainer().eInverseRemove(this, CodePackage.CLASSIFIER__OPERATIONS, Classifier.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case CodePackage.OPERATION__QUALIFIED_NAME:
        return getQualifiedName();
      case CodePackage.OPERATION__VISIBILITY:
        return getVisibility();
      case CodePackage.OPERATION__STATIC:
        return isStatic();
      case CodePackage.OPERATION__ABSTRACT:
        return isAbstract();
      case CodePackage.OPERATION__FINAL:
        return isFinal();
      case CodePackage.OPERATION__IMMUTABLE:
        return isImmutable();
      case CodePackage.OPERATION__TRANSIENT:
        return isTransient();
      case CodePackage.OPERATION__PARAMETERS:
        return getParameters();
      case CodePackage.OPERATION__CLASSIFIER:
        return getClassifier();
      case CodePackage.OPERATION__RETURN_TYPES:
        return getReturnTypes();
      case CodePackage.OPERATION__TYPES:
        return getTypes();
      case CodePackage.OPERATION__ANNOTATIONS:
        return getAnnotations();
      case CodePackage.OPERATION__OVERRIDDEN_OPERATIONS:
        return getOverriddenOperations();
      case CodePackage.OPERATION__RELATED_ELEMENTS:
        return getRelatedElements();
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
      case CodePackage.OPERATION__QUALIFIED_NAME:
        setQualifiedName((String)newValue);
        return;
      case CodePackage.OPERATION__VISIBILITY:
        setVisibility((VisibilityKind)newValue);
        return;
      case CodePackage.OPERATION__STATIC:
        setStatic((Boolean)newValue);
        return;
      case CodePackage.OPERATION__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case CodePackage.OPERATION__FINAL:
        setFinal((Boolean)newValue);
        return;
      case CodePackage.OPERATION__IMMUTABLE:
        setImmutable((Boolean)newValue);
        return;
      case CodePackage.OPERATION__TRANSIENT:
        setTransient((Boolean)newValue);
        return;
      case CodePackage.OPERATION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case CodePackage.OPERATION__CLASSIFIER:
        setClassifier((Classifier)newValue);
        return;
      case CodePackage.OPERATION__RETURN_TYPES:
        getReturnTypes().clear();
        getReturnTypes().addAll((Collection<? extends Type>)newValue);
        return;
      case CodePackage.OPERATION__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends Type>)newValue);
        return;
      case CodePackage.OPERATION__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case CodePackage.OPERATION__OVERRIDDEN_OPERATIONS:
        getOverriddenOperations().clear();
        getOverriddenOperations().addAll((Collection<? extends Operation>)newValue);
        return;
      case CodePackage.OPERATION__RELATED_ELEMENTS:
        getRelatedElements().clear();
        getRelatedElements().addAll((Collection<? extends VersionedElement>)newValue);
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
      case CodePackage.OPERATION__QUALIFIED_NAME:
        setQualifiedName(QUALIFIED_NAME_EDEFAULT);
        return;
      case CodePackage.OPERATION__VISIBILITY:
        setVisibility(VISIBILITY_EDEFAULT);
        return;
      case CodePackage.OPERATION__STATIC:
        setStatic(STATIC_EDEFAULT);
        return;
      case CodePackage.OPERATION__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case CodePackage.OPERATION__FINAL:
        setFinal(FINAL_EDEFAULT);
        return;
      case CodePackage.OPERATION__IMMUTABLE:
        setImmutable(IMMUTABLE_EDEFAULT);
        return;
      case CodePackage.OPERATION__TRANSIENT:
        setTransient(TRANSIENT_EDEFAULT);
        return;
      case CodePackage.OPERATION__PARAMETERS:
        getParameters().clear();
        return;
      case CodePackage.OPERATION__CLASSIFIER:
        setClassifier((Classifier)null);
        return;
      case CodePackage.OPERATION__RETURN_TYPES:
        getReturnTypes().clear();
        return;
      case CodePackage.OPERATION__TYPES:
        getTypes().clear();
        return;
      case CodePackage.OPERATION__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case CodePackage.OPERATION__OVERRIDDEN_OPERATIONS:
        getOverriddenOperations().clear();
        return;
      case CodePackage.OPERATION__RELATED_ELEMENTS:
        getRelatedElements().clear();
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
      case CodePackage.OPERATION__QUALIFIED_NAME:
        return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
      case CodePackage.OPERATION__VISIBILITY:
        return visibility != VISIBILITY_EDEFAULT;
      case CodePackage.OPERATION__STATIC:
        return static_ != STATIC_EDEFAULT;
      case CodePackage.OPERATION__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case CodePackage.OPERATION__FINAL:
        return final_ != FINAL_EDEFAULT;
      case CodePackage.OPERATION__IMMUTABLE:
        return immutable != IMMUTABLE_EDEFAULT;
      case CodePackage.OPERATION__TRANSIENT:
        return transient_ != TRANSIENT_EDEFAULT;
      case CodePackage.OPERATION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case CodePackage.OPERATION__CLASSIFIER:
        return getClassifier() != null;
      case CodePackage.OPERATION__RETURN_TYPES:
        return returnTypes != null && !returnTypes.isEmpty();
      case CodePackage.OPERATION__TYPES:
        return types != null && !types.isEmpty();
      case CodePackage.OPERATION__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case CodePackage.OPERATION__OVERRIDDEN_OPERATIONS:
        return overriddenOperations != null && !overriddenOperations.isEmpty();
      case CodePackage.OPERATION__RELATED_ELEMENTS:
        return relatedElements != null && !relatedElements.isEmpty();
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

} //OperationImpl
