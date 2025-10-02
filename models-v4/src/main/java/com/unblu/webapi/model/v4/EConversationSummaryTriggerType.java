
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationSummaryTriggerType
 */
public enum EConversationSummaryTriggerType {

	/**
	 * CONVERSATION_OFFBOARDING: This happens when the conversation moves to the &#x60;EConversationState.OFFBOARDING&#x60; state. &lt;p&gt; If the
	 * &#x60;ConversationSummaryTemplate&#x60; uses the value &#x60;ESummarizationTimeFrame.TRIGGER_SPECIFC&#x60;, the final &#x60;ESummarizationTimeFrame&#x60;
	 * used will be &#x60;ESummarizationTimeFrame.WHOLE_CONVERSATION&#x60;
	 */
	CONVERSATION_OFFBOARDING("CONVERSATION_OFFBOARDING"),

	/**
	 * CONVERSATION_UNASSIGNED: This happens when the conversation moves to the &#x60;EConversationState.UNASSIGNED&#x60; state. &lt;p&gt; If the
	 * &#x60;ConversationSummaryTemplate&#x60; uses the value &#x60;ESummarizationTimeFrame.TRIGGER_SPECIFC&#x60;, the final &#x60;ESummarizationTimeFrame&#x60;
	 * used will be &#x60;ESummarizationTimeFrame.UNTIL_LAST_UNASSIGNED&#x60;
	 */
	CONVERSATION_UNASSIGNED("CONVERSATION_UNASSIGNED");

	private String value;

	EConversationSummaryTriggerType(String value) {
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
	public static EConversationSummaryTriggerType fromValue(String value) {
		for (EConversationSummaryTriggerType b : EConversationSummaryTriggerType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
