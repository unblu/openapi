
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of an owner of an entity
 */
public enum EPropertyOwnerType {

	/**
	 * GLOBAL: Global system is owner
	 */
	GLOBAL("GLOBAL"),

	/**
	 * ACCOUNT: Account is owner
	 */
	ACCOUNT("ACCOUNT"),

	/**
	 * TEAM: Team is owner
	 */
	TEAM("TEAM"),

	/**
	 * USER: User is owner
	 */
	USER("USER"),

	/**
	 * AREA: NamedArea is owner
	 */
	AREA("AREA"),

	/**
	 * APIKEY: ApiKey is owner
	 */
	APIKEY("APIKEY"),

	/**
	 * PERSON: Person
	 */
	PERSON("PERSON"),

	/**
	 * CONVERSATION: Conversation
	 */
	CONVERSATION("CONVERSATION"),

	/**
	 * CONVERSATION_TEMPLATE: Conversation template
	 */
	CONVERSATION_TEMPLATE("CONVERSATION_TEMPLATE"),

	/**
	 * EXTERNAL_MESSENGER_CHANNEL: External messenger channel
	 */
	EXTERNAL_MESSENGER_CHANNEL("EXTERNAL_MESSENGER_CHANNEL"),

	/**
	 * CUSTOM_ACTION: Custom action
	 */
	CUSTOM_ACTION("CUSTOM_ACTION");

	private String value;

	EPropertyOwnerType(String value) {
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
	public static EPropertyOwnerType fromValue(String value) {
		for (EPropertyOwnerType b : EPropertyOwnerType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
