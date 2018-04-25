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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Clazz#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Clazz#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.ClazzDslPackage#getClazz()
 * @model
 * @generated
 */
public interface Clazz extends EObject
{
  /**
   * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deprecated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deprecated</em>' attribute.
   * @see #setDeprecated(boolean)
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.ClazzDslPackage#getClazz_Deprecated()
   * @model
   * @generated
   */
  boolean isDeprecated();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Clazz#isDeprecated <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deprecated</em>' attribute.
   * @see #isDeprecated()
   * @generated
   */
  void setDeprecated(boolean value);

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
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.ClazzDslPackage#getClazz_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Clazz#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Clazz
