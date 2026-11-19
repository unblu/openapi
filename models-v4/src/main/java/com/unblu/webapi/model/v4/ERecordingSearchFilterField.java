
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ERecordingSearchFilterField
 */
public enum ERecordingSearchFilterField {

	/**
	 * CALL_ID: Filter by the IDs of the calls held during the recording
	 */
	CALL_ID("CALL_ID"),

	/**
	 * SIPREC_SESSION_ID: Filter by the SIPREC session IDs the recording servers received. Matches SIPREC recordings only.
	 */
	SIPREC_SESSION_ID("SIPREC_SESSION_ID"),

	/**
	 * CONVERSATION_ID: Filter by the &#39;conversationId&#39; attribute
	 */
	CONVERSATION_ID("CONVERSATION_ID"),

	/**
	 * RECORDING_SYSTEM: Filter by the &#39;recordingSystem&#39; attribute
	 */
	RECORDING_SYSTEM("RECORDING_SYSTEM"),

	/**
	 * START_TIMESTAMP: Filter by the &#39;startTimestamp&#39; attribute
	 */
	START_TIMESTAMP("START_TIMESTAMP"),

	/**
	 * END_TIMESTAMP: Filter by the &#39;endTimestamp&#39; attribute
	 */
	END_TIMESTAMP("END_TIMESTAMP");

	private String value;

	ERecordingSearchFilterField(String value) {
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
	public static ERecordingSearchFilterField fromValue(String value) {
		for (ERecordingSearchFilterField b : ERecordingSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
