
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECallServiceProvider
 */
public enum ECallServiceProvider {

	/**
	 * ACS: The call service was provided by ACS
	 */
	ACS("ACS"),

	/**
	 * LIVEKIT: The call service was provided by LiveKit
	 */
	LIVEKIT("LIVEKIT"),

	/**
	 * OPENTOK: The call service was provided by Vonage
	 */
	OPENTOK("OPENTOK");

	private String value;

	ECallServiceProvider(String value) {
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
	public static ECallServiceProvider fromValue(String value) {
		for (ECallServiceProvider b : ECallServiceProvider.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
