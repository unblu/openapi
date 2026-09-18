
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EDeviceInfoOrderByField
 */
public enum EDeviceInfoOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * DEVICE_TYPE: Sort by the &#39;deviceType&#39; attribute
	 */
	DEVICE_TYPE("DEVICE_TYPE"),

	/**
	 * OS_NAME: Sort by the &#39;osName&#39; attribute
	 */
	OS_NAME("OS_NAME"),

	/**
	 * BROWSER_NAME: Sort by the &#39;browserName&#39; attribute
	 */
	BROWSER_NAME("BROWSER_NAME"),

	/**
	 * CREATION_TIMESTAMP: Sort by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * LAST_SEEN: Sort by the &#39;lastSeen&#39; attribute
	 */
	LAST_SEEN("LAST_SEEN");

	private String value;

	EDeviceInfoOrderByField(String value) {
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
	public static EDeviceInfoOrderByField fromValue(String value) {
		for (EDeviceInfoOrderByField b : EDeviceInfoOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
