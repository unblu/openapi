
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status of the indexing operation of a search index
 */
public enum ESearchIndexReindexOperationStatus {

	/**
	 * REQUESTED: A full indexing was requested
	 */
	REQUESTED("REQUESTED"),

	/**
	 * RUNNING: A full indexing is running
	 */
	RUNNING("RUNNING"),

	/**
	 * CANCELED: A full indexing was canceled
	 */
	CANCELED("CANCELED"),

	/**
	 * COMPLETED: A full indexing was completed
	 */
	COMPLETED("COMPLETED"),

	/**
	 * FAILED: The full indexing failed
	 */
	FAILED("FAILED");

	private String value;

	ESearchIndexReindexOperationStatus(String value) {
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
	public static ESearchIndexReindexOperationStatus fromValue(String value) {
		for (ESearchIndexReindexOperationStatus b : ESearchIndexReindexOperationStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
