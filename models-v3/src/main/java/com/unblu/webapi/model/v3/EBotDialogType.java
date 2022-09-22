
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of a bot dialog
 */
public enum EBotDialogType {

	/**
	 * ONBOARDING
	 */
	ONBOARDING("ONBOARDING"),

	/**
	 * REBOARDING
	 */
	REBOARDING("REBOARDING"),

	/**
	 * OFFBOARDING
	 */
	OFFBOARDING("OFFBOARDING");

	private String value;

	EBotDialogType(String value) {
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
	public static EBotDialogType fromValue(String value) {
		for (EBotDialogType b : EBotDialogType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
