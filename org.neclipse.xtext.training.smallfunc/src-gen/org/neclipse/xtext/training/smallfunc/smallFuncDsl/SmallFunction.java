/**
 */
package org.neclipse.xtext.training.smallfunc.smallFuncDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Small Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFunction#getName <em>Name</em>}</li>
 *   <li>{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFunction#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFuncDslPackage#getSmallFunction()
 * @model
 * @generated
 */
public interface SmallFunction extends EObject
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
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFuncDslPackage#getSmallFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFunction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFuncDslPackage#getSmallFunction_Params()
   * @model containment="true"
   * @generated
   */
  EList<Param> getParams();

} // SmallFunction
