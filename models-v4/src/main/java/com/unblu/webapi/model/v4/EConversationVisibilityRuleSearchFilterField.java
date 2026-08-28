
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationVisibilityRuleSearchFilterField
 */
public enum EConversationVisibilityRuleSearchFilterField {

	/**
	 * NAME: Filter by the &#39;name&#39; attribute
	 */
	NAME("NAME"),

	/**
	 * AGENT_LABEL_SELECTION: Filter by the &#39;agentLabelSelection&#39; attribute
	 */
	AGENT_LABEL_SELECTION("AGENT_LABEL_SELECTION"),

	/**
	 * CONVERSATION_LABEL_SELECTION: Filter by the &#39;conversationLabelSelection&#39; attribute
	 */
	CONVERSATION_LABEL_SELECTION("CONVERSATION_LABEL_SELECTION");

	private String value;

	EConversationVisibilityRuleSearchFilterField(String value) {
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
	public static EConversationVisibilityRuleSearchFilterField fromValue(String value) {
		for (EConversationVisibilityRuleSearchFilterField b : EConversationVisibilityRuleSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
