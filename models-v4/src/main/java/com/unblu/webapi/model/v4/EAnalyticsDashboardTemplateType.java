
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAnalyticsDashboardTemplateType
 */
public enum EAnalyticsDashboardTemplateType {

	/**
	 * SUPPORT: Customer support KPIs related to the queue.
	 */
	SUPPORT("SUPPORT"),

	/**
	 * GENERAL: KPIs on the volume of conversations.
	 */
	GENERAL("GENERAL"),

	/**
	 * ADVISORY: KPIs related to the secure messenger.
	 */
	ADVISORY("ADVISORY"),

	/**
	 * AGENT: KPIs of agent personal conversations.
	 */
	AGENT("AGENT");

	private String value;

	EAnalyticsDashboardTemplateType(String value) {
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
	public static EAnalyticsDashboardTemplateType fromValue(String value) {
		for (EAnalyticsDashboardTemplateType b : EAnalyticsDashboardTemplateType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
