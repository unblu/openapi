
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines whether mapped claims overwrite the existing user&#39;s attributes on each login.
 */
public enum EOidcUserUpdateStrategy {

	/**
	 * IGNORE: Stored attributes are never updated.
	 */
	IGNORE("IGNORE"),

	/**
	 * OVERWRITE_VIRTUAL: Only virtual users are updated.
	 */
	OVERWRITE_VIRTUAL("OVERWRITE_VIRTUAL"),

	/**
	 * OVERWRITE_EXTERNALLY_MANAGED: Only externally managed users are updated.
	 */
	OVERWRITE_EXTERNALLY_MANAGED("OVERWRITE_EXTERNALLY_MANAGED"),

	/**
	 * OVERWRITE_ALL: Every matching user has their mapped attributes updated.
	 */
	OVERWRITE_ALL("OVERWRITE_ALL");

	private String value;

	EOidcUserUpdateStrategy(String value) {
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
	public static EOidcUserUpdateStrategy fromValue(String value) {
		for (EOidcUserUpdateStrategy b : EOidcUserUpdateStrategy.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
