
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The message type of a conversation message
 */
public enum EMessageType {

	/**
	 * TEXT
	 */
	TEXT("TEXT"),

	/**
	 * SYSTEM
	 */
	SYSTEM("SYSTEM"),

	/**
	 * FILE
	 */
	FILE("FILE"),

	/**
	 * CARD
	 */
	CARD("CARD"),

	/**
	 * LIST
	 */
	LIST("LIST"),

	/**
	 * APPROVAL_REQUEST
	 */
	APPROVAL_REQUEST("APPROVAL_REQUEST"),

	/**
	 * MULTICHOICE_QUESTION
	 */
	MULTICHOICE_QUESTION("MULTICHOICE_QUESTION"),

	/**
	 * RATING_QUESTION
	 */
	RATING_QUESTION("RATING_QUESTION"),

	/**
	 * TEXT_QUESTION
	 */
	TEXT_QUESTION("TEXT_QUESTION"),

	/**
	 * REPLY
	 */
	REPLY("REPLY"),

	/**
	 * QUESTION_ABORTED
	 */
	QUESTION_ABORTED("QUESTION_ABORTED"),

	/**
	 * RECORDING_AVAILABLE
	 */
	RECORDING_AVAILABLE("RECORDING_AVAILABLE"),

	/**
	 * WHATSAPP_TEMPLATE
	 */
	WHATSAPP_TEMPLATE("WHATSAPP_TEMPLATE");

	private String value;

	EMessageType(String value) {
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
	public static EMessageType fromValue(String value) {
		for (EMessageType b : EMessageType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
