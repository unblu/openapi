
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of a named area
 */
public enum ENamedAreaType {

	/**
	 * META_TAG: A meta tag
	 */
	META_TAG("META_TAG"),

	/**
	 * DOMAIN: a (sub)domain
	 */
	DOMAIN("DOMAIN");

	private String value;

	ENamedAreaType(String value) {
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
	public static ENamedAreaType fromValue(String value) {
		for (ENamedAreaType b : ENamedAreaType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
