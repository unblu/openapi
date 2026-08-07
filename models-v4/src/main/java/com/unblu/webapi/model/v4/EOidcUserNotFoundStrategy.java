
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines what happens when no existing Unblu user can be matched to the OIDC login, either by the OIDC subject or by the migration username claim (see
 * &#x60;EOidcUserMigrationStrategy&#x60;).
 */
public enum EOidcUserNotFoundStrategy {

	/**
	 * REJECT: Deny the login.
	 */
	REJECT("REJECT"),

	/**
	 * CREATE_VIRTUAL: Create a virtual user.
	 */
	CREATE_VIRTUAL("CREATE_VIRTUAL"),

	/**
	 * CREATE_EXTERNALLY_MANAGED: Create a regular externally managed user.
	 */
	CREATE_EXTERNALLY_MANAGED("CREATE_EXTERNALLY_MANAGED");

	private String value;

	EOidcUserNotFoundStrategy(String value) {
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
	public static EOidcUserNotFoundStrategy fromValue(String value) {
		for (EOidcUserNotFoundStrategy b : EOidcUserNotFoundStrategy.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
