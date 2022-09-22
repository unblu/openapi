
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ERecordingStatus
 */
public enum ERecordingStatus {

	/**
	 * PENDING: Recording pending
	 */
	PENDING("PENDING"),

	/**
	 * COMPLETE: Recording completed
	 */
	COMPLETE("COMPLETE");

	private String value;

	ERecordingStatus(String value) {
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
	public static ERecordingStatus fromValue(String value) {
		for (ERecordingStatus b : ERecordingStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
