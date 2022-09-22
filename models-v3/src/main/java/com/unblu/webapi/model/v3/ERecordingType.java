
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ERecordingType
 */
public enum ERecordingType {

	/**
	 * AUDIO: Recording of type AUDIO
	 */
	AUDIO("AUDIO"),

	/**
	 * AUDIO_VIDEO: Recording of type AUDIO and VIDEO
	 */
	AUDIO_VIDEO("AUDIO_VIDEO");

	private String value;

	ERecordingType(String value) {
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
	public static ERecordingType fromValue(String value) {
		for (ERecordingType b : ERecordingType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
