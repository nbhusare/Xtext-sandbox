/**
 */
package org.neclipse.xtext.functiondsl.functionDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.neclipse.xtext.entitydsl.entityDsl.Attribute;

import org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute;
import org.neclipse.xtext.functiondsl.functionDsl.FunctionDslPackage;
import org.neclipse.xtext.functiondsl.functionDsl.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.neclipse.xtext.functiondsl.functionDsl.impl.EntityAttributeImpl#getEntityReference <em>Entity Reference</em>}</li>
 *   <li>{@link org.neclipse.xtext.functiondsl.functionDsl.impl.EntityAttributeImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.neclipse.xtext.functiondsl.functionDsl.impl.EntityAttributeImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityAttributeImpl extends MinimalEObjectImpl.Container implements EntityAttribute
{
  /**
   * The cached value of the '{@link #getEntityReference() <em>Entity Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityReference()
   * @generated
   * @ordered
   */
  protected Parameter entityReference;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected EntityAttribute ref;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected Attribute attribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityAttributeImpl()
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
    return FunctionDslPackage.Literals.ENTITY_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getEntityReference()
  {
    if (entityReference != null && entityReference.eIsProxy())
    {
      InternalEObject oldEntityReference = (InternalEObject)entityReference;
      entityReference = (Parameter)eResolveProxy(oldEntityReference);
      if (entityReference != oldEntityReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionDslPackage.ENTITY_ATTRIBUTE__ENTITY_REFERENCE, oldEntityReference, entityReference));
      }
    }
    return entityReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter basicGetEntityReference()
  {
    return entityReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityReference(Parameter newEntityReference)
  {
    Parameter oldEntityReference = entityReference;
    entityReference = newEntityReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionDslPackage.ENTITY_ATTRIBUTE__ENTITY_REFERENCE, oldEntityReference, entityReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityAttribute getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(EntityAttribute newRef, NotificationChain msgs)
  {
    EntityAttribute oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionDslPackage.ENTITY_ATTRIBUTE__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(EntityAttribute newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionDslPackage.ENTITY_ATTRIBUTE__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionDslPackage.ENTITY_ATTRIBUTE__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionDslPackage.ENTITY_ATTRIBUTE__REF, newRef, newRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttribute()
  {
    if (attribute != null && attribute.eIsProxy())
    {
      InternalEObject oldAttribute = (InternalEObject)attribute;
      attribute = (Attribute)eResolveProxy(oldAttribute);
      if (attribute != oldAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionDslPackage.ENTITY_ATTRIBUTE__ATTRIBUTE, oldAttribute, attribute));
      }
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(Attribute newAttribute)
  {
    Attribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionDslPackage.ENTITY_ATTRIBUTE__ATTRIBUTE, oldAttribute, attribute));
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
      case FunctionDslPackage.ENTITY_ATTRIBUTE__REF:
        return basicSetRef(null, msgs);
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
      case FunctionDslPackage.ENTITY_ATTRIBUTE__ENTITY_REFERENCE:
        if (resolve) return getEntityReference();
        return basicGetEntityReference();
      case FunctionDslPackage.ENTITY_ATTRIBUTE__REF:
        return getRef();
      case FunctionDslPackage.ENTITY_ATTRIBUTE__ATTRIBUTE:
        if (resolve) return getAttribute();
        return basicGetAttribute();
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
      case FunctionDslPackage.ENTITY_ATTRIBUTE__ENTITY_REFERENCE:
        setEntityReference((Parameter)newValue);
        return;
      case FunctionDslPackage.ENTITY_ATTRIBUTE__REF:
        setRef((EntityAttribute)newValue);
        return;
      case FunctionDslPackage.ENTITY_ATTRIBUTE__ATTRIBUTE:
        setAttribute((Attribute)newValue);
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
      case FunctionDslPackage.ENTITY_ATTRIBUTE__ENTITY_REFERENCE:
        setEntityReference((Parameter)null);
        return;
      case FunctionDslPackage.ENTITY_ATTRIBUTE__REF:
        setRef((EntityAttribute)null);
        return;
      case FunctionDslPackage.ENTITY_ATTRIBUTE__ATTRIBUTE:
        setAttribute((Attribute)null);
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
      case FunctionDslPackage.ENTITY_ATTRIBUTE__ENTITY_REFERENCE:
        return entityReference != null;
      case FunctionDslPackage.ENTITY_ATTRIBUTE__REF:
        return ref != null;
      case FunctionDslPackage.ENTITY_ATTRIBUTE__ATTRIBUTE:
        return attribute != null;
    }
    return super.eIsSet(featureID);
  }

} //EntityAttributeImpl
