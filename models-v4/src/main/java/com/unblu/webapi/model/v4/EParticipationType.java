
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of a participant in a conversation
 */
public enum EParticipationType {

	/**
	 * ASSIGNED_AGENT: Assignee person participant
	 */
	ASSIGNED_AGENT("ASSIGNED_AGENT"),

	/**
	 * CONTEXT_PERSON: Context person participant
	 */
	CONTEXT_PERSON("CONTEXT_PERSON");

	private String value;

	EParticipationType(String value) {
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
	public static EParticipationType fromValue(String value) {
		for (EParticipationType b : EParticipationType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
