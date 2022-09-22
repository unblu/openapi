
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECannedResponseSearchFilterField
 */
public enum ECannedResponseSearchFilterField {

	/**
	 * KEY: Filter by the &#39;key&#39; attribute
	 */
	KEY("KEY"),

	/**
	 * TITLE: Filter by the &#39;title&#39; attribute
	 */
	TITLE("TITLE"),

	/**
	 * TEXT: Filter by the &#39;text&#39; attribute
	 */
	TEXT("TEXT"),

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Filter by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	ECannedResponseSearchFilterField(String value) {
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
	public static ECannedResponseSearchFilterField fromValue(String value) {
		for (ECannedResponseSearchFilterField b : ECannedResponseSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
