
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchDeviceType
 */
public enum EBranchDeviceType {

	/**
	 * SIGN_PAD: A signature pad used to capture handwritten signatures
	 */
	SIGN_PAD("SIGN_PAD"),

	/**
	 * PRINTER: A printer
	 */
	PRINTER("PRINTER"),

	/**
	 * DOOR: A door that can be monitored or controlled
	 */
	DOOR("DOOR"),

	/**
	 * LOCK: A lock that can be opened or closed
	 */
	LOCK("LOCK"),

	/**
	 * INFO: A device that only displays information
	 */
	INFO("INFO"),

	/**
	 * EXTERNAL_APPLICATION: An external application controlled as if it were a device
	 */
	EXTERNAL_APPLICATION("EXTERNAL_APPLICATION"),

	/**
	 * DOOR_OPENER: A door opener that unlocks a door on request
	 */
	DOOR_OPENER("DOOR_OPENER"),

	/**
	 * STATUS_LAMP: A lamp indicating the current status of the Branch client
	 */
	STATUS_LAMP("STATUS_LAMP"),

	/**
	 * OTHER: A device that does not fall into any of the other categories
	 */
	OTHER("OTHER");

	private String value;

	EBranchDeviceType(String value) {
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
	public static EBranchDeviceType fromValue(String value) {
		for (EBranchDeviceType b : EBranchDeviceType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
