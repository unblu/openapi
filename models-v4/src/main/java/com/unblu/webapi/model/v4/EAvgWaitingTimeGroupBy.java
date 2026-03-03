
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAvgWaitingTimeGroupBy
 */
public enum EAvgWaitingTimeGroupBy {

	/**
	 * CONVERSATION_RECIPIENT_ID: Group by conversation recipient ID.
	 */
	CONVERSATION_RECIPIENT_ID("CONVERSATION_RECIPIENT_ID"),

	/**
	 * CONVERSATION_TEMPLATE_ID: Group by conversation template ID.
	 */
	CONVERSATION_TEMPLATE_ID("CONVERSATION_TEMPLATE_ID"),

	/**
	 * CONVERSATION_LOCALE: Group by conversation locale.
	 */
	CONVERSATION_LOCALE("CONVERSATION_LOCALE"),

	/**
	 * INITIAL_ENGAGEMENT_TYPE: Group by initial engagement type.
	 */
	INITIAL_ENGAGEMENT_TYPE("INITIAL_ENGAGEMENT_TYPE"),

	/**
	 * WAITING_TIME_OUTCOME: Group by waiting time outcome.
	 */
	WAITING_TIME_OUTCOME("WAITING_TIME_OUTCOME"),

	/**
	 * WAITING_TIME_TYPE: Group by waiting time type.
	 */
	WAITING_TIME_TYPE("WAITING_TIME_TYPE"),

	/**
	 * INVITATION_TARGET_ID: Group by invitation target ID, which can be one of the following: person ID, team ID, or named area ID.
	 */
	INVITATION_TARGET_ID("INVITATION_TARGET_ID"),

	/**
	 * INVITATION_ACCEPTING_AGENT_PERSON_ID: Group by the person ID of the agent who accepted the invitation.
	 */
	INVITATION_ACCEPTING_AGENT_PERSON_ID("INVITATION_ACCEPTING_AGENT_PERSON_ID"),

	/**
	 * INVITATION_ACCEPTING_AGENT_TEAM_ID: Group by the team ID of the agent who accepted the invitation.
	 */
	INVITATION_ACCEPTING_AGENT_TEAM_ID("INVITATION_ACCEPTING_AGENT_TEAM_ID");

	private String value;

	EAvgWaitingTimeGroupBy(String value) {
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
	public static EAvgWaitingTimeGroupBy fromValue(String value) {
		for (EAvgWaitingTimeGroupBy b : EAvgWaitingTimeGroupBy.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
