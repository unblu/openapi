
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECallOrderByField
 */
public enum ECallOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * CONVERSATION_ID: Sort by the &#39;conversationId&#39; attribute
	 */
	CONVERSATION_ID("CONVERSATION_ID"),

	/**
	 * INITIATION_TIMESTAMP: Sort by the &#39;initiationTimestamp&#39; attribute
	 */
	INITIATION_TIMESTAMP("INITIATION_TIMESTAMP"),

	/**
	 * ACCEPT_TIMESTAMP: Sort by the &#39;acceptTimestamp&#39; attribute
	 */
	ACCEPT_TIMESTAMP("ACCEPT_TIMESTAMP"),

	/**
	 * ESTABLISHED_TIMESTAMP: Sort by the &#39;establishedTimestamp&#39; attribute
	 */
	ESTABLISHED_TIMESTAMP("ESTABLISHED_TIMESTAMP"),

	/**
	 * END_TIMESTAMP: Sort by the &#39;endTimestamp&#39; attribute
	 */
	END_TIMESTAMP("END_TIMESTAMP");

	private String value;

	ECallOrderByField(String value) {
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
	public static ECallOrderByField fromValue(String value) {
		for (ECallOrderByField b : ECallOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
