
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The filter that can be used to narrow down the events received by a webhook registration. When a key/value filter is specified in a webhook registration,
 * only events matching the said filter will be dispatched to it. &lt;p&gt; Review the event&#39;s description for whether it supports a particular key.
 */
public enum ETypedEventFilterKey {

	/**
	 * CONVERSATION_ID: Filter by conversation ID
	 */
	CONVERSATION_ID("CONVERSATION_ID"),

	/**
	 * PARTICIPANT_PERSON_ID: Filter by a conversation participant&#39;s person ID
	 */
	PARTICIPANT_PERSON_ID("PARTICIPANT_PERSON_ID"),

	/**
	 * PERSON_ID: Filter by person ID
	 */
	PERSON_ID("PERSON_ID");

	private String value;

	ETypedEventFilterKey(String value) {
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
	public static ETypedEventFilterKey fromValue(String value) {
		for (ETypedEventFilterKey b : ETypedEventFilterKey.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
