
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EMessageSearchFilterField
 */
public enum EMessageSearchFilterField {

	/**
	 * SEND_TIMESTAMP: Filter by the &#39;sendTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	SEND_TIMESTAMP("SEND_TIMESTAMP");

	private String value;

	EMessageSearchFilterField(String value) {
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
	public static EMessageSearchFilterField fromValue(String value) {
		for (EMessageSearchFilterField b : EMessageSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
