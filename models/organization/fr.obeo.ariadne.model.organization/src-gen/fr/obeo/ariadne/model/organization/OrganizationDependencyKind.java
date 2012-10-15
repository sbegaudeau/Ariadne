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
package fr.obeo.ariadne.model.organization;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dependency Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.obeo.ariadne.model.organization.OrganizationPackage#getOrganizationDependencyKind()
 * @model
 * @generated
 */
public enum OrganizationDependencyKind implements Enumerator
{
  /**
   * The '<em><b>PARTNER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PARTNER_VALUE
   * @generated
   * @ordered
   */
  PARTNER(0, "PARTNER", "PARTNER"),

  /**
   * The '<em><b>COMPETITOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPETITOR_VALUE
   * @generated
   * @ordered
   */
  COMPETITOR(0, "COMPETITOR", "COMPETITOR"),

  /**
   * The '<em><b>CUSTOMER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CUSTOMER_VALUE
   * @generated
   * @ordered
   */
  CUSTOMER(0, "CUSTOMER", "CUSTOMER"),

  /**
   * The '<em><b>SUPPLIER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUPPLIER_VALUE
   * @generated
   * @ordered
   */
  SUPPLIER(0, "SUPPLIER", "SUPPLIER"),

  /**
   * The '<em><b>SUBSIDIARY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUBSIDIARY_VALUE
   * @generated
   * @ordered
   */
  SUBSIDIARY(0, "SUBSIDIARY", "SUBSIDIARY"),

  /**
   * The '<em><b>PARENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PARENT_VALUE
   * @generated
   * @ordered
   */
  PARENT(0, "PARENT", "PARENT");

  /**
   * The '<em><b>PARTNER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PARTNER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PARTNER
   * @model
   * @generated
   * @ordered
   */
  public static final int PARTNER_VALUE = 0;

  /**
   * The '<em><b>COMPETITOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COMPETITOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPETITOR
   * @model
   * @generated
   * @ordered
   */
  public static final int COMPETITOR_VALUE = 0;

  /**
   * The '<em><b>CUSTOMER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CUSTOMER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CUSTOMER
   * @model
   * @generated
   * @ordered
   */
  public static final int CUSTOMER_VALUE = 0;

  /**
   * The '<em><b>SUPPLIER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SUPPLIER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUPPLIER
   * @model
   * @generated
   * @ordered
   */
  public static final int SUPPLIER_VALUE = 0;

  /**
   * The '<em><b>SUBSIDIARY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SUBSIDIARY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUBSIDIARY
   * @model
   * @generated
   * @ordered
   */
  public static final int SUBSIDIARY_VALUE = 0;

  /**
   * The '<em><b>PARENT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PARENT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PARENT
   * @model
   * @generated
   * @ordered
   */
  public static final int PARENT_VALUE = 0;

  /**
   * An array of all the '<em><b>Dependency Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OrganizationDependencyKind[] VALUES_ARRAY =
    new OrganizationDependencyKind[]
    {
      PARTNER,
      COMPETITOR,
      CUSTOMER,
      SUPPLIER,
      SUBSIDIARY,
      PARENT,
    };

  /**
   * A public read-only list of all the '<em><b>Dependency Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OrganizationDependencyKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Dependency Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OrganizationDependencyKind get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OrganizationDependencyKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dependency Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OrganizationDependencyKind getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OrganizationDependencyKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dependency Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OrganizationDependencyKind get(int value)
  {
    switch (value)
    {
      case PARTNER_VALUE: return PARTNER;
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
  private OrganizationDependencyKind(int value, String name, String literal)
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
  
} //OrganizationDependencyKind
