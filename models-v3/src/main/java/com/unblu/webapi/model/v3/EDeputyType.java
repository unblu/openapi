
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EDeputyType
 */
public enum EDeputyType {

	/**
	 * AGENT
	 */
	AGENT("AGENT"),

	/**
	 * TEAM
	 */
	TEAM("TEAM");

	private String value;

	EDeputyType(String value) {
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
	public static EDeputyType fromValue(String value) {
		for (EDeputyType b : EDeputyType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
