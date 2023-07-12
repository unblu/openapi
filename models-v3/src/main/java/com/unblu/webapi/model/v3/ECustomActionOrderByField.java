
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECustomActionOrderByField
 */
public enum ECustomActionOrderByField {

	/**
	 * ID: Sort by the \&quot;ID\&quot; attribute
	 */
	ID("ID"),

	/**
	 * KEY: Sort by the \&quot;key\&quot; attribute
	 */
	KEY("KEY");

	private String value;

	ECustomActionOrderByField(String value) {
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
	public static ECustomActionOrderByField fromValue(String value) {
		for (ECustomActionOrderByField b : ECustomActionOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
