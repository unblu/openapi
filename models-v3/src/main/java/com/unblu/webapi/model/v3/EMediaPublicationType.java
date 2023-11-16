
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The media being published during the participation of a call
 */
public enum EMediaPublicationType {

	/**
	 * AUDIO: Only audio is being shared (typically through a microphone)
	 */
	AUDIO("AUDIO"),

	/**
	 * VIDEO: Only video is being shared (typically through a camera)
	 */
	VIDEO("VIDEO"),

	/**
	 * AUDIO_VIDEO: Both audio and video are being shared (typically microphone &amp; camera)
	 */
	AUDIO_VIDEO("AUDIO_VIDEO"),

	/**
	 * NONE: No media is being published, the participant is only watching / listening to the call
	 */
	NONE("NONE");

	private String value;

	EMediaPublicationType(String value) {
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
	public static EMediaPublicationType fromValue(String value) {
		for (EMediaPublicationType b : EMediaPublicationType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
