
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationSummaryFailReason
 */
public enum EConversationSummaryFailReason {

	/**
	 * TIMEOUT: The summary creation took longer than the timeout defined by the configuration &#39;com.unblu.ai.conversationsummary.conversationsummarytimeout&#39;
	 */
	TIMEOUT("TIMEOUT"),

	/**
	 * CONVERSATION_SEGMENTATION_ERROR: An error occurred while splitting the conversations into smaller chunks used to create the summary.
	 */
	CONVERSATION_SEGMENTATION_ERROR("CONVERSATION_SEGMENTATION_ERROR"),

	/**
	 * VALIDATORS_FAILED: A validator failed either before or after the summary was generated due to an unmet input or output condition.
	 */
	VALIDATORS_FAILED("VALIDATORS_FAILED"),

	/**
	 * OTHER: An unexpected error occurred while creating the summary.
	 */
	OTHER("OTHER");

	private String value;

	EConversationSummaryFailReason(String value) {
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
	public static EConversationSummaryFailReason fromValue(String value) {
		for (EConversationSummaryFailReason b : EConversationSummaryFailReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
