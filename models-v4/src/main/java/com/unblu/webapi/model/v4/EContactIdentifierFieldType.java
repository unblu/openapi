
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of the contact identifier field. Used to improve the validation of user input when creating contacts.
 */
public enum EContactIdentifierFieldType {

	/**
	 * EMAIL: The contact identifier is an email address
	 */
	EMAIL("EMAIL"),

	/**
	 * PHONE_NUMBER: The contact identifier is a phone number
	 */
	PHONE_NUMBER("PHONE_NUMBER"),

	/**
	 * NUMBER: The contact identifier is a number
	 */
	NUMBER("NUMBER"),

	/**
	 * OTHER: The contact identifier is something else and will be handled as a plain string
	 */
	OTHER("OTHER");

	private String value;

	EContactIdentifierFieldType(String value) {
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
	public static EContactIdentifierFieldType fromValue(String value) {
		for (EContactIdentifierFieldType b : EContactIdentifierFieldType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
