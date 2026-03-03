
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
	 * LAYER_TYPE: Group by layer type.
	 */
	LAYER_TYPE("LAYER_TYPE"),

	/**
	 * LAYER_STOP_REASON: Group by layer stop reason.
	 */
	LAYER_STOP_REASON("LAYER_STOP_REASON"),

	/**
	 * STARTING_PERSON_ID: Group by starting person ID.
	 */
	STARTING_PERSON_ID("STARTING_PERSON_ID"),

	/**
	 * STARTING_PERSON_TEAM_ID: Group by starting person team ID.
	 */
	STARTING_PERSON_TEAM_ID("STARTING_PERSON_TEAM_ID");

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
