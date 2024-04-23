
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AuditChangeType
 */
public enum AuditChangeType {

	/**
	 * CREATE
	 */
	CREATE("CREATE"),

	/**
	 * UPDATE
	 */
	UPDATE("UPDATE"),

	/**
	 * DELETE
	 */
	DELETE("DELETE"),

	/**
	 * MARK_DELETED
	 */
	MARK_DELETED("MARK_DELETED"),

	/**
	 * UNMARK_DELETED
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
