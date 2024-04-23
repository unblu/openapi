
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationInvitationOrderByField
 */
public enum EConversationInvitationOrderByField {

	/**
	 * TYPE: Sort by the &#39;type&#39; attribute
	 */
	TYPE("TYPE"),

	/**
	 * TARGET_TYPE: Sort by the &#39;targetType&#39; attribute
	 */
	TARGET_TYPE("TARGET_TYPE"),

	/**
	 * CONVERSATION_ID: Sort by the &#39;conversationId&#39; attribute
	 */
	CONVERSATION_ID("CONVERSATION_ID"),

	/**
	 * TARGET_ID: Sort by the &#39;targetId&#39; attribute
	 */
	TARGET_ID("TARGET_ID"),

	/**
	 * EXPIRATION_TIMESTAMP: Sort by the &#39;expirationTimestamp&#39; attribute
	 */
	EXPIRATION_TIMESTAMP("EXPIRATION_TIMESTAMP"),

	/**
	 * CREATION_TIMESTAMP: Sort by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * CREATOR_TYPE: Sort by the &#39;creatorType&#39; attribute
	 */
	CREATOR_TYPE("CREATOR_TYPE"),

	/**
	 * CREATOR_ID: Sort by the &#39;creatorId&#39; attribute
	 */
	CREATOR_ID("CREATOR_ID"),

	/**
	 * REDEEMER_PERSON_ID: Sort by the &#39;redeemerPersonId&#39; attribute
	 */
	REDEEMER_PERSON_ID("REDEEMER_PERSON_ID"),

	/**
	 * SUBTYPE: Sort by the &#39;subtype&#39; attribute
	 */
	SUBTYPE("SUBTYPE");

	private String value;

	EConversationInvitationOrderByField(String value) {
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
	public static EConversationInvitationOrderByField fromValue(String value) {
		for (EConversationInvitationOrderByField b : EConversationInvitationOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
