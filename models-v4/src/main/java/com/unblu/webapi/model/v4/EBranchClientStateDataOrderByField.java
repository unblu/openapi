
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchClientStateDataOrderByField
 */
public enum EBranchClientStateDataOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * BRANCH_CLIENT_ID: Sort by the &#39;branchClientId&#39; attribute
	 */
	BRANCH_CLIENT_ID("BRANCH_CLIENT_ID");

	private String value;

	EBranchClientStateDataOrderByField(String value) {
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
	public static EBranchClientStateDataOrderByField fromValue(String value) {
		for (EBranchClientStateDataOrderByField b : EBranchClientStateDataOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
