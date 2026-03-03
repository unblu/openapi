
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAnalyticsKpiDisplaySingleValueAggregation
 */
public enum EAnalyticsKpiDisplaySingleValueAggregation {

	/**
	 * SUM: Summary.
	 */
	SUM("SUM"),

	/**
	 * AVG: Average value calculation. If the KPI is count-based, the result is the average per selected granularity (total count divided by the number of time
	 * units). If the KPI is value-based, the result is calculated over the entire selected time range.
	 */
	AVG("AVG"),

	/**
	 * NONE: No aggregation.
	 */
	NONE("NONE");

	private String value;

	EAnalyticsKpiDisplaySingleValueAggregation(String value) {
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
	public static EAnalyticsKpiDisplaySingleValueAggregation fromValue(String value) {
		for (EAnalyticsKpiDisplaySingleValueAggregation b : EAnalyticsKpiDisplaySingleValueAggregation.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
