
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EStringOperatorType
 */
public enum EStringOperatorType {

	/**
	 * EQUALS: Check if the value is equals to the one provided in the operator
	 */
	EQUALS("EQUALS"),

	/**
	 * NOT_EQUALS: Check if the value not is equals to the one provided in the operator
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
	 * CONTAINS: Check if the value contains the string provided in the operator
	 */
	CONTAINS("CONTAINS");

	private String value;

	EStringOperatorType(String value) {
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
	public static EStringOperatorType fromValue(String value) {
		for (EStringOperatorType b : EStringOperatorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
