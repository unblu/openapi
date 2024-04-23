
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Order
 */
public enum Order {

	/**
	 * ASCENDING: Sort in the ascending order (smallest to largest, 0 to 9, and/or A to Z)
	 */
	ASCENDING("ASCENDING"),

	/**
	 * DESCENDING: Sort in the descending order (largest to smallest, 9 to 0, and/or Z to A)
	 */
	DESCENDING("DESCENDING");

	private String value;

	Order(String value) {
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
	public static Order fromValue(String value) {
		for (Order b : Order.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
