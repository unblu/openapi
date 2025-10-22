
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ESummarizationTimeFrame
 */
public enum ESummarizationTimeFrame {

	/**
	 * WHOLE_CONVERSATION: The entire conversation will be used to generate the summary
	 */
	WHOLE_CONVERSATION("WHOLE_CONVERSATION"),

	/**
	 * UNTIL_LAST_SUMMARY: All the messages sent in the conversation, after last summary was generated, will be used to generate the summary
	 */
	UNTIL_LAST_SUMMARY("UNTIL_LAST_SUMMARY"),

	/**
	 * UNTIL_LAST_UNASSIGNED: All the messages sent in the conversation, after the second last time the conversation moved to the
	 * &#x60;EConversationState.UNASSIGNED&#x60;, and before the last time the conversation moved to the &#x60;EConversationState.UNASSIGNED&#x60;, will be used to
	 * generate the summary
	 */
	UNTIL_LAST_UNASSIGNED("UNTIL_LAST_UNASSIGNED"),

	/**
	 * TRIGGER_SPECIFIC: The time frame of the messages used to generate the summary will depend on the &#x60;EConversationSummaryTriggerType&#x60; triggering the
	 * summary generation
	 */
	TRIGGER_SPECIFIC("TRIGGER_SPECIFIC");

	private String value;

	ESummarizationTimeFrame(String value) {
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
	public static ESummarizationTimeFrame fromValue(String value) {
		for (ESummarizationTimeFrame b : ESummarizationTimeFrame.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
