
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status of the index mapping for an account
 */
public enum EIndexMappingStatus {

	/**
	 * UP_TO_DATE: The deployed index mapping is up to date
	 */
	UP_TO_DATE("UP_TO_DATE"),

	/**
	 * COMPATIBLE: The deployed index mapping is compatible with the current one and can be use for read and write operations
	 */
	COMPATIBLE("COMPATIBLE"),

	/**
	 * SHOULD_REINDEX: The deployed index mapping is outdated but can still be used in read-only mode, that is, for search operations
	 */
	SHOULD_REINDEX("SHOULD_REINDEX"),

	/**
	 * MUST_REINDEX: The deployed index mapping is outdated and cannot be used anymore
	 */
	MUST_REINDEX("MUST_REINDEX");

	private String value;

	EIndexMappingStatus(String value) {
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
	public static EIndexMappingStatus fromValue(String value) {
		for (EIndexMappingStatus b : EIndexMappingStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
