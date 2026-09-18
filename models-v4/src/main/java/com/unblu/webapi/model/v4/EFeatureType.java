
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EFeatureType
 */
public enum EFeatureType {

	/**
	 * SCREEN_SHARING: The screen sharing collaboration layer was used at least once.
	 */
	SCREEN_SHARING("SCREEN_SHARING"),

	/**
	 * EMBEDDED_COBROWSING: The embedded co-browsing collaboration layer was used at least once.
	 */
	EMBEDDED_COBROWSING("EMBEDDED_COBROWSING"),

	/**
	 * CONTEXT_MIGRATION_COBROWSING: The context migration co-browsing collaboration layer was used at least once.
	 */
	CONTEXT_MIGRATION_COBROWSING("CONTEXT_MIGRATION_COBROWSING"),

	/**
	 * MOBILE_COBROWSING: The mobile co-browsing collaboration layer was used at least once.
	 */
	MOBILE_COBROWSING("MOBILE_COBROWSING"),

	/**
	 * DOCUMENT_COBROWSING: The document co-browsing collaboration layer was used at least once.
	 */
	DOCUMENT_COBROWSING("DOCUMENT_COBROWSING"),

	/**
	 * WHITEBOARD: The whiteboard collaboration layer was used at least once.
	 */
	WHITEBOARD("WHITEBOARD"),

	/**
	 * UNIVERSAL_COBROWSING: The universal co-browsing collaboration layer was used at least once.
	 */
	UNIVERSAL_COBROWSING("UNIVERSAL_COBROWSING"),

	/**
	 * DOCUMENT_CAMERA_SHARING: The document camera sharing collaboration layer was used at least once.
	 */
	DOCUMENT_CAMERA_SHARING("DOCUMENT_CAMERA_SHARING"),

	/**
	 * CALLS: The calls feature was used at least once.
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
