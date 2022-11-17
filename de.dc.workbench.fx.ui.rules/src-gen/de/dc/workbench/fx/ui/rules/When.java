/**
 */
package de.dc.workbench.fx.ui.rules;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.workbench.fx.ui.rules.When#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.When#getRule1 <em>Rule1</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.When#getRule2 <em>Rule2</em>}</li>
 * </ul>
 *
 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getWhen()
 * @model
 * @generated
 */
public interface When extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.workbench.fx.ui.rules.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see de.dc.workbench.fx.ui.rules.LogicalOperator
	 * @see #setOperator(LogicalOperator)
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getWhen_Operator()
	 * @model unique="false"
	 * @generated
	 */
	LogicalOperator getOperator();

	/**
	 * Sets the value of the '{@link de.dc.workbench.fx.ui.rules.When#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see de.dc.workbench.fx.ui.rules.LogicalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicalOperator value);

	/**
	 * Returns the value of the '<em><b>Rule1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule1</em>' reference.
	 * @see #setRule1(Rule)
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getWhen_Rule1()
	 * @model
	 * @generated
	 */
	Rule getRule1();

	/**
	 * Sets the value of the '{@link de.dc.workbench.fx.ui.rules.When#getRule1 <em>Rule1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule1</em>' reference.
	 * @see #getRule1()
	 * @generated
	 */
	void setRule1(Rule value);

	/**
	 * Returns the value of the '<em><b>Rule2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule2</em>' reference.
	 * @see #setRule2(Rule)
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getWhen_Rule2()
	 * @model
	 * @generated
	 */
	Rule getRule2();

	/**
	 * Sets the value of the '{@link de.dc.workbench.fx.ui.rules.When#getRule2 <em>Rule2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule2</em>' reference.
	 * @see #getRule2()
	 * @generated
	 */
	void setRule2(Rule value);

} // When
