
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The trigger for a bot thread end
 */
public enum EBotThreadEndTrigger {

	/**
	 * GLOBAL_TIMEOUT: The bot thread ended because of a global boarding timeout
	 */
	GLOBAL_TIMEOUT("GLOBAL_TIMEOUT"),

	/**
	 * IDLE_TIMEOUT: The bot thread ended because of a boarding idle timeout
	 */
	IDLE_TIMEOUT("IDLE_TIMEOUT"),

	/**
	 * PARTICIPANT_LEFT: The bot thread ended because the boarding participant left
	 */
	PARTICIPANT_LEFT("PARTICIPANT_LEFT"),

	/**
	 * PARTICIPANT_USER_CHANGED: The bot thread ended because the boarding participant changed
	 */
	PARTICIPANT_USER_CHANGED("PARTICIPANT_USER_CHANGED"),

	/**
	 * PARTICIPANT_REMOVED: The bot thread ended because the boarding participant was removed
	 */
	PARTICIPANT_REMOVED("PARTICIPANT_REMOVED"),

	/**
	 * BOT_ACTION: The bot thread ended because the bot decided to end it
	 */
	BOT_ACTION("BOT_ACTION"),

	/**
	 * CONVERSATION_ENDED: The bot thread ended because the conversation ended
	 */
	CONVERSATION_ENDED("CONVERSATION_ENDED"),

	/**
	 * OTHER: The bot thread ended for some other reason
	 */
	OTHER("OTHER"),

	/**
	 * ERROR: The bot thread ended because of an unexpected error
	 */
	ERROR("ERROR");

	private String value;

	EBotThreadEndTrigger(String value) {
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
	public static EBotThreadEndTrigger fromValue(String value) {
		for (EBotThreadEndTrigger b : EBotThreadEndTrigger.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
