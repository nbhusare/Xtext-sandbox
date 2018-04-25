/**
 * ******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * ******************************************************************************
 */
package org.neclipse.xtext.validator.example.clazzdsl.clazzDsl;

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
 * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.ClazzDslFactory
 * @model kind="package"
 * @generated
 */
public interface ClazzDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "clazzDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.neclipse.org/xtext/validator/example/clazzdsl/ClazzDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "clazzDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ClazzDslPackage eINSTANCE = org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ClazzDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.NamespaceImpl <em>Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.NamespaceImpl
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ClazzDslPackageImpl#getNamespace()
   * @generated
   */
  int NAMESPACE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__CLAZZ = 2;

  /**
   * The number of structural features of the '<em>Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ImportImpl
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ClazzDslPackageImpl#getImport()
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
   * The meta object id for the '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ClazzImpl <em>Clazz</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ClazzImpl
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ClazzDslPackageImpl#getClazz()
   * @generated
   */
  int CLAZZ = 2;

  /**
   * The feature id for the '<em><b>Deprecated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAZZ__DEPRECATED = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAZZ__NAME = 1;

  /**
   * The number of structural features of the '<em>Clazz</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLAZZ_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace</em>'.
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace
   * @generated
   */
  EClass getNamespace();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace#getName()
   * @see #getNamespace()
   * @generated
   */
  EAttribute getNamespace_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace#getImports()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace#getClazz <em>Clazz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clazz</em>'.
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace#getClazz()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_Clazz();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Clazz <em>Clazz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clazz</em>'.
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Clazz
   * @generated
   */
  EClass getClazz();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Clazz#isDeprecated <em>Deprecated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprecated</em>'.
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Clazz#isDeprecated()
   * @see #getClazz()
   * @generated
   */
  EAttribute getClazz_Deprecated();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Clazz#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Clazz#getName()
   * @see #getClazz()
   * @generated
   */
  EAttribute getClazz_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ClazzDslFactory getClazzDslFactory();

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
     * The meta object literal for the '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.NamespaceImpl <em>Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.NamespaceImpl
     * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ClazzDslPackageImpl#getNamespace()
     * @generated
     */
    EClass NAMESPACE = eINSTANCE.getNamespace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE__NAME = eINSTANCE.getNamespace_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__IMPORTS = eINSTANCE.getNamespace_Imports();

    /**
     * The meta object literal for the '<em><b>Clazz</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__CLAZZ = eINSTANCE.getNamespace_Clazz();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ImportImpl
     * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ClazzDslPackageImpl#getImport()
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
     * The meta object literal for the '{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ClazzImpl <em>Clazz</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ClazzImpl
     * @see org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.ClazzDslPackageImpl#getClazz()
     * @generated
     */
    EClass CLAZZ = eINSTANCE.getClazz();

    /**
     * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAZZ__DEPRECATED = eINSTANCE.getClazz_Deprecated();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLAZZ__NAME = eINSTANCE.getClazz_Name();

  }

} //ClazzDslPackage
