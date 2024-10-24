
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ETemplateComponentParemetersType
 */
public enum ETemplateComponentParemetersType {

	/**
	 * HEADER
	 */
	HEADER("HEADER"),

	/**
	 * BODY
	 */
	BODY("BODY"),

	/**
	 * BUTTON
	 */
	BUTTON("BUTTON"),

	/**
	 * CAROUSEL
	 */
	CAROUSEL("CAROUSEL");

	private String value;

	ETemplateComponentParemetersType(String value) {
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
	public static ETemplateComponentParemetersType fromValue(String value) {
		for (ETemplateComponentParemetersType b : ETemplateComponentParemetersType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
