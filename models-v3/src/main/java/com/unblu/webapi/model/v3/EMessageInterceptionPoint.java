
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Identifies the point where an interceptor intercepts messages
 */
public enum EMessageInterceptionPoint {

	/**
	 * BEFORE_PERSISTING: Messages are intercepted before the message is persisted. The first interception takes place on the client side before the message is sent
	 * to the server. A second validation occurs before the message is persisted and added to the conversation in case the client-side validation was skipped for
	 * some reason. &lt;p&gt; If this point of interception is selected, Unblu doesn&#39;t store any information about rejected chat messages. It isn&#39;t possible
	 * to see rejected chat messages, or to be notified of rejected chat messages through logs or webhooks.
	 */
	BEFORE_PERSISTING("BEFORE_PERSISTING"),

	/**
	 * AFTER_PERSISTING: Messages are intercepted after they&#39;ve been persisted and added to the conversation. Until the interception phase is over, the messages
	 * are only visible to the sender. If the message is rejected, only participation types with the appropriate rights can see the message. &lt;p&gt; If this
	 * interception point is chosen, every message is stored in Unblu and can be accessed later. It is possible to receive a webhook and logs when a message is
	 * rejected.
	 */
	AFTER_PERSISTING("AFTER_PERSISTING");

	private String value;

	EMessageInterceptionPoint(String value) {
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
	public static EMessageInterceptionPoint fromValue(String value) {
		for (EMessageInterceptionPoint b : EMessageInterceptionPoint.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
