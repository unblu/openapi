
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EUserOrderByField
 */
public enum EUserOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * FIRST_NAME: Sort by the &#39;firstName&#39; attribute
	 */
	FIRST_NAME("FIRST_NAME"),

	/**
	 * LAST_NAME: Sort by the &#39;lastName&#39; attribute
	 */
	LAST_NAME("LAST_NAME"),

	/**
	 * AUTHORIZATION_ROLE: Sort by the &#39;authorizationRole&#39; attribute
	 */
	AUTHORIZATION_ROLE("AUTHORIZATION_ROLE"),

	/**
	 * CREATION_TIMESTAMP: Sort by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Sort by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EUserOrderByField(String value) {
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
	public static EUserOrderByField fromValue(String value) {
		for (EUserOrderByField b : EUserOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
