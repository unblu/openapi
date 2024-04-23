
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of external messenger channel
 */
public enum EExternalMessengerChannelType {

	/**
	 * CUSTOM: A custom channel connected via REST and webhooks
	 */
	CUSTOM("CUSTOM"),

	/**
	 * WHATS_APP: A WhatsApp channel managed by the Collaboration Server
	 */
	WHATS_APP("WHATS_APP"),

	/**
	 * FACEBOOK: A Facebook channel managed by the Collaboration Server
	 */
	FACEBOOK("FACEBOOK"),

	/**
	 * SMS: An SMS channel managed by the Collaboration Server
	 */
	SMS("SMS");

	private String value;

	EExternalMessengerChannelType(String value) {
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
	public static EExternalMessengerChannelType fromValue(String value) {
		for (EExternalMessengerChannelType b : EExternalMessengerChannelType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
