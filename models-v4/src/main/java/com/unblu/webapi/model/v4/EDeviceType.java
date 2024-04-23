
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The device type of the physical device
 */
public enum EDeviceType {

	/**
	 * MOBILE: Mobile phone / tablet / etc
	 */
	MOBILE("MOBILE"),

	/**
	 * DESKTOP: Desktop computer
	 */
	DESKTOP("DESKTOP");

	private String value;

	EDeviceType(String value) {
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
	public static EDeviceType fromValue(String value) {
		for (EDeviceType b : EDeviceType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
