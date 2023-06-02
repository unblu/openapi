
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of an internal message interceptor.
 */
public enum EInternalMessageInterceptorStatus {

	/**
	 * ACTIVE: The interceptor is active and participates in all conversations where it is configured
	 */
	ACTIVE("ACTIVE"),

	/**
	 * INACTIVE: The interceptor isn&#39;t active and doesn&#39;t participate in any conversation
	 */
	INACTIVE("INACTIVE");

	private String value;

	EInternalMessageInterceptorStatus(String value) {
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
	public static EInternalMessageInterceptorStatus fromValue(String value) {
		for (EInternalMessageInterceptorStatus b : EInternalMessageInterceptorStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
