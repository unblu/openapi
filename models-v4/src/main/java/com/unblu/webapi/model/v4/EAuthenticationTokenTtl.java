
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAuthenticationTokenTtl
 */
public enum EAuthenticationTokenTtl {

	/**
	 * STANDARD: Standard authentication token TTL (short-lived default)
	 */
	STANDARD("STANDARD"),

	/**
	 * EXTENDED: Extended authentication token TTL (longer duration for trusted devices)
	 */
	EXTENDED("EXTENDED");

	private String value;

	EAuthenticationTokenTtl(String value) {
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
	public static EAuthenticationTokenTtl fromValue(String value) {
		for (EAuthenticationTokenTtl b : EAuthenticationTokenTtl.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
