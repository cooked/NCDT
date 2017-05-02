/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.ncdt.gCode.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.ncdt.gCode.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GCodeFactoryImpl extends EFactoryImpl implements GCodeFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GCodeFactory init()
  {
    try
    {
      GCodeFactory theGCodeFactory = (GCodeFactory)EPackage.Registry.INSTANCE.getEFactory(GCodePackage.eNS_URI);
      if (theGCodeFactory != null)
      {
        return theGCodeFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GCodeFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GCodeFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GCodePackage.MODEL: return createModel();
      case GCodePackage.BLOCK: return createBlock();
      case GCodePackage.GBLOCK: return createGBlock();
      case GCodePackage.MBLOCK: return createMBlock();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GBlock createGBlock()
  {
    GBlockImpl gBlock = new GBlockImpl();
    return gBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MBlock createMBlock()
  {
    MBlockImpl mBlock = new MBlockImpl();
    return mBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GCodePackage getGCodePackage()
  {
    return (GCodePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GCodePackage getPackage()
  {
    return GCodePackage.eINSTANCE;
  }

} //GCodeFactoryImpl