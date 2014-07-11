/**
 */
package org.neclipse.xtext.parentdsl.parentDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.neclipse.xtext.parentdsl.parentDsl.Artifact;
import org.neclipse.xtext.parentdsl.parentDsl.ImportDeclaration;
import org.neclipse.xtext.parentdsl.parentDsl.NamespaceDeclaration;
import org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition;
import org.neclipse.xtext.parentdsl.parentDsl.ParentDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.neclipse.xtext.parentdsl.parentDsl.impl.NamespaceDefinitionImpl#getNamespaceDeclaration <em>Namespace Declaration</em>}</li>
 *   <li>{@link org.neclipse.xtext.parentdsl.parentDsl.impl.NamespaceDefinitionImpl#getImportDeclaration <em>Import Declaration</em>}</li>
 *   <li>{@link org.neclipse.xtext.parentdsl.parentDsl.impl.NamespaceDefinitionImpl#getArtifact <em>Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamespaceDefinitionImpl extends MinimalEObjectImpl.Container implements NamespaceDefinition
{
  /**
   * The cached value of the '{@link #getNamespaceDeclaration() <em>Namespace Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespaceDeclaration()
   * @generated
   * @ordered
   */
  protected NamespaceDeclaration namespaceDeclaration;

  /**
   * The cached value of the '{@link #getImportDeclaration() <em>Import Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportDeclaration()
   * @generated
   * @ordered
   */
  protected ImportDeclaration importDeclaration;

  /**
   * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifact()
   * @generated
   * @ordered
   */
  protected Artifact artifact;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamespaceDefinitionImpl()
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
    return ParentDslPackage.Literals.NAMESPACE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceDeclaration getNamespaceDeclaration()
  {
    return namespaceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespaceDeclaration(NamespaceDeclaration newNamespaceDeclaration, NotificationChain msgs)
  {
    NamespaceDeclaration oldNamespaceDeclaration = namespaceDeclaration;
    namespaceDeclaration = newNamespaceDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParentDslPackage.NAMESPACE_DEFINITION__NAMESPACE_DECLARATION, oldNamespaceDeclaration, newNamespaceDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespaceDeclaration(NamespaceDeclaration newNamespaceDeclaration)
  {
    if (newNamespaceDeclaration != namespaceDeclaration)
    {
      NotificationChain msgs = null;
      if (namespaceDeclaration != null)
        msgs = ((InternalEObject)namespaceDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParentDslPackage.NAMESPACE_DEFINITION__NAMESPACE_DECLARATION, null, msgs);
      if (newNamespaceDeclaration != null)
        msgs = ((InternalEObject)newNamespaceDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParentDslPackage.NAMESPACE_DEFINITION__NAMESPACE_DECLARATION, null, msgs);
      msgs = basicSetNamespaceDeclaration(newNamespaceDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ParentDslPackage.NAMESPACE_DEFINITION__NAMESPACE_DECLARATION, newNamespaceDeclaration, newNamespaceDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportDeclaration getImportDeclaration()
  {
    return importDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImportDeclaration(ImportDeclaration newImportDeclaration, NotificationChain msgs)
  {
    ImportDeclaration oldImportDeclaration = importDeclaration;
    importDeclaration = newImportDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParentDslPackage.NAMESPACE_DEFINITION__IMPORT_DECLARATION, oldImportDeclaration, newImportDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportDeclaration(ImportDeclaration newImportDeclaration)
  {
    if (newImportDeclaration != importDeclaration)
    {
      NotificationChain msgs = null;
      if (importDeclaration != null)
        msgs = ((InternalEObject)importDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParentDslPackage.NAMESPACE_DEFINITION__IMPORT_DECLARATION, null, msgs);
      if (newImportDeclaration != null)
        msgs = ((InternalEObject)newImportDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParentDslPackage.NAMESPACE_DEFINITION__IMPORT_DECLARATION, null, msgs);
      msgs = basicSetImportDeclaration(newImportDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ParentDslPackage.NAMESPACE_DEFINITION__IMPORT_DECLARATION, newImportDeclaration, newImportDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifact getArtifact()
  {
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArtifact(Artifact newArtifact, NotificationChain msgs)
  {
    Artifact oldArtifact = artifact;
    artifact = newArtifact;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParentDslPackage.NAMESPACE_DEFINITION__ARTIFACT, oldArtifact, newArtifact);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifact(Artifact newArtifact)
  {
    if (newArtifact != artifact)
    {
      NotificationChain msgs = null;
      if (artifact != null)
        msgs = ((InternalEObject)artifact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParentDslPackage.NAMESPACE_DEFINITION__ARTIFACT, null, msgs);
      if (newArtifact != null)
        msgs = ((InternalEObject)newArtifact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParentDslPackage.NAMESPACE_DEFINITION__ARTIFACT, null, msgs);
      msgs = basicSetArtifact(newArtifact, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ParentDslPackage.NAMESPACE_DEFINITION__ARTIFACT, newArtifact, newArtifact));
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
      case ParentDslPackage.NAMESPACE_DEFINITION__NAMESPACE_DECLARATION:
        return basicSetNamespaceDeclaration(null, msgs);
      case ParentDslPackage.NAMESPACE_DEFINITION__IMPORT_DECLARATION:
        return basicSetImportDeclaration(null, msgs);
      case ParentDslPackage.NAMESPACE_DEFINITION__ARTIFACT:
        return basicSetArtifact(null, msgs);
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
      case ParentDslPackage.NAMESPACE_DEFINITION__NAMESPACE_DECLARATION:
        return getNamespaceDeclaration();
      case ParentDslPackage.NAMESPACE_DEFINITION__IMPORT_DECLARATION:
        return getImportDeclaration();
      case ParentDslPackage.NAMESPACE_DEFINITION__ARTIFACT:
        return getArtifact();
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
      case ParentDslPackage.NAMESPACE_DEFINITION__NAMESPACE_DECLARATION:
        setNamespaceDeclaration((NamespaceDeclaration)newValue);
        return;
      case ParentDslPackage.NAMESPACE_DEFINITION__IMPORT_DECLARATION:
        setImportDeclaration((ImportDeclaration)newValue);
        return;
      case ParentDslPackage.NAMESPACE_DEFINITION__ARTIFACT:
        setArtifact((Artifact)newValue);
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
      case ParentDslPackage.NAMESPACE_DEFINITION__NAMESPACE_DECLARATION:
        setNamespaceDeclaration((NamespaceDeclaration)null);
        return;
      case ParentDslPackage.NAMESPACE_DEFINITION__IMPORT_DECLARATION:
        setImportDeclaration((ImportDeclaration)null);
        return;
      case ParentDslPackage.NAMESPACE_DEFINITION__ARTIFACT:
        setArtifact((Artifact)null);
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
      case ParentDslPackage.NAMESPACE_DEFINITION__NAMESPACE_DECLARATION:
        return namespaceDeclaration != null;
      case ParentDslPackage.NAMESPACE_DEFINITION__IMPORT_DECLARATION:
        return importDeclaration != null;
      case ParentDslPackage.NAMESPACE_DEFINITION__ARTIFACT:
        return artifact != null;
    }
    return super.eIsSet(featureID);
  }

} //NamespaceDefinitionImpl
