
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchClientSearchFilterField
 */
public enum EBranchClientSearchFilterField {

	/**
	 * NAME: Filter by the &#39;name&#39; attribute
	 */
	NAME("NAME"),

	/**
	 * BRANCH_CLIENT_KEY: Filter by the &#39;branchClientKey&#39; attribute
	 */
	BRANCH_CLIENT_KEY("BRANCH_CLIENT_KEY"),

	/**
	 * BRANCH_ID: Filter by the &#39;branchId&#39; attribute
	 */
	BRANCH_ID("BRANCH_ID");

	private String value;

	EBranchClientSearchFilterField(String value) {
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
	public static EBranchClientSearchFilterField fromValue(String value) {
		for (EBranchClientSearchFilterField b : EBranchClientSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
