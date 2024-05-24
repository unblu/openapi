
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EPropertyOwnerTypeOperatorType
 */
public enum EPropertyOwnerTypeOperatorType {

	/**
	 * EQUALS: Check if the value is equal to the one provided in the operator
	 */
	EQUALS("EQUALS"),

	/**
	 * NOT_EQUALS: Check if the value not is equal to the one provided in the operator
	 */
	NOT_EQUALS("NOT_EQUALS"),

	/**
	 * IN: Check if the value is one of the ones provided in the operator
	 */
	IN("IN"),

	/**
	 * NOT_IN: Check the value is not one of the ones provided in the operator
	 */
	NOT_IN("NOT_IN");

	private String value;

	EPropertyOwnerTypeOperatorType(String value) {
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
	public static EPropertyOwnerTypeOperatorType fromValue(String value) {
		for (EPropertyOwnerTypeOperatorType b : EPropertyOwnerTypeOperatorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}