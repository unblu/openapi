
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The reason a participant left a call they had joined earlier
 */
public enum ECallParticipationLeftReason {

	/**
	 * HANG_UP: The participant hung up
	 */
	HANG_UP("HANG_UP"),

	/**
	 * MISSED_BECAUSE_TIMEOUT: The participant missed the call because they didn&#39;t answer it
	 */
	MISSED_BECAUSE_TIMEOUT("MISSED_BECAUSE_TIMEOUT"),

	/**
	 * MISSED_BECAUSE_TERMINATED: The participant missed the call because the caller ended it before they could answer it
	 */
	MISSED_BECAUSE_TERMINATED("MISSED_BECAUSE_TERMINATED"),

	/**
	 * CALL_ENDED: The participation ended because the call ended
	 */
	CALL_ENDED("CALL_ENDED"),

	/**
	 * CALL_ABORTED: The participation ended because the call was aborted before they could answer it
	 */
	CALL_ABORTED("CALL_ABORTED"),

	/**
	 * DIAL_IN_ENDED: The participant hung up the dialed-in phone
	 */
	DIAL_IN_ENDED("DIAL_IN_ENDED"),

	/**
	 * REMOVED: The participant was removed from the conversation
	 */
	REMOVED("REMOVED"),

	/**
	 * SYSTEM_ABORT: The participation ended because the system aborted the call
	 */
	SYSTEM_ABORT("SYSTEM_ABORT"),

	/**
	 * UNKNOWN: The participant left for unknown reason
	 */
	UNKNOWN("UNKNOWN");

	private String value;

	ECallParticipationLeftReason(String value) {
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
	public static ECallParticipationLeftReason fromValue(String value) {
		for (ECallParticipationLeftReason b : ECallParticipationLeftReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
