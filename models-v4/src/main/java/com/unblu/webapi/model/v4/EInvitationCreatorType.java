
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of the person/system who created an invitation
 */
public enum EInvitationCreatorType {

	/**
	 * WEB_API: Invitation created with the API
	 */
	WEB_API("WEB_API"),

	/**
	 * SYSTEM: Invitation created by the system
	 */
	SYSTEM("SYSTEM"),

	/**
	 * AGENT: Invitation created by an agent
	 */
	AGENT("AGENT"),

	/**
	 * VISITOR: Invitation created by a visitor
	 */
	VISITOR("VISITOR");

	private String value;

	EInvitationCreatorType(String value) {
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
	public static EInvitationCreatorType fromValue(String value) {
		for (EInvitationCreatorType b : EInvitationCreatorType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
