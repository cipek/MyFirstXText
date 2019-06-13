/**
 * generated by Xtext 2.17.0
 */
package org.xtext.example.mydsl.helloWeb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.helloWeb.Backward#getMilliseconds <em>Milliseconds</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.helloWeb.HelloWebPackage#getBackward()
 * @model
 * @generated
 */
public interface Backward extends Command
{
  /**
   * Returns the value of the '<em><b>Milliseconds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Milliseconds</em>' attribute.
   * @see #setMilliseconds(int)
   * @see org.xtext.example.mydsl.helloWeb.HelloWebPackage#getBackward_Milliseconds()
   * @model
   * @generated
   */
  int getMilliseconds();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.helloWeb.Backward#getMilliseconds <em>Milliseconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Milliseconds</em>' attribute.
   * @see #getMilliseconds()
   * @generated
   */
  void setMilliseconds(int value);

} // Backward
