
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reason why a question message was not answered
 */
public enum EQuestionMessageAbortReason {

	/**
	 * TIMEDOUT: A person was to slow to answer a message
	 */
	TIMEDOUT("TIMEDOUT"),

	/**
	 * CANCELED: The question was canceled explicitly by the system, a bot or an external messenger channel
	 */
	CANCELED("CANCELED");

	private String value;

	EQuestionMessageAbortReason(String value) {
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
	public static EQuestionMessageAbortReason fromValue(String value) {
		for (EQuestionMessageAbortReason b : EQuestionMessageAbortReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
