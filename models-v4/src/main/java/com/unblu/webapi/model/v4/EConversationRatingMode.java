
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * How the result of a rating question message affects the conversation rating.
 */
public enum EConversationRatingMode {

	/**
	 * NONE: The rating result does not affect the conversation rating.
	 */
	NONE("NONE"),

	/**
	 * OVERRIDE: The rating result overrides the conversation rating.
	 */
	OVERRIDE("OVERRIDE");

	private String value;

	EConversationRatingMode(String value) {
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
	public static EConversationRatingMode fromValue(String value) {
		for (EConversationRatingMode b : EConversationRatingMode.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
