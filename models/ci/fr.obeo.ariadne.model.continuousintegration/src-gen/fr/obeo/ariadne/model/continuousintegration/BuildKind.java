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
package fr.obeo.ariadne.model.continuousintegration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Build Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.continuousintegration.ContinuousintegrationPackage#getBuildKind()
 * @model
 * @generated
 */
public enum BuildKind implements Enumerator
{
  /**
   * The '<em><b>RELEASE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RELEASE_VALUE
   * @generated
   * @ordered
   */
  RELEASE(0, "RELEASE", "RELEASE"),

  /**
   * The '<em><b>RELEASE CANDIDATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RELEASE_CANDIDATE_VALUE
   * @generated
   * @ordered
   */
  RELEASE_CANDIDATE(0, "RELEASE_CANDIDATE", "RELEASE_CANDIDATE"),

  /**
   * The '<em><b>MILESTONE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MILESTONE_VALUE
   * @generated
   * @ordered
   */
  MILESTONE(0, "MILESTONE", "MILESTONE"),

  /**
   * The '<em><b>NIGHTLY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NIGHTLY_VALUE
   * @generated
   * @ordered
   */
  NIGHTLY(0, "NIGHTLY", "NIGHTLY"),

  /**
   * The '<em><b>BETA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BETA_VALUE
   * @generated
   * @ordered
   */
  BETA(0, "BETA", "BETA"),

  /**
   * The '<em><b>ALPHA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALPHA_VALUE
   * @generated
   * @ordered
   */
  ALPHA(0, "ALPHA", "ALPHA"),

  /**
   * The '<em><b>PROOF OF CONCEPT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROOF_OF_CONCEPT_VALUE
   * @generated
   * @ordered
   */
  PROOF_OF_CONCEPT(0, "PROOF_OF_CONCEPT", "PROOF_OF_CONCEPT");

  /**
   * The '<em><b>RELEASE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RELEASE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RELEASE
   * @model
   * @generated
   * @ordered
   */
  public static final int RELEASE_VALUE = 0;

  /**
   * The '<em><b>RELEASE CANDIDATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RELEASE CANDIDATE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RELEASE_CANDIDATE
   * @model
   * @generated
   * @ordered
   */
  public static final int RELEASE_CANDIDATE_VALUE = 0;

  /**
   * The '<em><b>MILESTONE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MILESTONE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MILESTONE
   * @model
   * @generated
   * @ordered
   */
  public static final int MILESTONE_VALUE = 0;

  /**
   * The '<em><b>NIGHTLY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NIGHTLY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NIGHTLY
   * @model
   * @generated
   * @ordered
   */
  public static final int NIGHTLY_VALUE = 0;

  /**
   * The '<em><b>BETA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BETA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BETA
   * @model
   * @generated
   * @ordered
   */
  public static final int BETA_VALUE = 0;

  /**
   * The '<em><b>ALPHA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALPHA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALPHA
   * @model
   * @generated
   * @ordered
   */
  public static final int ALPHA_VALUE = 0;

  /**
   * The '<em><b>PROOF OF CONCEPT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROOF OF CONCEPT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROOF_OF_CONCEPT
   * @model
   * @generated
   * @ordered
   */
  public static final int PROOF_OF_CONCEPT_VALUE = 0;

  /**
   * An array of all the '<em><b>Build Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BuildKind[] VALUES_ARRAY =
    new BuildKind[]
    {
      RELEASE,
      RELEASE_CANDIDATE,
      MILESTONE,
      NIGHTLY,
      BETA,
      ALPHA,
      PROOF_OF_CONCEPT,
    };

  /**
   * A public read-only list of all the '<em><b>Build Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BuildKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Build Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuildKind get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BuildKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Build Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuildKind getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BuildKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Build Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuildKind get(int value)
  {
    switch (value)
    {
      case RELEASE_VALUE: return RELEASE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private BuildKind(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //BuildKind
