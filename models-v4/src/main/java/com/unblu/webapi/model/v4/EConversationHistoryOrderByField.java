
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationHistoryOrderByField
 */
public enum EConversationHistoryOrderByField {

	/**
	 * CREATION_TIMESTAMP: Sort by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * END_TIMESTAMP: Sort by the &#39;endTimestamp&#39; attribute
	 */
	END_TIMESTAMP("END_TIMESTAMP"),

	/**
	 * SCHEDULED_TIMESTAMP: Sort by the &#39;scheduledTimestamp&#39; attribute
	 */
	SCHEDULED_TIMESTAMP("SCHEDULED_TIMESTAMP"),

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * TOPIC: Sort by the &#39;topic&#39; attribute
	 */
	TOPIC("TOPIC"),

	/**
	 * ASSIGNEE_PERSON_ID: Sort by the &#39;assigneePersonId&#39; attribute
	 */
	ASSIGNEE_PERSON_ID("ASSIGNEE_PERSON_ID"),

	/**
	 * CONTEXT_PERSON_ID: Sort by the &#39;contextPersonId&#39; attribute
	 */
	CONTEXT_PERSON_ID("CONTEXT_PERSON_ID"),

	/**
	 * AWAITED_PERSON: Sort by the &#39;awaitedPerson&#39; attribute
	 */
	AWAITED_PERSON("AWAITED_PERSON"),

	/**
	 * AWAITED_PERSON_CHANGE_TIMESTAMP: Sort by the &#39;awaitedPersonChangeTimestamp&#39; attribute
	 */
	AWAITED_PERSON_CHANGE_TIMESTAMP("AWAITED_PERSON_CHANGE_TIMESTAMP"),

	/**
	 * STATE: Sort by the &#39;state&#39; attribute
	 */
	STATE("STATE"),

	/**
	 * INITIAL_ENGAGEMENT_TYPE: Sort by the &#39;initialEngagementType&#39; attribute
	 */
	INITIAL_ENGAGEMENT_TYPE("INITIAL_ENGAGEMENT_TYPE"),

	/**
	 * LOCALE: Sort by the &#39;locale&#39; attribute
	 */
	LOCALE("LOCALE"),

	/**
	 * TOKBOX_SESSION_ID: Sort by the &#39;tokboxSessionId&#39; attribute
	 */
	TOKBOX_SESSION_ID("TOKBOX_SESSION_ID"),

	/**
	 * CONVERSATION_TEMPLATE_ID: Sort by the &#39;conversationTemplateId&#39; attribute
	 */
	CONVERSATION_TEMPLATE_ID("CONVERSATION_TEMPLATE_ID"),

	/**
	 * EXTERNAL_MESSENGER_CHANNEL_ID: Sort by the &#39;externalMessengerChannelId&#39; attribute
	 */
	EXTERNAL_MESSENGER_CHANNEL_ID("EXTERNAL_MESSENGER_CHANNEL_ID"),

	/**
	 * SOURCE_ID: Sort by the &#39;sourceId&#39; attribute
	 */
	SOURCE_ID("SOURCE_ID"),

	/**
	 * END_REASON: Sort by the &#39;endReason&#39; attribute
	 */
	END_REASON("END_REASON"),

	/**
	 * RECIPIENT_ID: Sort by the &#39;recipientId&#39; attribute
	 */
	RECIPIENT_ID("RECIPIENT_ID"),

	/**
	 * RECIPIENT_TYPE: Sort by the &#39;recipientType&#39; attribute
	 */
	RECIPIENT_TYPE("RECIPIENT_TYPE"),

	/**
	 * LAST_MESSAGE_TIMESTAMP: Sort by the &#39;lastMessageTimestamp&#39; attribute
	 */
	LAST_MESSAGE_TIMESTAMP("LAST_MESSAGE_TIMESTAMP");

	private String value;

	EConversationHistoryOrderByField(String value) {
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
	public static EConversationHistoryOrderByField fromValue(String value) {
		for (EConversationHistoryOrderByField b : EConversationHistoryOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
