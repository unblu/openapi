
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAnalyticsKpiDisplayChart
 */
public enum EAnalyticsKpiDisplayChart {

	/**
	 * LINE: Line chart.
	 */
	LINE("LINE"),

	/**
	 * BAR_VERTICAL: Vertical bar chart.
	 */
	BAR_VERTICAL("BAR_VERTICAL"),

	/**
	 * NONE: No chart.
	 */
	NONE("NONE");

	private String value;

	EAnalyticsKpiDisplayChart(String value) {
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
	public static EAnalyticsKpiDisplayChart fromValue(String value) {
		for (EAnalyticsKpiDisplayChart b : EAnalyticsKpiDisplayChart.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
