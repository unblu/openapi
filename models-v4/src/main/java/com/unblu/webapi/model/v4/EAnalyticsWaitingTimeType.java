
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines the context in which a waiting time occurred, based on the conversation state and the type of assignment or forwarding action.
 */
public enum EAnalyticsWaitingTimeType {

	/**
	 * INITIALLY_QUEUED: The conversation transitioned from ONBOARDING to QUEUED.
	 */
	INITIALLY_QUEUED("INITIALLY_QUEUED"),

	/**
	 * REBOARDING_QUEUED: The conversation transitioned from REBOARDING to QUEUED.
	 */
	REBOARDING_QUEUED("REBOARDING_QUEUED"),

	/**
	 * REQUEUED: The conversation transitioned from ACTIVE or UNASSIGNED to QUEUED.
	 */
	REQUEUED("REQUEUED"),

	/**
	 * RECIPIENT_CHANGED: The recipient of the active invitation was changed.
	 */
	RECIPIENT_CHANGED("RECIPIENT_CHANGED"),

	/**
	 * AGENT_FORWARDING: The conversation was forwarded to a specific agent.
	 */
	AGENT_FORWARDING("AGENT_FORWARDING"),

	/**
	 * TEAM_FORWARDING: The conversation was forwarded to a specific team.
	 */
	TEAM_FORWARDING("TEAM_FORWARDING");

	private String value;

	EAnalyticsWaitingTimeType(String value) {
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
	public static EAnalyticsWaitingTimeType fromValue(String value) {
		for (EAnalyticsWaitingTimeType b : EAnalyticsWaitingTimeType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
