
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECannedResponseUsageSearchFilterField
 */
public enum ECannedResponseUsageSearchFilterField {

	/**
	 * PERSON_ID: Filter by the &#39;personId&#39; attribute
	 */
	PERSON_ID("PERSON_ID"),

	/**
	 * CANNED_RESPONSE_ID: Filter by the &#39;cannedResponseId&#39; attribute
	 */
	CANNED_RESPONSE_ID("CANNED_RESPONSE_ID"),

	/**
	 * MESSAGE_ID: Filter by the &#39;messageId&#39; attribute
	 */
	MESSAGE_ID("MESSAGE_ID"),

	/**
	 * CONVERSATION_ID: Filter by the &#39;conversationId&#39; attribute
	 */
	CONVERSATION_ID("CONVERSATION_ID"),

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP");

	private String value;

	ECannedResponseUsageSearchFilterField(String value) {
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
	public static ECannedResponseUsageSearchFilterField fromValue(String value) {
		for (ECannedResponseUsageSearchFilterField b : ECannedResponseUsageSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
