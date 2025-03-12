
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchClientOrderByField
 */
public enum EBranchClientOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * NAME: Sort by the &#39;name&#39; attribute
	 */
	NAME("NAME"),

	/**
	 * BRANCH_CLIENT_KEY: Sort by the &#39;branchClientKey&#39; attribute
	 */
	BRANCH_CLIENT_KEY("BRANCH_CLIENT_KEY"),

	/**
	 * BRANCH_ID: Sort by the &#39;branchId&#39; attribute
	 */
	BRANCH_ID("BRANCH_ID");

	private String value;

	EBranchClientOrderByField(String value) {
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
	public static EBranchClientOrderByField fromValue(String value) {
		for (EBranchClientOrderByField b : EBranchClientOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
