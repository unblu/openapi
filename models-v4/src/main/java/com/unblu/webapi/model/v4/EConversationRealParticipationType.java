
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * This enum contains all \&quot;real\&quot; participation types within a conversation: &lt;ul&gt;
 * &lt;li&gt;&lt;b&gt;&#x60;EConversationParticipationType&#x60;&lt;/b&gt; All types including non-human ones
 * &lt;li&gt;&lt;b&gt;&#x60;ENonVisitorParticipationType&#x60;&lt;/b&gt; All types excluding visitors
 * &lt;li&gt;&lt;b&gt;&#x60;EConversationImpactingParticipationType&#x60;&lt;/b&gt; All human participation types (No recorder)
 * &lt;li&gt;&lt;b&gt;EConversationRealParticipationType}&lt;/b&gt; Only the participation types that actually create a &#x60;ConversationParticipation&#x60;
 * (No ghost or recorder) &lt;/ul&gt;
 */
public enum EConversationRealParticipationType {

	/**
	 * ASSIGNED_AGENT
	 */
	ASSIGNED_AGENT("ASSIGNED_AGENT"),

	/**
	 * CONTEXT_PERSON
	 */
	CONTEXT_PERSON("CONTEXT_PERSON"),

	/**
	 * SECONDARY_AGENT
	 */
	SECONDARY_AGENT("SECONDARY_AGENT"),

	/**
	 * SECONDARY_VISITOR
	 */
	SECONDARY_VISITOR("SECONDARY_VISITOR");

	private String value;

	EConversationRealParticipationType(String value) {
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
	public static EConversationRealParticipationType fromValue(String value) {
		for (EConversationRealParticipationType b : EConversationRealParticipationType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
