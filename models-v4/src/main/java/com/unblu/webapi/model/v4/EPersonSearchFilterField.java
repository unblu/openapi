
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EPersonSearchFilterField
 */
public enum EPersonSearchFilterField {

	/**
	 * PERSON_SOURCE: Filter by the &#39;personSource&#39; attribute
	 */
	PERSON_SOURCE("PERSON_SOURCE"),

	/**
	 * SOURCE_ID: Filter by the &#39;sourceId&#39; attribute
	 */
	SOURCE_ID("SOURCE_ID"),

	/**
	 * SOURCE_DATA: Filter by the &#39;sourceData&#39; attribute
	 */
	SOURCE_DATA("SOURCE_DATA"),

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
	 * PERSON_TYPE: Filter by the &#39;personType&#39; attribute
	 */
	PERSON_TYPE("PERSON_TYPE"),

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
	 * COMPOUND: Filter for linking other filters with logical AND/OR
	 */
	COMPOUND("COMPOUND");

	private String value;

	EPersonSearchFilterField(String value) {
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
	public static EPersonSearchFilterField fromValue(String value) {
		for (EPersonSearchFilterField b : EPersonSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
