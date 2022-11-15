
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The source type of a person (participant of a conversation)
 */
public enum EPersonSource {

	/**
	 * USER_DB: The source of the person is the ${link User} entity
	 */
	USER_DB("USER_DB"),

	/**
	 * VIRTUAL: The source of the person is virtual, that is, the individual is either anonymous or their identity was propagated by a single sign-on (SSO)
	 * mechanism.
	 */
	VIRTUAL("VIRTUAL");

	private String value;

	EPersonSource(String value) {
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
	public static EPersonSource fromValue(String value) {
		for (EPersonSource b : EPersonSource.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
