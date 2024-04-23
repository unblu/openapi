
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reason why the offboarding from a conversation was triggered for an individual person.
 */
public enum EOffboardingReason {

	/**
	 * FORWARDED: Conversation was forwarded to another agent and this agent therefore left the conversation
	 */
	FORWARDED("FORWARDED"),

	/**
	 * PARTICIPANT_LEFT: The participant left the conversation by himself
	 */
	PARTICIPANT_LEFT("PARTICIPANT_LEFT"),

	/**
	 * REMOVED_AFTER_TIMEOUT: The participant was removed from the conversation as he had a connection timeout
	 */
	REMOVED_AFTER_TIMEOUT("REMOVED_AFTER_TIMEOUT"),

	/**
	 * ONBOARDING_DECLINED: The onboarding was declined and therefore the participant will not join the conversation
	 */
	ONBOARDING_DECLINED("ONBOARDING_DECLINED"),

	/**
	 * ONBOARDING_TIMEOUT: The onboarding took too long and therefore the participant will not join the conversation
	 */
	ONBOARDING_TIMEOUT("ONBOARDING_TIMEOUT"),

	/**
	 * ONBOARDING_IDLE_TIMEOUT: The onboarding timed out and therefore the participant will not join the conversation
	 */
	ONBOARDING_IDLE_TIMEOUT("ONBOARDING_IDLE_TIMEOUT"),

	/**
	 * KICKED: The participant was kicked out of the conversation
	 */
	KICKED("KICKED"),

	/**
	 * CONVERSATION_UNASSIGNED: The conversation is no longer assigned to an agent and therefore all other agents were removed
	 */
	CONVERSATION_UNASSIGNED("CONVERSATION_UNASSIGNED"),

	/**
	 * EXTERNAL_CHANNEL_CLOSED: The external channel connected to this conversation has closed, no further messages are possible.
	 */
	EXTERNAL_CHANNEL_CLOSED("EXTERNAL_CHANNEL_CLOSED"),

	/**
	 * CONVERSATION_CANCELED: The conversation was canceled before it was started
	 */
	CONVERSATION_CANCELED("CONVERSATION_CANCELED"),

	/**
	 * CONVERSATION_ENDED: The conversation has ended
	 */
	CONVERSATION_ENDED("CONVERSATION_ENDED"),

	/**
	 * SOLVED_BY_BOT: The conversation was ended because an onboarding bot solved it.
	 */
	SOLVED_BY_BOT("SOLVED_BY_BOT"),

	/**
	 * CONVERSATION_REQUEUED: The conversation has been re-queued.
	 */
	CONVERSATION_REQUEUED("CONVERSATION_REQUEUED"),

	/**
	 * NO_AGENT_AVAILABLE: There was no agent available for the conversation
	 */
	NO_AGENT_AVAILABLE("NO_AGENT_AVAILABLE"),

	/**
	 * PUBLIC_DIALIN_ENDED: The public call dial-in ended, which automatically removes the person from the conversation
	 */
	PUBLIC_DIALIN_ENDED("PUBLIC_DIALIN_ENDED"),

	/**
	 * OTHER: Some other unspecified reason
	 */
	OTHER("OTHER");

	private String value;

	EOffboardingReason(String value) {
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
	public static EOffboardingReason fromValue(String value) {
		for (EOffboardingReason b : EOffboardingReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
