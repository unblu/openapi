
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reason why a bot finished a dialog.
 */
public enum EBotDialogFinishReason {

	/**
	 * HAND_OFF: The bot is done with his part and the next bot can to the on-, re- or offboarding.
	 */
	HAND_OFF("HAND_OFF"),

	/**
	 * SOLVED: The problem of the dialog was solved and therefore no further bots are invoked.
	 */
	SOLVED("SOLVED"),

	/**
	 * ABORTED: The dialog was not successful and the on-, re- or offboarding has to be aborted.
	 */
	ABORTED("ABORTED");

	private String value;

	EBotDialogFinishReason(String value) {
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
	public static EBotDialogFinishReason fromValue(String value) {
		for (EBotDialogFinishReason b : EBotDialogFinishReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
