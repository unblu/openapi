package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AnalyticsDashboardIdAnalyticsWidgetSearchFilter.class, name = "ANALYTICS_DASHBOARD_ID"),
	@JsonSubTypes.Type(value = NameAnalyticsWidgetSearchFilter.class, name = "NAME"),
})
public interface AnalyticsWidgetSearchFilter {
	void setField(EAnalyticsWidgetSearchFilterField field);

	EAnalyticsWidgetSearchFilterField getField();

	AnalyticsWidgetSearchFilter field(EAnalyticsWidgetSearchFilterField field);

	void setOperator(StringOperator operator);

	StringOperator getOperator();

	AnalyticsWidgetSearchFilter operator(StringOperator operator);

}
