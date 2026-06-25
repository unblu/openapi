
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ETemplateComponentParametersSubType
 */
public enum ETemplateComponentParametersSubType {

	/**
	 * QUICK_REPLY
	 */
	QUICK_REPLY("QUICK_REPLY"),

	/**
	 * URL
	 */
	URL("URL"),

	/**
	 * CATALOG
	 */
	CATALOG("CATALOG");

	private String value;

	ETemplateComponentParametersSubType(String value) {
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
	public static ETemplateComponentParametersSubType fromValue(String value) {
		for (ETemplateComponentParametersSubType b : ETemplateComponentParametersSubType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
