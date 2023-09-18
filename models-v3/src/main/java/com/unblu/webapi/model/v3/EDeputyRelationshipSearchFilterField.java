
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EDeputyRelationshipSearchFilterField
 */
public enum EDeputyRelationshipSearchFilterField {

	/**
	 * AGENT_USER_ID: Filter by the &#39;agentUserId&#39; attribute
	 */
	AGENT_USER_ID("AGENT_USER_ID"),

	/**
	 * DEPUTY_TYPE: Filter by the &#39;deputyType&#39; attribute
	 */
	DEPUTY_TYPE("DEPUTY_TYPE"),

	/**
	 * DEPUTY_ID: Filter by the &#39;deputyId&#39; attribute
	 */
	DEPUTY_ID("DEPUTY_ID"),

	/**
	 * ESCALATION_LEVEL
	 */
	ESCALATION_LEVEL("ESCALATION_LEVEL"),

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Filter by the &#39;modificationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EDeputyRelationshipSearchFilterField(String value) {
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
	public static EDeputyRelationshipSearchFilterField fromValue(String value) {
		for (EDeputyRelationshipSearchFilterField b : EDeputyRelationshipSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
