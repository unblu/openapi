
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ETemplateComponentParameterType
 */
public enum ETemplateComponentParameterType {

	/**
	 * CURRENCY: The parameter carries an amount of money together with its currency
	 */
	CURRENCY("CURRENCY"),

	/**
	 * DATE_TIME: The parameter carries a date and time
	 */
	DATE_TIME("DATE_TIME"),

	/**
	 * DOCUMENT: The parameter carries a document to attach
	 */
	DOCUMENT("DOCUMENT"),

	/**
	 * IMAGE: The parameter carries an image to attach
	 */
	IMAGE("IMAGE"),

	/**
	 * TEXT: The parameter carries a text that is substituted into the template
	 */
	TEXT("TEXT"),

	/**
	 * VIDEO: The parameter carries a video to attach
	 */
	VIDEO("VIDEO"),

	/**
	 * PAYLOAD: The parameter carries the payload a quick-reply button sends back when it is tapped. Only allowed for components of type
	 * &#x60;ETemplateComponentParametersType.BUTTON&#x60;
	 */
	PAYLOAD("PAYLOAD"),

	/**
	 * LOCATION: The parameter carries a geographic location
	 */
	LOCATION("LOCATION");

	private String value;

	ETemplateComponentParameterType(String value) {
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
	public static ETemplateComponentParameterType fromValue(String value) {
		for (ETemplateComponentParameterType b : ETemplateComponentParameterType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
