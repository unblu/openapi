
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The state of a person/system
 */
public enum EOnlineState {

	/**
	 * ONLINE
	 */
	ONLINE("ONLINE"),

	/**
	 * OFFLINE
	 */
	OFFLINE("OFFLINE"),

	/**
	 * AWAY
	 */
	AWAY("AWAY");

	private String value;

	EOnlineState(String value) {
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
	public static EOnlineState fromValue(String value) {
		for (EOnlineState b : EOnlineState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
