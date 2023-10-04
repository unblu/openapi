
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Location where a webhook event can be registered.
 */
public enum ERegistrationLocation {

	/**
	 * WEBHOOK_REGISTRATION
	 */
	WEBHOOK_REGISTRATION("WEBHOOK_REGISTRATION"),

	/**
	 * BOT
	 */
	BOT("BOT"),

	/**
	 * EXTERNAL_MESSENGER
	 */
	EXTERNAL_MESSENGER("EXTERNAL_MESSENGER"),

	/**
	 * EXTERNAL_MESSAGE_INTERCEPTOR
	 */
	EXTERNAL_MESSAGE_INTERCEPTOR("EXTERNAL_MESSAGE_INTERCEPTOR"),

	/**
	 * CUSTOM_ACTION
	 */
	CUSTOM_ACTION("CUSTOM_ACTION"),

	/**
	 * SUGGESTION_SOURCE
	 */
	SUGGESTION_SOURCE("SUGGESTION_SOURCE"),

	/**
	 * FILE_UPLOAD_INTERCEPTOR
	 */
	FILE_UPLOAD_INTERCEPTOR("FILE_UPLOAD_INTERCEPTOR");

	private String value;

	ERegistrationLocation(String value) {
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
	public static ERegistrationLocation fromValue(String value) {
		for (ERegistrationLocation b : ERegistrationLocation.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
