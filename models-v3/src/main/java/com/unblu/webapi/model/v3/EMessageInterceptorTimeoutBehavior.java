
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * What should happen with a message when a timeout occurs during interception.&lt;br&gt; If omitted, the value REJECT is used.
 */
public enum EMessageInterceptorTimeoutBehavior {

	/**
	 * REJECT: Reject the message when a timeout occurs
	 */
	REJECT("REJECT"),

	/**
	 * CONTINUE: Proceed with the message when a timeout occurs
	 */
	CONTINUE("CONTINUE");

	private String value;

	EMessageInterceptorTimeoutBehavior(String value) {
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
	public static EMessageInterceptorTimeoutBehavior fromValue(String value) {
		for (EMessageInterceptorTimeoutBehavior b : EMessageInterceptorTimeoutBehavior.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
