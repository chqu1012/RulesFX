/**
 */
package de.dc.workbench.fx.ui.rules;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.workbench.fx.ui.rules.Output#getModel <em>Model</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.Output#getMapper <em>Mapper</em>}</li>
 *   <li>{@link de.dc.workbench.fx.ui.rules.Output#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends BaseType {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Uri)
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getOutput_Model()
	 * @model
	 * @generated
	 */
	Uri getModel();

	/**
	 * Sets the value of the '{@link de.dc.workbench.fx.ui.rules.Output#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Uri value);

	/**
	 * Returns the value of the '<em><b>Mapper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapper</em>' reference.
	 * @see #setMapper(Uri)
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getOutput_Mapper()
	 * @model
	 * @generated
	 */
	Uri getMapper();

	/**
	 * Sets the value of the '{@link de.dc.workbench.fx.ui.rules.Output#getMapper <em>Mapper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapper</em>' reference.
	 * @see #getMapper()
	 * @generated
	 */
	void setMapper(Uri value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.workbench.fx.ui.rules.OutputField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getOutput_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputField> getFields();

} // Output
