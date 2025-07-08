
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Collaboration layer event orderBy values
 */
public enum ECollaborationLayerEventOrderByField {

	/**
	 * TRIGGERING_PERSON_ID: Sort by the &#39;triggeringPersonId&#39; attribute
	 */
	TRIGGERING_PERSON_ID("TRIGGERING_PERSON_ID"),

	/**
	 * EVENT_SOURCE_TYPE: Sort by the &#39;eventSourceType&#39; attribute
	 */
	EVENT_SOURCE_TYPE("EVENT_SOURCE_TYPE"),

	/**
	 * EVENT_TIMESTAMP: Sort by the &#39;eventTimestamp&#39; attribute
	 */
	EVENT_TIMESTAMP("EVENT_TIMESTAMP"),

	/**
	 * CONVERSATION_ID: Sort by the &#39;conversationId&#39; attribute
	 */
	CONVERSATION_ID("CONVERSATION_ID");

	private String value;

	ECollaborationLayerEventOrderByField(String value) {
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
	public static ECollaborationLayerEventOrderByField fromValue(String value) {
		for (ECollaborationLayerEventOrderByField b : ECollaborationLayerEventOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
