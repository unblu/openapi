
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of a contact information
 */
public enum EContactType {

	/**
	 * UNKNOWN_PHONE: Any phone number (fixnet, mobile,...)
	 */
	UNKNOWN_PHONE("UNKNOWN_PHONE"),

	/**
	 * MOBILE_PHONE: Mobile phone number
	 */
	MOBILE_PHONE("MOBILE_PHONE"),

	/**
	 * FIXNET_PHONE: Fixnet phone number
	 */
	FIXNET_PHONE("FIXNET_PHONE"),

	/**
	 * EMAIL: email address
	 */
	EMAIL("EMAIL"),

	/**
	 * URL: Url (e.g. company homepage url)
	 */
	URL("URL");

	private String value;

	EContactType(String value) {
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
	public static EContactType fromValue(String value) {
		for (EContactType b : EContactType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
