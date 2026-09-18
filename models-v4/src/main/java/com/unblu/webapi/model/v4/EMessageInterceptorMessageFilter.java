
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EMessageInterceptorMessageFilter
 */
public enum EMessageInterceptorMessageFilter {

	/**
	 * AGENT: Only messages sent by agents are intercepted
	 */
	AGENT("AGENT"),

	/**
	 * VISITOR: Only messages sent by visitors are intercepted
	 */
	VISITOR("VISITOR"),

	/**
	 * ALL: Messages sent by agents and by visitors are intercepted
	 */
	ALL("ALL");

	private String value;

	EMessageInterceptorMessageFilter(String value) {
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
	public static EMessageInterceptorMessageFilter fromValue(String value) {
		for (EMessageInterceptorMessageFilter b : EMessageInterceptorMessageFilter.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
