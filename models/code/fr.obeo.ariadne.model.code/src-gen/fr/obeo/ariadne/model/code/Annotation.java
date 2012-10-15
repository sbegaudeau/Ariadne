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
package fr.obeo.ariadne.model.code;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.ariadne.model.code.Annotation#getAnnotationFields <em>Annotation Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.ariadne.model.code.CodePackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends Type
{
  /**
   * Returns the value of the '<em><b>Annotation Fields</b></em>' containment reference list.
   * The list contents are of type {@link fr.obeo.ariadne.model.code.AnnotationField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation Fields</em>' containment reference list.
   * @see fr.obeo.ariadne.model.code.CodePackage#getAnnotation_AnnotationFields()
   * @model containment="true"
   * @generated
   */
  EList<AnnotationField> getAnnotationFields();

} // Annotation
