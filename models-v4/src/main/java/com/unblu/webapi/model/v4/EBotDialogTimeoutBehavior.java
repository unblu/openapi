
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines what should happen with the conversation when it comes to timeout during on-boarding.&lt;br&gt; When omitted the default for external bots is set to
 * HAND_OFF.
 */
public enum EBotDialogTimeoutBehavior {

	/**
	 * ABORT: Abort on-boarding the conversation when it comes to timeout. Default for internal bots.
	 */
	ABORT("ABORT"),

	/**
	 * HAND_OFF: Proceed further in on-boarding the conversation when it comes to timeout. Default for external bots.
	 */
	HAND_OFF("HAND_OFF");

	private String value;

	EBotDialogTimeoutBehavior(String value) {
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
	public static EBotDialogTimeoutBehavior fromValue(String value) {
		for (EBotDialogTimeoutBehavior b : EBotDialogTimeoutBehavior.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
