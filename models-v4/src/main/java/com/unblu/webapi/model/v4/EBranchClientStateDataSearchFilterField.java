
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchClientStateDataSearchFilterField
 */
public enum EBranchClientStateDataSearchFilterField {

	/**
	 * BRANCH_CLIENT_ID: Filter by the &#39;branchClientId&#39; attribute
	 */
	BRANCH_CLIENT_ID("BRANCH_CLIENT_ID"),

	/**
	 * ACTIVE_CONVERSATION_ID: Filter by the &#39;activeConversationId&#39; attribute
	 */
	ACTIVE_CONVERSATION_ID("ACTIVE_CONVERSATION_ID");

	private String value;

	EBranchClientStateDataSearchFilterField(String value) {
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
	public static EBranchClientStateDataSearchFilterField fromValue(String value) {
		for (EBranchClientStateDataSearchFilterField b : EBranchClientStateDataSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
