
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * This enum contains all human participation types within a conversation: &lt;ul&gt; &lt;li&gt;&lt;b&gt;&#x60;EConversationParticipationType&#x60;&lt;/b&gt;
 * All types including non-human ones &lt;li&gt;&lt;b&gt;&#x60;ENonVisitorParticipationType&#x60;&lt;/b&gt; All types excluding visitors &lt;li&gt;&lt;b&gt;
 * EConversationImpactingParticipationType&lt;/b&gt; All human participation types (No recorder)
 * &lt;li&gt;&lt;b&gt;&#x60;EConversationRealParticipationType&#x60;&lt;/b&gt; Only the participation types that actually create a
 * &#x60;ConversationParticipation&#x60; (No ghost or recorder) &lt;/ul&gt;
 */
public enum EConversationImpactingParticipationType {

	/**
	 * ASSIGNED_AGENT: The agent the conversation is assigned to
	 */
	ASSIGNED_AGENT("ASSIGNED_AGENT"),

	/**
	 * CONTEXT_PERSON: The visitor the conversation is about
	 */
	CONTEXT_PERSON("CONTEXT_PERSON"),

	/**
	 * SECONDARY_AGENT: An agent who joined the conversation in addition to the assigned agent
	 */
	SECONDARY_AGENT("SECONDARY_AGENT"),

	/**
	 * SECONDARY_VISITOR: A visitor who joined the conversation in addition to the context person
	 */
	SECONDARY_VISITOR("SECONDARY_VISITOR"),

	/**
	 * GHOST: An agent following the conversation without being visible to the other participants
	 */
	GHOST("GHOST");

	private String value;

	EConversationImpactingParticipationType(String value) {
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
	public static EConversationImpactingParticipationType fromValue(String value) {
		for (EConversationImpactingParticipationType b : EConversationImpactingParticipationType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
