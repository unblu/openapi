
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EQueueEntriesGroupBy
 */
public enum EQueueEntriesGroupBy {

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
	 * WAITING_TIME_TYPE: Group by the reason the conversation entered the queue, using the same types as the waiting time KPI.
	 */
	WAITING_TIME_TYPE("WAITING_TIME_TYPE"),

	/**
	 * INVITATION_TARGET_ID: Group by invitation target ID, which can be one of the following: person ID, team ID, or named area ID.
	 */
	INVITATION_TARGET_ID("INVITATION_TARGET_ID"),

	/**
	 * CONVERSATION_LABELS: Group by the labels attached to the conversation.
	 */
	CONVERSATION_LABELS("CONVERSATION_LABELS"),

	/**
	 * CONTEXT_PERSON_LABELS: Group by the labels attached to the context person of the conversation.
	 */
	CONTEXT_PERSON_LABELS("CONTEXT_PERSON_LABELS");

	private String value;

	EQueueEntriesGroupBy(String value) {
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
	public static EQueueEntriesGroupBy fromValue(String value) {
		for (EQueueEntriesGroupBy b : EQueueEntriesGroupBy.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
