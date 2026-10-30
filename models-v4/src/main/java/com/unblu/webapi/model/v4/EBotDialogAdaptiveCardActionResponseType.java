
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBotDialogAdaptiveCardActionResponseType
 */
public enum EBotDialogAdaptiveCardActionResponseType {

	/**
	 * EMPTY: The action was received and the bot has nothing to return. The bot can react by calling the bot web API, for instance to send a message.
	 */
	EMPTY("EMPTY"),

	/**
	 * REPLACEMENT: The bot returns a card replacing the one the action was executed on. The Collaboration Server applies the card only for an
	 * &#x60;Action.Execute&#x60; action and ignores it otherwise.
	 */
	REPLACEMENT("REPLACEMENT");

	private String value;

	EBotDialogAdaptiveCardActionResponseType(String value) {
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
	public static EBotDialogAdaptiveCardActionResponseType fromValue(String value) {
		for (EBotDialogAdaptiveCardActionResponseType b : EBotDialogAdaptiveCardActionResponseType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
