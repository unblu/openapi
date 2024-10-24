
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ETemplateComponentParameterType
 */
public enum ETemplateComponentParameterType {

	/**
	 * CURRENCY
	 */
	CURRENCY("CURRENCY"),

	/**
	 * DATE_TIME
	 */
	DATE_TIME("DATE_TIME"),

	/**
	 * DOCUMENT
	 */
	DOCUMENT("DOCUMENT"),

	/**
	 * IMAGE
	 */
	IMAGE("IMAGE"),

	/**
	 * TEXT
	 */
	TEXT("TEXT"),

	/**
	 * VIDEO
	 */
	VIDEO("VIDEO"),

	/**
	 * PAYLOAD: Only allowed for components of type &#x60;ETemplateComponentParemetersType.BUTTON&#x60;
	 */
	PAYLOAD("PAYLOAD"),

	/**
	 * LOCATION
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
