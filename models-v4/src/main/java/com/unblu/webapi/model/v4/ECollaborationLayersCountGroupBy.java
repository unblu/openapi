
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECollaborationLayersCountGroupBy
 */
public enum ECollaborationLayersCountGroupBy {

	/**
	 * CONVERSATION_RECIPIENT_ID: Group by conversation recipient ID.
	 */
	CONVERSATION_RECIPIENT_ID("CONVERSATION_RECIPIENT_ID"),

	/**
	 * CONVERSATION_TEMPLATE_ID: Group by conversation template ID.
	 */
	CONVERSATION_TEMPLATE_ID("CONVERSATION_TEMPLATE_ID"),

	/**
	 * CONVERSATION_LOCALE: Group by language.
	 */
	CONVERSATION_LOCALE("CONVERSATION_LOCALE"),

	/**
	 * INITIAL_ENGAGEMENT_TYPE: Group by initial engagement type.
	 */
	INITIAL_ENGAGEMENT_TYPE("INITIAL_ENGAGEMENT_TYPE"),

	/**
	 * LAYER_TYPE: Group by collaboration layer type.
	 */
	LAYER_TYPE("LAYER_TYPE"),

	/**
	 * LAYER_STOP_REASON: Group by the reason the collaboration layer was stopped.
	 */
	LAYER_STOP_REASON("LAYER_STOP_REASON"),

	/**
	 * STARTING_PERSON_ID: Group by starting person ID.
	 */
	STARTING_PERSON_ID("STARTING_PERSON_ID"),

	/**
	 * STARTING_PERSON_TEAM_ID: Group by starting person team ID.
	 */
	STARTING_PERSON_TEAM_ID("STARTING_PERSON_TEAM_ID"),

	/**
	 * CONVERSATION_LABELS: Group by the labels attached to the conversation.
	 */
	CONVERSATION_LABELS("CONVERSATION_LABELS"),

	/**
	 * CONTEXT_PERSON_LABELS: Group by the labels attached to the context person of the conversation.
	 */
	CONTEXT_PERSON_LABELS("CONTEXT_PERSON_LABELS"),

	/**
	 * ASSIGNED_AGENT_LABELS: Group by the labels attached to the assigned agent.
	 */
	ASSIGNED_AGENT_LABELS("ASSIGNED_AGENT_LABELS"),

	/**
	 * STARTING_PERSON_LABELS: Group by the labels attached to the person who started the collaboration layer.
	 */
	STARTING_PERSON_LABELS("STARTING_PERSON_LABELS"),

	/**
	 * STOPPING_PERSON_LABELS: Group by the labels attached to the person who stopped the collaboration layer.
	 */
	STOPPING_PERSON_LABELS("STOPPING_PERSON_LABELS"),

	/**
	 * LAYER_OWNER_LABELS: Group by the labels attached to the owner of the collaboration layer.
	 */
	LAYER_OWNER_LABELS("LAYER_OWNER_LABELS");

	private String value;

	ECollaborationLayersCountGroupBy(String value) {
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
	public static ECollaborationLayersCountGroupBy fromValue(String value) {
		for (ECollaborationLayersCountGroupBy b : ECollaborationLayersCountGroupBy.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
