
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EExternalMessengerContactSearchFilterField
 */
public enum EExternalMessengerContactSearchFilterField {

	/**
	 * ID: Filter by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * NAME: Filter by the &#39;name&#39; attribute
	 */
	NAME("NAME"),

	/**
	 * EXTERNAL_MESSENGER_CHANNEL_ID: Filter by the &#39;messengerChannelId&#39; attribute
	 */
	EXTERNAL_MESSENGER_CHANNEL_ID("EXTERNAL_MESSENGER_CHANNEL_ID"),

	/**
	 * SOURCE_ID: Filter by the &#39;sourceId&#39; attribute
	 */
	SOURCE_ID("SOURCE_ID"),

	/**
	 * PERSON_ID: Filter by the &#39;personId&#39; attribute
	 */
	PERSON_ID("PERSON_ID"),

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Filter by the &#39;modificationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EExternalMessengerContactSearchFilterField(String value) {
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
	public static EExternalMessengerContactSearchFilterField fromValue(String value) {
		for (EExternalMessengerContactSearchFilterField b : EExternalMessengerContactSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
