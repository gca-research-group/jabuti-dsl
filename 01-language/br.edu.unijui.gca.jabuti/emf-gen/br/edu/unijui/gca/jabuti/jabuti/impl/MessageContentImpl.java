/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.jabuti.impl;

import br.edu.unijui.gca.jabuti.jabuti.ComparisonOperator;
import br.edu.unijui.gca.jabuti.jabuti.Expression;
import br.edu.unijui.gca.jabuti.jabuti.JabutiPackage;
import br.edu.unijui.gca.jabuti.jabuti.MessageContent;
import br.edu.unijui.gca.jabuti.jabuti.TimeUnit;
import br.edu.unijui.gca.jabuti.jabuti.VariableValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.MessageContentImpl#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.MessageContentImpl#getContent <em>Content</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.MessageContentImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.MessageContentImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.impl.MessageContentImpl#getVariableValue <em>Variable Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageContentImpl extends TermImpl implements MessageContent
{
	/**
	 * The cached value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator comparisonOperator;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit TIME_UNIT_EDEFAULT = TimeUnit.SECOND;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The cached value of the '{@link #getVariableValue() <em>Variable Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableValue()
	 * @generated
	 * @ordered
	 */
	protected VariableValue variableValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageContentImpl()
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
		return JabutiPackage.Literals.MESSAGE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOperator getComparisonOperator()
	{
		return comparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparisonOperator(ComparisonOperator newComparisonOperator, NotificationChain msgs)
	{
		ComparisonOperator oldComparisonOperator = comparisonOperator;
		comparisonOperator = newComparisonOperator;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JabutiPackage.MESSAGE_CONTENT__COMPARISON_OPERATOR, oldComparisonOperator, newComparisonOperator);
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
	public void setComparisonOperator(ComparisonOperator newComparisonOperator)
	{
		if (newComparisonOperator != comparisonOperator)
		{
			NotificationChain msgs = null;
			if (comparisonOperator != null)
				msgs = ((InternalEObject)comparisonOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.MESSAGE_CONTENT__COMPARISON_OPERATOR, null, msgs);
			if (newComparisonOperator != null)
				msgs = ((InternalEObject)newComparisonOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.MESSAGE_CONTENT__COMPARISON_OPERATOR, null, msgs);
			msgs = basicSetComparisonOperator(newComparisonOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JabutiPackage.MESSAGE_CONTENT__COMPARISON_OPERATOR, newComparisonOperator, newComparisonOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent()
	{
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent)
	{
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JabutiPackage.MESSAGE_CONTENT__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeUnit getTimeUnit()
	{
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeUnit(TimeUnit newTimeUnit)
	{
		TimeUnit oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JabutiPackage.MESSAGE_CONTENT__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpression()
	{
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
	{
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JabutiPackage.MESSAGE_CONTENT__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(Expression newExpression)
	{
		if (newExpression != expression)
		{
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.MESSAGE_CONTENT__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.MESSAGE_CONTENT__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JabutiPackage.MESSAGE_CONTENT__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableValue getVariableValue()
	{
		return variableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableValue(VariableValue newVariableValue, NotificationChain msgs)
	{
		VariableValue oldVariableValue = variableValue;
		variableValue = newVariableValue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JabutiPackage.MESSAGE_CONTENT__VARIABLE_VALUE, oldVariableValue, newVariableValue);
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
	public void setVariableValue(VariableValue newVariableValue)
	{
		if (newVariableValue != variableValue)
		{
			NotificationChain msgs = null;
			if (variableValue != null)
				msgs = ((InternalEObject)variableValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.MESSAGE_CONTENT__VARIABLE_VALUE, null, msgs);
			if (newVariableValue != null)
				msgs = ((InternalEObject)newVariableValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JabutiPackage.MESSAGE_CONTENT__VARIABLE_VALUE, null, msgs);
			msgs = basicSetVariableValue(newVariableValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JabutiPackage.MESSAGE_CONTENT__VARIABLE_VALUE, newVariableValue, newVariableValue));
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
			case JabutiPackage.MESSAGE_CONTENT__COMPARISON_OPERATOR:
				return basicSetComparisonOperator(null, msgs);
			case JabutiPackage.MESSAGE_CONTENT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case JabutiPackage.MESSAGE_CONTENT__VARIABLE_VALUE:
				return basicSetVariableValue(null, msgs);
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
			case JabutiPackage.MESSAGE_CONTENT__COMPARISON_OPERATOR:
				return getComparisonOperator();
			case JabutiPackage.MESSAGE_CONTENT__CONTENT:
				return getContent();
			case JabutiPackage.MESSAGE_CONTENT__TIME_UNIT:
				return getTimeUnit();
			case JabutiPackage.MESSAGE_CONTENT__EXPRESSION:
				return getExpression();
			case JabutiPackage.MESSAGE_CONTENT__VARIABLE_VALUE:
				return getVariableValue();
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
			case JabutiPackage.MESSAGE_CONTENT__COMPARISON_OPERATOR:
				setComparisonOperator((ComparisonOperator)newValue);
				return;
			case JabutiPackage.MESSAGE_CONTENT__CONTENT:
				setContent((String)newValue);
				return;
			case JabutiPackage.MESSAGE_CONTENT__TIME_UNIT:
				setTimeUnit((TimeUnit)newValue);
				return;
			case JabutiPackage.MESSAGE_CONTENT__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case JabutiPackage.MESSAGE_CONTENT__VARIABLE_VALUE:
				setVariableValue((VariableValue)newValue);
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
			case JabutiPackage.MESSAGE_CONTENT__COMPARISON_OPERATOR:
				setComparisonOperator((ComparisonOperator)null);
				return;
			case JabutiPackage.MESSAGE_CONTENT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case JabutiPackage.MESSAGE_CONTENT__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
				return;
			case JabutiPackage.MESSAGE_CONTENT__EXPRESSION:
				setExpression((Expression)null);
				return;
			case JabutiPackage.MESSAGE_CONTENT__VARIABLE_VALUE:
				setVariableValue((VariableValue)null);
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
			case JabutiPackage.MESSAGE_CONTENT__COMPARISON_OPERATOR:
				return comparisonOperator != null;
			case JabutiPackage.MESSAGE_CONTENT__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case JabutiPackage.MESSAGE_CONTENT__TIME_UNIT:
				return timeUnit != TIME_UNIT_EDEFAULT;
			case JabutiPackage.MESSAGE_CONTENT__EXPRESSION:
				return expression != null;
			case JabutiPackage.MESSAGE_CONTENT__VARIABLE_VALUE:
				return variableValue != null;
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
		result.append(" (content: ");
		result.append(content);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(')');
		return result.toString();
	}

} //MessageContentImpl