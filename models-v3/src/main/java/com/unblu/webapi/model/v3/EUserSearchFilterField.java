
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EUserSearchFilterField
 */
public enum EUserSearchFilterField {

	/**
	 * FIRST_NAME: Filter by the &#39;firstName&#39; attribute
	 */
	FIRST_NAME("FIRST_NAME"),

	/**
	 * LAST_NAME: Filter by the &#39;lastName&#39; attribute
	 */
	LAST_NAME("LAST_NAME"),

	/**
	 * USERNAME: Filter by the &#39;username&#39; attribute
	 */
	USERNAME("USERNAME"),

	/**
	 * TEAM_ID: Filter by the &#39;teamId&#39; attribute
	 */
	TEAM_ID("TEAM_ID"),

	/**
	 * EMAIL: Filter by the &#39;email&#39; attribute
	 */
	EMAIL("EMAIL"),

	/**
	 * AUTHORIZATION_ROLE: Filter by the &#39;authorizationRole&#39; attribute
	 */
	AUTHORIZATION_ROLE("AUTHORIZATION_ROLE"),

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Filter by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP"),

	/**
	 * VIRTUAL_USER: Filter by the &#39;virtualUser&#39; attribute
	 */
	VIRTUAL_USER("VIRTUAL_USER"),

	/**
	 * EXTERNALLY_MANAGED: Filter by the &#39;externallyManaged&#39; attribute
	 */
	EXTERNALLY_MANAGED("EXTERNALLY_MANAGED");

	private String value;

	EUserSearchFilterField(String value) {
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
	public static EUserSearchFilterField fromValue(String value) {
		for (EUserSearchFilterField b : EUserSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
