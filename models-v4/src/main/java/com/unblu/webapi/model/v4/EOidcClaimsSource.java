
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines the OIDC token from which user claims are extracted.
 */
public enum EOidcClaimsSource {

	/**
	 * ID_TOKEN: Reads claims from the ID token (default).
	 */
	ID_TOKEN("ID_TOKEN"),

	/**
	 * ACCESS_TOKEN: Reads claims from the access token, useful for opaque or JWT access tokens that carry the claims.
	 */
	ACCESS_TOKEN("ACCESS_TOKEN");

	private String value;

	EOidcClaimsSource(String value) {
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
	public static EOidcClaimsSource fromValue(String value) {
		for (EOidcClaimsSource b : EOidcClaimsSource.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
