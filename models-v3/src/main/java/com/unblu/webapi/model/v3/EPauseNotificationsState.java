
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines whether the notifications are currently paused or not.
 */
public enum EPauseNotificationsState {

	/**
	 * ON: Notifications are currently paused.
	 */
	ON("ON"),

	/**
	 * OFF: Notifications are currently allowed.
	 */
	OFF("OFF");

	private String value;

	EPauseNotificationsState(String value) {
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
	public static EPauseNotificationsState fromValue(String value) {
		for (EPauseNotificationsState b : EPauseNotificationsState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
