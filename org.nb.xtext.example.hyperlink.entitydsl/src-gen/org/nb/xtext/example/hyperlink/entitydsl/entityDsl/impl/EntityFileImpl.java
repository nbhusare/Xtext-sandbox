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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Entity;
import org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityDslPackage;
import org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile;
import org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityFileImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityFileImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.nb.xtext.example.hyperlink.entitydsl.entityDsl.impl.EntityFileImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityFileImpl extends MinimalEObjectImpl.Container implements EntityFile
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected Entity entity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityFileImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EntityDslPackage.Literals.ENTITY_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.ENTITY_FILE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, EntityDslPackage.ENTITY_FILE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs)
  {
    Entity oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityDslPackage.ENTITY_FILE__ENTITY, oldEntity, newEntity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(Entity newEntity)
  {
    if (newEntity != entity)
    {
      NotificationChain msgs = null;
      if (entity != null)
        msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityDslPackage.ENTITY_FILE__ENTITY, null, msgs);
      if (newEntity != null)
        msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityDslPackage.ENTITY_FILE__ENTITY, null, msgs);
      msgs = basicSetEntity(newEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.ENTITY_FILE__ENTITY, newEntity, newEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EntityDslPackage.ENTITY_FILE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case EntityDslPackage.ENTITY_FILE__ENTITY:
        return basicSetEntity(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EntityDslPackage.ENTITY_FILE__NAME:
        return getName();
      case EntityDslPackage.ENTITY_FILE__IMPORTS:
        return getImports();
      case EntityDslPackage.ENTITY_FILE__ENTITY:
        return getEntity();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EntityDslPackage.ENTITY_FILE__NAME:
        setName((String)newValue);
        return;
      case EntityDslPackage.ENTITY_FILE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case EntityDslPackage.ENTITY_FILE__ENTITY:
        setEntity((Entity)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EntityDslPackage.ENTITY_FILE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EntityDslPackage.ENTITY_FILE__IMPORTS:
        getImports().clear();
        return;
      case EntityDslPackage.ENTITY_FILE__ENTITY:
        setEntity((Entity)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EntityDslPackage.ENTITY_FILE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EntityDslPackage.ENTITY_FILE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case EntityDslPackage.ENTITY_FILE__ENTITY:
        return entity != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EntityFileImpl
