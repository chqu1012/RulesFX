/**
 */
package de.dc.workbench.fx.ui.rules.impl;

import de.dc.workbench.fx.ui.rules.LogicalOperator;
import de.dc.workbench.fx.ui.rules.Rule;
import de.dc.workbench.fx.ui.rules.RulesPackage;
import de.dc.workbench.fx.ui.rules.When;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.workbench.fx.ui.rules.impl.WhenImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.impl.WhenImpl#getRule1 <em>Rule1</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.impl.WhenImpl#getRule2 <em>Rule2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhenImpl extends MinimalEObjectImpl.Container implements When {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperator OPERATOR_EDEFAULT = LogicalOperator.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRule1() <em>Rule1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule1()
	 * @generated
	 * @ordered
	 */
	protected Rule rule1;

	/**
	 * The cached value of the '{@link #getRule2() <em>Rule2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule2()
	 * @generated
	 * @ordered
	 */
	protected Rule rule2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.WHEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(LogicalOperator newOperator) {
		LogicalOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.WHEN__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule1() {
		if (rule1 != null && rule1.eIsProxy()) {
			InternalEObject oldRule1 = (InternalEObject) rule1;
			rule1 = (Rule) eResolveProxy(oldRule1);
			if (rule1 != oldRule1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.WHEN__RULE1, oldRule1,
							rule1));
			}
		}
		return rule1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetRule1() {
		return rule1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule1(Rule newRule1) {
		Rule oldRule1 = rule1;
		rule1 = newRule1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.WHEN__RULE1, oldRule1, rule1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule2() {
		if (rule2 != null && rule2.eIsProxy()) {
			InternalEObject oldRule2 = (InternalEObject) rule2;
			rule2 = (Rule) eResolveProxy(oldRule2);
			if (rule2 != oldRule2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RulesPackage.WHEN__RULE2, oldRule2,
							rule2));
			}
		}
		return rule2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetRule2() {
		return rule2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule2(Rule newRule2) {
		Rule oldRule2 = rule2;
		rule2 = newRule2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RulesPackage.WHEN__RULE2, oldRule2, rule2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RulesPackage.WHEN__OPERATOR:
			return getOperator();
		case RulesPackage.WHEN__RULE1:
			if (resolve)
				return getRule1();
			return basicGetRule1();
		case RulesPackage.WHEN__RULE2:
			if (resolve)
				return getRule2();
			return basicGetRule2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RulesPackage.WHEN__OPERATOR:
			setOperator((LogicalOperator) newValue);
			return;
		case RulesPackage.WHEN__RULE1:
			setRule1((Rule) newValue);
			return;
		case RulesPackage.WHEN__RULE2:
			setRule2((Rule) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case RulesPackage.WHEN__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case RulesPackage.WHEN__RULE1:
			setRule1((Rule) null);
			return;
		case RulesPackage.WHEN__RULE2:
			setRule2((Rule) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RulesPackage.WHEN__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
		case RulesPackage.WHEN__RULE1:
			return rule1 != null;
		case RulesPackage.WHEN__RULE2:
			return rule2 != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //WhenImpl
