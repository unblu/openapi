
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of the call
 */
public enum ECallType {

	/**
	 * AUDIO: The call was started as voice call
	 */
	AUDIO("AUDIO"),

	/**
	 * VIDEO: The call was started as video call
	 */
	VIDEO("VIDEO");

	private String value;

	ECallType(String value) {
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
	public static ECallType fromValue(String value) {
		for (ECallType b : ECallType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
