
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ESmsExternalMessengerChannelSearchFilterField
 */
public enum ESmsExternalMessengerChannelSearchFilterField {

	/**
	 * NAME: Filter by the &#39;name&#39; attribute
	 */
	NAME("NAME"),

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Filter by the &#39;modificationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP"),

	/**
	 * ACCOUNT_SID: Filter by the &#39;accountSid&#39; attribute of the SMS external messenger channel
	 */
	ACCOUNT_SID("ACCOUNT_SID"),

	/**
	 * PHONE_NUMBER: Filter by the &#39;phoneNumber&#39; attribute of the SMS external messenger channel
	 */
	PHONE_NUMBER("PHONE_NUMBER");

	private String value;

	ESmsExternalMessengerChannelSearchFilterField(String value) {
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
	public static ESmsExternalMessengerChannelSearchFilterField fromValue(String value) {
		for (ESmsExternalMessengerChannelSearchFilterField b : ESmsExternalMessengerChannelSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
