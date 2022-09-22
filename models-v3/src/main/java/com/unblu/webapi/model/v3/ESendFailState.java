
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The failed state of a message which was sent to an external messenger
 */
public enum ESendFailState {

	/**
	 * RETRYABLE: Message could not be sent, but it is not terminal and can be tried again
	 */
	RETRYABLE("RETRYABLE"),

	/**
	 * TERMINAL: Message could not be sent and it will not be possible to send it again
	 */
	TERMINAL("TERMINAL");

	private String value;

	ESendFailState(String value) {
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
	public static ESendFailState fromValue(String value) {
		for (ESendFailState b : ESendFailState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
