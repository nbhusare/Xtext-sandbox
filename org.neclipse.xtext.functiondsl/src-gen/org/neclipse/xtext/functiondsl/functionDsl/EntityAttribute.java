/**
 */
package org.neclipse.xtext.functiondsl.functionDsl;

import org.eclipse.emf.ecore.EObject;

import org.neclipse.xtext.entitydsl.entityDsl.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute#getEntityReference <em>Entity Reference</em>}</li>
 *   <li>{@link org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute#getRef <em>Ref</em>}</li>
 *   <li>{@link org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.neclipse.xtext.functiondsl.functionDsl.FunctionDslPackage#getEntityAttribute()
 * @model
 * @generated
 */
public interface EntityAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Reference</em>' reference.
   * @see #setEntityReference(Parameter)
   * @see org.neclipse.xtext.functiondsl.functionDsl.FunctionDslPackage#getEntityAttribute_EntityReference()
   * @model
   * @generated
   */
  Parameter getEntityReference();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute#getEntityReference <em>Entity Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Reference</em>' reference.
   * @see #getEntityReference()
   * @generated
   */
  void setEntityReference(Parameter value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(EntityAttribute)
   * @see org.neclipse.xtext.functiondsl.functionDsl.FunctionDslPackage#getEntityAttribute_Ref()
   * @model containment="true"
   * @generated
   */
  EntityAttribute getRef();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(EntityAttribute value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(Attribute)
   * @see org.neclipse.xtext.functiondsl.functionDsl.FunctionDslPackage#getEntityAttribute_Attribute()
   * @model
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

} // EntityAttribute
