
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reuses names of values from &#x60;EInvitationStatus&#x60; and adds EXPIRED value.
 */
public enum EInvitationState {

	/**
	 * OPEN
	 */
	OPEN("OPEN"),

	/**
	 * REDEEMED
	 */
	REDEEMED("REDEEMED"),

	/**
	 * REVOKED
	 */
	REVOKED("REVOKED"),

	/**
	 * EXPIRED
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