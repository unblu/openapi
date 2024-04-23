
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EPersonTypedSearchFilterField
 */
public enum EPersonTypedSearchFilterField {

	/**
	 * SOURCE_ID: Filter by the &#39;sourceId&#39; attribute
	 */
	SOURCE_ID("SOURCE_ID"),

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
	 * NICKNAME: Filter by the &#39;nickname&#39; attribute
	 */
	NICKNAME("NICKNAME"),

	/**
	 * AUTHORIZATION_ROLE: Filter by the &#39;authorizationRole&#39; attribute
	 */
	AUTHORIZATION_ROLE("AUTHORIZATION_ROLE"),

	/**
	 * EMAIL: Filter by the &#39;email&#39; attribute
	 */
	EMAIL("EMAIL"),

	/**
	 * PHONE: Filter by the &#39;phone&#39; attribute
	 */
	PHONE("PHONE"),

	/**
	 * TEAM_ID: Filter by the &#39;teamId&#39; attribute
	 */
	TEAM_ID("TEAM_ID"),

	/**
	 * PERSON_LABEL_NAME: Filter by the &#39;name&#39; attribute of assigned person labels
	 */
	PERSON_LABEL_NAME("PERSON_LABEL_NAME"),

	/**
	 * COMPOUND: Filter meant for linking other filters with logical AND/OR
	 */
	COMPOUND("COMPOUND");

	private String value;

	EPersonTypedSearchFilterField(String value) {
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
	public static EPersonTypedSearchFilterField fromValue(String value) {
		for (EPersonTypedSearchFilterField b : EPersonTypedSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
