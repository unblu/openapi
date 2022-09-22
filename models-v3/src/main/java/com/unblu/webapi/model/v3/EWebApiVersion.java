
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Version of the Web-API. Version of API corresponds to a path element of the request URL. E.g.: /rest/v3/&amp;lt;service&amp;gt;/...
 */
public enum EWebApiVersion {

	/**
	 * V1: Version 1 of the Web-API. Introduced with Unblu 4.x.
	 */
	V1("V1"),

	/**
	 * V2: Version 2 of the Web-API. Introduced with Unblu 5.
	 */
	V2("V2"),

	/**
	 * V3: Version 3 of the Web-API. Introduced with Unblu 6.
	 */
	V3("V3");

	private String value;

	EWebApiVersion(String value) {
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
	public static EWebApiVersion fromValue(String value) {
		for (EWebApiVersion b : EWebApiVersion.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
