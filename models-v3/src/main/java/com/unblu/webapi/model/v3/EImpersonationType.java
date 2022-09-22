
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of impersonation
 */
public enum EImpersonationType {

	/**
	 * NONE
	 */
	NONE("NONE"),

	/**
	 * USER_OWN_ROLE
	 */
	USER_OWN_ROLE("USER_OWN_ROLE"),

	/**
	 * USER_SUPER_ADMIN
	 */
	USER_SUPER_ADMIN("USER_SUPER_ADMIN"),

	/**
	 * ACCOUNT
	 */
	ACCOUNT("ACCOUNT");

	private String value;

	EImpersonationType(String value) {
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
	public static EImpersonationType fromValue(String value) {
		for (EImpersonationType b : EImpersonationType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
