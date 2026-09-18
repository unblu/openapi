
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The state of a person/system
 */
public enum EOnlineState {

	/**
	 * ONLINE: The person is present and available
	 */
	ONLINE("ONLINE"),

	/**
	 * OFFLINE: The person is not present
	 */
	OFFLINE("OFFLINE"),

	/**
	 * AWAY: The person is present but currently not available
	 */
	AWAY("AWAY"),

	/**
	 * OUT_OF_OFFICE: The person is out of office, whether or not they are present
	 */
	OUT_OF_OFFICE("OUT_OF_OFFICE");

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
