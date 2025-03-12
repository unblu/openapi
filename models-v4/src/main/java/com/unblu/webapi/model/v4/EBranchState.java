
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchState
 */
public enum EBranchState {

	/**
	 * ACTIVE
	 */
	ACTIVE("ACTIVE"),

	/**
	 * INACTIVE
	 */
	INACTIVE("INACTIVE");

	private String value;

	EBranchState(String value) {
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
	public static EBranchState fromValue(String value) {
		for (EBranchState b : EBranchState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
