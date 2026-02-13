
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationAccessInterceptorOutboundResponseType
 */
public enum EConversationAccessInterceptorOutboundResponseType {

	/**
	 * GRANT
	 */
	GRANT("GRANT"),

	/**
	 * DENY
	 */
	DENY("DENY");

	private String value;

	EConversationAccessInterceptorOutboundResponseType(String value) {
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
	public static EConversationAccessInterceptorOutboundResponseType fromValue(String value) {
		for (EConversationAccessInterceptorOutboundResponseType b : EConversationAccessInterceptorOutboundResponseType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
