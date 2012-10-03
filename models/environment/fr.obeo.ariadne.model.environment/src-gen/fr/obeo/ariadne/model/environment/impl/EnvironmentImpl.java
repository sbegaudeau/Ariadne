/**
 */
package fr.obeo.ariadne.model.environment.impl;

import fr.obeo.ariadne.model.core.impl.ElementImpl;

import fr.obeo.ariadne.model.environment.Environment;
import fr.obeo.ariadne.model.environment.EnvironmentComponent;
import fr.obeo.ariadne.model.environment.EnvironmentPackage;

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
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.environment.impl.EnvironmentImpl#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.environment.impl.EnvironmentImpl#getWindowingSystem <em>Windowing System</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.environment.impl.EnvironmentImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.environment.impl.EnvironmentImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.environment.impl.EnvironmentImpl#getEnvironmentComponents <em>Environment Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EnvironmentImpl extends ElementImpl implements Environment
{
  /**
   * The default value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperatingSystem()
   * @generated
   * @ordered
   */
  protected static final String OPERATING_SYSTEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperatingSystem()
   * @generated
   * @ordered
   */
  protected String operatingSystem = OPERATING_SYSTEM_EDEFAULT;

  /**
   * The default value of the '{@link #getWindowingSystem() <em>Windowing System</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindowingSystem()
   * @generated
   * @ordered
   */
  protected static final String WINDOWING_SYSTEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWindowingSystem() <em>Windowing System</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWindowingSystem()
   * @generated
   * @ordered
   */
  protected String windowingSystem = WINDOWING_SYSTEM_EDEFAULT;

  /**
   * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchitecture()
   * @generated
   * @ordered
   */
  protected static final String ARCHITECTURE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchitecture()
   * @generated
   * @ordered
   */
  protected String architecture = ARCHITECTURE_EDEFAULT;

  /**
   * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocale()
   * @generated
   * @ordered
   */
  protected static final String LOCALE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocale()
   * @generated
   * @ordered
   */
  protected String locale = LOCALE_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnvironmentComponents() <em>Environment Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvironmentComponents()
   * @generated
   * @ordered
   */
  protected EList<EnvironmentComponent> environmentComponents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnvironmentImpl()
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
    return EnvironmentPackage.Literals.ENVIRONMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperatingSystem()
  {
    return operatingSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperatingSystem(String newOperatingSystem)
  {
    String oldOperatingSystem = operatingSystem;
    operatingSystem = newOperatingSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.ENVIRONMENT__OPERATING_SYSTEM, oldOperatingSystem, operatingSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWindowingSystem()
  {
    return windowingSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWindowingSystem(String newWindowingSystem)
  {
    String oldWindowingSystem = windowingSystem;
    windowingSystem = newWindowingSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.ENVIRONMENT__WINDOWING_SYSTEM, oldWindowingSystem, windowingSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArchitecture()
  {
    return architecture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArchitecture(String newArchitecture)
  {
    String oldArchitecture = architecture;
    architecture = newArchitecture;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.ENVIRONMENT__ARCHITECTURE, oldArchitecture, architecture));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocale()
  {
    return locale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocale(String newLocale)
  {
    String oldLocale = locale;
    locale = newLocale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.ENVIRONMENT__LOCALE, oldLocale, locale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnvironmentComponent> getEnvironmentComponents()
  {
    if (environmentComponents == null)
    {
      environmentComponents = new EObjectContainmentEList<EnvironmentComponent>(EnvironmentComponent.class, this, EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_COMPONENTS);
    }
    return environmentComponents;
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
      case EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_COMPONENTS:
        return ((InternalEList<?>)getEnvironmentComponents()).basicRemove(otherEnd, msgs);
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
      case EnvironmentPackage.ENVIRONMENT__OPERATING_SYSTEM:
        return getOperatingSystem();
      case EnvironmentPackage.ENVIRONMENT__WINDOWING_SYSTEM:
        return getWindowingSystem();
      case EnvironmentPackage.ENVIRONMENT__ARCHITECTURE:
        return getArchitecture();
      case EnvironmentPackage.ENVIRONMENT__LOCALE:
        return getLocale();
      case EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_COMPONENTS:
        return getEnvironmentComponents();
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
      case EnvironmentPackage.ENVIRONMENT__OPERATING_SYSTEM:
        setOperatingSystem((String)newValue);
        return;
      case EnvironmentPackage.ENVIRONMENT__WINDOWING_SYSTEM:
        setWindowingSystem((String)newValue);
        return;
      case EnvironmentPackage.ENVIRONMENT__ARCHITECTURE:
        setArchitecture((String)newValue);
        return;
      case EnvironmentPackage.ENVIRONMENT__LOCALE:
        setLocale((String)newValue);
        return;
      case EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_COMPONENTS:
        getEnvironmentComponents().clear();
        getEnvironmentComponents().addAll((Collection<? extends EnvironmentComponent>)newValue);
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
      case EnvironmentPackage.ENVIRONMENT__OPERATING_SYSTEM:
        setOperatingSystem(OPERATING_SYSTEM_EDEFAULT);
        return;
      case EnvironmentPackage.ENVIRONMENT__WINDOWING_SYSTEM:
        setWindowingSystem(WINDOWING_SYSTEM_EDEFAULT);
        return;
      case EnvironmentPackage.ENVIRONMENT__ARCHITECTURE:
        setArchitecture(ARCHITECTURE_EDEFAULT);
        return;
      case EnvironmentPackage.ENVIRONMENT__LOCALE:
        setLocale(LOCALE_EDEFAULT);
        return;
      case EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_COMPONENTS:
        getEnvironmentComponents().clear();
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
      case EnvironmentPackage.ENVIRONMENT__OPERATING_SYSTEM:
        return OPERATING_SYSTEM_EDEFAULT == null ? operatingSystem != null : !OPERATING_SYSTEM_EDEFAULT.equals(operatingSystem);
      case EnvironmentPackage.ENVIRONMENT__WINDOWING_SYSTEM:
        return WINDOWING_SYSTEM_EDEFAULT == null ? windowingSystem != null : !WINDOWING_SYSTEM_EDEFAULT.equals(windowingSystem);
      case EnvironmentPackage.ENVIRONMENT__ARCHITECTURE:
        return ARCHITECTURE_EDEFAULT == null ? architecture != null : !ARCHITECTURE_EDEFAULT.equals(architecture);
      case EnvironmentPackage.ENVIRONMENT__LOCALE:
        return LOCALE_EDEFAULT == null ? locale != null : !LOCALE_EDEFAULT.equals(locale);
      case EnvironmentPackage.ENVIRONMENT__ENVIRONMENT_COMPONENTS:
        return environmentComponents != null && !environmentComponents.isEmpty();
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
    result.append(" (operatingSystem: ");
    result.append(operatingSystem);
    result.append(", windowingSystem: ");
    result.append(windowingSystem);
    result.append(", architecture: ");
    result.append(architecture);
    result.append(", locale: ");
    result.append(locale);
    result.append(')');
    return result.toString();
  }

} //EnvironmentImpl
