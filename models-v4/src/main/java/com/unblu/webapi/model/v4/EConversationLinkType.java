
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of link used to accept an invitation.
 */
public enum EConversationLinkType {

	/**
	 * ACCEPT_IN_AGENT_DESK: Link that accepts the invitation and loads the Agent Desk to display the conversation
	 */
	ACCEPT_IN_AGENT_DESK("ACCEPT_IN_AGENT_DESK"),

	/**
	 * ACCEPT_IN_AGENT_SINGLE_VIEW: Link that accepts the invitation and display the conversation in the Single Conversation Desk. &lt;p&gt; The Single Conversation
	 * Desk displays a conversation without any other Agent Desk features. It can be used for integrating Unblu into third-party applications.
	 */
	ACCEPT_IN_AGENT_SINGLE_VIEW("ACCEPT_IN_AGENT_SINGLE_VIEW"),

	/**
	 * ACCEPT_IN_VISITOR_DESK: Link that accepts the invitation and displays the conversation in the Visitor Desk
	 */
	ACCEPT_IN_VISITOR_DESK("ACCEPT_IN_VISITOR_DESK"),

	/**
	 * OPEN_IN_AGENT_DESK: Link that opens the Agent Desk to display an existing conversation
	 */
	OPEN_IN_AGENT_DESK("OPEN_IN_AGENT_DESK"),

	/**
	 * OPEN_AS_GHOST_IN_AGENT_DESK: Link that opens the Agent Desk to display an existing conversation as a ghost
	 */
	OPEN_AS_GHOST_IN_AGENT_DESK("OPEN_AS_GHOST_IN_AGENT_DESK"),

	/**
	 * OPEN_IN_AGENT_SINGLE_VIEW: Link that opens an existing conversation in the Single Conversation Desk. &lt;p&gt; The Single Conversation Desk displays a
	 * conversation without any other Agent Desk features. It can be used for integrating Unblu into third-party applications.
	 */
	OPEN_IN_AGENT_SINGLE_VIEW("OPEN_IN_AGENT_SINGLE_VIEW"),

	/**
	 * OPEN_AS_GHOST_IN_AGENT_SINGLE_VIEW: Link that opens an existing conversation in the Single Conversation Desk as a ghost. &lt;p&gt; The Single Conversation
	 * Desk displays a conversation without any other Agent Desk features. It can be used for integrating Unblu into third-party applications.
	 */
	OPEN_AS_GHOST_IN_AGENT_SINGLE_VIEW("OPEN_AS_GHOST_IN_AGENT_SINGLE_VIEW"),

	/**
	 * OPEN_IN_VISITOR_DESK: Link to open an existing conversation in the Visitor Desk
	 */
	OPEN_IN_VISITOR_DESK("OPEN_IN_VISITOR_DESK"),

	/**
	 * OPEN_PUBLIC_LINK: Public link to open an existing conversation. The link first goes to the Visitor Desk. If Unblu detects that the user is an agent,
	 * they&#39;re redirected to the Single Conversation Desk.
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
