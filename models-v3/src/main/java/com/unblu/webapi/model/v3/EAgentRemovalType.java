
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAgentRemovalType
 */
public enum EAgentRemovalType {

	/**
	 * KEEP_AGENTS
	 */
	KEEP_AGENTS("KEEP_AGENTS"),

	/**
	 * REMOVE_ASSIGNED_AGENT
	 */
	REMOVE_ASSIGNED_AGENT("REMOVE_ASSIGNED_AGENT"),

	/**
	 * REMOVE_ALL_AGENTS
	 */
	REMOVE_ALL_AGENTS("REMOVE_ALL_AGENTS");

	private String value;

	EAgentRemovalType(String value) {
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
	public static EAgentRemovalType fromValue(String value) {
		for (EAgentRemovalType b : EAgentRemovalType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
