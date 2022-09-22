
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationTemplateOrderByField
 */
public enum EConversationTemplateOrderByField {

	/**
	 * ID: Sort by the &#39;id&#39; attribute
	 */
	ID("ID"),

	/**
	 * NAME: Sort by the &#39;name&#39; attribute
	 */
	NAME("NAME"),

	/**
	 * DESCRIPTION: Sort by the &#39;description&#39; attribute
	 */
	DESCRIPTION("DESCRIPTION"),

	/**
	 * DEFAULT_TEMPLATE: Sort by the &#39;defaultTemplate&#39; attribute
	 */
	DEFAULT_TEMPLATE("DEFAULT_TEMPLATE"),

	/**
	 * INITIAL_ENGAGEMENT_TYPE: Sort by the &#39;initialEngagementType&#39; attribute
	 */
	INITIAL_ENGAGEMENT_TYPE("INITIAL_ENGAGEMENT_TYPE"),

	/**
	 * CREATION_TIMESTAMP: Sort by the &#39;creationTimestamp&#39; attribute
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Sort by the &#39;modificationTimestamp&#39; attribute
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EConversationTemplateOrderByField(String value) {
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
	public static EConversationTemplateOrderByField fromValue(String value) {
		for (EConversationTemplateOrderByField b : EConversationTemplateOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
