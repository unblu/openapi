
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ERecordingOrderByField
 */
public enum ERecordingOrderByField {

	/**
	 * START_TIMESTAMP: Sort by the &#39;startTimestamp&#39; attribute
	 */
	START_TIMESTAMP("START_TIMESTAMP"),

	/**
	 * END_TIMESTAMP: Sort by the &#39;endTimestamp&#39; attribute
	 */
	END_TIMESTAMP("END_TIMESTAMP");

	private String value;

	ERecordingOrderByField(String value) {
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
	public static ERecordingOrderByField fromValue(String value) {
		for (ERecordingOrderByField b : ERecordingOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
