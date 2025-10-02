
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines the provider used to create a conversation summary
 */
public enum EConversationSummaryProvider {

	/**
	 * NATIVE_LLM: The conversation summary will be created using the native LLM implementation and the LLM provider defined by the configuration property
	 * &#39;com.unblu.ai.conversationSummary.conversationSummaryProviderType&#39;.
	 */
	NATIVE_LLM("NATIVE_LLM");

	private String value;

	EConversationSummaryProvider(String value) {
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
	public static EConversationSummaryProvider fromValue(String value) {
		for (EConversationSummaryProvider b : EConversationSummaryProvider.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
