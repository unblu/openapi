
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EAnalyticsKpiType
 */
public enum EAnalyticsKpiType {

	/**
	 * AVG_WAITING_TIME: KPI for the average waiting time of a visitor.
	 */
	AVG_WAITING_TIME("AVG_WAITING_TIME"),

	/**
	 * AVG_HANDLING_TIME: KPI for the average handling time of an agent.
	 */
	AVG_HANDLING_TIME("AVG_HANDLING_TIME"),

	/**
	 * CONVERSATIONS_ENDED_COUNT: KPI for the number of ended conversations.
	 */
	CONVERSATIONS_ENDED_COUNT("CONVERSATIONS_ENDED_COUNT"),

	/**
	 * MESSAGES_COUNT: KPI for the number of messages.
	 */
	MESSAGES_COUNT("MESSAGES_COUNT"),

	/**
	 * COLLABORATION_LAYERS_COUNT: KPI for the number of collaboration layers.
	 */
	COLLABORATION_LAYERS_COUNT("COLLABORATION_LAYERS_COUNT"),

	/**
	 * CALLS_COUNT: KPI for the number of calls.
	 */
	CALLS_COUNT("CALLS_COUNT");

	private String value;

	EAnalyticsKpiType(String value) {
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
	public static EAnalyticsKpiType fromValue(String value) {
		for (EAnalyticsKpiType b : EAnalyticsKpiType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
