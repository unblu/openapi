
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The kinds of messages a message interceptor processes.
 */
public enum EMessageInterceptorMessageScope {

	/**
	 * BOARDING_PROCESS: Messages exchanged during a boarding process (onboarding, reboarding or offboarding), that is, messages that belong to a bot thread.
	 */
	BOARDING_PROCESS("BOARDING_PROCESS"),

	/**
	 * PUBLIC: Public messages outside a boarding process.
	 */
	PUBLIC("PUBLIC"),

	/**
	 * INTERNAL: Internal messages
	 */
	INTERNAL("INTERNAL");

	private String value;

	EMessageInterceptorMessageScope(String value) {
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
	public static EMessageInterceptorMessageScope fromValue(String value) {
		for (EMessageInterceptorMessageScope b : EMessageInterceptorMessageScope.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
