
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAuditChangeOrderByField
 */
public enum EAuditChangeOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * CREATION_TIMESTAMP: Sort by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * ENTITY_TYPE: Sort by the &#39;entityType&#39; attribute
	 */
	ENTITY_TYPE("ENTITY_TYPE"),

	/**
	 * INTERACTION_TYPE: Sort by the &#39;interactionType&#39; attribute
	 */
	INTERACTION_TYPE("INTERACTION_TYPE"),

	/**
	 * INTERACTION_NAME: Sort by the &#39;interactionName&#39; attribute
	 */
	INTERACTION_NAME("INTERACTION_NAME"),

	/**
	 * USERNAME: Sort by the &#39;userName&#39; attribute
	 */
	USERNAME("USERNAME"),

	/**
	 * USER_ID: Sort by the &#39;userId&#39; attribute
	 */
	USER_ID("USER_ID"),

	/**
	 * CHANGE_TYPE: Sort by the &#39;changeType&#39; attribute
	 */
	CHANGE_TYPE("CHANGE_TYPE"),

	/**
	 * AUTHORIZATION_ROLE: Sort by the &#39;userRole&#39; attribute
	 */
	AUTHORIZATION_ROLE("AUTHORIZATION_ROLE"),

	/**
	 * IMPERSONATION_TYPE: Sort by the &#39;userImpersonationType&#39; attribute
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
