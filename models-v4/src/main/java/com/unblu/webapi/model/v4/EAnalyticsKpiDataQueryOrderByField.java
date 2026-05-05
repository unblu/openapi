
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Fields available for ordering in an &#x60;AnalyticsKpiDataQueryOrderBy&#x60;.
 */
public enum EAnalyticsKpiDataQueryOrderByField {

	/**
	 * EVENT_TIMESTAMP: The UTC timestamp of the analytics event, in milliseconds since epoch.
	 */
	EVENT_TIMESTAMP("EVENT_TIMESTAMP");

	private String value;

	EAnalyticsKpiDataQueryOrderByField(String value) {
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
	public static EAnalyticsKpiDataQueryOrderByField fromValue(String value) {
		for (EAnalyticsKpiDataQueryOrderByField b : EAnalyticsKpiDataQueryOrderByField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
