/**
 */
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.Classifier;
import fr.obeo.ariadne.model.code.ClassifierKind;
import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.Field;
import fr.obeo.ariadne.model.code.Operation;

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
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ClassifierImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ClassifierImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ClassifierImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ClassifierImpl#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ClassifierImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ClassifierImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ClassifierImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierImpl extends TypeImpl implements Classifier
{
  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final ClassifierKind KIND_EDEFAULT = ClassifierKind.CLASS;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected ClassifierKind kind = KIND_EDEFAULT;

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
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Field> fields;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<Operation> operations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassifierImpl()
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
    return CodePackage.Literals.CLASSIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassifierKind getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(ClassifierKind newKind)
  {
    ClassifierKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CLASSIFIER__KIND, oldKind, kind));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CLASSIFIER__STATIC, oldStatic, static_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CLASSIFIER__FINAL, oldFinal, final_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CLASSIFIER__IMMUTABLE, oldImmutable, immutable));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.CLASSIFIER__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<Field>(Field.class, this, CodePackage.CLASSIFIER__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<Operation>(Operation.class, this, CodePackage.CLASSIFIER__OPERATIONS);
    }
    return operations;
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
      case CodePackage.CLASSIFIER__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case CodePackage.CLASSIFIER__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
      case CodePackage.CLASSIFIER__KIND:
        return getKind();
      case CodePackage.CLASSIFIER__STATIC:
        return isStatic();
      case CodePackage.CLASSIFIER__FINAL:
        return isFinal();
      case CodePackage.CLASSIFIER__IMMUTABLE:
        return isImmutable();
      case CodePackage.CLASSIFIER__ABSTRACT:
        return isAbstract();
      case CodePackage.CLASSIFIER__FIELDS:
        return getFields();
      case CodePackage.CLASSIFIER__OPERATIONS:
        return getOperations();
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
      case CodePackage.CLASSIFIER__KIND:
        setKind((ClassifierKind)newValue);
        return;
      case CodePackage.CLASSIFIER__STATIC:
        setStatic((Boolean)newValue);
        return;
      case CodePackage.CLASSIFIER__FINAL:
        setFinal((Boolean)newValue);
        return;
      case CodePackage.CLASSIFIER__IMMUTABLE:
        setImmutable((Boolean)newValue);
        return;
      case CodePackage.CLASSIFIER__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case CodePackage.CLASSIFIER__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>)newValue);
        return;
      case CodePackage.CLASSIFIER__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends Operation>)newValue);
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
      case CodePackage.CLASSIFIER__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case CodePackage.CLASSIFIER__STATIC:
        setStatic(STATIC_EDEFAULT);
        return;
      case CodePackage.CLASSIFIER__FINAL:
        setFinal(FINAL_EDEFAULT);
        return;
      case CodePackage.CLASSIFIER__IMMUTABLE:
        setImmutable(IMMUTABLE_EDEFAULT);
        return;
      case CodePackage.CLASSIFIER__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case CodePackage.CLASSIFIER__FIELDS:
        getFields().clear();
        return;
      case CodePackage.CLASSIFIER__OPERATIONS:
        getOperations().clear();
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
      case CodePackage.CLASSIFIER__KIND:
        return kind != KIND_EDEFAULT;
      case CodePackage.CLASSIFIER__STATIC:
        return static_ != STATIC_EDEFAULT;
      case CodePackage.CLASSIFIER__FINAL:
        return final_ != FINAL_EDEFAULT;
      case CodePackage.CLASSIFIER__IMMUTABLE:
        return immutable != IMMUTABLE_EDEFAULT;
      case CodePackage.CLASSIFIER__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case CodePackage.CLASSIFIER__FIELDS:
        return fields != null && !fields.isEmpty();
      case CodePackage.CLASSIFIER__OPERATIONS:
        return operations != null && !operations.isEmpty();
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
    result.append(", static: ");
    result.append(static_);
    result.append(", final: ");
    result.append(final_);
    result.append(", immutable: ");
    result.append(immutable);
    result.append(", abstract: ");
    result.append(abstract_);
    result.append(')');
    return result.toString();
  }

} //ClassifierImpl
