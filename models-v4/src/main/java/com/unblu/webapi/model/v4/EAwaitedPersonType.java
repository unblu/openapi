
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates which type of person the conversation is waiting for
 */
public enum EAwaitedPersonType {

	/**
	 * NONE
	 */
	NONE("NONE"),

	/**
	 * VISITOR
	 */
	VISITOR("VISITOR"),

	/**
	 * AGENT
	 */
	AGENT("AGENT");

	private String value;

	EAwaitedPersonType(String value) {
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
	public static EAwaitedPersonType fromValue(String value) {
		for (EAwaitedPersonType b : EAwaitedPersonType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
