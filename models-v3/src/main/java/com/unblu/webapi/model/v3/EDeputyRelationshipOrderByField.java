
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EDeputyRelationshipOrderByField
 */
public enum EDeputyRelationshipOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * AGENT_USER_ID: Sort by the &#39;agentUserId&#39; attribute
	 */
	AGENT_USER_ID("AGENT_USER_ID"),

	/**
	 * DEPUTY_TYPE: Sort by the &#39;deputyType&#39; attribute
	 */
	DEPUTY_TYPE("DEPUTY_TYPE"),

	/**
	 * DEPUTY_ID: Sort by the &#39;deputyId&#39; attribute
	 */
	DEPUTY_ID("DEPUTY_ID"),

	/**
	 * ESCALATION_LEVEL: Sort by the &#39;escalationLevel&#39; attribute
	 */
	ESCALATION_LEVEL("ESCALATION_LEVEL"),

	/**
	 * CREATION_TIMESTAMP: Sort by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Sort by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EDeputyRelationshipOrderByField(String value) {
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
	public static EDeputyRelationshipOrderByField fromValue(String value) {
		for (EDeputyRelationshipOrderByField b : EDeputyRelationshipOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
