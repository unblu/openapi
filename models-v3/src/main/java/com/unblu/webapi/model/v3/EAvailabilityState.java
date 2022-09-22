
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Possible state for agents availability
 */
public enum EAvailabilityState {

	/**
	 * AVAILABLE: There is at least one agent available for the specified named area and locale.
	 */
	AVAILABLE("AVAILABLE"),

	/**
	 * BUSY: There is at least one agent watching the inbound queue for the specified named area and locale but the max capacity of parallel conversations is
	 * reached. It is very likely, that an agent will be available in a short time.
	 */
	BUSY("BUSY"),

	/**
	 * UNAVAILABLE: There is currently no agent handling any inbound queue items. It is very unlikely, that an agent will be available in a short time.
	 */
	UNAVAILABLE("UNAVAILABLE"),

	/**
	 * OFFLINE: There is no agent watching the inbound queue for the specified named area and locale. It is unlikely, that an agent will be available in a short
	 * time.
	 */
	OFFLINE("OFFLINE");

	private String value;

	EAvailabilityState(String value) {
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
	public static EAvailabilityState fromValue(String value) {
		for (EAvailabilityState b : EAvailabilityState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
