
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The bot thread resolution
 */
public enum EBotThreadResolution {

	/**
	 * HAND_OFF: The bot thread handed the conversation off to an agent
	 */
	HAND_OFF("HAND_OFF"),

	/**
	 * SOLVED: The bot thread solved the conversation and ended it or put it to unassigned state
	 */
	SOLVED("SOLVED"),

	/**
	 * ABORTED: The bot thread was aborted by either the bot or another action
	 */
	ABORTED("ABORTED");

	private String value;

	EBotThreadResolution(String value) {
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
	public static EBotThreadResolution fromValue(String value) {
		for (EBotThreadResolution b : EBotThreadResolution.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
