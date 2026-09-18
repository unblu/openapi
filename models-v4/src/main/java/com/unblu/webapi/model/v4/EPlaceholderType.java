
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EPlaceholderType
 */
public enum EPlaceholderType {

	/**
	 * TEXT: The agent fills the placeholder with free text
	 */
	TEXT("TEXT"),

	/**
	 * MULTIPLE_CHOICE: The agent fills the placeholder by picking one of the predefined values
	 */
	MULTIPLE_CHOICE("MULTIPLE_CHOICE");

	private String value;

	EPlaceholderType(String value) {
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
	public static EPlaceholderType fromValue(String value) {
		for (EPlaceholderType b : EPlaceholderType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
