
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECollaborationLayerLogEntrySearchFilterField
 */
public enum ECollaborationLayerLogEntrySearchFilterField {

	/**
	 * CONVERSATION_ID: Filter by the &#39;conversationId&#39; attribute
	 */
	CONVERSATION_ID("CONVERSATION_ID"),

	/**
	 * STARTING_TIMESTAMP: Filter by the &#39;startingTimestamp&#39; attribute
	 */
	STARTING_TIMESTAMP("STARTING_TIMESTAMP"),

	/**
	 * STOP_TIMESTAMP: Filter by the &#39;stopTimestamp&#39; attribute
	 */
	STOP_TIMESTAMP("STOP_TIMESTAMP"),

	/**
	 * ABORTED_TIMESTAMP: Filter by the &#39;abortedTimestamp&#39; attribute
	 */
	ABORTED_TIMESTAMP("ABORTED_TIMESTAMP"),

	/**
	 * LAYER_STOP_REASON: Filter by the &#39;layerStopReason&#39; attribute
	 */
	LAYER_STOP_REASON("LAYER_STOP_REASON"),

	/**
	 * LAYER_TYPE: Filter by the &#39;layerType&#39; attribute
	 */
	LAYER_TYPE("LAYER_TYPE"),

	/**
	 * STARTING_PERSON_ID: Filter by the &#39;startingPersonId&#39; attribute
	 */
	STARTING_PERSON_ID("STARTING_PERSON_ID"),

	/**
	 * STOPPING_PERSON_ID: Filter by the &#39;stoppingPersonId&#39; attribute
	 */
	STOPPING_PERSON_ID("STOPPING_PERSON_ID"),

	/**
	 * CONVERSATION_RECORDING_ID: Filter by the &#39;conversationRecordingId&#39; attribute
	 */
	CONVERSATION_RECORDING_ID("CONVERSATION_RECORDING_ID"),

	/**
	 * PARTICIPANT_PERSON_ID: Filter by the &#39;participantPersonId&#39; attribute
	 */
	PARTICIPANT_PERSON_ID("PARTICIPANT_PERSON_ID");

	private String value;

	ECollaborationLayerLogEntrySearchFilterField(String value) {
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
	public static ECollaborationLayerLogEntrySearchFilterField fromValue(String value) {
		for (ECollaborationLayerLogEntrySearchFilterField b : ECollaborationLayerLogEntrySearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
