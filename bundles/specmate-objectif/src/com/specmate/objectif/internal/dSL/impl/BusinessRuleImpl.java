/**
 * generated by Xtext 2.17.1
 */
package com.specmate.objectif.internal.dSL.impl;

import com.specmate.objectif.internal.dSL.BusinessRule;
import com.specmate.objectif.internal.dSL.DSLPackage;
import com.specmate.objectif.internal.dSL.OR_Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.specmate.objectif.dSL.impl.BusinessRuleImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link com.specmate.objectif.dSL.impl.BusinessRuleImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link com.specmate.objectif.dSL.impl.BusinessRuleImpl#getAlternative <em>Alternative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessRuleImpl extends MinimalEObjectImpl.Container implements BusinessRule
{
  /**
   * The cached value of the '{@link #getCause() <em>Cause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCause()
   * @generated
   * @ordered
   */
  protected OR_Node cause;

  /**
   * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffect()
   * @generated
   * @ordered
   */
  protected EObject effect;

  /**
   * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlternative()
   * @generated
   * @ordered
   */
  protected EObject alternative;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessRuleImpl()
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
    return DSLPackage.Literals.BUSINESS_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OR_Node getCause()
  {
    return cause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCause(OR_Node newCause, NotificationChain msgs)
  {
    OR_Node oldCause = cause;
    cause = newCause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSLPackage.BUSINESS_RULE__CAUSE, oldCause, newCause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCause(OR_Node newCause)
  {
    if (newCause != cause)
    {
      NotificationChain msgs = null;
      if (cause != null)
        msgs = ((InternalEObject)cause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSLPackage.BUSINESS_RULE__CAUSE, null, msgs);
      if (newCause != null)
        msgs = ((InternalEObject)newCause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSLPackage.BUSINESS_RULE__CAUSE, null, msgs);
      msgs = basicSetCause(newCause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.BUSINESS_RULE__CAUSE, newCause, newCause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getEffect()
  {
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEffect(EObject newEffect, NotificationChain msgs)
  {
    EObject oldEffect = effect;
    effect = newEffect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSLPackage.BUSINESS_RULE__EFFECT, oldEffect, newEffect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEffect(EObject newEffect)
  {
    if (newEffect != effect)
    {
      NotificationChain msgs = null;
      if (effect != null)
        msgs = ((InternalEObject)effect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSLPackage.BUSINESS_RULE__EFFECT, null, msgs);
      if (newEffect != null)
        msgs = ((InternalEObject)newEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSLPackage.BUSINESS_RULE__EFFECT, null, msgs);
      msgs = basicSetEffect(newEffect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.BUSINESS_RULE__EFFECT, newEffect, newEffect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getAlternative()
  {
    return alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlternative(EObject newAlternative, NotificationChain msgs)
  {
    EObject oldAlternative = alternative;
    alternative = newAlternative;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSLPackage.BUSINESS_RULE__ALTERNATIVE, oldAlternative, newAlternative);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlternative(EObject newAlternative)
  {
    if (newAlternative != alternative)
    {
      NotificationChain msgs = null;
      if (alternative != null)
        msgs = ((InternalEObject)alternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSLPackage.BUSINESS_RULE__ALTERNATIVE, null, msgs);
      if (newAlternative != null)
        msgs = ((InternalEObject)newAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSLPackage.BUSINESS_RULE__ALTERNATIVE, null, msgs);
      msgs = basicSetAlternative(newAlternative, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.BUSINESS_RULE__ALTERNATIVE, newAlternative, newAlternative));
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
      case DSLPackage.BUSINESS_RULE__CAUSE:
        return basicSetCause(null, msgs);
      case DSLPackage.BUSINESS_RULE__EFFECT:
        return basicSetEffect(null, msgs);
      case DSLPackage.BUSINESS_RULE__ALTERNATIVE:
        return basicSetAlternative(null, msgs);
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
      case DSLPackage.BUSINESS_RULE__CAUSE:
        return getCause();
      case DSLPackage.BUSINESS_RULE__EFFECT:
        return getEffect();
      case DSLPackage.BUSINESS_RULE__ALTERNATIVE:
        return getAlternative();
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
      case DSLPackage.BUSINESS_RULE__CAUSE:
        setCause((OR_Node)newValue);
        return;
      case DSLPackage.BUSINESS_RULE__EFFECT:
        setEffect((EObject)newValue);
        return;
      case DSLPackage.BUSINESS_RULE__ALTERNATIVE:
        setAlternative((EObject)newValue);
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
      case DSLPackage.BUSINESS_RULE__CAUSE:
        setCause((OR_Node)null);
        return;
      case DSLPackage.BUSINESS_RULE__EFFECT:
        setEffect((EObject)null);
        return;
      case DSLPackage.BUSINESS_RULE__ALTERNATIVE:
        setAlternative((EObject)null);
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
      case DSLPackage.BUSINESS_RULE__CAUSE:
        return cause != null;
      case DSLPackage.BUSINESS_RULE__EFFECT:
        return effect != null;
      case DSLPackage.BUSINESS_RULE__ALTERNATIVE:
        return alternative != null;
    }
    return super.eIsSet(featureID);
  }

} //BusinessRuleImpl
