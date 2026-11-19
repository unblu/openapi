
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The system that records a conversation
 */
public enum ERecordingSystem {

	/**
	 * UNBLU: Unblu records the conversation itself through the Rendering Service: a built-in conversation recording
	 */
	UNBLU("UNBLU"),

	/**
	 * SIPREC: External recording servers record the call over SIPREC
	 */
	SIPREC("SIPREC");

	private String value;

	ERecordingSystem(String value) {
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
	public static ERecordingSystem fromValue(String value) {
		for (ERecordingSystem b : ERecordingSystem.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
