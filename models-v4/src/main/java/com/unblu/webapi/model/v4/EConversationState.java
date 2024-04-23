
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Life cycle state of the conversation. Following transitions are possible: &lt;ul&gt; &lt;li&gt;&#x60;CREATED&#x60; --&gt; &#x60;ONBOARDING&#x60;,
 * &#x60;OFFBOARDING&#x60;&lt;/li&gt; &lt;li&gt;&#x60;ONBOARDING&#x60; --&gt; &#x60;QUEUED&#x60;, &#x60;ACTIVE&#x60;, &#x60;OFFBOARDING&#x60;,
 * &#x60;UNASSIGNED&#x60;&lt;/li&gt; &lt;li&gt;&#x60;REBOARDING&#x60; --&gt; &#x60;QUEUED&#x60;, &#x60;UNASSIGNED&#x60;, &#x60;OFFBOARDING&#x60;&lt;/li&gt;
 * &lt;li&gt;&#x60;QUEUED&#x60; --&gt; &#x60;ACTIVE&#x60;, &#x60;OFFBOARDING&#x60;, &#x60;UNASSIGNED&#x60;&lt;/li&gt; &lt;li&gt;&#x60;ACTIVE&#x60; --&gt;
 * &#x60;UNASSIGNED&#x60;, &#x60;OFFBOARDING&#x60;, &#x60;QUEUED&#x60;&lt;/li&gt; &lt;li&gt;&#x60;UNASSIGNED&#x60; --&gt; &#x60;REBOARDING&#x60;,
 * &#x60;OFFBOARDING&#x60;, &#x60;QUEUED&#x60;, &#x60;ACTIVE&#x60;&lt;/li&gt; &lt;li&gt;&#x60;OFFBOARDING&#x60; --&gt; &#x60;ENDED&#x60;&lt;/li&gt;
 * &lt;li&gt;&#x60;ENDED&#x60; --&gt; none&lt;/li&gt; &lt;/ul&gt;
 */
public enum EConversationState {

	/**
	 * CREATED: Initial state of a conversation
	 */
	CREATED("CREATED"),

	/**
	 * ONBOARDING: Depending of the engagement type of the conversation, the conversation stays in the onboarding state as long as the person in the center of the
	 * conversation is doing his onboarding
	 */
	ONBOARDING("ONBOARDING"),

	/**
	 * REBOARDING: When a message is send to an unassigned conversation, the conversation first is put into the reboarding state as long as the person in the center
	 * of the conversation is doing the reboarding.
	 */
	REBOARDING("REBOARDING"),

	/**
	 * QUEUED: Depending of the engagement type of the conversation, the conversation is put in the queued state when it is inside the queue.
	 */
	QUEUED("QUEUED"),

	/**
	 * ACTIVE: Conversation is active
	 */
	ACTIVE("ACTIVE"),

	/**
	 * UNASSIGNED: After there is no assignee of a conversation anymore, the conversation goes to unassigned state until a message from a visitor is written to
	 * start reboarding again, or until the conversation is requeued.
	 */
	UNASSIGNED("UNASSIGNED"),

	/**
	 * OFFBOARDING: Conversation is being ended
	 */
	OFFBOARDING("OFFBOARDING"),

	/**
	 * ENDED: Conversation is ended
	 */
	ENDED("ENDED");

	private String value;

	EConversationState(String value) {
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
	public static EConversationState fromValue(String value) {
		for (EConversationState b : EConversationState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
