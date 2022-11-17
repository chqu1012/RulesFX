/**
 */
package de.dc.workbench.fx.ui.rules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.workbench.fx.ui.rules.RulesManager#getRules <em>Rules</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.RulesManager#getRuleSet <em>Rule Set</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.RulesManager#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.RulesManager#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRulesManager()
 * @model
 * @generated
 */
public interface RulesManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.workbench.fx.ui.rules.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRulesManager_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Rule Set</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.workbench.fx.ui.rules.RuleSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Set</em>' containment reference list.
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRulesManager_RuleSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleSet> getRuleSet();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.workbench.fx.ui.rules.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRulesManager_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.workbench.fx.ui.rules.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRulesManager_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uri> getImports();

} // RulesManager
