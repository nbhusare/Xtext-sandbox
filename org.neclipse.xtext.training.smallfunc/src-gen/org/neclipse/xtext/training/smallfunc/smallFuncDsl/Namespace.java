/**
 */
package org.neclipse.xtext.training.smallfunc.smallFuncDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Namespace#getName <em>Name</em>}</li>
 *   <li>{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Namespace#getImports <em>Imports</em>}</li>
 *   <li>{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Namespace#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFuncDslPackage#getNamespace()
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
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFuncDslPackage#getNamespace_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Namespace#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFuncDslPackage#getNamespace_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' containment reference.
   * @see #setFunction(SmallFunction)
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFuncDslPackage#getNamespace_Function()
   * @model containment="true"
   * @generated
   */
  SmallFunction getFunction();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Namespace#getFunction <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' containment reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(SmallFunction value);

} // Namespace
