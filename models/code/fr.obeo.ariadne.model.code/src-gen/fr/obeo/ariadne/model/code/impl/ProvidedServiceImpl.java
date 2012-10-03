/**
 */
package fr.obeo.ariadne.model.code.impl;

import fr.obeo.ariadne.model.code.CodePackage;
import fr.obeo.ariadne.model.code.ProvidedService;
import fr.obeo.ariadne.model.code.ReferenceDependency;
import fr.obeo.ariadne.model.code.TypingDependency;

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
 * An implementation of the model object '<em><b>Provided Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ProvidedServiceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ProvidedServiceImpl#getTypingDependencies <em>Typing Dependencies</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.code.impl.ProvidedServiceImpl#getReferenceDependencies <em>Reference Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProvidedServiceImpl extends VersionedElementImpl implements ProvidedService
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
   * The cached value of the '{@link #getTypingDependencies() <em>Typing Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypingDependencies()
   * @generated
   * @ordered
   */
  protected EList<TypingDependency> typingDependencies;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProvidedServiceImpl()
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
    return CodePackage.Literals.PROVIDED_SERVICE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.PROVIDED_SERVICE__IDENTIFIER, oldIdentifier, identifier));
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
      typingDependencies = new EObjectContainmentEList<TypingDependency>(TypingDependency.class, this, CodePackage.PROVIDED_SERVICE__TYPING_DEPENDENCIES);
    }
    return typingDependencies;
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
      referenceDependencies = new EObjectContainmentEList<ReferenceDependency>(ReferenceDependency.class, this, CodePackage.PROVIDED_SERVICE__REFERENCE_DEPENDENCIES);
    }
    return referenceDependencies;
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
      case CodePackage.PROVIDED_SERVICE__TYPING_DEPENDENCIES:
        return ((InternalEList<?>)getTypingDependencies()).basicRemove(otherEnd, msgs);
      case CodePackage.PROVIDED_SERVICE__REFERENCE_DEPENDENCIES:
        return ((InternalEList<?>)getReferenceDependencies()).basicRemove(otherEnd, msgs);
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
      case CodePackage.PROVIDED_SERVICE__IDENTIFIER:
        return getIdentifier();
      case CodePackage.PROVIDED_SERVICE__TYPING_DEPENDENCIES:
        return getTypingDependencies();
      case CodePackage.PROVIDED_SERVICE__REFERENCE_DEPENDENCIES:
        return getReferenceDependencies();
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
      case CodePackage.PROVIDED_SERVICE__IDENTIFIER:
        setIdentifier((String)newValue);
        return;
      case CodePackage.PROVIDED_SERVICE__TYPING_DEPENDENCIES:
        getTypingDependencies().clear();
        getTypingDependencies().addAll((Collection<? extends TypingDependency>)newValue);
        return;
      case CodePackage.PROVIDED_SERVICE__REFERENCE_DEPENDENCIES:
        getReferenceDependencies().clear();
        getReferenceDependencies().addAll((Collection<? extends ReferenceDependency>)newValue);
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
      case CodePackage.PROVIDED_SERVICE__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
        return;
      case CodePackage.PROVIDED_SERVICE__TYPING_DEPENDENCIES:
        getTypingDependencies().clear();
        return;
      case CodePackage.PROVIDED_SERVICE__REFERENCE_DEPENDENCIES:
        getReferenceDependencies().clear();
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
      case CodePackage.PROVIDED_SERVICE__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
      case CodePackage.PROVIDED_SERVICE__TYPING_DEPENDENCIES:
        return typingDependencies != null && !typingDependencies.isEmpty();
      case CodePackage.PROVIDED_SERVICE__REFERENCE_DEPENDENCIES:
        return referenceDependencies != null && !referenceDependencies.isEmpty();
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

} //ProvidedServiceImpl
