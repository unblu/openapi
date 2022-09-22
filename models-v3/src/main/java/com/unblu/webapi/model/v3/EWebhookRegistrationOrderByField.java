
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EWebhookRegistrationOrderByField
 */
public enum EWebhookRegistrationOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * NAME: Sort by the &#39;name&#39; attribute
	 */
	NAME("NAME"),

	/**
	 * STATUS: Sort by the &#39;status&#39; attribute
	 */
	STATUS("STATUS"),

	/**
	 * DESCRIPTION: Sort by the &#39;description&#39; attribute
	 */
	DESCRIPTION("DESCRIPTION"),

	/**
	 * ENDPOINT: Sort by the &#39;endpoint&#39; attribute
	 */
	ENDPOINT("ENDPOINT"),

	/**
	 * API_VERSION: Sort by the &#39;apiVersion&#39; attribute
	 */
	API_VERSION("API_VERSION"),

	/**
	 * CREATION_TIMESTAMP: Sort by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Sort by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EWebhookRegistrationOrderByField(String value) {
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
	public static EWebhookRegistrationOrderByField fromValue(String value) {
		for (EWebhookRegistrationOrderByField b : EWebhookRegistrationOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
