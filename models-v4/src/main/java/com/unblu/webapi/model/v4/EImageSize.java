
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The standardized image sizes, used for avatar and channel icon images.
 */
public enum EImageSize {

	/**
	 * SMALL: Small image size, 64x64 pixels.
	 */
	SMALL("SMALL"),

	/**
	 * MEDIUM: Medium image size, 128x128 pixels.
	 */
	MEDIUM("MEDIUM"),

	/**
	 * LARGE: Large image size, 256x256 pixels.
	 */
	LARGE("LARGE");

	private String value;

	EImageSize(String value) {
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
	public static EImageSize fromValue(String value) {
		for (EImageSize b : EImageSize.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
