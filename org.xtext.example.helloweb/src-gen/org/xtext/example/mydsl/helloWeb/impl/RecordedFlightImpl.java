/**
 * generated by Xtext 2.17.0
 */
package org.xtext.example.mydsl.helloWeb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.helloWeb.HelloWebPackage;
import org.xtext.example.mydsl.helloWeb.RecordedFlight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recorded Flight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.helloWeb.impl.RecordedFlightImpl#getVideo_name <em>Video name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordedFlightImpl extends MinimalEObjectImpl.Container implements RecordedFlight
{
  /**
   * The default value of the '{@link #getVideo_name() <em>Video name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVideo_name()
   * @generated
   * @ordered
   */
  protected static final String VIDEO_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVideo_name() <em>Video name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVideo_name()
   * @generated
   * @ordered
   */
  protected String video_name = VIDEO_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecordedFlightImpl()
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
    return HelloWebPackage.Literals.RECORDED_FLIGHT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVideo_name()
  {
    return video_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVideo_name(String newVideo_name)
  {
    String oldVideo_name = video_name;
    video_name = newVideo_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HelloWebPackage.RECORDED_FLIGHT__VIDEO_NAME, oldVideo_name, video_name));
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
      case HelloWebPackage.RECORDED_FLIGHT__VIDEO_NAME:
        return getVideo_name();
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
      case HelloWebPackage.RECORDED_FLIGHT__VIDEO_NAME:
        setVideo_name((String)newValue);
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
      case HelloWebPackage.RECORDED_FLIGHT__VIDEO_NAME:
        setVideo_name(VIDEO_NAME_EDEFAULT);
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
      case HelloWebPackage.RECORDED_FLIGHT__VIDEO_NAME:
        return VIDEO_NAME_EDEFAULT == null ? video_name != null : !VIDEO_NAME_EDEFAULT.equals(video_name);
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
    result.append(" (video_name: ");
    result.append(video_name);
    result.append(')');
    return result.toString();
  }

} //RecordedFlightImpl
