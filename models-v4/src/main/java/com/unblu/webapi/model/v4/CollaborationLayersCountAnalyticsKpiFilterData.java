
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
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
 * Data model object representing filters for the KPI calculation of the number used layers &lt;p&gt; Filter logic: &lt;ul&gt; &lt;li&gt;startTimestamp
 * AND&lt;/li&gt; &lt;li&gt;endTimestamp AND&lt;/li&gt; &lt;li&gt;conversationTemplateIds AND&lt;/li&gt; &lt;li&gt;conversationLocales AND&lt;/li&gt;
 * &lt;li&gt;initialEngagementTypes AND&lt;/li&gt; &lt;li&gt;(recipientAgentIds OR recipientTeamIds OR recipientNamedAreaIds OR recipientAccountId)&lt;/li&gt;
 * &lt;li&gt;assignedAgentPersonIds AND&lt;/li&gt; &lt;li&gt;assignedAgentTeamIds AND&lt;/li&gt; &lt;li&gt;startingPersonIds AND&lt;/li&gt;
 * &lt;li&gt;startingPersonTeamIds AND&lt;/li&gt; &lt;li&gt;layerTypes AND&lt;/li&gt; &lt;li&gt;stopReasons AND&lt;/li&gt; &lt;li&gt;minActiveDuration
 * AND&lt;/li&gt; &lt;li&gt;maxActiveDuration&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;
 */
@ApiModel(description = "Data model object representing filters for the KPI calculation of the number used layers <p> Filter logic: <ul> <li>startTimestamp AND</li> <li>endTimestamp AND</li> <li>conversationTemplateIds AND</li> <li>conversationLocales AND</li> <li>initialEngagementTypes AND</li> <li>(recipientAgentIds OR recipientTeamIds OR recipientNamedAreaIds OR recipientAccountId)</li> <li>assignedAgentPersonIds AND</li> <li>assignedAgentTeamIds AND</li> <li>startingPersonIds AND</li> <li>startingPersonTeamIds AND</li> <li>layerTypes AND</li> <li>stopReasons AND</li> <li>minActiveDuration AND</li> <li>maxActiveDuration</li> </ul> <p>")

@JsonPropertyOrder({
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_$_TYPE,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_START_TIMESTAMP,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_END_TIMESTAMP,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_CONVERSATION_TEMPLATE_IDS,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_CONVERSATION_LOCALES,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPES,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_AGENT_PERSON_IDS,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_TEAM_IDS,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_NAMED_AREA_IDS,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_ACCOUNT_ID,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_ASSIGNED_AGENT_PERSON_IDS,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_ASSIGNED_AGENT_TEAM_IDS,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_STARTING_PERSON_IDS,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_STARTING_PERSON_TEAM_IDS,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_LAYER_TYPES,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_LAYER_STOP_REASONS,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_MIN_ACTIVE_DURATION,
	CollaborationLayersCountAnalyticsKpiFilterData.JSON_PROPERTY_MAX_ACTIVE_DURATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CollaborationLayersCountAnalyticsKpiFilterData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		COLLABORATIONLAYERSCOUNTANALYTICSKPIFILTERDATA("CollaborationLayersCountAnalyticsKpiFilterData");

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
			return TypeEnum.COLLABORATIONLAYERSCOUNTANALYTICSKPIFILTERDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.COLLABORATIONLAYERSCOUNTANALYTICSKPIFILTERDATA;

	public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
	@JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
	private Long startTimestamp;

	public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
	@JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
	private Long endTimestamp;

	public static final String JSON_PROPERTY_CONVERSATION_TEMPLATE_IDS = "conversationTemplateIds";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_TEMPLATE_IDS)
	private List<String> conversationTemplateIds = null;

	public static final String JSON_PROPERTY_CONVERSATION_LOCALES = "conversationLocales";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_LOCALES)
	private List<String> conversationLocales = null;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPES = "initialEngagementTypes";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPES)
	private List<EInitialEngagementType> initialEngagementTypes = null;

	public static final String JSON_PROPERTY_RECIPIENT_AGENT_PERSON_IDS = "recipientAgentPersonIds";
	@JsonProperty(JSON_PROPERTY_RECIPIENT_AGENT_PERSON_IDS)
	private List<String> recipientAgentPersonIds = null;

	public static final String JSON_PROPERTY_RECIPIENT_TEAM_IDS = "recipientTeamIds";
	@JsonProperty(JSON_PROPERTY_RECIPIENT_TEAM_IDS)
	private List<String> recipientTeamIds = null;

	public static final String JSON_PROPERTY_RECIPIENT_NAMED_AREA_IDS = "recipientNamedAreaIds";
	@JsonProperty(JSON_PROPERTY_RECIPIENT_NAMED_AREA_IDS)
	private List<String> recipientNamedAreaIds = null;

	public static final String JSON_PROPERTY_RECIPIENT_ACCOUNT_ID = "recipientAccountId";
	@JsonProperty(JSON_PROPERTY_RECIPIENT_ACCOUNT_ID)
	private Boolean recipientAccountId;

	public static final String JSON_PROPERTY_ASSIGNED_AGENT_PERSON_IDS = "assignedAgentPersonIds";
	@JsonProperty(JSON_PROPERTY_ASSIGNED_AGENT_PERSON_IDS)
	private List<String> assignedAgentPersonIds = null;

	public static final String JSON_PROPERTY_ASSIGNED_AGENT_TEAM_IDS = "assignedAgentTeamIds";
	@JsonProperty(JSON_PROPERTY_ASSIGNED_AGENT_TEAM_IDS)
	private List<String> assignedAgentTeamIds = null;

	public static final String JSON_PROPERTY_STARTING_PERSON_IDS = "startingPersonIds";
	@JsonProperty(JSON_PROPERTY_STARTING_PERSON_IDS)
	private List<String> startingPersonIds = null;

	public static final String JSON_PROPERTY_STARTING_PERSON_TEAM_IDS = "startingPersonTeamIds";
	@JsonProperty(JSON_PROPERTY_STARTING_PERSON_TEAM_IDS)
	private List<String> startingPersonTeamIds = null;

	public static final String JSON_PROPERTY_LAYER_TYPES = "layerTypes";
	@JsonProperty(JSON_PROPERTY_LAYER_TYPES)
	private List<ELayerType> layerTypes = null;

	public static final String JSON_PROPERTY_LAYER_STOP_REASONS = "layerStopReasons";
	@JsonProperty(JSON_PROPERTY_LAYER_STOP_REASONS)
	private List<ELayerStopReason> layerStopReasons = null;

	public static final String JSON_PROPERTY_MIN_ACTIVE_DURATION = "minActiveDuration";
	@JsonProperty(JSON_PROPERTY_MIN_ACTIVE_DURATION)
	private Long minActiveDuration;

	public static final String JSON_PROPERTY_MAX_ACTIVE_DURATION = "maxActiveDuration";
	@JsonProperty(JSON_PROPERTY_MAX_ACTIVE_DURATION)
	private Long maxActiveDuration;

	public CollaborationLayersCountAnalyticsKpiFilterData $type(TypeEnum $type) {
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

	public CollaborationLayersCountAnalyticsKpiFilterData startTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		return this;
	}

	/**
	 * KPI timeframe start timestamp. Mandatory for &#x60;CUSTOM&#x60; timeframe type and must be null for all other timeframe types.
	 * 
	 * @return startTimestamp
	 **/
	@ApiModelProperty(value = "KPI timeframe start timestamp. Mandatory for `CUSTOM` timeframe type and must be null for all other timeframe types.")
	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData endTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		return this;
	}

	/**
	 * KPI timeframe end timestamp. Mandatory for &#x60;CUSTOM&#x60; timeframe type and must be null for all other timeframe types.
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "KPI timeframe end timestamp. Mandatory for `CUSTOM` timeframe type and must be null for all other timeframe types.")
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData conversationTemplateIds(List<String> conversationTemplateIds) {
		this.conversationTemplateIds = conversationTemplateIds;
		return this;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData addConversationTemplateIdsItem(String conversationTemplateIdsItem) {
		if (this.conversationTemplateIds == null) {
			this.conversationTemplateIds = new ArrayList<>();
		}
		this.conversationTemplateIds.add(conversationTemplateIdsItem);
		return this;
	}

	/**
	 * A list of conversation template IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are
	 * included. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return conversationTemplateIds
	 **/
	@ApiModelProperty(value = "A list of conversation template IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getConversationTemplateIds() {
		return conversationTemplateIds;
	}

	public void setConversationTemplateIds(List<String> conversationTemplateIds) {
		this.conversationTemplateIds = conversationTemplateIds;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData conversationLocales(List<String> conversationLocales) {
		this.conversationLocales = conversationLocales;
		return this;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData addConversationLocalesItem(String conversationLocalesItem) {
		if (this.conversationLocales == null) {
			this.conversationLocales = new ArrayList<>();
		}
		this.conversationLocales.add(conversationLocalesItem);
		return this;
	}

	/**
	 * A list of conversation locales used to filter the analytics data included in the KPI calculation. Records matching any of the specified locales are included.
	 * If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return conversationLocales
	 **/
	@ApiModelProperty(value = "A list of conversation locales used to filter the analytics data included in the KPI calculation. Records matching any of the specified locales are included. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getConversationLocales() {
		return conversationLocales;
	}

	public void setConversationLocales(List<String> conversationLocales) {
		this.conversationLocales = conversationLocales;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData initialEngagementTypes(List<EInitialEngagementType> initialEngagementTypes) {
		this.initialEngagementTypes = initialEngagementTypes;
		return this;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData addInitialEngagementTypesItem(EInitialEngagementType initialEngagementTypesItem) {
		if (this.initialEngagementTypes == null) {
			this.initialEngagementTypes = new ArrayList<>();
		}
		this.initialEngagementTypes.add(initialEngagementTypesItem);
		return this;
	}

	/**
	 * A list of initial engagement types used to filter the analytics data included in the KPI calculation. Records matching any of the specified types are
	 * included. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return initialEngagementTypes
	 **/
	@ApiModelProperty(value = "A list of initial engagement types used to filter the analytics data included in the KPI calculation. Records matching any of the specified types are included. If null, the filter is not applied. An empty list is not allowed.")
	public List<EInitialEngagementType> getInitialEngagementTypes() {
		return initialEngagementTypes;
	}

	public void setInitialEngagementTypes(List<EInitialEngagementType> initialEngagementTypes) {
		this.initialEngagementTypes = initialEngagementTypes;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData recipientAgentPersonIds(List<String> recipientAgentPersonIds) {
		this.recipientAgentPersonIds = recipientAgentPersonIds;
		return this;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData addRecipientAgentPersonIdsItem(String recipientAgentPersonIdsItem) {
		if (this.recipientAgentPersonIds == null) {
			this.recipientAgentPersonIds = new ArrayList<>();
		}
		this.recipientAgentPersonIds.add(recipientAgentPersonIdsItem);
		return this;
	}

	/**
	 * A list of recipient agent person IDs used to filter the analytics data included in the KPI calculation. Records are included if their conversation recipient
	 * ID matches any of the specified agent IDs. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the
	 * &#x60;CURRENT_USER&#x60; variable. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return recipientAgentPersonIds
	 **/
	@ApiModelProperty(value = "A list of recipient agent person IDs used to filter the analytics data included in the KPI calculation. Records are included if their conversation recipient ID matches any of the specified agent IDs. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the `CURRENT_USER` variable. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getRecipientAgentPersonIds() {
		return recipientAgentPersonIds;
	}

	public void setRecipientAgentPersonIds(List<String> recipientAgentPersonIds) {
		this.recipientAgentPersonIds = recipientAgentPersonIds;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData recipientTeamIds(List<String> recipientTeamIds) {
		this.recipientTeamIds = recipientTeamIds;
		return this;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData addRecipientTeamIdsItem(String recipientTeamIdsItem) {
		if (this.recipientTeamIds == null) {
			this.recipientTeamIds = new ArrayList<>();
		}
		this.recipientTeamIds.add(recipientTeamIdsItem);
		return this;
	}

	/**
	 * A list of recipient team IDs used to filter the analytics data included in the KPI calculation. Records are included if their conversation recipient ID
	 * matches any of the specified team IDs. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the
	 * &#x60;CURRENT_TEAM&#x60; variable. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return recipientTeamIds
	 **/
	@ApiModelProperty(value = "A list of recipient team IDs used to filter the analytics data included in the KPI calculation. Records are included if their conversation recipient ID matches any of the specified team IDs. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the `CURRENT_TEAM` variable. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getRecipientTeamIds() {
		return recipientTeamIds;
	}

	public void setRecipientTeamIds(List<String> recipientTeamIds) {
		this.recipientTeamIds = recipientTeamIds;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData recipientNamedAreaIds(List<String> recipientNamedAreaIds) {
		this.recipientNamedAreaIds = recipientNamedAreaIds;
		return this;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData addRecipientNamedAreaIdsItem(String recipientNamedAreaIdsItem) {
		if (this.recipientNamedAreaIds == null) {
			this.recipientNamedAreaIds = new ArrayList<>();
		}
		this.recipientNamedAreaIds.add(recipientNamedAreaIdsItem);
		return this;
	}

	/**
	 * A list of recipient named area IDs used to filter the analytics data included in the KPI calculation. Records are included if their conversation recipient ID
	 * matches any of the specified named area IDs. The specified IDs must exist in the Unblu database and be accessible to the user. If null, the filter is not
	 * applied. An empty list is not allowed.
	 * 
	 * @return recipientNamedAreaIds
	 **/
	@ApiModelProperty(value = "A list of recipient named area IDs used to filter the analytics data included in the KPI calculation. Records are included if their conversation recipient ID matches any of the specified named area IDs. The specified IDs must exist in the Unblu database and be accessible to the user. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getRecipientNamedAreaIds() {
		return recipientNamedAreaIds;
	}

	public void setRecipientNamedAreaIds(List<String> recipientNamedAreaIds) {
		this.recipientNamedAreaIds = recipientNamedAreaIds;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData recipientAccountId(Boolean recipientAccountId) {
		this.recipientAccountId = recipientAccountId;
		return this;
	}

	/**
	 * If true, includes records where the conversation recipient ID matches the current user&#39;s account ID. The filter is not applied otherwise. Optional.
	 * 
	 * @return recipientAccountId
	 **/
	@ApiModelProperty(value = "If true, includes records where the conversation recipient ID matches the current user's account ID. The filter is not applied otherwise. Optional.")
	public Boolean isRecipientAccountId() {
		return recipientAccountId;
	}

	public void setRecipientAccountId(Boolean recipientAccountId) {
		this.recipientAccountId = recipientAccountId;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData assignedAgentPersonIds(List<String> assignedAgentPersonIds) {
		this.assignedAgentPersonIds = assignedAgentPersonIds;
		return this;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData addAssignedAgentPersonIdsItem(String assignedAgentPersonIdsItem) {
		if (this.assignedAgentPersonIds == null) {
			this.assignedAgentPersonIds = new ArrayList<>();
		}
		this.assignedAgentPersonIds.add(assignedAgentPersonIdsItem);
		return this;
	}

	/**
	 * A list of assigned agent person IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are
	 * included. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the &#x60;CURRENT_USER&#x60; variable. If null, the
	 * filter is not included in the calculation. Empty list is not allowed. Optional.
	 * 
	 * @return assignedAgentPersonIds
	 **/
	@ApiModelProperty(value = "A list of assigned agent person IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the `CURRENT_USER` variable. If null, the filter is not included in the calculation. Empty list is not allowed. Optional.")
	public List<String> getAssignedAgentPersonIds() {
		return assignedAgentPersonIds;
	}

	public void setAssignedAgentPersonIds(List<String> assignedAgentPersonIds) {
		this.assignedAgentPersonIds = assignedAgentPersonIds;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData assignedAgentTeamIds(List<String> assignedAgentTeamIds) {
		this.assignedAgentTeamIds = assignedAgentTeamIds;
		return this;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData addAssignedAgentTeamIdsItem(String assignedAgentTeamIdsItem) {
		if (this.assignedAgentTeamIds == null) {
			this.assignedAgentTeamIds = new ArrayList<>();
		}
		this.assignedAgentTeamIds.add(assignedAgentTeamIdsItem);
		return this;
	}

	/**
	 * A list of assigned agent team IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included.
	 * The specified IDs must exist in the Unblu database and be accessible to the user. Supports the &#x60;CURRENT_TEAM&#x60; variable. If null, the filter is not
	 * included in the calculation. Empty list is not allowed. Optional.
	 * 
	 * @return assignedAgentTeamIds
	 **/
	@ApiModelProperty(value = "A list of assigned agent team IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the `CURRENT_TEAM` variable. If null, the filter is not included in the calculation. Empty list is not allowed. Optional.")
	public List<String> getAssignedAgentTeamIds() {
		return assignedAgentTeamIds;
	}

	public void setAssignedAgentTeamIds(List<String> assignedAgentTeamIds) {
		this.assignedAgentTeamIds = assignedAgentTeamIds;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData startingPersonIds(List<String> startingPersonIds) {
		this.startingPersonIds = startingPersonIds;
		return this;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData addStartingPersonIdsItem(String startingPersonIdsItem) {
		if (this.startingPersonIds == null) {
			this.startingPersonIds = new ArrayList<>();
		}
		this.startingPersonIds.add(startingPersonIdsItem);
		return this;
	}

	/**
	 * A list of starting person IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included. The
	 * specified IDs must exist in the Unblu database and be accessible to the user. Supports the &#x60;CURRENT_USER&#x60; variable. If null, the filter is not
	 * applied. An empty list is not allowed.
	 * 
	 * @return startingPersonIds
	 **/
	@ApiModelProperty(value = "A list of starting person IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the `CURRENT_USER` variable. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getStartingPersonIds() {
		return startingPersonIds;
	}

	public void setStartingPersonIds(List<String> startingPersonIds) {
		this.startingPersonIds = startingPersonIds;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData startingPersonTeamIds(List<String> startingPersonTeamIds) {
		this.startingPersonTeamIds = startingPersonTeamIds;
		return this;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData addStartingPersonTeamIdsItem(String startingPersonTeamIdsItem) {
		if (this.startingPersonTeamIds == null) {
			this.startingPersonTeamIds = new ArrayList<>();
		}
		this.startingPersonTeamIds.add(startingPersonTeamIdsItem);
		return this;
	}

	/**
	 * A list of starting person team IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included.
	 * The specified IDs must exist in the Unblu database and be accessible to the user. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return startingPersonTeamIds
	 **/
	@ApiModelProperty(value = "A list of starting person team IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included. The specified IDs must exist in the Unblu database and be accessible to the user. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getStartingPersonTeamIds() {
		return startingPersonTeamIds;
	}

	public void setStartingPersonTeamIds(List<String> startingPersonTeamIds) {
		this.startingPersonTeamIds = startingPersonTeamIds;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData layerTypes(List<ELayerType> layerTypes) {
		this.layerTypes = layerTypes;
		return this;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData addLayerTypesItem(ELayerType layerTypesItem) {
		if (this.layerTypes == null) {
			this.layerTypes = new ArrayList<>();
		}
		this.layerTypes.add(layerTypesItem);
		return this;
	}

	/**
	 * A list of layer types used to filter the analytics data included in the KPI calculation. Records matching any of the specified types are included. If null,
	 * the filter is not applied. An empty list is not allowed.
	 * 
	 * @return layerTypes
	 **/
	@ApiModelProperty(value = "A list of layer types used to filter the analytics data included in the KPI calculation. Records matching any of the specified types are included. If null, the filter is not applied. An empty list is not allowed.")
	public List<ELayerType> getLayerTypes() {
		return layerTypes;
	}

	public void setLayerTypes(List<ELayerType> layerTypes) {
		this.layerTypes = layerTypes;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData layerStopReasons(List<ELayerStopReason> layerStopReasons) {
		this.layerStopReasons = layerStopReasons;
		return this;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData addLayerStopReasonsItem(ELayerStopReason layerStopReasonsItem) {
		if (this.layerStopReasons == null) {
			this.layerStopReasons = new ArrayList<>();
		}
		this.layerStopReasons.add(layerStopReasonsItem);
		return this;
	}

	/**
	 * A list of stop reasons used to filter the analytics data included in the KPI calculation. Records matching any of the specified reasons are included. If
	 * null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return layerStopReasons
	 **/
	@ApiModelProperty(value = "A list of stop reasons used to filter the analytics data included in the KPI calculation. Records matching any of the specified reasons are included. If null, the filter is not applied. An empty list is not allowed.")
	public List<ELayerStopReason> getLayerStopReasons() {
		return layerStopReasons;
	}

	public void setLayerStopReasons(List<ELayerStopReason> layerStopReasons) {
		this.layerStopReasons = layerStopReasons;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData minActiveDuration(Long minActiveDuration) {
		this.minActiveDuration = minActiveDuration;
		return this;
	}

	/**
	 * A minimum active duration. Records with at least the specified duration are included. If null, the filter is not applied.
	 * 
	 * @return minActiveDuration
	 **/
	@ApiModelProperty(value = "A minimum active duration. Records with at least the specified duration are included. If null, the filter is not applied.")
	public Long getMinActiveDuration() {
		return minActiveDuration;
	}

	public void setMinActiveDuration(Long minActiveDuration) {
		this.minActiveDuration = minActiveDuration;
	}

	public CollaborationLayersCountAnalyticsKpiFilterData maxActiveDuration(Long maxActiveDuration) {
		this.maxActiveDuration = maxActiveDuration;
		return this;
	}

	/**
	 * A maximum active duration. Records with a duration up to the specified value are included. If null, the filter is not applied.
	 * 
	 * @return maxActiveDuration
	 **/
	@ApiModelProperty(value = "A maximum active duration. Records with a duration up to the specified value are included. If null, the filter is not applied.")
	public Long getMaxActiveDuration() {
		return maxActiveDuration;
	}

	public void setMaxActiveDuration(Long maxActiveDuration) {
		this.maxActiveDuration = maxActiveDuration;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CollaborationLayersCountAnalyticsKpiFilterData collaborationLayersCountAnalyticsKpiFilterData = (CollaborationLayersCountAnalyticsKpiFilterData) o;
		return Objects.equals(this.$type, collaborationLayersCountAnalyticsKpiFilterData.$type) &&
				Objects.equals(this.startTimestamp, collaborationLayersCountAnalyticsKpiFilterData.startTimestamp) &&
				Objects.equals(this.endTimestamp, collaborationLayersCountAnalyticsKpiFilterData.endTimestamp) &&
				Objects.equals(this.conversationTemplateIds, collaborationLayersCountAnalyticsKpiFilterData.conversationTemplateIds) &&
				Objects.equals(this.conversationLocales, collaborationLayersCountAnalyticsKpiFilterData.conversationLocales) &&
				Objects.equals(this.initialEngagementTypes, collaborationLayersCountAnalyticsKpiFilterData.initialEngagementTypes) &&
				Objects.equals(this.recipientAgentPersonIds, collaborationLayersCountAnalyticsKpiFilterData.recipientAgentPersonIds) &&
				Objects.equals(this.recipientTeamIds, collaborationLayersCountAnalyticsKpiFilterData.recipientTeamIds) &&
				Objects.equals(this.recipientNamedAreaIds, collaborationLayersCountAnalyticsKpiFilterData.recipientNamedAreaIds) &&
				Objects.equals(this.recipientAccountId, collaborationLayersCountAnalyticsKpiFilterData.recipientAccountId) &&
				Objects.equals(this.assignedAgentPersonIds, collaborationLayersCountAnalyticsKpiFilterData.assignedAgentPersonIds) &&
				Objects.equals(this.assignedAgentTeamIds, collaborationLayersCountAnalyticsKpiFilterData.assignedAgentTeamIds) &&
				Objects.equals(this.startingPersonIds, collaborationLayersCountAnalyticsKpiFilterData.startingPersonIds) &&
				Objects.equals(this.startingPersonTeamIds, collaborationLayersCountAnalyticsKpiFilterData.startingPersonTeamIds) &&
				Objects.equals(this.layerTypes, collaborationLayersCountAnalyticsKpiFilterData.layerTypes) &&
				Objects.equals(this.layerStopReasons, collaborationLayersCountAnalyticsKpiFilterData.layerStopReasons) &&
				Objects.equals(this.minActiveDuration, collaborationLayersCountAnalyticsKpiFilterData.minActiveDuration) &&
				Objects.equals(this.maxActiveDuration, collaborationLayersCountAnalyticsKpiFilterData.maxActiveDuration);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, startTimestamp, endTimestamp, conversationTemplateIds, conversationLocales, initialEngagementTypes, recipientAgentPersonIds, recipientTeamIds, recipientNamedAreaIds, recipientAccountId, assignedAgentPersonIds, assignedAgentTeamIds, startingPersonIds, startingPersonTeamIds, layerTypes, layerStopReasons, minActiveDuration, maxActiveDuration);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CollaborationLayersCountAnalyticsKpiFilterData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
		sb.append("    conversationTemplateIds: ").append(toIndentedString(conversationTemplateIds)).append("\n");
		sb.append("    conversationLocales: ").append(toIndentedString(conversationLocales)).append("\n");
		sb.append("    initialEngagementTypes: ").append(toIndentedString(initialEngagementTypes)).append("\n");
		sb.append("    recipientAgentPersonIds: ").append(toIndentedString(recipientAgentPersonIds)).append("\n");
		sb.append("    recipientTeamIds: ").append(toIndentedString(recipientTeamIds)).append("\n");
		sb.append("    recipientNamedAreaIds: ").append(toIndentedString(recipientNamedAreaIds)).append("\n");
		sb.append("    recipientAccountId: ").append(toIndentedString(recipientAccountId)).append("\n");
		sb.append("    assignedAgentPersonIds: ").append(toIndentedString(assignedAgentPersonIds)).append("\n");
		sb.append("    assignedAgentTeamIds: ").append(toIndentedString(assignedAgentTeamIds)).append("\n");
		sb.append("    startingPersonIds: ").append(toIndentedString(startingPersonIds)).append("\n");
		sb.append("    startingPersonTeamIds: ").append(toIndentedString(startingPersonTeamIds)).append("\n");
		sb.append("    layerTypes: ").append(toIndentedString(layerTypes)).append("\n");
		sb.append("    layerStopReasons: ").append(toIndentedString(layerStopReasons)).append("\n");
		sb.append("    minActiveDuration: ").append(toIndentedString(minActiveDuration)).append("\n");
		sb.append("    maxActiveDuration: ").append(toIndentedString(maxActiveDuration)).append("\n");
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
