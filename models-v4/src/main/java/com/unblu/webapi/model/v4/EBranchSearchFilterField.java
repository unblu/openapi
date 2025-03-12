
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchSearchFilterField
 */
public enum EBranchSearchFilterField {

	/**
	 * NAME: Filter by the &#39;name&#39; attribute
	 */
	NAME("NAME");

	private String value;

	EBranchSearchFilterField(String value) {
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
	public static EBranchSearchFilterField fromValue(String value) {
		for (EBranchSearchFilterField b : EBranchSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
