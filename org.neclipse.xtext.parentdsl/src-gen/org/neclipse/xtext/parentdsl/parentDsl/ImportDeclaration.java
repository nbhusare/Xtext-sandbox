/**
 */
package org.neclipse.xtext.parentdsl.parentDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.neclipse.xtext.parentdsl.parentDsl.ImportDeclaration#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.neclipse.xtext.parentdsl.parentDsl.ParentDslPackage#getImportDeclaration()
 * @model
 * @generated
 */
public interface ImportDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.neclipse.xtext.parentdsl.parentDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.neclipse.xtext.parentdsl.parentDsl.ParentDslPackage#getImportDeclaration_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

} // ImportDeclaration
