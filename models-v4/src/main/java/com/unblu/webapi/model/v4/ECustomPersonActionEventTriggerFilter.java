
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Who a custom person action API event should be triggered for
 */
public enum ECustomPersonActionEventTriggerFilter {

	/**
	 * TARGET_PERSON: Trigger the custom action API event only for the target person
	 */
	TARGET_PERSON("TARGET_PERSON"),

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

	ECustomPersonActionEventTriggerFilter(String value) {
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
	public static ECustomPersonActionEventTriggerFilter fromValue(String value) {
		for (ECustomPersonActionEventTriggerFilter b : ECustomPersonActionEventTriggerFilter.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
