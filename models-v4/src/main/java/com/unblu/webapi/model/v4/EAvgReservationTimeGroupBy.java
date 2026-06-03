
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAvgReservationTimeGroupBy
 */
public enum EAvgReservationTimeGroupBy {

	/**
	 * QUEUE_INTERACTION_TYPE: Group by queue interaction type. See &#x60;EQueueInteractionType&#x60; for the full set of values.
	 */
	QUEUE_INTERACTION_TYPE("QUEUE_INTERACTION_TYPE"),

	/**
	 * CONVERSATION_TEMPLATE_ID: Group by conversation template ID.
	 */
	CONVERSATION_TEMPLATE_ID("CONVERSATION_TEMPLATE_ID"),

	/**
	 * CONVERSATION_LOCALE: Group by conversation locale.
	 */
	CONVERSATION_LOCALE("CONVERSATION_LOCALE"),

	/**
	 * CONVERSATION_RECIPIENT_ID: Group by conversation recipient ID.
	 */
	CONVERSATION_RECIPIENT_ID("CONVERSATION_RECIPIENT_ID"),

	/**
	 * INITIAL_ENGAGEMENT_TYPE: Group by initial engagement type.
	 */
	INITIAL_ENGAGEMENT_TYPE("INITIAL_ENGAGEMENT_TYPE"),

	/**
	 * ASSIGNED_AGENT_PERSON_ID: Group by assigned agent person ID (the agent who redeemed the invitation, or the agent the invitation was reserved for).
	 */
	ASSIGNED_AGENT_PERSON_ID("ASSIGNED_AGENT_PERSON_ID"),

	/**
	 * ASSIGNED_AGENT_TEAM_ID: Group by assigned agent team ID (the agent who redeemed the invitation, or the agent the invitation was reserved for).
	 */
	ASSIGNED_AGENT_TEAM_ID("ASSIGNED_AGENT_TEAM_ID");

	private String value;

	EAvgReservationTimeGroupBy(String value) {
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
	public static EAvgReservationTimeGroupBy fromValue(String value) {
		for (EAvgReservationTimeGroupBy b : EAvgReservationTimeGroupBy.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
