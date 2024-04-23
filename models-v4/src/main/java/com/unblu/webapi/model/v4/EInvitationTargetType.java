
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EInvitationTargetType
 */
public enum EInvitationTargetType {

	/**
	 * ANONYMOUS
	 */
	ANONYMOUS("ANONYMOUS"),

	/**
	 * VISITOR
	 */
	VISITOR("VISITOR"),

	/**
	 * AGENT
	 */
	AGENT("AGENT"),

	/**
	 * TEAM
	 */
	TEAM("TEAM"),

	/**
	 * NAMED_AREA
	 */
	NAMED_AREA("NAMED_AREA"),

	/**
	 * ACCOUNT
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
