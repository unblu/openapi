
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECustomExternalMessengerChannelSearchFilterField
 */
public enum ECustomExternalMessengerChannelSearchFilterField {

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
	 * CONTACT_IDENTIFIER_FIELD_NAME: Filter by the &#39;contactIdentifierFieldName&#39; attribute
	 */
	CONTACT_IDENTIFIER_FIELD_NAME("CONTACT_IDENTIFIER_FIELD_NAME"),

	/**
	 * CONTACT_IDENTIFIER_FIELD_TYPE: Filter by the &#39;contactIdentifierFieldType&#39; attribute
	 */
	CONTACT_IDENTIFIER_FIELD_TYPE("CONTACT_IDENTIFIER_FIELD_TYPE");

	private String value;

	ECustomExternalMessengerChannelSearchFilterField(String value) {
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
	public static ECustomExternalMessengerChannelSearchFilterField fromValue(String value) {
		for (ECustomExternalMessengerChannelSearchFilterField b : ECustomExternalMessengerChannelSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
