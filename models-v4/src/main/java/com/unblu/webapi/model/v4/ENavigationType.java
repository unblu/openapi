
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The source of navigation
 */
public enum ENavigationType {

	/**
	 * FULL_PAGE: Full web page was loaded
	 */
	FULL_PAGE("FULL_PAGE"),

	/**
	 * FRAME: URL of an iframe within the web page was loaded
	 */
	FRAME("FRAME"),

	/**
	 * LOCAL_CHANGE: Local navigation (e.g. text fragments) on the web page
	 */
	LOCAL_CHANGE("LOCAL_CHANGE");

	private String value;

	ENavigationType(String value) {
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
	public static ENavigationType fromValue(String value) {
		for (ENavigationType b : ENavigationType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
