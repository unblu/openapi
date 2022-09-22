
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * State of the global server license
 */
public enum ELicenseState {

	/**
	 * NO_LICENSE: No license installed. All licensed features can not be used.
	 */
	NO_LICENSE("NO_LICENSE"),

	/**
	 * ACTIVE: Valid license installed, this default state to use Unblu.
	 */
	ACTIVE("ACTIVE"),

	/**
	 * INVALID: Invalid license installed. All licensed features can not be used.
	 */
	INVALID("INVALID"),

	/**
	 * INCOMPATIBLE: The license type of the installed license is not compatible with this server. All licensed features can not be used.
	 */
	INCOMPATIBLE("INCOMPATIBLE"),

	/**
	 * EXPIRED: Valid license installed, but with an expiration date in the past. All licensed features can not be used.
	 */
	EXPIRED("EXPIRED");

	private String value;

	ELicenseState(String value) {
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
	public static ELicenseState fromValue(String value) {
		for (ELicenseState b : ELicenseState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
