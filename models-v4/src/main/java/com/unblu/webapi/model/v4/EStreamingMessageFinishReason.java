
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Why a streaming message was finished.
 */
public enum EStreamingMessageFinishReason {

	/**
	 * COMPLETED: The bot finished the stream after sending the complete answer.
	 */
	COMPLETED("COMPLETED"),

	/**
	 * STOPPED_BY_BOT: The bot stopped the stream before the answer was complete.
	 */
	STOPPED_BY_BOT("STOPPED_BY_BOT"),

	/**
	 * STOPPED_BY_USER: A participant in the conversation stopped the stream.
	 */
	STOPPED_BY_USER("STOPPED_BY_USER"),

	/**
	 * TIMED_OUT: The stream received no update within the time set by &#x60;com.unblu.conversation.bot.streamingMessageTimeout&#x60;.
	 */
	TIMED_OUT("TIMED_OUT"),

	/**
	 * STOPPED_BY_SYSTEM: The Unblu server finished the stream for another reason, for example because the dialog or the conversation ended.
	 */
	STOPPED_BY_SYSTEM("STOPPED_BY_SYSTEM");

	private String value;

	EStreamingMessageFinishReason(String value) {
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
	public static EStreamingMessageFinishReason fromValue(String value) {
		for (EStreamingMessageFinishReason b : EStreamingMessageFinishReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
