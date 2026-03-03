
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationsEndedCountGroupBy
 */
public enum EConversationsEndedCountGroupBy {

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
	 * CONTEXT_PERSON_RATING: Group by context person rating.
	 */
	CONTEXT_PERSON_RATING("CONTEXT_PERSON_RATING"),

	/**
	 * CONVERSATION_END_REASON: Group by conversation end reason.
	 */
	CONVERSATION_END_REASON("CONVERSATION_END_REASON");

	private String value;

	EConversationsEndedCountGroupBy(String value) {
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
	public static EConversationsEndedCountGroupBy fromValue(String value) {
		for (EConversationsEndedCountGroupBy b : EConversationsEndedCountGroupBy.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
