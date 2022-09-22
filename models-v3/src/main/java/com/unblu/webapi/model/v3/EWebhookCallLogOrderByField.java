
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EWebhookCallLogOrderByField
 */
public enum EWebhookCallLogOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * EVENT_NAME: Sort by the &#39;eventName&#39; attribute
	 */
	EVENT_NAME("EVENT_NAME"),

	/**
	 * REGISTRATION_ID: Sort by the &#39;registrationId&#39; attribute
	 */
	REGISTRATION_ID("REGISTRATION_ID"),

	/**
	 * REQUEST_ID: Sort by the &#39;requestId&#39; attribute
	 */
	REQUEST_ID("REQUEST_ID"),

	/**
	 * EXECUTION_TIMESTAMP: Sort by the &#39;executionTimestamp&#39; attribute
	 */
	EXECUTION_TIMESTAMP("EXECUTION_TIMESTAMP"),

	/**
	 * ENDPOINT: Sort by the &#39;endpoint&#39; attribute
	 */
	ENDPOINT("ENDPOINT"),

	/**
	 * RETRY_NR: Sort by the &#39;retryNr&#39; attribute
	 */
	RETRY_NR("RETRY_NR"),

	/**
	 * CALL_ID: Sort by the &#39;callId&#39; attribute
	 */
	CALL_ID("CALL_ID"),

	/**
	 * CREATION_TIMESTAMP: Sort by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Sort by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EWebhookCallLogOrderByField(String value) {
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
	public static EWebhookCallLogOrderByField fromValue(String value) {
		for (EWebhookCallLogOrderByField b : EWebhookCallLogOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
