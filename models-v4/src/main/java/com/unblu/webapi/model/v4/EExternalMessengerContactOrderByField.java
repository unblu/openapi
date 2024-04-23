
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EExternalMessengerContactOrderByField
 */
public enum EExternalMessengerContactOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * NAME: Sort by the &#39;name&#39; attribute
	 */
	NAME("NAME"),

	/**
	 * EXTERNAL_MESSENGER_CHANNEL_ID: Sort by the &#39;messengerChannelId&#39; attribute
	 */
	EXTERNAL_MESSENGER_CHANNEL_ID("EXTERNAL_MESSENGER_CHANNEL_ID"),

	/**
	 * SOURCE_ID: Sort by the &#39;sourceId&#39; attribute
	 */
	SOURCE_ID("SOURCE_ID"),

	/**
	 * PERSON_ID: Sort by the &#39;personId&#39; attribute
	 */
	PERSON_ID("PERSON_ID"),

	/**
	 * CREATION_TIMESTAMP: Sort by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Sort by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EExternalMessengerContactOrderByField(String value) {
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
	public static EExternalMessengerContactOrderByField fromValue(String value) {
		for (EExternalMessengerContactOrderByField b : EExternalMessengerContactOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
