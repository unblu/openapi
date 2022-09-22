
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBooleanOperatorType
 */
public enum EBooleanOperatorType {

	/**
	 * EQUALS: Check if the value is equal to the one provided in the operator
	 */
	EQUALS("EQUALS"),

	/**
	 * NOT_EQUALS: Check if the value is different from the one provided in the operator
	 */
	NOT_EQUALS("NOT_EQUALS"),

	/**
	 * IS_NULL: Check if the value is null
	 */
	IS_NULL("IS_NULL"),

	/**
	 * IS_NOT_NULL: Check if the value is not null
	 */
	IS_NOT_NULL("IS_NOT_NULL");

	private String value;

	EBooleanOperatorType(String value) {
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
	public static EBooleanOperatorType fromValue(String value) {
		for (EBooleanOperatorType b : EBooleanOperatorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
