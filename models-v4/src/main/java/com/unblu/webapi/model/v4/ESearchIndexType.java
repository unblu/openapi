
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of index. Different elements (messages, transcripts, etc.) are indexed in different indices.
 */
public enum ESearchIndexType {

	/**
	 * CONVERSATION_MESSAGES: The index for messages in a conversation
	 */
	CONVERSATION_MESSAGES("CONVERSATION_MESSAGES");

	private String value;

	ESearchIndexType(String value) {
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
	public static ESearchIndexType fromValue(String value) {
		for (ESearchIndexType b : ESearchIndexType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
