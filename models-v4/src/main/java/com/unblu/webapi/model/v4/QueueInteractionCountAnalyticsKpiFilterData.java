
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
 * Data model object representing filters for the KPI calculation of queue interaction. &lt;p&gt; Filter logic: &lt;ul&gt; &lt;li&gt;startTimestamp
 * AND&lt;/li&gt; &lt;li&gt;endTimestamp AND&lt;/li&gt; &lt;li&gt;conversationTemplateIds AND&lt;/li&gt; &lt;li&gt;conversationLocales AND&lt;/li&gt;
 * &lt;li&gt;initialEngagementTypes AND&lt;/li&gt; &lt;li&gt;(recipientAgentIds OR recipientTeamIds OR recipientNamedAreaIds OR recipientAccountId)
 * AND&lt;/li&gt; &lt;li&gt;responseTypeResults AND&lt;/li&gt; &lt;li&gt;assignedAgentPersonIds AND&lt;/li&gt; &lt;li&gt;assignedAgentTeamIds AND&lt;/li&gt;
 * &lt;li&gt;minResponseTimeDuration AND&lt;/li&gt; &lt;li&gt;maxResponseTimeDuration&lt;/li&gt; &lt;/ul&gt;
 */
@ApiModel(description = "Data model object representing filters for the KPI calculation of queue interaction. <p> Filter logic: <ul> <li>startTimestamp AND</li> <li>endTimestamp AND</li> <li>conversationTemplateIds AND</li> <li>conversationLocales AND</li> <li>initialEngagementTypes AND</li> <li>(recipientAgentIds OR recipientTeamIds OR recipientNamedAreaIds OR recipientAccountId) AND</li> <li>responseTypeResults AND</li> <li>assignedAgentPersonIds AND</li> <li>assignedAgentTeamIds AND</li> <li>minResponseTimeDuration AND</li> <li>maxResponseTimeDuration</li> </ul>")

@JsonPropertyOrder({
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_$_TYPE,
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_START_TIMESTAMP,
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_END_TIMESTAMP,
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_CONVERSATION_TEMPLATE_IDS,
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_CONVERSATION_LOCALES,
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPES,
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_AGENT_PERSON_IDS,
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_TEAM_IDS,
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_NAMED_AREA_IDS,
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_ACCOUNT_ID,
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_QUEUE_INTERACTION_TYPES,
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_ASSIGNED_AGENT_PERSON_IDS,
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_ASSIGNED_AGENT_TEAM_IDS,
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_MIN_RESERVATION_TIME_DURATION,
	QueueInteractionCountAnalyticsKpiFilterData.JSON_PROPERTY_MAX_RESERVATION_TIME_DURATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class QueueInteractionCountAnalyticsKpiFilterData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		QUEUEINTERACTIONCOUNTANALYTICSKPIFILTERDATA("QueueInteractionCountAnalyticsKpiFilterData");

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
			return TypeEnum.QUEUEINTERACTIONCOUNTANALYTICSKPIFILTERDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.QUEUEINTERACTIONCOUNTANALYTICSKPIFILTERDATA;

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

	public static final String JSON_PROPERTY_QUEUE_INTERACTION_TYPES = "queueInteractionTypes";
	@JsonProperty(JSON_PROPERTY_QUEUE_INTERACTION_TYPES)
	private List<EQueueInteractionType> queueInteractionTypes = null;

	public static final String JSON_PROPERTY_ASSIGNED_AGENT_PERSON_IDS = "assignedAgentPersonIds";
	@JsonProperty(JSON_PROPERTY_ASSIGNED_AGENT_PERSON_IDS)
	private List<String> assignedAgentPersonIds = null;

	public static final String JSON_PROPERTY_ASSIGNED_AGENT_TEAM_IDS = "assignedAgentTeamIds";
	@JsonProperty(JSON_PROPERTY_ASSIGNED_AGENT_TEAM_IDS)
	private List<String> assignedAgentTeamIds = null;

	public static final String JSON_PROPERTY_MIN_RESERVATION_TIME_DURATION = "minReservationTimeDuration";
	@JsonProperty(JSON_PROPERTY_MIN_RESERVATION_TIME_DURATION)
	private Long minReservationTimeDuration;

	public static final String JSON_PROPERTY_MAX_RESERVATION_TIME_DURATION = "maxReservationTimeDuration";
	@JsonProperty(JSON_PROPERTY_MAX_RESERVATION_TIME_DURATION)
	private Long maxReservationTimeDuration;

	public QueueInteractionCountAnalyticsKpiFilterData $type(TypeEnum $type) {
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

	public QueueInteractionCountAnalyticsKpiFilterData startTimestamp(Long startTimestamp) {
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

	public QueueInteractionCountAnalyticsKpiFilterData endTimestamp(Long endTimestamp) {
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

	public QueueInteractionCountAnalyticsKpiFilterData conversationTemplateIds(List<String> conversationTemplateIds) {
		this.conversationTemplateIds = conversationTemplateIds;
		return this;
	}

	public QueueInteractionCountAnalyticsKpiFilterData addConversationTemplateIdsItem(String conversationTemplateIdsItem) {
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

	public QueueInteractionCountAnalyticsKpiFilterData conversationLocales(List<String> conversationLocales) {
		this.conversationLocales = conversationLocales;
		return this;
	}

	public QueueInteractionCountAnalyticsKpiFilterData addConversationLocalesItem(String conversationLocalesItem) {
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

	public QueueInteractionCountAnalyticsKpiFilterData initialEngagementTypes(List<EInitialEngagementType> initialEngagementTypes) {
		this.initialEngagementTypes = initialEngagementTypes;
		return this;
	}

	public QueueInteractionCountAnalyticsKpiFilterData addInitialEngagementTypesItem(EInitialEngagementType initialEngagementTypesItem) {
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

	public QueueInteractionCountAnalyticsKpiFilterData recipientAgentPersonIds(List<String> recipientAgentPersonIds) {
		this.recipientAgentPersonIds = recipientAgentPersonIds;
		return this;
	}

	public QueueInteractionCountAnalyticsKpiFilterData addRecipientAgentPersonIdsItem(String recipientAgentPersonIdsItem) {
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

	public QueueInteractionCountAnalyticsKpiFilterData recipientTeamIds(List<String> recipientTeamIds) {
		this.recipientTeamIds = recipientTeamIds;
		return this;
	}

	public QueueInteractionCountAnalyticsKpiFilterData addRecipientTeamIdsItem(String recipientTeamIdsItem) {
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

	public QueueInteractionCountAnalyticsKpiFilterData recipientNamedAreaIds(List<String> recipientNamedAreaIds) {
		this.recipientNamedAreaIds = recipientNamedAreaIds;
		return this;
	}

	public QueueInteractionCountAnalyticsKpiFilterData addRecipientNamedAreaIdsItem(String recipientNamedAreaIdsItem) {
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

	public QueueInteractionCountAnalyticsKpiFilterData recipientAccountId(Boolean recipientAccountId) {
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

	public QueueInteractionCountAnalyticsKpiFilterData queueInteractionTypes(List<EQueueInteractionType> queueInteractionTypes) {
		this.queueInteractionTypes = queueInteractionTypes;
		return this;
	}

	public QueueInteractionCountAnalyticsKpiFilterData addQueueInteractionTypesItem(EQueueInteractionType queueInteractionTypesItem) {
		if (this.queueInteractionTypes == null) {
			this.queueInteractionTypes = new ArrayList<>();
		}
		this.queueInteractionTypes.add(queueInteractionTypesItem);
		return this;
	}

	/**
	 * A list of queue interaction types used to filter the analytics data included in the KPI calculation. Records matching any of the specified outcomes are
	 * included. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return queueInteractionTypes
	 **/
	@ApiModelProperty(value = "A list of queue interaction types used to filter the analytics data included in the KPI calculation. Records matching any of the specified outcomes are included. If null, the filter is not applied. An empty list is not allowed.")
	public List<EQueueInteractionType> getQueueInteractionTypes() {
		return queueInteractionTypes;
	}

	public void setQueueInteractionTypes(List<EQueueInteractionType> queueInteractionTypes) {
		this.queueInteractionTypes = queueInteractionTypes;
	}

	public QueueInteractionCountAnalyticsKpiFilterData assignedAgentPersonIds(List<String> assignedAgentPersonIds) {
		this.assignedAgentPersonIds = assignedAgentPersonIds;
		return this;
	}

	public QueueInteractionCountAnalyticsKpiFilterData addAssignedAgentPersonIdsItem(String assignedAgentPersonIdsItem) {
		if (this.assignedAgentPersonIds == null) {
			this.assignedAgentPersonIds = new ArrayList<>();
		}
		this.assignedAgentPersonIds.add(assignedAgentPersonIdsItem);
		return this;
	}

	/**
	 * A list of assigned agent person IDs (of agents who redeemed the invitation, or agents the invitation was reserved for) used to filter the analytics data
	 * included in the KPI calculation. Records matching any of the specified IDs are included. The specified IDs must exist in the Unblu database and be accessible
	 * to the user. Supports the &#x60;CURRENT_USER&#x60; variable. If null, the filter is not applied. An empty list is not allowed. Optional.
	 * 
	 * @return assignedAgentPersonIds
	 **/
	@ApiModelProperty(value = "A list of assigned agent person IDs (of agents who redeemed the invitation, or agents the invitation was reserved for) used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the `CURRENT_USER` variable. If null, the filter is not applied. An empty list is not allowed. Optional.")
	public List<String> getAssignedAgentPersonIds() {
		return assignedAgentPersonIds;
	}

	public void setAssignedAgentPersonIds(List<String> assignedAgentPersonIds) {
		this.assignedAgentPersonIds = assignedAgentPersonIds;
	}

	public QueueInteractionCountAnalyticsKpiFilterData assignedAgentTeamIds(List<String> assignedAgentTeamIds) {
		this.assignedAgentTeamIds = assignedAgentTeamIds;
		return this;
	}

	public QueueInteractionCountAnalyticsKpiFilterData addAssignedAgentTeamIdsItem(String assignedAgentTeamIdsItem) {
		if (this.assignedAgentTeamIds == null) {
			this.assignedAgentTeamIds = new ArrayList<>();
		}
		this.assignedAgentTeamIds.add(assignedAgentTeamIdsItem);
		return this;
	}

	/**
	 * A list of assigned agent team IDs (the team of the agent who redeemed the invitation, or the team of the agent the invitation was reserved for) used to
	 * filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included. The specified IDs must exist in the Unblu
	 * database and be accessible to the user. Supports the &#x60;CURRENT_TEAM&#x60; variable. If null, the filter is not applied. An empty list is not allowed.
	 * Optional.
	 * 
	 * @return assignedAgentTeamIds
	 **/
	@ApiModelProperty(value = "A list of assigned agent team IDs (the team of the agent who redeemed the invitation, or the team of the agent the invitation was reserved for) used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the `CURRENT_TEAM` variable. If null, the filter is not applied. An empty list is not allowed. Optional.")
	public List<String> getAssignedAgentTeamIds() {
		return assignedAgentTeamIds;
	}

	public void setAssignedAgentTeamIds(List<String> assignedAgentTeamIds) {
		this.assignedAgentTeamIds = assignedAgentTeamIds;
	}

	public QueueInteractionCountAnalyticsKpiFilterData minReservationTimeDuration(Long minReservationTimeDuration) {
		this.minReservationTimeDuration = minReservationTimeDuration;
		return this;
	}

	/**
	 * Minimum reservation time duration (in milliseconds). Records with a duration greater than or equal to this value are included. If null, the filter is not
	 * applied.
	 * 
	 * @return minReservationTimeDuration
	 **/
	@ApiModelProperty(value = "Minimum reservation time duration (in milliseconds). Records with a duration greater than or equal to this value are included. If null, the filter is not applied.")
	public Long getMinReservationTimeDuration() {
		return minReservationTimeDuration;
	}

	public void setMinReservationTimeDuration(Long minReservationTimeDuration) {
		this.minReservationTimeDuration = minReservationTimeDuration;
	}

	public QueueInteractionCountAnalyticsKpiFilterData maxReservationTimeDuration(Long maxReservationTimeDuration) {
		this.maxReservationTimeDuration = maxReservationTimeDuration;
		return this;
	}

	/**
	 * Maximum reservation time duration (in milliseconds). Records with a duration less than or equal to this value are included. If null, the filter is not
	 * applied.
	 * 
	 * @return maxReservationTimeDuration
	 **/
	@ApiModelProperty(value = "Maximum reservation time duration (in milliseconds). Records with a duration less than or equal to this value are included. If null, the filter is not applied.")
	public Long getMaxReservationTimeDuration() {
		return maxReservationTimeDuration;
	}

	public void setMaxReservationTimeDuration(Long maxReservationTimeDuration) {
		this.maxReservationTimeDuration = maxReservationTimeDuration;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		QueueInteractionCountAnalyticsKpiFilterData queueInteractionCountAnalyticsKpiFilterData = (QueueInteractionCountAnalyticsKpiFilterData) o;
		return Objects.equals(this.$type, queueInteractionCountAnalyticsKpiFilterData.$type) &&
				Objects.equals(this.startTimestamp, queueInteractionCountAnalyticsKpiFilterData.startTimestamp) &&
				Objects.equals(this.endTimestamp, queueInteractionCountAnalyticsKpiFilterData.endTimestamp) &&
				Objects.equals(this.conversationTemplateIds, queueInteractionCountAnalyticsKpiFilterData.conversationTemplateIds) &&
				Objects.equals(this.conversationLocales, queueInteractionCountAnalyticsKpiFilterData.conversationLocales) &&
				Objects.equals(this.initialEngagementTypes, queueInteractionCountAnalyticsKpiFilterData.initialEngagementTypes) &&
				Objects.equals(this.recipientAgentPersonIds, queueInteractionCountAnalyticsKpiFilterData.recipientAgentPersonIds) &&
				Objects.equals(this.recipientTeamIds, queueInteractionCountAnalyticsKpiFilterData.recipientTeamIds) &&
				Objects.equals(this.recipientNamedAreaIds, queueInteractionCountAnalyticsKpiFilterData.recipientNamedAreaIds) &&
				Objects.equals(this.recipientAccountId, queueInteractionCountAnalyticsKpiFilterData.recipientAccountId) &&
				Objects.equals(this.queueInteractionTypes, queueInteractionCountAnalyticsKpiFilterData.queueInteractionTypes) &&
				Objects.equals(this.assignedAgentPersonIds, queueInteractionCountAnalyticsKpiFilterData.assignedAgentPersonIds) &&
				Objects.equals(this.assignedAgentTeamIds, queueInteractionCountAnalyticsKpiFilterData.assignedAgentTeamIds) &&
				Objects.equals(this.minReservationTimeDuration, queueInteractionCountAnalyticsKpiFilterData.minReservationTimeDuration) &&
				Objects.equals(this.maxReservationTimeDuration, queueInteractionCountAnalyticsKpiFilterData.maxReservationTimeDuration);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, startTimestamp, endTimestamp, conversationTemplateIds, conversationLocales, initialEngagementTypes, recipientAgentPersonIds, recipientTeamIds, recipientNamedAreaIds, recipientAccountId, queueInteractionTypes, assignedAgentPersonIds, assignedAgentTeamIds, minReservationTimeDuration, maxReservationTimeDuration);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class QueueInteractionCountAnalyticsKpiFilterData {\n");
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
		sb.append("    queueInteractionTypes: ").append(toIndentedString(queueInteractionTypes)).append("\n");
		sb.append("    assignedAgentPersonIds: ").append(toIndentedString(assignedAgentPersonIds)).append("\n");
		sb.append("    assignedAgentTeamIds: ").append(toIndentedString(assignedAgentTeamIds)).append("\n");
		sb.append("    minReservationTimeDuration: ").append(toIndentedString(minReservationTimeDuration)).append("\n");
		sb.append("    maxReservationTimeDuration: ").append(toIndentedString(maxReservationTimeDuration)).append("\n");
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
