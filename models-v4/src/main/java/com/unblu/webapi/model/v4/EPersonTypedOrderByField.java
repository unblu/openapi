
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EPersonTypedOrderByField
 */
public enum EPersonTypedOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * SOURCE_ID: Sort by the &#39;sourceId&#39; attribute
	 */
	SOURCE_ID("SOURCE_ID"),

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

	EPersonTypedOrderByField(String value) {
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
	public static EPersonTypedOrderByField fromValue(String value) {
		for (EPersonTypedOrderByField b : EPersonTypedOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
