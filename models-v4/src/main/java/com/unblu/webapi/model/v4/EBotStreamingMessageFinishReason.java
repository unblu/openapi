
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Why a bot finishes its streaming message.
 */
public enum EBotStreamingMessageFinishReason {

	/**
	 * COMPLETED: The bot sent the complete answer.
	 */
	COMPLETED("COMPLETED"),

	/**
	 * STOPPED_BY_BOT: The bot stopped the stream before the answer was complete.
	 */
	STOPPED_BY_BOT("STOPPED_BY_BOT");

	private String value;

	EBotStreamingMessageFinishReason(String value) {
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
	public static EBotStreamingMessageFinishReason fromValue(String value) {
		for (EBotStreamingMessageFinishReason b : EBotStreamingMessageFinishReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
