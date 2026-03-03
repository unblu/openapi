
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAnalyticsKpiFiltersType
 */
public enum EAnalyticsKpiFiltersType {

	/**
	 * FIXED: Only the filters configured for the widget are used for KPI calculation. Global dashboard filters are ignored.
	 */
	FIXED("FIXED"),

	/**
	 * GLOBALLY_SYNCED: Only filters present in both the widget and the global dashboard filters are used for the KPI calculation. Filters not in both sets are
	 * ignored.
	 */
	GLOBALLY_SYNCED("GLOBALLY_SYNCED");

	private String value;

	EAnalyticsKpiFiltersType(String value) {
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
	public static EAnalyticsKpiFiltersType fromValue(String value) {
		for (EAnalyticsKpiFiltersType b : EAnalyticsKpiFiltersType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
