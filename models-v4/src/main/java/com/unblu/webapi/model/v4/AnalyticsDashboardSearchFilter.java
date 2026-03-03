package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = IdAnalyticsDashboardSearchFilter.class, name = "ID"),
	@JsonSubTypes.Type(value = NameAnalyticsDashboardSearchFilter.class, name = "NAME"),
})
public interface AnalyticsDashboardSearchFilter {
	void setField(EAnalyticsDashboardSearchFilterField field);

	EAnalyticsDashboardSearchFilterField getField();

	AnalyticsDashboardSearchFilter field(EAnalyticsDashboardSearchFilterField field);

	void setOperator(StringOperator operator);

	StringOperator getOperator();

	AnalyticsDashboardSearchFilter operator(StringOperator operator);

}
