
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationResolutionType
 */
public enum EConversationResolutionType {

	/**
	 * CONVERSATION_ENDED: Conversation ended.
	 */
	CONVERSATION_ENDED("CONVERSATION_ENDED"),

	/**
	 * PARTICIPATION_ENDED: Conversation participation ended.
	 */
	PARTICIPATION_ENDED("PARTICIPATION_ENDED"),

	/**
	 * PUSHED_TO_QUEUE: Conversation was pushed to queue.
	 */
	PUSHED_TO_QUEUE("PUSHED_TO_QUEUE"),

	/**
	 * FORWARDED: Conversation was forwarded.
	 */
	FORWARDED("FORWARDED");

	private String value;

	EConversationResolutionType(String value) {
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
	public static EConversationResolutionType fromValue(String value) {
		for (EConversationResolutionType b : EConversationResolutionType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
