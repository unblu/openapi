
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Possible Webhook Registration Status
 */
public enum ERegistrationStatus {

	/**
	 * ACTIVE: Registration is active
	 */
	ACTIVE("ACTIVE"),

	/**
	 * INACTIVE: Registration is not active
	 */
	INACTIVE("INACTIVE"),

	/**
	 * INACTIVE_UNAVAILABLE: Registration is not active, because it is unavailable
	 */
	INACTIVE_UNAVAILABLE("INACTIVE_UNAVAILABLE");

	private String value;

	ERegistrationStatus(String value) {
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
	public static ERegistrationStatus fromValue(String value) {
		for (ERegistrationStatus b : ERegistrationStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
