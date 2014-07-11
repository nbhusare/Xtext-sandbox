/**
 */
package org.neclipse.xtext.entitydsl.entityDsl;

import org.eclipse.emf.common.util.EList;

import org.neclipse.xtext.parentdsl.parentDsl.Artifact;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.neclipse.xtext.entitydsl.entityDsl.Entity#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.neclipse.xtext.entitydsl.entityDsl.EntityDslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Artifact
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.neclipse.xtext.entitydsl.entityDsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.neclipse.xtext.entitydsl.entityDsl.EntityDslPackage#getEntity_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // Entity
