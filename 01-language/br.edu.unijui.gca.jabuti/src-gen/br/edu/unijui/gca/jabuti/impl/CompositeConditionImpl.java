/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.impl;

import br.edu.unijui.gca.jabuti.BusinessRule;
import br.edu.unijui.gca.jabuti.CompositeCondition;
import br.edu.unijui.gca.jabuti.JabutiPackage;
import br.edu.unijui.gca.jabuti.LogicalOperator;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.impl.CompositeConditionImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.impl.CompositeConditionImpl#getLogicalOperators <em>Logical Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeConditionImpl extends ConditionImpl implements CompositeCondition
{
  /**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
  protected EList<BusinessRule> conditions;

  /**
	 * The cached value of the '{@link #getLogicalOperators() <em>Logical Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLogicalOperators()
	 * @generated
	 * @ordered
	 */
  protected EList<LogicalOperator> logicalOperators;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CompositeConditionImpl()
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
		return JabutiPackage.Literals.COMPOSITE_CONDITION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EList<BusinessRule> getConditions()
  {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<BusinessRule>(BusinessRule.class, this, JabutiPackage.COMPOSITE_CONDITION__CONDITIONS);
		}
		return conditions;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EList<LogicalOperator> getLogicalOperators()
  {
		if (logicalOperators == null) {
			logicalOperators = new EObjectContainmentEList<LogicalOperator>(LogicalOperator.class, this, JabutiPackage.COMPOSITE_CONDITION__LOGICAL_OPERATORS);
		}
		return logicalOperators;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case JabutiPackage.COMPOSITE_CONDITION__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case JabutiPackage.COMPOSITE_CONDITION__LOGICAL_OPERATORS:
				return ((InternalEList<?>)getLogicalOperators()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case JabutiPackage.COMPOSITE_CONDITION__CONDITIONS:
				return getConditions();
			case JabutiPackage.COMPOSITE_CONDITION__LOGICAL_OPERATORS:
				return getLogicalOperators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case JabutiPackage.COMPOSITE_CONDITION__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends BusinessRule>)newValue);
				return;
			case JabutiPackage.COMPOSITE_CONDITION__LOGICAL_OPERATORS:
				getLogicalOperators().clear();
				getLogicalOperators().addAll((Collection<? extends LogicalOperator>)newValue);
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
		switch (featureID) {
			case JabutiPackage.COMPOSITE_CONDITION__CONDITIONS:
				getConditions().clear();
				return;
			case JabutiPackage.COMPOSITE_CONDITION__LOGICAL_OPERATORS:
				getLogicalOperators().clear();
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
		switch (featureID) {
			case JabutiPackage.COMPOSITE_CONDITION__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case JabutiPackage.COMPOSITE_CONDITION__LOGICAL_OPERATORS:
				return logicalOperators != null && !logicalOperators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeConditionImpl
