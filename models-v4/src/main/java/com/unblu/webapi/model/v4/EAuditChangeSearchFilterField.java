
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAuditChangeSearchFilterField
 */
public enum EAuditChangeSearchFilterField {

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * ENTITY_TYPE: Filter by the &#39;entityType&#39; attribute
	 */
	ENTITY_TYPE("ENTITY_TYPE"),

	/**
	 * ENTITY_ID: Filter by the &#39;entityId&#39; attribute
	 */
	ENTITY_ID("ENTITY_ID"),

	/**
	 * OWNER_ID: Filter by the &#39;ownerId&#39; attribute
	 */
	OWNER_ID("OWNER_ID"),

	/**
	 * OWNER_TYPE: Filter by the &#39;ownerType&#39; attribute
	 */
	OWNER_TYPE("OWNER_TYPE"),

	/**
	 * ENTITY_NAME: Filter by the &#39;entityName&#39; attribute
	 */
	ENTITY_NAME("ENTITY_NAME"),

	/**
	 * INTERACTION_TYPE: Filter by the &#39;interactionType&#39; attribute
	 */
	INTERACTION_TYPE("INTERACTION_TYPE"),

	/**
	 * INTERACTION_NAME: Filter by the &#39;interactionName&#39; attribute
	 */
	INTERACTION_NAME("INTERACTION_NAME"),

	/**
	 * USERNAME: Filter by the &#39;userName&#39; attribute
	 */
	USERNAME("USERNAME"),

	/**
	 * USER_ID: Filter by the &#39;userId&#39; attribute
	 */
	USER_ID("USER_ID"),

	/**
	 * GLOBAL_CHANGE: Filter by the &#39;globalChange&#39; attribute, which marks changes outside of any account
	 */
	GLOBAL_CHANGE("GLOBAL_CHANGE"),

	/**
	 * ACCOUNT_CHANGE: Filter by the &#39;accountChange&#39; attribute, which marks changes belonging to a single account
	 */
	ACCOUNT_CHANGE("ACCOUNT_CHANGE"),

	/**
	 * CHANGE_TYPE: Filter by the &#39;changeType&#39; attribute
	 */
	CHANGE_TYPE("CHANGE_TYPE"),

	/**
	 * AUTHORIZATION_ROLE: Filter by the &#39;userRole&#39; attribute
	 */
	AUTHORIZATION_ROLE("AUTHORIZATION_ROLE"),

	/**
	 * IMPERSONATION_TYPE: Filter by the &#39;userImpersonationType&#39; attribute
	 */
	IMPERSONATION_TYPE("IMPERSONATION_TYPE");

	private String value;

	EAuditChangeSearchFilterField(String value) {
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
	public static EAuditChangeSearchFilterField fromValue(String value) {
		for (EAuditChangeSearchFilterField b : EAuditChangeSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
