
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Fields available for filtering in an &#x60;AnalyticsKpiDataQueryFilter&#x60;.
 */
public enum EAnalyticsKpiDataQueryFilterField {

	/**
	 * EVENT_TIMESTAMP: The UTC timestamp of the analytics event, in milliseconds since epoch. Used to restrict query results to a specific time range.
	 */
	EVENT_TIMESTAMP("EVENT_TIMESTAMP");

	private String value;

	EAnalyticsKpiDataQueryFilterField(String value) {
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
	public static EAnalyticsKpiDataQueryFilterField fromValue(String value) {
		for (EAnalyticsKpiDataQueryFilterField b : EAnalyticsKpiDataQueryFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
