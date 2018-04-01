/**
 * ******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * ******************************************************************************
 */
package org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nb.xtext.example.hyperlink.entitydsl.entityDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityDslFactoryImpl extends EFactoryImpl implements EntityDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EntityDslFactory init()
  {
    try
    {
      EntityDslFactory theEntityDslFactory = (EntityDslFactory)EPackage.Registry.INSTANCE.getEFactory(EntityDslPackage.eNS_URI);
      if (theEntityDslFactory != null)
      {
        return theEntityDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EntityDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityDslFactoryImpl()
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
      case EntityDslPackage.ENTITY_FILE: return createEntityFile();
      case EntityDslPackage.IMPORT: return createImport();
      case EntityDslPackage.ENTITY: return createEntity();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityFile createEntityFile()
  {
    EntityFileImpl entityFile = new EntityFileImpl();
    return entityFile;
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
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityDslPackage getEntityDslPackage()
  {
    return (EntityDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EntityDslPackage getPackage()
  {
    return EntityDslPackage.eINSTANCE;
  }

} //EntityDslFactoryImpl
