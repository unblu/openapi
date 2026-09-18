
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AuditChangeType
 */
public enum AuditChangeType {

	/**
	 * CREATE: The entity was inserted into the database.
	 */
	CREATE("CREATE"),

	/**
	 * UPDATE: One or more columns of an existing entity were modified.
	 */
	UPDATE("UPDATE"),

	/**
	 * DELETE: The entity was physically removed from the database.
	 */
	DELETE("DELETE"),

	/**
	 * MARK_DELETED: The entity was flagged for deletion but for now it&#39;s still in the database.
	 */
	MARK_DELETED("MARK_DELETED"),

	/**
	 * UNMARK_DELETED: A previously flagged entity was restored to an undeleted state.
	 */
	UNMARK_DELETED("UNMARK_DELETED");

	private String value;

	AuditChangeType(String value) {
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
	public static AuditChangeType fromValue(String value) {
		for (AuditChangeType b : AuditChangeType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
