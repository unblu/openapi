
package com.unblu.webapi.model.v4;

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
 * A conversation actively handled by an agent in an agent availability snapshot (nested under the agent handling it). Carries exactly the conversation fields
 * common to every snapshot conversation; the queue-specific fields are added by &#x60;QueuedConversationData&#x60;.
 */
@ApiModel(description = "A conversation actively handled by an agent in an agent availability snapshot (nested under the agent handling it). Carries exactly the conversation fields common to every snapshot conversation; the queue-specific fields are added by `QueuedConversationData`.")

@JsonPropertyOrder({
	AgentAvailabilityConversationData.JSON_PROPERTY_$_TYPE,
	AgentAvailabilityConversationData.JSON_PROPERTY_ID,
	AgentAvailabilityConversationData.JSON_PROPERTY_CONVERSATION_TEMPLATE_ID,
	AgentAvailabilityConversationData.JSON_PROPERTY_RECIPIENT_ID,
	AgentAvailabilityConversationData.JSON_PROPERTY_RECIPIENT_TYPE,
	AgentAvailabilityConversationData.JSON_PROPERTY_LOCALE,
	AgentAvailabilityConversationData.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE,
	AgentAvailabilityConversationData.JSON_PROPERTY_INITIAL_ENGAGEMENT_URL,
	AgentAvailabilityConversationData.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
	AgentAvailabilityConversationData.JSON_PROPERTY_CONTEXT_PERSON_ID,
	AgentAvailabilityConversationData.JSON_PROPERTY_TOPIC,
	AgentAvailabilityConversationData.JSON_PROPERTY_CONVERSATION_VISIBILITY,
	AgentAvailabilityConversationData.JSON_PROPERTY_AWAITED_PERSON_TYPE,
	AgentAvailabilityConversationData.JSON_PROPERTY_AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP,
	AgentAvailabilityConversationData.JSON_PROPERTY_CREATION_TIMESTAMP,
	AgentAvailabilityConversationData.JSON_PROPERTY_SOURCE_ID,
	AgentAvailabilityConversationData.JSON_PROPERTY_SOURCE_URL,
	AgentAvailabilityConversationData.JSON_PROPERTY_PRIORITY,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AgentAvailabilityConversationData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AGENTAVAILABILITYCONVERSATIONDATA("AgentAvailabilityConversationData");

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
			return TypeEnum.AGENTAVAILABILITYCONVERSATIONDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AGENTAVAILABILITYCONVERSATIONDATA;

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

	public AgentAvailabilityConversationData $type(TypeEnum $type) {
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

	public AgentAvailabilityConversationData id(String id) {
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

	public AgentAvailabilityConversationData conversationTemplateId(String conversationTemplateId) {
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

	public AgentAvailabilityConversationData recipientId(String recipientId) {
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

	public AgentAvailabilityConversationData recipientType(EConversationRecipientType recipientType) {
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

	public AgentAvailabilityConversationData locale(String locale) {
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

	public AgentAvailabilityConversationData initialEngagementType(EInitialEngagementType initialEngagementType) {
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

	public AgentAvailabilityConversationData initialEngagementUrl(String initialEngagementUrl) {
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

	public AgentAvailabilityConversationData externalMessengerChannelId(String externalMessengerChannelId) {
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

	public AgentAvailabilityConversationData contextPersonId(String contextPersonId) {
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

	public AgentAvailabilityConversationData topic(String topic) {
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

	public AgentAvailabilityConversationData conversationVisibility(EConversationVisibility conversationVisibility) {
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

	public AgentAvailabilityConversationData awaitedPersonType(EAwaitedPersonType awaitedPersonType) {
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

	public AgentAvailabilityConversationData awaitedPersonTypeChangeTimestamp(Long awaitedPersonTypeChangeTimestamp) {
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

	public AgentAvailabilityConversationData creationTimestamp(Long creationTimestamp) {
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

	public AgentAvailabilityConversationData sourceId(String sourceId) {
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

	public AgentAvailabilityConversationData sourceUrl(String sourceUrl) {
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

	public AgentAvailabilityConversationData priority(EBusySessionLimitPriority priority) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AgentAvailabilityConversationData agentAvailabilityConversationData = (AgentAvailabilityConversationData) o;
		return Objects.equals(this.$type, agentAvailabilityConversationData.$type) &&
				Objects.equals(this.id, agentAvailabilityConversationData.id) &&
				Objects.equals(this.conversationTemplateId, agentAvailabilityConversationData.conversationTemplateId) &&
				Objects.equals(this.recipientId, agentAvailabilityConversationData.recipientId) &&
				Objects.equals(this.recipientType, agentAvailabilityConversationData.recipientType) &&
				Objects.equals(this.locale, agentAvailabilityConversationData.locale) &&
				Objects.equals(this.initialEngagementType, agentAvailabilityConversationData.initialEngagementType) &&
				Objects.equals(this.initialEngagementUrl, agentAvailabilityConversationData.initialEngagementUrl) &&
				Objects.equals(this.externalMessengerChannelId, agentAvailabilityConversationData.externalMessengerChannelId) &&
				Objects.equals(this.contextPersonId, agentAvailabilityConversationData.contextPersonId) &&
				Objects.equals(this.topic, agentAvailabilityConversationData.topic) &&
				Objects.equals(this.conversationVisibility, agentAvailabilityConversationData.conversationVisibility) &&
				Objects.equals(this.awaitedPersonType, agentAvailabilityConversationData.awaitedPersonType) &&
				Objects.equals(this.awaitedPersonTypeChangeTimestamp, agentAvailabilityConversationData.awaitedPersonTypeChangeTimestamp) &&
				Objects.equals(this.creationTimestamp, agentAvailabilityConversationData.creationTimestamp) &&
				Objects.equals(this.sourceId, agentAvailabilityConversationData.sourceId) &&
				Objects.equals(this.sourceUrl, agentAvailabilityConversationData.sourceUrl) &&
				Objects.equals(this.priority, agentAvailabilityConversationData.priority);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, conversationTemplateId, recipientId, recipientType, locale, initialEngagementType, initialEngagementUrl, externalMessengerChannelId, contextPersonId, topic, conversationVisibility, awaitedPersonType, awaitedPersonTypeChangeTimestamp, creationTimestamp, sourceId, sourceUrl, priority);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AgentAvailabilityConversationData {\n");
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
