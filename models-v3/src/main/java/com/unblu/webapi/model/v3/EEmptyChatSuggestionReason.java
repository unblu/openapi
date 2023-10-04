
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EEmptyChatSuggestionReason
 */
public enum EEmptyChatSuggestionReason {

	/**
	 * NO_SUGGESTION
	 */
	NO_SUGGESTION("NO_SUGGESTION"),

	/**
	 * NOT_AVAILABLE
	 */
	NOT_AVAILABLE("NOT_AVAILABLE"),

	/**
	 * OTHER
	 */
	OTHER("OTHER");

	private String value;

	EEmptyChatSuggestionReason(String value) {
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
	public static EEmptyChatSuggestionReason fromValue(String value) {
		for (EEmptyChatSuggestionReason b : EEmptyChatSuggestionReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
