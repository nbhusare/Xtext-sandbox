/**
 */
package org.neclipse.xtext.training.smallfunc.smallFuncDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.neclipse.xtext.training.smallfunc.smallFuncDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmallFuncDslFactoryImpl extends EFactoryImpl implements SmallFuncDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SmallFuncDslFactory init()
  {
    try
    {
      SmallFuncDslFactory theSmallFuncDslFactory = (SmallFuncDslFactory)EPackage.Registry.INSTANCE.getEFactory(SmallFuncDslPackage.eNS_URI);
      if (theSmallFuncDslFactory != null)
      {
        return theSmallFuncDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SmallFuncDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallFuncDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SmallFuncDslPackage.NAMESPACE: return createNamespace();
      case SmallFuncDslPackage.IMPORT: return createImport();
      case SmallFuncDslPackage.SMALL_FUNCTION: return createSmallFunction();
      case SmallFuncDslPackage.PARAM: return createParam();
      case SmallFuncDslPackage.DATA_TYPE: return createDataType();
      case SmallFuncDslPackage.CLASS_TYPE: return createClassType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace createNamespace()
  {
    NamespaceImpl namespace = new NamespaceImpl();
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallFunction createSmallFunction()
  {
    SmallFunctionImpl smallFunction = new SmallFunctionImpl();
    return smallFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassType createClassType()
  {
    ClassTypeImpl classType = new ClassTypeImpl();
    return classType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmallFuncDslPackage getSmallFuncDslPackage()
  {
    return (SmallFuncDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SmallFuncDslPackage getPackage()
  {
    return SmallFuncDslPackage.eINSTANCE;
  }

} //SmallFuncDslFactoryImpl
