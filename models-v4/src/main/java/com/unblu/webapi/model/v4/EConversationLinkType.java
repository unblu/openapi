
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of link used to accept an invitation.
 */
public enum EConversationLinkType {

	/**
	 * ACCEPT_IN_AGENT_DESK: Link that accepts the invitation and loads the agent desk to display the conversation
	 */
	ACCEPT_IN_AGENT_DESK("ACCEPT_IN_AGENT_DESK"),

	/**
	 * ACCEPT_IN_AGENT_SINGLE_VIEW: Link that accepts the invitation and display the conversation in a single view &lt;p&gt; The single view only displays the
	 * conversation without any navigation and other agent desk features and can be used for integration into third party applications.
	 */
	ACCEPT_IN_AGENT_SINGLE_VIEW("ACCEPT_IN_AGENT_SINGLE_VIEW"),

	/**
	 * ACCEPT_IN_VISITOR_DESK: Link that accepts the invitation and display the conversation in a visitor desk
	 */
	ACCEPT_IN_VISITOR_DESK("ACCEPT_IN_VISITOR_DESK"),

	/**
	 * OPEN_IN_AGENT_DESK: Link to open an existing conversation in the agent desk to display the conversation
	 */
	OPEN_IN_AGENT_DESK("OPEN_IN_AGENT_DESK"),

	/**
	 * OPEN_IN_AGENT_SINGLE_VIEW: Link to open an existing conversation in a single view &lt;p&gt; The single view only displays the conversation without any
	 * navigation and other agent desk features and can be used for integration into third party applications.
	 */
	OPEN_IN_AGENT_SINGLE_VIEW("OPEN_IN_AGENT_SINGLE_VIEW"),

	/**
	 * OPEN_IN_VISITOR_DESK: Link to open an existing conversation in a visitor desk
	 */
	OPEN_IN_VISITOR_DESK("OPEN_IN_VISITOR_DESK"),

	/**
	 * OPEN_PUBLIC_LINK: Link to open an existing conversation. It will first go to the visitor desk, it it can be detected, that the user is an agent, it will
	 * redirect to the single view for the agent.
	 */
	OPEN_PUBLIC_LINK("OPEN_PUBLIC_LINK");

	private String value;

	EConversationLinkType(String value) {
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
	public static EConversationLinkType fromValue(String value) {
		for (EConversationLinkType b : EConversationLinkType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
