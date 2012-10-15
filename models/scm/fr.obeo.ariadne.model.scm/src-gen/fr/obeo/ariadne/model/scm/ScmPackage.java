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
package fr.obeo.ariadne.model.scm;

import fr.obeo.ariadne.model.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.scm.ScmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='fr.obeo.ariadne.model' editDirectory='/fr.obeo.ariadne.model.scm.edit/src-gen' editorDirectory='/fr.obeo.ariadne.model.scm.editor/src-gen' fileExtensions='ariadnescm' copyrightText='Copyright (c) 2012 Obeo.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n\r\nContributors:\r\n    Stephane Begaudeau (Obeo) - initial API and implementation'"
 * @generated
 */
public interface ScmPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "scm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.obeo.fr/dsl/Ariadne/SCM";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ariadne-scm";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ScmPackage eINSTANCE = fr.obeo.ariadne.model.scm.impl.ScmPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.scm.impl.RepositoryImpl <em>Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.scm.impl.RepositoryImpl
   * @see fr.obeo.ariadne.model.scm.impl.ScmPackageImpl#getRepository()
   * @generated
   */
  int REPOSITORY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__NAME = CorePackage.VERSIONED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__DESCRIPTION = CorePackage.VERSIONED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Authors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__AUTHORS = CorePackage.VERSIONED_ELEMENT__AUTHORS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__PROPERTIES = CorePackage.VERSIONED_ELEMENT__PROPERTIES;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__VERSION = CorePackage.VERSIONED_ELEMENT__VERSION;

  /**
   * The feature id for the '<em><b>Versioned Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__VERSIONED_DEPENDENCIES = CorePackage.VERSIONED_ELEMENT__VERSIONED_DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Branches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__BRANCHES = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Commits</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__COMMITS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__TAGS = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_FEATURE_COUNT = CorePackage.VERSIONED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_OPERATION_COUNT = CorePackage.VERSIONED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.scm.impl.BranchImpl <em>Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.scm.impl.BranchImpl
   * @see fr.obeo.ariadne.model.scm.impl.ScmPackageImpl#getBranch()
   * @generated
   */
  int BRANCH = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__NAME = 0;

  /**
   * The feature id for the '<em><b>Commit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__COMMIT = 1;

  /**
   * The number of structural features of the '<em>Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.scm.impl.TagImpl <em>Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.scm.impl.TagImpl
   * @see fr.obeo.ariadne.model.scm.impl.ScmPackageImpl#getTag()
   * @generated
   */
  int TAG = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__NAME = 0;

  /**
   * The feature id for the '<em><b>Commit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__COMMIT = 1;

  /**
   * The number of structural features of the '<em>Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.scm.impl.CommitImpl <em>Commit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.scm.impl.CommitImpl
   * @see fr.obeo.ariadne.model.scm.impl.ScmPackageImpl#getCommit()
   * @generated
   */
  int COMMIT = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMIT__ID = 0;

  /**
   * The feature id for the '<em><b>Commit Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMIT__COMMIT_TIME = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMIT__NAME = 2;

  /**
   * The feature id for the '<em><b>Short Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMIT__SHORT_MESSAGE = 3;

  /**
   * The feature id for the '<em><b>Full Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMIT__FULL_MESSAGE = 4;

  /**
   * The feature id for the '<em><b>Resource Changes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMIT__RESOURCE_CHANGES = 5;

  /**
   * The feature id for the '<em><b>Author</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMIT__AUTHOR = 6;

  /**
   * The feature id for the '<em><b>Committer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMIT__COMMITTER = 7;

  /**
   * The feature id for the '<em><b>Parents</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMIT__PARENTS = 8;

  /**
   * The number of structural features of the '<em>Commit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMIT_FEATURE_COUNT = 9;

  /**
   * The number of operations of the '<em>Commit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMIT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.scm.impl.ResourceChangeImpl <em>Resource Change</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.scm.impl.ResourceChangeImpl
   * @see fr.obeo.ariadne.model.scm.impl.ScmPackageImpl#getResourceChange()
   * @generated
   */
  int RESOURCE_CHANGE = 4;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CHANGE__PATH = 0;

  /**
   * The feature id for the '<em><b>Resource Change Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CHANGE__RESOURCE_CHANGE_KIND = 1;

  /**
   * The feature id for the '<em><b>Versioned Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CHANGE__VERSIONED_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Resource Change</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CHANGE_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Resource Change</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_CHANGE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.obeo.ariadne.model.scm.ResourceChangeKind <em>Resource Change Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.obeo.ariadne.model.scm.ResourceChangeKind
   * @see fr.obeo.ariadne.model.scm.impl.ScmPackageImpl#getResourceChangeKind()
   * @generated
   */
  int RESOURCE_CHANGE_KIND = 5;


  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.scm.Repository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository</em>'.
   * @see fr.obeo.ariadne.model.scm.Repository
   * @generated
   */
  EClass getRepository();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.scm.Repository#getBranches <em>Branches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Branches</em>'.
   * @see fr.obeo.ariadne.model.scm.Repository#getBranches()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Branches();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.scm.Repository#getCommits <em>Commits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commits</em>'.
   * @see fr.obeo.ariadne.model.scm.Repository#getCommits()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Commits();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.scm.Repository#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tags</em>'.
   * @see fr.obeo.ariadne.model.scm.Repository#getTags()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Tags();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.scm.Branch <em>Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Branch</em>'.
   * @see fr.obeo.ariadne.model.scm.Branch
   * @generated
   */
  EClass getBranch();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.scm.Branch#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.obeo.ariadne.model.scm.Branch#getName()
   * @see #getBranch()
   * @generated
   */
  EAttribute getBranch_Name();

  /**
   * Returns the meta object for the reference '{@link fr.obeo.ariadne.model.scm.Branch#getCommit <em>Commit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Commit</em>'.
   * @see fr.obeo.ariadne.model.scm.Branch#getCommit()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_Commit();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.scm.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag</em>'.
   * @see fr.obeo.ariadne.model.scm.Tag
   * @generated
   */
  EClass getTag();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.scm.Tag#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.obeo.ariadne.model.scm.Tag#getName()
   * @see #getTag()
   * @generated
   */
  EAttribute getTag_Name();

  /**
   * Returns the meta object for the reference '{@link fr.obeo.ariadne.model.scm.Tag#getCommit <em>Commit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Commit</em>'.
   * @see fr.obeo.ariadne.model.scm.Tag#getCommit()
   * @see #getTag()
   * @generated
   */
  EReference getTag_Commit();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.scm.Commit <em>Commit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Commit</em>'.
   * @see fr.obeo.ariadne.model.scm.Commit
   * @generated
   */
  EClass getCommit();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.scm.Commit#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see fr.obeo.ariadne.model.scm.Commit#getId()
   * @see #getCommit()
   * @generated
   */
  EAttribute getCommit_Id();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.scm.Commit#getCommitTime <em>Commit Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Commit Time</em>'.
   * @see fr.obeo.ariadne.model.scm.Commit#getCommitTime()
   * @see #getCommit()
   * @generated
   */
  EAttribute getCommit_CommitTime();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.scm.Commit#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.obeo.ariadne.model.scm.Commit#getName()
   * @see #getCommit()
   * @generated
   */
  EAttribute getCommit_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.scm.Commit#getShortMessage <em>Short Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Short Message</em>'.
   * @see fr.obeo.ariadne.model.scm.Commit#getShortMessage()
   * @see #getCommit()
   * @generated
   */
  EAttribute getCommit_ShortMessage();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.scm.Commit#getFullMessage <em>Full Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Full Message</em>'.
   * @see fr.obeo.ariadne.model.scm.Commit#getFullMessage()
   * @see #getCommit()
   * @generated
   */
  EAttribute getCommit_FullMessage();

  /**
   * Returns the meta object for the containment reference list '{@link fr.obeo.ariadne.model.scm.Commit#getResourceChanges <em>Resource Changes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resource Changes</em>'.
   * @see fr.obeo.ariadne.model.scm.Commit#getResourceChanges()
   * @see #getCommit()
   * @generated
   */
  EReference getCommit_ResourceChanges();

  /**
   * Returns the meta object for the reference '{@link fr.obeo.ariadne.model.scm.Commit#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Author</em>'.
   * @see fr.obeo.ariadne.model.scm.Commit#getAuthor()
   * @see #getCommit()
   * @generated
   */
  EReference getCommit_Author();

  /**
   * Returns the meta object for the reference '{@link fr.obeo.ariadne.model.scm.Commit#getCommitter <em>Committer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Committer</em>'.
   * @see fr.obeo.ariadne.model.scm.Commit#getCommitter()
   * @see #getCommit()
   * @generated
   */
  EReference getCommit_Committer();

  /**
   * Returns the meta object for the reference list '{@link fr.obeo.ariadne.model.scm.Commit#getParents <em>Parents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Parents</em>'.
   * @see fr.obeo.ariadne.model.scm.Commit#getParents()
   * @see #getCommit()
   * @generated
   */
  EReference getCommit_Parents();

  /**
   * Returns the meta object for class '{@link fr.obeo.ariadne.model.scm.ResourceChange <em>Resource Change</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Change</em>'.
   * @see fr.obeo.ariadne.model.scm.ResourceChange
   * @generated
   */
  EClass getResourceChange();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.scm.ResourceChange#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see fr.obeo.ariadne.model.scm.ResourceChange#getPath()
   * @see #getResourceChange()
   * @generated
   */
  EAttribute getResourceChange_Path();

  /**
   * Returns the meta object for the attribute '{@link fr.obeo.ariadne.model.scm.ResourceChange#getResourceChangeKind <em>Resource Change Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resource Change Kind</em>'.
   * @see fr.obeo.ariadne.model.scm.ResourceChange#getResourceChangeKind()
   * @see #getResourceChange()
   * @generated
   */
  EAttribute getResourceChange_ResourceChangeKind();

  /**
   * Returns the meta object for the reference '{@link fr.obeo.ariadne.model.scm.ResourceChange#getVersionedElement <em>Versioned Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Versioned Element</em>'.
   * @see fr.obeo.ariadne.model.scm.ResourceChange#getVersionedElement()
   * @see #getResourceChange()
   * @generated
   */
  EReference getResourceChange_VersionedElement();

  /**
   * Returns the meta object for enum '{@link fr.obeo.ariadne.model.scm.ResourceChangeKind <em>Resource Change Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Resource Change Kind</em>'.
   * @see fr.obeo.ariadne.model.scm.ResourceChangeKind
   * @generated
   */
  EEnum getResourceChangeKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ScmFactory getScmFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.scm.impl.RepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.scm.impl.RepositoryImpl
     * @see fr.obeo.ariadne.model.scm.impl.ScmPackageImpl#getRepository()
     * @generated
     */
    EClass REPOSITORY = eINSTANCE.getRepository();

    /**
     * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY__BRANCHES = eINSTANCE.getRepository_Branches();

    /**
     * The meta object literal for the '<em><b>Commits</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY__COMMITS = eINSTANCE.getRepository_Commits();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY__TAGS = eINSTANCE.getRepository_Tags();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.scm.impl.BranchImpl <em>Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.scm.impl.BranchImpl
     * @see fr.obeo.ariadne.model.scm.impl.ScmPackageImpl#getBranch()
     * @generated
     */
    EClass BRANCH = eINSTANCE.getBranch();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRANCH__NAME = eINSTANCE.getBranch_Name();

    /**
     * The meta object literal for the '<em><b>Commit</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH__COMMIT = eINSTANCE.getBranch_Commit();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.scm.impl.TagImpl <em>Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.scm.impl.TagImpl
     * @see fr.obeo.ariadne.model.scm.impl.ScmPackageImpl#getTag()
     * @generated
     */
    EClass TAG = eINSTANCE.getTag();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG__NAME = eINSTANCE.getTag_Name();

    /**
     * The meta object literal for the '<em><b>Commit</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG__COMMIT = eINSTANCE.getTag_Commit();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.scm.impl.CommitImpl <em>Commit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.scm.impl.CommitImpl
     * @see fr.obeo.ariadne.model.scm.impl.ScmPackageImpl#getCommit()
     * @generated
     */
    EClass COMMIT = eINSTANCE.getCommit();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMIT__ID = eINSTANCE.getCommit_Id();

    /**
     * The meta object literal for the '<em><b>Commit Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMIT__COMMIT_TIME = eINSTANCE.getCommit_CommitTime();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMIT__NAME = eINSTANCE.getCommit_Name();

    /**
     * The meta object literal for the '<em><b>Short Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMIT__SHORT_MESSAGE = eINSTANCE.getCommit_ShortMessage();

    /**
     * The meta object literal for the '<em><b>Full Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMIT__FULL_MESSAGE = eINSTANCE.getCommit_FullMessage();

    /**
     * The meta object literal for the '<em><b>Resource Changes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMIT__RESOURCE_CHANGES = eINSTANCE.getCommit_ResourceChanges();

    /**
     * The meta object literal for the '<em><b>Author</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMIT__AUTHOR = eINSTANCE.getCommit_Author();

    /**
     * The meta object literal for the '<em><b>Committer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMIT__COMMITTER = eINSTANCE.getCommit_Committer();

    /**
     * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMIT__PARENTS = eINSTANCE.getCommit_Parents();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.scm.impl.ResourceChangeImpl <em>Resource Change</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.scm.impl.ResourceChangeImpl
     * @see fr.obeo.ariadne.model.scm.impl.ScmPackageImpl#getResourceChange()
     * @generated
     */
    EClass RESOURCE_CHANGE = eINSTANCE.getResourceChange();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_CHANGE__PATH = eINSTANCE.getResourceChange_Path();

    /**
     * The meta object literal for the '<em><b>Resource Change Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_CHANGE__RESOURCE_CHANGE_KIND = eINSTANCE.getResourceChange_ResourceChangeKind();

    /**
     * The meta object literal for the '<em><b>Versioned Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_CHANGE__VERSIONED_ELEMENT = eINSTANCE.getResourceChange_VersionedElement();

    /**
     * The meta object literal for the '{@link fr.obeo.ariadne.model.scm.ResourceChangeKind <em>Resource Change Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.obeo.ariadne.model.scm.ResourceChangeKind
     * @see fr.obeo.ariadne.model.scm.impl.ScmPackageImpl#getResourceChangeKind()
     * @generated
     */
    EEnum RESOURCE_CHANGE_KIND = eINSTANCE.getResourceChangeKind();

  }

} //ScmPackage
