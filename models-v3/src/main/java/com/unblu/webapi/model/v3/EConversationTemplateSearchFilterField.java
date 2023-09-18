
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationTemplateSearchFilterField
 */
public enum EConversationTemplateSearchFilterField {

	/**
	 * NAME: Filter by the &#39;name&#39; attribute
	 */
	NAME("NAME"),

	/**
	 * DESCRIPTION: Filter by the &#39;description&#39; attribute
	 */
	DESCRIPTION("DESCRIPTION"),

	/**
	 * DEFAULT_TEMPLATE: Filter by the &#39;defaultTemplate&#39; attribute
	 */
	DEFAULT_TEMPLATE("DEFAULT_TEMPLATE"),

	/**
	 * INITIAL_ENGAGEMENT_TYPE: Filter by the &#39;initialEngagementType&#39; attribute
	 */
	INITIAL_ENGAGEMENT_TYPE("INITIAL_ENGAGEMENT_TYPE"),

	/**
	 * CREATION_TIMESTAMP: Filter by the &#39;creationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	CREATION_TIMESTAMP("CREATION_TIMESTAMP"),

	/**
	 * MODIFICATION_TIMESTAMP: Filter by the &#39;modificationTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	MODIFICATION_TIMESTAMP("MODIFICATION_TIMESTAMP");

	private String value;

	EConversationTemplateSearchFilterField(String value) {
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
	public static EConversationTemplateSearchFilterField fromValue(String value) {
		for (EConversationTemplateSearchFilterField b : EConversationTemplateSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
