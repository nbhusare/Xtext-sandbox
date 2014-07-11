/**
 */
package org.neclipse.xtext.functiondsl.functionDsl;

import org.eclipse.emf.ecore.EObject;

import org.neclipse.xtext.entitydsl.entityDsl.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.neclipse.xtext.functiondsl.functionDsl.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link org.neclipse.xtext.functiondsl.functionDsl.Parameter#isArray <em>Array</em>}</li>
 *   <li>{@link org.neclipse.xtext.functiondsl.functionDsl.Parameter#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.neclipse.xtext.functiondsl.functionDsl.FunctionDslPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
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
   * @see org.neclipse.xtext.functiondsl.functionDsl.FunctionDslPackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.functiondsl.functionDsl.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' attribute.
   * @see #setArray(boolean)
   * @see org.neclipse.xtext.functiondsl.functionDsl.FunctionDslPackage#getParameter_Array()
   * @model
   * @generated
   */
  boolean isArray();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.functiondsl.functionDsl.Parameter#isArray <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' attribute.
   * @see #isArray()
   * @generated
   */
  void setArray(boolean value);

  /**
   * Returns the value of the '<em><b>Data Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' reference.
   * @see #setDataType(Entity)
   * @see org.neclipse.xtext.functiondsl.functionDsl.FunctionDslPackage#getParameter_DataType()
   * @model
   * @generated
   */
  Entity getDataType();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.functiondsl.functionDsl.Parameter#getDataType <em>Data Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' reference.
   * @see #getDataType()
   * @generated
   */
  void setDataType(Entity value);

} // Parameter
