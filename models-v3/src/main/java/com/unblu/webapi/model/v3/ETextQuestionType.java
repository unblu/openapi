
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of a question message. Defines the reply value of a text message.
 */
public enum ETextQuestionType {

	/**
	 * SHORT_TEXT: Reply should only be a short text.
	 */
	SHORT_TEXT("SHORT_TEXT"),

	/**
	 * LONG_TEXT: Reply can be be a long text. Visually displayed with a larger input field.
	 */
	LONG_TEXT("LONG_TEXT"),

	/**
	 * URL: Reply has to be a URL
	 */
	URL("URL"),

	/**
	 * EMAIL: Reply has to be a mail address
	 */
	EMAIL("EMAIL"),

	/**
	 * PHONE: Reply has to be a phone number
	 */
	PHONE("PHONE"),

	/**
	 * DATE: Reply has to be a date
	 */
	DATE("DATE"),

	/**
	 * TIME: Reply has to be a time
	 */
	TIME("TIME"),

	/**
	 * DATETIME: Reply has to be a date and a time
	 */
	DATETIME("DATETIME"),

	/**
	 * NUMBER: Reply has to be a number
	 */
	NUMBER("NUMBER");

	private String value;

	ETextQuestionType(String value) {
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
	public static ETextQuestionType fromValue(String value) {
		for (ETextQuestionType b : ETextQuestionType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
