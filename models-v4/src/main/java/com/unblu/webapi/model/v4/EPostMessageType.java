
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of a message which is send to the collaboration server
 */
public enum EPostMessageType {

	/**
	 * TEXT: See &#x60;TextPostMessageData&#x60;
	 */
	TEXT("TEXT"),

	/**
	 * FILE: See &#x60;FilePostMessageData&#x60;
	 */
	FILE("FILE"),

	/**
	 * CARD: See &#x60;CardPostMessageData&#x60;
	 */
	CARD("CARD"),

	/**
	 * LIST: See &#x60;ListPostMessageData&#x60;
	 */
	LIST("LIST"),

	/**
	 * MULTICHOICE_QUESTION: See &#x60;MultichoiceQuestionPostMessageData&#x60;
	 */
	MULTICHOICE_QUESTION("MULTICHOICE_QUESTION"),

	/**
	 * RATING_QUESTION: See &#x60;RatingQuestionPostMessageData&#x60;
	 */
	RATING_QUESTION("RATING_QUESTION"),

	/**
	 * TEXT_QUESTION: See &#x60;TextQuestionPostMessageData&#x60;
	 */
	TEXT_QUESTION("TEXT_QUESTION"),

	/**
	 * REPLY: See &#x60;ReplyPostMessageData&#x60;
	 */
	REPLY("REPLY"),

	/**
	 * WHATS_APP_TEMPLATE: See &#x60;WhatsAppTemplatePostMessageData&#x60;
	 */
	WHATS_APP_TEMPLATE("WHATS_APP_TEMPLATE");

	private String value;

	EPostMessageType(String value) {
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
	public static EPostMessageType fromValue(String value) {
		for (EPostMessageType b : EPostMessageType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
