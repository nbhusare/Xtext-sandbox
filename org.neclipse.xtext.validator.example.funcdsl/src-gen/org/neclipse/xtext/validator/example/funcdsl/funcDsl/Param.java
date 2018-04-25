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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.neclipse.xtext.validator.example.funcdsl.funcDsl.Param#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.neclipse.xtext.validator.example.funcdsl.funcDsl.Param#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.neclipse.xtext.validator.example.funcdsl.funcDsl.FuncDslPackage#getParam()
 * @model
 * @generated
 */
public interface Param extends EObject
{
  /**
   * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' containment reference.
   * @see #setDataType(DataType)
   * @see org.neclipse.xtext.validator.example.funcdsl.funcDsl.FuncDslPackage#getParam_DataType()
   * @model containment="true"
   * @generated
   */
  DataType getDataType();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.validator.example.funcdsl.funcDsl.Param#getDataType <em>Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' containment reference.
   * @see #getDataType()
   * @generated
   */
  void setDataType(DataType value);

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
   * @see org.neclipse.xtext.validator.example.funcdsl.funcDsl.FuncDslPackage#getParam_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.validator.example.funcdsl.funcDsl.Param#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Param
