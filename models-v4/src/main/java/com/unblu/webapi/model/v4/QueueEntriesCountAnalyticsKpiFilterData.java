
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
 * Data model object representing filters for the KPI calculation of queue entries &lt;p&gt; Filter logic: &lt;ul&gt; &lt;li&gt;startTimestamp AND&lt;/li&gt;
 * &lt;li&gt;endTimestamp AND&lt;/li&gt; &lt;li&gt;conversationTemplateIds AND&lt;/li&gt; &lt;li&gt;conversationLocales AND&lt;/li&gt;
 * &lt;li&gt;initialEngagementTypes AND&lt;/li&gt; &lt;li&gt;(recipientAgentIds OR recipientTeamIds OR recipientNamedAreaIds OR recipientAccountId)
 * AND&lt;/li&gt; &lt;li&gt;waitingTimeTypes AND&lt;/li&gt; &lt;li&gt;(invitationAgentIds OR invitationTeamIds OR invitationNamedAreaIds OR
 * invitationAccountId)&lt;/li&gt; &lt;/ul&gt;
 */
@ApiModel(description = "Data model object representing filters for the KPI calculation of queue entries <p> Filter logic: <ul> <li>startTimestamp AND</li> <li>endTimestamp AND</li> <li>conversationTemplateIds AND</li> <li>conversationLocales AND</li> <li>initialEngagementTypes AND</li> <li>(recipientAgentIds OR recipientTeamIds OR recipientNamedAreaIds OR recipientAccountId) AND</li> <li>waitingTimeTypes AND</li> <li>(invitationAgentIds OR invitationTeamIds OR invitationNamedAreaIds OR invitationAccountId)</li> </ul>")

@JsonPropertyOrder({
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_$_TYPE,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_START_TIMESTAMP,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_END_TIMESTAMP,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_CONVERSATION_TEMPLATE_IDS,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_CONVERSATION_LOCALES,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPES,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_AGENT_PERSON_IDS,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_TEAM_IDS,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_NAMED_AREA_IDS,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_ACCOUNT_ID,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_LABEL_FILTERS,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_WAITING_TIME_TYPES,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_INVITATION_AGENT_PERSON_IDS,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_INVITATION_TEAM_IDS,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_INVITATION_NAMED_AREA_IDS,
	QueueEntriesCountAnalyticsKpiFilterData.JSON_PROPERTY_INVITATION_ACCOUNT_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class QueueEntriesCountAnalyticsKpiFilterData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		QUEUEENTRIESCOUNTANALYTICSKPIFILTERDATA("QueueEntriesCountAnalyticsKpiFilterData");

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
			return TypeEnum.QUEUEENTRIESCOUNTANALYTICSKPIFILTERDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.QUEUEENTRIESCOUNTANALYTICSKPIFILTERDATA;

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

	public static final String JSON_PROPERTY_LABEL_FILTERS = "labelFilters";
	@JsonProperty(JSON_PROPERTY_LABEL_FILTERS)
	private List<LabelsAnalyticsKpiFilter> labelFilters = null;

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

	public QueueEntriesCountAnalyticsKpiFilterData $type(TypeEnum $type) {
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

	public QueueEntriesCountAnalyticsKpiFilterData startTimestamp(Long startTimestamp) {
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

	public QueueEntriesCountAnalyticsKpiFilterData endTimestamp(Long endTimestamp) {
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

	public QueueEntriesCountAnalyticsKpiFilterData conversationTemplateIds(List<String> conversationTemplateIds) {
		this.conversationTemplateIds = conversationTemplateIds;
		return this;
	}

	public QueueEntriesCountAnalyticsKpiFilterData addConversationTemplateIdsItem(String conversationTemplateIdsItem) {
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

	public QueueEntriesCountAnalyticsKpiFilterData conversationLocales(List<String> conversationLocales) {
		this.conversationLocales = conversationLocales;
		return this;
	}

	public QueueEntriesCountAnalyticsKpiFilterData addConversationLocalesItem(String conversationLocalesItem) {
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

	public QueueEntriesCountAnalyticsKpiFilterData initialEngagementTypes(List<EInitialEngagementType> initialEngagementTypes) {
		this.initialEngagementTypes = initialEngagementTypes;
		return this;
	}

	public QueueEntriesCountAnalyticsKpiFilterData addInitialEngagementTypesItem(EInitialEngagementType initialEngagementTypesItem) {
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

	public QueueEntriesCountAnalyticsKpiFilterData recipientAgentPersonIds(List<String> recipientAgentPersonIds) {
		this.recipientAgentPersonIds = recipientAgentPersonIds;
		return this;
	}

	public QueueEntriesCountAnalyticsKpiFilterData addRecipientAgentPersonIdsItem(String recipientAgentPersonIdsItem) {
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

	public QueueEntriesCountAnalyticsKpiFilterData recipientTeamIds(List<String> recipientTeamIds) {
		this.recipientTeamIds = recipientTeamIds;
		return this;
	}

	public QueueEntriesCountAnalyticsKpiFilterData addRecipientTeamIdsItem(String recipientTeamIdsItem) {
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

	public QueueEntriesCountAnalyticsKpiFilterData recipientNamedAreaIds(List<String> recipientNamedAreaIds) {
		this.recipientNamedAreaIds = recipientNamedAreaIds;
		return this;
	}

	public QueueEntriesCountAnalyticsKpiFilterData addRecipientNamedAreaIdsItem(String recipientNamedAreaIdsItem) {
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

	public QueueEntriesCountAnalyticsKpiFilterData recipientAccountId(Boolean recipientAccountId) {
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

	public QueueEntriesCountAnalyticsKpiFilterData labelFilters(List<LabelsAnalyticsKpiFilter> labelFilters) {
		this.labelFilters = labelFilters;
		return this;
	}

	public QueueEntriesCountAnalyticsKpiFilterData addLabelFiltersItem(LabelsAnalyticsKpiFilter labelFiltersItem) {
		if (this.labelFilters == null) {
			this.labelFilters = new ArrayList<>();
		}
		this.labelFilters.add(labelFiltersItem);
		return this;
	}

	/**
	 * A list of label conditions used to filter the analytics data included in the KPI calculation, each targeting the conversation&#39;s or one of its
	 * persons&#39; labels. Records are included only if every condition holds. At most one condition per target and operator combination is allowed, and each
	 * condition&#39;s target must be supported by the KPI. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return labelFilters
	 **/
	@ApiModelProperty(value = "A list of label conditions used to filter the analytics data included in the KPI calculation, each targeting the conversation's or one of its persons' labels. Records are included only if every condition holds. At most one condition per target and operator combination is allowed, and each condition's target must be supported by the KPI. If null, the filter is not applied. An empty list is not allowed.")
	public List<LabelsAnalyticsKpiFilter> getLabelFilters() {
		return labelFilters;
	}

	public void setLabelFilters(List<LabelsAnalyticsKpiFilter> labelFilters) {
		this.labelFilters = labelFilters;
	}

	public QueueEntriesCountAnalyticsKpiFilterData waitingTimeTypes(List<EWaitingTimeType> waitingTimeTypes) {
		this.waitingTimeTypes = waitingTimeTypes;
		return this;
	}

	public QueueEntriesCountAnalyticsKpiFilterData addWaitingTimeTypesItem(EWaitingTimeType waitingTimeTypesItem) {
		if (this.waitingTimeTypes == null) {
			this.waitingTimeTypes = new ArrayList<>();
		}
		this.waitingTimeTypes.add(waitingTimeTypesItem);
		return this;
	}

	/**
	 * A list of waiting time types used to filter the analytics data included in the KPI calculation. The type states why the conversation entered the queue.
	 * Records matching any of the specified types are included. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return waitingTimeTypes
	 **/
	@ApiModelProperty(value = "A list of waiting time types used to filter the analytics data included in the KPI calculation. The type states why the conversation entered the queue. Records matching any of the specified types are included. If null, the filter is not applied. An empty list is not allowed.")
	public List<EWaitingTimeType> getWaitingTimeTypes() {
		return waitingTimeTypes;
	}

	public void setWaitingTimeTypes(List<EWaitingTimeType> waitingTimeTypes) {
		this.waitingTimeTypes = waitingTimeTypes;
	}

	public QueueEntriesCountAnalyticsKpiFilterData invitationAgentPersonIds(List<String> invitationAgentPersonIds) {
		this.invitationAgentPersonIds = invitationAgentPersonIds;
		return this;
	}

	public QueueEntriesCountAnalyticsKpiFilterData addInvitationAgentPersonIdsItem(String invitationAgentPersonIdsItem) {
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

	public QueueEntriesCountAnalyticsKpiFilterData invitationTeamIds(List<String> invitationTeamIds) {
		this.invitationTeamIds = invitationTeamIds;
		return this;
	}

	public QueueEntriesCountAnalyticsKpiFilterData addInvitationTeamIdsItem(String invitationTeamIdsItem) {
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

	public QueueEntriesCountAnalyticsKpiFilterData invitationNamedAreaIds(List<String> invitationNamedAreaIds) {
		this.invitationNamedAreaIds = invitationNamedAreaIds;
		return this;
	}

	public QueueEntriesCountAnalyticsKpiFilterData addInvitationNamedAreaIdsItem(String invitationNamedAreaIdsItem) {
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

	public QueueEntriesCountAnalyticsKpiFilterData invitationAccountId(Boolean invitationAccountId) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		QueueEntriesCountAnalyticsKpiFilterData queueEntriesCountAnalyticsKpiFilterData = (QueueEntriesCountAnalyticsKpiFilterData) o;
		return Objects.equals(this.$type, queueEntriesCountAnalyticsKpiFilterData.$type) &&
				Objects.equals(this.startTimestamp, queueEntriesCountAnalyticsKpiFilterData.startTimestamp) &&
				Objects.equals(this.endTimestamp, queueEntriesCountAnalyticsKpiFilterData.endTimestamp) &&
				Objects.equals(this.conversationTemplateIds, queueEntriesCountAnalyticsKpiFilterData.conversationTemplateIds) &&
				Objects.equals(this.conversationLocales, queueEntriesCountAnalyticsKpiFilterData.conversationLocales) &&
				Objects.equals(this.initialEngagementTypes, queueEntriesCountAnalyticsKpiFilterData.initialEngagementTypes) &&
				Objects.equals(this.recipientAgentPersonIds, queueEntriesCountAnalyticsKpiFilterData.recipientAgentPersonIds) &&
				Objects.equals(this.recipientTeamIds, queueEntriesCountAnalyticsKpiFilterData.recipientTeamIds) &&
				Objects.equals(this.recipientNamedAreaIds, queueEntriesCountAnalyticsKpiFilterData.recipientNamedAreaIds) &&
				Objects.equals(this.recipientAccountId, queueEntriesCountAnalyticsKpiFilterData.recipientAccountId) &&
				Objects.equals(this.labelFilters, queueEntriesCountAnalyticsKpiFilterData.labelFilters) &&
				Objects.equals(this.waitingTimeTypes, queueEntriesCountAnalyticsKpiFilterData.waitingTimeTypes) &&
				Objects.equals(this.invitationAgentPersonIds, queueEntriesCountAnalyticsKpiFilterData.invitationAgentPersonIds) &&
				Objects.equals(this.invitationTeamIds, queueEntriesCountAnalyticsKpiFilterData.invitationTeamIds) &&
				Objects.equals(this.invitationNamedAreaIds, queueEntriesCountAnalyticsKpiFilterData.invitationNamedAreaIds) &&
				Objects.equals(this.invitationAccountId, queueEntriesCountAnalyticsKpiFilterData.invitationAccountId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, startTimestamp, endTimestamp, conversationTemplateIds, conversationLocales, initialEngagementTypes, recipientAgentPersonIds, recipientTeamIds, recipientNamedAreaIds, recipientAccountId, labelFilters, waitingTimeTypes, invitationAgentPersonIds, invitationTeamIds, invitationNamedAreaIds, invitationAccountId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class QueueEntriesCountAnalyticsKpiFilterData {\n");
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
		sb.append("    labelFilters: ").append(toIndentedString(labelFilters)).append("\n");
		sb.append("    waitingTimeTypes: ").append(toIndentedString(waitingTimeTypes)).append("\n");
		sb.append("    invitationAgentPersonIds: ").append(toIndentedString(invitationAgentPersonIds)).append("\n");
		sb.append("    invitationTeamIds: ").append(toIndentedString(invitationTeamIds)).append("\n");
		sb.append("    invitationNamedAreaIds: ").append(toIndentedString(invitationNamedAreaIds)).append("\n");
		sb.append("    invitationAccountId: ").append(toIndentedString(invitationAccountId)).append("\n");
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
