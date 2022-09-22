
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Recipient type of the conversation
 */
public enum EConversationRecipientType {

	/**
	 * AGENT: Recipient is a single agent
	 */
	AGENT("AGENT"),

	/**
	 * TEAM: Recipient is an agent of the team
	 */
	TEAM("TEAM"),

	/**
	 * NAMED_AREA: Recipient is an agent responsible for a specific named-area
	 */
	NAMED_AREA("NAMED_AREA"),

	/**
	 * ACCOUNT: Recipient is one of all the agents of an account
	 */
	ACCOUNT("ACCOUNT");

	private String value;

	EConversationRecipientType(String value) {
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
	public static EConversationRecipientType fromValue(String value) {
		for (EConversationRecipientType b : EConversationRecipientType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
