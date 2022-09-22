
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of message action used in Card and List messages.
 */
public enum EConversationMessageActionType {

	/**
	 * LINK_INTERNAL: An internal link that will open in the same tab as the unblu chat when clicked. &lt;p&gt; The action will be displayed as a link using the
	 * action&#39;s label as text.
	 */
	LINK_INTERNAL("LINK_INTERNAL"),

	/**
	 * LINK_EXTERNAL: An external link that will open in a new tab when clicked. &lt;p&gt; The action will be displayed as a link with an &quot;external&quot; icon
	 * using the action&#39;s label as text.
	 */
	LINK_EXTERNAL("LINK_EXTERNAL"),

	/**
	 * LINK_COBROWSABLE: A link that will start universal co-browsing session of provided address when clicked. &lt;p&gt; The action will be displayed as a link
	 * with a &quot;collaborate on website&quot; icon using the action&#39;s label as text.
	 */
	LINK_COBROWSABLE("LINK_COBROWSABLE"),

	/**
	 * REPLY_MESSAGE: A reply message will be sent in the name of the clicking person. &lt;p&gt; The action will be displayed as a button with the action&#39;s
	 * label as text &lt;p&gt; If the action is clicked, a message of the type TextMessage will be sent in the name of the clicking person containing the
	 * action&#39;s value as the message text.
	 */
	REPLY_MESSAGE("REPLY_MESSAGE"),

	/**
	 * REPLY_MESSAGE_WITH_TECHNICAL_VALUE: A reply message will be sent in the name of the clicking person. &lt;p&gt; The action will be displayed as a button with
	 * the action&#39;s label as text &lt;p&gt; If the action is clicked, a message of the type ReplyMessage will be sent in the name of the clicking person. It
	 * will reference the message this action is part of as questionMessage, contain the action&#39;s value as the reply&#39;s value and the label as text visible
	 * to the user. message text.
	 */
	REPLY_MESSAGE_WITH_TECHNICAL_VALUE("REPLY_MESSAGE_WITH_TECHNICAL_VALUE");

	private String value;

	EConversationMessageActionType(String value) {
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
	public static EConversationMessageActionType fromValue(String value) {
		for (EConversationMessageActionType b : EConversationMessageActionType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
