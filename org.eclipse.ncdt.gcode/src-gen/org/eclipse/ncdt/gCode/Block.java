/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.ncdt.gCode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ncdt.gCode.Block#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.ncdt.gCode.Block#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see org.eclipse.ncdt.gCode.GCodePackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.ncdt.gCode.GCodePackage#getBlock_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.ncdt.gCode.Block#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' attribute list.
   * @see org.eclipse.ncdt.gCode.GCodePackage#getBlock_Arguments()
   * @model unique="false"
   * @generated
   */
  EList<String> getArguments();

} // Block
