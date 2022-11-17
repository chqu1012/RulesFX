/**
 */
package de.dc.workbench.fx.ui.rules;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Condition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dc.workbench.fx.ui.rules.RulesPackage#getCondition()
 * @model
 * @generated
 */
public enum Condition implements Enumerator {
	/**
	 * The '<em><b>EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS(0, "EQUALS", "EQUALS"),

	/**
	 * The '<em><b>EQUALS IGNORE CASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_IGNORE_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	EQUALS_IGNORE_CASE(0, "EQUALS_IGNORE_CASE", "EQUALS_IGNORE_CASE"),

	/**
	 * The '<em><b>CONTAINS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS(0, "CONTAINS", "CONTAINS"),

	/**
	 * The '<em><b>COTNAINS IGNORE CASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COTNAINS_IGNORE_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	COTNAINS_IGNORE_CASE(0, "COTNAINS_IGNORE_CASE", "COTNAINS_IGNORE_CASE"),

	/**
	 * The '<em><b>GREATER THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN(0, "GREATER_THAN", "GREATER_THAN"),

	/**
	 * The '<em><b>GREATER THAN EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN_EQUALS(0, "GREATER_THAN_EQUALS", "GREATER_THAN_EQUALS"),

	/**
	 * The '<em><b>SMALL THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL_THAN(0, "SMALL_THAN", "SMALL_THAN"),

	/**
	 * The '<em><b>SMALL THAN EQUALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_THAN_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL_THAN_EQUALS(0, "SMALL_THAN_EQUALS", "SMALL_THAN_EQUALS"),

	/**
	 * The '<em><b>START WITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	START_WITH(0, "START_WITH", "START_WITH"),

	/**
	 * The '<em><b>START IGNORE CASE WITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_IGNORE_CASE_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	START_IGNORE_CASE_WITH(0, "START_IGNORE_CASE_WITH", "START_IGNORE_CASE_WITH"),

	/**
	 * The '<em><b>END WITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	END_WITH(0, "END_WITH", "END_WITH"),

	/**
	 * The '<em><b>END IGNORE CASE WITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_IGNORE_CASE_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	END_IGNORE_CASE_WITH(0, "END_IGNORE_CASE_WITH", "END_IGNORE_CASE_WITH"),

	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(0, "OR", "OR"),

	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(0, "AND", "AND");

	/**
	 * The '<em><b>EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS_VALUE = 0;

	/**
	 * The '<em><b>EQUALS IGNORE CASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUALS_IGNORE_CASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUALS_IGNORE_CASE_VALUE = 0;

	/**
	 * The '<em><b>CONTAINS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_VALUE = 0;

	/**
	 * The '<em><b>COTNAINS IGNORE CASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COTNAINS_IGNORE_CASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COTNAINS_IGNORE_CASE_VALUE = 0;

	/**
	 * The '<em><b>GREATER THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_VALUE = 0;

	/**
	 * The '<em><b>GREATER THAN EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>SMALL THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_THAN_VALUE = 0;

	/**
	 * The '<em><b>SMALL THAN EQUALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_THAN_EQUALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_THAN_EQUALS_VALUE = 0;

	/**
	 * The '<em><b>START WITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_WITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int START_WITH_VALUE = 0;

	/**
	 * The '<em><b>START IGNORE CASE WITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_IGNORE_CASE_WITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int START_IGNORE_CASE_WITH_VALUE = 0;

	/**
	 * The '<em><b>END WITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_WITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int END_WITH_VALUE = 0;

	/**
	 * The '<em><b>END IGNORE CASE WITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_IGNORE_CASE_WITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int END_IGNORE_CASE_WITH_VALUE = 0;

	/**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 0;

	/**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 0;

	/**
	 * An array of all the '<em><b>Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Condition[] VALUES_ARRAY = new Condition[] { EQUALS, EQUALS_IGNORE_CASE, CONTAINS,
			COTNAINS_IGNORE_CASE, GREATER_THAN, GREATER_THAN_EQUALS, SMALL_THAN, SMALL_THAN_EQUALS, START_WITH,
			START_IGNORE_CASE_WITH, END_WITH, END_IGNORE_CASE_WITH, OR, AND, };

	/**
	 * A public read-only list of all the '<em><b>Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Condition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Condition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Condition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Condition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Condition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Condition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Condition get(int value) {
		switch (value) {
		case EQUALS_VALUE:
			return EQUALS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Condition(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Condition
