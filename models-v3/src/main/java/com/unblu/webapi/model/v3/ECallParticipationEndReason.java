
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Determines the reason why the participation on a call ended.
 */
public enum ECallParticipationEndReason {

	/**
	 * MISSED_BECAUSE_TIMEOUT: The participation was ended because of a timeout on the participant&#39;s side.
	 */
	MISSED_BECAUSE_TIMEOUT("MISSED_BECAUSE_TIMEOUT"),

	/**
	 * MISSED_BECAUSE_TERMINATED: The participation ended because the initiator terminated the call before the other participant answered it
	 */
	MISSED_BECAUSE_TERMINATED("MISSED_BECAUSE_TERMINATED"),

	/**
	 * MISSED_BECAUSE_UNAVAILABLE: The participation ended because nobody was available to answer the call
	 */
	MISSED_BECAUSE_UNAVAILABLE("MISSED_BECAUSE_UNAVAILABLE"),

	/**
	 * TERMINATED_BY_PARTICIPANT: The participation ended normally
	 */
	TERMINATED_BY_PARTICIPANT("TERMINATED_BY_PARTICIPANT"),

	/**
	 * TERMINATED_BY_SYSTEM_ABORT: The participation ended because the system aborted the call
	 */
	TERMINATED_BY_SYSTEM_ABORT("TERMINATED_BY_SYSTEM_ABORT");

	private String value;

	ECallParticipationEndReason(String value) {
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
	public static ECallParticipationEndReason fromValue(String value) {
		for (ECallParticipationEndReason b : ECallParticipationEndReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
