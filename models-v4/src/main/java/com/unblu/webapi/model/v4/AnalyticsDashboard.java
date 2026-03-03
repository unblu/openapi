
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
 * &lt;p&gt;This type is in preview mode.&lt;/p&gt;Data model object for an analytics dashboard
 */
@ApiModel(description = "<p>This type is in preview mode.</p>Data model object for an analytics dashboard")

@JsonPropertyOrder({
	AnalyticsDashboard.JSON_PROPERTY_$_TYPE,
	AnalyticsDashboard.JSON_PROPERTY_ID,
	AnalyticsDashboard.JSON_PROPERTY_CREATION_TIMESTAMP,
	AnalyticsDashboard.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	AnalyticsDashboard.JSON_PROPERTY_VERSION,
	AnalyticsDashboard.JSON_PROPERTY_ACCOUNT_ID,
	AnalyticsDashboard.JSON_PROPERTY_NAME,
	AnalyticsDashboard.JSON_PROPERTY_DESCRIPTION,
	AnalyticsDashboard.JSON_PROPERTY_INITIAL_TIME_FRAME_TYPE,
	AnalyticsDashboard.JSON_PROPERTY_INITIAL_TIME_FRAME_SPAN,
	AnalyticsDashboard.JSON_PROPERTY_INITIAL_TIME_FRAME_LAST_DAYS,
	AnalyticsDashboard.JSON_PROPERTY_INITIAL_GRANULARITY,
	AnalyticsDashboard.JSON_PROPERTY_ENABLED_GLOBAL_FILTERS,
	AnalyticsDashboard.JSON_PROPERTY_TRANSLATIONS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AnalyticsDashboard {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ANALYTICSDASHBOARD("AnalyticsDashboard");

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
			return TypeEnum.ANALYTICSDASHBOARD;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ANALYTICSDASHBOARD;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_VERSION = "version";
	@JsonProperty(JSON_PROPERTY_VERSION)
	private Long version;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public static final String JSON_PROPERTY_INITIAL_TIME_FRAME_TYPE = "initialTimeFrameType";
	@JsonProperty(JSON_PROPERTY_INITIAL_TIME_FRAME_TYPE)
	private EAnalyticsKpiTimeFrameType initialTimeFrameType;

	public static final String JSON_PROPERTY_INITIAL_TIME_FRAME_SPAN = "initialTimeFrameSpan";
	@JsonProperty(JSON_PROPERTY_INITIAL_TIME_FRAME_SPAN)
	private EAnalyticsKpiFixedTimeFrameSpan initialTimeFrameSpan;

	public static final String JSON_PROPERTY_INITIAL_TIME_FRAME_LAST_DAYS = "initialTimeFrameLastDays";
	@JsonProperty(JSON_PROPERTY_INITIAL_TIME_FRAME_LAST_DAYS)
	private Integer initialTimeFrameLastDays;

	public static final String JSON_PROPERTY_INITIAL_GRANULARITY = "initialGranularity";
	@JsonProperty(JSON_PROPERTY_INITIAL_GRANULARITY)
	private EAnalyticsKpiFixedGranularity initialGranularity;

	public static final String JSON_PROPERTY_ENABLED_GLOBAL_FILTERS = "enabledGlobalFilters";
	@JsonProperty(JSON_PROPERTY_ENABLED_GLOBAL_FILTERS)
	private List<EAnalyticsGlobalFilterType> enabledGlobalFilters = null;

	public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
	@JsonProperty(JSON_PROPERTY_TRANSLATIONS)
	private Map<String, AnalyticsDashboardTranslation> translations = null;

	public AnalyticsDashboard $type(TypeEnum $type) {
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

	public AnalyticsDashboard id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique ID of the entity. When creating an entity, this property can be omitted; it&#39;s generated by the server.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique ID of the entity. When creating an entity, this property can be omitted; it's generated by the server.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AnalyticsDashboard creationTimestamp(Long creationTimestamp) {
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

	public AnalyticsDashboard modificationTimestamp(Long modificationTimestamp) {
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

	public AnalyticsDashboard version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * Version of the entity. Will be incremented on each change. New updates must always be based on the newest version, if not updates will be rejected. When
	 * creating an object, the version can be omitted.
	 * 
	 * @return version
	 **/
	@ApiModelProperty(value = "Version of the entity. Will be incremented on each change. New updates must always be based on the newest version, if not updates will be rejected. When creating an object, the version can be omitted.")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public AnalyticsDashboard accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It will be filled by the server with the account ID of the
	 * user currently logged in. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It will be filled by the server with the account ID of the user currently logged in. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public AnalyticsDashboard name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the dashboard. Maximum length of 500 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the dashboard. Maximum length of 500 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AnalyticsDashboard description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the dashboard. Maximum length of 2000 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the dashboard. Maximum length of 2000 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AnalyticsDashboard initialTimeFrameType(EAnalyticsKpiTimeFrameType initialTimeFrameType) {
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

	public AnalyticsDashboard initialTimeFrameSpan(EAnalyticsKpiFixedTimeFrameSpan initialTimeFrameSpan) {
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

	public AnalyticsDashboard initialTimeFrameLastDays(Integer initialTimeFrameLastDays) {
		this.initialTimeFrameLastDays = initialTimeFrameLastDays;
		return this;
	}

	/**
	 * Initial timeframe number of last days. Used by widgets with the &#x60;GLOBALLY_SYNCED&#x60; timeframe type. Mandatory when the timeframe type is
	 * &#x60;LAST_DAYS&#x60;.
	 * 
	 * @return initialTimeFrameLastDays
	 **/
	@ApiModelProperty(value = "Initial timeframe number of last days. Used by widgets with the `GLOBALLY_SYNCED` timeframe type. Mandatory when the timeframe type is `LAST_DAYS`.")
	public Integer getInitialTimeFrameLastDays() {
		return initialTimeFrameLastDays;
	}

	public void setInitialTimeFrameLastDays(Integer initialTimeFrameLastDays) {
		this.initialTimeFrameLastDays = initialTimeFrameLastDays;
	}

	public AnalyticsDashboard initialGranularity(EAnalyticsKpiFixedGranularity initialGranularity) {
		this.initialGranularity = initialGranularity;
		return this;
	}

	/**
	 * Get initialGranularity
	 * 
	 * @return initialGranularity
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsKpiFixedGranularity getInitialGranularity() {
		return initialGranularity;
	}

	public void setInitialGranularity(EAnalyticsKpiFixedGranularity initialGranularity) {
		this.initialGranularity = initialGranularity;
	}

	public AnalyticsDashboard enabledGlobalFilters(List<EAnalyticsGlobalFilterType> enabledGlobalFilters) {
		this.enabledGlobalFilters = enabledGlobalFilters;
		return this;
	}

	public AnalyticsDashboard addEnabledGlobalFiltersItem(EAnalyticsGlobalFilterType enabledGlobalFiltersItem) {
		if (this.enabledGlobalFilters == null) {
			this.enabledGlobalFilters = new ArrayList<>();
		}
		this.enabledGlobalFilters.add(enabledGlobalFiltersItem);
		return this;
	}

	/**
	 * Enabled global filters for filtering all widgets of the dashboard simultaneously.
	 * 
	 * @return enabledGlobalFilters
	 **/
	@ApiModelProperty(value = "Enabled global filters for filtering all widgets of the dashboard simultaneously.")
	public List<EAnalyticsGlobalFilterType> getEnabledGlobalFilters() {
		return enabledGlobalFilters;
	}

	public void setEnabledGlobalFilters(List<EAnalyticsGlobalFilterType> enabledGlobalFilters) {
		this.enabledGlobalFilters = enabledGlobalFilters;
	}

	public AnalyticsDashboard translations(Map<String, AnalyticsDashboardTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public AnalyticsDashboard putTranslationsItem(String key, AnalyticsDashboardTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A map of localized versions of the dashboard&#39;s name and description.
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A map of localized versions of the dashboard's name and description.")
	public Map<String, AnalyticsDashboardTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, AnalyticsDashboardTranslation> translations) {
		this.translations = translations;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AnalyticsDashboard analyticsDashboard = (AnalyticsDashboard) o;
		return Objects.equals(this.$type, analyticsDashboard.$type) &&
				Objects.equals(this.id, analyticsDashboard.id) &&
				Objects.equals(this.creationTimestamp, analyticsDashboard.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, analyticsDashboard.modificationTimestamp) &&
				Objects.equals(this.version, analyticsDashboard.version) &&
				Objects.equals(this.accountId, analyticsDashboard.accountId) &&
				Objects.equals(this.name, analyticsDashboard.name) &&
				Objects.equals(this.description, analyticsDashboard.description) &&
				Objects.equals(this.initialTimeFrameType, analyticsDashboard.initialTimeFrameType) &&
				Objects.equals(this.initialTimeFrameSpan, analyticsDashboard.initialTimeFrameSpan) &&
				Objects.equals(this.initialTimeFrameLastDays, analyticsDashboard.initialTimeFrameLastDays) &&
				Objects.equals(this.initialGranularity, analyticsDashboard.initialGranularity) &&
				Objects.equals(this.enabledGlobalFilters, analyticsDashboard.enabledGlobalFilters) &&
				Objects.equals(this.translations, analyticsDashboard.translations);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, initialTimeFrameType, initialTimeFrameSpan, initialTimeFrameLastDays, initialGranularity, enabledGlobalFilters, translations);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AnalyticsDashboard {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    initialTimeFrameType: ").append(toIndentedString(initialTimeFrameType)).append("\n");
		sb.append("    initialTimeFrameSpan: ").append(toIndentedString(initialTimeFrameSpan)).append("\n");
		sb.append("    initialTimeFrameLastDays: ").append(toIndentedString(initialTimeFrameLastDays)).append("\n");
		sb.append("    initialGranularity: ").append(toIndentedString(initialGranularity)).append("\n");
		sb.append("    enabledGlobalFilters: ").append(toIndentedString(enabledGlobalFilters)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
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
