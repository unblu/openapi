
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of link that was clicked in a message
 */
public enum ELinkSource {

	/**
	 * MARKDOWN_LINK: A link written in Markdown syntax in the message text
	 */
	MARKDOWN_LINK("MARKDOWN_LINK"),

	/**
	 * AUTO_DETECTED_URL: A URL in the message text that Unblu turned into a link, including a URL written in angle brackets
	 */
	AUTO_DETECTED_URL("AUTO_DETECTED_URL"),

	/**
	 * MESSAGE_ACTION: A link action of a card or list message
	 */
	MESSAGE_ACTION("MESSAGE_ACTION");

	private String value;

	ELinkSource(String value) {
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
	public static ELinkSource fromValue(String value) {
		for (ELinkSource b : ELinkSource.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
