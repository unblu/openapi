
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAnalyticsWidgetSearchFilterField
 */
public enum EAnalyticsWidgetSearchFilterField {

	/**
	 * NAME: Filter by the &#39;name&#39; attribute.
	 */
	NAME("NAME"),

	/**
	 * ANALYTICS_DASHBOARD_ID: Filter by the &#39;analyticsDashboardId&#39; attribute.
	 */
	ANALYTICS_DASHBOARD_ID("ANALYTICS_DASHBOARD_ID");

	private String value;

	EAnalyticsWidgetSearchFilterField(String value) {
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
	public static EAnalyticsWidgetSearchFilterField fromValue(String value) {
		for (EAnalyticsWidgetSearchFilterField b : EAnalyticsWidgetSearchFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
