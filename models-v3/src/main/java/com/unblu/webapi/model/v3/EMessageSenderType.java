
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of participant who sent a message
 */
public enum EMessageSenderType {

	/**
	 * SELF: The person sent the message themselves
	 */
	SELF("SELF"),

	/**
	 * OTHER_VISITOR: Another visitor sent the message
	 */
	OTHER_VISITOR("OTHER_VISITOR"),

	/**
	 * OTHER_AGENT: Another agent sent the message
	 */
	OTHER_AGENT("OTHER_AGENT"),

	/**
	 * BOT: Bot sent the message
	 */
	BOT("BOT");

	private String value;

	EMessageSenderType(String value) {
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
	public static EMessageSenderType fromValue(String value) {
		for (EMessageSenderType b : EMessageSenderType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
