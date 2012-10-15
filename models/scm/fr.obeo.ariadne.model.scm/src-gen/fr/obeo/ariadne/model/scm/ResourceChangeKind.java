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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Change Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.scm.ScmPackage#getResourceChangeKind()
 * @model
 * @generated
 */
public enum ResourceChangeKind implements Enumerator
{
  /**
   * The '<em><b>ADDED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADDED_VALUE
   * @generated
   * @ordered
   */
  ADDED(0, "ADDED", "ADDED"),

  /**
   * The '<em><b>DELETED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DELETED_VALUE
   * @generated
   * @ordered
   */
  DELETED(1, "DELETED", "DELETED"),

  /**
   * The '<em><b>MODIFIED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MODIFIED_VALUE
   * @generated
   * @ordered
   */
  MODIFIED(2, "MODIFIED", "MODIFIED"),

  /**
   * The '<em><b>COPIED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COPIED_VALUE
   * @generated
   * @ordered
   */
  COPIED(3, "COPIED", "COPIED"),

  /**
   * The '<em><b>RENAMED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RENAMED_VALUE
   * @generated
   * @ordered
   */
  RENAMED(4, "RENAMED", "RENAMED");

  /**
   * The '<em><b>ADDED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ADDED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ADDED
   * @model
   * @generated
   * @ordered
   */
  public static final int ADDED_VALUE = 0;

  /**
   * The '<em><b>DELETED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DELETED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DELETED
   * @model
   * @generated
   * @ordered
   */
  public static final int DELETED_VALUE = 1;

  /**
   * The '<em><b>MODIFIED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MODIFIED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MODIFIED
   * @model
   * @generated
   * @ordered
   */
  public static final int MODIFIED_VALUE = 2;

  /**
   * The '<em><b>COPIED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COPIED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COPIED
   * @model
   * @generated
   * @ordered
   */
  public static final int COPIED_VALUE = 3;

  /**
   * The '<em><b>RENAMED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RENAMED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RENAMED
   * @model
   * @generated
   * @ordered
   */
  public static final int RENAMED_VALUE = 4;

  /**
   * An array of all the '<em><b>Resource Change Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ResourceChangeKind[] VALUES_ARRAY =
    new ResourceChangeKind[]
    {
      ADDED,
      DELETED,
      MODIFIED,
      COPIED,
      RENAMED,
    };

  /**
   * A public read-only list of all the '<em><b>Resource Change Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ResourceChangeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Resource Change Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ResourceChangeKind get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ResourceChangeKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Resource Change Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ResourceChangeKind getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ResourceChangeKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Resource Change Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ResourceChangeKind get(int value)
  {
    switch (value)
    {
      case ADDED_VALUE: return ADDED;
      case DELETED_VALUE: return DELETED;
      case MODIFIED_VALUE: return MODIFIED;
      case COPIED_VALUE: return COPIED;
      case RENAMED_VALUE: return RENAMED;
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
  private ResourceChangeKind(int value, String name, String literal)
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
  
} //ResourceChangeKind
