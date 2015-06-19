/**
 */
package org.neclipse.xtext.training.smallfunc.smallFuncDsl;

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
 * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFuncDslFactory
 * @model kind="package"
 * @generated
 */
public interface SmallFuncDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "smallFuncDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.neclipse.org/xtext/training/smallfunc/SmallFuncDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "smallFuncDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmallFuncDslPackage eINSTANCE = org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.NamespaceImpl <em>Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.NamespaceImpl
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getNamespace()
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
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__FUNCTION = 2;

  /**
   * The number of structural features of the '<em>Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.ImportImpl
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getImport()
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
   * The meta object id for the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFunctionImpl <em>Small Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFunctionImpl
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getSmallFunction()
   * @generated
   */
  int SMALL_FUNCTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_FUNCTION__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Small Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.ParamImpl
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getParam()
   * @generated
   */
  int PARAM = 3;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__DATA_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__NAME = 1;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.DataTypeImpl
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 4;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.ClassTypeImpl <em>Class Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.ClassTypeImpl
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getClassType()
   * @generated
   */
  int CLASS_TYPE = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_TYPE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Class Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.Namespace
   * @generated
   */
  EClass getNamespace();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Namespace#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.Namespace#getName()
   * @see #getNamespace()
   * @generated
   */
  EAttribute getNamespace_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Namespace#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.Namespace#getImports()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Namespace#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.Namespace#getFunction()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_Function();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFunction <em>Small Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Small Function</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFunction
   * @generated
   */
  EClass getSmallFunction();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFunction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFunction#getName()
   * @see #getSmallFunction()
   * @generated
   */
  EAttribute getSmallFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFunction#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.SmallFunction#getParams()
   * @see #getSmallFunction()
   * @generated
   */
  EReference getSmallFunction_Params();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the containment reference '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Param#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Type</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.Param#getDataType()
   * @see #getParam()
   * @generated
   */
  EReference getParam_DataType();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.Param#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.Param#getName()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Name();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.ClassType <em>Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Type</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.ClassType
   * @generated
   */
  EClass getClassType();

  /**
   * Returns the meta object for the reference '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.ClassType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.ClassType#getType()
   * @see #getClassType()
   * @generated
   */
  EReference getClassType_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SmallFuncDslFactory getSmallFuncDslFactory();

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
     * The meta object literal for the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.NamespaceImpl <em>Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.NamespaceImpl
     * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getNamespace()
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
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__FUNCTION = eINSTANCE.getNamespace_Function();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.ImportImpl
     * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getImport()
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
     * The meta object literal for the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFunctionImpl <em>Small Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFunctionImpl
     * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getSmallFunction()
     * @generated
     */
    EClass SMALL_FUNCTION = eINSTANCE.getSmallFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMALL_FUNCTION__NAME = eINSTANCE.getSmallFunction_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMALL_FUNCTION__PARAMS = eINSTANCE.getSmallFunction_Params();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.ParamImpl
     * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM__DATA_TYPE = eINSTANCE.getParam_DataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.DataTypeImpl
     * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.ClassTypeImpl <em>Class Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.ClassTypeImpl
     * @see org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl.SmallFuncDslPackageImpl#getClassType()
     * @generated
     */
    EClass CLASS_TYPE = eINSTANCE.getClassType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_TYPE__TYPE = eINSTANCE.getClassType_Type();

  }

} //SmallFuncDslPackage
