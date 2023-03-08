
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationSearchFilterField
 */
public enum EConversationSearchFilterField {

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * END_TIMESTAMP: Filter by the &#39;endTimestamp&#39; attribute
	 */
	END_TIMESTAMP("END_TIMESTAMP"),

	/**
	 * SCHEDULED_TIMESTAMP: Filter by the &#39;scheduledTimestamp&#39; attribute
	 */
	SCHEDULED_TIMESTAMP("SCHEDULED_TIMESTAMP"),

	/**
	 * INITIAL_ENGAGEMENT_TYPE: Filter by the &#39;initialEngagementType&#39; attribute
	 */
	INITIAL_ENGAGEMENT_TYPE("INITIAL_ENGAGEMENT_TYPE"),

	/**
	 * TOPIC: Filter by the &#39;topic&#39; attribute
	 */
	TOPIC("TOPIC"),

	/**
	 * CONTEXT_PERSON_ID: Filter by the &#39;contextPersonId&#39; attribute
	 */
	CONTEXT_PERSON_ID("CONTEXT_PERSON_ID"),

	/**
	 * AWAITED_PERSON_TYPE: Filter by the &#39;awaitedPersonType&#39; attribute
	 */
	AWAITED_PERSON_TYPE("AWAITED_PERSON_TYPE"),

	/**
	 * AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP: Filter by the &#39;awaitedPersonTypeChangeTimestamp&#39; attribute
	 */
	AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP("AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP"),

	/**
	 * ASSIGNEE_PERSON_ID: Filter by the &#39;assigneePersonId&#39; attribute
	 */
	ASSIGNEE_PERSON_ID("ASSIGNEE_PERSON_ID"),

	/**
	 * PARTICIPANT_PERSON_ID: Filter by the &#39;personId&#39; of the participants
	 */
	PARTICIPANT_PERSON_ID("PARTICIPANT_PERSON_ID"),

	/**
	 * STATE: Filter by the &#39;state&#39; attribute
	 */
	STATE("STATE"),

	/**
	 * END_REASON: Filter by the &#39;endReason&#39; attribute
	 */
	END_REASON("END_REASON"),

	/**
	 * CONVERSATION_TEMPLATE_ID: Filter by the &#39;conversationTemplateId&#39; attribute
	 */
	CONVERSATION_TEMPLATE_ID("CONVERSATION_TEMPLATE_ID"),

	/**
	 * RECIPIENT_ID: Filter by the &#39;id&#39; of the &#39;recipient&#39; attribute
	 */
	RECIPIENT_ID("RECIPIENT_ID"),

	/**
	 * RECIPIENT_TYPE: Filter by the &#39;type&#39; of the &#39;recipient&#39; attribute
	 */
	RECIPIENT_TYPE("RECIPIENT_TYPE"),

	/**
	 * TOKBOX_SESSION_ID: Filter by the &#39;tokboxSessionId&#39; attribute
	 */
	TOKBOX_SESSION_ID("TOKBOX_SESSION_ID");

	private String value;

	EConversationSearchFilterField(String value) {
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
	public static EConversationSearchFilterField fromValue(String value) {
		for (EConversationSearchFilterField b : EConversationSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
