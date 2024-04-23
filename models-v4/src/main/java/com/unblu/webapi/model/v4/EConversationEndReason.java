
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Closing reason of a conversation
 */
public enum EConversationEndReason {

	/**
	 * ENDED_BY_PARTICIPANT
	 */
	ENDED_BY_PARTICIPANT("ENDED_BY_PARTICIPANT"),

	/**
	 * MANDATORY_PARTICIPANT_GONE
	 */
	MANDATORY_PARTICIPANT_GONE("MANDATORY_PARTICIPANT_GONE"),

	/**
	 * REQUEST_DECLINED
	 */
	REQUEST_DECLINED("REQUEST_DECLINED"),

	/**
	 * REQUEST_NOT_ANSWERED
	 */
	REQUEST_NOT_ANSWERED("REQUEST_NOT_ANSWERED"),

	/**
	 * EXTERNAL_CHANNEL_CLOSED
	 */
	EXTERNAL_CHANNEL_CLOSED("EXTERNAL_CHANNEL_CLOSED"),

	/**
	 * SOLVED_BY_BOT
	 */
	SOLVED_BY_BOT("SOLVED_BY_BOT"),

	/**
	 * CANCELED
	 */
	CANCELED("CANCELED"),

	/**
	 * CALL_ENDED
	 */
	CALL_ENDED("CALL_ENDED"),

	/**
	 * NO_AGENT_AVAILABLE
	 */
	NO_AGENT_AVAILABLE("NO_AGENT_AVAILABLE"),

	/**
	 * OTHER
	 */
	OTHER("OTHER");

	private String value;

	EConversationEndReason(String value) {
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
	public static EConversationEndReason fromValue(String value) {
		for (EConversationEndReason b : EConversationEndReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
