
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents the outcome of a queue interaction (the way an invitation/reservation was resolved).
 */
public enum EQueueInteractionType {

	/**
	 * VISITOR_LEFT: The visitor left the conversation.
	 */
	VISITOR_LEFT("VISITOR_LEFT"),

	/**
	 * INVITATION_REDEEMED: The invitation (without reservation) was redeemed.
	 */
	INVITATION_REDEEMED("INVITATION_REDEEMED"),

	/**
	 * INVITATION_REVOKED: The invitation (without reservation) was revoked.
	 */
	INVITATION_REVOKED("INVITATION_REVOKED"),

	/**
	 * RESERVATION_REDEEMED: The invitation (with reservation) was redeemed.
	 */
	RESERVATION_REDEEMED("RESERVATION_REDEEMED"),

	/**
	 * RESERVATION_CANCELLED: The invitation (with reservation) was cancelled.
	 */
	RESERVATION_CANCELLED("RESERVATION_CANCELLED"),

	/**
	 * RESERVATION_DECLINED: The invitation (with reservation) was declined.
	 */
	RESERVATION_DECLINED("RESERVATION_DECLINED"),

	/**
	 * RESERVATION_TIMEDOUT: The reservation timed out without being accepted, declined or cancelled.
	 */
	RESERVATION_TIMEDOUT("RESERVATION_TIMEDOUT");

	private String value;

	EQueueInteractionType(String value) {
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
	public static EQueueInteractionType fromValue(String value) {
		for (EQueueInteractionType b : EQueueInteractionType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
