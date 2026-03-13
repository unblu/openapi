
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAccountIngressSearchFilterField
 */
public enum EAccountIngressSearchFilterField {

	/**
	 * ORIGIN: Filter by the &#39;origin&#39; attribute
	 */
	ORIGIN("ORIGIN"),

	/**
	 * ENTRY_PATH: Filter by the &#39;entryPath&#39; attribute
	 */
	ENTRY_PATH("ENTRY_PATH"),

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Filter by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EAccountIngressSearchFilterField(String value) {
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
	public static EAccountIngressSearchFilterField fromValue(String value) {
		for (EAccountIngressSearchFilterField b : EAccountIngressSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
