
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of link used to download files.
 */
public enum EDownloadLinkType {

	/**
	 * WEB_API: Download URL via the web API
	 */
	WEB_API("WEB_API"),

	/**
	 * AGENT_DESK: Download URL from the Agent Desk
	 */
	AGENT_DESK("AGENT_DESK");

	private String value;

	EDownloadLinkType(String value) {
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
	public static EDownloadLinkType fromValue(String value) {
		for (EDownloadLinkType b : EDownloadLinkType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
