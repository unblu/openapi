
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EInvitationType
 */
public enum EInvitationType {

	/**
	 * CONVERSATION_REQUEST: All visitor conversation requests e.g. Voice / Video-Call, Co-Browsing Request, etc.
	 */
	CONVERSATION_REQUEST("CONVERSATION_REQUEST"),

	/**
	 * AGENT_FORWARDING: Conversation forwarding to an other agent, directly or via a team. &lt;ul&gt; &lt;li&gt;The forwarding agent will leave the conversation
	 * once it has been accepted.&lt;/li&gt; &lt;li&gt;The assignee will change to the forwarded agent once it has been accepted.&lt;/li&gt; &lt;/ul&gt;
	 */
	AGENT_FORWARDING("AGENT_FORWARDING"),

	/**
	 * AGENT_INVITATION: Invites an other agent into the conversation, directly or via a team. &lt;ul&gt; &lt;li&gt;The inviting agent stays in the
	 * conversation.&lt;/li&gt; &lt;li&gt;The assignee will NOT change when the invited agent accepts the invitation.&lt;/li&gt; &lt;/ul&gt;
	 */
	AGENT_INVITATION("AGENT_INVITATION"),

	/**
	 * VISITOR_INVITATION: Anonymous Visitor invitation &lt;ul&gt; &lt;li&gt;Anyone with the invitations ticket (and the accounts API key) may enter the
	 * conversation as a Visitor.&lt;/li&gt; &lt;li&gt;Once the invitation has been redeemed it can not be reused by other Visitors.&lt;/li&gt; &lt;/ul&gt;
	 */
	VISITOR_INVITATION("VISITOR_INVITATION"),

	/**
	 * PIN_CONVERSATION: Universal / Embedded / Mobile PIN Session. &lt;ul&gt; &lt;li&gt;The conversation doesn&#39;t really start until the invitation is
	 * redeemed.&lt;/li&gt; &lt;li&gt;Anyone with the invitations ticket (and the accounts API key) may enter the conversation as a Visitor.&lt;/li&gt;
	 * &lt;li&gt;Once the ticket has been redeemed it can not be reused by other Visitors.&lt;/li&gt; &lt;/ul&gt;
	 */
	PIN_CONVERSATION("PIN_CONVERSATION");

	private String value;

	EInvitationType(String value) {
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
	public static EInvitationType fromValue(String value) {
		for (EInvitationType b : EInvitationType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
