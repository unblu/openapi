
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reuses names of values from &#x60;EInvitationStatus&#x60; and adds EXPIRED value.
 */
public enum EInvitationState {

	/**
	 * OPEN: The invitation has been issued and can still be redeemed
	 */
	OPEN("OPEN"),

	/**
	 * REDEEMED: The invitation has been accepted by its target
	 */
	REDEEMED("REDEEMED"),

	/**
	 * REVOKED: The invitation was withdrawn before it was redeemed
	 */
	REVOKED("REVOKED"),

	/**
	 * EXPIRED: The invitation was not redeemed within its validity period
	 */
	EXPIRED("EXPIRED");

	private String value;

	EInvitationState(String value) {
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
	public static EInvitationState fromValue(String value) {
		for (EInvitationState b : EInvitationState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
