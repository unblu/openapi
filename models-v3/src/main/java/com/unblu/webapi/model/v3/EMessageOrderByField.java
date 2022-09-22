
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EMessageOrderByField
 */
public enum EMessageOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * CONVERSATION_ID: Sort by the &#39;conversationId&#39; attribute
	 */
	CONVERSATION_ID("CONVERSATION_ID"),

	/**
	 * SEND_TIMESTAMP: Sort by the &#39;sendTimestamp&#39; attribute
	 */
	SEND_TIMESTAMP("SEND_TIMESTAMP"),

	/**
	 * SERVER_TIMESTAMP: Sort by the &#39;serverTimestamp&#39; attribute
	 */
	SERVER_TIMESTAMP("SERVER_TIMESTAMP"),

	/**
	 * SENDER_PERSON_ID: Sort by the &#39;senderPersonId&#39; attribute
	 */
	SENDER_PERSON_ID("SENDER_PERSON_ID"),

	/**
	 * TYPE: Sort by the &#39;type&#39; attribute
	 */
	TYPE("TYPE"),

	/**
	 * TEXT: Sort by the &#39;text&#39; attribute
	 */
	TEXT("TEXT");

	private String value;

	EMessageOrderByField(String value) {
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
	public static EMessageOrderByField fromValue(String value) {
		for (EMessageOrderByField b : EMessageOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
