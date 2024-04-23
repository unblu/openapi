
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The reason a call has ended
 */
public enum ECallEndReason {

	/**
	 * NOT_ANSWERED: The call was not answered
	 */
	NOT_ANSWERED("NOT_ANSWERED"),

	/**
	 * ABORTED_BY_INITIATOR: The initiator aborted the call while it was still ringing
	 */
	ABORTED_BY_INITIATOR("ABORTED_BY_INITIATOR"),

	/**
	 * DECLINED: The call was declined
	 */
	DECLINED("DECLINED"),

	/**
	 * DECLINED_BECAUSE_UNAVAILABLE: The call was declined because all conversation participants called were unavailable
	 */
	DECLINED_BECAUSE_UNAVAILABLE("DECLINED_BECAUSE_UNAVAILABLE"),

	/**
	 * LAST_MANDATORY_PARTICIPANT_LEFT: The call ended because the last mandatory participant left
	 */
	LAST_MANDATORY_PARTICIPANT_LEFT("LAST_MANDATORY_PARTICIPANT_LEFT"),

	/**
	 * CONVERSATION_ENDED: The call ended because the conversation ended
	 */
	CONVERSATION_ENDED("CONVERSATION_ENDED"),

	/**
	 * RECORDING_DENIED: The call ended because conversation recording was denied
	 */
	RECORDING_DENIED("RECORDING_DENIED"),

	/**
	 * SYSTEM_SHUTDOWN: The call ended because the collaboration server pod was shut down
	 */
	SYSTEM_SHUTDOWN("SYSTEM_SHUTDOWN"),

	/**
	 * UNKNOWN: The call ended for another reason
	 */
	UNKNOWN("UNKNOWN");

	private String value;

	ECallEndReason(String value) {
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
	public static ECallEndReason fromValue(String value) {
		for (ECallEndReason b : ECallEndReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
