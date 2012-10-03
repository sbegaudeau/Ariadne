/**
 */
package fr.obeo.ariadne.model.scm.impl;

import fr.obeo.ariadne.model.core.Person;

import fr.obeo.ariadne.model.scm.Commit;
import fr.obeo.ariadne.model.scm.ResourceChange;
import fr.obeo.ariadne.model.scm.ScmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.scm.impl.CommitImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.impl.CommitImpl#getCommitTime <em>Commit Time</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.impl.CommitImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.impl.CommitImpl#getShortMessage <em>Short Message</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.impl.CommitImpl#getFullMessage <em>Full Message</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.impl.CommitImpl#getResourceChanges <em>Resource Changes</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.impl.CommitImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.impl.CommitImpl#getCommitter <em>Committer</em>}</li>
 *   <li>{@link fr.obeo.ariadne.model.scm.impl.CommitImpl#getParents <em>Parents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommitImpl extends MinimalEObjectImpl.Container implements Commit
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getCommitTime() <em>Commit Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommitTime()
   * @generated
   * @ordered
   */
  protected static final int COMMIT_TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCommitTime() <em>Commit Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommitTime()
   * @generated
   * @ordered
   */
  protected int commitTime = COMMIT_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getShortMessage() <em>Short Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortMessage()
   * @generated
   * @ordered
   */
  protected static final String SHORT_MESSAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShortMessage() <em>Short Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortMessage()
   * @generated
   * @ordered
   */
  protected String shortMessage = SHORT_MESSAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getFullMessage() <em>Full Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullMessage()
   * @generated
   * @ordered
   */
  protected static final String FULL_MESSAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFullMessage() <em>Full Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullMessage()
   * @generated
   * @ordered
   */
  protected String fullMessage = FULL_MESSAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getResourceChanges() <em>Resource Changes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceChanges()
   * @generated
   * @ordered
   */
  protected EList<ResourceChange> resourceChanges;

  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected Person author;

  /**
   * The cached value of the '{@link #getCommitter() <em>Committer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommitter()
   * @generated
   * @ordered
   */
  protected Person committer;

  /**
   * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParents()
   * @generated
   * @ordered
   */
  protected EList<Commit> parents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommitImpl()
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
    return ScmPackage.Literals.COMMIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScmPackage.COMMIT__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCommitTime()
  {
    return commitTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommitTime(int newCommitTime)
  {
    int oldCommitTime = commitTime;
    commitTime = newCommitTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScmPackage.COMMIT__COMMIT_TIME, oldCommitTime, commitTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScmPackage.COMMIT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShortMessage()
  {
    return shortMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortMessage(String newShortMessage)
  {
    String oldShortMessage = shortMessage;
    shortMessage = newShortMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScmPackage.COMMIT__SHORT_MESSAGE, oldShortMessage, shortMessage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFullMessage()
  {
    return fullMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFullMessage(String newFullMessage)
  {
    String oldFullMessage = fullMessage;
    fullMessage = newFullMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScmPackage.COMMIT__FULL_MESSAGE, oldFullMessage, fullMessage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourceChange> getResourceChanges()
  {
    if (resourceChanges == null)
    {
      resourceChanges = new EObjectContainmentEList<ResourceChange>(ResourceChange.class, this, ScmPackage.COMMIT__RESOURCE_CHANGES);
    }
    return resourceChanges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person getAuthor()
  {
    if (author != null && author.eIsProxy())
    {
      InternalEObject oldAuthor = (InternalEObject)author;
      author = (Person)eResolveProxy(oldAuthor);
      if (author != oldAuthor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScmPackage.COMMIT__AUTHOR, oldAuthor, author));
      }
    }
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person basicGetAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthor(Person newAuthor)
  {
    Person oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScmPackage.COMMIT__AUTHOR, oldAuthor, author));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person getCommitter()
  {
    if (committer != null && committer.eIsProxy())
    {
      InternalEObject oldCommitter = (InternalEObject)committer;
      committer = (Person)eResolveProxy(oldCommitter);
      if (committer != oldCommitter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScmPackage.COMMIT__COMMITTER, oldCommitter, committer));
      }
    }
    return committer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person basicGetCommitter()
  {
    return committer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommitter(Person newCommitter)
  {
    Person oldCommitter = committer;
    committer = newCommitter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScmPackage.COMMIT__COMMITTER, oldCommitter, committer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Commit> getParents()
  {
    if (parents == null)
    {
      parents = new EObjectResolvingEList<Commit>(Commit.class, this, ScmPackage.COMMIT__PARENTS);
    }
    return parents;
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
      case ScmPackage.COMMIT__RESOURCE_CHANGES:
        return ((InternalEList<?>)getResourceChanges()).basicRemove(otherEnd, msgs);
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
      case ScmPackage.COMMIT__ID:
        return getId();
      case ScmPackage.COMMIT__COMMIT_TIME:
        return getCommitTime();
      case ScmPackage.COMMIT__NAME:
        return getName();
      case ScmPackage.COMMIT__SHORT_MESSAGE:
        return getShortMessage();
      case ScmPackage.COMMIT__FULL_MESSAGE:
        return getFullMessage();
      case ScmPackage.COMMIT__RESOURCE_CHANGES:
        return getResourceChanges();
      case ScmPackage.COMMIT__AUTHOR:
        if (resolve) return getAuthor();
        return basicGetAuthor();
      case ScmPackage.COMMIT__COMMITTER:
        if (resolve) return getCommitter();
        return basicGetCommitter();
      case ScmPackage.COMMIT__PARENTS:
        return getParents();
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
      case ScmPackage.COMMIT__ID:
        setId((String)newValue);
        return;
      case ScmPackage.COMMIT__COMMIT_TIME:
        setCommitTime((Integer)newValue);
        return;
      case ScmPackage.COMMIT__NAME:
        setName((String)newValue);
        return;
      case ScmPackage.COMMIT__SHORT_MESSAGE:
        setShortMessage((String)newValue);
        return;
      case ScmPackage.COMMIT__FULL_MESSAGE:
        setFullMessage((String)newValue);
        return;
      case ScmPackage.COMMIT__RESOURCE_CHANGES:
        getResourceChanges().clear();
        getResourceChanges().addAll((Collection<? extends ResourceChange>)newValue);
        return;
      case ScmPackage.COMMIT__AUTHOR:
        setAuthor((Person)newValue);
        return;
      case ScmPackage.COMMIT__COMMITTER:
        setCommitter((Person)newValue);
        return;
      case ScmPackage.COMMIT__PARENTS:
        getParents().clear();
        getParents().addAll((Collection<? extends Commit>)newValue);
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
      case ScmPackage.COMMIT__ID:
        setId(ID_EDEFAULT);
        return;
      case ScmPackage.COMMIT__COMMIT_TIME:
        setCommitTime(COMMIT_TIME_EDEFAULT);
        return;
      case ScmPackage.COMMIT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScmPackage.COMMIT__SHORT_MESSAGE:
        setShortMessage(SHORT_MESSAGE_EDEFAULT);
        return;
      case ScmPackage.COMMIT__FULL_MESSAGE:
        setFullMessage(FULL_MESSAGE_EDEFAULT);
        return;
      case ScmPackage.COMMIT__RESOURCE_CHANGES:
        getResourceChanges().clear();
        return;
      case ScmPackage.COMMIT__AUTHOR:
        setAuthor((Person)null);
        return;
      case ScmPackage.COMMIT__COMMITTER:
        setCommitter((Person)null);
        return;
      case ScmPackage.COMMIT__PARENTS:
        getParents().clear();
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
      case ScmPackage.COMMIT__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ScmPackage.COMMIT__COMMIT_TIME:
        return commitTime != COMMIT_TIME_EDEFAULT;
      case ScmPackage.COMMIT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScmPackage.COMMIT__SHORT_MESSAGE:
        return SHORT_MESSAGE_EDEFAULT == null ? shortMessage != null : !SHORT_MESSAGE_EDEFAULT.equals(shortMessage);
      case ScmPackage.COMMIT__FULL_MESSAGE:
        return FULL_MESSAGE_EDEFAULT == null ? fullMessage != null : !FULL_MESSAGE_EDEFAULT.equals(fullMessage);
      case ScmPackage.COMMIT__RESOURCE_CHANGES:
        return resourceChanges != null && !resourceChanges.isEmpty();
      case ScmPackage.COMMIT__AUTHOR:
        return author != null;
      case ScmPackage.COMMIT__COMMITTER:
        return committer != null;
      case ScmPackage.COMMIT__PARENTS:
        return parents != null && !parents.isEmpty();
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
    result.append(" (id: ");
    result.append(id);
    result.append(", commitTime: ");
    result.append(commitTime);
    result.append(", name: ");
    result.append(name);
    result.append(", shortMessage: ");
    result.append(shortMessage);
    result.append(", fullMessage: ");
    result.append(fullMessage);
    result.append(')');
    return result.toString();
  }

} //CommitImpl
