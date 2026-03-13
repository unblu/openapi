
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAccountIngressEntryPathOperatorType
 */
public enum EAccountIngressEntryPathOperatorType {

	/**
	 * EQUALS: Check if the value is equal to the one provided in the operator
	 */
	EQUALS("EQUALS"),

	/**
	 * NOT_EQUALS: Check if the value is different from the one provided in the operator
	 */
	NOT_EQUALS("NOT_EQUALS"),

	/**
	 * IN: Check if the value matches one of the values provided in the operator
	 */
	IN("IN"),

	/**
	 * NOT_IN: Check if the value doesn&#39;t match one of the values provided in the operator
	 */
	NOT_IN("NOT_IN");

	private String value;

	EAccountIngressEntryPathOperatorType(String value) {
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
	public static EAccountIngressEntryPathOperatorType fromValue(String value) {
		for (EAccountIngressEntryPathOperatorType b : EAccountIngressEntryPathOperatorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
