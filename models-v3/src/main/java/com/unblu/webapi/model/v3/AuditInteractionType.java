
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AuditInteractionType
 */
public enum AuditInteractionType {

	/**
	 * API
	 */
	API("API"),

	/**
	 * RPC
	 */
	RPC("RPC"),

	/**
	 * JOB
	 */
	JOB("JOB"),

	/**
	 * ACTION
	 */
	ACTION("ACTION"),

	/**
	 * INTERNAL
	 */
	INTERNAL("INTERNAL"),

	/**
	 * SYNCJOB
	 */
	SYNCJOB("SYNCJOB");

	private String value;

	AuditInteractionType(String value) {
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
	public static AuditInteractionType fromValue(String value) {
		for (AuditInteractionType b : AuditInteractionType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
