
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EFeatureType
 */
public enum EFeatureType {

	/**
	 * SCREEN_SHARING
	 */
	SCREEN_SHARING("SCREEN_SHARING"),

	/**
	 * EMBEDDED_COBROWSING
	 */
	EMBEDDED_COBROWSING("EMBEDDED_COBROWSING"),

	/**
	 * CONTEXT_MIGRATION_COBROWSING
	 */
	CONTEXT_MIGRATION_COBROWSING("CONTEXT_MIGRATION_COBROWSING"),

	/**
	 * MOBILE_COBROWSING
	 */
	MOBILE_COBROWSING("MOBILE_COBROWSING"),

	/**
	 * DOCUMENT_COBROWSING
	 */
	DOCUMENT_COBROWSING("DOCUMENT_COBROWSING"),

	/**
	 * WHITEBOARD
	 */
	WHITEBOARD("WHITEBOARD"),

	/**
	 * UNIVERSAL_COBROWSING
	 */
	UNIVERSAL_COBROWSING("UNIVERSAL_COBROWSING"),

	/**
	 * DOCUMENT_CAMERA_SHARING
	 */
	DOCUMENT_CAMERA_SHARING("DOCUMENT_CAMERA_SHARING"),

	/**
	 * CALLS
	 */
	CALLS("CALLS");

	private String value;

	EFeatureType(String value) {
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
	public static EFeatureType fromValue(String value) {
		for (EFeatureType b : EFeatureType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
