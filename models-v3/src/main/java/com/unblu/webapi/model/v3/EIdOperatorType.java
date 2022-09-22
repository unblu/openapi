
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Operator types corresponding to operators defined by &#x60;IdOperator&#x60;
 */
public enum EIdOperatorType {

	/**
	 * EQUALS: Check if the value is equal to the one provided in the operator
	 */
	EQUALS("EQUALS"),

	/**
	 * NOT_EQUALS: Check if the value is different from the one provided in the operator
	 */
	NOT_EQUALS("NOT_EQUALS"),

	/**
	 * IN: Check if the value is one of the one provided in the operator
	 */
	IN("IN"),

	/**
	 * NOT_IN: Check if the value is not one of the one provided in the operator
	 */
	NOT_IN("NOT_IN"),

	/**
	 * IS_NULL: Check if the value is null
	 */
	IS_NULL("IS_NULL"),

	/**
	 * IS_NOT_NULL: Check if the value is not null
	 */
	IS_NOT_NULL("IS_NOT_NULL"),

	/**
	 * STARTS_WITH: Check if the value starts with the given value provided in the operator.
	 */
	STARTS_WITH("STARTS_WITH");

	private String value;

	EIdOperatorType(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static EIdOperatorType fromValue(String value) {
		for (EIdOperatorType b : EIdOperatorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
