
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAuditChangeSearchFilterField
 */
public enum EAuditChangeSearchFilterField {

	/**
	 * CREATION_TIMESTAMP
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * ENTITY_TYPE
	 */
	ENTITY_TYPE("ENTITY_TYPE"),

	/**
	 * ENTITY_ID
	 */
	ENTITY_ID("ENTITY_ID"),

	/**
	 * OWNER_ID
	 */
	OWNER_ID("OWNER_ID"),

	/**
	 * OWNER_TYPE
	 */
	OWNER_TYPE("OWNER_TYPE"),

	/**
	 * ENTITY_NAME
	 */
	ENTITY_NAME("ENTITY_NAME"),

	/**
	 * INTERACTION_TYPE
	 */
	INTERACTION_TYPE("INTERACTION_TYPE"),

	/**
	 * INTERACTION_NAME
	 */
	INTERACTION_NAME("INTERACTION_NAME"),

	/**
	 * USERNAME
	 */
	USERNAME("USERNAME"),

	/**
	 * USER_ID
	 */
	USER_ID("USER_ID"),

	/**
	 * GLOBAL_CHANGE
	 */
	GLOBAL_CHANGE("GLOBAL_CHANGE"),

	/**
	 * ACCOUNT_CHANGE
	 */
	ACCOUNT_CHANGE("ACCOUNT_CHANGE"),

	/**
	 * CHANGE_TYPE
	 */
	CHANGE_TYPE("CHANGE_TYPE"),

	/**
	 * AUTHORIZATION_ROLE
	 */
	AUTHORIZATION_ROLE("AUTHORIZATION_ROLE"),

	/**
	 * IMPERSONATION_TYPE
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
