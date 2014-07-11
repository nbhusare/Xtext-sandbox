/**
 */
package org.neclipse.xtext.parentdsl.parentDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.neclipse.xtext.parentdsl.parentDsl.ParentDslFactory
 * @model kind="package"
 * @generated
 */
public interface ParentDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "parentDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.neclipse.org/xtext/parentdsl/ParentDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "parentDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ParentDslPackage eINSTANCE = org.neclipse.xtext.parentdsl.parentDsl.impl.ParentDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.neclipse.xtext.parentdsl.parentDsl.impl.NamespaceDefinitionImpl <em>Namespace Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.parentdsl.parentDsl.impl.NamespaceDefinitionImpl
   * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ParentDslPackageImpl#getNamespaceDefinition()
   * @generated
   */
  int NAMESPACE_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Namespace Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DEFINITION__NAMESPACE_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Import Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DEFINITION__IMPORT_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Artifact</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DEFINITION__ARTIFACT = 2;

  /**
   * The number of structural features of the '<em>Namespace Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.parentdsl.parentDsl.impl.NamespaceDeclarationImpl <em>Namespace Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.parentdsl.parentDsl.impl.NamespaceDeclarationImpl
   * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ParentDslPackageImpl#getNamespaceDeclaration()
   * @generated
   */
  int NAMESPACE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Namespace Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.parentdsl.parentDsl.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ImportDeclarationImpl
   * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ParentDslPackageImpl#getImportDeclaration()
   * @generated
   */
  int IMPORT_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION__IMPORTS = 0;

  /**
   * The number of structural features of the '<em>Import Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.parentdsl.parentDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ImportImpl
   * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ParentDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.parentdsl.parentDsl.impl.ArtifactImpl <em>Artifact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ArtifactImpl
   * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ParentDslPackageImpl#getArtifact()
   * @generated
   */
  int ARTIFACT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__NAME = 0;

  /**
   * The number of structural features of the '<em>Artifact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition <em>Namespace Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Definition</em>'.
   * @see org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition
   * @generated
   */
  EClass getNamespaceDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition#getNamespaceDeclaration <em>Namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace Declaration</em>'.
   * @see org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition#getNamespaceDeclaration()
   * @see #getNamespaceDefinition()
   * @generated
   */
  EReference getNamespaceDefinition_NamespaceDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition#getImportDeclaration <em>Import Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Declaration</em>'.
   * @see org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition#getImportDeclaration()
   * @see #getNamespaceDefinition()
   * @generated
   */
  EReference getNamespaceDefinition_ImportDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition#getArtifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Artifact</em>'.
   * @see org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition#getArtifact()
   * @see #getNamespaceDefinition()
   * @generated
   */
  EReference getNamespaceDefinition_Artifact();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.parentdsl.parentDsl.NamespaceDeclaration <em>Namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Declaration</em>'.
   * @see org.neclipse.xtext.parentdsl.parentDsl.NamespaceDeclaration
   * @generated
   */
  EClass getNamespaceDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.parentdsl.parentDsl.NamespaceDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.neclipse.xtext.parentdsl.parentDsl.NamespaceDeclaration#getName()
   * @see #getNamespaceDeclaration()
   * @generated
   */
  EAttribute getNamespaceDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.parentdsl.parentDsl.ImportDeclaration <em>Import Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Declaration</em>'.
   * @see org.neclipse.xtext.parentdsl.parentDsl.ImportDeclaration
   * @generated
   */
  EClass getImportDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.neclipse.xtext.parentdsl.parentDsl.ImportDeclaration#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.neclipse.xtext.parentdsl.parentDsl.ImportDeclaration#getImports()
   * @see #getImportDeclaration()
   * @generated
   */
  EReference getImportDeclaration_Imports();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.parentdsl.parentDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.neclipse.xtext.parentdsl.parentDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.parentdsl.parentDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.neclipse.xtext.parentdsl.parentDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.parentdsl.parentDsl.Artifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact</em>'.
   * @see org.neclipse.xtext.parentdsl.parentDsl.Artifact
   * @generated
   */
  EClass getArtifact();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.parentdsl.parentDsl.Artifact#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.neclipse.xtext.parentdsl.parentDsl.Artifact#getName()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ParentDslFactory getParentDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.neclipse.xtext.parentdsl.parentDsl.impl.NamespaceDefinitionImpl <em>Namespace Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.parentdsl.parentDsl.impl.NamespaceDefinitionImpl
     * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ParentDslPackageImpl#getNamespaceDefinition()
     * @generated
     */
    EClass NAMESPACE_DEFINITION = eINSTANCE.getNamespaceDefinition();

    /**
     * The meta object literal for the '<em><b>Namespace Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_DEFINITION__NAMESPACE_DECLARATION = eINSTANCE.getNamespaceDefinition_NamespaceDeclaration();

    /**
     * The meta object literal for the '<em><b>Import Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_DEFINITION__IMPORT_DECLARATION = eINSTANCE.getNamespaceDefinition_ImportDeclaration();

    /**
     * The meta object literal for the '<em><b>Artifact</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_DEFINITION__ARTIFACT = eINSTANCE.getNamespaceDefinition_Artifact();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.parentdsl.parentDsl.impl.NamespaceDeclarationImpl <em>Namespace Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.parentdsl.parentDsl.impl.NamespaceDeclarationImpl
     * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ParentDslPackageImpl#getNamespaceDeclaration()
     * @generated
     */
    EClass NAMESPACE_DECLARATION = eINSTANCE.getNamespaceDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE_DECLARATION__NAME = eINSTANCE.getNamespaceDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.parentdsl.parentDsl.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ImportDeclarationImpl
     * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ParentDslPackageImpl#getImportDeclaration()
     * @generated
     */
    EClass IMPORT_DECLARATION = eINSTANCE.getImportDeclaration();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT_DECLARATION__IMPORTS = eINSTANCE.getImportDeclaration_Imports();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.parentdsl.parentDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ImportImpl
     * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ParentDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.parentdsl.parentDsl.impl.ArtifactImpl <em>Artifact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ArtifactImpl
     * @see org.neclipse.xtext.parentdsl.parentDsl.impl.ParentDslPackageImpl#getArtifact()
     * @generated
     */
    EClass ARTIFACT = eINSTANCE.getArtifact();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

  }

} //ParentDslPackage
