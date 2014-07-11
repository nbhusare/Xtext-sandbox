/**
 */
package org.neclipse.xtext.parentdsl.parentDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition#getNamespaceDeclaration <em>Namespace Declaration</em>}</li>
 *   <li>{@link org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition#getImportDeclaration <em>Import Declaration</em>}</li>
 *   <li>{@link org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition#getArtifact <em>Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.neclipse.xtext.parentdsl.parentDsl.ParentDslPackage#getNamespaceDefinition()
 * @model
 * @generated
 */
public interface NamespaceDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Namespace Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace Declaration</em>' containment reference.
   * @see #setNamespaceDeclaration(NamespaceDeclaration)
   * @see org.neclipse.xtext.parentdsl.parentDsl.ParentDslPackage#getNamespaceDefinition_NamespaceDeclaration()
   * @model containment="true"
   * @generated
   */
  NamespaceDeclaration getNamespaceDeclaration();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition#getNamespaceDeclaration <em>Namespace Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace Declaration</em>' containment reference.
   * @see #getNamespaceDeclaration()
   * @generated
   */
  void setNamespaceDeclaration(NamespaceDeclaration value);

  /**
   * Returns the value of the '<em><b>Import Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Declaration</em>' containment reference.
   * @see #setImportDeclaration(ImportDeclaration)
   * @see org.neclipse.xtext.parentdsl.parentDsl.ParentDslPackage#getNamespaceDefinition_ImportDeclaration()
   * @model containment="true"
   * @generated
   */
  ImportDeclaration getImportDeclaration();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition#getImportDeclaration <em>Import Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Declaration</em>' containment reference.
   * @see #getImportDeclaration()
   * @generated
   */
  void setImportDeclaration(ImportDeclaration value);

  /**
   * Returns the value of the '<em><b>Artifact</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact</em>' containment reference.
   * @see #setArtifact(Artifact)
   * @see org.neclipse.xtext.parentdsl.parentDsl.ParentDslPackage#getNamespaceDefinition_Artifact()
   * @model containment="true"
   * @generated
   */
  Artifact getArtifact();

  /**
   * Sets the value of the '{@link org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition#getArtifact <em>Artifact</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact</em>' containment reference.
   * @see #getArtifact()
   * @generated
   */
  void setArtifact(Artifact value);

} // NamespaceDefinition
