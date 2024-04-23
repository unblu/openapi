
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The severity of the rejection for messages rejected by a message interceptor. This affects how the rejected message is displayed to different participants.
 */
public enum ESentRejectionSeverity {

	/**
	 * HIGH: The message was rejected with high severity
	 */
	HIGH("HIGH"),

	/**
	 * MEDIUM: The message was rejected with medium severity
	 */
	MEDIUM("MEDIUM"),

	/**
	 * LOW: The message was rejected with low severity
	 */
	LOW("LOW");

	private String value;

	ESentRejectionSeverity(String value) {
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
	public static ESentRejectionSeverity fromValue(String value) {
		for (ESentRejectionSeverity b : ESentRejectionSeverity.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
