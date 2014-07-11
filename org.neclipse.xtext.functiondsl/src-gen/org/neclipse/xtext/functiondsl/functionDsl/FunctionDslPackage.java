/**
 */
package org.neclipse.xtext.functiondsl.functionDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.neclipse.xtext.parentdsl.parentDsl.ParentDslPackage;

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
 * @see org.neclipse.xtext.functiondsl.functionDsl.FunctionDslFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "functionDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.neclipse.org/xtext/functiondsl/FunctionDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "functionDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FunctionDslPackage eINSTANCE = org.neclipse.xtext.functiondsl.functionDsl.impl.FunctionDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.neclipse.xtext.functiondsl.functionDsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.functiondsl.functionDsl.impl.VariableDeclarationImpl
   * @see org.neclipse.xtext.functiondsl.functionDsl.impl.FunctionDslPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Entity Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__ENTITY_ATTRIBUTE = 1;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.functiondsl.functionDsl.impl.EntityAttributeImpl <em>Entity Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.functiondsl.functionDsl.impl.EntityAttributeImpl
   * @see org.neclipse.xtext.functiondsl.functionDsl.impl.FunctionDslPackageImpl#getEntityAttribute()
   * @generated
   */
  int ENTITY_ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Entity Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ATTRIBUTE__ENTITY_REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ATTRIBUTE__REF = 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ATTRIBUTE__ATTRIBUTE = 2;

  /**
   * The number of structural features of the '<em>Entity Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.functiondsl.functionDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.functiondsl.functionDsl.impl.ParameterImpl
   * @see org.neclipse.xtext.functiondsl.functionDsl.impl.FunctionDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ARRAY = 1;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DATA_TYPE = 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.functiondsl.functionDsl.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.functiondsl.functionDsl.impl.FunctionImpl
   * @see org.neclipse.xtext.functiondsl.functionDsl.impl.FunctionDslPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = ParentDslPackage.ARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMETERS = ParentDslPackage.ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__VARIABLE_DECLARATION = ParentDslPackage.ARTIFACT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = ParentDslPackage.ARTIFACT_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.functiondsl.functionDsl.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.neclipse.xtext.functiondsl.functionDsl.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.functiondsl.functionDsl.VariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.neclipse.xtext.functiondsl.functionDsl.VariableDeclaration#getName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.neclipse.xtext.functiondsl.functionDsl.VariableDeclaration#getEntityAttribute <em>Entity Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity Attribute</em>'.
   * @see org.neclipse.xtext.functiondsl.functionDsl.VariableDeclaration#getEntityAttribute()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_EntityAttribute();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute <em>Entity Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Attribute</em>'.
   * @see org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute
   * @generated
   */
  EClass getEntityAttribute();

  /**
   * Returns the meta object for the reference '{@link org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute#getEntityReference <em>Entity Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity Reference</em>'.
   * @see org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute#getEntityReference()
   * @see #getEntityAttribute()
   * @generated
   */
  EReference getEntityAttribute_EntityReference();

  /**
   * Returns the meta object for the containment reference '{@link org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute#getRef()
   * @see #getEntityAttribute()
   * @generated
   */
  EReference getEntityAttribute_Ref();

  /**
   * Returns the meta object for the reference '{@link org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute#getAttribute()
   * @see #getEntityAttribute()
   * @generated
   */
  EReference getEntityAttribute_Attribute();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.functiondsl.functionDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.neclipse.xtext.functiondsl.functionDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.functiondsl.functionDsl.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.neclipse.xtext.functiondsl.functionDsl.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.functiondsl.functionDsl.Parameter#isArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Array</em>'.
   * @see org.neclipse.xtext.functiondsl.functionDsl.Parameter#isArray()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Array();

  /**
   * Returns the meta object for the reference '{@link org.neclipse.xtext.functiondsl.functionDsl.Parameter#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data Type</em>'.
   * @see org.neclipse.xtext.functiondsl.functionDsl.Parameter#getDataType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_DataType();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.functiondsl.functionDsl.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.neclipse.xtext.functiondsl.functionDsl.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference list '{@link org.neclipse.xtext.functiondsl.functionDsl.Function#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.neclipse.xtext.functiondsl.functionDsl.Function#getParameters()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.neclipse.xtext.functiondsl.functionDsl.Function#getVariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Declaration</em>'.
   * @see org.neclipse.xtext.functiondsl.functionDsl.Function#getVariableDeclaration()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_VariableDeclaration();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FunctionDslFactory getFunctionDslFactory();

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
     * The meta object literal for the '{@link org.neclipse.xtext.functiondsl.functionDsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.functiondsl.functionDsl.impl.VariableDeclarationImpl
     * @see org.neclipse.xtext.functiondsl.functionDsl.impl.FunctionDslPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Entity Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__ENTITY_ATTRIBUTE = eINSTANCE.getVariableDeclaration_EntityAttribute();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.functiondsl.functionDsl.impl.EntityAttributeImpl <em>Entity Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.functiondsl.functionDsl.impl.EntityAttributeImpl
     * @see org.neclipse.xtext.functiondsl.functionDsl.impl.FunctionDslPackageImpl#getEntityAttribute()
     * @generated
     */
    EClass ENTITY_ATTRIBUTE = eINSTANCE.getEntityAttribute();

    /**
     * The meta object literal for the '<em><b>Entity Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_ATTRIBUTE__ENTITY_REFERENCE = eINSTANCE.getEntityAttribute_EntityReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_ATTRIBUTE__REF = eINSTANCE.getEntityAttribute_Ref();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getEntityAttribute_Attribute();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.functiondsl.functionDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.functiondsl.functionDsl.impl.ParameterImpl
     * @see org.neclipse.xtext.functiondsl.functionDsl.impl.FunctionDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__ARRAY = eINSTANCE.getParameter_Array();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__DATA_TYPE = eINSTANCE.getParameter_DataType();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.functiondsl.functionDsl.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.functiondsl.functionDsl.impl.FunctionImpl
     * @see org.neclipse.xtext.functiondsl.functionDsl.impl.FunctionDslPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

    /**
     * The meta object literal for the '<em><b>Variable Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__VARIABLE_DECLARATION = eINSTANCE.getFunction_VariableDeclaration();

  }

} //FunctionDslPackage
