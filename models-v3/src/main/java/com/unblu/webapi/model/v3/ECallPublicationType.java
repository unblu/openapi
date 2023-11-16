
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of publication the call participant is using
 */
public enum ECallPublicationType {

	/**
	 * DIAL_IN: The participant is publishing their audio content through a call dial in
	 */
	DIAL_IN("DIAL_IN"),

	/**
	 * MEDIA: The participant is publishing their media content (audio or audio and video) through the computer
	 */
	MEDIA("MEDIA");

	private String value;

	ECallPublicationType(String value) {
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
	public static ECallPublicationType fromValue(String value) {
		for (ECallPublicationType b : ECallPublicationType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
