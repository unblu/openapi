
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * How ingress is handled
 */
public enum EIngressStatus {

	/**
	 * ACCOUNT: Account-specific ingress enabled (using custom origin)
	 */
	ACCOUNT("ACCOUNT"),

	/**
	 * GLOBAL: Account is accessible via global ingress
	 */
	GLOBAL("GLOBAL"),

	/**
	 * BLOCKED: Account is blocked, i.e. because ingress is configured but not valid
	 */
	BLOCKED("BLOCKED");

	private String value;

	EIngressStatus(String value) {
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
	public static EIngressStatus fromValue(String value) {
		for (EIngressStatus b : EIngressStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
