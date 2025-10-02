
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The reason that triggered the calculation of an agent&#39;s handling time.
 */
public enum EHandlingTimeTrigger {

	/**
	 * FORWARDED: The conversation was forwarded to another agent or team.
	 */
	FORWARDED("FORWARDED"),

	/**
	 * PUSHED_TO_QUEUE: The conversation was pushed to a queue.
	 */
	PUSHED_TO_QUEUE("PUSHED_TO_QUEUE"),

	/**
	 * PARTICIPATION_ENDED: The participation of this agent has ended.
	 */
	PARTICIPATION_ENDED("PARTICIPATION_ENDED"),

	/**
	 * CONVERSATION_ENDED: The conversation has ended.
	 */
	CONVERSATION_ENDED("CONVERSATION_ENDED");

	private String value;

	EHandlingTimeTrigger(String value) {
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
	public static EHandlingTimeTrigger fromValue(String value) {
		for (EHandlingTimeTrigger b : EHandlingTimeTrigger.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
