
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Participation left reason of a conversation
 */
public enum EConversationLeftReason {

	/**
	 * FORWARDED: The participation ended because the conversation was forwarded to somebody else
	 */
	FORWARDED("FORWARDED"),

	/**
	 * PARTICIPANT_LEFT: The participant left the conversation on their own
	 */
	PARTICIPANT_LEFT("PARTICIPANT_LEFT"),

	/**
	 * REMOVED_AFTER_TIMEOUT: The participant was removed from the conversation after being inactive for too long
	 */
	REMOVED_AFTER_TIMEOUT("REMOVED_AFTER_TIMEOUT"),

	/**
	 * ONBOARDING_DECLINED: The participant declined the onboarding and therefore never joined
	 */
	ONBOARDING_DECLINED("ONBOARDING_DECLINED"),

	/**
	 * ONBOARDING_IDLE_TIMEOUT: The participant did not react during the onboarding
	 */
	ONBOARDING_IDLE_TIMEOUT("ONBOARDING_IDLE_TIMEOUT"),

	/**
	 * ONBOARDING_TIMEOUT: The participant did not complete onboarding within the allowed time
	 */
	ONBOARDING_TIMEOUT("ONBOARDING_TIMEOUT"),

	/**
	 * USER_CHANGED: The participation ended because the person behind the participant changed, for example on login
	 */
	USER_CHANGED("USER_CHANGED"),

	/**
	 * KICKED: The participant was removed from the conversation by somebody else
	 */
	KICKED("KICKED"),

	/**
	 * CONVERSATION_UNASSIGNED: The participation ended because the conversation became unassigned
	 */
	CONVERSATION_UNASSIGNED("CONVERSATION_UNASSIGNED"),

	/**
	 * CONVERSATION_REQUEUED: The participation ended because the conversation was put back into the queue
	 */
	CONVERSATION_REQUEUED("CONVERSATION_REQUEUED"),

	/**
	 * PUBLIC_DIALIN_ENDED: The participation ended because the public dial-in session ended
	 */
	PUBLIC_DIALIN_ENDED("PUBLIC_DIALIN_ENDED"),

	/**
	 * EXTERNAL_CONTACT_UNLINKED: The participation ended because the external contact was unlinked from the person
	 */
	EXTERNAL_CONTACT_UNLINKED("EXTERNAL_CONTACT_UNLINKED"),

	/**
	 * ASSISTANT_SYNCHRONIZATION: The participation was removed while synchronizing the assistants of the conversation
	 */
	ASSISTANT_SYNCHRONIZATION("ASSISTANT_SYNCHRONIZATION"),

	/**
	 * DEPUTY_REMOVAL: The participation was removed because the deputy relationship it was based on ended
	 */
	DEPUTY_REMOVAL("DEPUTY_REMOVAL"),

	/**
	 * OTHER: The participation ended for a reason not covered by the other values
	 */
	OTHER("OTHER");

	private String value;

	EConversationLeftReason(String value) {
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
	public static EConversationLeftReason fromValue(String value) {
		for (EConversationLeftReason b : EConversationLeftReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
