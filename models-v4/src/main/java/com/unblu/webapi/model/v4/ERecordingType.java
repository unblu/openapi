
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of a built-in conversation recording: audio and video, or audio only
 */
public enum ERecordingType {

	/**
	 * AUDIO: Audio only
	 */
	AUDIO("AUDIO"),

	/**
	 * AUDIO_VIDEO: Audio and video
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
