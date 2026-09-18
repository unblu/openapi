
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines the types of global filters that can be configured on an analytics dashboard. Global filters are added to the dashboard configuration and apply to
 * all widgets within that dashboard simultaneously. When a user selects a filter value, all widgets on the dashboard are filtered accordingly, providing a
 * consistent view across the entire dashboard. If the KPI of a widget doesn&#39;t support filtering by a configured filter type, the filter is ignored for that
 * widget.
 */
public enum EAnalyticsGlobalFilterType {

	/**
	 * CONVERSATION_TEMPLATE_ID: Allows filtering the whole dashboard by conversation template IDs. The filter applies to all dashboard widgets whose KPI supports
	 * filtering by this type.
	 */
	CONVERSATION_TEMPLATE_ID("CONVERSATION_TEMPLATE_ID"),

	/**
	 * CONVERSATION_LOCALE: Allows filtering the whole dashboard by conversation locales. The filter applies to all dashboard widgets whose KPI supports filtering
	 * by this type.
	 */
	CONVERSATION_LOCALE("CONVERSATION_LOCALE"),

	/**
	 * INITIAL_ENGAGEMENT_TYPE: Allows filtering the whole dashboard by initial engagement types. The filter applies to all dashboard widgets whose KPI supports
	 * filtering by this type.
	 */
	INITIAL_ENGAGEMENT_TYPE("INITIAL_ENGAGEMENT_TYPE"),

	/**
	 * RECIPIENT_ID: Allows filtering the whole dashboard by recipient agent persons, recipient agent teams, named areas, account IDs. The filter applies to all
	 * dashboard widgets whose KPI supports filtering by this type.
	 */
	RECIPIENT_ID("RECIPIENT_ID"),

	/**
	 * ASSIGNED_AGENT_PERSON_ID: Allows filtering the whole dashboard by assigned agent person IDs. The filter applies to all dashboard widgets whose KPI supports
	 * filtering by this type.
	 */
	ASSIGNED_AGENT_PERSON_ID("ASSIGNED_AGENT_PERSON_ID"),

	/**
	 * ASSIGNED_AGENT_TEAM_ID: Allows filtering the whole dashboard by assigned agent team IDs. The filter applies to all dashboard widgets whose KPI supports
	 * filtering by this type.
	 */
	ASSIGNED_AGENT_TEAM_ID("ASSIGNED_AGENT_TEAM_ID"),

	/**
	 * CONVERSATION_LABELS: Allows filtering the whole dashboard by conversation labels. You can specify mandatory labels (the conversation must have all of them),
	 * any labels (it must have at least one of them), and excluded labels (it must have none of them). The filter applies to all dashboard widgets whose KPI
	 * supports filtering by this type.
	 */
	CONVERSATION_LABELS("CONVERSATION_LABELS"),

	/**
	 * CONTEXT_PERSON_LABELS: Allows filtering the whole dashboard by context person labels. You can specify mandatory labels (the context person must have all of
	 * them), any labels (they must have at least one of them), and excluded labels (they must have none of them). The filter applies to all dashboard widgets whose
	 * KPI supports filtering by this type.
	 */
	CONTEXT_PERSON_LABELS("CONTEXT_PERSON_LABELS"),

	/**
	 * ASSIGNED_AGENT_LABELS: Allows filtering the whole dashboard by assigned agent labels. You can specify mandatory labels (the assigned agent must have all of
	 * them), any labels (they must have at least one of them), and excluded labels (they must have none of them). The filter applies to all dashboard widgets whose
	 * KPI supports filtering by this type.
	 */
	ASSIGNED_AGENT_LABELS("ASSIGNED_AGENT_LABELS");

	private String value;

	EAnalyticsGlobalFilterType(String value) {
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
	public static EAnalyticsGlobalFilterType fromValue(String value) {
		for (EAnalyticsGlobalFilterType b : EAnalyticsGlobalFilterType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
