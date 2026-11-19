
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The part of the landing page URL a landing page parameter is added to
 */
public enum EBranchClientLandingPageParameterLocation {

	/**
	 * QUERY: The parameter is added to the query of the URL, so the web server of the landing page receives it
	 */
	QUERY("QUERY"),

	/**
	 * FRAGMENT: The parameter is added to the fragment of the URL, after the Branch client token. Only the landing page&#39;s scripts can read it.
	 */
	FRAGMENT("FRAGMENT");

	private String value;

	EBranchClientLandingPageParameterLocation(String value) {
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
	public static EBranchClientLandingPageParameterLocation fromValue(String value) {
		for (EBranchClientLandingPageParameterLocation b : EBranchClientLandingPageParameterLocation.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
