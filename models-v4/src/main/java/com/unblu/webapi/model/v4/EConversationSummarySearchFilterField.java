
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationSummarySearchFilterField
 */
public enum EConversationSummarySearchFilterField {

	/**
	 * CONVERSATION_ID: Filter by the &#39;conversationId&#39; attribute
	 */
	CONVERSATION_ID("CONVERSATION_ID"),

	/**
	 * CONVERSATION_SUMMARY_TEMPLATE_ID: Filter by the &#39;conversationSummaryTemplateId&#39; attribute
	 */
	CONVERSATION_SUMMARY_TEMPLATE_ID("CONVERSATION_SUMMARY_TEMPLATE_ID"),

	/**
	 * SUMMARY_TRIGGER_TYPE: Filter by the &#39;summaryTriggerType&#39; attribute
	 */
	SUMMARY_TRIGGER_TYPE("SUMMARY_TRIGGER_TYPE"),

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Filter by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EConversationSummarySearchFilterField(String value) {
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
	public static EConversationSummarySearchFilterField fromValue(String value) {
		for (EConversationSummarySearchFilterField b : EConversationSummarySearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
