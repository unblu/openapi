
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * An enumeration of the possible statuses a bot can be in inside a bot dialog.&lt;br&gt; A bot thread can consist of multiple bots for which each bot has its
 * own bot dialog.
 */
public enum EBotDialogStatus {

	/**
	 * DIALOG_OFFER_ACCEPTED: The bot accepted the dialog offer, but it hasn&#39;t yet opened the dialog. &lt;p&gt; This is the initial state for a bot in a bot
	 * thread.
	 */
	DIALOG_OFFER_ACCEPTED("DIALOG_OFFER_ACCEPTED"),

	/**
	 * DIALOG_OPEN: The bot has already opened the dialog
	 */
	DIALOG_OPEN("DIALOG_OPEN"),

	/**
	 * DIALOG_CLOSED: The bot has closed the dialog (either through a dialog close event or an error)
	 */
	DIALOG_CLOSED("DIALOG_CLOSED");

	private String value;

	EBotDialogStatus(String value) {
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
	public static EBotDialogStatus fromValue(String value) {
		for (EBotDialogStatus b : EBotDialogStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
