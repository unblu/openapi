
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAbbreviationEntrySearchFilterField
 */
public enum EAbbreviationEntrySearchFilterField {

	/**
	 * ABBREVIATION: Filter by the &#39;abbreviation&#39; attribute
	 */
	ABBREVIATION("ABBREVIATION"),

	/**
	 * EXPANSION: Filter by the &#39;expansion&#39; attribute
	 */
	EXPANSION("EXPANSION"),

	/**
	 * LANGUAGE: Filter by the &#39;language&#39; attribute
	 */
	LANGUAGE("LANGUAGE"),

	/**
	 * CASE_SENSITIVE: Filter by the &#39;caseSensitive&#39; attribute
	 */
	CASE_SENSITIVE("CASE_SENSITIVE"),

	/**
	 * OWNER_ID: Filter by the &#39;ownerId&#39; attribute
	 */
	OWNER_ID("OWNER_ID"),

	/**
	 * OWNER_TYPE: Filter by the &#39;ownerType&#39; attribute
	 */
	OWNER_TYPE("OWNER_TYPE"),

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Filter by the &#39;modificationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EAbbreviationEntrySearchFilterField(String value) {
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
	public static EAbbreviationEntrySearchFilterField fromValue(String value) {
		for (EAbbreviationEntrySearchFilterField b : EAbbreviationEntrySearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
