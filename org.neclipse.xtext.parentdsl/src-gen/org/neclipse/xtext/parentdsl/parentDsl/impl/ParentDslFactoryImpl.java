/**
 */
package org.neclipse.xtext.parentdsl.parentDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.neclipse.xtext.parentdsl.parentDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParentDslFactoryImpl extends EFactoryImpl implements ParentDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ParentDslFactory init()
  {
    try
    {
      ParentDslFactory theParentDslFactory = (ParentDslFactory)EPackage.Registry.INSTANCE.getEFactory(ParentDslPackage.eNS_URI);
      if (theParentDslFactory != null)
      {
        return theParentDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ParentDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParentDslFactoryImpl()
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
      case ParentDslPackage.NAMESPACE_DEFINITION: return createNamespaceDefinition();
      case ParentDslPackage.NAMESPACE_DECLARATION: return createNamespaceDeclaration();
      case ParentDslPackage.IMPORT_DECLARATION: return createImportDeclaration();
      case ParentDslPackage.IMPORT: return createImport();
      case ParentDslPackage.ARTIFACT: return createArtifact();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceDefinition createNamespaceDefinition()
  {
    NamespaceDefinitionImpl namespaceDefinition = new NamespaceDefinitionImpl();
    return namespaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceDeclaration createNamespaceDeclaration()
  {
    NamespaceDeclarationImpl namespaceDeclaration = new NamespaceDeclarationImpl();
    return namespaceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportDeclaration createImportDeclaration()
  {
    ImportDeclarationImpl importDeclaration = new ImportDeclarationImpl();
    return importDeclaration;
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
  public Artifact createArtifact()
  {
    ArtifactImpl artifact = new ArtifactImpl();
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParentDslPackage getParentDslPackage()
  {
    return (ParentDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ParentDslPackage getPackage()
  {
    return ParentDslPackage.eINSTANCE;
  }

} //ParentDslFactoryImpl
