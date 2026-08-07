
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAriaAgenticFlowDataContentType
 */
public enum EAriaAgenticFlowDataContentType {

	/**
	 * MULTIFLOW
	 */
	MULTIFLOW("MULTIFLOW"),

	/**
	 * SINGLE_FLOW
	 */
	SINGLE_FLOW("SINGLE_FLOW"),

	/**
	 * SUGGESTION_SOURCE
	 */
	SUGGESTION_SOURCE("SUGGESTION_SOURCE"),

	/**
	 * CUSTOM_ACTION
	 */
	CUSTOM_ACTION("CUSTOM_ACTION");

	private String value;

	EAriaAgenticFlowDataContentType(String value) {
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
	public static EAriaAgenticFlowDataContentType fromValue(String value) {
		for (EAriaAgenticFlowDataContentType b : EAriaAgenticFlowDataContentType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
