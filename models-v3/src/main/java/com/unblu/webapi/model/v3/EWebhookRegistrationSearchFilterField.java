
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EWebhookRegistrationSearchFilterField
 */
public enum EWebhookRegistrationSearchFilterField {

	/**
	 * NAME: Sort by the &#39;name&#39; attribute
	 */
	NAME("NAME"),

	/**
	 * DESCRIPTION: Sort by the &#39;description&#39; attribute
	 */
	DESCRIPTION("DESCRIPTION"),

	/**
	 * ENDPOINT: Sort by the &#39;endpoint&#39; attribute
	 */
	ENDPOINT("ENDPOINT"),

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Filter by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EWebhookRegistrationSearchFilterField(String value) {
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
	public static EWebhookRegistrationSearchFilterField fromValue(String value) {
		for (EWebhookRegistrationSearchFilterField b : EWebhookRegistrationSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
