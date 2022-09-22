
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECannedResponseOrderByField
 */
public enum ECannedResponseOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * KEY: Sort by the &#39;key&#39; attribute
	 */
	KEY("KEY"),

	/**
	 * TITLE: Sort by the &#39;title&#39; attribute
	 */
	TITLE("TITLE"),

	/**
	 * TEXT: Sort by the &#39;text&#39; attribute
	 */
	TEXT("TEXT"),

	/**
	 * OWNER_TYPE: Sort by the &#39;ownerType&#39; attribute
	 */
	OWNER_TYPE("OWNER_TYPE"),

	/**
	 * OWNER_ID: Sort by the &#39;ownerId&#39; attribute
	 */
	OWNER_ID("OWNER_ID"),

	/**
	 * CREATION_TIMESTAMP: Sort by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Sort by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	ECannedResponseOrderByField(String value) {
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
	public static ECannedResponseOrderByField fromValue(String value) {
		for (ECannedResponseOrderByField b : ECannedResponseOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
