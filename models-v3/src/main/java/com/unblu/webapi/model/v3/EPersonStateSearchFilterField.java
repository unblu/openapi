
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EPersonStateSearchFilterField
 */
public enum EPersonStateSearchFilterField {

	/**
	 * PERSON_ID: Filter by the &#39;personId&#39; attribute
	 */
	PERSON_ID("PERSON_ID"),

	/**
	 * ONLINE_STATE: Filter by the &#39;onlineState&#39; attribute
	 */
	ONLINE_STATE("ONLINE_STATE"),

	/**
	 * STATUS_MESSAGE: Filter by the &#39;statusMessage&#39; attribute
	 */
	STATUS_MESSAGE("STATUS_MESSAGE"),

	/**
	 * PAUSE_NOTIFICATIONS_MODE: Filter by the &#39;pauseNotificationsMode&#39; attribute
	 */
	PAUSE_NOTIFICATIONS_MODE("PAUSE_NOTIFICATIONS_MODE"),

	/**
	 * PAUSE_NOTIFICATIONS_STATE: Filter by the &#39;pauseNotificationsState&#39; attribute
	 */
	PAUSE_NOTIFICATIONS_STATE("PAUSE_NOTIFICATIONS_STATE"),

	/**
	 * PAUSE_NOTIFICATIONS_END_TIMESTAMP: Filter by the &#39;pauseNotificationsEndTimestamp&#39; attribute
	 */
	PAUSE_NOTIFICATIONS_END_TIMESTAMP("PAUSE_NOTIFICATIONS_END_TIMESTAMP"),

	/**
	 * AUTO_PAUSE_NOTIFICATIONS_REASON_SOURCE_ID: Filter by the &#39;sourceId&#39; attribute of the related AutoPauseNotificationsReason
	 */
	AUTO_PAUSE_NOTIFICATIONS_REASON_SOURCE_ID("AUTO_PAUSE_NOTIFICATIONS_REASON_SOURCE_ID"),

	/**
	 * AUTO_PAUSE_NOTIFICATIONS_REASON_EXPIRATION_TIMESTAMP: Filter by the &#39;expirationTimestamp&#39; attribute of the related AutoPauseNotificationsReason
	 */
	AUTO_PAUSE_NOTIFICATIONS_REASON_EXPIRATION_TIMESTAMP("AUTO_PAUSE_NOTIFICATIONS_REASON_EXPIRATION_TIMESTAMP");

	private String value;

	EPersonStateSearchFilterField(String value) {
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
	public static EPersonStateSearchFilterField fromValue(String value) {
		for (EPersonStateSearchFilterField b : EPersonStateSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
