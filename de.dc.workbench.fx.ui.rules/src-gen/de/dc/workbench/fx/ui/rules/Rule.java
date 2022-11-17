/**
 */
package de.dc.workbench.fx.ui.rules;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.workbench.fx.ui.rules.Rule#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.Rule#getCategory <em>Category</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.Rule#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.Rule#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.Rule#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRule_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.workbench.fx.ui.rules.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRule_Category()
	 * @model unique="false"
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link de.dc.workbench.fx.ui.rules.Rule#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRule_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.dc.workbench.fx.ui.rules.Rule#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.workbench.fx.ui.rules.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see de.dc.workbench.fx.ui.rules.Condition
	 * @see #setCondition(Condition)
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRule_Condition()
	 * @model unique="false"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link de.dc.workbench.fx.ui.rules.Rule#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see de.dc.workbench.fx.ui.rules.Condition
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getRule_Pattern()
	 * @model unique="false"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link de.dc.workbench.fx.ui.rules.Rule#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

} // Rule
