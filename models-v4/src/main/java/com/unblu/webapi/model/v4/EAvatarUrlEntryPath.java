
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The entry path an avatar URL is addressed to.
 */
public enum EAvatarUrlEntryPath {

	/**
	 * PUBLIC: The URL is addressed to the public entry path, the one visitors use.
	 */
	PUBLIC("PUBLIC"),

	/**
	 * INTERNAL: The URL is addressed to the internal entry path, the one agents use.
	 */
	INTERNAL("INTERNAL");

	private String value;

	EAvatarUrlEntryPath(String value) {
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
	public static EAvatarUrlEntryPath fromValue(String value) {
		for (EAvatarUrlEntryPath b : EAvatarUrlEntryPath.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
