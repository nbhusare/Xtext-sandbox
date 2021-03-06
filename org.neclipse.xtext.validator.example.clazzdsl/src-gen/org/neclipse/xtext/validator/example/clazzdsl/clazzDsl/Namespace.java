/**
 * ******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * ******************************************************************************
 */
package org.neclipse.xtext.validator.example.clazzdsl.clazzDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace#getName <em>Name</em>}</li>
 *   <li>{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace#getImports <em>Imports</em>}</li>
 *   <li>{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace#getClazz <em>Clazz</em>}</li>
 * </ul>
 *
 * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.ClazzDslPackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends EObject
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
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.ClazzDslPackage#getNamespace_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.ClazzDslPackage#getNamespace_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Clazz</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clazz</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clazz</em>' containment reference.
   * @see #setClazz(Clazz)
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.ClazzDslPackage#getNamespace_Clazz()
   * @model containment="true"
   * @generated
   */
  Clazz getClazz();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace#getClazz <em>Clazz</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clazz</em>' containment reference.
   * @see #getClazz()
   * @generated
   */
  void setClazz(Clazz value);

} // Namespace
