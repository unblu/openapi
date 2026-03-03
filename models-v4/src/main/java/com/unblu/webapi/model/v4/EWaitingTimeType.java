
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EWaitingTimeType
 */
public enum EWaitingTimeType {

	/**
	 * INITIALLY_QUEUED: Queued at the start of the conversation.
	 */
	INITIALLY_QUEUED("INITIALLY_QUEUED"),

	/**
	 * REBOARDING_QUEUED: Queued after reboarding.
	 */
	REBOARDING_QUEUED("REBOARDING_QUEUED"),

	/**
	 * PUSH_TO_QUEUE: Conversation pushed back to queue by agent.
	 */
	PUSH_TO_QUEUE("PUSH_TO_QUEUE"),

	/**
	 * AGENT_FORWARDING: Queued after agent forwarding.
	 */
	AGENT_FORWARDING("AGENT_FORWARDING"),

	/**
	 * TEAM_FORWARDING: Queued after team forwarding.
	 */
	TEAM_FORWARDING("TEAM_FORWARDING");

	private String value;

	EWaitingTimeType(String value) {
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
	public static EWaitingTimeType fromValue(String value) {
		for (EWaitingTimeType b : EWaitingTimeType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
