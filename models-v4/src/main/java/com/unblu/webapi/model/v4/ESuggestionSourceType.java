
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ESuggestionSourceType
 */
public enum ESuggestionSourceType {

	/**
	 * CUSTOM: Suggestion source that uses the Unblu web API
	 */
	CUSTOM("CUSTOM"),

	/**
	 * COPILOT: Suggestion source that uses Microsoft Copilot
	 */
	COPILOT("COPILOT"),

	/**
	 * ARIA: Suggestion source that uses an Aria agentic flow
	 */
	ARIA("ARIA");

	private String value;

	ESuggestionSourceType(String value) {
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
	public static ESuggestionSourceType fromValue(String value) {
		for (ESuggestionSourceType b : ESuggestionSourceType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
