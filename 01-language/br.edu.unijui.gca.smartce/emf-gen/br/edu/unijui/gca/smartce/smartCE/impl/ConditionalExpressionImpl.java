/**
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.smartCE.impl;

import br.edu.unijui.gca.smartce.smartCE.CompositeCondition;
import br.edu.unijui.gca.smartce.smartCE.ConditionalExpression;
import br.edu.unijui.gca.smartce.smartCE.LogicalOperator;
import br.edu.unijui.gca.smartce.smartCE.SmartCEPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.impl.ConditionalExpressionImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.impl.ConditionalExpressionImpl#getLogicalOperators <em>Logical Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalExpressionImpl extends ConditionImpl implements ConditionalExpression
{
	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeCondition> conditions;

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
	protected ConditionalExpressionImpl()
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
		return SmartCEPackage.Literals.CONDITIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompositeCondition> getConditions()
	{
		if (conditions == null)
		{
			conditions = new EObjectContainmentEList<CompositeCondition>(CompositeCondition.class, this, SmartCEPackage.CONDITIONAL_EXPRESSION__CONDITIONS);
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
		if (logicalOperators == null)
		{
			logicalOperators = new EObjectContainmentEList<LogicalOperator>(LogicalOperator.class, this, SmartCEPackage.CONDITIONAL_EXPRESSION__LOGICAL_OPERATORS);
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
		switch (featureID)
		{
			case SmartCEPackage.CONDITIONAL_EXPRESSION__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case SmartCEPackage.CONDITIONAL_EXPRESSION__LOGICAL_OPERATORS:
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
		switch (featureID)
		{
			case SmartCEPackage.CONDITIONAL_EXPRESSION__CONDITIONS:
				return getConditions();
			case SmartCEPackage.CONDITIONAL_EXPRESSION__LOGICAL_OPERATORS:
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
		switch (featureID)
		{
			case SmartCEPackage.CONDITIONAL_EXPRESSION__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends CompositeCondition>)newValue);
				return;
			case SmartCEPackage.CONDITIONAL_EXPRESSION__LOGICAL_OPERATORS:
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
		switch (featureID)
		{
			case SmartCEPackage.CONDITIONAL_EXPRESSION__CONDITIONS:
				getConditions().clear();
				return;
			case SmartCEPackage.CONDITIONAL_EXPRESSION__LOGICAL_OPERATORS:
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
		switch (featureID)
		{
			case SmartCEPackage.CONDITIONAL_EXPRESSION__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case SmartCEPackage.CONDITIONAL_EXPRESSION__LOGICAL_OPERATORS:
				return logicalOperators != null && !logicalOperators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionalExpressionImpl
