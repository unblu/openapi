
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAuditChangeOrderByField
 */
public enum EAuditChangeOrderByField {

	/**
	 * ID
	 */
	ID("ID"),

	/**
	 * CREATION_TIMESTAMP
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * ENTITY_TYPE
	 */
	ENTITY_TYPE("ENTITY_TYPE"),

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

	EAuditChangeOrderByField(String value) {
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
	public static EAuditChangeOrderByField fromValue(String value) {
		for (EAuditChangeOrderByField b : EAuditChangeOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
