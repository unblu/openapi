
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Token type
 */
public enum ESecureTokenType {

	/**
	 * JWT
	 */
	JWT("JWT"),

	/**
	 * OIDC_ACCESS_TOKEN
	 */
	OIDC_ACCESS_TOKEN("OIDC_ACCESS_TOKEN");

	private String value;

	ESecureTokenType(String value) {
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
	public static ESecureTokenType fromValue(String value) {
		for (ESecureTokenType b : ESecureTokenType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
