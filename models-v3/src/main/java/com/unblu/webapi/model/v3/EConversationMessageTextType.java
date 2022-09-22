
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * How text in a conversation message should be interpreted.
 */
public enum EConversationMessageTextType {

	/**
	 * SIMPLE_TEXT: Text will be interpreted as simple text. &lt;p&gt; Auto link detection will still be possible.
	 */
	SIMPLE_TEXT("SIMPLE_TEXT"),

	/**
	 * MARKDOWN: Text will be interpreted as Markdown. &lt;p&gt; The supported Markdown subset depends on the message type.
	 */
	MARKDOWN("MARKDOWN");

	private String value;

	EConversationMessageTextType(String value) {
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
	public static EConversationMessageTextType fromValue(String value) {
		for (EConversationMessageTextType b : EConversationMessageTextType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
