
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The escalation levels for a deputy delegation
 */
public enum EAssistantAndDeputyDelegationEscalationLevel {

	/**
	 * ASSISTANTS: The agent&#39;s assistants, notified together with the first escalation level
	 */
	ASSISTANTS("ASSISTANTS"),

	/**
	 * LEVEL_1: The first escalation level, tried before the higher levels
	 */
	LEVEL_1("LEVEL_1"),

	/**
	 * LEVEL_2: The second escalation level, tried when level 1 did not answer
	 */
	LEVEL_2("LEVEL_2"),

	/**
	 * LEVEL_3: The third and final escalation level, tried when level 2 did not answer
	 */
	LEVEL_3("LEVEL_3");

	private String value;

	EAssistantAndDeputyDelegationEscalationLevel(String value) {
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
	public static EAssistantAndDeputyDelegationEscalationLevel fromValue(String value) {
		for (EAssistantAndDeputyDelegationEscalationLevel b : EAssistantAndDeputyDelegationEscalationLevel.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
