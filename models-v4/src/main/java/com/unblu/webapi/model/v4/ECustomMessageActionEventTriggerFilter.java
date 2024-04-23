
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Who a custom message action API event should be triggered for
 */
public enum ECustomMessageActionEventTriggerFilter {

	/**
	 * SENDER: Trigger the custom action API event only for the sender of the target message
	 */
	SENDER("SENDER"),

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

	ECustomMessageActionEventTriggerFilter(String value) {
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
	public static ECustomMessageActionEventTriggerFilter fromValue(String value) {
		for (ECustomMessageActionEventTriggerFilter b : ECustomMessageActionEventTriggerFilter.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
