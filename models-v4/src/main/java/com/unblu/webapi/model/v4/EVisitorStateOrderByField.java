
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EVisitorStateOrderByField
 */
public enum EVisitorStateOrderByField {

	/**
	 * PERSON_ID: Sort by the &#39;personId&#39; attribute
	 */
	PERSON_ID("PERSON_ID");

	private String value;

	EVisitorStateOrderByField(String value) {
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
	public static EVisitorStateOrderByField fromValue(String value) {
		for (EVisitorStateOrderByField b : EVisitorStateOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
