
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
 * A conversation waiting in the queue in a live-tracking snapshot. Adds the queue-specific fields to the conversation fields shared
 * with&#x60;AgentAvailabilityConversationData&#x60;.
 */
@ApiModel(description = "A conversation waiting in the queue in a live-tracking snapshot. Adds the queue-specific fields to the conversation fields shared with`AgentAvailabilityConversationData`.")

@JsonPropertyOrder({
	QueuedConversationData.JSON_PROPERTY_$_TYPE,
	QueuedConversationData.JSON_PROPERTY_ID,
	QueuedConversationData.JSON_PROPERTY_CONVERSATION_TEMPLATE_ID,
	QueuedConversationData.JSON_PROPERTY_RECIPIENT_ID,
	QueuedConversationData.JSON_PROPERTY_RECIPIENT_TYPE,
	QueuedConversationData.JSON_PROPERTY_LOCALE,
	QueuedConversationData.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE,
	QueuedConversationData.JSON_PROPERTY_INITIAL_ENGAGEMENT_URL,
	QueuedConversationData.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
	QueuedConversationData.JSON_PROPERTY_CONTEXT_PERSON_ID,
	QueuedConversationData.JSON_PROPERTY_TOPIC,
	QueuedConversationData.JSON_PROPERTY_CONVERSATION_VISIBILITY,
	QueuedConversationData.JSON_PROPERTY_AWAITED_PERSON_TYPE,
	QueuedConversationData.JSON_PROPERTY_AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP,
	QueuedConversationData.JSON_PROPERTY_CREATION_TIMESTAMP,
	QueuedConversationData.JSON_PROPERTY_SOURCE_ID,
	QueuedConversationData.JSON_PROPERTY_SOURCE_URL,
	QueuedConversationData.JSON_PROPERTY_PRIORITY,
	QueuedConversationData.JSON_PROPERTY_SORTING_ORDER,
	QueuedConversationData.JSON_PROPERTY_QUEUE_TIMESTAMP,
	QueuedConversationData.JSON_PROPERTY_PREFERRED_AGENT_PERSON_IDS,
	QueuedConversationData.JSON_PROPERTY_GEOLOCATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class QueuedConversationData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		QUEUEDCONVERSATIONDATA("QueuedConversationData");

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
			return TypeEnum.QUEUEDCONVERSATIONDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.QUEUEDCONVERSATIONDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CONVERSATION_TEMPLATE_ID = "conversationTemplateId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_TEMPLATE_ID)
	private String conversationTemplateId;

	public static final String JSON_PROPERTY_RECIPIENT_ID = "recipientId";
	@JsonProperty(JSON_PROPERTY_RECIPIENT_ID)
	private String recipientId;

	public static final String JSON_PROPERTY_RECIPIENT_TYPE = "recipientType";
	@JsonProperty(JSON_PROPERTY_RECIPIENT_TYPE)
	private EConversationRecipientType recipientType;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE = "initialEngagementType";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE)
	private EInitialEngagementType initialEngagementType;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_URL = "initialEngagementUrl";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_URL)
	private String initialEngagementUrl;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID = "externalMessengerChannelId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID)
	private String externalMessengerChannelId;

	public static final String JSON_PROPERTY_CONTEXT_PERSON_ID = "contextPersonId";
	@JsonProperty(JSON_PROPERTY_CONTEXT_PERSON_ID)
	private String contextPersonId;

	public static final String JSON_PROPERTY_TOPIC = "topic";
	@JsonProperty(JSON_PROPERTY_TOPIC)
	private String topic;

	public static final String JSON_PROPERTY_CONVERSATION_VISIBILITY = "conversationVisibility";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_VISIBILITY)
	private EConversationVisibility conversationVisibility;

	public static final String JSON_PROPERTY_AWAITED_PERSON_TYPE = "awaitedPersonType";
	@JsonProperty(JSON_PROPERTY_AWAITED_PERSON_TYPE)
	private EAwaitedPersonType awaitedPersonType;

	public static final String JSON_PROPERTY_AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP = "awaitedPersonTypeChangeTimestamp";
	@JsonProperty(JSON_PROPERTY_AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP)
	private Long awaitedPersonTypeChangeTimestamp;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public static final String JSON_PROPERTY_SOURCE_URL = "sourceUrl";
	@JsonProperty(JSON_PROPERTY_SOURCE_URL)
	private String sourceUrl;

	public static final String JSON_PROPERTY_PRIORITY = "priority";
	@JsonProperty(JSON_PROPERTY_PRIORITY)
	private EBusySessionLimitPriority priority;

	public static final String JSON_PROPERTY_SORTING_ORDER = "sortingOrder";
	@JsonProperty(JSON_PROPERTY_SORTING_ORDER)
	private Long sortingOrder;

	public static final String JSON_PROPERTY_QUEUE_TIMESTAMP = "queueTimestamp";
	@JsonProperty(JSON_PROPERTY_QUEUE_TIMESTAMP)
	private Long queueTimestamp;

	public static final String JSON_PROPERTY_PREFERRED_AGENT_PERSON_IDS = "preferredAgentPersonIds";
	@JsonProperty(JSON_PROPERTY_PREFERRED_AGENT_PERSON_IDS)
	private List<String> preferredAgentPersonIds = null;

	public static final String JSON_PROPERTY_GEOLOCATION = "geolocation";
	@JsonProperty(JSON_PROPERTY_GEOLOCATION)
	private GeoLocation geolocation = null;

	public QueuedConversationData $type(TypeEnum $type) {
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

	public QueuedConversationData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The unique ID of the conversation.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The unique ID of the conversation.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public QueuedConversationData conversationTemplateId(String conversationTemplateId) {
		this.conversationTemplateId = conversationTemplateId;
		return this;
	}

	/**
	 * The conversation template the conversation was created from.
	 * 
	 * @return conversationTemplateId
	 **/
	@ApiModelProperty(value = "The conversation template the conversation was created from.")
	public String getConversationTemplateId() {
		return conversationTemplateId;
	}

	public void setConversationTemplateId(String conversationTemplateId) {
		this.conversationTemplateId = conversationTemplateId;
	}

	public QueuedConversationData recipientId(String recipientId) {
		this.recipientId = recipientId;
		return this;
	}

	/**
	 * Routing target ID (named area / team / agent).
	 * 
	 * @return recipientId
	 **/
	@ApiModelProperty(value = "Routing target ID (named area / team / agent).")
	public String getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	public QueuedConversationData recipientType(EConversationRecipientType recipientType) {
		this.recipientType = recipientType;
		return this;
	}

	/**
	 * Get recipientType
	 * 
	 * @return recipientType
	 **/
	@ApiModelProperty(value = "")
	public EConversationRecipientType getRecipientType() {
		return recipientType;
	}

	public void setRecipientType(EConversationRecipientType recipientType) {
		this.recipientType = recipientType;
	}

	public QueuedConversationData locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * Locale of the conversation language (as BCP 47 language tag form including region if available).
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "Locale of the conversation language (as BCP 47 language tag form including region if available).")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public QueuedConversationData initialEngagementType(EInitialEngagementType initialEngagementType) {
		this.initialEngagementType = initialEngagementType;
		return this;
	}

	/**
	 * Get initialEngagementType
	 * 
	 * @return initialEngagementType
	 **/
	@ApiModelProperty(value = "")
	public EInitialEngagementType getInitialEngagementType() {
		return initialEngagementType;
	}

	public void setInitialEngagementType(EInitialEngagementType initialEngagementType) {
		this.initialEngagementType = initialEngagementType;
	}

	public QueuedConversationData initialEngagementUrl(String initialEngagementUrl) {
		this.initialEngagementUrl = initialEngagementUrl;
		return this;
	}

	/**
	 * The URL where the conversation originated. The following conversations always have an initial engagement URL: &lt;ul&gt; &lt;li&gt;Conversations initiated by
	 * a visitor on a customer&#39;s website where Unblu is integrated&lt;/li&gt; &lt;li&gt;PIN-based conversations, provided a visitor redeems the PIN on a
	 * customer&#39;s website where Unblu is integrated&lt;/li&gt; &lt;li&gt;Conversations created using the Web API, provided an initial engagement URL was
	 * included when the conversation was created&lt;/li&gt; &lt;/ul&gt; Conversations initiated from the mobile SDK don&#39;t have an initial engagement URL.
	 * 
	 * @return initialEngagementUrl
	 **/
	@ApiModelProperty(value = "The URL where the conversation originated. The following conversations always have an initial engagement URL: <ul> <li>Conversations initiated by a visitor on a customer's website where Unblu is integrated</li> <li>PIN-based conversations, provided a visitor redeems the PIN on a customer's website where Unblu is integrated</li> <li>Conversations created using the Web API, provided an initial engagement URL was included when the conversation was created</li> </ul> Conversations initiated from the mobile SDK don't have an initial engagement URL.")
	public String getInitialEngagementUrl() {
		return initialEngagementUrl;
	}

	public void setInitialEngagementUrl(String initialEngagementUrl) {
		this.initialEngagementUrl = initialEngagementUrl;
	}

	public QueuedConversationData externalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
		return this;
	}

	/**
	 * ID of the external messenger channel the conversation is linked to. If this property is null the conversation is an Unblu conversation and not linked to an
	 * external messenger.
	 * 
	 * @return externalMessengerChannelId
	 **/
	@ApiModelProperty(value = "ID of the external messenger channel the conversation is linked to. If this property is null the conversation is an Unblu conversation and not linked to an external messenger.")
	public String getExternalMessengerChannelId() {
		return externalMessengerChannelId;
	}

	public void setExternalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
	}

	public QueuedConversationData contextPersonId(String contextPersonId) {
		this.contextPersonId = contextPersonId;
		return this;
	}

	/**
	 * The ID of the conversation&#39;s context person (visitor); null when no context person is resolvable.
	 * 
	 * @return contextPersonId
	 **/
	@ApiModelProperty(value = "The ID of the conversation's context person (visitor); null when no context person is resolvable.")
	public String getContextPersonId() {
		return contextPersonId;
	}

	public void setContextPersonId(String contextPersonId) {
		this.contextPersonId = contextPersonId;
	}

	public QueuedConversationData topic(String topic) {
		this.topic = topic;
		return this;
	}

	/**
	 * The conversation topic; null when not available.
	 * 
	 * @return topic
	 **/
	@ApiModelProperty(value = "The conversation topic; null when not available.")
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public QueuedConversationData conversationVisibility(EConversationVisibility conversationVisibility) {
		this.conversationVisibility = conversationVisibility;
		return this;
	}

	/**
	 * Get conversationVisibility
	 * 
	 * @return conversationVisibility
	 **/
	@ApiModelProperty(value = "")
	public EConversationVisibility getConversationVisibility() {
		return conversationVisibility;
	}

	public void setConversationVisibility(EConversationVisibility conversationVisibility) {
		this.conversationVisibility = conversationVisibility;
	}

	public QueuedConversationData awaitedPersonType(EAwaitedPersonType awaitedPersonType) {
		this.awaitedPersonType = awaitedPersonType;
		return this;
	}

	/**
	 * Get awaitedPersonType
	 * 
	 * @return awaitedPersonType
	 **/
	@ApiModelProperty(value = "")
	public EAwaitedPersonType getAwaitedPersonType() {
		return awaitedPersonType;
	}

	public void setAwaitedPersonType(EAwaitedPersonType awaitedPersonType) {
		this.awaitedPersonType = awaitedPersonType;
	}

	public QueuedConversationData awaitedPersonTypeChangeTimestamp(Long awaitedPersonTypeChangeTimestamp) {
		this.awaitedPersonTypeChangeTimestamp = awaitedPersonTypeChangeTimestamp;
		return this;
	}

	/**
	 * When the awaited person type last changed (Unix timestamp in ms); null when not available.
	 * 
	 * @return awaitedPersonTypeChangeTimestamp
	 **/
	@ApiModelProperty(value = "When the awaited person type last changed (Unix timestamp in ms); null when not available.")
	public Long getAwaitedPersonTypeChangeTimestamp() {
		return awaitedPersonTypeChangeTimestamp;
	}

	public void setAwaitedPersonTypeChangeTimestamp(Long awaitedPersonTypeChangeTimestamp) {
		this.awaitedPersonTypeChangeTimestamp = awaitedPersonTypeChangeTimestamp;
	}

	public QueuedConversationData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * When the conversation was created (Unix timestamp in ms).
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "When the conversation was created (Unix timestamp in ms).")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public QueuedConversationData sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * Custom ID to identify the source of the conversation. Typically used in connection with an external messenger to create a link to the external conversation;
	 * null when not available.
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "Custom ID to identify the source of the conversation. Typically used in connection with an external messenger to create a link to the external conversation; null when not available.")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public QueuedConversationData sourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
		return this;
	}

	/**
	 * URL identifying the system where the conversation was created. Null if created in Unblu.
	 * 
	 * @return sourceUrl
	 **/
	@ApiModelProperty(value = "URL identifying the system where the conversation was created. Null if created in Unblu.")
	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public QueuedConversationData priority(EBusySessionLimitPriority priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get priority
	 * 
	 * @return priority
	 **/
	@ApiModelProperty(value = "")
	public EBusySessionLimitPriority getPriority() {
		return priority;
	}

	public void setPriority(EBusySessionLimitPriority priority) {
		this.priority = priority;
	}

	public QueuedConversationData sortingOrder(Long sortingOrder) {
		this.sortingOrder = sortingOrder;
		return this;
	}

	/**
	 * The queue sorting order of the conversation. Always set: a queued conversation is given the configured order, defaulting
	 * to&#x60;com.unblu.conversation.invitation.conversationRequestQueueSortingOrder&#x60;.
	 * 
	 * @return sortingOrder
	 **/
	@ApiModelProperty(value = "The queue sorting order of the conversation. Always set: a queued conversation is given the configured order, defaulting to`com.unblu.conversation.invitation.conversationRequestQueueSortingOrder`.")
	public Long getSortingOrder() {
		return sortingOrder;
	}

	public void setSortingOrder(Long sortingOrder) {
		this.sortingOrder = sortingOrder;
	}

	public QueuedConversationData queueTimestamp(Long queueTimestamp) {
		this.queueTimestamp = queueTimestamp;
		return this;
	}

	/**
	 * When the conversation entered the queue (Unix timestamp in ms).
	 * 
	 * @return queueTimestamp
	 **/
	@ApiModelProperty(value = "When the conversation entered the queue (Unix timestamp in ms).")
	public Long getQueueTimestamp() {
		return queueTimestamp;
	}

	public void setQueueTimestamp(Long queueTimestamp) {
		this.queueTimestamp = queueTimestamp;
	}

	public QueuedConversationData preferredAgentPersonIds(List<String> preferredAgentPersonIds) {
		this.preferredAgentPersonIds = preferredAgentPersonIds;
		return this;
	}

	public QueuedConversationData addPreferredAgentPersonIdsItem(String preferredAgentPersonIdsItem) {
		if (this.preferredAgentPersonIds == null) {
			this.preferredAgentPersonIds = new ArrayList<>();
		}
		this.preferredAgentPersonIds.add(preferredAgentPersonIdsItem);
		return this;
	}

	/**
	 * The person IDs of the agents preferred for this queued conversation; null or empty when none.
	 * 
	 * @return preferredAgentPersonIds
	 **/
	@ApiModelProperty(value = "The person IDs of the agents preferred for this queued conversation; null or empty when none.")
	public List<String> getPreferredAgentPersonIds() {
		return preferredAgentPersonIds;
	}

	public void setPreferredAgentPersonIds(List<String> preferredAgentPersonIds) {
		this.preferredAgentPersonIds = preferredAgentPersonIds;
	}

	public QueuedConversationData geolocation(GeoLocation geolocation) {
		this.geolocation = geolocation;
		return this;
	}

	/**
	 * Get geolocation
	 * 
	 * @return geolocation
	 **/
	@ApiModelProperty(value = "")
	public GeoLocation getGeolocation() {
		return geolocation;
	}

	public void setGeolocation(GeoLocation geolocation) {
		this.geolocation = geolocation;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		QueuedConversationData queuedConversationData = (QueuedConversationData) o;
		return Objects.equals(this.$type, queuedConversationData.$type) &&
				Objects.equals(this.id, queuedConversationData.id) &&
				Objects.equals(this.conversationTemplateId, queuedConversationData.conversationTemplateId) &&
				Objects.equals(this.recipientId, queuedConversationData.recipientId) &&
				Objects.equals(this.recipientType, queuedConversationData.recipientType) &&
				Objects.equals(this.locale, queuedConversationData.locale) &&
				Objects.equals(this.initialEngagementType, queuedConversationData.initialEngagementType) &&
				Objects.equals(this.initialEngagementUrl, queuedConversationData.initialEngagementUrl) &&
				Objects.equals(this.externalMessengerChannelId, queuedConversationData.externalMessengerChannelId) &&
				Objects.equals(this.contextPersonId, queuedConversationData.contextPersonId) &&
				Objects.equals(this.topic, queuedConversationData.topic) &&
				Objects.equals(this.conversationVisibility, queuedConversationData.conversationVisibility) &&
				Objects.equals(this.awaitedPersonType, queuedConversationData.awaitedPersonType) &&
				Objects.equals(this.awaitedPersonTypeChangeTimestamp, queuedConversationData.awaitedPersonTypeChangeTimestamp) &&
				Objects.equals(this.creationTimestamp, queuedConversationData.creationTimestamp) &&
				Objects.equals(this.sourceId, queuedConversationData.sourceId) &&
				Objects.equals(this.sourceUrl, queuedConversationData.sourceUrl) &&
				Objects.equals(this.priority, queuedConversationData.priority) &&
				Objects.equals(this.sortingOrder, queuedConversationData.sortingOrder) &&
				Objects.equals(this.queueTimestamp, queuedConversationData.queueTimestamp) &&
				Objects.equals(this.preferredAgentPersonIds, queuedConversationData.preferredAgentPersonIds) &&
				Objects.equals(this.geolocation, queuedConversationData.geolocation);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, conversationTemplateId, recipientId, recipientType, locale, initialEngagementType, initialEngagementUrl, externalMessengerChannelId, contextPersonId, topic, conversationVisibility, awaitedPersonType, awaitedPersonTypeChangeTimestamp, creationTimestamp, sourceId, sourceUrl, priority, sortingOrder, queueTimestamp, preferredAgentPersonIds, geolocation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class QueuedConversationData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    conversationTemplateId: ").append(toIndentedString(conversationTemplateId)).append("\n");
		sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
		sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    initialEngagementType: ").append(toIndentedString(initialEngagementType)).append("\n");
		sb.append("    initialEngagementUrl: ").append(toIndentedString(initialEngagementUrl)).append("\n");
		sb.append("    externalMessengerChannelId: ").append(toIndentedString(externalMessengerChannelId)).append("\n");
		sb.append("    contextPersonId: ").append(toIndentedString(contextPersonId)).append("\n");
		sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
		sb.append("    conversationVisibility: ").append(toIndentedString(conversationVisibility)).append("\n");
		sb.append("    awaitedPersonType: ").append(toIndentedString(awaitedPersonType)).append("\n");
		sb.append("    awaitedPersonTypeChangeTimestamp: ").append(toIndentedString(awaitedPersonTypeChangeTimestamp)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
		sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
		sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
		sb.append("    sortingOrder: ").append(toIndentedString(sortingOrder)).append("\n");
		sb.append("    queueTimestamp: ").append(toIndentedString(queueTimestamp)).append("\n");
		sb.append("    preferredAgentPersonIds: ").append(toIndentedString(preferredAgentPersonIds)).append("\n");
		sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
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
