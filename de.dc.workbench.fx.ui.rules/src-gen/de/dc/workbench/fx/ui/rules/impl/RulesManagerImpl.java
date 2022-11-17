/**
 */
package de.dc.workbench.fx.ui.rules.impl;

import de.dc.workbench.fx.ui.rules.Output;
import de.dc.workbench.fx.ui.rules.Rule;
import de.dc.workbench.fx.ui.rules.RuleSet;
import de.dc.workbench.fx.ui.rules.RulesManager;
import de.dc.workbench.fx.ui.rules.RulesPackage;
import de.dc.workbench.fx.ui.rules.Uri;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.workbench.fx.ui.rules.impl.RulesManagerImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.impl.RulesManagerImpl#getRuleSet <em>Rule Set</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.impl.RulesManagerImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.impl.RulesManagerImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RulesManagerImpl extends MinimalEObjectImpl.Container implements RulesManager {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getRuleSet() <em>Rule Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleSet()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleSet> ruleSet;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulesManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.RULES_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, RulesPackage.RULES_MANAGER__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleSet> getRuleSet() {
		if (ruleSet == null) {
			ruleSet = new EObjectContainmentEList<RuleSet>(RuleSet.class, this, RulesPackage.RULES_MANAGER__RULE_SET);
		}
		return ruleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Output>(Output.class, this, RulesPackage.RULES_MANAGER__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Uri>(Uri.class, this, RulesPackage.RULES_MANAGER__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RulesPackage.RULES_MANAGER__RULES:
			return ((InternalEList<?>) getRules()).basicRemove(otherEnd, msgs);
		case RulesPackage.RULES_MANAGER__RULE_SET:
			return ((InternalEList<?>) getRuleSet()).basicRemove(otherEnd, msgs);
		case RulesPackage.RULES_MANAGER__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
		case RulesPackage.RULES_MANAGER__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RulesPackage.RULES_MANAGER__RULES:
			return getRules();
		case RulesPackage.RULES_MANAGER__RULE_SET:
			return getRuleSet();
		case RulesPackage.RULES_MANAGER__OUTPUTS:
			return getOutputs();
		case RulesPackage.RULES_MANAGER__IMPORTS:
			return getImports();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RulesPackage.RULES_MANAGER__RULES:
			getRules().clear();
			getRules().addAll((Collection<? extends Rule>) newValue);
			return;
		case RulesPackage.RULES_MANAGER__RULE_SET:
			getRuleSet().clear();
			getRuleSet().addAll((Collection<? extends RuleSet>) newValue);
			return;
		case RulesPackage.RULES_MANAGER__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Output>) newValue);
			return;
		case RulesPackage.RULES_MANAGER__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends Uri>) newValue);
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
		case RulesPackage.RULES_MANAGER__RULES:
			getRules().clear();
			return;
		case RulesPackage.RULES_MANAGER__RULE_SET:
			getRuleSet().clear();
			return;
		case RulesPackage.RULES_MANAGER__OUTPUTS:
			getOutputs().clear();
			return;
		case RulesPackage.RULES_MANAGER__IMPORTS:
			getImports().clear();
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
		case RulesPackage.RULES_MANAGER__RULES:
			return rules != null && !rules.isEmpty();
		case RulesPackage.RULES_MANAGER__RULE_SET:
			return ruleSet != null && !ruleSet.isEmpty();
		case RulesPackage.RULES_MANAGER__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case RulesPackage.RULES_MANAGER__IMPORTS:
			return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RulesManagerImpl
