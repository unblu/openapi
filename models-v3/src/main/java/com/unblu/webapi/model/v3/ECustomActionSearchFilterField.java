
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECustomActionSearchFilterField
 */
public enum ECustomActionSearchFilterField {

	/**
	 * KEY: Filter by the \&quot;key\&quot; attribute
	 */
	KEY("KEY");

	private String value;

	ECustomActionSearchFilterField(String value) {
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
	public static ECustomActionSearchFilterField fromValue(String value) {
		for (ECustomActionSearchFilterField b : ECustomActionSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
