
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The state of a participation inside a conversation. Following transitions are possible: &lt;ul&gt; &lt;li&gt;&#x60;CREATED&#x60; --&gt;
 * &#x60;ONBOARDING&#x60;, &#x60;OFFBOARDING&#x60;, &#x60;ACTIVE&#x60;&lt;/li&gt; &lt;li&gt;&#x60;ONBOARDING&#x60; --&gt; &#x60;ACTIVE&#x60;,
 * &#x60;OFFBOARDING&#x60;&lt;/li&gt; &lt;li&gt;&#x60;ACTIVE&#x60; --&gt; &#x60;OFFBOARDING&#x60;&lt;/li&gt; &lt;li&gt;&#x60;OFFBOARDING&#x60; --&gt;
 * &#x60;ENDED&#x60;&lt;/li&gt; &lt;li&gt;&#x60;ENDED&#x60; --&gt; none&lt;/li&gt; &lt;/ul&gt;
 */
public enum EConversationParticipationState {

	/**
	 * CREATED: Participant has been created
	 */
	CREATED("CREATED"),

	/**
	 * ONBOARDING: Participant is doing the onboarding to join the conversation
	 */
	ONBOARDING("ONBOARDING"),

	/**
	 * ACTIVE: Participant has joined the conversation and is an active member
	 */
	ACTIVE("ACTIVE"),

	/**
	 * OFFBOARDING: Participant is doing the offboarding to leave the conversation
	 */
	OFFBOARDING("OFFBOARDING"),

	/**
	 * ENDED: Participant is no longer present in the conversation
	 */
	ENDED("ENDED");

	private String value;

	EConversationParticipationState(String value) {
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
	public static EConversationParticipationState fromValue(String value) {
		for (EConversationParticipationState b : EConversationParticipationState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
