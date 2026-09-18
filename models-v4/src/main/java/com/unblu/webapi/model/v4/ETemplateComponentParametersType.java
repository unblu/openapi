
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ETemplateComponentParametersType
 */
public enum ETemplateComponentParametersType {

	/**
	 * HEADER: Parameters for the header of the template
	 */
	HEADER("HEADER"),

	/**
	 * BODY: Parameters for the body of the template
	 */
	BODY("BODY"),

	/**
	 * BUTTON: Parameters for a button of the template
	 */
	BUTTON("BUTTON"),

	/**
	 * CAROUSEL: Parameters for the carousel of the template
	 */
	CAROUSEL("CAROUSEL");

	private String value;

	ETemplateComponentParametersType(String value) {
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
	public static ETemplateComponentParametersType fromValue(String value) {
		for (ETemplateComponentParametersType b : ETemplateComponentParametersType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
