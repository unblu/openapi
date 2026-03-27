
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EJsonArrayOperatorType
 */
public enum EJsonArrayOperatorType {

	/**
	 * IN: Check if the value is one of the one provided in the operator
	 */
	IN("IN"),

	/**
	 * NOT_IN: Check if the value is not one of the one provided in the operator
	 */
	NOT_IN("NOT_IN");

	private String value;

	EJsonArrayOperatorType(String value) {
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
	public static EJsonArrayOperatorType fromValue(String value) {
		for (EJsonArrayOperatorType b : EJsonArrayOperatorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
