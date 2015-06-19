/**
 */
package org.neclipse.xtext.training.smallJava.smallJavaDsl;

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
 * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.SmallJavaDslFactory
 * @model kind="package"
 * @generated
 */
public interface SmallJavaDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "smallJavaDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.neclipse.org/xtext/training/smallJava/SmallJavaDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "smallJavaDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmallJavaDslPackage eINSTANCE = org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.NamespaceImpl <em>Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.NamespaceImpl
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getNamespace()
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
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__CLASS = 2;

  /**
   * The number of structural features of the '<em>Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.ImportImpl
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getImport()
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
   * The meta object id for the '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallClassImpl <em>Small Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallClassImpl
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getSmallClass()
   * @generated
   */
  int SMALL_CLASS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_CLASS__SUPER_CLASS = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_CLASS__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Small Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMALL_CLASS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.AttributeImpl
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DATATYPE = 0;

  /**
   * The feature id for the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ARRAY = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.DataTypeImpl
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getDataType()
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
   * The meta object id for the '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.ClassTypeImpl <em>Class Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.ClassTypeImpl
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getClassType()
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
   * Returns the meta object for class '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.Namespace
   * @generated
   */
  EClass getNamespace();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.Namespace#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.Namespace#getName()
   * @see #getNamespace()
   * @generated
   */
  EAttribute getNamespace_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.Namespace#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.Namespace#getImports()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.Namespace#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.Namespace#getClass_()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_Class();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.SmallClass <em>Small Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Small Class</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.SmallClass
   * @generated
   */
  EClass getSmallClass();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.SmallClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.SmallClass#getName()
   * @see #getSmallClass()
   * @generated
   */
  EAttribute getSmallClass_Name();

  /**
   * Returns the meta object for the reference '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.SmallClass#getSuperClass <em>Super Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Class</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.SmallClass#getSuperClass()
   * @see #getSmallClass()
   * @generated
   */
  EReference getSmallClass_SuperClass();

  /**
   * Returns the meta object for the containment reference list '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.SmallClass#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.SmallClass#getAttributes()
   * @see #getSmallClass()
   * @generated
   */
  EReference getSmallClass_Attributes();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.Attribute#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.Attribute#getDatatype()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Datatype();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.Attribute#isArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Array</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.Attribute#isArray()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Array();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.ClassType <em>Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Type</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.ClassType
   * @generated
   */
  EClass getClassType();

  /**
   * Returns the meta object for the reference '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.ClassType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.ClassType#getType()
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
  SmallJavaDslFactory getSmallJavaDslFactory();

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
     * The meta object literal for the '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.NamespaceImpl <em>Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.NamespaceImpl
     * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getNamespace()
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
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__CLASS = eINSTANCE.getNamespace_Class();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.ImportImpl
     * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getImport()
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
     * The meta object literal for the '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallClassImpl <em>Small Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallClassImpl
     * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getSmallClass()
     * @generated
     */
    EClass SMALL_CLASS = eINSTANCE.getSmallClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMALL_CLASS__NAME = eINSTANCE.getSmallClass_Name();

    /**
     * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMALL_CLASS__SUPER_CLASS = eINSTANCE.getSmallClass_SuperClass();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMALL_CLASS__ATTRIBUTES = eINSTANCE.getSmallClass_Attributes();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.AttributeImpl
     * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__DATATYPE = eINSTANCE.getAttribute_Datatype();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ARRAY = eINSTANCE.getAttribute_Array();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.DataTypeImpl
     * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.ClassTypeImpl <em>Class Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.ClassTypeImpl
     * @see org.neclipse.xtext.training.smallJava.smallJavaDsl.impl.SmallJavaDslPackageImpl#getClassType()
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

} //SmallJavaDslPackage
