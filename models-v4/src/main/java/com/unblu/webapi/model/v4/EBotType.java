
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of a dialog bot
 */
public enum EBotType {

	/**
	 * COPILOT: A bot backed by a Microsoft Copilot Studio agent
	 */
	COPILOT("COPILOT"),

	/**
	 * CUSTOM: A bot backed by a customer-provided implementation reached over the bot webhook API
	 */
	CUSTOM("CUSTOM"),

	/**
	 * ARIA: A bot backed by Unblu&#39;s built-in Aria AI assistant
	 */
	ARIA("ARIA");

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
