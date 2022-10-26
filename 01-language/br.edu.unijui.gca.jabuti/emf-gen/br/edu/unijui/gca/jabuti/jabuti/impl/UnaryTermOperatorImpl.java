/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.jabuti.impl;

import br.edu.unijui.gca.jabuti.jabuti.ConditionTerm;
import br.edu.unijui.gca.jabuti.jabuti.JabutiPackage;
import br.edu.unijui.gca.jabuti.jabuti.UnaryTermOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Term Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.UnaryTermOperatorImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.UnaryTermOperatorImpl#getConditionTerm <em>Condition Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryTermOperatorImpl extends ConditionTermImpl implements UnaryTermOperator
{
	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryTermOperatorImpl()
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
		return JabutiPackage.Literals.UNARY_TERM_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbol()
	{
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbol(String newSymbol)
	{
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JabutiPackage.UNARY_TERM_OPERATOR__SYMBOL, oldSymbol, symbol));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JabutiPackage.UNARY_TERM_OPERATOR__CONDITION_TERM, oldConditionTerm, newConditionTerm);
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
				msgs = ((InternalEObject)conditionTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.UNARY_TERM_OPERATOR__CONDITION_TERM, null, msgs);
			if (newConditionTerm != null)
				msgs = ((InternalEObject)newConditionTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.UNARY_TERM_OPERATOR__CONDITION_TERM, null, msgs);
			msgs = basicSetConditionTerm(newConditionTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JabutiPackage.UNARY_TERM_OPERATOR__CONDITION_TERM, newConditionTerm, newConditionTerm));
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
			case JabutiPackage.UNARY_TERM_OPERATOR__CONDITION_TERM:
				return basicSetConditionTerm(null, msgs);
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
			case JabutiPackage.UNARY_TERM_OPERATOR__SYMBOL:
				return getSymbol();
			case JabutiPackage.UNARY_TERM_OPERATOR__CONDITION_TERM:
				return getConditionTerm();
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
			case JabutiPackage.UNARY_TERM_OPERATOR__SYMBOL:
				setSymbol((String)newValue);
				return;
			case JabutiPackage.UNARY_TERM_OPERATOR__CONDITION_TERM:
				setConditionTerm((ConditionTerm)newValue);
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
			case JabutiPackage.UNARY_TERM_OPERATOR__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case JabutiPackage.UNARY_TERM_OPERATOR__CONDITION_TERM:
				setConditionTerm((ConditionTerm)null);
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
			case JabutiPackage.UNARY_TERM_OPERATOR__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case JabutiPackage.UNARY_TERM_OPERATOR__CONDITION_TERM:
				return conditionTerm != null;
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
		result.append(" (symbol: ");
		result.append(symbol);
		result.append(')');
		return result.toString();
	}

} //UnaryTermOperatorImpl
