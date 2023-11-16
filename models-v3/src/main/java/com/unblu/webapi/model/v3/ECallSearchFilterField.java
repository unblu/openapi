
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECallSearchFilterField
 */
public enum ECallSearchFilterField {

	/**
	 * CONVERSATION_ID: Filter by the &#39;creationTimestamp&#39; attribute
	 */
	CONVERSATION_ID("CONVERSATION_ID"),

	/**
	 * SERVICE_PROVIDER_TYPE: Filter by the &#39;serviceProviderType&#39; attribute
	 */
	SERVICE_PROVIDER_TYPE("SERVICE_PROVIDER_TYPE"),

	/**
	 * SERVICE_PROVIDER_CALL_ID: Filter by the &#39;serviceProviderCallId&#39; attribute
	 */
	SERVICE_PROVIDER_CALL_ID("SERVICE_PROVIDER_CALL_ID"),

	/**
	 * INITIATION_TIMESTAMP: Filter by the &#39;initiationTimestamp&#39; attribute
	 */
	INITIATION_TIMESTAMP("INITIATION_TIMESTAMP"),

	/**
	 * ACCEPT_TIMESTAMP: Filter by the &#39;acceptTimestamp&#39; attribute
	 */
	ACCEPT_TIMESTAMP("ACCEPT_TIMESTAMP"),

	/**
	 * ESTABLISHED_TIMESTAMP: Filter by the &#39;establishedTimestamp&#39; attribute
	 */
	ESTABLISHED_TIMESTAMP("ESTABLISHED_TIMESTAMP"),

	/**
	 * END_TIMESTAMP: Filter by the &#39;endTimestamp&#39; attribute
	 */
	END_TIMESTAMP("END_TIMESTAMP"),

	/**
	 * INITIATOR_PERSON_ID: Filter by the &#39;initiatorPersonId&#39; attribute
	 */
	INITIATOR_PERSON_ID("INITIATOR_PERSON_ID");

	private String value;

	ECallSearchFilterField(String value) {
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
	public static ECallSearchFilterField fromValue(String value) {
		for (ECallSearchFilterField b : ECallSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
