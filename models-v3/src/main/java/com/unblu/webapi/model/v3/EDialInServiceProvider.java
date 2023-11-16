
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EDialInServiceProvider
 */
public enum EDialInServiceProvider {

	/**
	 * VONAGE: The dial-in service was provided via VONAGE
	 */
	VONAGE("VONAGE");

	private String value;

	EDialInServiceProvider(String value) {
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
	public static EDialInServiceProvider fromValue(String value) {
		for (EDialInServiceProvider b : EDialInServiceProvider.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
