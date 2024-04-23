
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAgentStateOrderByField
 */
public enum EAgentStateOrderByField {

	/**
	 * PERSON_ID: Sort by the &#39;personId&#39; attribute
	 */
	PERSON_ID("PERSON_ID"),

	/**
	 * STATUS_MESSAGE: Sort by the &#39;statusMessage&#39; attribute
	 */
	STATUS_MESSAGE("STATUS_MESSAGE"),

	/**
	 * PAUSE_NOTIFICATIONS_MODE: Sort by the &#39;pauseNotificationsMode&#39; attribute
	 */
	PAUSE_NOTIFICATIONS_MODE("PAUSE_NOTIFICATIONS_MODE"),

	/**
	 * PAUSE_NOTIFICATIONS_STATE: Sort by the &#39;pauseNotificationsState&#39; attribute
	 */
	PAUSE_NOTIFICATIONS_STATE("PAUSE_NOTIFICATIONS_STATE"),

	/**
	 * PAUSE_NOTIFICATIONS_END_TIMESTAMP: Sort by the &#39;pauseNotificationsEndTimestamp&#39; attribute
	 */
	PAUSE_NOTIFICATIONS_END_TIMESTAMP("PAUSE_NOTIFICATIONS_END_TIMESTAMP"),

	/**
	 * AUTO_PAUSE_NOTIFICATIONS_REASON_SOURCE_ID: Sort by the &#39;sourceId&#39; attribute of the related AutoPauseNotificationsReason
	 */
	AUTO_PAUSE_NOTIFICATIONS_REASON_SOURCE_ID("AUTO_PAUSE_NOTIFICATIONS_REASON_SOURCE_ID"),

	/**
	 * AUTO_PAUSE_NOTIFICATIONS_REASON_EXPIRATION_TIMESTAMP: Sort by the &#39;expirationTimestamp&#39; attribute of the related AutoPauseNotificationsReason
	 */
	AUTO_PAUSE_NOTIFICATIONS_REASON_EXPIRATION_TIMESTAMP("AUTO_PAUSE_NOTIFICATIONS_REASON_EXPIRATION_TIMESTAMP");

	private String value;

	EAgentStateOrderByField(String value) {
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
	public static EAgentStateOrderByField fromValue(String value) {
		for (EAgentStateOrderByField b : EAgentStateOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
