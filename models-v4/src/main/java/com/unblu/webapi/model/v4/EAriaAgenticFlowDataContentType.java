
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAriaAgenticFlowDataContentType
 */
public enum EAriaAgenticFlowDataContentType {

	/**
	 * MULTIFLOW: The content describes a set of flows the bot can choose between
	 */
	MULTIFLOW("MULTIFLOW"),

	/**
	 * SINGLE_FLOW: The content describes a single flow the bot runs
	 */
	SINGLE_FLOW("SINGLE_FLOW"),

	/**
	 * SUGGESTION_SOURCE: The content describes a source the bot draws suggestions from
	 */
	SUGGESTION_SOURCE("SUGGESTION_SOURCE"),

	/**
	 * CUSTOM_ACTION: The content describes a custom action the bot can invoke
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
