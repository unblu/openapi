
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAnalyticsKpiFixedGranularity
 */
public enum EAnalyticsKpiFixedGranularity {

	/**
	 * MINUTE: Minute.
	 */
	MINUTE("MINUTE"),

	/**
	 * QUARTER_HOUR: Quarter hour (15 minutes).
	 */
	QUARTER_HOUR("QUARTER_HOUR"),

	/**
	 * HALF_HOUR: Half hour (30 minutes).
	 */
	HALF_HOUR("HALF_HOUR"),

	/**
	 * HOUR: Hour.
	 */
	HOUR("HOUR"),

	/**
	 * DAY: Day.
	 */
	DAY("DAY"),

	/**
	 * WEEK: Week.
	 */
	WEEK("WEEK"),

	/**
	 * MONTH: Month.
	 */
	MONTH("MONTH"),

	/**
	 * WHOLE_TIMEFRAME: Whole timeframe.
	 */
	WHOLE_TIMEFRAME("WHOLE_TIMEFRAME");

	private String value;

	EAnalyticsKpiFixedGranularity(String value) {
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
	public static EAnalyticsKpiFixedGranularity fromValue(String value) {
		for (EAnalyticsKpiFixedGranularity b : EAnalyticsKpiFixedGranularity.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
