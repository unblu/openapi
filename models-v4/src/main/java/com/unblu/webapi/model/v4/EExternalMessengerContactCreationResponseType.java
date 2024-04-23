
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of an &#x60;ExternalMessengerContact&#x60; creation response
 */
public enum EExternalMessengerContactCreationResponseType {

	/**
	 * USE_EXISTING: The request was successfully executed and an existing &#x60;ExternalMessengerContact&#x60; should be used
	 */
	USE_EXISTING("USE_EXISTING"),

	/**
	 * CREATE: The request was successfully executed and a new &#x60;ExternalMessengerContact&#x60; should be created
	 */
	CREATE("CREATE"),

	/**
	 * INVALID_CONTACT_IDENTIFIER: The contact identifier is invalid
	 */
	INVALID_CONTACT_IDENTIFIER("INVALID_CONTACT_IDENTIFIER"),

	/**
	 * CONTACT_TO_PERSON_MISMATCH: There is an existing contact for the contact identifier, but it doesn&#39;t match the person for whom the contact creation
	 * request was sent.
	 */
	CONTACT_TO_PERSON_MISMATCH("CONTACT_TO_PERSON_MISMATCH"),

	/**
	 * ERROR: The request failed to execute
	 */
	ERROR("ERROR");

	private String value;

	EExternalMessengerContactCreationResponseType(String value) {
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
	public static EExternalMessengerContactCreationResponseType fromValue(String value) {
		for (EExternalMessengerContactCreationResponseType b : EExternalMessengerContactCreationResponseType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
