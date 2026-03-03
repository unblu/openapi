
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
 * Data model object representing filters for the KPI calculation of the number of messages &lt;p&gt; Filter logic: &lt;ul&gt; &lt;li&gt;startTimestamp
 * AND&lt;/li&gt; &lt;li&gt;endTimestamp AND&lt;/li&gt; &lt;li&gt;conversationTemplateIds AND&lt;/li&gt; &lt;li&gt;conversationLocales AND&lt;/li&gt;
 * &lt;li&gt;initialEngagementTypes AND&lt;/li&gt; &lt;li&gt;(recipientAgentIds OR recipientTeamIds OR recipientNamedAreaIds OR recipientAccountId)&lt;/li&gt;
 * &lt;li&gt;assignedAgentPersonIds AND&lt;/li&gt; &lt;li&gt;assignedAgentTeamIds AND&lt;/li&gt; &lt;li&gt;senderPersonTypes AND&lt;/li&gt;
 * &lt;li&gt;senderPersonIds AND&lt;/li&gt; &lt;li&gt;senderPersonTeamIds AND&lt;/li&gt; &lt;li&gt;messageLocales AND&lt;/li&gt; &lt;li&gt;messageTypes
 * AND&lt;/li&gt; &lt;li&gt;minCharacterCount AND&lt;/li&gt; &lt;li&gt;maxCharacterCount&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;
 */
@ApiModel(description = "Data model object representing filters for the KPI calculation of the number of messages <p> Filter logic: <ul> <li>startTimestamp AND</li> <li>endTimestamp AND</li> <li>conversationTemplateIds AND</li> <li>conversationLocales AND</li> <li>initialEngagementTypes AND</li> <li>(recipientAgentIds OR recipientTeamIds OR recipientNamedAreaIds OR recipientAccountId)</li> <li>assignedAgentPersonIds AND</li> <li>assignedAgentTeamIds AND</li> <li>senderPersonTypes AND</li> <li>senderPersonIds AND</li> <li>senderPersonTeamIds AND</li> <li>messageLocales AND</li> <li>messageTypes AND</li> <li>minCharacterCount AND</li> <li>maxCharacterCount</li> </ul> <p>")

@JsonPropertyOrder({
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_$_TYPE,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_START_TIMESTAMP,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_END_TIMESTAMP,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_CONVERSATION_TEMPLATE_IDS,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_CONVERSATION_LOCALES,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPES,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_AGENT_PERSON_IDS,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_TEAM_IDS,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_NAMED_AREA_IDS,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_RECIPIENT_ACCOUNT_ID,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_ASSIGNED_AGENT_PERSON_IDS,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_ASSIGNED_AGENT_TEAM_IDS,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_SENDER_PERSON_TYPES,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_SENDER_PERSON_IDS,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_SENDER_PERSON_TEAM_IDS,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_MESSAGE_LOCALES,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_MESSAGE_TYPES,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_MIN_CHARACTER_COUNT,
	MessagesCountAnalyticsKpiFilterData.JSON_PROPERTY_MAX_CHARACTER_COUNT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class MessagesCountAnalyticsKpiFilterData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		MESSAGESCOUNTANALYTICSKPIFILTERDATA("MessagesCountAnalyticsKpiFilterData");

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
			return TypeEnum.MESSAGESCOUNTANALYTICSKPIFILTERDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.MESSAGESCOUNTANALYTICSKPIFILTERDATA;

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

	public static final String JSON_PROPERTY_SENDER_PERSON_TYPES = "senderPersonTypes";
	@JsonProperty(JSON_PROPERTY_SENDER_PERSON_TYPES)
	private List<EPersonType> senderPersonTypes = null;

	public static final String JSON_PROPERTY_SENDER_PERSON_IDS = "senderPersonIds";
	@JsonProperty(JSON_PROPERTY_SENDER_PERSON_IDS)
	private List<String> senderPersonIds = null;

	public static final String JSON_PROPERTY_SENDER_PERSON_TEAM_IDS = "senderPersonTeamIds";
	@JsonProperty(JSON_PROPERTY_SENDER_PERSON_TEAM_IDS)
	private List<String> senderPersonTeamIds = null;

	public static final String JSON_PROPERTY_MESSAGE_LOCALES = "messageLocales";
	@JsonProperty(JSON_PROPERTY_MESSAGE_LOCALES)
	private List<String> messageLocales = null;

	public static final String JSON_PROPERTY_MESSAGE_TYPES = "messageTypes";
	@JsonProperty(JSON_PROPERTY_MESSAGE_TYPES)
	private List<EMessageType> messageTypes = null;

	public static final String JSON_PROPERTY_MIN_CHARACTER_COUNT = "minCharacterCount";
	@JsonProperty(JSON_PROPERTY_MIN_CHARACTER_COUNT)
	private Long minCharacterCount;

	public static final String JSON_PROPERTY_MAX_CHARACTER_COUNT = "maxCharacterCount";
	@JsonProperty(JSON_PROPERTY_MAX_CHARACTER_COUNT)
	private Long maxCharacterCount;

	public MessagesCountAnalyticsKpiFilterData $type(TypeEnum $type) {
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

	public MessagesCountAnalyticsKpiFilterData startTimestamp(Long startTimestamp) {
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

	public MessagesCountAnalyticsKpiFilterData endTimestamp(Long endTimestamp) {
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

	public MessagesCountAnalyticsKpiFilterData conversationTemplateIds(List<String> conversationTemplateIds) {
		this.conversationTemplateIds = conversationTemplateIds;
		return this;
	}

	public MessagesCountAnalyticsKpiFilterData addConversationTemplateIdsItem(String conversationTemplateIdsItem) {
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

	public MessagesCountAnalyticsKpiFilterData conversationLocales(List<String> conversationLocales) {
		this.conversationLocales = conversationLocales;
		return this;
	}

	public MessagesCountAnalyticsKpiFilterData addConversationLocalesItem(String conversationLocalesItem) {
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

	public MessagesCountAnalyticsKpiFilterData initialEngagementTypes(List<EInitialEngagementType> initialEngagementTypes) {
		this.initialEngagementTypes = initialEngagementTypes;
		return this;
	}

	public MessagesCountAnalyticsKpiFilterData addInitialEngagementTypesItem(EInitialEngagementType initialEngagementTypesItem) {
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

	public MessagesCountAnalyticsKpiFilterData recipientAgentPersonIds(List<String> recipientAgentPersonIds) {
		this.recipientAgentPersonIds = recipientAgentPersonIds;
		return this;
	}

	public MessagesCountAnalyticsKpiFilterData addRecipientAgentPersonIdsItem(String recipientAgentPersonIdsItem) {
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

	public MessagesCountAnalyticsKpiFilterData recipientTeamIds(List<String> recipientTeamIds) {
		this.recipientTeamIds = recipientTeamIds;
		return this;
	}

	public MessagesCountAnalyticsKpiFilterData addRecipientTeamIdsItem(String recipientTeamIdsItem) {
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

	public MessagesCountAnalyticsKpiFilterData recipientNamedAreaIds(List<String> recipientNamedAreaIds) {
		this.recipientNamedAreaIds = recipientNamedAreaIds;
		return this;
	}

	public MessagesCountAnalyticsKpiFilterData addRecipientNamedAreaIdsItem(String recipientNamedAreaIdsItem) {
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

	public MessagesCountAnalyticsKpiFilterData recipientAccountId(Boolean recipientAccountId) {
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

	public MessagesCountAnalyticsKpiFilterData assignedAgentPersonIds(List<String> assignedAgentPersonIds) {
		this.assignedAgentPersonIds = assignedAgentPersonIds;
		return this;
	}

	public MessagesCountAnalyticsKpiFilterData addAssignedAgentPersonIdsItem(String assignedAgentPersonIdsItem) {
		if (this.assignedAgentPersonIds == null) {
			this.assignedAgentPersonIds = new ArrayList<>();
		}
		this.assignedAgentPersonIds.add(assignedAgentPersonIdsItem);
		return this;
	}

	/**
	 * A list of assigned agent person IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are
	 * included. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the &#x60;CURRENT_USER&#x60; variable. If null, the
	 * filter is not applied. An empty list is not allowed.
	 * 
	 * @return assignedAgentPersonIds
	 **/
	@ApiModelProperty(value = "A list of assigned agent person IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the `CURRENT_USER` variable. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getAssignedAgentPersonIds() {
		return assignedAgentPersonIds;
	}

	public void setAssignedAgentPersonIds(List<String> assignedAgentPersonIds) {
		this.assignedAgentPersonIds = assignedAgentPersonIds;
	}

	public MessagesCountAnalyticsKpiFilterData assignedAgentTeamIds(List<String> assignedAgentTeamIds) {
		this.assignedAgentTeamIds = assignedAgentTeamIds;
		return this;
	}

	public MessagesCountAnalyticsKpiFilterData addAssignedAgentTeamIdsItem(String assignedAgentTeamIdsItem) {
		if (this.assignedAgentTeamIds == null) {
			this.assignedAgentTeamIds = new ArrayList<>();
		}
		this.assignedAgentTeamIds.add(assignedAgentTeamIdsItem);
		return this;
	}

	/**
	 * A list of assigned agent team IDs used to filter results. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the
	 * &#x60;CURRENT_TEAM&#x60; variable. If null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return assignedAgentTeamIds
	 **/
	@ApiModelProperty(value = "A list of assigned agent team IDs used to filter results. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the `CURRENT_TEAM` variable. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getAssignedAgentTeamIds() {
		return assignedAgentTeamIds;
	}

	public void setAssignedAgentTeamIds(List<String> assignedAgentTeamIds) {
		this.assignedAgentTeamIds = assignedAgentTeamIds;
	}

	public MessagesCountAnalyticsKpiFilterData senderPersonTypes(List<EPersonType> senderPersonTypes) {
		this.senderPersonTypes = senderPersonTypes;
		return this;
	}

	public MessagesCountAnalyticsKpiFilterData addSenderPersonTypesItem(EPersonType senderPersonTypesItem) {
		if (this.senderPersonTypes == null) {
			this.senderPersonTypes = new ArrayList<>();
		}
		this.senderPersonTypes.add(senderPersonTypesItem);
		return this;
	}

	/**
	 * A list of sender person types used to filter the analytics data included in the KPI calculation. Records matching any of the specified types are included. If
	 * null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return senderPersonTypes
	 **/
	@ApiModelProperty(value = "A list of sender person types used to filter the analytics data included in the KPI calculation. Records matching any of the specified types are included. If null, the filter is not applied. An empty list is not allowed.")
	public List<EPersonType> getSenderPersonTypes() {
		return senderPersonTypes;
	}

	public void setSenderPersonTypes(List<EPersonType> senderPersonTypes) {
		this.senderPersonTypes = senderPersonTypes;
	}

	public MessagesCountAnalyticsKpiFilterData senderPersonIds(List<String> senderPersonIds) {
		this.senderPersonIds = senderPersonIds;
		return this;
	}

	public MessagesCountAnalyticsKpiFilterData addSenderPersonIdsItem(String senderPersonIdsItem) {
		if (this.senderPersonIds == null) {
			this.senderPersonIds = new ArrayList<>();
		}
		this.senderPersonIds.add(senderPersonIdsItem);
		return this;
	}

	/**
	 * A list of sender person IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included. The
	 * specified IDs must exist in the Unblu database and be accessible to the user. Supports the &#x60;CURRENT_USER&#x60; variable. If null, the filter is not
	 * applied. An empty list is not allowed.
	 * 
	 * @return senderPersonIds
	 **/
	@ApiModelProperty(value = "A list of sender person IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the `CURRENT_USER` variable. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getSenderPersonIds() {
		return senderPersonIds;
	}

	public void setSenderPersonIds(List<String> senderPersonIds) {
		this.senderPersonIds = senderPersonIds;
	}

	public MessagesCountAnalyticsKpiFilterData senderPersonTeamIds(List<String> senderPersonTeamIds) {
		this.senderPersonTeamIds = senderPersonTeamIds;
		return this;
	}

	public MessagesCountAnalyticsKpiFilterData addSenderPersonTeamIdsItem(String senderPersonTeamIdsItem) {
		if (this.senderPersonTeamIds == null) {
			this.senderPersonTeamIds = new ArrayList<>();
		}
		this.senderPersonTeamIds.add(senderPersonTeamIdsItem);
		return this;
	}

	/**
	 * A list of sender person team IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included.
	 * The specified IDs must exist in the Unblu database and be accessible to the user. Supports the &#x60;CURRENT_TEAM&#x60; variable. If null, the filter is not
	 * applied. An empty list is not allowed.
	 * 
	 * @return senderPersonTeamIds
	 **/
	@ApiModelProperty(value = "A list of sender person team IDs used to filter the analytics data included in the KPI calculation. Records matching any of the specified IDs are included. The specified IDs must exist in the Unblu database and be accessible to the user. Supports the `CURRENT_TEAM` variable. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getSenderPersonTeamIds() {
		return senderPersonTeamIds;
	}

	public void setSenderPersonTeamIds(List<String> senderPersonTeamIds) {
		this.senderPersonTeamIds = senderPersonTeamIds;
	}

	public MessagesCountAnalyticsKpiFilterData messageLocales(List<String> messageLocales) {
		this.messageLocales = messageLocales;
		return this;
	}

	public MessagesCountAnalyticsKpiFilterData addMessageLocalesItem(String messageLocalesItem) {
		if (this.messageLocales == null) {
			this.messageLocales = new ArrayList<>();
		}
		this.messageLocales.add(messageLocalesItem);
		return this;
	}

	/**
	 * A list of message locales used to filter the analytics data included in the KPI calculation. Records matching any of the specified locales are included. If
	 * null, the filter is not applied. An empty list is not allowed.
	 * 
	 * @return messageLocales
	 **/
	@ApiModelProperty(value = "A list of message locales used to filter the analytics data included in the KPI calculation. Records matching any of the specified locales are included. If null, the filter is not applied. An empty list is not allowed.")
	public List<String> getMessageLocales() {
		return messageLocales;
	}

	public void setMessageLocales(List<String> messageLocales) {
		this.messageLocales = messageLocales;
	}

	public MessagesCountAnalyticsKpiFilterData messageTypes(List<EMessageType> messageTypes) {
		this.messageTypes = messageTypes;
		return this;
	}

	public MessagesCountAnalyticsKpiFilterData addMessageTypesItem(EMessageType messageTypesItem) {
		if (this.messageTypes == null) {
			this.messageTypes = new ArrayList<>();
		}
		this.messageTypes.add(messageTypesItem);
		return this;
	}

	/**
	 * A list of message types used to filter the analytics data included in the KPI calculation. Records matching any of the specified types are included. If null,
	 * the filter is not applied. An empty list is not allowed.
	 * 
	 * @return messageTypes
	 **/
	@ApiModelProperty(value = "A list of message types used to filter the analytics data included in the KPI calculation. Records matching any of the specified types are included. If null, the filter is not applied. An empty list is not allowed.")
	public List<EMessageType> getMessageTypes() {
		return messageTypes;
	}

	public void setMessageTypes(List<EMessageType> messageTypes) {
		this.messageTypes = messageTypes;
	}

	public MessagesCountAnalyticsKpiFilterData minCharacterCount(Long minCharacterCount) {
		this.minCharacterCount = minCharacterCount;
		return this;
	}

	/**
	 * A minimum number of characters of the message. Records with at least the specified number are included. If null, the filter is not applied.
	 * 
	 * @return minCharacterCount
	 **/
	@ApiModelProperty(value = "A minimum number of characters of the message. Records with at least the specified number are included. If null, the filter is not applied.")
	public Long getMinCharacterCount() {
		return minCharacterCount;
	}

	public void setMinCharacterCount(Long minCharacterCount) {
		this.minCharacterCount = minCharacterCount;
	}

	public MessagesCountAnalyticsKpiFilterData maxCharacterCount(Long maxCharacterCount) {
		this.maxCharacterCount = maxCharacterCount;
		return this;
	}

	/**
	 * A maximum number of characters of the message. Records with a number up to the specified value are included. If null, the filter is not applied.
	 * 
	 * @return maxCharacterCount
	 **/
	@ApiModelProperty(value = "A maximum number of characters of the message. Records with a number up to the specified value are included. If null, the filter is not applied.")
	public Long getMaxCharacterCount() {
		return maxCharacterCount;
	}

	public void setMaxCharacterCount(Long maxCharacterCount) {
		this.maxCharacterCount = maxCharacterCount;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MessagesCountAnalyticsKpiFilterData messagesCountAnalyticsKpiFilterData = (MessagesCountAnalyticsKpiFilterData) o;
		return Objects.equals(this.$type, messagesCountAnalyticsKpiFilterData.$type) &&
				Objects.equals(this.startTimestamp, messagesCountAnalyticsKpiFilterData.startTimestamp) &&
				Objects.equals(this.endTimestamp, messagesCountAnalyticsKpiFilterData.endTimestamp) &&
				Objects.equals(this.conversationTemplateIds, messagesCountAnalyticsKpiFilterData.conversationTemplateIds) &&
				Objects.equals(this.conversationLocales, messagesCountAnalyticsKpiFilterData.conversationLocales) &&
				Objects.equals(this.initialEngagementTypes, messagesCountAnalyticsKpiFilterData.initialEngagementTypes) &&
				Objects.equals(this.recipientAgentPersonIds, messagesCountAnalyticsKpiFilterData.recipientAgentPersonIds) &&
				Objects.equals(this.recipientTeamIds, messagesCountAnalyticsKpiFilterData.recipientTeamIds) &&
				Objects.equals(this.recipientNamedAreaIds, messagesCountAnalyticsKpiFilterData.recipientNamedAreaIds) &&
				Objects.equals(this.recipientAccountId, messagesCountAnalyticsKpiFilterData.recipientAccountId) &&
				Objects.equals(this.assignedAgentPersonIds, messagesCountAnalyticsKpiFilterData.assignedAgentPersonIds) &&
				Objects.equals(this.assignedAgentTeamIds, messagesCountAnalyticsKpiFilterData.assignedAgentTeamIds) &&
				Objects.equals(this.senderPersonTypes, messagesCountAnalyticsKpiFilterData.senderPersonTypes) &&
				Objects.equals(this.senderPersonIds, messagesCountAnalyticsKpiFilterData.senderPersonIds) &&
				Objects.equals(this.senderPersonTeamIds, messagesCountAnalyticsKpiFilterData.senderPersonTeamIds) &&
				Objects.equals(this.messageLocales, messagesCountAnalyticsKpiFilterData.messageLocales) &&
				Objects.equals(this.messageTypes, messagesCountAnalyticsKpiFilterData.messageTypes) &&
				Objects.equals(this.minCharacterCount, messagesCountAnalyticsKpiFilterData.minCharacterCount) &&
				Objects.equals(this.maxCharacterCount, messagesCountAnalyticsKpiFilterData.maxCharacterCount);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, startTimestamp, endTimestamp, conversationTemplateIds, conversationLocales, initialEngagementTypes, recipientAgentPersonIds, recipientTeamIds, recipientNamedAreaIds, recipientAccountId, assignedAgentPersonIds, assignedAgentTeamIds, senderPersonTypes, senderPersonIds, senderPersonTeamIds, messageLocales, messageTypes, minCharacterCount, maxCharacterCount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MessagesCountAnalyticsKpiFilterData {\n");
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
		sb.append("    senderPersonTypes: ").append(toIndentedString(senderPersonTypes)).append("\n");
		sb.append("    senderPersonIds: ").append(toIndentedString(senderPersonIds)).append("\n");
		sb.append("    senderPersonTeamIds: ").append(toIndentedString(senderPersonTeamIds)).append("\n");
		sb.append("    messageLocales: ").append(toIndentedString(messageLocales)).append("\n");
		sb.append("    messageTypes: ").append(toIndentedString(messageTypes)).append("\n");
		sb.append("    minCharacterCount: ").append(toIndentedString(minCharacterCount)).append("\n");
		sb.append("    maxCharacterCount: ").append(toIndentedString(maxCharacterCount)).append("\n");
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
