
package com.unblu.webapi.model.v3;

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
 * Metadata information about a conversation
 */
@ApiModel(description = "Metadata information about a conversation")

@JsonPropertyOrder({
	ConversationData.JSON_PROPERTY_$_TYPE,
	ConversationData.JSON_PROPERTY_CREATION_TIMESTAMP,
	ConversationData.JSON_PROPERTY_END_TIMESTAMP,
	ConversationData.JSON_PROPERTY_ID,
	ConversationData.JSON_PROPERTY_ACCOUNT_ID,
	ConversationData.JSON_PROPERTY_TOPIC,
	ConversationData.JSON_PROPERTY_SCHEDULED_TIMESTAMP,
	ConversationData.JSON_PROPERTY_RECIPIENT,
	ConversationData.JSON_PROPERTY_PARTICIPANTS,
	ConversationData.JSON_PROPERTY_ASSIGNEE_PERSON_ID,
	ConversationData.JSON_PROPERTY_CONTEXT_PERSON_ID,
	ConversationData.JSON_PROPERTY_STATE,
	ConversationData.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE,
	ConversationData.JSON_PROPERTY_LOCALE,
	ConversationData.JSON_PROPERTY_TOKBOX_SESSION_ID,
	ConversationData.JSON_PROPERTY_VISITOR_DATA,
	ConversationData.JSON_PROPERTY_CONVERSATION_TEMPLATE_ID,
	ConversationData.JSON_PROPERTY_LINKS,
	ConversationData.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
	ConversationData.JSON_PROPERTY_SOURCE_ID,
	ConversationData.JSON_PROPERTY_SOURCE_URL,
	ConversationData.JSON_PROPERTY_END_REASON,
	ConversationData.JSON_PROPERTY_INITIAL_ENGAGEMENT_URL,
	ConversationData.JSON_PROPERTY_AWAITED_PERSON_TYPE,
	ConversationData.JSON_PROPERTY_AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP,
	ConversationData.JSON_PROPERTY_CONFIGURATION,
	ConversationData.JSON_PROPERTY_TEXT,
	ConversationData.JSON_PROPERTY_METADATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONDATA("ConversationData");

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
			return TypeEnum.CONVERSATIONDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONDATA;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
	@JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
	private Long endTimestamp;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_TOPIC = "topic";
	@JsonProperty(JSON_PROPERTY_TOPIC)
	private String topic;

	public static final String JSON_PROPERTY_SCHEDULED_TIMESTAMP = "scheduledTimestamp";
	@JsonProperty(JSON_PROPERTY_SCHEDULED_TIMESTAMP)
	private Long scheduledTimestamp;

	public static final String JSON_PROPERTY_RECIPIENT = "recipient";
	@JsonProperty(JSON_PROPERTY_RECIPIENT)
	private ConversationRecipientData recipient = null;

	public static final String JSON_PROPERTY_PARTICIPANTS = "participants";
	@JsonProperty(JSON_PROPERTY_PARTICIPANTS)
	private List<ParticipantData> participants = null;

	public static final String JSON_PROPERTY_ASSIGNEE_PERSON_ID = "assigneePersonId";
	@JsonProperty(JSON_PROPERTY_ASSIGNEE_PERSON_ID)
	private String assigneePersonId;

	public static final String JSON_PROPERTY_CONTEXT_PERSON_ID = "contextPersonId";
	@JsonProperty(JSON_PROPERTY_CONTEXT_PERSON_ID)
	private String contextPersonId;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private EConversationState state;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE = "initialEngagementType";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE)
	private EInitialEngagementType initialEngagementType;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public static final String JSON_PROPERTY_TOKBOX_SESSION_ID = "tokboxSessionId";
	@JsonProperty(JSON_PROPERTY_TOKBOX_SESSION_ID)
	private String tokboxSessionId;

	public static final String JSON_PROPERTY_VISITOR_DATA = "visitorData";
	@JsonProperty(JSON_PROPERTY_VISITOR_DATA)
	private String visitorData;

	public static final String JSON_PROPERTY_CONVERSATION_TEMPLATE_ID = "conversationTemplateId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_TEMPLATE_ID)
	private String conversationTemplateId;

	public static final String JSON_PROPERTY_LINKS = "links";
	@JsonProperty(JSON_PROPERTY_LINKS)
	private List<ConversationLink> links = null;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID = "externalMessengerChannelId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID)
	private String externalMessengerChannelId;

	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public static final String JSON_PROPERTY_SOURCE_URL = "sourceUrl";
	@JsonProperty(JSON_PROPERTY_SOURCE_URL)
	private String sourceUrl;

	public static final String JSON_PROPERTY_END_REASON = "endReason";
	@JsonProperty(JSON_PROPERTY_END_REASON)
	private EConversationEndReason endReason;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_URL = "initialEngagementUrl";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_URL)
	private String initialEngagementUrl;

	public static final String JSON_PROPERTY_AWAITED_PERSON_TYPE = "awaitedPersonType";
	@JsonProperty(JSON_PROPERTY_AWAITED_PERSON_TYPE)
	private EAwaitedPersonType awaitedPersonType;

	public static final String JSON_PROPERTY_AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP = "awaitedPersonTypeChangeTimestamp";
	@JsonProperty(JSON_PROPERTY_AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP)
	private Long awaitedPersonTypeChangeTimestamp;

	public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
	@JsonProperty(JSON_PROPERTY_CONFIGURATION)
	private Map<String, String> _configuration = null;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private Map<String, Map<String, String>> text = null;

	public static final String JSON_PROPERTY_METADATA = "metadata";
	@JsonProperty(JSON_PROPERTY_METADATA)
	private Map<String, String> metadata = null;

	public ConversationData $type(TypeEnum $type) {
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

	public ConversationData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the entity was created. It is defined when the entity is stored the first time in the system.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the entity was created. It is defined when the entity is stored the first time in the system.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public ConversationData endTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the conversation ended, that is, all participants have finished their offboarding.&lt;br&gt; Null if the conversation hasn&#39;t
	 * ended yet.
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the conversation ended, that is, all participants have finished their offboarding.<br> Null if the conversation hasn't ended yet.")
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public ConversationData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique id of the conversation. When creating an entity this property can be omitted as it will be generated by the server.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique id of the conversation. When creating an entity this property can be omitted as it will be generated by the server.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ConversationData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Account id to which the conversation belongs to. When creating a conversation, the accountId can be omitted, as it will be filled by the server automatically
	 * with the account of the currently logged in user. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "Account id to which the conversation belongs to. When creating a conversation, the accountId can be omitted, as it will be filled by the server automatically with the account of the currently logged in user. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public ConversationData topic(String topic) {
		this.topic = topic;
		return this;
	}

	/**
	 * Topic of the conversation. Optional unless the initial engagement type is SCHEDULED_CONVERSATION, in which case it&#39;s mandatory.
	 * 
	 * @return topic
	 **/
	@ApiModelProperty(value = "Topic of the conversation. Optional unless the initial engagement type is SCHEDULED_CONVERSATION, in which case it's mandatory.")
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public ConversationData scheduledTimestamp(Long scheduledTimestamp) {
		this.scheduledTimestamp = scheduledTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the conversation is scheduled for. Can only be set for conversations with the initial engagement type SCHEDULED_CONVERSATION.
	 * 
	 * @return scheduledTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the conversation is scheduled for. Can only be set for conversations with the initial engagement type SCHEDULED_CONVERSATION.")
	public Long getScheduledTimestamp() {
		return scheduledTimestamp;
	}

	public void setScheduledTimestamp(Long scheduledTimestamp) {
		this.scheduledTimestamp = scheduledTimestamp;
	}

	public ConversationData recipient(ConversationRecipientData recipient) {
		this.recipient = recipient;
		return this;
	}

	/**
	 * Get recipient
	 * 
	 * @return recipient
	 **/
	@ApiModelProperty(value = "")
	public ConversationRecipientData getRecipient() {
		return recipient;
	}

	public void setRecipient(ConversationRecipientData recipient) {
		this.recipient = recipient;
	}

	public ConversationData participants(List<ParticipantData> participants) {
		this.participants = participants;
		return this;
	}

	public ConversationData addParticipantsItem(ParticipantData participantsItem) {
		if (this.participants == null) {
			this.participants = new ArrayList<>();
		}
		this.participants.add(participantsItem);
		return this;
	}

	/**
	 * Current participants of the conversation
	 * 
	 * @return participants
	 **/
	@ApiModelProperty(value = "Current participants of the conversation")
	public List<ParticipantData> getParticipants() {
		return participants;
	}

	public void setParticipants(List<ParticipantData> participants) {
		this.participants = participants;
	}

	public ConversationData assigneePersonId(String assigneePersonId) {
		this.assigneePersonId = assigneePersonId;
		return this;
	}

	/**
	 * PersonId of the assigned agent (the main agent). Must be one of the participants.&lt;br&gt; May be null.
	 * 
	 * @return assigneePersonId
	 **/
	@ApiModelProperty(value = "PersonId of the assigned agent (the main agent). Must be one of the participants.<br> May be null.")
	public String getAssigneePersonId() {
		return assigneePersonId;
	}

	public void setAssigneePersonId(String assigneePersonId) {
		this.assigneePersonId = assigneePersonId;
	}

	public ConversationData contextPersonId(String contextPersonId) {
		this.contextPersonId = contextPersonId;
		return this;
	}

	/**
	 * PersonId of the context person (the main visitor). Must be one of the participants.&lt;br&gt; May be null.
	 * 
	 * @return contextPersonId
	 **/
	@ApiModelProperty(value = "PersonId of the context person (the main visitor). Must be one of the participants.<br> May be null.")
	public String getContextPersonId() {
		return contextPersonId;
	}

	public void setContextPersonId(String contextPersonId) {
		this.contextPersonId = contextPersonId;
	}

	public ConversationData state(EConversationState state) {
		this.state = state;
		return this;
	}

	/**
	 * Get state
	 * 
	 * @return state
	 **/
	@ApiModelProperty(value = "")
	public EConversationState getState() {
		return state;
	}

	public void setState(EConversationState state) {
		this.state = state;
	}

	public ConversationData initialEngagementType(EInitialEngagementType initialEngagementType) {
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

	public ConversationData locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * Locale of the conversation language (as BCP 47 language tag form including region if available)
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "Locale of the conversation language (as BCP 47 language tag form including region if available)")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public ConversationData tokboxSessionId(String tokboxSessionId) {
		this.tokboxSessionId = tokboxSessionId;
		return this;
	}

	/**
	 * Vonage (formerly TokBox) sessionId. When creating a conversation, this property can be omitted, as it is generated by the Collaboration Server.&lt;br&gt; May
	 * be null.
	 * 
	 * @return tokboxSessionId
	 **/
	@ApiModelProperty(value = "Vonage (formerly TokBox) sessionId. When creating a conversation, this property can be omitted, as it is generated by the Collaboration Server.<br> May be null.")
	public String getTokboxSessionId() {
		return tokboxSessionId;
	}

	public void setTokboxSessionId(String tokboxSessionId) {
		this.tokboxSessionId = tokboxSessionId;
	}

	public ConversationData visitorData(String visitorData) {
		this.visitorData = visitorData;
		return this;
	}

	/**
	 * Custom data for the visitor. The data is readable and writable on the visitor side. Don&#39;t include any confidential information. Security-related data
	 * should be stored in the conversation metadata.&lt;br&gt; May be null.
	 * 
	 * @return visitorData
	 **/
	@ApiModelProperty(value = "Custom data for the visitor. The data is readable and writable on the visitor side. Don't include any confidential information. Security-related data should be stored in the conversation metadata.<br> May be null.")
	public String getVisitorData() {
		return visitorData;
	}

	public void setVisitorData(String visitorData) {
		this.visitorData = visitorData;
	}

	public ConversationData conversationTemplateId(String conversationTemplateId) {
		this.conversationTemplateId = conversationTemplateId;
		return this;
	}

	/**
	 * Template ID of the conversation. If omitted, the default conversation template will be retrieved based on the initial engagement type.
	 * 
	 * @return conversationTemplateId
	 **/
	@ApiModelProperty(value = "Template ID of the conversation. If omitted, the default conversation template will be retrieved based on the initial engagement type.")
	public String getConversationTemplateId() {
		return conversationTemplateId;
	}

	public void setConversationTemplateId(String conversationTemplateId) {
		this.conversationTemplateId = conversationTemplateId;
	}

	public ConversationData links(List<ConversationLink> links) {
		this.links = links;
		return this;
	}

	public ConversationData addLinksItem(ConversationLink linksItem) {
		if (this.links == null) {
			this.links = new ArrayList<>();
		}
		this.links.add(linksItem);
		return this;
	}

	/**
	 * Links to open the conversation. When creating a conversation this property can be omitted as it will be generated by the server.
	 * 
	 * @return links
	 **/
	@ApiModelProperty(value = "Links to open the conversation. When creating a conversation this property can be omitted as it will be generated by the server.")
	public List<ConversationLink> getLinks() {
		return links;
	}

	public void setLinks(List<ConversationLink> links) {
		this.links = links;
	}

	public ConversationData externalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
		return this;
	}

	/**
	 * ID of the external messenger channel the conversation should be linked to. If this property is null the conversation is an Unblu conversation and not linked
	 * to a messenger channel.
	 * 
	 * @return externalMessengerChannelId
	 **/
	@ApiModelProperty(value = "ID of the external messenger channel the conversation should be linked to. If this property is null the conversation is an Unblu conversation and not linked to a messenger channel.")
	public String getExternalMessengerChannelId() {
		return externalMessengerChannelId;
	}

	public void setExternalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
	}

	public ConversationData sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * Custom ID to identify the source of the conversation. Typically used in connection with an external messenger to create a link to the external
	 * conversation.&lt;br&gt; If this ID is specified, it has to be unique for each external channel. Also if the external channel is not used (null), it has to be
	 * unique for this \&quot;null\&quot;
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "Custom ID to identify the source of the conversation. Typically used in connection with an external messenger to create a link to the external conversation.<br> If this ID is specified, it has to be unique for each external channel. Also if the external channel is not used (null), it has to be unique for this \"null\"")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public ConversationData sourceUrl(String sourceUrl) {
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

	public ConversationData endReason(EConversationEndReason endReason) {
		this.endReason = endReason;
		return this;
	}

	/**
	 * Get endReason
	 * 
	 * @return endReason
	 **/
	@ApiModelProperty(value = "")
	public EConversationEndReason getEndReason() {
		return endReason;
	}

	public void setEndReason(EConversationEndReason endReason) {
		this.endReason = endReason;
	}

	public ConversationData initialEngagementUrl(String initialEngagementUrl) {
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

	public ConversationData awaitedPersonType(EAwaitedPersonType awaitedPersonType) {
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

	public ConversationData awaitedPersonTypeChangeTimestamp(Long awaitedPersonTypeChangeTimestamp) {
		this.awaitedPersonTypeChangeTimestamp = awaitedPersonTypeChangeTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the awaited person type last changed.&lt;br&gt; May be null.
	 * 
	 * @return awaitedPersonTypeChangeTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the awaited person type last changed.<br> May be null.")
	public Long getAwaitedPersonTypeChangeTimestamp() {
		return awaitedPersonTypeChangeTimestamp;
	}

	public void setAwaitedPersonTypeChangeTimestamp(Long awaitedPersonTypeChangeTimestamp) {
		this.awaitedPersonTypeChangeTimestamp = awaitedPersonTypeChangeTimestamp;
	}

	public ConversationData _configuration(Map<String, String> _configuration) {
		this._configuration = _configuration;
		return this;
	}

	public ConversationData putConfigurationItem(String key, String _configurationItem) {
		if (this._configuration == null) {
			this._configuration = new HashMap<>();
		}
		this._configuration.put(key, _configurationItem);
		return this;
	}

	/**
	 * The entity&#39;s configuration properties. Only contains values when the &#39;expand&#39; query parameter is used with the value &#39;configuration&#39;. Not
	 * filled in webhook events.
	 * 
	 * @return _configuration
	 **/
	@ApiModelProperty(value = "The entity's configuration properties. Only contains values when the 'expand' query parameter is used with the value 'configuration'. Not filled in webhook events.")
	public Map<String, String> getConfiguration() {
		return _configuration;
	}

	public void setConfiguration(Map<String, String> _configuration) {
		this._configuration = _configuration;
	}

	public ConversationData text(Map<String, Map<String, String>> text) {
		this.text = text;
		return this;
	}

	public ConversationData putTextItem(String key, Map<String, String> textItem) {
		if (this.text == null) {
			this.text = new HashMap<>();
		}
		this.text.put(key, textItem);
		return this;
	}

	/**
	 * The entity&#39;s text properties. Only contains values when the &#39;expand&#39; query parameter is used with the value &#39;text&#39;. Not filled in webhook
	 * events.
	 * 
	 * @return text
	 **/
	@ApiModelProperty(value = "The entity's text properties. Only contains values when the 'expand' query parameter is used with the value 'text'. Not filled in webhook events.")
	public Map<String, Map<String, String>> getText() {
		return text;
	}

	public void setText(Map<String, Map<String, String>> text) {
		this.text = text;
	}

	public ConversationData metadata(Map<String, String> metadata) {
		this.metadata = metadata;
		return this;
	}

	public ConversationData putMetadataItem(String key, String metadataItem) {
		if (this.metadata == null) {
			this.metadata = new HashMap<>();
		}
		this.metadata.put(key, metadataItem);
		return this;
	}

	/**
	 * The entity&#39;s metadata properties. Only contains values when the &#39;expand&#39; query parameter is used with the value &#39;metadata&#39;. Not filled in
	 * webhook events.
	 * 
	 * @return metadata
	 **/
	@ApiModelProperty(value = "The entity's metadata properties. Only contains values when the 'expand' query parameter is used with the value 'metadata'. Not filled in webhook events.")
	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationData conversationData = (ConversationData) o;
		return Objects.equals(this.$type, conversationData.$type) &&
				Objects.equals(this.creationTimestamp, conversationData.creationTimestamp) &&
				Objects.equals(this.endTimestamp, conversationData.endTimestamp) &&
				Objects.equals(this.id, conversationData.id) &&
				Objects.equals(this.accountId, conversationData.accountId) &&
				Objects.equals(this.topic, conversationData.topic) &&
				Objects.equals(this.scheduledTimestamp, conversationData.scheduledTimestamp) &&
				Objects.equals(this.recipient, conversationData.recipient) &&
				Objects.equals(this.participants, conversationData.participants) &&
				Objects.equals(this.assigneePersonId, conversationData.assigneePersonId) &&
				Objects.equals(this.contextPersonId, conversationData.contextPersonId) &&
				Objects.equals(this.state, conversationData.state) &&
				Objects.equals(this.initialEngagementType, conversationData.initialEngagementType) &&
				Objects.equals(this.locale, conversationData.locale) &&
				Objects.equals(this.tokboxSessionId, conversationData.tokboxSessionId) &&
				Objects.equals(this.visitorData, conversationData.visitorData) &&
				Objects.equals(this.conversationTemplateId, conversationData.conversationTemplateId) &&
				Objects.equals(this.links, conversationData.links) &&
				Objects.equals(this.externalMessengerChannelId, conversationData.externalMessengerChannelId) &&
				Objects.equals(this.sourceId, conversationData.sourceId) &&
				Objects.equals(this.sourceUrl, conversationData.sourceUrl) &&
				Objects.equals(this.endReason, conversationData.endReason) &&
				Objects.equals(this.initialEngagementUrl, conversationData.initialEngagementUrl) &&
				Objects.equals(this.awaitedPersonType, conversationData.awaitedPersonType) &&
				Objects.equals(this.awaitedPersonTypeChangeTimestamp, conversationData.awaitedPersonTypeChangeTimestamp) &&
				Objects.equals(this._configuration, conversationData._configuration) &&
				Objects.equals(this.text, conversationData.text) &&
				Objects.equals(this.metadata, conversationData.metadata);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, creationTimestamp, endTimestamp, id, accountId, topic, scheduledTimestamp, recipient, participants, assigneePersonId, contextPersonId, state, initialEngagementType, locale, tokboxSessionId, visitorData, conversationTemplateId, links, externalMessengerChannelId, sourceId, sourceUrl, endReason, initialEngagementUrl, awaitedPersonType, awaitedPersonTypeChangeTimestamp, _configuration, text, metadata);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
		sb.append("    scheduledTimestamp: ").append(toIndentedString(scheduledTimestamp)).append("\n");
		sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
		sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
		sb.append("    assigneePersonId: ").append(toIndentedString(assigneePersonId)).append("\n");
		sb.append("    contextPersonId: ").append(toIndentedString(contextPersonId)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    initialEngagementType: ").append(toIndentedString(initialEngagementType)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    tokboxSessionId: ").append(toIndentedString(tokboxSessionId)).append("\n");
		sb.append("    visitorData: ").append(toIndentedString(visitorData)).append("\n");
		sb.append("    conversationTemplateId: ").append(toIndentedString(conversationTemplateId)).append("\n");
		sb.append("    links: ").append(toIndentedString(links)).append("\n");
		sb.append("    externalMessengerChannelId: ").append(toIndentedString(externalMessengerChannelId)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
		sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
		sb.append("    endReason: ").append(toIndentedString(endReason)).append("\n");
		sb.append("    initialEngagementUrl: ").append(toIndentedString(initialEngagementUrl)).append("\n");
		sb.append("    awaitedPersonType: ").append(toIndentedString(awaitedPersonType)).append("\n");
		sb.append("    awaitedPersonTypeChangeTimestamp: ").append(toIndentedString(awaitedPersonTypeChangeTimestamp)).append("\n");
		sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
