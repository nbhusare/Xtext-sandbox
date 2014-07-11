/**
 */
package org.neclipse.xtext.entitydsl.entityDsl;

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
 * @see org.neclipse.xtext.entitydsl.entityDsl.EntityDslFactory
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
  String eNS_URI = "http://www.neclipse.org/xtext/entitydsl/EntityDsl";

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
  EntityDslPackage eINSTANCE = org.neclipse.xtext.entitydsl.entityDsl.impl.EntityDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.neclipse.xtext.entitydsl.entityDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.entitydsl.entityDsl.impl.AttributeImpl
   * @see org.neclipse.xtext.entitydsl.entityDsl.impl.EntityDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.entitydsl.entityDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.entitydsl.entityDsl.impl.DataTypeImpl
   * @see org.neclipse.xtext.entitydsl.entityDsl.impl.EntityDslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 1;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.entitydsl.entityDsl.impl.EntityReferenceImpl <em>Entity Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.entitydsl.entityDsl.impl.EntityReferenceImpl
   * @see org.neclipse.xtext.entitydsl.entityDsl.impl.EntityDslPackageImpl#getEntityReference()
   * @generated
   */
  int ENTITY_REFERENCE = 2;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_REFERENCE__ENTITY = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_REFERENCE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.entitydsl.entityDsl.impl.StringTypeImpl <em>String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.entitydsl.entityDsl.impl.StringTypeImpl
   * @see org.neclipse.xtext.entitydsl.entityDsl.impl.EntityDslPackageImpl#getStringType()
   * @generated
   */
  int STRING_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE__NAME = DATA_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE__LENGTH = DATA_TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.neclipse.xtext.entitydsl.entityDsl.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.neclipse.xtext.entitydsl.entityDsl.impl.EntityImpl
   * @see org.neclipse.xtext.entitydsl.entityDsl.impl.EntityDslPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = ParentDslPackage.ARTIFACT__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = ParentDslPackage.ARTIFACT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = ParentDslPackage.ARTIFACT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.entitydsl.entityDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.neclipse.xtext.entitydsl.entityDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.entitydsl.entityDsl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.neclipse.xtext.entitydsl.entityDsl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.neclipse.xtext.entitydsl.entityDsl.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.neclipse.xtext.entitydsl.entityDsl.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.entitydsl.entityDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see org.neclipse.xtext.entitydsl.entityDsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.entitydsl.entityDsl.EntityReference <em>Entity Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Reference</em>'.
   * @see org.neclipse.xtext.entitydsl.entityDsl.EntityReference
   * @generated
   */
  EClass getEntityReference();

  /**
   * Returns the meta object for the reference '{@link org.neclipse.xtext.entitydsl.entityDsl.EntityReference#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.neclipse.xtext.entitydsl.entityDsl.EntityReference#getEntity()
   * @see #getEntityReference()
   * @generated
   */
  EReference getEntityReference_Entity();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.entitydsl.entityDsl.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Type</em>'.
   * @see org.neclipse.xtext.entitydsl.entityDsl.StringType
   * @generated
   */
  EClass getStringType();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.entitydsl.entityDsl.StringType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.neclipse.xtext.entitydsl.entityDsl.StringType#getName()
   * @see #getStringType()
   * @generated
   */
  EAttribute getStringType_Name();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.entitydsl.entityDsl.StringType#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see org.neclipse.xtext.entitydsl.entityDsl.StringType#getLength()
   * @see #getStringType()
   * @generated
   */
  EAttribute getStringType_Length();

  /**
   * Returns the meta object for the attribute '{@link org.neclipse.xtext.entitydsl.entityDsl.StringType#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see org.neclipse.xtext.entitydsl.entityDsl.StringType#getDefaultValue()
   * @see #getStringType()
   * @generated
   */
  EAttribute getStringType_DefaultValue();

  /**
   * Returns the meta object for class '{@link org.neclipse.xtext.entitydsl.entityDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.neclipse.xtext.entitydsl.entityDsl.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.neclipse.xtext.entitydsl.entityDsl.Entity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.neclipse.xtext.entitydsl.entityDsl.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

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
     * The meta object literal for the '{@link org.neclipse.xtext.entitydsl.entityDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.entitydsl.entityDsl.impl.AttributeImpl
     * @see org.neclipse.xtext.entitydsl.entityDsl.impl.EntityDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.entitydsl.entityDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.entitydsl.entityDsl.impl.DataTypeImpl
     * @see org.neclipse.xtext.entitydsl.entityDsl.impl.EntityDslPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.entitydsl.entityDsl.impl.EntityReferenceImpl <em>Entity Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.entitydsl.entityDsl.impl.EntityReferenceImpl
     * @see org.neclipse.xtext.entitydsl.entityDsl.impl.EntityDslPackageImpl#getEntityReference()
     * @generated
     */
    EClass ENTITY_REFERENCE = eINSTANCE.getEntityReference();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_REFERENCE__ENTITY = eINSTANCE.getEntityReference_Entity();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.entitydsl.entityDsl.impl.StringTypeImpl <em>String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.entitydsl.entityDsl.impl.StringTypeImpl
     * @see org.neclipse.xtext.entitydsl.entityDsl.impl.EntityDslPackageImpl#getStringType()
     * @generated
     */
    EClass STRING_TYPE = eINSTANCE.getStringType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_TYPE__NAME = eINSTANCE.getStringType_Name();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_TYPE__LENGTH = eINSTANCE.getStringType_Length();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_TYPE__DEFAULT_VALUE = eINSTANCE.getStringType_DefaultValue();

    /**
     * The meta object literal for the '{@link org.neclipse.xtext.entitydsl.entityDsl.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.neclipse.xtext.entitydsl.entityDsl.impl.EntityImpl
     * @see org.neclipse.xtext.entitydsl.entityDsl.impl.EntityDslPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

  }

} //EntityDslPackage
