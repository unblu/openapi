
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EDeviceInfoSearchFilterField
 */
public enum EDeviceInfoSearchFilterField {

	/**
	 * DEVICE_TYPE: Filter by the &#39;deviceType&#39; attribute
	 */
	DEVICE_TYPE("DEVICE_TYPE"),

	/**
	 * OS_NAME: Filter by the &#39;osName&#39; attribute
	 */
	OS_NAME("OS_NAME"),

	/**
	 * BROWSER_NAME: Filter by the &#39;browserName&#39; attribute
	 */
	BROWSER_NAME("BROWSER_NAME"),

	/**
	 * OWNER_PERSON_ID: Filter by the &#39;ownerPersonId&#39; attribute
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
