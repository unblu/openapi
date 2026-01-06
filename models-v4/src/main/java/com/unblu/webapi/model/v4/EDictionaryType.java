
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of dictionary
 */
public enum EDictionaryType {

	/**
	 * HUNSPELL: HUNSPELL: Dictionary in Hunspell format
	 */
	HUNSPELL("HUNSPELL");

	private String value;

	EDictionaryType(String value) {
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
	public static EDictionaryType fromValue(String value) {
		for (EDictionaryType b : EDictionaryType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
