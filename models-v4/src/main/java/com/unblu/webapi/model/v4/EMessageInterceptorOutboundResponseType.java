
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EMessageInterceptorOutboundResponseType
 */
public enum EMessageInterceptorOutboundResponseType {

	/**
	 * APPROVE
	 */
	APPROVE("APPROVE"),

	/**
	 * REJECT
	 */
	REJECT("REJECT");

	private String value;

	EMessageInterceptorOutboundResponseType(String value) {
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
	public static EMessageInterceptorOutboundResponseType fromValue(String value) {
		for (EMessageInterceptorOutboundResponseType b : EMessageInterceptorOutboundResponseType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
