
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EChatSuggestionType
 */
public enum EChatSuggestionType {

	/**
	 * MANUAL: The suggestion was requested explicitly by the agent
	 */
	MANUAL("MANUAL"),

	/**
	 * AUTOMATIC: The suggestion was produced automatically as the conversation progressed
	 */
	AUTOMATIC("AUTOMATIC");

	private String value;

	EChatSuggestionType(String value) {
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
	public static EChatSuggestionType fromValue(String value) {
		for (EChatSuggestionType b : EChatSuggestionType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
