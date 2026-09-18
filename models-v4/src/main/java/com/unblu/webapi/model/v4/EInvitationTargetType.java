
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EInvitationTargetType
 */
public enum EInvitationTargetType {

	/**
	 * ANONYMOUS: The invitation can be redeemed by anybody holding the link, no target ID is needed
	 */
	ANONYMOUS("ANONYMOUS"),

	/**
	 * VISITOR: The invitation targets a specific visitor
	 */
	VISITOR("VISITOR"),

	/**
	 * AGENT: The invitation targets a specific agent
	 */
	AGENT("AGENT"),

	/**
	 * TEAM: The invitation targets a team, so every member of the team can redeem it
	 */
	TEAM("TEAM"),

	/**
	 * NAMED_AREA: The invitation targets a named area
	 */
	NAMED_AREA("NAMED_AREA"),

	/**
	 * ACCOUNT: The invitation targets an account, so every agent of the account can redeem it
	 */
	ACCOUNT("ACCOUNT");

	private String value;

	EInvitationTargetType(String value) {
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
	public static EInvitationTargetType fromValue(String value) {
		for (EInvitationTargetType b : EInvitationTargetType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
