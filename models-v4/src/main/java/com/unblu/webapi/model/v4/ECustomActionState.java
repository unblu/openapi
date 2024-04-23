
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Possible Custom Action State
 */
public enum ECustomActionState {

	/**
	 * ACTIVE: State when a custom action is manually enabled
	 */
	ACTIVE("ACTIVE"),

	/**
	 * INACTIVE: State when a custom action is manually disabled
	 */
	INACTIVE("INACTIVE"),

	/**
	 * INACTIVE_UNAVAILABLE: State when a custom action is automatically disabled because it&#39;s webhook registration got automatically disabled
	 */
	INACTIVE_UNAVAILABLE("INACTIVE_UNAVAILABLE");

	private String value;

	ECustomActionState(String value) {
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
	public static ECustomActionState fromValue(String value) {
		for (ECustomActionState b : ECustomActionState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
