
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAccountIngressOrderByField
 */
public enum EAccountIngressOrderByField {

	/**
	 * ID: Order by the &#39;ID&#39; attribute
	 */
	ID("ID"),

	/**
	 * ORIGIN: Order by the &#39;origin&#39; attribute
	 */
	ORIGIN("ORIGIN"),

	/**
	 * ENTRY_PATH: Order by the &#39;entryPath&#39; attribute
	 */
	ENTRY_PATH("ENTRY_PATH"),

	/**
	 * CREATION_TIMESTAMP: Order by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Order by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EAccountIngressOrderByField(String value) {
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
	public static EAccountIngressOrderByField fromValue(String value) {
		for (EAccountIngressOrderByField b : EAccountIngressOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
