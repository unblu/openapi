
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of a HTTP method
 */
public enum EMethodType {

	/**
	 * GET: GET request. No content body
	 */
	GET("GET"),

	/**
	 * POST: POST request. Content body is send
	 */
	POST("POST"),

	/**
	 * PUT: PUT request. Content body is send with updated data
	 */
	PUT("PUT"),

	/**
	 * DELETE: DELETE request. No content body
	 */
	DELETE("DELETE");

	private String value;

	EMethodType(String value) {
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
	public static EMethodType fromValue(String value) {
		for (EMethodType b : EMethodType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
