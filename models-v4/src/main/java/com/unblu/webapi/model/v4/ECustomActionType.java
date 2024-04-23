
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of the custom action
 */
public enum ECustomActionType {

	/**
	 * CONVERSATION: Conversation custom action type
	 */
	CONVERSATION("CONVERSATION"),

	/**
	 * PERSON: Person custom action type
	 */
	PERSON("PERSON"),

	/**
	 * MESSAGE: Message custom action type
	 */
	MESSAGE("MESSAGE");

	private String value;

	ECustomActionType(String value) {
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
	public static ECustomActionType fromValue(String value) {
		for (ECustomActionType b : ECustomActionType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
