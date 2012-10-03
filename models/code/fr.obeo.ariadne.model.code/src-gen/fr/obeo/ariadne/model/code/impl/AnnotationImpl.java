/**
 */
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.Annotation;
import fr.obeo.ariadne.model.code.AnnotationField;
import fr.obeo.ariadne.model.code.CodePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.AnnotationImpl#getAnnotationFields <em>Annotation Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationImpl extends TypeImpl implements Annotation
{
  /**
   * The cached value of the '{@link #getAnnotationFields() <em>Annotation Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationFields()
   * @generated
   * @ordered
   */
  protected EList<AnnotationField> annotationFields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationImpl()
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
    return CodePackage.Literals.ANNOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AnnotationField> getAnnotationFields()
  {
    if (annotationFields == null)
    {
      annotationFields = new EObjectContainmentEList<AnnotationField>(AnnotationField.class, this, CodePackage.ANNOTATION__ANNOTATION_FIELDS);
    }
    return annotationFields;
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
      case CodePackage.ANNOTATION__ANNOTATION_FIELDS:
        return ((InternalEList<?>)getAnnotationFields()).basicRemove(otherEnd, msgs);
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
      case CodePackage.ANNOTATION__ANNOTATION_FIELDS:
        return getAnnotationFields();
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
      case CodePackage.ANNOTATION__ANNOTATION_FIELDS:
        getAnnotationFields().clear();
        getAnnotationFields().addAll((Collection<? extends AnnotationField>)newValue);
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
      case CodePackage.ANNOTATION__ANNOTATION_FIELDS:
        getAnnotationFields().clear();
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
      case CodePackage.ANNOTATION__ANNOTATION_FIELDS:
        return annotationFields != null && !annotationFields.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AnnotationImpl
