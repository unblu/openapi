
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Kind of webhook event (regular webhook event or outbound request/response)
 */
public enum EWebhookEventKind {

	/**
	 * WEBHOOK: Regular webhook, where no specific response is expected, receiver can process the POST call in an asynchronous way
	 */
	WEBHOOK("WEBHOOK"),

	/**
	 * OUTBOUND: Outbound request which expects a response, receiver must process the POST call in a synchronous way
	 */
	OUTBOUND("OUTBOUND");

	private String value;

	EWebhookEventKind(String value) {
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
	public static EWebhookEventKind fromValue(String value) {
		for (EWebhookEventKind b : EWebhookEventKind.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
