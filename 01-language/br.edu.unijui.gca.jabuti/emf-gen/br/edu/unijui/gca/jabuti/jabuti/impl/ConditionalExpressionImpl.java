/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.jabuti.impl;

import br.edu.unijui.gca.jabuti.jabuti.ConditionTerm;
import br.edu.unijui.gca.jabuti.jabuti.ConditionalExpression;
import br.edu.unijui.gca.jabuti.jabuti.JabutiPackage;
import br.edu.unijui.gca.jabuti.jabuti.LogicalOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.ConditionalExpressionImpl#getConditionTerm <em>Condition Term</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.ConditionalExpressionImpl#getConditionParam <em>Condition Param</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.ConditionalExpressionImpl#getAftetrSymbol <em>Aftetr Symbol</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.ConditionalExpressionImpl#getBeforeSymbol <em>Before Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalExpressionImpl extends MinimalEObjectImpl.Container implements ConditionalExpression
{
	/**
	 * The cached value of the '{@link #getConditionTerm() <em>Condition Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionTerm()
	 * @generated
	 * @ordered
	 */
	protected ConditionTerm conditionTerm;

	/**
	 * The cached value of the '{@link #getConditionParam() <em>Condition Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionParam()
	 * @generated
	 * @ordered
	 */
	protected ConditionTerm conditionParam;

	/**
	 * The cached value of the '{@link #getAftetrSymbol() <em>Aftetr Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAftetrSymbol()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperator aftetrSymbol;

	/**
	 * The cached value of the '{@link #getBeforeSymbol() <em>Before Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeSymbol()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperator beforeSymbol;

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
		return JabutiPackage.Literals.CONDITIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionTerm getConditionTerm()
	{
		return conditionTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionTerm(ConditionTerm newConditionTerm, NotificationChain msgs)
	{
		ConditionTerm oldConditionTerm = conditionTerm;
		conditionTerm = newConditionTerm;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_TERM, oldConditionTerm, newConditionTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditionTerm(ConditionTerm newConditionTerm)
	{
		if (newConditionTerm != conditionTerm)
		{
			NotificationChain msgs = null;
			if (conditionTerm != null)
				msgs = ((InternalEObject)conditionTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_TERM, null, msgs);
			if (newConditionTerm != null)
				msgs = ((InternalEObject)newConditionTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_TERM, null, msgs);
			msgs = basicSetConditionTerm(newConditionTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_TERM, newConditionTerm, newConditionTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionTerm getConditionParam()
	{
		return conditionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionParam(ConditionTerm newConditionParam, NotificationChain msgs)
	{
		ConditionTerm oldConditionParam = conditionParam;
		conditionParam = newConditionParam;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_PARAM, oldConditionParam, newConditionParam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditionParam(ConditionTerm newConditionParam)
	{
		if (newConditionParam != conditionParam)
		{
			NotificationChain msgs = null;
			if (conditionParam != null)
				msgs = ((InternalEObject)conditionParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_PARAM, null, msgs);
			if (newConditionParam != null)
				msgs = ((InternalEObject)newConditionParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_PARAM, null, msgs);
			msgs = basicSetConditionParam(newConditionParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_PARAM, newConditionParam, newConditionParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalOperator getAftetrSymbol()
	{
		return aftetrSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAftetrSymbol(LogicalOperator newAftetrSymbol, NotificationChain msgs)
	{
		LogicalOperator oldAftetrSymbol = aftetrSymbol;
		aftetrSymbol = newAftetrSymbol;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JabutiPackage.CONDITIONAL_EXPRESSION__AFTETR_SYMBOL, oldAftetrSymbol, newAftetrSymbol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAftetrSymbol(LogicalOperator newAftetrSymbol)
	{
		if (newAftetrSymbol != aftetrSymbol)
		{
			NotificationChain msgs = null;
			if (aftetrSymbol != null)
				msgs = ((InternalEObject)aftetrSymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.CONDITIONAL_EXPRESSION__AFTETR_SYMBOL, null, msgs);
			if (newAftetrSymbol != null)
				msgs = ((InternalEObject)newAftetrSymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.CONDITIONAL_EXPRESSION__AFTETR_SYMBOL, null, msgs);
			msgs = basicSetAftetrSymbol(newAftetrSymbol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JabutiPackage.CONDITIONAL_EXPRESSION__AFTETR_SYMBOL, newAftetrSymbol, newAftetrSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalOperator getBeforeSymbol()
	{
		return beforeSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeforeSymbol(LogicalOperator newBeforeSymbol, NotificationChain msgs)
	{
		LogicalOperator oldBeforeSymbol = beforeSymbol;
		beforeSymbol = newBeforeSymbol;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JabutiPackage.CONDITIONAL_EXPRESSION__BEFORE_SYMBOL, oldBeforeSymbol, newBeforeSymbol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeforeSymbol(LogicalOperator newBeforeSymbol)
	{
		if (newBeforeSymbol != beforeSymbol)
		{
			NotificationChain msgs = null;
			if (beforeSymbol != null)
				msgs = ((InternalEObject)beforeSymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.CONDITIONAL_EXPRESSION__BEFORE_SYMBOL, null, msgs);
			if (newBeforeSymbol != null)
				msgs = ((InternalEObject)newBeforeSymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.CONDITIONAL_EXPRESSION__BEFORE_SYMBOL, null, msgs);
			msgs = basicSetBeforeSymbol(newBeforeSymbol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JabutiPackage.CONDITIONAL_EXPRESSION__BEFORE_SYMBOL, newBeforeSymbol, newBeforeSymbol));
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
			case JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_TERM:
				return basicSetConditionTerm(null, msgs);
			case JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_PARAM:
				return basicSetConditionParam(null, msgs);
			case JabutiPackage.CONDITIONAL_EXPRESSION__AFTETR_SYMBOL:
				return basicSetAftetrSymbol(null, msgs);
			case JabutiPackage.CONDITIONAL_EXPRESSION__BEFORE_SYMBOL:
				return basicSetBeforeSymbol(null, msgs);
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
			case JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_TERM:
				return getConditionTerm();
			case JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_PARAM:
				return getConditionParam();
			case JabutiPackage.CONDITIONAL_EXPRESSION__AFTETR_SYMBOL:
				return getAftetrSymbol();
			case JabutiPackage.CONDITIONAL_EXPRESSION__BEFORE_SYMBOL:
				return getBeforeSymbol();
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
			case JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_TERM:
				setConditionTerm((ConditionTerm)newValue);
				return;
			case JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_PARAM:
				setConditionParam((ConditionTerm)newValue);
				return;
			case JabutiPackage.CONDITIONAL_EXPRESSION__AFTETR_SYMBOL:
				setAftetrSymbol((LogicalOperator)newValue);
				return;
			case JabutiPackage.CONDITIONAL_EXPRESSION__BEFORE_SYMBOL:
				setBeforeSymbol((LogicalOperator)newValue);
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
			case JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_TERM:
				setConditionTerm((ConditionTerm)null);
				return;
			case JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_PARAM:
				setConditionParam((ConditionTerm)null);
				return;
			case JabutiPackage.CONDITIONAL_EXPRESSION__AFTETR_SYMBOL:
				setAftetrSymbol((LogicalOperator)null);
				return;
			case JabutiPackage.CONDITIONAL_EXPRESSION__BEFORE_SYMBOL:
				setBeforeSymbol((LogicalOperator)null);
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
			case JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_TERM:
				return conditionTerm != null;
			case JabutiPackage.CONDITIONAL_EXPRESSION__CONDITION_PARAM:
				return conditionParam != null;
			case JabutiPackage.CONDITIONAL_EXPRESSION__AFTETR_SYMBOL:
				return aftetrSymbol != null;
			case JabutiPackage.CONDITIONAL_EXPRESSION__BEFORE_SYMBOL:
				return beforeSymbol != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalExpressionImpl