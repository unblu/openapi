
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EChatSuggestionResponseType
 */
public enum EChatSuggestionResponseType {

	/**
	 * EMPTY
	 */
	EMPTY("EMPTY"),

	/**
	 * TEXT
	 */
	TEXT("TEXT");

	private String value;

	EChatSuggestionResponseType(String value) {
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
	public static EChatSuggestionResponseType fromValue(String value) {
		for (EChatSuggestionResponseType b : EChatSuggestionResponseType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
