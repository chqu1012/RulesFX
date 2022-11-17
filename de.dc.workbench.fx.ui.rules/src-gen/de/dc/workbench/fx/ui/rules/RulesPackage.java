/**
 */
package de.dc.workbench.fx.ui.rules;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.workbench.fx.ui.rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/fx/emf/rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.workbench.fx.ui.rules.impl.RulesManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.workbench.fx.ui.rules.impl.RulesManagerImpl
	 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getRulesManager()
	 * @generated
	 */
	int RULES_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_MANAGER__RULES = 0;

	/**
	 * The feature id for the '<em><b>Rule Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_MANAGER__RULE_SET = 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_MANAGER__OUTPUTS = 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_MANAGER__IMPORTS = 3;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_MANAGER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.workbench.fx.ui.rules.impl.UriImpl <em>Uri</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.workbench.fx.ui.rules.impl.UriImpl
	 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getUri()
	 * @generated
	 */
	int URI = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI__URI = 1;

	/**
	 * The number of structural features of the '<em>Uri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Uri</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.workbench.fx.ui.rules.impl.RuleSetImpl <em>Rule Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.workbench.fx.ui.rules.impl.RuleSetImpl
	 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getRuleSet()
	 * @generated
	 */
	int RULE_SET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__RULES = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__INPUT = 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__OUTPUT = 3;

	/**
	 * The number of structural features of the '<em>Rule Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Rule Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.workbench.fx.ui.rules.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.workbench.fx.ui.rules.impl.WhenImpl
	 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 3;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Rule1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__RULE1 = 1;

	/**
	 * The feature id for the '<em><b>Rule2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__RULE2 = 2;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.workbench.fx.ui.rules.impl.BaseTypeImpl <em>Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.workbench.fx.ui.rules.impl.BaseTypeImpl
	 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getBaseType()
	 * @generated
	 */
	int BASE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.workbench.fx.ui.rules.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.workbench.fx.ui.rules.impl.OutputImpl
	 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = BASE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__VALUE = BASE_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MODEL = BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mapper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__MAPPER = BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__FIELDS = BASE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = BASE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.workbench.fx.ui.rules.impl.OutputFieldImpl <em>Output Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.workbench.fx.ui.rules.impl.OutputFieldImpl
	 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getOutputField()
	 * @generated
	 */
	int OUTPUT_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FIELD__NAME = BASE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FIELD__VALUE = BASE_TYPE__VALUE;

	/**
	 * The number of structural features of the '<em>Output Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FIELD_FEATURE_COUNT = BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FIELD_OPERATION_COUNT = BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.workbench.fx.ui.rules.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.workbench.fx.ui.rules.impl.InputImpl
	 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = BASE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VALUE = BASE_TYPE__VALUE;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.workbench.fx.ui.rules.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.workbench.fx.ui.rules.impl.RuleImpl
	 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PATTERN = 4;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.workbench.fx.ui.rules.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.workbench.fx.ui.rules.LogicalOperator
	 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 9;

	/**
	 * The meta object id for the '{@link de.dc.workbench.fx.ui.rules.Condition <em>Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.workbench.fx.ui.rules.Condition
	 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 10;

	/**
	 * The meta object id for the '<em>Local Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.LocalDate
	 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getLocalDate()
	 * @generated
	 */
	int LOCAL_DATE = 11;

	/**
	 * The meta object id for the '<em>Local Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.LocalTime
	 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getLocalTime()
	 * @generated
	 */
	int LOCAL_TIME = 12;

	/**
	 * Returns the meta object for class '{@link de.dc.workbench.fx.ui.rules.RulesManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see de.dc.workbench.fx.ui.rules.RulesManager
	 * @generated
	 */
	EClass getRulesManager();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.workbench.fx.ui.rules.RulesManager#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see de.dc.workbench.fx.ui.rules.RulesManager#getRules()
	 * @see #getRulesManager()
	 * @generated
	 */
	EReference getRulesManager_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.workbench.fx.ui.rules.RulesManager#getRuleSet <em>Rule Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Set</em>'.
	 * @see de.dc.workbench.fx.ui.rules.RulesManager#getRuleSet()
	 * @see #getRulesManager()
	 * @generated
	 */
	EReference getRulesManager_RuleSet();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.workbench.fx.ui.rules.RulesManager#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see de.dc.workbench.fx.ui.rules.RulesManager#getOutputs()
	 * @see #getRulesManager()
	 * @generated
	 */
	EReference getRulesManager_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.workbench.fx.ui.rules.RulesManager#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see de.dc.workbench.fx.ui.rules.RulesManager#getImports()
	 * @see #getRulesManager()
	 * @generated
	 */
	EReference getRulesManager_Imports();

	/**
	 * Returns the meta object for class '{@link de.dc.workbench.fx.ui.rules.Uri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uri</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Uri
	 * @generated
	 */
	EClass getUri();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.workbench.fx.ui.rules.Uri#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Uri#getName()
	 * @see #getUri()
	 * @generated
	 */
	EAttribute getUri_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.workbench.fx.ui.rules.Uri#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Uri#getUri()
	 * @see #getUri()
	 * @generated
	 */
	EAttribute getUri_Uri();

	/**
	 * Returns the meta object for class '{@link de.dc.workbench.fx.ui.rules.RuleSet <em>Rule Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Set</em>'.
	 * @see de.dc.workbench.fx.ui.rules.RuleSet
	 * @generated
	 */
	EClass getRuleSet();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.workbench.fx.ui.rules.RuleSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.workbench.fx.ui.rules.RuleSet#getName()
	 * @see #getRuleSet()
	 * @generated
	 */
	EAttribute getRuleSet_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.dc.workbench.fx.ui.rules.RuleSet#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rules</em>'.
	 * @see de.dc.workbench.fx.ui.rules.RuleSet#getRules()
	 * @see #getRuleSet()
	 * @generated
	 */
	EReference getRuleSet_Rules();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.workbench.fx.ui.rules.RuleSet#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see de.dc.workbench.fx.ui.rules.RuleSet#getInput()
	 * @see #getRuleSet()
	 * @generated
	 */
	EReference getRuleSet_Input();

	/**
	 * Returns the meta object for the reference '{@link de.dc.workbench.fx.ui.rules.RuleSet#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see de.dc.workbench.fx.ui.rules.RuleSet#getOutput()
	 * @see #getRuleSet()
	 * @generated
	 */
	EReference getRuleSet_Output();

	/**
	 * Returns the meta object for class '{@link de.dc.workbench.fx.ui.rules.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see de.dc.workbench.fx.ui.rules.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.workbench.fx.ui.rules.When#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.dc.workbench.fx.ui.rules.When#getOperator()
	 * @see #getWhen()
	 * @generated
	 */
	EAttribute getWhen_Operator();

	/**
	 * Returns the meta object for the reference '{@link de.dc.workbench.fx.ui.rules.When#getRule1 <em>Rule1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule1</em>'.
	 * @see de.dc.workbench.fx.ui.rules.When#getRule1()
	 * @see #getWhen()
	 * @generated
	 */
	EReference getWhen_Rule1();

	/**
	 * Returns the meta object for the reference '{@link de.dc.workbench.fx.ui.rules.When#getRule2 <em>Rule2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule2</em>'.
	 * @see de.dc.workbench.fx.ui.rules.When#getRule2()
	 * @see #getWhen()
	 * @generated
	 */
	EReference getWhen_Rule2();

	/**
	 * Returns the meta object for class '{@link de.dc.workbench.fx.ui.rules.BaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Type</em>'.
	 * @see de.dc.workbench.fx.ui.rules.BaseType
	 * @generated
	 */
	EClass getBaseType();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.workbench.fx.ui.rules.BaseType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.workbench.fx.ui.rules.BaseType#getName()
	 * @see #getBaseType()
	 * @generated
	 */
	EAttribute getBaseType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.workbench.fx.ui.rules.BaseType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dc.workbench.fx.ui.rules.BaseType#getValue()
	 * @see #getBaseType()
	 * @generated
	 */
	EAttribute getBaseType_Value();

	/**
	 * Returns the meta object for class '{@link de.dc.workbench.fx.ui.rules.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference '{@link de.dc.workbench.fx.ui.rules.Output#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Output#getModel()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Model();

	/**
	 * Returns the meta object for the reference '{@link de.dc.workbench.fx.ui.rules.Output#getMapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapper</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Output#getMapper()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Mapper();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.workbench.fx.ui.rules.Output#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Output#getFields()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Fields();

	/**
	 * Returns the meta object for class '{@link de.dc.workbench.fx.ui.rules.OutputField <em>Output Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Field</em>'.
	 * @see de.dc.workbench.fx.ui.rules.OutputField
	 * @generated
	 */
	EClass getOutputField();

	/**
	 * Returns the meta object for class '{@link de.dc.workbench.fx.ui.rules.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link de.dc.workbench.fx.ui.rules.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.workbench.fx.ui.rules.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.workbench.fx.ui.rules.Rule#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Rule#getCategory()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Category();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.workbench.fx.ui.rules.Rule#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Rule#getDescription()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.workbench.fx.ui.rules.Rule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Rule#getCondition()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Condition();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.workbench.fx.ui.rules.Rule#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Rule#getPattern()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Pattern();

	/**
	 * Returns the meta object for enum '{@link de.dc.workbench.fx.ui.rules.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see de.dc.workbench.fx.ui.rules.LogicalOperator
	 * @generated
	 */
	EEnum getLogicalOperator();

	/**
	 * Returns the meta object for enum '{@link de.dc.workbench.fx.ui.rules.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition</em>'.
	 * @see de.dc.workbench.fx.ui.rules.Condition
	 * @generated
	 */
	EEnum getCondition();

	/**
	 * Returns the meta object for data type '{@link java.time.LocalDate <em>Local Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Local Date</em>'.
	 * @see java.time.LocalDate
	 * @model instanceClass="java.time.LocalDate"
	 * @generated
	 */
	EDataType getLocalDate();

	/**
	 * Returns the meta object for data type '{@link java.time.LocalTime <em>Local Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Local Time</em>'.
	 * @see java.time.LocalTime
	 * @model instanceClass="java.time.LocalTime"
	 * @generated
	 */
	EDataType getLocalTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.workbench.fx.ui.rules.impl.RulesManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.workbench.fx.ui.rules.impl.RulesManagerImpl
		 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getRulesManager()
		 * @generated
		 */
		EClass RULES_MANAGER = eINSTANCE.getRulesManager();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES_MANAGER__RULES = eINSTANCE.getRulesManager_Rules();

		/**
		 * The meta object literal for the '<em><b>Rule Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES_MANAGER__RULE_SET = eINSTANCE.getRulesManager_RuleSet();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES_MANAGER__OUTPUTS = eINSTANCE.getRulesManager_Outputs();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES_MANAGER__IMPORTS = eINSTANCE.getRulesManager_Imports();

		/**
		 * The meta object literal for the '{@link de.dc.workbench.fx.ui.rules.impl.UriImpl <em>Uri</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.workbench.fx.ui.rules.impl.UriImpl
		 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getUri()
		 * @generated
		 */
		EClass URI = eINSTANCE.getUri();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI__NAME = eINSTANCE.getUri_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URI__URI = eINSTANCE.getUri_Uri();

		/**
		 * The meta object literal for the '{@link de.dc.workbench.fx.ui.rules.impl.RuleSetImpl <em>Rule Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.workbench.fx.ui.rules.impl.RuleSetImpl
		 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getRuleSet()
		 * @generated
		 */
		EClass RULE_SET = eINSTANCE.getRuleSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_SET__NAME = eINSTANCE.getRuleSet_Name();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SET__RULES = eINSTANCE.getRuleSet_Rules();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SET__INPUT = eINSTANCE.getRuleSet_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SET__OUTPUT = eINSTANCE.getRuleSet_Output();

		/**
		 * The meta object literal for the '{@link de.dc.workbench.fx.ui.rules.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.workbench.fx.ui.rules.impl.WhenImpl
		 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN__OPERATOR = eINSTANCE.getWhen_Operator();

		/**
		 * The meta object literal for the '<em><b>Rule1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN__RULE1 = eINSTANCE.getWhen_Rule1();

		/**
		 * The meta object literal for the '<em><b>Rule2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN__RULE2 = eINSTANCE.getWhen_Rule2();

		/**
		 * The meta object literal for the '{@link de.dc.workbench.fx.ui.rules.impl.BaseTypeImpl <em>Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.workbench.fx.ui.rules.impl.BaseTypeImpl
		 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getBaseType()
		 * @generated
		 */
		EClass BASE_TYPE = eINSTANCE.getBaseType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_TYPE__NAME = eINSTANCE.getBaseType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_TYPE__VALUE = eINSTANCE.getBaseType_Value();

		/**
		 * The meta object literal for the '{@link de.dc.workbench.fx.ui.rules.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.workbench.fx.ui.rules.impl.OutputImpl
		 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__MODEL = eINSTANCE.getOutput_Model();

		/**
		 * The meta object literal for the '<em><b>Mapper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__MAPPER = eINSTANCE.getOutput_Mapper();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__FIELDS = eINSTANCE.getOutput_Fields();

		/**
		 * The meta object literal for the '{@link de.dc.workbench.fx.ui.rules.impl.OutputFieldImpl <em>Output Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.workbench.fx.ui.rules.impl.OutputFieldImpl
		 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getOutputField()
		 * @generated
		 */
		EClass OUTPUT_FIELD = eINSTANCE.getOutputField();

		/**
		 * The meta object literal for the '{@link de.dc.workbench.fx.ui.rules.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.workbench.fx.ui.rules.impl.InputImpl
		 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link de.dc.workbench.fx.ui.rules.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.workbench.fx.ui.rules.impl.RuleImpl
		 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__CATEGORY = eINSTANCE.getRule_Category();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__DESCRIPTION = eINSTANCE.getRule_Description();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__CONDITION = eINSTANCE.getRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__PATTERN = eINSTANCE.getRule_Pattern();

		/**
		 * The meta object literal for the '{@link de.dc.workbench.fx.ui.rules.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.workbench.fx.ui.rules.LogicalOperator
		 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link de.dc.workbench.fx.ui.rules.Condition <em>Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.workbench.fx.ui.rules.Condition
		 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getCondition()
		 * @generated
		 */
		EEnum CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em>Local Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.LocalDate
		 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getLocalDate()
		 * @generated
		 */
		EDataType LOCAL_DATE = eINSTANCE.getLocalDate();

		/**
		 * The meta object literal for the '<em>Local Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.LocalTime
		 * @see de.dc.workbench.fx.ui.rules.impl.RulesPackageImpl#getLocalTime()
		 * @generated
		 */
		EDataType LOCAL_TIME = eINSTANCE.getLocalTime();

	}

} //RulesPackage
