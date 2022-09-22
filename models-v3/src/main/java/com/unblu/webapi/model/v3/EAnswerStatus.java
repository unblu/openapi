
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The state of a question message
 */
public enum EAnswerStatus {

	/**
	 * PENDING: Question is not answered yet
	 */
	PENDING("PENDING"),

	/**
	 * ANSWERED: Question was successfully answered
	 */
	ANSWERED("ANSWERED"),

	/**
	 * TIMEDOUT: Question was running into a timeout
	 */
	TIMEDOUT("TIMEDOUT"),

	/**
	 * CANCELED: Question was canceled by the system, a bot or an external messenger channel
	 */
	CANCELED("CANCELED");

	private String value;

	EAnswerStatus(String value) {
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
	public static EAnswerStatus fromValue(String value) {
		for (EAnswerStatus b : EAnswerStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
