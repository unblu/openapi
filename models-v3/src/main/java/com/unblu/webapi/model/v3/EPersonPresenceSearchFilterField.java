
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EPersonPresenceSearchFilterField
 */
public enum EPersonPresenceSearchFilterField {

	/**
	 * JOINED_TIMESTAMP: Filter by the &#39;joinedTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	JOINED_TIMESTAMP("JOINED_TIMESTAMP"),

	/**
	 * LEFT_TIMESTAMP: Filter by the &#39;leftTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	LEFT_TIMESTAMP("LEFT_TIMESTAMP"),

	/**
	 * PERSON_ID: Filter by the &#39;personId&#39; attribute
	 */
	PERSON_ID("PERSON_ID");

	private String value;

	EPersonPresenceSearchFilterField(String value) {
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
	public static EPersonPresenceSearchFilterField fromValue(String value) {
		for (EPersonPresenceSearchFilterField b : EPersonPresenceSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
