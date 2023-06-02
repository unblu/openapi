
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EMessageInterceptorType
 */
public enum EMessageInterceptorType {

	/**
	 * EXTERNAL
	 */
	EXTERNAL("EXTERNAL"),

	/**
	 * INTERNAL
	 */
	INTERNAL("INTERNAL");

	private String value;

	EMessageInterceptorType(String value) {
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
	public static EMessageInterceptorType fromValue(String value) {
		for (EMessageInterceptorType b : EMessageInterceptorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
