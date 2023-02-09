
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * State of the call
 */
public enum ECallState {

	/**
	 * IDLE: The call is not active (anymore)
	 */
	IDLE("IDLE"),

	/**
	 * CALLING: The call is ringing, nobody accepted it yet
	 */
	CALLING("CALLING"),

	/**
	 * FORWARDING: The call is ringing for the hidden agents of the conversation, after no visible agent has accepted the call
	 */
	FORWARDING("FORWARDING"),

	/**
	 * UNAVAILABLE: As no call recipient is available to accept the call it just notifies the caller of this fact
	 */
	UNAVAILABLE("UNAVAILABLE"),

	/**
	 * ACTIVE: The call is active
	 */
	ACTIVE("ACTIVE");

	private String value;

	ECallState(String value) {
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
	public static ECallState fromValue(String value) {
		for (ECallState b : ECallState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
