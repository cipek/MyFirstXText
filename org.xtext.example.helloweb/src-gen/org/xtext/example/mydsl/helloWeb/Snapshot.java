/**
 * generated by Xtext 2.17.0
 */
package org.xtext.example.mydsl.helloWeb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snapshot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.helloWeb.Snapshot#getImage_name <em>Image name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.helloWeb.HelloWebPackage#getSnapshot()
 * @model
 * @generated
 */
public interface Snapshot extends Command
{
  /**
   * Returns the value of the '<em><b>Image name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image name</em>' attribute.
   * @see #setImage_name(String)
   * @see org.xtext.example.mydsl.helloWeb.HelloWebPackage#getSnapshot_Image_name()
   * @model
   * @generated
   */
  String getImage_name();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.helloWeb.Snapshot#getImage_name <em>Image name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image name</em>' attribute.
   * @see #getImage_name()
   * @generated
   */
  void setImage_name(String value);

} // Snapshot
