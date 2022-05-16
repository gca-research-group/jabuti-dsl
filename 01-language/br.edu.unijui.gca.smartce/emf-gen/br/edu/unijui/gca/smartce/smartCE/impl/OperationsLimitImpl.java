/**
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.smartCE.impl;

import br.edu.unijui.gca.smartce.smartCE.OperationsLimit;
import br.edu.unijui.gca.smartce.smartCE.SmartCEPackage;
import br.edu.unijui.gca.smartce.smartCE.UnitTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operations Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.impl.OperationsLimitImpl#getOperationsNumber <em>Operations Number</em>}</li>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.impl.OperationsLimitImpl#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationsLimitImpl extends BusinessRuleImpl implements OperationsLimit
{
	/**
	 * The default value of the '{@link #getOperationsNumber() <em>Operations Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationsNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int OPERATIONS_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOperationsNumber() <em>Operations Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationsNumber()
	 * @generated
	 * @ordered
	 */
	protected int operationsNumber = OPERATIONS_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitTime TIME_UNIT_EDEFAULT = UnitTime.SECOND;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitTime timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationsLimitImpl()
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
		return SmartCEPackage.Literals.OPERATIONS_LIMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOperationsNumber()
	{
		return operationsNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationsNumber(int newOperationsNumber)
	{
		int oldOperationsNumber = operationsNumber;
		operationsNumber = newOperationsNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartCEPackage.OPERATIONS_LIMIT__OPERATIONS_NUMBER, oldOperationsNumber, operationsNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitTime getTimeUnit()
	{
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeUnit(UnitTime newTimeUnit)
	{
		UnitTime oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartCEPackage.OPERATIONS_LIMIT__TIME_UNIT, oldTimeUnit, timeUnit));
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
			case SmartCEPackage.OPERATIONS_LIMIT__OPERATIONS_NUMBER:
				return getOperationsNumber();
			case SmartCEPackage.OPERATIONS_LIMIT__TIME_UNIT:
				return getTimeUnit();
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
			case SmartCEPackage.OPERATIONS_LIMIT__OPERATIONS_NUMBER:
				setOperationsNumber((Integer)newValue);
				return;
			case SmartCEPackage.OPERATIONS_LIMIT__TIME_UNIT:
				setTimeUnit((UnitTime)newValue);
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
			case SmartCEPackage.OPERATIONS_LIMIT__OPERATIONS_NUMBER:
				setOperationsNumber(OPERATIONS_NUMBER_EDEFAULT);
				return;
			case SmartCEPackage.OPERATIONS_LIMIT__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
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
			case SmartCEPackage.OPERATIONS_LIMIT__OPERATIONS_NUMBER:
				return operationsNumber != OPERATIONS_NUMBER_EDEFAULT;
			case SmartCEPackage.OPERATIONS_LIMIT__TIME_UNIT:
				return timeUnit != TIME_UNIT_EDEFAULT;
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
		result.append(" (operationsNumber: ");
		result.append(operationsNumber);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(')');
		return result.toString();
	}

} //OperationsLimitImpl
