
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines how the chat input field of the person in a bot dialog behaves during the bot&#39;s turn: while the bot is thinking, while it streams a message, and
 * between the messages of an answer it keeps the turn open for. What opens the turn sets its input mode; a thinking indicator or a streaming message that sets
 * its own input mode replaces it.
 */
public enum EBotTurnInputMode {

	/**
	 * ALLOW_STOP: Input stays editable, send button becomes a stop button that aborts the bot&#39;s response generation. Unblu rejects messages the person sends
	 * until the turn ends, except messages from an external messenger.
	 */
	ALLOW_STOP("ALLOW_STOP"),

	/**
	 * ALLOW_SEND: No changes to input behavior — input and send button remain fully functional.
	 */
	ALLOW_SEND("ALLOW_SEND"),

	/**
	 * ALLOW_TYPE: Input is accessible for typing, but the send button is disabled. Unblu rejects messages the person sends until the turn ends, except messages
	 * from an external messenger.
	 */
	ALLOW_TYPE("ALLOW_TYPE");

	private String value;

	EBotTurnInputMode(String value) {
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
	public static EBotTurnInputMode fromValue(String value) {
		for (EBotTurnInputMode b : EBotTurnInputMode.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
