
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of a dialog bot
 */
public enum EBotType {

	/**
	 * COPILOT
	 */
	COPILOT("COPILOT"),

	/**
	 * CUSTOM
	 */
	CUSTOM("CUSTOM");

	private String value;

	EBotType(String value) {
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
	public static EBotType fromValue(String value) {
		for (EBotType b : EBotType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
