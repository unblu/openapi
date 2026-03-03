
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAnalyticsKpiFixedTimeFrameSpan
 */
public enum EAnalyticsKpiFixedTimeFrameSpan {

	/**
	 * CURRENT_DAY: The current day, starting at 00:00, up to the present time.
	 */
	CURRENT_DAY("CURRENT_DAY"),

	/**
	 * WEEK_TO_DATE: The current week, starting at 00:00 on Monday, up to the present time.
	 */
	WEEK_TO_DATE("WEEK_TO_DATE"),

	/**
	 * MONTH_TO_DATE: The current month, starting at 00:00 on the first day of the month, up to the present time.
	 */
	MONTH_TO_DATE("MONTH_TO_DATE"),

	/**
	 * QUARTER_TO_DATE: The current quarter, starting at 00:00 on the first day of the quarter, up to the present time.
	 */
	QUARTER_TO_DATE("QUARTER_TO_DATE"),

	/**
	 * YEAR_TO_DATE: The current year, starting at 00:00 on the first day of the year, up to the present time.
	 */
	YEAR_TO_DATE("YEAR_TO_DATE");

	private String value;

	EAnalyticsKpiFixedTimeFrameSpan(String value) {
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
	public static EAnalyticsKpiFixedTimeFrameSpan fromValue(String value) {
		for (EAnalyticsKpiFixedTimeFrameSpan b : EAnalyticsKpiFixedTimeFrameSpan.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
