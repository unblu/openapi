
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EPersonOrderByField
 */
public enum EPersonOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * PERSON_SOURCE: Sort by the &#39;personSource&#39; attribute
	 */
	PERSON_SOURCE("PERSON_SOURCE"),

	/**
	 * SOURCE_ID: Sort by the &#39;sourceId&#39; attribute
	 */
	SOURCE_ID("SOURCE_ID"),

	/**
	 * SOURCE_DATA: Sort by the &#39;sourceData&#39; attribute
	 */
	SOURCE_DATA("SOURCE_DATA"),

	/**
	 * FIRST_NAME: Sort by the &#39;firstName&#39; attribute
	 */
	FIRST_NAME("FIRST_NAME"),

	/**
	 * LAST_NAME: Sort by the &#39;lastName&#39; attribute
	 */
	LAST_NAME("LAST_NAME"),

	/**
	 * USERNAME: Sort by the &#39;username&#39; attribute
	 */
	USERNAME("USERNAME"),

	/**
	 * NICKNAME: Sort by the &#39;nickname&#39; attribute
	 */
	NICKNAME("NICKNAME"),

	/**
	 * PERSON_TYPE: Sort by the &#39;personType&#39; attribute
	 */
	PERSON_TYPE("PERSON_TYPE"),

	/**
	 * AUTHORIZATION_ROLE: Sort by the &#39;authorizationRole&#39; attribute
	 */
	AUTHORIZATION_ROLE("AUTHORIZATION_ROLE"),

	/**
	 * EMAIL: Sort by the &#39;email&#39; attribute
	 */
	EMAIL("EMAIL"),

	/**
	 * PHONE: Sort by the &#39;phone&#39; attribute
	 */
	PHONE("PHONE"),

	/**
	 * TEAM_ID: Sort by the &#39;teamId&#39; attribute
	 */
	TEAM_ID("TEAM_ID");

	private String value;

	EPersonOrderByField(String value) {
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
	public static EPersonOrderByField fromValue(String value) {
		for (EPersonOrderByField b : EPersonOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
