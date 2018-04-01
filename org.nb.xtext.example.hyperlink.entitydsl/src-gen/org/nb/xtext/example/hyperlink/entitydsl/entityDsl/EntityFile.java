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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile#getName <em>Name</em>}</li>
 *   <li>{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile#getImports <em>Imports</em>}</li>
 *   <li>{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityDslPackage#getEntityFile()
 * @model
 * @generated
 */
public interface EntityFile extends EObject
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
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityDslPackage#getEntityFile_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityDslPackage#getEntityFile_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(Entity)
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityDslPackage#getEntityFile_Entity()
   * @model containment="true"
   * @generated
   */
  Entity getEntity();

  /**
   * Sets the value of the '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Entity value);

} // EntityFile
