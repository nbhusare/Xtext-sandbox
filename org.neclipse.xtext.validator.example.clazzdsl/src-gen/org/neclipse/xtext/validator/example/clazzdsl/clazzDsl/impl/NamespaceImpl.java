/**
 * ******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * ******************************************************************************
 */
package org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl;

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

import org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Clazz;
import org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.ClazzDslPackage;
import org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Import;
import org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.NamespaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.NamespaceImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.impl.NamespaceImpl#getClazz <em>Clazz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceImpl extends MinimalEObjectImpl.Container implements Namespace
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
   * The cached value of the '{@link #getClazz() <em>Clazz</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClazz()
   * @generated
   * @ordered
   */
  protected Clazz clazz;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamespaceImpl()
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
    return ClazzDslPackage.Literals.NAMESPACE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ClazzDslPackage.NAMESPACE__NAME, oldName, name));
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
      imports = new EObjectContainmentEList<Import>(Import.class, this, ClazzDslPackage.NAMESPACE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clazz getClazz()
  {
    return clazz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClazz(Clazz newClazz, NotificationChain msgs)
  {
    Clazz oldClazz = clazz;
    clazz = newClazz;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClazzDslPackage.NAMESPACE__CLAZZ, oldClazz, newClazz);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClazz(Clazz newClazz)
  {
    if (newClazz != clazz)
    {
      NotificationChain msgs = null;
      if (clazz != null)
        msgs = ((InternalEObject)clazz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClazzDslPackage.NAMESPACE__CLAZZ, null, msgs);
      if (newClazz != null)
        msgs = ((InternalEObject)newClazz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClazzDslPackage.NAMESPACE__CLAZZ, null, msgs);
      msgs = basicSetClazz(newClazz, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClazzDslPackage.NAMESPACE__CLAZZ, newClazz, newClazz));
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
      case ClazzDslPackage.NAMESPACE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case ClazzDslPackage.NAMESPACE__CLAZZ:
        return basicSetClazz(null, msgs);
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
      case ClazzDslPackage.NAMESPACE__NAME:
        return getName();
      case ClazzDslPackage.NAMESPACE__IMPORTS:
        return getImports();
      case ClazzDslPackage.NAMESPACE__CLAZZ:
        return getClazz();
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
      case ClazzDslPackage.NAMESPACE__NAME:
        setName((String)newValue);
        return;
      case ClazzDslPackage.NAMESPACE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case ClazzDslPackage.NAMESPACE__CLAZZ:
        setClazz((Clazz)newValue);
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
      case ClazzDslPackage.NAMESPACE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ClazzDslPackage.NAMESPACE__IMPORTS:
        getImports().clear();
        return;
      case ClazzDslPackage.NAMESPACE__CLAZZ:
        setClazz((Clazz)null);
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
      case ClazzDslPackage.NAMESPACE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ClazzDslPackage.NAMESPACE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case ClazzDslPackage.NAMESPACE__CLAZZ:
        return clazz != null;
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

} //NamespaceImpl
