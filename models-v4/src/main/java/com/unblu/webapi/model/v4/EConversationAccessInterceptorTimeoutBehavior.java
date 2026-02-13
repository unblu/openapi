
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * What should happen with a message when a timeout occurs during interception.&lt;br&gt; If omitted, the value REJECT is used.
 */
public enum EConversationAccessInterceptorTimeoutBehavior {

	/**
	 * REJECT: Reject the access attempt when a timeout occurs
	 */
	REJECT("REJECT"),

	/**
	 * CONTINUE: Grant access to the conversation when a timeout occurs
	 */
	CONTINUE("CONTINUE");

	private String value;

	EConversationAccessInterceptorTimeoutBehavior(String value) {
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
	public static EConversationAccessInterceptorTimeoutBehavior fromValue(String value) {
		for (EConversationAccessInterceptorTimeoutBehavior b : EConversationAccessInterceptorTimeoutBehavior.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
