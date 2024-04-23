
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ECustomActionOrderByField
 */
public enum ECustomActionOrderByField {

	/**
	 * ID: Sort by the &#39;ID&#39; attribute
	 */
	ID("ID"),

	/**
	 * KEY: Sort by the &#39;key&#39; attribute
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
