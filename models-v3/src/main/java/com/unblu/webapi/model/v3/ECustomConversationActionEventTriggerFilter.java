
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Who a custom conversation action API event should be triggered for
 */
public enum ECustomConversationActionEventTriggerFilter {

	/**
	 * SELF: Trigger the custom action API event only for the person who invoked it
	 */
	SELF("SELF"),

	/**
	 * OTHERS: Trigger the custom action API event for everyone except the person who invoked it
	 */
	OTHERS("OTHERS"),

	/**
	 * ALL: Trigger the custom action API event for everyone
	 */
	ALL("ALL");

	private String value;

	ECustomConversationActionEventTriggerFilter(String value) {
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
	public static ECustomConversationActionEventTriggerFilter fromValue(String value) {
		for (ECustomConversationActionEventTriggerFilter b : ECustomConversationActionEventTriggerFilter.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
