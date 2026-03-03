package com.unblu.webapi.model.v4;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "kpiType", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AvgHandlingTimeAnalyticsWidgetData.class, name = "AVG_HANDLING_TIME"),
	@JsonSubTypes.Type(value = AvgWaitingTimeAnalyticsWidgetData.class, name = "AVG_WAITING_TIME"),
	@JsonSubTypes.Type(value = CallsCountAnalyticsWidgetData.class, name = "CALLS_COUNT"),
	@JsonSubTypes.Type(value = CollaborationLayersCountAnalyticsWidgetData.class, name = "COLLABORATION_LAYERS_COUNT"),
	@JsonSubTypes.Type(value = ConversationsEndedCountAnalyticsWidgetData.class, name = "CONVERSATIONS_ENDED_COUNT"),
	@JsonSubTypes.Type(value = MessagesCountAnalyticsWidgetData.class, name = "MESSAGES_COUNT"),
})
public interface AnalyticsWidgetData {
	void setId(String id);

	String getId();

	AnalyticsWidgetData id(String id);

	void setAccountId(String accountId);

	String getAccountId();

	AnalyticsWidgetData accountId(String accountId);

	void setCreationTimestamp(Long creationTimestamp);

	Long getCreationTimestamp();

	AnalyticsWidgetData creationTimestamp(Long creationTimestamp);

	void setModificationTimestamp(Long modificationTimestamp);

	Long getModificationTimestamp();

	AnalyticsWidgetData modificationTimestamp(Long modificationTimestamp);

	void setVersion(Long version);

	Long getVersion();

	AnalyticsWidgetData version(Long version);

	void setAnalyticsDashboardId(String analyticsDashboardId);

	String getAnalyticsDashboardId();

	AnalyticsWidgetData analyticsDashboardId(String analyticsDashboardId);

	void setName(String name);

	String getName();

	AnalyticsWidgetData name(String name);

	void setDescription(String description);

	String getDescription();

	AnalyticsWidgetData description(String description);

	void setKpiType(EAnalyticsKpiType kpiType);

	EAnalyticsKpiType getKpiType();

	AnalyticsWidgetData kpiType(EAnalyticsKpiType kpiType);

	void setRow(Integer row);

	Integer getRow();

	AnalyticsWidgetData row(Integer row);

	void setRowSpan(Integer rowSpan);

	Integer getRowSpan();

	AnalyticsWidgetData rowSpan(Integer rowSpan);

	void setColumn(Integer column);

	Integer getColumn();

	AnalyticsWidgetData column(Integer column);

	void setColumnSpan(Integer columnSpan);

	Integer getColumnSpan();

	AnalyticsWidgetData columnSpan(Integer columnSpan);

	void setDisplaySingleValueAggregation(EAnalyticsKpiDisplaySingleValueAggregation displaySingleValueAggregation);

	EAnalyticsKpiDisplaySingleValueAggregation getDisplaySingleValueAggregation();

	AnalyticsWidgetData displaySingleValueAggregation(EAnalyticsKpiDisplaySingleValueAggregation displaySingleValueAggregation);

	void setDisplaySingleValuePreviousPeriodComparison(Boolean displaySingleValuePreviousPeriodComparison);

	Boolean isDisplaySingleValuePreviousPeriodComparison();

	AnalyticsWidgetData displaySingleValuePreviousPeriodComparison(Boolean displaySingleValuePreviousPeriodComparison);

	void setDisplayChart(EAnalyticsKpiDisplayChart displayChart);

	EAnalyticsKpiDisplayChart getDisplayChart();

	AnalyticsWidgetData displayChart(EAnalyticsKpiDisplayChart displayChart);

	void setInitialTimeFrameType(EAnalyticsKpiTimeFrameType initialTimeFrameType);

	EAnalyticsKpiTimeFrameType getInitialTimeFrameType();

	AnalyticsWidgetData initialTimeFrameType(EAnalyticsKpiTimeFrameType initialTimeFrameType);

	void setInitialTimeFrameSpan(EAnalyticsKpiFixedTimeFrameSpan initialTimeFrameSpan);

	EAnalyticsKpiFixedTimeFrameSpan getInitialTimeFrameSpan();

	AnalyticsWidgetData initialTimeFrameSpan(EAnalyticsKpiFixedTimeFrameSpan initialTimeFrameSpan);

	void setInitialTimeFrameLastDays(Integer initialTimeFrameLastDays);

	Integer getInitialTimeFrameLastDays();

	AnalyticsWidgetData initialTimeFrameLastDays(Integer initialTimeFrameLastDays);

	void setGranularityType(EAnalyticsKpiGranularityType granularityType);

	EAnalyticsKpiGranularityType getGranularityType();

	AnalyticsWidgetData granularityType(EAnalyticsKpiGranularityType granularityType);

	void setFixedGranularity(EAnalyticsKpiFixedGranularity fixedGranularity);

	EAnalyticsKpiFixedGranularity getFixedGranularity();

	AnalyticsWidgetData fixedGranularity(EAnalyticsKpiFixedGranularity fixedGranularity);

	void setTranslations(Map<String, AnalyticsWidgetTranslation> translations);

	Map<String, AnalyticsWidgetTranslation> getTranslations();

	AnalyticsWidgetData translations(Map<String, AnalyticsWidgetTranslation> translations);

	void setReferenceLines(List<AnalyticsKpiReferenceLine> referenceLines);

	List<AnalyticsKpiReferenceLine> getReferenceLines();

	AnalyticsWidgetData referenceLines(List<AnalyticsKpiReferenceLine> referenceLines);

	void setFiltersType(EAnalyticsKpiFiltersType filtersType);

	EAnalyticsKpiFiltersType getFiltersType();

	AnalyticsWidgetData filtersType(EAnalyticsKpiFiltersType filtersType);

}
