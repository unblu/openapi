
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of an Outbound Web-API endpoint.
 */
public enum EOutboundEndpointStatus {

	/**
	 * ENABLED: The endpoint is enabled and calls are allowed.
	 */
	ENABLED("ENABLED"),

	/**
	 * DISABLED: The endpoint is disabled and calls should be avoided, since they won&#39;t work.
	 */
	DISABLED("DISABLED");

	private String value;

	EOutboundEndpointStatus(String value) {
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
	public static EOutboundEndpointStatus fromValue(String value) {
		for (EOutboundEndpointStatus b : EOutboundEndpointStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
