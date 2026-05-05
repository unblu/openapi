
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines the outcome of a waiting time entry, indicating whether the invitation was accepted or aborted.
 */
public enum EAnalyticsWaitingTimeOutcome {

	/**
	 * ACCEPTED: The invitation was accepted by an agent.
	 */
	ACCEPTED("ACCEPTED"),

	/**
	 * ABORTED: The invitation was aborted (e.g., revoked, unanswered, or superseded).
	 */
	ABORTED("ABORTED");

	private String value;

	EAnalyticsWaitingTimeOutcome(String value) {
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
	public static EAnalyticsWaitingTimeOutcome fromValue(String value) {
		for (EAnalyticsWaitingTimeOutcome b : EAnalyticsWaitingTimeOutcome.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
