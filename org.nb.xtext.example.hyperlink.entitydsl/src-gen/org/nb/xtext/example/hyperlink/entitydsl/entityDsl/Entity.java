/**
 * ******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * ******************************************************************************
 */
package org.nb.xtext.example.hyperlink.entitydsl.entityDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Entity#getName <em>Name</em>}</li>
 *   <li>{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Entity#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityDslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityDslPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Entity)
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityDslPackage#getEntity_Parent()
   * @model
   * @generated
   */
  Entity getParent();

  /**
   * Sets the value of the '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Entity#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Entity value);

} // Entity
