
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EVisitorStateSearchFilterField
 */
public enum EVisitorStateSearchFilterField {

	/**
	 * PERSON_ID: Filter by the &#39;personId&#39; attribute
	 */
	PERSON_ID("PERSON_ID"),

	/**
	 * ONLINE_STATE: Filter by the &#39;onlineState&#39; attribute
	 */
	ONLINE_STATE("ONLINE_STATE");

	private String value;

	EVisitorStateSearchFilterField(String value) {
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
	public static EVisitorStateSearchFilterField fromValue(String value) {
		for (EVisitorStateSearchFilterField b : EVisitorStateSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
