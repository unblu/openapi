
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The target a label can be set on: a person (by type) or a conversation.
 */
public enum ELabelTargetType {

	/**
	 * AGENT: Agent
	 */
	AGENT("AGENT"),

	/**
	 * ANONYMOUS_VISITOR: Anonymous visitor
	 */
	ANONYMOUS_VISITOR("ANONYMOUS_VISITOR"),

	/**
	 * AUTHENTICATED_VISITOR: Authenticated visitor
	 */
	AUTHENTICATED_VISITOR("AUTHENTICATED_VISITOR"),

	/**
	 * BOT: Bot
	 */
	BOT("BOT"),

	/**
	 * CONVERSATION: Conversation
	 */
	CONVERSATION("CONVERSATION");

	private String value;

	ELabelTargetType(String value) {
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
	public static ELabelTargetType fromValue(String value) {
		for (ELabelTargetType b : ELabelTargetType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
