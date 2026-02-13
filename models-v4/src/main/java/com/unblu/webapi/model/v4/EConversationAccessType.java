
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationAccessType
 */
public enum EConversationAccessType {

	/**
	 * ACCESS_AS_VISITOR_PARTICIPANT: A visitor person with an active conversation participation is trying to open the conversation
	 */
	ACCESS_AS_VISITOR_PARTICIPANT("ACCESS_AS_VISITOR_PARTICIPANT"),

	/**
	 * ACCESS_AS_AGENT_PARTICIPANT: An agent person with an active conversation participation is trying to open the conversation in &quot;normal&quot; mode
	 */
	ACCESS_AS_AGENT_PARTICIPANT("ACCESS_AS_AGENT_PARTICIPANT"),

	/**
	 * ACCESS_AS_GHOST_PARTICIPANT: An agent person with an active conversation participation is trying to open the conversation as a ghost
	 */
	ACCESS_AS_GHOST_PARTICIPANT("ACCESS_AS_GHOST_PARTICIPANT"),

	/**
	 * ACCESS_AS_GHOST_WITHOUT_PARTICIPATION: An agent person without an active conversation participation is trying to open the conversation as a ghost
	 */
	ACCESS_AS_GHOST_WITHOUT_PARTICIPATION("ACCESS_AS_GHOST_WITHOUT_PARTICIPATION");

	private String value;

	EConversationAccessType(String value) {
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
	public static EConversationAccessType fromValue(String value) {
		for (EConversationAccessType b : EConversationAccessType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
