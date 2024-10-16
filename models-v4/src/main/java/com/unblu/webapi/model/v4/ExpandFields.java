
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ExpandFields
 */
public enum ExpandFields {

	ACTIONICON("actionIcon"),

	AVATAR("avatar"),

	CHANNELICON("channelIcon"),

	CONFIGURATION("configuration"),

	METADATA("metadata"),

	TEXT("text");

	private String value;

	ExpandFields(String value) {
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
	public static ExpandFields fromValue(String value) {
		for (ExpandFields b : ExpandFields.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
