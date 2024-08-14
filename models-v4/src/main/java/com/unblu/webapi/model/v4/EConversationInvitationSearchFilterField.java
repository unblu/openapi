
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationInvitationSearchFilterField
 */
public enum EConversationInvitationSearchFilterField {

	/**
	 * INVITATION_TYPE: Filter by the &#39;type&#39; attribute
	 */
	INVITATION_TYPE("INVITATION_TYPE"),

	/**
	 * TARGET_TYPE: Filter by the &#39;targetType&#39; attribute
	 */
	TARGET_TYPE("TARGET_TYPE"),

	/**
	 * CONVERSATION_ID: Filter by the &#39;conversationId&#39; attribute
	 */
	CONVERSATION_ID("CONVERSATION_ID"),

	/**
	 * TARGET_ID: Filter by the &#39;targetId&#39; attribute
	 */
	TARGET_ID("TARGET_ID"),

	/**
	 * EXPIRATION_TIMESTAMP: Filter by the &#39;expirationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	EXPIRATION_TIMESTAMP("EXPIRATION_TIMESTAMP"),

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * RESOLUTION_TIMESTAMP: Filter by the &#39;resolutionTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	RESOLUTION_TIMESTAMP("RESOLUTION_TIMESTAMP"),

	/**
	 * CREATOR_TYPE: Filter by the &#39;creatorType&#39; attribute
	 */
	CREATOR_TYPE("CREATOR_TYPE"),

	/**
	 * CREATOR_PERSON_ID: Filter by the &#39;creatorId&#39; attribute
	 */
	CREATOR_PERSON_ID("CREATOR_PERSON_ID"),

	/**
	 * REDEEMING_PERSON_ID: Filter by the &#39;redeemerPersonId&#39; attribute
	 */
	REDEEMING_PERSON_ID("REDEEMING_PERSON_ID"),

	/**
	 * INVITATION_STATE: Filter by the &#39;invitationState&#39; attribute
	 */
	INVITATION_STATE("INVITATION_STATE");

	private String value;

	EConversationInvitationSearchFilterField(String value) {
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
	public static EConversationInvitationSearchFilterField fromValue(String value) {
		for (EConversationInvitationSearchFilterField b : EConversationInvitationSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
