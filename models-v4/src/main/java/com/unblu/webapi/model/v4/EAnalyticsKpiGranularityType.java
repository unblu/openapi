
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAnalyticsKpiGranularityType
 */
public enum EAnalyticsKpiGranularityType {

	/**
	 * GLOBALLY_SYNCED: Granularity is calculated based on the dashboard configuration.
	 */
	GLOBALLY_SYNCED("GLOBALLY_SYNCED"),

	/**
	 * FIXED: Widget uses its own fixed granularity configuration.
	 */
	FIXED("FIXED");

	private String value;

	EAnalyticsKpiGranularityType(String value) {
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
	public static EAnalyticsKpiGranularityType fromValue(String value) {
		for (EAnalyticsKpiGranularityType b : EAnalyticsKpiGranularityType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
