
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The state of a message if it was delivered or read
 */
public enum EMessageState {

	/**
	 * DELIVERED: The message was delivered to the recipients
	 */
	DELIVERED("DELIVERED"),

	/**
	 * READ: The message was read by the recipients
	 */
	READ("READ");

	private String value;

	EMessageState(String value) {
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
	public static EMessageState fromValue(String value) {
		for (EMessageState b : EMessageState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
