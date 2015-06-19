/**
 */
package org.neclipse.xtend.training.smallJava.smallJavaDsl;

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
 *   <li>{@link org.neclipse.xtend.training.smallJava.smallJavaDsl.Namespace#getName <em>Name</em>}</li>
 *   <li>{@link org.neclipse.xtend.training.smallJava.smallJavaDsl.Namespace#getImports <em>Imports</em>}</li>
 *   <li>{@link org.neclipse.xtend.training.smallJava.smallJavaDsl.Namespace#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.neclipse.xtend.training.smallJava.smallJavaDsl.SmallJavaDslPackage#getNamespace()
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
   * @see org.neclipse.xtend.training.smallJava.smallJavaDsl.SmallJavaDslPackage#getNamespace_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.neclipse.xtend.training.smallJava.smallJavaDsl.Namespace#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.neclipse.xtend.training.smallJava.smallJavaDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.neclipse.xtend.training.smallJava.smallJavaDsl.SmallJavaDslPackage#getNamespace_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference.
   * @see #setClass(SmallClass)
   * @see org.neclipse.xtend.training.smallJava.smallJavaDsl.SmallJavaDslPackage#getNamespace_Class()
   * @model containment="true"
   * @generated
   */
  SmallClass getClass_();

  /**
   * Sets the value of the '{@link org.neclipse.xtend.training.smallJava.smallJavaDsl.Namespace#getClass_ <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' containment reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(SmallClass value);

} // Namespace
