
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The visibility of a conversation. The visibility used at creation time determines who is allowed to see the conversation.
 */
public enum EConversationVisibility {

	/**
	 * PRIVATE: Conversation can only be seen by participants
	 */
	PRIVATE("PRIVATE"),

	/**
	 * RULE_BASED: Conversation can be seen by participants as well as non-participating agents who can see the conversation&#39;s context person based on their
	 * visibility rules
	 */
	RULE_BASED("RULE_BASED");

	private String value;

	EConversationVisibility(String value) {
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
	public static EConversationVisibility fromValue(String value) {
		for (EConversationVisibility b : EConversationVisibility.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
