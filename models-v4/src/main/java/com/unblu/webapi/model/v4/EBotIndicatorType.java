
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines the type of indicator shown while the bot is processing.
 */
public enum EBotIndicatorType {

	/**
	 * NONE: No indicator is shown.
	 */
	NONE("NONE"),

	/**
	 * TYPING: A typing indicator is shown.
	 */
	TYPING("TYPING"),

	/**
	 * THINKING: A thinking indicator with configurable texts is shown.
	 */
	THINKING("THINKING");

	private String value;

	EBotIndicatorType(String value) {
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
	public static EBotIndicatorType fromValue(String value) {
		for (EBotIndicatorType b : EBotIndicatorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
