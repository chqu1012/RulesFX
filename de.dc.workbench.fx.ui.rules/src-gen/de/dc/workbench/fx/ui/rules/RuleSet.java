/**
 */
package de.dc.workbench.fx.ui.rules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.workbench.fx.ui.rules.RuleSet#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.RuleSet#getRules <em>Rules</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.RuleSet#getInput <em>Input</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.RuleSet#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRuleSet()
 * @model
 * @generated
 */
public interface RuleSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRuleSet_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.workbench.fx.ui.rules.RuleSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' reference list.
	 * The list contents are of type {@link de.dc.workbench.fx.ui.rules.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' reference list.
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRuleSet_Rules()
	 * @model
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(Input)
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRuleSet_Input()
	 * @model containment="true"
	 * @generated
	 */
	Input getInput();

	/**
	 * Sets the value of the '{@link de.dc.workbench.fx.ui.rules.RuleSet#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Input value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Output)
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRuleSet_Output()
	 * @model
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link de.dc.workbench.fx.ui.rules.RuleSet#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

} // RuleSet
