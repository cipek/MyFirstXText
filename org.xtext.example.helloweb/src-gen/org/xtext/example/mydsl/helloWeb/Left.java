/**
 * generated by Xtext 2.17.0
 */
package org.xtext.example.mydsl.helloWeb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Left</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.helloWeb.Left#getMilliseconds <em>Milliseconds</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.helloWeb.HelloWebPackage#getLeft()
 * @model
 * @generated
 */
public interface Left extends Command
{
  /**
   * Returns the value of the '<em><b>Milliseconds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Milliseconds</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Milliseconds</em>' attribute.
   * @see #setMilliseconds(int)
   * @see org.xtext.example.mydsl.helloWeb.HelloWebPackage#getLeft_Milliseconds()
   * @model
   * @generated
   */
  int getMilliseconds();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.helloWeb.Left#getMilliseconds <em>Milliseconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Milliseconds</em>' attribute.
   * @see #getMilliseconds()
   * @generated
   */
  void setMilliseconds(int value);

} // Left
