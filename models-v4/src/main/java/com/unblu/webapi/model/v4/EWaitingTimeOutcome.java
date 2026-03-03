
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EWaitingTimeOutcome
 */
public enum EWaitingTimeOutcome {

	/**
	 * ACCEPTED: Accepted by agent.
	 */
	ACCEPTED("ACCEPTED"),

	/**
	 * ABORTED: Waiting aborted.
	 */
	ABORTED("ABORTED");

	private String value;

	EWaitingTimeOutcome(String value) {
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
	public static EWaitingTimeOutcome fromValue(String value) {
		for (EWaitingTimeOutcome b : EWaitingTimeOutcome.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
