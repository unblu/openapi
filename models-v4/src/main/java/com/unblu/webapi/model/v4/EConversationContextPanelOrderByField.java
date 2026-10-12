
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationContextPanelOrderByField
 */
public enum EConversationContextPanelOrderByField {

	/**
	 * NAME: Sort by the &#39;name&#39; attribute
	 */
	NAME("NAME"),

	/**
	 * ENABLED: Sort by the &#39;enabled&#39; attribute
	 */
	ENABLED("ENABLED"),

	/**
	 * CREATION_TIMESTAMP: Sort by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Sort by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EConversationContextPanelOrderByField(String value) {
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
	public static EConversationContextPanelOrderByField fromValue(String value) {
		for (EConversationContextPanelOrderByField b : EConversationContextPanelOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
