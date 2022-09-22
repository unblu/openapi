
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of the external messenger channel
 */
public enum EExternalMessengerChannelType {

	/**
	 * CUSTOM: Custom channel which is connected via rest and webhooks
	 */
	CUSTOM("CUSTOM"),

	/**
	 * WHATS_APP: WhatsApp channel which is managed by the collaboration server
	 */
	WHATS_APP("WHATS_APP"),

	/**
	 * FACEBOOK: Facebook channel which is managed by the collaboration server
	 */
	FACEBOOK("FACEBOOK");

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
