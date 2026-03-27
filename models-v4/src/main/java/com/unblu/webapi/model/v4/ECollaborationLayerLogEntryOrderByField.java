
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECollaborationLayerLogEntryOrderByField
 */
public enum ECollaborationLayerLogEntryOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * CONVERSATION_ID: Sort by the &#39;conversationId&#39; attribute
	 */
	CONVERSATION_ID("CONVERSATION_ID"),

	/**
	 * CREATION_TIMESTAMP: Sort by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Sort by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP"),

	/**
	 * LAYER_TYPE: Sort by the &#39;layerType&#39; attribute
	 */
	LAYER_TYPE("LAYER_TYPE"),

	/**
	 * STARTING_PERSON_ID: Sort by the &#39;startingPersonId&#39; attribute
	 */
	STARTING_PERSON_ID("STARTING_PERSON_ID"),

	/**
	 * STOPPING_PERSON_ID: Sort by the &#39;stoppingPersonId&#39; attribute
	 */
	STOPPING_PERSON_ID("STOPPING_PERSON_ID"),

	/**
	 * ACTIVATION_TIMESTAMP: Sort by the &#39;activatingTimestamp&#39; attribute
	 */
	ACTIVATION_TIMESTAMP("ACTIVATION_TIMESTAMP"),

	/**
	 * STARTING_TIMESTAMP: Sort by the &#39;startingTimestamp&#39; attribute
	 */
	STARTING_TIMESTAMP("STARTING_TIMESTAMP"),

	/**
	 * APPROVAL_TIMESTAMP: Sort by the &#39;approvalTimestamp&#39; attribute
	 */
	APPROVAL_TIMESTAMP("APPROVAL_TIMESTAMP"),

	/**
	 * STOP_TIMESTAMP: Sort by the &#39;stopTimestamp&#39; attribute
	 */
	STOP_TIMESTAMP("STOP_TIMESTAMP"),

	/**
	 * ABORTED_TIMESTAMP: Sort by the &#39;abortedTimestamp&#39; attribute
	 */
	ABORTED_TIMESTAMP("ABORTED_TIMESTAMP"),

	/**
	 * LAYER_STOP_REASON: Sort by the &#39;layerStopReason&#39; attribute
	 */
	LAYER_STOP_REASON("LAYER_STOP_REASON"),

	/**
	 * CONVERSATION_RECORDING_ID: Sort by the &#39;conversationRecordingId&#39; attribute
	 */
	CONVERSATION_RECORDING_ID("CONVERSATION_RECORDING_ID");

	private String value;

	ECollaborationLayerLogEntryOrderByField(String value) {
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
	public static ECollaborationLayerLogEntryOrderByField fromValue(String value) {
		for (ECollaborationLayerLogEntryOrderByField b : ECollaborationLayerLogEntryOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
