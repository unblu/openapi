
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of the target person of a custom person action
 */
public enum ECustomPersonActionTargetPersonType {

	/**
	 * AGENT: Agent participant
	 */
	AGENT("AGENT"),

	/**
	 * ANONYMOUS_VISITOR: Anonymous visitor participant
	 */
	ANONYMOUS_VISITOR("ANONYMOUS_VISITOR"),

	/**
	 * AUTHENTICATED_VISITOR: Authenticated visitor participant
	 */
	AUTHENTICATED_VISITOR("AUTHENTICATED_VISITOR"),

	/**
	 * BOT: Bot participant
	 */
	BOT("BOT");

	private String value;

	ECustomPersonActionTargetPersonType(String value) {
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
	public static ECustomPersonActionTargetPersonType fromValue(String value) {
		for (ECustomPersonActionTargetPersonType b : ECustomPersonActionTargetPersonType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
