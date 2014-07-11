/**
 */
package org.neclipse.xtext.functiondsl.functionDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute;
import org.neclipse.xtext.functiondsl.functionDsl.FunctionDslPackage;
import org.neclipse.xtext.functiondsl.functionDsl.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.neclipse.xtext.functiondsl.functionDsl.impl.VariableDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.neclipse.xtext.functiondsl.functionDsl.impl.VariableDeclarationImpl#getEntityAttribute <em>Entity Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationImpl extends MinimalEObjectImpl.Container implements VariableDeclaration
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
   * The cached value of the '{@link #getEntityAttribute() <em>Entity Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityAttribute()
   * @generated
   * @ordered
   */
  protected EntityAttribute entityAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDeclarationImpl()
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
    return FunctionDslPackage.Literals.VARIABLE_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionDslPackage.VARIABLE_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityAttribute getEntityAttribute()
  {
    return entityAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntityAttribute(EntityAttribute newEntityAttribute, NotificationChain msgs)
  {
    EntityAttribute oldEntityAttribute = entityAttribute;
    entityAttribute = newEntityAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionDslPackage.VARIABLE_DECLARATION__ENTITY_ATTRIBUTE, oldEntityAttribute, newEntityAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityAttribute(EntityAttribute newEntityAttribute)
  {
    if (newEntityAttribute != entityAttribute)
    {
      NotificationChain msgs = null;
      if (entityAttribute != null)
        msgs = ((InternalEObject)entityAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionDslPackage.VARIABLE_DECLARATION__ENTITY_ATTRIBUTE, null, msgs);
      if (newEntityAttribute != null)
        msgs = ((InternalEObject)newEntityAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionDslPackage.VARIABLE_DECLARATION__ENTITY_ATTRIBUTE, null, msgs);
      msgs = basicSetEntityAttribute(newEntityAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionDslPackage.VARIABLE_DECLARATION__ENTITY_ATTRIBUTE, newEntityAttribute, newEntityAttribute));
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
      case FunctionDslPackage.VARIABLE_DECLARATION__ENTITY_ATTRIBUTE:
        return basicSetEntityAttribute(null, msgs);
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
      case FunctionDslPackage.VARIABLE_DECLARATION__NAME:
        return getName();
      case FunctionDslPackage.VARIABLE_DECLARATION__ENTITY_ATTRIBUTE:
        return getEntityAttribute();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FunctionDslPackage.VARIABLE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case FunctionDslPackage.VARIABLE_DECLARATION__ENTITY_ATTRIBUTE:
        setEntityAttribute((EntityAttribute)newValue);
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
      case FunctionDslPackage.VARIABLE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FunctionDslPackage.VARIABLE_DECLARATION__ENTITY_ATTRIBUTE:
        setEntityAttribute((EntityAttribute)null);
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
      case FunctionDslPackage.VARIABLE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FunctionDslPackage.VARIABLE_DECLARATION__ENTITY_ATTRIBUTE:
        return entityAttribute != null;
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

} //VariableDeclarationImpl
