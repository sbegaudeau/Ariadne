/**
 */
package fr.obeo.ariadne.model.environment.impl;

import fr.obeo.ariadne.model.environment.DevelopmentEnvironment;
import fr.obeo.ariadne.model.environment.DevelopmentTool;
import fr.obeo.ariadne.model.environment.EnvironmentPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Development Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.environment.impl.DevelopmentEnvironmentImpl#getDevelopmentTools <em>Development Tools</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DevelopmentEnvironmentImpl extends EnvironmentImpl implements DevelopmentEnvironment
{
  /**
   * The cached value of the '{@link #getDevelopmentTools() <em>Development Tools</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevelopmentTools()
   * @generated
   * @ordered
   */
  protected EList<DevelopmentTool> developmentTools;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DevelopmentEnvironmentImpl()
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
    return EnvironmentPackage.Literals.DEVELOPMENT_ENVIRONMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DevelopmentTool> getDevelopmentTools()
  {
    if (developmentTools == null)
    {
      developmentTools = new EObjectContainmentEList<DevelopmentTool>(DevelopmentTool.class, this, EnvironmentPackage.DEVELOPMENT_ENVIRONMENT__DEVELOPMENT_TOOLS);
    }
    return developmentTools;
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
      case EnvironmentPackage.DEVELOPMENT_ENVIRONMENT__DEVELOPMENT_TOOLS:
        return ((InternalEList<?>)getDevelopmentTools()).basicRemove(otherEnd, msgs);
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
      case EnvironmentPackage.DEVELOPMENT_ENVIRONMENT__DEVELOPMENT_TOOLS:
        return getDevelopmentTools();
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
      case EnvironmentPackage.DEVELOPMENT_ENVIRONMENT__DEVELOPMENT_TOOLS:
        getDevelopmentTools().clear();
        getDevelopmentTools().addAll((Collection<? extends DevelopmentTool>)newValue);
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
      case EnvironmentPackage.DEVELOPMENT_ENVIRONMENT__DEVELOPMENT_TOOLS:
        getDevelopmentTools().clear();
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
      case EnvironmentPackage.DEVELOPMENT_ENVIRONMENT__DEVELOPMENT_TOOLS:
        return developmentTools != null && !developmentTools.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DevelopmentEnvironmentImpl
