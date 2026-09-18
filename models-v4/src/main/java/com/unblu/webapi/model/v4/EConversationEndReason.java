
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Closing reason of a conversation
 */
public enum EConversationEndReason {

	/**
	 * ENDED_BY_PARTICIPANT: A participant explicitly ended the conversation
	 */
	ENDED_BY_PARTICIPANT("ENDED_BY_PARTICIPANT"),

	/**
	 * MANDATORY_PARTICIPANT_GONE: A participant without whom the conversation cannot continue left it
	 */
	MANDATORY_PARTICIPANT_GONE("MANDATORY_PARTICIPANT_GONE"),

	/**
	 * REQUEST_DECLINED: The conversation request was declined
	 */
	REQUEST_DECLINED("REQUEST_DECLINED"),

	/**
	 * REQUEST_NOT_ANSWERED: The conversation request was never answered
	 */
	REQUEST_NOT_ANSWERED("REQUEST_NOT_ANSWERED"),

	/**
	 * EXTERNAL_CHANNEL_CLOSED: The external messenger channel carrying the conversation was closed
	 */
	EXTERNAL_CHANNEL_CLOSED("EXTERNAL_CHANNEL_CLOSED"),

	/**
	 * SOLVED_BY_BOT: A bot handled the request, so no agent was needed
	 */
	SOLVED_BY_BOT("SOLVED_BY_BOT"),

	/**
	 * CANCELED: The conversation was ended while it was still being created or onboarded, so it never became active
	 */
	CANCELED("CANCELED"),

	/**
	 * CALL_ENDED: The call the conversation was created for ended
	 */
	CALL_ENDED("CALL_ENDED"),

	/**
	 * NO_AGENT_AVAILABLE: No agent was available to take the conversation
	 */
	NO_AGENT_AVAILABLE("NO_AGENT_AVAILABLE"),

	/**
	 * OTHER: The conversation ended for a reason not covered by the other values
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
