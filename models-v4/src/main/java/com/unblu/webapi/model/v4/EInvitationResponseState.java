
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The state of the response for an invitation itself or one of its secondary targets
 */
public enum EInvitationResponseState {

	/**
	 * PENDING: The response is pending. The user did not answer it yet.
	 */
	PENDING("PENDING"),

	/**
	 * DECLINED: The user declined the response and therefore will not accept the invitation.
	 */
	DECLINED("DECLINED"),

	/**
	 * IGNORED: The user ignored this invitation and the escalation should proceed
	 */
	IGNORED("IGNORED"),

	/**
	 * CANCELED: The invitation was canceled for that user.
	 */
	CANCELED("CANCELED"),

	/**
	 * ACCEPTED: The user accepted the invitation.
	 */
	ACCEPTED("ACCEPTED");

	private String value;

	EInvitationResponseState(String value) {
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
	public static EInvitationResponseState fromValue(String value) {
		for (EInvitationResponseState b : EInvitationResponseState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
