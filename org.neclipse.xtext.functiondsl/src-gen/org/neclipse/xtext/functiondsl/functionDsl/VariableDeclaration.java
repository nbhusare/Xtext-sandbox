/**
 */
package org.neclipse.xtext.functiondsl.functionDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.neclipse.xtext.functiondsl.functionDsl.VariableDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.neclipse.xtext.functiondsl.functionDsl.VariableDeclaration#getEntityAttribute <em>Entity Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.neclipse.xtext.functiondsl.functionDsl.FunctionDslPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends EObject
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
   * @see org.neclipse.xtext.functiondsl.functionDsl.FunctionDslPackage#getVariableDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.functiondsl.functionDsl.VariableDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entity Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Attribute</em>' containment reference.
   * @see #setEntityAttribute(EntityAttribute)
   * @see org.neclipse.xtext.functiondsl.functionDsl.FunctionDslPackage#getVariableDeclaration_EntityAttribute()
   * @model containment="true"
   * @generated
   */
  EntityAttribute getEntityAttribute();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.functiondsl.functionDsl.VariableDeclaration#getEntityAttribute <em>Entity Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Attribute</em>' containment reference.
   * @see #getEntityAttribute()
   * @generated
   */
  void setEntityAttribute(EntityAttribute value);

} // VariableDeclaration
