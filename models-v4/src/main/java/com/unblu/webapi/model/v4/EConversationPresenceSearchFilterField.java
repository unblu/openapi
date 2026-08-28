
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationPresenceSearchFilterField
 */
public enum EConversationPresenceSearchFilterField {

	/**
	 * CONVERSATION_ID: Filter by the &#39;conversationId&#39; attribute
	 */
	CONVERSATION_ID("CONVERSATION_ID"),

	/**
	 * PERSON_ID: Filter by the &#39;personId&#39; attribute (resolved through the associated person presence)
	 */
	PERSON_ID("PERSON_ID"),

	/**
	 * JOINED_TIMESTAMP: Filter by the &#39;joinedTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	JOINED_TIMESTAMP("JOINED_TIMESTAMP"),

	/**
	 * LEFT_TIMESTAMP: Filter by the &#39;leftTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	LEFT_TIMESTAMP("LEFT_TIMESTAMP");

	private String value;

	EConversationPresenceSearchFilterField(String value) {
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
	public static EConversationPresenceSearchFilterField fromValue(String value) {
		for (EConversationPresenceSearchFilterField b : EConversationPresenceSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
