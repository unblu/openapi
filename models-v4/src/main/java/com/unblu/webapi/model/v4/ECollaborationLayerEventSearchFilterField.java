
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Filter fields corresponding to fields defined by &#x60;CollaborationLayerEventSearchFilter&#x60;
 */
public enum ECollaborationLayerEventSearchFilterField {

	/**
	 * EVENT_SOURCE_TYPE: Filter by the &#39;eventSourceType&#39; attribute
	 */
	EVENT_SOURCE_TYPE("EVENT_SOURCE_TYPE"),

	/**
	 * CONVERSATION_ID: Filter by the &#39;conversationId&#39; attribute
	 */
	CONVERSATION_ID("CONVERSATION_ID"),

	/**
	 * EVENT_TIMESTAMP: Filter by the &#39;eventTimestamp&#39; attribute. Specify the timestamp in the UTC timezone in milliseconds.
	 */
	EVENT_TIMESTAMP("EVENT_TIMESTAMP"),

	/**
	 * TRIGGERING_PERSON_ID: Filter by the &#39;triggeringPersonId&#39; attribute.
	 */
	TRIGGERING_PERSON_ID("TRIGGERING_PERSON_ID");

	private String value;

	ECollaborationLayerEventSearchFilterField(String value) {
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
	public static ECollaborationLayerEventSearchFilterField fromValue(String value) {
		for (ECollaborationLayerEventSearchFilterField b : ECollaborationLayerEventSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
