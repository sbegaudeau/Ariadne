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
package fr.obeo.ariadne.model.scm.impl;

import fr.obeo.ariadne.model.core.CorePackage;

import fr.obeo.ariadne.model.scm.Branch;
import fr.obeo.ariadne.model.scm.Commit;
import fr.obeo.ariadne.model.scm.Repository;
import fr.obeo.ariadne.model.scm.ResourceChange;
import fr.obeo.ariadne.model.scm.ResourceChangeKind;
import fr.obeo.ariadne.model.scm.ScmFactory;
import fr.obeo.ariadne.model.scm.ScmPackage;
import fr.obeo.ariadne.model.scm.Tag;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScmPackageImpl extends EPackageImpl implements ScmPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repositoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass branchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceChangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum resourceChangeKindEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.obeo.ariadne.model.scm.ScmPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ScmPackageImpl()
  {
    super(eNS_URI, ScmFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ScmPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ScmPackage init()
  {
    if (isInited) return (ScmPackage)EPackage.Registry.INSTANCE.getEPackage(ScmPackage.eNS_URI);

    // Obtain or create and register package
    ScmPackageImpl theScmPackage = (ScmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScmPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    CorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theScmPackage.createPackageContents();

    // Initialize created meta-data
    theScmPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theScmPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ScmPackage.eNS_URI, theScmPackage);
    return theScmPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepository()
  {
    return repositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepository_Branches()
  {
    return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepository_Commits()
  {
    return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepository_Tags()
  {
    return (EReference)repositoryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBranch()
  {
    return branchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBranch_Name()
  {
    return (EAttribute)branchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBranch_Commit()
  {
    return (EReference)branchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTag()
  {
    return tagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTag_Name()
  {
    return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTag_Commit()
  {
    return (EReference)tagEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommit()
  {
    return commitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommit_Id()
  {
    return (EAttribute)commitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommit_CommitTime()
  {
    return (EAttribute)commitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommit_Name()
  {
    return (EAttribute)commitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommit_ShortMessage()
  {
    return (EAttribute)commitEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommit_FullMessage()
  {
    return (EAttribute)commitEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommit_ResourceChanges()
  {
    return (EReference)commitEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommit_Author()
  {
    return (EReference)commitEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommit_Committer()
  {
    return (EReference)commitEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommit_Parents()
  {
    return (EReference)commitEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceChange()
  {
    return resourceChangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceChange_Path()
  {
    return (EAttribute)resourceChangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceChange_ResourceChangeKind()
  {
    return (EAttribute)resourceChangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getResourceChangeKind()
  {
    return resourceChangeKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScmFactory getScmFactory()
  {
    return (ScmFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    repositoryEClass = createEClass(REPOSITORY);
    createEReference(repositoryEClass, REPOSITORY__BRANCHES);
    createEReference(repositoryEClass, REPOSITORY__COMMITS);
    createEReference(repositoryEClass, REPOSITORY__TAGS);

    branchEClass = createEClass(BRANCH);
    createEAttribute(branchEClass, BRANCH__NAME);
    createEReference(branchEClass, BRANCH__COMMIT);

    tagEClass = createEClass(TAG);
    createEAttribute(tagEClass, TAG__NAME);
    createEReference(tagEClass, TAG__COMMIT);

    commitEClass = createEClass(COMMIT);
    createEAttribute(commitEClass, COMMIT__ID);
    createEAttribute(commitEClass, COMMIT__COMMIT_TIME);
    createEAttribute(commitEClass, COMMIT__NAME);
    createEAttribute(commitEClass, COMMIT__SHORT_MESSAGE);
    createEAttribute(commitEClass, COMMIT__FULL_MESSAGE);
    createEReference(commitEClass, COMMIT__RESOURCE_CHANGES);
    createEReference(commitEClass, COMMIT__AUTHOR);
    createEReference(commitEClass, COMMIT__COMMITTER);
    createEReference(commitEClass, COMMIT__PARENTS);

    resourceChangeEClass = createEClass(RESOURCE_CHANGE);
    createEAttribute(resourceChangeEClass, RESOURCE_CHANGE__PATH);
    createEAttribute(resourceChangeEClass, RESOURCE_CHANGE__RESOURCE_CHANGE_KIND);

    // Create enums
    resourceChangeKindEEnum = createEEnum(RESOURCE_CHANGE_KIND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    repositoryEClass.getESuperTypes().add(theCorePackage.getVersionedElement());

    // Initialize classes, features, and operations; add parameters
    initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRepository_Branches(), this.getBranch(), null, "branches", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepository_Commits(), this.getCommit(), null, "commits", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepository_Tags(), this.getTag(), null, "tags", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBranch_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBranch_Commit(), this.getCommit(), null, "commit", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTag_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTag_Commit(), this.getCommit(), null, "commit", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commitEClass, Commit.class, "Commit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCommit_Id(), theEcorePackage.getEString(), "id", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommit_CommitTime(), theEcorePackage.getEInt(), "commitTime", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommit_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommit_ShortMessage(), theEcorePackage.getEString(), "shortMessage", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommit_FullMessage(), theEcorePackage.getEString(), "fullMessage", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommit_ResourceChanges(), this.getResourceChange(), null, "resourceChanges", null, 0, -1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommit_Author(), theCorePackage.getPerson(), null, "author", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommit_Committer(), theCorePackage.getPerson(), null, "committer", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommit_Parents(), this.getCommit(), null, "parents", null, 0, -1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceChangeEClass, ResourceChange.class, "ResourceChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceChange_Path(), theEcorePackage.getEString(), "path", null, 0, 1, ResourceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceChange_ResourceChangeKind(), this.getResourceChangeKind(), "resourceChangeKind", null, 0, 1, ResourceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(resourceChangeKindEEnum, ResourceChangeKind.class, "ResourceChangeKind");
    addEEnumLiteral(resourceChangeKindEEnum, ResourceChangeKind.ADDED);
    addEEnumLiteral(resourceChangeKindEEnum, ResourceChangeKind.DELETED);
    addEEnumLiteral(resourceChangeKindEEnum, ResourceChangeKind.MODIFIED);
    addEEnumLiteral(resourceChangeKindEEnum, ResourceChangeKind.COPIED);
    addEEnumLiteral(resourceChangeKindEEnum, ResourceChangeKind.RENAMED);

    // Create resource
    createResource(eNS_URI);
  }

} //ScmPackageImpl
