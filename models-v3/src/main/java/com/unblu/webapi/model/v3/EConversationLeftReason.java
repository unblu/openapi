
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Participation left reason of a conversation
 */
public enum EConversationLeftReason {

	/**
	 * FORWARDED
	 */
	FORWARDED("FORWARDED"),

	/**
	 * PARTICIPANT_LEFT
	 */
	PARTICIPANT_LEFT("PARTICIPANT_LEFT"),

	/**
	 * REMOVED_AFTER_TIMEOUT
	 */
	REMOVED_AFTER_TIMEOUT("REMOVED_AFTER_TIMEOUT"),

	/**
	 * ONBOARDING_DECLINED
	 */
	ONBOARDING_DECLINED("ONBOARDING_DECLINED"),

	/**
	 * ONBOARDING_IDLE_TIMEOUT
	 */
	ONBOARDING_IDLE_TIMEOUT("ONBOARDING_IDLE_TIMEOUT"),

	/**
	 * ONBOARDING_TIMEOUT
	 */
	ONBOARDING_TIMEOUT("ONBOARDING_TIMEOUT"),

	/**
	 * USER_CHANGED
	 */
	USER_CHANGED("USER_CHANGED"),

	/**
	 * KICKED
	 */
	KICKED("KICKED"),

	/**
	 * CONVERSATION_UNASSIGNED
	 */
	CONVERSATION_UNASSIGNED("CONVERSATION_UNASSIGNED"),

	/**
	 * CONVERSATION_REQUEUED
	 */
	CONVERSATION_REQUEUED("CONVERSATION_REQUEUED"),

	/**
	 * PUBLIC_DIALIN_ENDED
	 */
	PUBLIC_DIALIN_ENDED("PUBLIC_DIALIN_ENDED"),

	/**
	 * OTHER
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
