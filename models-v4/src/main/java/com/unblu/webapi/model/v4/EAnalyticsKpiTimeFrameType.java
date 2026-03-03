
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAnalyticsKpiTimeFrameType
 */
public enum EAnalyticsKpiTimeFrameType {

	/**
	 * GLOBALLY_SYNCED: The timeframe is calculated based on dashboard configuration. Available only on widgets.
	 */
	GLOBALLY_SYNCED("GLOBALLY_SYNCED"),

	/**
	 * TIME_SPAN: A fixed time span, ending at the present time.
	 */
	TIME_SPAN("TIME_SPAN"),

	/**
	 * LAST_DAYS: A fixed number of last days, ending at the present time.
	 */
	LAST_DAYS("LAST_DAYS"),

	/**
	 * CUSTOM: A custom timeframe specified by a start timestamp and an end timestamp. Available on widgets and data requests.
	 */
	CUSTOM("CUSTOM");

	private String value;

	EAnalyticsKpiTimeFrameType(String value) {
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
	public static EAnalyticsKpiTimeFrameType fromValue(String value) {
		for (EAnalyticsKpiTimeFrameType b : EAnalyticsKpiTimeFrameType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
