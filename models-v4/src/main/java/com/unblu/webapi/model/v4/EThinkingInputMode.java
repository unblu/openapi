
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines how the chat input field behaves while the bot is in thinking mode.
 */
public enum EThinkingInputMode {

	/**
	 * ALLOW_STOP: Input stays editable, send button becomes a stop button that aborts the bot&#39;s response generation.
	 */
	ALLOW_STOP("ALLOW_STOP"),

	/**
	 * ALLOW_SEND: No changes to input behavior — input and send button remain fully functional.
	 */
	ALLOW_SEND("ALLOW_SEND"),

	/**
	 * ALLOW_TYPE: Input is accessible for typing, but the send button is disabled.
	 */
	ALLOW_TYPE("ALLOW_TYPE");

	private String value;

	EThinkingInputMode(String value) {
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
	public static EThinkingInputMode fromValue(String value) {
		for (EThinkingInputMode b : EThinkingInputMode.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
