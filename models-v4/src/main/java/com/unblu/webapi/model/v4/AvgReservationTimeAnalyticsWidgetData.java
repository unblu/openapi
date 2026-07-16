
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Data model representing the average reservation time analytics widget.
 */
@ApiModel(description = "Data model representing the average reservation time analytics widget.")

@JsonPropertyOrder({
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_$_TYPE,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_ID,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_ACCOUNT_ID,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_CREATION_TIMESTAMP,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_VERSION,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_ANALYTICS_DASHBOARD_ID,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_NAME,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_DESCRIPTION,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_KPI_TYPE,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_ROW,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_ROW_SPAN,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_COLUMN,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_COLUMN_SPAN,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_DISPLAY_SINGLE_VALUE_AGGREGATION,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_DISPLAY_SINGLE_VALUE_PREVIOUS_PERIOD_COMPARISON,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_DISPLAY_CHART,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_INITIAL_TIME_FRAME_TYPE,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_INITIAL_TIME_FRAME_SPAN,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_INITIAL_TIME_FRAME_LAST_DAYS,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_GRANULARITY_TYPE,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_FIXED_GRANULARITY,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_TRANSLATIONS,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_REFERENCE_LINES,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_FILTERS_TYPE,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_GROUP_BY,
	AvgReservationTimeAnalyticsWidgetData.JSON_PROPERTY_FILTERS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AvgReservationTimeAnalyticsWidgetData implements AnalyticsWidgetData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AVGRESERVATIONTIMEANALYTICSWIDGETDATA("AvgReservationTimeAnalyticsWidgetData");

		private String value;

		TypeEnum(String value) {
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
		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			return TypeEnum.AVGRESERVATIONTIMEANALYTICSWIDGETDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AVGRESERVATIONTIMEANALYTICSWIDGETDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_VERSION = "version";
	@JsonProperty(JSON_PROPERTY_VERSION)
	private Long version;

	public static final String JSON_PROPERTY_ANALYTICS_DASHBOARD_ID = "analyticsDashboardId";
	@JsonProperty(JSON_PROPERTY_ANALYTICS_DASHBOARD_ID)
	private String analyticsDashboardId;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public static final String JSON_PROPERTY_KPI_TYPE = "kpiType";
	@JsonProperty(JSON_PROPERTY_KPI_TYPE)
	private EAnalyticsKpiType kpiType = EAnalyticsKpiType.AVG_RESERVATION_TIME;

	public static final String JSON_PROPERTY_ROW = "row";
	@JsonProperty(JSON_PROPERTY_ROW)
	private Integer row;

	public static final String JSON_PROPERTY_ROW_SPAN = "rowSpan";
	@JsonProperty(JSON_PROPERTY_ROW_SPAN)
	private Integer rowSpan;

	public static final String JSON_PROPERTY_COLUMN = "column";
	@JsonProperty(JSON_PROPERTY_COLUMN)
	private Integer column;

	public static final String JSON_PROPERTY_COLUMN_SPAN = "columnSpan";
	@JsonProperty(JSON_PROPERTY_COLUMN_SPAN)
	private Integer columnSpan;

	public static final String JSON_PROPERTY_DISPLAY_SINGLE_VALUE_AGGREGATION = "displaySingleValueAggregation";
	@JsonProperty(JSON_PROPERTY_DISPLAY_SINGLE_VALUE_AGGREGATION)
	private EAnalyticsKpiDisplaySingleValueAggregation displaySingleValueAggregation;

	public static final String JSON_PROPERTY_DISPLAY_SINGLE_VALUE_PREVIOUS_PERIOD_COMPARISON = "displaySingleValuePreviousPeriodComparison";
	@JsonProperty(JSON_PROPERTY_DISPLAY_SINGLE_VALUE_PREVIOUS_PERIOD_COMPARISON)
	private Boolean displaySingleValuePreviousPeriodComparison;

	public static final String JSON_PROPERTY_DISPLAY_CHART = "displayChart";
	@JsonProperty(JSON_PROPERTY_DISPLAY_CHART)
	private EAnalyticsKpiDisplayChart displayChart;

	public static final String JSON_PROPERTY_INITIAL_TIME_FRAME_TYPE = "initialTimeFrameType";
	@JsonProperty(JSON_PROPERTY_INITIAL_TIME_FRAME_TYPE)
	private EAnalyticsKpiTimeFrameType initialTimeFrameType;

	public static final String JSON_PROPERTY_INITIAL_TIME_FRAME_SPAN = "initialTimeFrameSpan";
	@JsonProperty(JSON_PROPERTY_INITIAL_TIME_FRAME_SPAN)
	private EAnalyticsKpiFixedTimeFrameSpan initialTimeFrameSpan;

	public static final String JSON_PROPERTY_INITIAL_TIME_FRAME_LAST_DAYS = "initialTimeFrameLastDays";
	@JsonProperty(JSON_PROPERTY_INITIAL_TIME_FRAME_LAST_DAYS)
	private Integer initialTimeFrameLastDays;

	public static final String JSON_PROPERTY_GRANULARITY_TYPE = "granularityType";
	@JsonProperty(JSON_PROPERTY_GRANULARITY_TYPE)
	private EAnalyticsKpiGranularityType granularityType;

	public static final String JSON_PROPERTY_FIXED_GRANULARITY = "fixedGranularity";
	@JsonProperty(JSON_PROPERTY_FIXED_GRANULARITY)
	private EAnalyticsKpiFixedGranularity fixedGranularity;

	public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
	@JsonProperty(JSON_PROPERTY_TRANSLATIONS)
	private Map<String, AnalyticsWidgetTranslation> translations = null;

	public static final String JSON_PROPERTY_REFERENCE_LINES = "referenceLines";
	@JsonProperty(JSON_PROPERTY_REFERENCE_LINES)
	private List<AnalyticsKpiReferenceLine> referenceLines = null;

	public static final String JSON_PROPERTY_FILTERS_TYPE = "filtersType";
	@JsonProperty(JSON_PROPERTY_FILTERS_TYPE)
	private EAnalyticsKpiFiltersType filtersType;

	public static final String JSON_PROPERTY_GROUP_BY = "groupBy";
	@JsonProperty(JSON_PROPERTY_GROUP_BY)
	private List<EAvgReservationTimeGroupBy> groupBy = null;

	public static final String JSON_PROPERTY_FILTERS = "filters";
	@JsonProperty(JSON_PROPERTY_FILTERS)
	private AvgReservationTimeAnalyticsKpiFilterData filters = null;

	public AvgReservationTimeAnalyticsWidgetData $type(TypeEnum $type) {
		this.$type = $type;
		return this;
	}

	/**
	 * Get $type
	 * 
	 * @return $type
	 **/
	@ApiModelProperty(value = "")
	public TypeEnum get$Type() {
		return $type;
	}

	public void set$Type(TypeEnum $type) {
		this.$type = $type;
	}

	public AvgReservationTimeAnalyticsWidgetData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Widget ID.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Widget ID.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AvgReservationTimeAnalyticsWidgetData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Account ID the widget belongs to.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "Account ID the widget belongs to.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public AvgReservationTimeAnalyticsWidgetData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be
	 * omitted. Note: If you set this property, Unblu returns the same value, but it isn&#39;t written to storage and doesn&#39;t affect data consistency.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be omitted. Note: If you set this property, Unblu returns the same value, but it isn't written to storage and doesn't affect data consistency.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public AvgReservationTimeAnalyticsWidgetData modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last modification. This property is always optional and can be omitted when sending data to the server. If sent to the server, it is
	 * ignored. It is only informational in character. Note: If you set this property, it returns the same value but it isn&#39;t written to storage and doesn&#39;t
	 * affect the data consistency.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last modification. This property is always optional and can be omitted when sending data to the server. If sent to the server, it is ignored. It is only informational in character. Note: If you set this property, it returns the same value but it isn't written to storage and doesn't affect the data consistency.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public AvgReservationTimeAnalyticsWidgetData version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * Version of the entity, incremented on each change. Updates must always be based on the latest version or they&#39;re rejected. When creating an object, the
	 * version can be omitted.
	 * 
	 * @return version
	 **/
	@ApiModelProperty(value = "Version of the entity, incremented on each change. Updates must always be based on the latest version or they're rejected. When creating an object, the version can be omitted.")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public AvgReservationTimeAnalyticsWidgetData analyticsDashboardId(String analyticsDashboardId) {
		this.analyticsDashboardId = analyticsDashboardId;
		return this;
	}

	/**
	 * Dashboard ID the widget belongs to.
	 * 
	 * @return analyticsDashboardId
	 **/
	@ApiModelProperty(value = "Dashboard ID the widget belongs to.")
	public String getAnalyticsDashboardId() {
		return analyticsDashboardId;
	}

	public void setAnalyticsDashboardId(String analyticsDashboardId) {
		this.analyticsDashboardId = analyticsDashboardId;
	}

	public AvgReservationTimeAnalyticsWidgetData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the widget. Maximum length of 250 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the widget. Maximum length of 250 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AvgReservationTimeAnalyticsWidgetData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the widget. Maximum length of 500 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the widget. Maximum length of 500 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AvgReservationTimeAnalyticsWidgetData kpiType(EAnalyticsKpiType kpiType) {
		this.kpiType = kpiType;
		return this;
	}

	/**
	 * Get kpiType
	 * 
	 * @return kpiType
	 **/
	@ApiModelProperty(required = true, value = "")
	public EAnalyticsKpiType getKpiType() {
		return kpiType;
	}

	public void setKpiType(EAnalyticsKpiType kpiType) {
		this.kpiType = kpiType;
	}

	public AvgReservationTimeAnalyticsWidgetData row(Integer row) {
		this.row = row;
		return this;
	}

	/**
	 * Row number where the widget is displayed. Integer value from 1 to 100 (inclusive). Widget placement must be within a 100x6 grid and must not overlap with
	 * another widget. Mandatory.
	 * 
	 * @return row
	 **/
	@ApiModelProperty(value = "Row number where the widget is displayed. Integer value from 1 to 100 (inclusive). Widget placement must be within a 100x6 grid and must not overlap with another widget. Mandatory.")
	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public AvgReservationTimeAnalyticsWidgetData rowSpan(Integer rowSpan) {
		this.rowSpan = rowSpan;
		return this;
	}

	/**
	 * Displayed row span of the widget. Widget placement must be within a 100x6 grid and must not overlap with another widget. Mandatory.
	 * 
	 * @return rowSpan
	 **/
	@ApiModelProperty(value = "Displayed row span of the widget. Widget placement must be within a 100x6 grid and must not overlap with another widget. Mandatory.")
	public Integer getRowSpan() {
		return rowSpan;
	}

	public void setRowSpan(Integer rowSpan) {
		this.rowSpan = rowSpan;
	}

	public AvgReservationTimeAnalyticsWidgetData column(Integer column) {
		this.column = column;
		return this;
	}

	/**
	 * Column number where the widget is displayed. Integer value from 1 to 6 (inclusive). Widget placement must be within a 100x6 grid and must not overlap with
	 * another widget. Mandatory.
	 * 
	 * @return column
	 **/
	@ApiModelProperty(value = "Column number where the widget is displayed. Integer value from 1 to 6 (inclusive). Widget placement must be within a 100x6 grid and must not overlap with another widget. Mandatory.")
	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}

	public AvgReservationTimeAnalyticsWidgetData columnSpan(Integer columnSpan) {
		this.columnSpan = columnSpan;
		return this;
	}

	/**
	 * Column span of the widget. Must be at least 2 if &#x60;displayChart&#x60; is not &#x60;NONE&#x60;. Widget placement must be within a 100x6 grid and must not
	 * overlap with another widget. Mandatory.
	 * 
	 * @return columnSpan
	 **/
	@ApiModelProperty(value = "Column span of the widget. Must be at least 2 if `displayChart` is not `NONE`. Widget placement must be within a 100x6 grid and must not overlap with another widget. Mandatory.")
	public Integer getColumnSpan() {
		return columnSpan;
	}

	public void setColumnSpan(Integer columnSpan) {
		this.columnSpan = columnSpan;
	}

	public AvgReservationTimeAnalyticsWidgetData displaySingleValueAggregation(EAnalyticsKpiDisplaySingleValueAggregation displaySingleValueAggregation) {
		this.displaySingleValueAggregation = displaySingleValueAggregation;
		return this;
	}

	/**
	 * Get displaySingleValueAggregation
	 * 
	 * @return displaySingleValueAggregation
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsKpiDisplaySingleValueAggregation getDisplaySingleValueAggregation() {
		return displaySingleValueAggregation;
	}

	public void setDisplaySingleValueAggregation(EAnalyticsKpiDisplaySingleValueAggregation displaySingleValueAggregation) {
		this.displaySingleValueAggregation = displaySingleValueAggregation;
	}

	public AvgReservationTimeAnalyticsWidgetData displaySingleValuePreviousPeriodComparison(Boolean displaySingleValuePreviousPeriodComparison) {
		this.displaySingleValuePreviousPeriodComparison = displaySingleValuePreviousPeriodComparison;
		return this;
	}

	/**
	 * Flag indicating whether a single KPI value for the previous period is displayed for comparison with the current period. &lt;p&gt; The timeframe used for the
	 * previous period depends on the aggregation type: &lt;ul&gt; &lt;li&gt;If &#x60;displaySingleValueAggregation&#x60; is &#x60;SUM&#x60;, the previous period
	 * timeframe is proportional to the elapsed portion of the current timeframe. &lt;li&gt;If &#x60;displaySingleValueAggregation&#x60; is &#x60;AVG&#x60;, the
	 * entire previous period timeframe is used. &lt;/ul&gt; &lt;p&gt; The same filters used for chart data calculation are applied. Grouping is not applied.
	 * 
	 * @return displaySingleValuePreviousPeriodComparison
	 **/
	@ApiModelProperty(value = "Flag indicating whether a single KPI value for the previous period is displayed for comparison with the current period. <p> The timeframe used for the previous period depends on the aggregation type: <ul> <li>If `displaySingleValueAggregation` is `SUM`, the previous period timeframe is proportional to the elapsed portion of the current timeframe. <li>If `displaySingleValueAggregation` is `AVG`, the entire previous period timeframe is used. </ul> <p> The same filters used for chart data calculation are applied. Grouping is not applied.")
	public Boolean isDisplaySingleValuePreviousPeriodComparison() {
		return displaySingleValuePreviousPeriodComparison;
	}

	public void setDisplaySingleValuePreviousPeriodComparison(Boolean displaySingleValuePreviousPeriodComparison) {
		this.displaySingleValuePreviousPeriodComparison = displaySingleValuePreviousPeriodComparison;
	}

	public AvgReservationTimeAnalyticsWidgetData displayChart(EAnalyticsKpiDisplayChart displayChart) {
		this.displayChart = displayChart;
		return this;
	}

	/**
	 * Get displayChart
	 * 
	 * @return displayChart
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsKpiDisplayChart getDisplayChart() {
		return displayChart;
	}

	public void setDisplayChart(EAnalyticsKpiDisplayChart displayChart) {
		this.displayChart = displayChart;
	}

	public AvgReservationTimeAnalyticsWidgetData initialTimeFrameType(EAnalyticsKpiTimeFrameType initialTimeFrameType) {
		this.initialTimeFrameType = initialTimeFrameType;
		return this;
	}

	/**
	 * Get initialTimeFrameType
	 * 
	 * @return initialTimeFrameType
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsKpiTimeFrameType getInitialTimeFrameType() {
		return initialTimeFrameType;
	}

	public void setInitialTimeFrameType(EAnalyticsKpiTimeFrameType initialTimeFrameType) {
		this.initialTimeFrameType = initialTimeFrameType;
	}

	public AvgReservationTimeAnalyticsWidgetData initialTimeFrameSpan(EAnalyticsKpiFixedTimeFrameSpan initialTimeFrameSpan) {
		this.initialTimeFrameSpan = initialTimeFrameSpan;
		return this;
	}

	/**
	 * Get initialTimeFrameSpan
	 * 
	 * @return initialTimeFrameSpan
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsKpiFixedTimeFrameSpan getInitialTimeFrameSpan() {
		return initialTimeFrameSpan;
	}

	public void setInitialTimeFrameSpan(EAnalyticsKpiFixedTimeFrameSpan initialTimeFrameSpan) {
		this.initialTimeFrameSpan = initialTimeFrameSpan;
	}

	public AvgReservationTimeAnalyticsWidgetData initialTimeFrameLastDays(Integer initialTimeFrameLastDays) {
		this.initialTimeFrameLastDays = initialTimeFrameLastDays;
		return this;
	}

	/**
	 * Initial number of last days for the timeframe. Mandatory if the timeframe type is set to &#x60;LAST_DAYS&#x60;.
	 * 
	 * @return initialTimeFrameLastDays
	 **/
	@ApiModelProperty(value = "Initial number of last days for the timeframe. Mandatory if the timeframe type is set to `LAST_DAYS`.")
	public Integer getInitialTimeFrameLastDays() {
		return initialTimeFrameLastDays;
	}

	public void setInitialTimeFrameLastDays(Integer initialTimeFrameLastDays) {
		this.initialTimeFrameLastDays = initialTimeFrameLastDays;
	}

	public AvgReservationTimeAnalyticsWidgetData granularityType(EAnalyticsKpiGranularityType granularityType) {
		this.granularityType = granularityType;
		return this;
	}

	/**
	 * Get granularityType
	 * 
	 * @return granularityType
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsKpiGranularityType getGranularityType() {
		return granularityType;
	}

	public void setGranularityType(EAnalyticsKpiGranularityType granularityType) {
		this.granularityType = granularityType;
	}

	public AvgReservationTimeAnalyticsWidgetData fixedGranularity(EAnalyticsKpiFixedGranularity fixedGranularity) {
		this.fixedGranularity = fixedGranularity;
		return this;
	}

	/**
	 * Get fixedGranularity
	 * 
	 * @return fixedGranularity
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsKpiFixedGranularity getFixedGranularity() {
		return fixedGranularity;
	}

	public void setFixedGranularity(EAnalyticsKpiFixedGranularity fixedGranularity) {
		this.fixedGranularity = fixedGranularity;
	}

	public AvgReservationTimeAnalyticsWidgetData translations(Map<String, AnalyticsWidgetTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public AvgReservationTimeAnalyticsWidgetData putTranslationsItem(String key, AnalyticsWidgetTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A map of localized versions of the widget&#39;s name and description.
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A map of localized versions of the widget's name and description.")
	public Map<String, AnalyticsWidgetTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, AnalyticsWidgetTranslation> translations) {
		this.translations = translations;
	}

	public AvgReservationTimeAnalyticsWidgetData referenceLines(List<AnalyticsKpiReferenceLine> referenceLines) {
		this.referenceLines = referenceLines;
		return this;
	}

	public AvgReservationTimeAnalyticsWidgetData addReferenceLinesItem(AnalyticsKpiReferenceLine referenceLinesItem) {
		if (this.referenceLines == null) {
			this.referenceLines = new ArrayList<>();
		}
		this.referenceLines.add(referenceLinesItem);
		return this;
	}

	/**
	 * A list of reference lines displayed on the chart. Must be null if display chart is set to &#x60;NONE&#x60;.
	 * 
	 * @return referenceLines
	 **/
	@ApiModelProperty(value = "A list of reference lines displayed on the chart. Must be null if display chart is set to `NONE`.")
	public List<AnalyticsKpiReferenceLine> getReferenceLines() {
		return referenceLines;
	}

	public void setReferenceLines(List<AnalyticsKpiReferenceLine> referenceLines) {
		this.referenceLines = referenceLines;
	}

	public AvgReservationTimeAnalyticsWidgetData filtersType(EAnalyticsKpiFiltersType filtersType) {
		this.filtersType = filtersType;
		return this;
	}

	/**
	 * Get filtersType
	 * 
	 * @return filtersType
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsKpiFiltersType getFiltersType() {
		return filtersType;
	}

	public void setFiltersType(EAnalyticsKpiFiltersType filtersType) {
		this.filtersType = filtersType;
	}

	public AvgReservationTimeAnalyticsWidgetData groupBy(List<EAvgReservationTimeGroupBy> groupBy) {
		this.groupBy = groupBy;
		return this;
	}

	public AvgReservationTimeAnalyticsWidgetData addGroupByItem(EAvgReservationTimeGroupBy groupByItem) {
		if (this.groupBy == null) {
			this.groupBy = new ArrayList<>();
		}
		this.groupBy.add(groupByItem);
		return this;
	}

	/**
	 * Specifies how results are grouped for the average reservation time KPI. Only the first value of the list is used.
	 * 
	 * @return groupBy
	 **/
	@ApiModelProperty(value = "Specifies how results are grouped for the average reservation time KPI. Only the first value of the list is used.")
	public List<EAvgReservationTimeGroupBy> getGroupBy() {
		return groupBy;
	}

	public void setGroupBy(List<EAvgReservationTimeGroupBy> groupBy) {
		this.groupBy = groupBy;
	}

	public AvgReservationTimeAnalyticsWidgetData filters(AvgReservationTimeAnalyticsKpiFilterData filters) {
		this.filters = filters;
		return this;
	}

	/**
	 * Get filters
	 * 
	 * @return filters
	 **/
	@ApiModelProperty(value = "")
	public AvgReservationTimeAnalyticsKpiFilterData getFilters() {
		return filters;
	}

	public void setFilters(AvgReservationTimeAnalyticsKpiFilterData filters) {
		this.filters = filters;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AvgReservationTimeAnalyticsWidgetData avgReservationTimeAnalyticsWidgetData = (AvgReservationTimeAnalyticsWidgetData) o;
		return Objects.equals(this.$type, avgReservationTimeAnalyticsWidgetData.$type) &&
				Objects.equals(this.id, avgReservationTimeAnalyticsWidgetData.id) &&
				Objects.equals(this.accountId, avgReservationTimeAnalyticsWidgetData.accountId) &&
				Objects.equals(this.creationTimestamp, avgReservationTimeAnalyticsWidgetData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, avgReservationTimeAnalyticsWidgetData.modificationTimestamp) &&
				Objects.equals(this.version, avgReservationTimeAnalyticsWidgetData.version) &&
				Objects.equals(this.analyticsDashboardId, avgReservationTimeAnalyticsWidgetData.analyticsDashboardId) &&
				Objects.equals(this.name, avgReservationTimeAnalyticsWidgetData.name) &&
				Objects.equals(this.description, avgReservationTimeAnalyticsWidgetData.description) &&
				Objects.equals(this.kpiType, avgReservationTimeAnalyticsWidgetData.kpiType) &&
				Objects.equals(this.row, avgReservationTimeAnalyticsWidgetData.row) &&
				Objects.equals(this.rowSpan, avgReservationTimeAnalyticsWidgetData.rowSpan) &&
				Objects.equals(this.column, avgReservationTimeAnalyticsWidgetData.column) &&
				Objects.equals(this.columnSpan, avgReservationTimeAnalyticsWidgetData.columnSpan) &&
				Objects.equals(this.displaySingleValueAggregation, avgReservationTimeAnalyticsWidgetData.displaySingleValueAggregation) &&
				Objects.equals(this.displaySingleValuePreviousPeriodComparison, avgReservationTimeAnalyticsWidgetData.displaySingleValuePreviousPeriodComparison) &&
				Objects.equals(this.displayChart, avgReservationTimeAnalyticsWidgetData.displayChart) &&
				Objects.equals(this.initialTimeFrameType, avgReservationTimeAnalyticsWidgetData.initialTimeFrameType) &&
				Objects.equals(this.initialTimeFrameSpan, avgReservationTimeAnalyticsWidgetData.initialTimeFrameSpan) &&
				Objects.equals(this.initialTimeFrameLastDays, avgReservationTimeAnalyticsWidgetData.initialTimeFrameLastDays) &&
				Objects.equals(this.granularityType, avgReservationTimeAnalyticsWidgetData.granularityType) &&
				Objects.equals(this.fixedGranularity, avgReservationTimeAnalyticsWidgetData.fixedGranularity) &&
				Objects.equals(this.translations, avgReservationTimeAnalyticsWidgetData.translations) &&
				Objects.equals(this.referenceLines, avgReservationTimeAnalyticsWidgetData.referenceLines) &&
				Objects.equals(this.filtersType, avgReservationTimeAnalyticsWidgetData.filtersType) &&
				Objects.equals(this.groupBy, avgReservationTimeAnalyticsWidgetData.groupBy) &&
				Objects.equals(this.filters, avgReservationTimeAnalyticsWidgetData.filters);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, creationTimestamp, modificationTimestamp, version, analyticsDashboardId, name, description, kpiType, row, rowSpan, column, columnSpan, displaySingleValueAggregation, displaySingleValuePreviousPeriodComparison, displayChart, initialTimeFrameType, initialTimeFrameSpan, initialTimeFrameLastDays, granularityType, fixedGranularity, translations, referenceLines, filtersType, groupBy, filters);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AvgReservationTimeAnalyticsWidgetData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    analyticsDashboardId: ").append(toIndentedString(analyticsDashboardId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    kpiType: ").append(toIndentedString(kpiType)).append("\n");
		sb.append("    row: ").append(toIndentedString(row)).append("\n");
		sb.append("    rowSpan: ").append(toIndentedString(rowSpan)).append("\n");
		sb.append("    column: ").append(toIndentedString(column)).append("\n");
		sb.append("    columnSpan: ").append(toIndentedString(columnSpan)).append("\n");
		sb.append("    displaySingleValueAggregation: ").append(toIndentedString(displaySingleValueAggregation)).append("\n");
		sb.append("    displaySingleValuePreviousPeriodComparison: ").append(toIndentedString(displaySingleValuePreviousPeriodComparison)).append("\n");
		sb.append("    displayChart: ").append(toIndentedString(displayChart)).append("\n");
		sb.append("    initialTimeFrameType: ").append(toIndentedString(initialTimeFrameType)).append("\n");
		sb.append("    initialTimeFrameSpan: ").append(toIndentedString(initialTimeFrameSpan)).append("\n");
		sb.append("    initialTimeFrameLastDays: ").append(toIndentedString(initialTimeFrameLastDays)).append("\n");
		sb.append("    granularityType: ").append(toIndentedString(granularityType)).append("\n");
		sb.append("    fixedGranularity: ").append(toIndentedString(fixedGranularity)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
		sb.append("    referenceLines: ").append(toIndentedString(referenceLines)).append("\n");
		sb.append("    filtersType: ").append(toIndentedString(filtersType)).append("\n");
		sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
		sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
