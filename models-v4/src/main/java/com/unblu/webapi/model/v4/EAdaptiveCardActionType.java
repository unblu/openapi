
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of Adaptive Card action that was executed.
 */
public enum EAdaptiveCardActionType {

	/**
	 * SUBMIT: &#x60;Action.Submit&#x60;: submits the card&#39;s collected &#x60;Input.*&#x60; values.
	 */
	SUBMIT("SUBMIT"),

	/**
	 * EXECUTE: &#x60;Action.Execute&#x60;: submits the card&#39;s collected &#x60;Input.*&#x60; values together with a verb identifying the operation to perform.
	 */
	EXECUTE("EXECUTE"),

	/**
	 * OPEN_URL: &#x60;Action.OpenUrl&#x60;: opens a link. The browser opens the link itself; the invocation is reported only so it&#39;s visible to a webhook.
	 */
	OPEN_URL("OPEN_URL");

	private String value;

	EAdaptiveCardActionType(String value) {
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
	public static EAdaptiveCardActionType fromValue(String value) {
		for (EAdaptiveCardActionType b : EAdaptiveCardActionType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
