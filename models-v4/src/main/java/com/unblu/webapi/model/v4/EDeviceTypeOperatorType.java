
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EDeviceTypeOperatorType
 */
public enum EDeviceTypeOperatorType {

	/**
	 * EQUALS
	 */
	EQUALS("EQUALS"),

	/**
	 * NOT_EQUALS
	 */
	NOT_EQUALS("NOT_EQUALS"),

	/**
	 * IN
	 */
	IN("IN"),

	/**
	 * NOT_IN
	 */
	NOT_IN("NOT_IN");

	private String value;

	EDeviceTypeOperatorType(String value) {
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
	public static EDeviceTypeOperatorType fromValue(String value) {
		for (EDeviceTypeOperatorType b : EDeviceTypeOperatorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
