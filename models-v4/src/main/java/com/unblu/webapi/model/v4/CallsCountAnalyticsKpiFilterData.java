
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
 * Data model object representing filters for the KPI calculation of the number of calls &lt;p&gt; Filter logic: &lt;ul&gt; &lt;li&gt;startTimestamp
 * AND&lt;/li&gt; &lt;li&gt;endTimestamp AND&lt;/li&gt; &lt;li&gt;conversationTemplateIds AND&lt;/li&gt; &lt;li&gt;conversationLocales AND&lt;/li&gt;
 * &lt;li&gt;initialEngagementTypes AND&lt;/li&gt; &lt;li&gt;(recipientAgentIds OR recipientTeamIds OR recipientNamedAreaIds OR recipientAccountId)&lt;/li&gt;
 * &lt;li&gt;assignedAgentPersonIds AND&lt;/li&gt; &lt;li&gt;assignedAgentTeamIds AND&lt;/li&gt; &lt;li&gt;startingPersonIds AND&lt;/li&gt;
 * &lt;li&gt;startingPersonTeamIds AND&lt;/li&gt; &lt;li&gt;callTypes AND&lt;/li&gt; &lt;li&gt;endReasons AND&lt;/li&gt; &lt;li&gt;minActiveDuration
 * AND&lt;/li&gt; &lt;li&gt;maxActiveDuration&lt;/li&gt; &lt;li&gt;minOverallParticipants AND&lt;/li&gt; &lt;li&gt;maxOverallParticipantsn&lt;/li&gt;
 * &lt;/ul&gt; &lt;p&gt;
 */
@ApiModel(description = "Data model object representing filters for the KPI calculation of the number of calls <p> Filter logic: <ul> <li>startTimestamp AND</li> <li>endTimestamp AND</li> <li>conversationTemplateIds AND</li> <li>conversationLocales AND</li> <li>initialEngagementTypes AND</li> <li>(recipientAgentIds OR recipientTeamIds OR recipientNamedAreaIds OR recipientAccountId)</li> <li>assignedAgentPersonIds AND</li> <li>assignedAgentTeamIds AND</li> <li>startingPersonIds AND</li> <li>startingPersonTeamIds AND</li> <li>callTypes AND</li> <li>endReasons AND</li> <li>minActiveDuration AND</li> <li>maxActiveDuration</li> <li>minOverallParticipants AND</li> <li>maxOverallParticipantsn</li> </ul> <p>")

@JsonPropertyOrder({
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_$_TYPE,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_START_TIMESTAMP,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_END_TIMESTAMP,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_CONVERSATION_TEMPLATE_IDS,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_CONVERSATION_LOCALES,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPES,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_AGENT_PERSON_IDS,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_TEAM_IDS,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_NAMED_AREA_IDS,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_ACCOUNT_ID,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_ASSIGNED_AGENT_PERSON_IDS,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_ASSIGNED_AGENT_TEAM_IDS,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_STARTING_PERSON_IDS,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_STARTING_PERSON_TEAM_IDS,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_CALL_TYPES,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_CALL_END_REASONS,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_MIN_ACTIVE_DURATION,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_MAX_ACTIVE_DURATION,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_MIN_OVERALL_PARTICIPANTS,
	CallsCountAnalyticsKpiFilterData.JSON_PROPERTY_MAX_OVERALL_PARTICIPANTS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CallsCountAnalyticsKpiFilterData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CALLSCOUNTANALYTICSKPIFILTERDATA("CallsCountAnalyticsKpiFilterData");

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
			return TypeEnum.CALLSCOUNTANALYTICSKPIFILTERDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CALLSCOUNTANALYTICSKPIFILTERDATA;

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

	public static final String JSON_PROPERTY_CALL_TYPES = "callTypes";
	@JsonProperty(JSON_PROPERTY_CALL_TYPES)
	private List<ECallType> callTypes = null;

	public static final String JSON_PROPERTY_CALL_END_REASONS = "callEndReasons";
	@JsonProperty(JSON_PROPERTY_CALL_END_REASONS)
	private List<ECallEndReason> callEndReasons = null;

	public static final String JSON_PROPERTY_MIN_ACTIVE_DURATION = "minActiveDuration";
	@JsonProperty(JSON_PROPERTY_MIN_ACTIVE_DURATION)
	private Long minActiveDuration;

	public static final String JSON_PROPERTY_MAX_ACTIVE_DURATION = "maxActiveDuration";
	@JsonProperty(JSON_PROPERTY_MAX_ACTIVE_DURATION)
	private Long maxActiveDuration;

	public static final String JSON_PROPERTY_MIN_OVERALL_PARTICIPANTS = "minOverallParticipants";
	@JsonProperty(JSON_PROPERTY_MIN_OVERALL_PARTICIPANTS)
	private Long minOverallParticipants;

	public static final String JSON_PROPERTY_MAX_OVERALL_PARTICIPANTS = "maxOverallParticipants";
	@JsonProperty(JSON_PROPERTY_MAX_OVERALL_PARTICIPANTS)
	private Long maxOverallParticipants;

	public CallsCountAnalyticsKpiFilterData $type(TypeEnum $type) {
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

	public CallsCountAnalyticsKpiFilterData startTimestamp(Long startTimestamp) {
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

	public CallsCountAnalyticsKpiFilterData endTimestamp(Long endTimestamp) {
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

	public CallsCountAnalyticsKpiFilterData conversationTemplateIds(List<String> conversationTemplateIds) {
		this.conversationTemplateIds = conversationTemplateIds;
		return this;
	}

	public CallsCountAnalyticsKpiFilterData addConversationTemplateIdsItem(String conversationTemplateIdsItem) {
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

	public CallsCountAnalyticsKpiFilterData conversationLocales(List<String> conversationLocales) {
		this.conversationLocales = conversationLocales;
		return this;
	}

	public CallsCountAnalyticsKpiFilterData addConversationLocalesItem(String conversationLocalesItem) {
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

	public CallsCountAnalyticsKpiFilterData initialEngagementTypes(List<EInitialEngagementType> initialEngagementTypes) {
		this.initialEngagementTypes = initialEngagementTypes;
		return this;
	}

	public CallsCountAnalyticsKpiFilterData addInitialEngagementTypesItem(EInitialEngagementType initialEngagementTypesItem) {
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

	public CallsCountAnalyticsKpiFilterData recipientAgentPersonIds(List<String> recipientAgentPersonIds) {
		this.recipientAgentPersonIds = recipientAgentPersonIds;
		return this;
	}

	public CallsCountAnalyticsKpiFilterData addRecipientAgentPersonIdsItem(String recipientAgentPersonIdsItem) {
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

	public CallsCountAnalyticsKpiFilterData recipientTeamIds(List<String> recipientTeamIds) {
		this.recipientTeamIds = recipientTeamIds;
		return this;
	}

	public CallsCountAnalyticsKpiFilterData addRecipientTeamIdsItem(String recipientTeamIdsItem) {
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

	public CallsCountAnalyticsKpiFilterData recipientNamedAreaIds(List<String> recipientNamedAreaIds) {
		this.recipientNamedAreaIds = recipientNamedAreaIds;
		return this;
	}

	public CallsCountAnalyticsKpiFilterData addRecipientNamedAreaIdsItem(String recipientNamedAreaIdsItem) {
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

	public CallsCountAnalyticsKpiFilterData recipientAccountId(Boolean recipientAccountId) {
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

	public CallsCountAnalyticsKpiFilterData assignedAgentPersonIds(List<String> assignedAgentPersonIds) {
		this.assignedAgentPersonIds = assignedAgentPersonIds;
		return this;
	}

	public CallsCountAnalyticsKpiFilterData addAssignedAgentPersonIdsItem(String assignedAgentPersonIdsItem) {
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

	public CallsCountAnalyticsKpiFilterData assignedAgentTeamIds(List<String> assignedAgentTeamIds) {
		this.assignedAgentTeamIds = assignedAgentTeamIds;
		return this;
	}

	public CallsCountAnalyticsKpiFilterData addAssignedAgentTeamIdsItem(String assignedAgentTeamIdsItem) {
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

	public CallsCountAnalyticsKpiFilterData startingPersonIds(List<String> startingPersonIds) {
		this.startingPersonIds = startingPersonIds;
		return this;
	}

	public CallsCountAnalyticsKpiFilterData addStartingPersonIdsItem(String startingPersonIdsItem) {
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

	public CallsCountAnalyticsKpiFilterData startingPersonTeamIds(List<String> startingPersonTeamIds) {
		this.startingPersonTeamIds = startingPersonTeamIds;
		return this;
	}

	public CallsCountAnalyticsKpiFilterData addStartingPersonTeamIdsItem(String startingPersonTeamIdsItem) {
		if (this.startingPersonTeamIds == null) {
			this.startingPersonTeamIds = new ArrayList<>();
		}
		this.startingPersonTeamIds.add(startingPersonTeamIdsItem);
		return this;
	}

	/**
	 * A list of starting person team IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included.
	 * The specified IDs must exist in the Unblu database and be accessible to the user. Supports the &#x60;CURRENT_TEAM&#x60; variable. If null, the filter is not
	 * applied. An empty list is not allowed.
	 * 
	 * @return startingPersonTeamIds
	 **/
	@ApiModelProperty(value = "A list of starting person team IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the `CURRENT_TEAM` variable. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getStartingPersonTeamIds() {
		return startingPersonTeamIds;
	}

	public void setStartingPersonTeamIds(List<String> startingPersonTeamIds) {
		this.startingPersonTeamIds = startingPersonTeamIds;
	}

	public CallsCountAnalyticsKpiFilterData callTypes(List<ECallType> callTypes) {
		this.callTypes = callTypes;
		return this;
	}

	public CallsCountAnalyticsKpiFilterData addCallTypesItem(ECallType callTypesItem) {
		if (this.callTypes == null) {
			this.callTypes = new ArrayList<>();
		}
		this.callTypes.add(callTypesItem);
		return this;
	}

	/**
	 * A list of call types used to filter the analytics data included in the KPI calculation. Records matching any of the specified types are included. If null,
	 * the filter is not applied. An empty list is not allowed.
	 * 
	 * @return callTypes
	 **/
	@ApiModelProperty(value = "A list of call types used to filter the analytics data included in the KPI calculation. Records matching any of the specified types are included. If null, the filter is not applied. An empty list is not allowed.")
	public List<ECallType> getCallTypes() {
		return callTypes;
	}

	public void setCallTypes(List<ECallType> callTypes) {
		this.callTypes = callTypes;
	}

	public CallsCountAnalyticsKpiFilterData callEndReasons(List<ECallEndReason> callEndReasons) {
		this.callEndReasons = callEndReasons;
		return this;
	}

	public CallsCountAnalyticsKpiFilterData addCallEndReasonsItem(ECallEndReason callEndReasonsItem) {
		if (this.callEndReasons == null) {
			this.callEndReasons = new ArrayList<>();
		}
		this.callEndReasons.add(callEndReasonsItem);
		return this;
	}

	/**
	 * A list of call end reasons used to filter the analytics data included in the KPI calculation. Records matching any of the specified reasons are included. If
	 * null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return callEndReasons
	 **/
	@ApiModelProperty(value = "A list of call end reasons used to filter the analytics data included in the KPI calculation. Records matching any of the specified reasons are included. If null, the filter is not applied. An empty list is not allowed.")
	public List<ECallEndReason> getCallEndReasons() {
		return callEndReasons;
	}

	public void setCallEndReasons(List<ECallEndReason> callEndReasons) {
		this.callEndReasons = callEndReasons;
	}

	public CallsCountAnalyticsKpiFilterData minActiveDuration(Long minActiveDuration) {
		this.minActiveDuration = minActiveDuration;
		return this;
	}

	/**
	 * A minimum active duration. Records with at least the specified duration are included. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return minActiveDuration
	 **/
	@ApiModelProperty(value = "A minimum active duration. Records with at least the specified duration are included. If null, the filter is not applied. An empty list is not allowed.")
	public Long getMinActiveDuration() {
		return minActiveDuration;
	}

	public void setMinActiveDuration(Long minActiveDuration) {
		this.minActiveDuration = minActiveDuration;
	}

	public CallsCountAnalyticsKpiFilterData maxActiveDuration(Long maxActiveDuration) {
		this.maxActiveDuration = maxActiveDuration;
		return this;
	}

	/**
	 * A maximum active duration. Records with a duration up to the specified value are included. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return maxActiveDuration
	 **/
	@ApiModelProperty(value = "A maximum active duration. Records with a duration up to the specified value are included. If null, the filter is not applied. An empty list is not allowed.")
	public Long getMaxActiveDuration() {
		return maxActiveDuration;
	}

	public void setMaxActiveDuration(Long maxActiveDuration) {
		this.maxActiveDuration = maxActiveDuration;
	}

	public CallsCountAnalyticsKpiFilterData minOverallParticipants(Long minOverallParticipants) {
		this.minOverallParticipants = minOverallParticipants;
		return this;
	}

	/**
	 * A minimum number of overall participants. Records with at least the specified number of participants are included. If null, the filter is not applied.
	 * 
	 * @return minOverallParticipants
	 **/
	@ApiModelProperty(value = "A minimum number of overall participants. Records with at least the specified number of participants are included. If null, the filter is not applied.")
	public Long getMinOverallParticipants() {
		return minOverallParticipants;
	}

	public void setMinOverallParticipants(Long minOverallParticipants) {
		this.minOverallParticipants = minOverallParticipants;
	}

	public CallsCountAnalyticsKpiFilterData maxOverallParticipants(Long maxOverallParticipants) {
		this.maxOverallParticipants = maxOverallParticipants;
		return this;
	}

	/**
	 * A maximum number of overall participants. Records with up to the specified number of participants are included. If null, the filter is not applied.
	 * 
	 * @return maxOverallParticipants
	 **/
	@ApiModelProperty(value = "A maximum number of overall participants. Records with up to the specified number of participants are included. If null, the filter is not applied.")
	public Long getMaxOverallParticipants() {
		return maxOverallParticipants;
	}

	public void setMaxOverallParticipants(Long maxOverallParticipants) {
		this.maxOverallParticipants = maxOverallParticipants;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CallsCountAnalyticsKpiFilterData callsCountAnalyticsKpiFilterData = (CallsCountAnalyticsKpiFilterData) o;
		return Objects.equals(this.$type, callsCountAnalyticsKpiFilterData.$type) &&
				Objects.equals(this.startTimestamp, callsCountAnalyticsKpiFilterData.startTimestamp) &&
				Objects.equals(this.endTimestamp, callsCountAnalyticsKpiFilterData.endTimestamp) &&
				Objects.equals(this.conversationTemplateIds, callsCountAnalyticsKpiFilterData.conversationTemplateIds) &&
				Objects.equals(this.conversationLocales, callsCountAnalyticsKpiFilterData.conversationLocales) &&
				Objects.equals(this.initialEngagementTypes, callsCountAnalyticsKpiFilterData.initialEngagementTypes) &&
				Objects.equals(this.recipientAgentPersonIds, callsCountAnalyticsKpiFilterData.recipientAgentPersonIds) &&
				Objects.equals(this.recipientTeamIds, callsCountAnalyticsKpiFilterData.recipientTeamIds) &&
				Objects.equals(this.recipientNamedAreaIds, callsCountAnalyticsKpiFilterData.recipientNamedAreaIds) &&
				Objects.equals(this.recipientAccountId, callsCountAnalyticsKpiFilterData.recipientAccountId) &&
				Objects.equals(this.assignedAgentPersonIds, callsCountAnalyticsKpiFilterData.assignedAgentPersonIds) &&
				Objects.equals(this.assignedAgentTeamIds, callsCountAnalyticsKpiFilterData.assignedAgentTeamIds) &&
				Objects.equals(this.startingPersonIds, callsCountAnalyticsKpiFilterData.startingPersonIds) &&
				Objects.equals(this.startingPersonTeamIds, callsCountAnalyticsKpiFilterData.startingPersonTeamIds) &&
				Objects.equals(this.callTypes, callsCountAnalyticsKpiFilterData.callTypes) &&
				Objects.equals(this.callEndReasons, callsCountAnalyticsKpiFilterData.callEndReasons) &&
				Objects.equals(this.minActiveDuration, callsCountAnalyticsKpiFilterData.minActiveDuration) &&
				Objects.equals(this.maxActiveDuration, callsCountAnalyticsKpiFilterData.maxActiveDuration) &&
				Objects.equals(this.minOverallParticipants, callsCountAnalyticsKpiFilterData.minOverallParticipants) &&
				Objects.equals(this.maxOverallParticipants, callsCountAnalyticsKpiFilterData.maxOverallParticipants);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, startTimestamp, endTimestamp, conversationTemplateIds, conversationLocales, initialEngagementTypes, recipientAgentPersonIds, recipientTeamIds, recipientNamedAreaIds, recipientAccountId, assignedAgentPersonIds, assignedAgentTeamIds, startingPersonIds, startingPersonTeamIds, callTypes, callEndReasons, minActiveDuration, maxActiveDuration, minOverallParticipants, maxOverallParticipants);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CallsCountAnalyticsKpiFilterData {\n");
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
		sb.append("    callTypes: ").append(toIndentedString(callTypes)).append("\n");
		sb.append("    callEndReasons: ").append(toIndentedString(callEndReasons)).append("\n");
		sb.append("    minActiveDuration: ").append(toIndentedString(minActiveDuration)).append("\n");
		sb.append("    maxActiveDuration: ").append(toIndentedString(maxActiveDuration)).append("\n");
		sb.append("    minOverallParticipants: ").append(toIndentedString(minOverallParticipants)).append("\n");
		sb.append("    maxOverallParticipants: ").append(toIndentedString(maxOverallParticipants)).append("\n");
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
