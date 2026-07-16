
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EDeviceInfoSearchFilterField
 */
public enum EDeviceInfoSearchFilterField {

	/**
	 * DEVICE_TYPE
	 */
	DEVICE_TYPE("DEVICE_TYPE"),

	/**
	 * OS_NAME
	 */
	OS_NAME("OS_NAME"),

	/**
	 * BROWSER_NAME
	 */
	BROWSER_NAME("BROWSER_NAME"),

	/**
	 * OWNER_PERSON_ID
	 */
	OWNER_PERSON_ID("OWNER_PERSON_ID");

	private String value;

	EDeviceInfoSearchFilterField(String value) {
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
	public static EDeviceInfoSearchFilterField fromValue(String value) {
		for (EDeviceInfoSearchFilterField b : EDeviceInfoSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
