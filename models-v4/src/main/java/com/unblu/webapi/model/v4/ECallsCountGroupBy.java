
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECallsCountGroupBy
 */
public enum ECallsCountGroupBy {

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
	 * CALL_TYPE: Group by call type.
	 */
	CALL_TYPE("CALL_TYPE"),

	/**
	 * CALL_END_REASON: Group by call end reason.
	 */
	CALL_END_REASON("CALL_END_REASON"),

	/**
	 * NUMBER_OVERALL_CALL_PARTICIPANTS: Group by number of overall call participants.
	 */
	NUMBER_OVERALL_CALL_PARTICIPANTS("NUMBER_OVERALL_CALL_PARTICIPANTS"),

	/**
	 * STARTING_PERSON_ID: Group by starting person ID.
	 */
	STARTING_PERSON_ID("STARTING_PERSON_ID"),

	/**
	 * STARTING_PERSON_TEAM_ID: Group by starting person team ID.
	 */
	STARTING_PERSON_TEAM_ID("STARTING_PERSON_TEAM_ID");

	private String value;

	ECallsCountGroupBy(String value) {
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
	public static ECallsCountGroupBy fromValue(String value) {
		for (ECallsCountGroupBy b : ECallsCountGroupBy.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
