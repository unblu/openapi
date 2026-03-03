
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EMessagesCountGroupBy
 */
public enum EMessagesCountGroupBy {

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
	 * ASSIGNED_AGENT_PERSON_ID: Group by assigned agent person ID.
	 */
	ASSIGNED_AGENT_PERSON_ID("ASSIGNED_AGENT_PERSON_ID"),

	/**
	 * ASSIGNED_AGENT_TEAM_ID: Group by assigned agent team ID.
	 */
	ASSIGNED_AGENT_TEAM_ID("ASSIGNED_AGENT_TEAM_ID"),

	/**
	 * SENDER_PERSON_TYPE: Group by sender person type.
	 */
	SENDER_PERSON_TYPE("SENDER_PERSON_TYPE"),

	/**
	 * SENDER_PERSON_ID: Group by sender person ID.
	 */
	SENDER_PERSON_ID("SENDER_PERSON_ID"),

	/**
	 * SENDER_PERSON_TEAM_ID: Group by sender person team ID.
	 */
	SENDER_PERSON_TEAM_ID("SENDER_PERSON_TEAM_ID"),

	/**
	 * MESSAGE_TYPE: Group by message type.
	 */
	MESSAGE_TYPE("MESSAGE_TYPE");

	private String value;

	EMessagesCountGroupBy(String value) {
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
	public static EMessagesCountGroupBy fromValue(String value) {
		for (EMessagesCountGroupBy b : EMessagesCountGroupBy.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
