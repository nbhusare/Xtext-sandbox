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

import org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Clazz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.neclipse.xtext.validator.example.funcdsl.funcDsl.ClassType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.neclipse.xtext.validator.example.funcdsl.funcDsl.FuncDslPackage#getClassType()
 * @model
 * @generated
 */
public interface ClassType extends DataType
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Clazz)
   * @see org.neclipse.xtext.validator.example.funcdsl.funcDsl.FuncDslPackage#getClassType_Type()
   * @model
   * @generated
   */
  Clazz getType();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.validator.example.funcdsl.funcDsl.ClassType#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Clazz value);

} // ClassType
