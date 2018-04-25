/**
 * ******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * ******************************************************************************
 */
package org.neclipse.xtext.validator.example.funcdsl.funcDsl;

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
 *   <li>{@link org.neclipse.xtext.validator.example.funcdsl.funcDsl.Namespace#getName <em>Name</em>}</li>
 *   <li>{@link org.neclipse.xtext.validator.example.funcdsl.funcDsl.Namespace#getImports <em>Imports</em>}</li>
 *   <li>{@link org.neclipse.xtext.validator.example.funcdsl.funcDsl.Namespace#getFunc <em>Func</em>}</li>
 * </ul>
 *
 * @see org.neclipse.xtext.validator.example.funcdsl.funcDsl.FuncDslPackage#getNamespace()
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
   * @see org.neclipse.xtext.validator.example.funcdsl.funcDsl.FuncDslPackage#getNamespace_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.validator.example.funcdsl.funcDsl.Namespace#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.neclipse.xtext.validator.example.funcdsl.funcDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.neclipse.xtext.validator.example.funcdsl.funcDsl.FuncDslPackage#getNamespace_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Func</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' containment reference.
   * @see #setFunc(Func)
   * @see org.neclipse.xtext.validator.example.funcdsl.funcDsl.FuncDslPackage#getNamespace_Func()
   * @model containment="true"
   * @generated
   */
  Func getFunc();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.validator.example.funcdsl.funcDsl.Namespace#getFunc <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' containment reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(Func value);

} // Namespace
