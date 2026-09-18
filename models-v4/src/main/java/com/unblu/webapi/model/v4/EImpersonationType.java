
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of impersonation
 */
public enum EImpersonationType {

	/**
	 * NONE: The user acts under their own identity, no impersonation is in place
	 */
	NONE("NONE"),

	/**
	 * USER_OWN_ROLE: A superadmin impersonates a user and acts with the role of that user
	 */
	USER_OWN_ROLE("USER_OWN_ROLE"),

	/**
	 * USER_SUPER_ADMIN: A superadmin impersonates a user but keeps their own superadmin role
	 */
	USER_SUPER_ADMIN("USER_SUPER_ADMIN"),

	/**
	 * ACCOUNT: A superadmin acts within an account other than their own
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
