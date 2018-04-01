/**
 * ******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * ******************************************************************************
 */
package org.nb.xtext.example.hyperlink.entitydsl.entityDsl;

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
 * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityDslFactory
 * @model kind="package"
 * @generated
 */
public interface EntityDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "entityDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.nb.org/xtext/example/hyperlink/entitydsl/EntityDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "entityDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EntityDslPackage eINSTANCE = org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityFileImpl <em>Entity File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityFileImpl
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityDslPackageImpl#getEntityFile()
   * @generated
   */
  int ENTITY_FILE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FILE__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FILE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FILE__ENTITY = 2;

  /**
   * The number of structural features of the '<em>Entity File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FILE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.ImportImpl
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

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
   * The meta object id for the '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityImpl
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PARENT = 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile <em>Entity File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity File</em>'.
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile
   * @generated
   */
  EClass getEntityFile();

  /**
   * Returns the meta object for the attribute '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile#getName()
   * @see #getEntityFile()
   * @generated
   */
  EAttribute getEntityFile_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile#getImports()
   * @see #getEntityFile()
   * @generated
   */
  EReference getEntityFile_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity</em>'.
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile#getEntity()
   * @see #getEntityFile()
   * @generated
   */
  EReference getEntityFile_Entity();

  /**
   * Returns the meta object for class '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the reference '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Entity#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Entity#getParent()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Parent();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EntityDslFactory getEntityDslFactory();

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
     * The meta object literal for the '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityFileImpl <em>Entity File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityFileImpl
     * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityDslPackageImpl#getEntityFile()
     * @generated
     */
    EClass ENTITY_FILE = eINSTANCE.getEntityFile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_FILE__NAME = eINSTANCE.getEntityFile_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_FILE__IMPORTS = eINSTANCE.getEntityFile_Imports();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_FILE__ENTITY = eINSTANCE.getEntityFile_Entity();

    /**
     * The meta object literal for the '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.ImportImpl
     * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityDslPackageImpl#getImport()
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
     * The meta object literal for the '{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityImpl
     * @see org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PARENT = eINSTANCE.getEntity_Parent();

  }

} //EntityDslPackage
