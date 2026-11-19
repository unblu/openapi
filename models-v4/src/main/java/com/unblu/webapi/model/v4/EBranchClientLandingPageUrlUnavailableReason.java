
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Why no landing page URL could be created for a Branch client
 */
public enum EBranchClientLandingPageUrlUnavailableReason {

	/**
	 * NO_BASE_URL: Neither the Branch client nor the account configures a landing page base URL
	 */
	NO_BASE_URL("NO_BASE_URL"),

	/**
	 * UNKNOWN_API_KEY: The API key of the Branch client doesn&#39;t exist in the account
	 */
	UNKNOWN_API_KEY("UNKNOWN_API_KEY"),

	/**
	 * NO_API_KEY: The Branch client has no API key of its own, and the account has no API key
	 */
	NO_API_KEY("NO_API_KEY");

	private String value;

	EBranchClientLandingPageUrlUnavailableReason(String value) {
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
	public static EBranchClientLandingPageUrlUnavailableReason fromValue(String value) {
		for (EBranchClientLandingPageUrlUnavailableReason b : EBranchClientLandingPageUrlUnavailableReason.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
