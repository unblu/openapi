
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchOrderByField
 */
public enum EBranchOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * NAME: Sort by the &#39;name&#39; attribute
	 */
	NAME("NAME");

	private String value;

	EBranchOrderByField(String value) {
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
	public static EBranchOrderByField fromValue(String value) {
		for (EBranchOrderByField b : EBranchOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
