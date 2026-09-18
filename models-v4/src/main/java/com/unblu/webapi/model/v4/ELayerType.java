
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of collaboration layer in a conversation
 */
public enum ELayerType {

	/**
	 * SCREEN_SHARING: The agent or the visitor shares their whole screen
	 */
	SCREEN_SHARING("SCREEN_SHARING"),

	/**
	 * EMBEDDED_COBROWSING: Co-browsing of a website that embeds the Unblu JavaScript library
	 */
	EMBEDDED_COBROWSING("EMBEDDED_COBROWSING"),

	/**
	 * CONTEXT_MIGRATION_COBROWSING: Co-browsing that starts on one website and continues on another one
	 */
	CONTEXT_MIGRATION_COBROWSING("CONTEXT_MIGRATION_COBROWSING"),

	/**
	 * MOBILE_COBROWSING: Mobile co-apping: sharing a mobile app that embeds the Unblu mobile SDK
	 */
	MOBILE_COBROWSING("MOBILE_COBROWSING"),

	/**
	 * DOCUMENT_COBROWSING: Collaboration on a document uploaded to the conversation
	 */
	DOCUMENT_COBROWSING("DOCUMENT_COBROWSING"),

	/**
	 * WHITEBOARD: A shared whiteboard the participants can draw on
	 */
	WHITEBOARD("WHITEBOARD"),

	/**
	 * UNIVERSAL_COBROWSING: Co-browsing of a website that does not embed the Unblu JavaScript library
	 */
	UNIVERSAL_COBROWSING("UNIVERSAL_COBROWSING"),

	/**
	 * DOCUMENT_CAMERA_SHARING: Sharing of a live camera image of a physical document
	 */
	DOCUMENT_CAMERA_SHARING("DOCUMENT_CAMERA_SHARING");

	private String value;

	ELayerType(String value) {
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
	public static ELayerType fromValue(String value) {
		for (ELayerType b : ELayerType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
