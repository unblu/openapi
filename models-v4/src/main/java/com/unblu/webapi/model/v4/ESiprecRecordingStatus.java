
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The outcome of a SIPREC recording. Losing one of two recording servers doesn&#39;t change the outcome.
 */
public enum ESiprecRecordingStatus {

	/**
	 * RECORDING: At least one recording server is recording the call or reconnecting to it
	 */
	RECORDING("RECORDING"),

	/**
	 * STOPPED: The recording ended normally: it was stopped, or the call ended, while at least one recording server was recording
	 */
	STOPPED("STOPPED"),

	/**
	 * FAILED: No recording server records anymore and none is reconnecting: no recording server accepted the recording, every recording server was lost during the
	 * call, or SIPREC is the recording system but isn&#39;t configured
	 */
	FAILED("FAILED");

	private String value;

	ESiprecRecordingStatus(String value) {
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
	public static ESiprecRecordingStatus fromValue(String value) {
		for (ESiprecRecordingStatus b : ESiprecRecordingStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
