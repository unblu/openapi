
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Collaboration layer types for logging events
 */
public enum ECollaborationLayerEventSourceType {

	/**
	 * UNIVERSAL_COBROWSING: Event type for universal co-browsing
	 */
	UNIVERSAL_COBROWSING("UNIVERSAL_COBROWSING"),

	/**
	 * EMBEDDED_COBROWSING: Event type for embedded co-browsing
	 */
	EMBEDDED_COBROWSING("EMBEDDED_COBROWSING"),

	/**
	 * DOCUMENT_COBROWSING: Event type for document co-browsing
	 */
	DOCUMENT_COBROWSING("DOCUMENT_COBROWSING");

	private String value;

	ECollaborationLayerEventSourceType(String value) {
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
	public static ECollaborationLayerEventSourceType fromValue(String value) {
		for (ECollaborationLayerEventSourceType b : ECollaborationLayerEventSourceType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
