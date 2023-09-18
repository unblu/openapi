
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ENamedAreaSearchFilterField
 */
public enum ENamedAreaSearchFilterField {

	/**
	 * NAME: Filter by the &#39;name&#39; attribute
	 */
	NAME("NAME"),

	/**
	 * DESCRIPTION: Filter by the &#39;description&#39; attribute
	 */
	DESCRIPTION("DESCRIPTION"),

	/**
	 * SITE_ID: Filter by the &#39;siteId&#39; attribute
	 */
	SITE_ID("SITE_ID"),

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Filter by the &#39;modificationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	ENamedAreaSearchFilterField(String value) {
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
	public static ENamedAreaSearchFilterField fromValue(String value) {
		for (ENamedAreaSearchFilterField b : ENamedAreaSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
