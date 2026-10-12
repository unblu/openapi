
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The permission tokens a conversation context panel&#39;s iframe may request via its &#x60;allow&#x60; attribute, each carrying the Permissions Policy
 * directive it is written as.
 */
public enum EIframeAllowToken {

	/**
	 * MICROPHONE: The panel may capture audio, through the iframe&#39;s microphone directive
	 */
	MICROPHONE("MICROPHONE"),

	/**
	 * CAMERA: The panel may capture video, through the iframe&#39;s camera directive
	 */
	CAMERA("CAMERA"),

	/**
	 * DISPLAY_CAPTURE: The panel may capture a screen, window or tab, through the iframe&#39;s display-capture directive
	 */
	DISPLAY_CAPTURE("DISPLAY_CAPTURE"),

	/**
	 * FULLSCREEN: The panel may take itself fullscreen, through the iframe&#39;s fullscreen directive
	 */
	FULLSCREEN("FULLSCREEN"),

	/**
	 * GEOLOCATION: The panel may read the viewer&#39;s location, through the iframe&#39;s geolocation directive
	 */
	GEOLOCATION("GEOLOCATION"),

	/**
	 * STORAGE_ACCESS: The panel may read its own cookies and storage even when they are partitioned, through the iframe&#39;s storage-access directive
	 */
	STORAGE_ACCESS("STORAGE_ACCESS"),

	/**
	 * CLIPBOARD_WRITE: The panel may write to the system clipboard, through the iframe&#39;s clipboard-write directive
	 */
	CLIPBOARD_WRITE("CLIPBOARD_WRITE");

	private String value;

	EIframeAllowToken(String value) {
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
	public static EIframeAllowToken fromValue(String value) {
		for (EIframeAllowToken b : EIframeAllowToken.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
