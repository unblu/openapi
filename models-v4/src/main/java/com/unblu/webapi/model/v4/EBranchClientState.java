
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchClientState
 */
public enum EBranchClientState {

	/**
	 * AVAILABLE
	 */
	AVAILABLE("AVAILABLE"),

	/**
	 * OFFLINE
	 */
	OFFLINE("OFFLINE");

	private String value;

	EBranchClientState(String value) {
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
	public static EBranchClientState fromValue(String value) {
		for (EBranchClientState b : EBranchClientState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
