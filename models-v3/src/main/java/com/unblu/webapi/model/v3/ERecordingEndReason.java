
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ERecordingEndReason
 */
public enum ERecordingEndReason {

	/**
	 * NORMAL: Recording ended normally
	 */
	NORMAL("NORMAL"),

	/**
	 * ABORT_SYSTEM: Recording aborted by the system
	 */
	ABORT_SYSTEM("ABORT_SYSTEM"),

	/**
	 * ABORT_TIMEOUT: Recording aborted due to timeout
	 */
	ABORT_TIMEOUT("ABORT_TIMEOUT"),

	/**
	 * ABORT_BLOBSTORE_FAILURE: Recording aborted due to an error with the blob
	 */
	ABORT_BLOBSTORE_FAILURE("ABORT_BLOBSTORE_FAILURE"),

	/**
	 * ABORT_UNEXPECT: Recording aborted unexpectedly
	 */
	ABORT_UNEXPECT("ABORT_UNEXPECT");

	private String value;

	ERecordingEndReason(String value) {
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
	public static ERecordingEndReason fromValue(String value) {
		for (ERecordingEndReason b : ERecordingEndReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
