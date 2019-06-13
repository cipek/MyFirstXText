/**
 * generated by Xtext 2.17.0
 */
package org.xtext.example.mydsl.helloWeb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.helloWeb.HelloWebPackage;
import org.xtext.example.mydsl.helloWeb.Left;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Left</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.helloWeb.impl.LeftImpl#getMilliseconds <em>Milliseconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeftImpl extends CommandImpl implements Left
{
  /**
   * The default value of the '{@link #getMilliseconds() <em>Milliseconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMilliseconds()
   * @generated
   * @ordered
   */
  protected static final int MILLISECONDS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMilliseconds() <em>Milliseconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMilliseconds()
   * @generated
   * @ordered
   */
  protected int milliseconds = MILLISECONDS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeftImpl()
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
    return HelloWebPackage.Literals.LEFT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMilliseconds()
  {
    return milliseconds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMilliseconds(int newMilliseconds)
  {
    int oldMilliseconds = milliseconds;
    milliseconds = newMilliseconds;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HelloWebPackage.LEFT__MILLISECONDS, oldMilliseconds, milliseconds));
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
      case HelloWebPackage.LEFT__MILLISECONDS:
        return getMilliseconds();
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
      case HelloWebPackage.LEFT__MILLISECONDS:
        setMilliseconds((Integer)newValue);
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
      case HelloWebPackage.LEFT__MILLISECONDS:
        setMilliseconds(MILLISECONDS_EDEFAULT);
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
      case HelloWebPackage.LEFT__MILLISECONDS:
        return milliseconds != MILLISECONDS_EDEFAULT;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (milliseconds: ");
    result.append(milliseconds);
    result.append(')');
    return result.toString();
  }

} //LeftImpl