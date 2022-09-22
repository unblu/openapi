
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ETimestampOperatorType
 */
public enum ETimestampOperatorType {

	/**
	 * EQUALS: Check if the value is equal to the one provided in the operator
	 */
	EQUALS("EQUALS"),

	/**
	 * NOT_EQUALS: Check if the value is different from the one provided in the operator
	 */
	NOT_EQUALS("NOT_EQUALS"),

	/**
	 * GREATER_THAN: Check if the value is greater than the one provided in the operator
	 */
	GREATER_THAN("GREATER_THAN"),

	/**
	 * GREATER_THAN_OR_NULL: Check if the value is null or greater than the one provided in the operator
	 */
	GREATER_THAN_OR_NULL("GREATER_THAN_OR_NULL"),

	/**
	 * LOWER_THAN: Check if the value is lower than the one provided in the operator
	 */
	LOWER_THAN("LOWER_THAN"),

	/**
	 * LOWER_THAN_OR_NULL: Check if the value is null or lower than the one provided in the operator
	 */
	LOWER_THAN_OR_NULL("LOWER_THAN_OR_NULL"),

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
	 * IN_RANGE: Check if the value is in the range of the provided values. Results equal to the provided values are included.
	 */
	IN_RANGE("IN_RANGE"),

	/**
	 * NOT_IN_RANGE: Check if the value is NOT in the range of the provided values. Results equal to the provided values are not included.
	 */
	NOT_IN_RANGE("NOT_IN_RANGE");

	private String value;

	ETimestampOperatorType(String value) {
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
	public static ETimestampOperatorType fromValue(String value) {
		for (ETimestampOperatorType b : ETimestampOperatorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
