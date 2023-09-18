
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EWebhookCallLogSearchFilterField
 */
public enum EWebhookCallLogSearchFilterField {

	/**
	 * EVENT_NAME: Filter by the &#39;eventName&#39; attribute
	 */
	EVENT_NAME("EVENT_NAME"),

	/**
	 * REGISTRATION_ID: Filter by the &#39;registrationId&#39; attribute
	 */
	REGISTRATION_ID("REGISTRATION_ID"),

	/**
	 * REQUEST_ID: Filter by the &#39;requestId&#39; attribute
	 */
	REQUEST_ID("REQUEST_ID"),

	/**
	 * EXECUTION_TIMESTAMP: Filter by the &#39;executionTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	EXECUTION_TIMESTAMP("EXECUTION_TIMESTAMP"),

	/**
	 * ENDPOINT: Filter by the &#39;endpoint&#39; attribute
	 */
	ENDPOINT("ENDPOINT"),

	/**
	 * RETRY_NR: Filter by the &#39;retryNr&#39; attribute
	 */
	RETRY_NR("RETRY_NR"),

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * HTTP_RESPONSE_CODE: Filter by the &#39;httpResponseCode&#39; attribute
	 */
	HTTP_RESPONSE_CODE("HTTP_RESPONSE_CODE");

	private String value;

	EWebhookCallLogSearchFilterField(String value) {
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
	public static EWebhookCallLogSearchFilterField fromValue(String value) {
		for (EWebhookCallLogSearchFilterField b : EWebhookCallLogSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
