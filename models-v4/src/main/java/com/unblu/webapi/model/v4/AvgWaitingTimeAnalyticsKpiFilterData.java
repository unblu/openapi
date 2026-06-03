
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
 * Data model object representing filters for the KPI calculation of average waiting time &lt;p&gt; Filter logic: &lt;ul&gt; &lt;li&gt;startTimestamp
 * AND&lt;/li&gt; &lt;li&gt;endTimestamp AND&lt;/li&gt; &lt;li&gt;conversationTemplateIds AND&lt;/li&gt; &lt;li&gt;conversationLocales AND&lt;/li&gt;
 * &lt;li&gt;initialEngagementTypes AND&lt;/li&gt; &lt;li&gt;(recipientAgentIds OR recipientTeamIds OR recipientNamedAreaIds OR recipientAccountId)
 * AND&lt;/li&gt; &lt;li&gt;waitingTimeOutcomes AND&lt;/li&gt; &lt;li&gt;waitingTimeTypes AND&lt;/li&gt; &lt;li&gt;(invitationAgentIds OR invitationTeamIds OR
 * invitationNamedAreaIds OR invitationAccountId) AND&lt;/li&gt; &lt;li&gt;invitationAcceptingAgentPersonIds AND&lt;/li&gt;
 * &lt;li&gt;invitationAcceptingAgentTeamIds&lt;/li&gt; &lt;/ul&gt;
 */
@ApiModel(description = "Data model object representing filters for the KPI calculation of average waiting time <p> Filter logic: <ul> <li>startTimestamp AND</li> <li>endTimestamp AND</li> <li>conversationTemplateIds AND</li> <li>conversationLocales AND</li> <li>initialEngagementTypes AND</li> <li>(recipientAgentIds OR recipientTeamIds OR recipientNamedAreaIds OR recipientAccountId) AND</li> <li>waitingTimeOutcomes AND</li> <li>waitingTimeTypes AND</li> <li>(invitationAgentIds OR invitationTeamIds OR invitationNamedAreaIds OR invitationAccountId) AND</li> <li>invitationAcceptingAgentPersonIds AND</li> <li>invitationAcceptingAgentTeamIds</li> </ul>")

@JsonPropertyOrder({
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_$_TYPE,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_START_TIMESTAMP,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_END_TIMESTAMP,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_CONVERSATION_TEMPLATE_IDS,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_CONVERSATION_LOCALES,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPES,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_AGENT_PERSON_IDS,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_TEAM_IDS,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_NAMED_AREA_IDS,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_ACCOUNT_ID,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_WAITING_TIME_OUTCOMES,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_WAITING_TIME_TYPES,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_INVITATION_AGENT_PERSON_IDS,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_INVITATION_TEAM_IDS,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_INVITATION_NAMED_AREA_IDS,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_INVITATION_ACCOUNT_ID,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_INVITATION_ACCEPTING_AGENT_PERSON_IDS,
	AvgWaitingTimeAnalyticsKpiFilterData.JSON_PROPERTY_INVITATION_ACCEPTING_AGENT_TEAM_IDS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AvgWaitingTimeAnalyticsKpiFilterData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AVGWAITINGTIMEANALYTICSKPIFILTERDATA("AvgWaitingTimeAnalyticsKpiFilterData");

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
			return TypeEnum.AVGWAITINGTIMEANALYTICSKPIFILTERDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AVGWAITINGTIMEANALYTICSKPIFILTERDATA;

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

	public static final String JSON_PROPERTY_WAITING_TIME_OUTCOMES = "waitingTimeOutcomes";
	@JsonProperty(JSON_PROPERTY_WAITING_TIME_OUTCOMES)
	private List<EWaitingTimeOutcome> waitingTimeOutcomes = null;

	public static final String JSON_PROPERTY_WAITING_TIME_TYPES = "waitingTimeTypes";
	@JsonProperty(JSON_PROPERTY_WAITING_TIME_TYPES)
	private List<EWaitingTimeType> waitingTimeTypes = null;

	public static final String JSON_PROPERTY_INVITATION_AGENT_PERSON_IDS = "invitationAgentPersonIds";
	@JsonProperty(JSON_PROPERTY_INVITATION_AGENT_PERSON_IDS)
	private List<String> invitationAgentPersonIds = null;

	public static final String JSON_PROPERTY_INVITATION_TEAM_IDS = "invitationTeamIds";
	@JsonProperty(JSON_PROPERTY_INVITATION_TEAM_IDS)
	private List<String> invitationTeamIds = null;

	public static final String JSON_PROPERTY_INVITATION_NAMED_AREA_IDS = "invitationNamedAreaIds";
	@JsonProperty(JSON_PROPERTY_INVITATION_NAMED_AREA_IDS)
	private List<String> invitationNamedAreaIds = null;

	public static final String JSON_PROPERTY_INVITATION_ACCOUNT_ID = "invitationAccountId";
	@JsonProperty(JSON_PROPERTY_INVITATION_ACCOUNT_ID)
	private Boolean invitationAccountId;

	public static final String JSON_PROPERTY_INVITATION_ACCEPTING_AGENT_PERSON_IDS = "invitationAcceptingAgentPersonIds";
	@JsonProperty(JSON_PROPERTY_INVITATION_ACCEPTING_AGENT_PERSON_IDS)
	private List<String> invitationAcceptingAgentPersonIds = null;

	public static final String JSON_PROPERTY_INVITATION_ACCEPTING_AGENT_TEAM_IDS = "invitationAcceptingAgentTeamIds";
	@JsonProperty(JSON_PROPERTY_INVITATION_ACCEPTING_AGENT_TEAM_IDS)
	private List<String> invitationAcceptingAgentTeamIds = null;

	public AvgWaitingTimeAnalyticsKpiFilterData $type(TypeEnum $type) {
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

	public AvgWaitingTimeAnalyticsKpiFilterData startTimestamp(Long startTimestamp) {
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

	public AvgWaitingTimeAnalyticsKpiFilterData endTimestamp(Long endTimestamp) {
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

	public AvgWaitingTimeAnalyticsKpiFilterData conversationTemplateIds(List<String> conversationTemplateIds) {
		this.conversationTemplateIds = conversationTemplateIds;
		return this;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData addConversationTemplateIdsItem(String conversationTemplateIdsItem) {
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

	public AvgWaitingTimeAnalyticsKpiFilterData conversationLocales(List<String> conversationLocales) {
		this.conversationLocales = conversationLocales;
		return this;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData addConversationLocalesItem(String conversationLocalesItem) {
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

	public AvgWaitingTimeAnalyticsKpiFilterData initialEngagementTypes(List<EInitialEngagementType> initialEngagementTypes) {
		this.initialEngagementTypes = initialEngagementTypes;
		return this;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData addInitialEngagementTypesItem(EInitialEngagementType initialEngagementTypesItem) {
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

	public AvgWaitingTimeAnalyticsKpiFilterData recipientAgentPersonIds(List<String> recipientAgentPersonIds) {
		this.recipientAgentPersonIds = recipientAgentPersonIds;
		return this;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData addRecipientAgentPersonIdsItem(String recipientAgentPersonIdsItem) {
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

	public AvgWaitingTimeAnalyticsKpiFilterData recipientTeamIds(List<String> recipientTeamIds) {
		this.recipientTeamIds = recipientTeamIds;
		return this;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData addRecipientTeamIdsItem(String recipientTeamIdsItem) {
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

	public AvgWaitingTimeAnalyticsKpiFilterData recipientNamedAreaIds(List<String> recipientNamedAreaIds) {
		this.recipientNamedAreaIds = recipientNamedAreaIds;
		return this;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData addRecipientNamedAreaIdsItem(String recipientNamedAreaIdsItem) {
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

	public AvgWaitingTimeAnalyticsKpiFilterData recipientAccountId(Boolean recipientAccountId) {
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

	public AvgWaitingTimeAnalyticsKpiFilterData waitingTimeOutcomes(List<EWaitingTimeOutcome> waitingTimeOutcomes) {
		this.waitingTimeOutcomes = waitingTimeOutcomes;
		return this;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData addWaitingTimeOutcomesItem(EWaitingTimeOutcome waitingTimeOutcomesItem) {
		if (this.waitingTimeOutcomes == null) {
			this.waitingTimeOutcomes = new ArrayList<>();
		}
		this.waitingTimeOutcomes.add(waitingTimeOutcomesItem);
		return this;
	}

	/**
	 * A list of waiting time outcomes used to filter the analytics data included in the KPI calculation. Records matching any of the specified outcomes are
	 * included. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return waitingTimeOutcomes
	 **/
	@ApiModelProperty(value = "A list of waiting time outcomes used to filter the analytics data included in the KPI calculation. Records matching any of the specified outcomes are included. If null, the filter is not applied. An empty list is not allowed.")
	public List<EWaitingTimeOutcome> getWaitingTimeOutcomes() {
		return waitingTimeOutcomes;
	}

	public void setWaitingTimeOutcomes(List<EWaitingTimeOutcome> waitingTimeOutcomes) {
		this.waitingTimeOutcomes = waitingTimeOutcomes;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData waitingTimeTypes(List<EWaitingTimeType> waitingTimeTypes) {
		this.waitingTimeTypes = waitingTimeTypes;
		return this;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData addWaitingTimeTypesItem(EWaitingTimeType waitingTimeTypesItem) {
		if (this.waitingTimeTypes == null) {
			this.waitingTimeTypes = new ArrayList<>();
		}
		this.waitingTimeTypes.add(waitingTimeTypesItem);
		return this;
	}

	/**
	 * A list of waiting time types used to filter the analytics data included in the KPI calculation. Records matching any of the specified types are included. If
	 * null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return waitingTimeTypes
	 **/
	@ApiModelProperty(value = "A list of waiting time types used to filter the analytics data included in the KPI calculation. Records matching any of the specified types are included. If null, the filter is not applied. An empty list is not allowed.")
	public List<EWaitingTimeType> getWaitingTimeTypes() {
		return waitingTimeTypes;
	}

	public void setWaitingTimeTypes(List<EWaitingTimeType> waitingTimeTypes) {
		this.waitingTimeTypes = waitingTimeTypes;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData invitationAgentPersonIds(List<String> invitationAgentPersonIds) {
		this.invitationAgentPersonIds = invitationAgentPersonIds;
		return this;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData addInvitationAgentPersonIdsItem(String invitationAgentPersonIdsItem) {
		if (this.invitationAgentPersonIds == null) {
			this.invitationAgentPersonIds = new ArrayList<>();
		}
		this.invitationAgentPersonIds.add(invitationAgentPersonIdsItem);
		return this;
	}

	/**
	 * A list of invitation agent person IDs used to filter the analytics data included in the KPI calculation. Records are included if their invitation target ID
	 * matches any of the specified agent person IDs. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the
	 * &#x60;CURRENT_USER&#x60; variable. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return invitationAgentPersonIds
	 **/
	@ApiModelProperty(value = "A list of invitation agent person IDs used to filter the analytics data included in the KPI calculation. Records are included if their invitation target ID matches any of the specified agent person IDs. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the `CURRENT_USER` variable. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getInvitationAgentPersonIds() {
		return invitationAgentPersonIds;
	}

	public void setInvitationAgentPersonIds(List<String> invitationAgentPersonIds) {
		this.invitationAgentPersonIds = invitationAgentPersonIds;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData invitationTeamIds(List<String> invitationTeamIds) {
		this.invitationTeamIds = invitationTeamIds;
		return this;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData addInvitationTeamIdsItem(String invitationTeamIdsItem) {
		if (this.invitationTeamIds == null) {
			this.invitationTeamIds = new ArrayList<>();
		}
		this.invitationTeamIds.add(invitationTeamIdsItem);
		return this;
	}

	/**
	 * A list of invitation team IDs used to filter the analytics data included in the KPI calculation. Records are included if their invitation target ID matches
	 * any of the specified team IDs. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the &#x60;CURRENT_TEAM&#x60;
	 * variable. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return invitationTeamIds
	 **/
	@ApiModelProperty(value = "A list of invitation team IDs used to filter the analytics data included in the KPI calculation. Records are included if their invitation target ID matches any of the specified team IDs. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the `CURRENT_TEAM` variable. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getInvitationTeamIds() {
		return invitationTeamIds;
	}

	public void setInvitationTeamIds(List<String> invitationTeamIds) {
		this.invitationTeamIds = invitationTeamIds;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData invitationNamedAreaIds(List<String> invitationNamedAreaIds) {
		this.invitationNamedAreaIds = invitationNamedAreaIds;
		return this;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData addInvitationNamedAreaIdsItem(String invitationNamedAreaIdsItem) {
		if (this.invitationNamedAreaIds == null) {
			this.invitationNamedAreaIds = new ArrayList<>();
		}
		this.invitationNamedAreaIds.add(invitationNamedAreaIdsItem);
		return this;
	}

	/**
	 * A list of invitation named area IDs used to filter the analytics data included in the KPI calculation. Records are included if their invitation target ID
	 * matches any of the specified named area IDs. The specified IDs must exist in the Unblu database and be accessible to the user. If null, the filter is not
	 * applied. An empty list is not allowed.
	 * 
	 * @return invitationNamedAreaIds
	 **/
	@ApiModelProperty(value = "A list of invitation named area IDs used to filter the analytics data included in the KPI calculation. Records are included if their invitation target ID matches any of the specified named area IDs. The specified IDs must exist in the Unblu database and be accessible to the user. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getInvitationNamedAreaIds() {
		return invitationNamedAreaIds;
	}

	public void setInvitationNamedAreaIds(List<String> invitationNamedAreaIds) {
		this.invitationNamedAreaIds = invitationNamedAreaIds;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData invitationAccountId(Boolean invitationAccountId) {
		this.invitationAccountId = invitationAccountId;
		return this;
	}

	/**
	 * If true, includes records where the invitation target ID matches the current user&#39;s account ID. If null, the filter is not applied.
	 * 
	 * @return invitationAccountId
	 **/
	@ApiModelProperty(value = "If true, includes records where the invitation target ID matches the current user's account ID. If null, the filter is not applied.")
	public Boolean isInvitationAccountId() {
		return invitationAccountId;
	}

	public void setInvitationAccountId(Boolean invitationAccountId) {
		this.invitationAccountId = invitationAccountId;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData invitationAcceptingAgentPersonIds(List<String> invitationAcceptingAgentPersonIds) {
		this.invitationAcceptingAgentPersonIds = invitationAcceptingAgentPersonIds;
		return this;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData addInvitationAcceptingAgentPersonIdsItem(String invitationAcceptingAgentPersonIdsItem) {
		if (this.invitationAcceptingAgentPersonIds == null) {
			this.invitationAcceptingAgentPersonIds = new ArrayList<>();
		}
		this.invitationAcceptingAgentPersonIds.add(invitationAcceptingAgentPersonIdsItem);
		return this;
	}

	/**
	 * A list of person IDs of agents who accepted the conversation invitation. Records matching any of the specified IDs are included. Supports the
	 * &#x60;CURRENT_USER&#x60; variable. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return invitationAcceptingAgentPersonIds
	 **/
	@ApiModelProperty(value = "A list of person IDs of agents who accepted the conversation invitation. Records matching any of the specified IDs are included. Supports the `CURRENT_USER` variable. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getInvitationAcceptingAgentPersonIds() {
		return invitationAcceptingAgentPersonIds;
	}

	public void setInvitationAcceptingAgentPersonIds(List<String> invitationAcceptingAgentPersonIds) {
		this.invitationAcceptingAgentPersonIds = invitationAcceptingAgentPersonIds;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData invitationAcceptingAgentTeamIds(List<String> invitationAcceptingAgentTeamIds) {
		this.invitationAcceptingAgentTeamIds = invitationAcceptingAgentTeamIds;
		return this;
	}

	public AvgWaitingTimeAnalyticsKpiFilterData addInvitationAcceptingAgentTeamIdsItem(String invitationAcceptingAgentTeamIdsItem) {
		if (this.invitationAcceptingAgentTeamIds == null) {
			this.invitationAcceptingAgentTeamIds = new ArrayList<>();
		}
		this.invitationAcceptingAgentTeamIds.add(invitationAcceptingAgentTeamIdsItem);
		return this;
	}

	/**
	 * A list of team IDs of agents who accepted the conversation invitation. Records matching any of the specified IDs are included. Supports the
	 * &#x60;CURRENT_TEAM&#x60; variable. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return invitationAcceptingAgentTeamIds
	 **/
	@ApiModelProperty(value = "A list of team IDs of agents who accepted the conversation invitation. Records matching any of the specified IDs are included. Supports the `CURRENT_TEAM` variable. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getInvitationAcceptingAgentTeamIds() {
		return invitationAcceptingAgentTeamIds;
	}

	public void setInvitationAcceptingAgentTeamIds(List<String> invitationAcceptingAgentTeamIds) {
		this.invitationAcceptingAgentTeamIds = invitationAcceptingAgentTeamIds;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AvgWaitingTimeAnalyticsKpiFilterData avgWaitingTimeAnalyticsKpiFilterData = (AvgWaitingTimeAnalyticsKpiFilterData) o;
		return Objects.equals(this.$type, avgWaitingTimeAnalyticsKpiFilterData.$type) &&
				Objects.equals(this.startTimestamp, avgWaitingTimeAnalyticsKpiFilterData.startTimestamp) &&
				Objects.equals(this.endTimestamp, avgWaitingTimeAnalyticsKpiFilterData.endTimestamp) &&
				Objects.equals(this.conversationTemplateIds, avgWaitingTimeAnalyticsKpiFilterData.conversationTemplateIds) &&
				Objects.equals(this.conversationLocales, avgWaitingTimeAnalyticsKpiFilterData.conversationLocales) &&
				Objects.equals(this.initialEngagementTypes, avgWaitingTimeAnalyticsKpiFilterData.initialEngagementTypes) &&
				Objects.equals(this.recipientAgentPersonIds, avgWaitingTimeAnalyticsKpiFilterData.recipientAgentPersonIds) &&
				Objects.equals(this.recipientTeamIds, avgWaitingTimeAnalyticsKpiFilterData.recipientTeamIds) &&
				Objects.equals(this.recipientNamedAreaIds, avgWaitingTimeAnalyticsKpiFilterData.recipientNamedAreaIds) &&
				Objects.equals(this.recipientAccountId, avgWaitingTimeAnalyticsKpiFilterData.recipientAccountId) &&
				Objects.equals(this.waitingTimeOutcomes, avgWaitingTimeAnalyticsKpiFilterData.waitingTimeOutcomes) &&
				Objects.equals(this.waitingTimeTypes, avgWaitingTimeAnalyticsKpiFilterData.waitingTimeTypes) &&
				Objects.equals(this.invitationAgentPersonIds, avgWaitingTimeAnalyticsKpiFilterData.invitationAgentPersonIds) &&
				Objects.equals(this.invitationTeamIds, avgWaitingTimeAnalyticsKpiFilterData.invitationTeamIds) &&
				Objects.equals(this.invitationNamedAreaIds, avgWaitingTimeAnalyticsKpiFilterData.invitationNamedAreaIds) &&
				Objects.equals(this.invitationAccountId, avgWaitingTimeAnalyticsKpiFilterData.invitationAccountId) &&
				Objects.equals(this.invitationAcceptingAgentPersonIds, avgWaitingTimeAnalyticsKpiFilterData.invitationAcceptingAgentPersonIds) &&
				Objects.equals(this.invitationAcceptingAgentTeamIds, avgWaitingTimeAnalyticsKpiFilterData.invitationAcceptingAgentTeamIds);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, startTimestamp, endTimestamp, conversationTemplateIds, conversationLocales, initialEngagementTypes, recipientAgentPersonIds, recipientTeamIds, recipientNamedAreaIds, recipientAccountId, waitingTimeOutcomes, waitingTimeTypes, invitationAgentPersonIds, invitationTeamIds, invitationNamedAreaIds, invitationAccountId, invitationAcceptingAgentPersonIds, invitationAcceptingAgentTeamIds);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AvgWaitingTimeAnalyticsKpiFilterData {\n");
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
		sb.append("    waitingTimeOutcomes: ").append(toIndentedString(waitingTimeOutcomes)).append("\n");
		sb.append("    waitingTimeTypes: ").append(toIndentedString(waitingTimeTypes)).append("\n");
		sb.append("    invitationAgentPersonIds: ").append(toIndentedString(invitationAgentPersonIds)).append("\n");
		sb.append("    invitationTeamIds: ").append(toIndentedString(invitationTeamIds)).append("\n");
		sb.append("    invitationNamedAreaIds: ").append(toIndentedString(invitationNamedAreaIds)).append("\n");
		sb.append("    invitationAccountId: ").append(toIndentedString(invitationAccountId)).append("\n");
		sb.append("    invitationAcceptingAgentPersonIds: ").append(toIndentedString(invitationAcceptingAgentPersonIds)).append("\n");
		sb.append("    invitationAcceptingAgentTeamIds: ").append(toIndentedString(invitationAcceptingAgentTeamIds)).append("\n");
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
