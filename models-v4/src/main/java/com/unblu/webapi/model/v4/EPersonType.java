
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of a person (participant of a session)
 */
public enum EPersonType {

	/**
	 * AGENT: Agent participant
	 */
	AGENT("AGENT"),

	/**
	 * VISITOR: Visitor participant
	 */
	VISITOR("VISITOR"),

	/**
	 * SYSTEM: System participant
	 */
	SYSTEM("SYSTEM"),

	/**
	 * BOT: Bot participant
	 */
	BOT("BOT");

	private String value;

	EPersonType(String value) {
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
	public static EPersonType fromValue(String value) {
		for (EPersonType b : EPersonType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
