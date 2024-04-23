
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines the mode whether and how the notifications should be paused or not.
 */
public enum EPauseNotificationsMode {

	/**
	 * ON: Explicitly paused notifications.
	 */
	ON("ON"),

	/**
	 * OFF: Explicitly allowed notifications.
	 */
	OFF("OFF"),

	/**
	 * AUTO: Notifications are paused automatically, if there is a reason for it set, otherwise they are allowed.
	 */
	AUTO("AUTO");

	private String value;

	EPauseNotificationsMode(String value) {
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
	public static EPauseNotificationsMode fromValue(String value) {
		for (EPauseNotificationsMode b : EPauseNotificationsMode.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
