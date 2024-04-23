
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of a external messenger conversation creation response
 */
public enum EExternalMessengerConversationCreationResponseType {

	/**
	 * USE_EXISTING: The request was successfully executed and an existing conversation should be used.
	 */
	USE_EXISTING("USE_EXISTING"),

	/**
	 * CREATE: The request was successfully executed and a new conversation should be created.
	 */
	CREATE("CREATE"),

	/**
	 * ERROR: The request failed to execute
	 */
	ERROR("ERROR");

	private String value;

	EExternalMessengerConversationCreationResponseType(String value) {
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
	public static EExternalMessengerConversationCreationResponseType fromValue(String value) {
		for (EExternalMessengerConversationCreationResponseType b : EExternalMessengerConversationCreationResponseType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
