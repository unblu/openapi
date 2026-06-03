
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchDeviceType
 */
public enum EBranchDeviceType {

	/**
	 * SIGN_PAD
	 */
	SIGN_PAD("SIGN_PAD"),

	/**
	 * PRINTER
	 */
	PRINTER("PRINTER"),

	/**
	 * DOOR
	 */
	DOOR("DOOR"),

	/**
	 * LOCK
	 */
	LOCK("LOCK"),

	/**
	 * INFO
	 */
	INFO("INFO"),

	/**
	 * EXTERNAL_APPLICATION
	 */
	EXTERNAL_APPLICATION("EXTERNAL_APPLICATION"),

	/**
	 * DOOR_OPENER
	 */
	DOOR_OPENER("DOOR_OPENER"),

	/**
	 * STATUS_LAMP
	 */
	STATUS_LAMP("STATUS_LAMP"),

	/**
	 * OTHER
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
