
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
	ConversationData.JSON_PROPERTY_EXTERNAL_PARTICIPANTS,
	ConversationData.JSON_PROPERTY_BOT_PARTICIPANTS,
	ConversationData.JSON_PROPERTY_STATE,
	ConversationData.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE,
	ConversationData.JSON_PROPERTY_CONVERSATION_VISIBILITY,
	ConversationData.JSON_PROPERTY_LOCALE,
	ConversationData.JSON_PROPERTY_TOKBOX_SESSION_ID,
	ConversationData.JSON_PROPERTY_VISITOR_DATA,
	ConversationData.JSON_PROPERTY_CONVERSATION_TEMPLATE_ID,
	ConversationData.JSON_PROPERTY_INHERIT_CONFIGURATION_AND_TEXTS,
	ConversationData.JSON_PROPERTY_LINKS,
	ConversationData.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
	ConversationData.JSON_PROPERTY_SOURCE_ID,
	ConversationData.JSON_PROPERTY_SOURCE_URL,
	ConversationData.JSON_PROPERTY_END_REASON,
	ConversationData.JSON_PROPERTY_INITIAL_ENGAGEMENT_URL,
	ConversationData.JSON_PROPERTY_AWAITED_PERSON_TYPE,
	ConversationData.JSON_PROPERTY_AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP,
	ConversationData.JSON_PROPERTY_METADATA,
	ConversationData.JSON_PROPERTY_CONFIGURATION,
	ConversationData.JSON_PROPERTY_TEXT,
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

	public static final String JSON_PROPERTY_EXTERNAL_PARTICIPANTS = "externalParticipants";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_PARTICIPANTS)
	private List<ExternalParticipantData> externalParticipants = null;

	public static final String JSON_PROPERTY_BOT_PARTICIPANTS = "botParticipants";
	@JsonProperty(JSON_PROPERTY_BOT_PARTICIPANTS)
	private List<BotParticipantData> botParticipants = null;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private EConversationState state;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE = "initialEngagementType";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE)
	private EInitialEngagementType initialEngagementType;

	public static final String JSON_PROPERTY_CONVERSATION_VISIBILITY = "conversationVisibility";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_VISIBILITY)
	private EConversationVisibility conversationVisibility;

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

	public static final String JSON_PROPERTY_INHERIT_CONFIGURATION_AND_TEXTS = "inheritConfigurationAndTexts";
	@JsonProperty(JSON_PROPERTY_INHERIT_CONFIGURATION_AND_TEXTS)
	private Boolean inheritConfigurationAndTexts;

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

	public static final String JSON_PROPERTY_METADATA = "metadata";
	@JsonProperty(JSON_PROPERTY_METADATA)
	private Map<String, String> metadata = null;

	public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
	@JsonProperty(JSON_PROPERTY_CONFIGURATION)
	private Map<String, String> _configuration = null;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private Map<String, Map<String, String>> text = null;

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
	 * Unix timestamp (ms) when the conversation has ended (all participants have finished their offboarding).
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the conversation has ended (all participants have finished their offboarding).")
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
	 * The unique ID of the conversation
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The unique ID of the conversation")
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
	 * The ID of the account the conversation belongs to
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The ID of the account the conversation belongs to")
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
	 * Topic of the conversation
	 * 
	 * @return topic
	 **/
	@ApiModelProperty(value = "Topic of the conversation")
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
	 * Unix timestamp (ms) when the conversation is scheduled for. Only present for conversations with the initial engagement type SCHEDULED_CONVERSATION.
	 * 
	 * @return scheduledTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the conversation is scheduled for. Only present for conversations with the initial engagement type SCHEDULED_CONVERSATION.")
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
	 * The current participants of the conversation
	 * 
	 * @return participants
	 **/
	@ApiModelProperty(value = "The current participants of the conversation")
	public List<ParticipantData> getParticipants() {
		return participants;
	}

	public void setParticipants(List<ParticipantData> participants) {
		this.participants = participants;
	}

	public ConversationData externalParticipants(List<ExternalParticipantData> externalParticipants) {
		this.externalParticipants = externalParticipants;
		return this;
	}

	public ConversationData addExternalParticipantsItem(ExternalParticipantData externalParticipantsItem) {
		if (this.externalParticipants == null) {
			this.externalParticipants = new ArrayList<>();
		}
		this.externalParticipants.add(externalParticipantsItem);
		return this;
	}

	/**
	 * The current participants of the conversation who are connected through an external messenger
	 * 
	 * @return externalParticipants
	 **/
	@ApiModelProperty(value = "The current participants of the conversation who are connected through an external messenger")
	public List<ExternalParticipantData> getExternalParticipants() {
		return externalParticipants;
	}

	public void setExternalParticipants(List<ExternalParticipantData> externalParticipants) {
		this.externalParticipants = externalParticipants;
	}

	public ConversationData botParticipants(List<BotParticipantData> botParticipants) {
		this.botParticipants = botParticipants;
		return this;
	}

	public ConversationData addBotParticipantsItem(BotParticipantData botParticipantsItem) {
		if (this.botParticipants == null) {
			this.botParticipants = new ArrayList<>();
		}
		this.botParticipants.add(botParticipantsItem);
		return this;
	}

	/**
	 * The current bots of the conversation
	 * 
	 * @return botParticipants
	 **/
	@ApiModelProperty(value = "The current bots of the conversation")
	public List<BotParticipantData> getBotParticipants() {
		return botParticipants;
	}

	public void setBotParticipants(List<BotParticipantData> botParticipants) {
		this.botParticipants = botParticipants;
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

	public ConversationData conversationVisibility(EConversationVisibility conversationVisibility) {
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
	 * Tokbox session ID
	 * 
	 * @return tokboxSessionId
	 **/
	@ApiModelProperty(value = "Tokbox session ID")
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
	 * Custom data for the visitor. This has no specific format.
	 * 
	 * @return visitorData
	 **/
	@ApiModelProperty(value = "Custom data for the visitor. This has no specific format.")
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
	 * Template ID that this conversation is based on
	 * 
	 * @return conversationTemplateId
	 **/
	@ApiModelProperty(value = "Template ID that this conversation is based on")
	public String getConversationTemplateId() {
		return conversationTemplateId;
	}

	public void setConversationTemplateId(String conversationTemplateId) {
		this.conversationTemplateId = conversationTemplateId;
	}

	public ConversationData inheritConfigurationAndTexts(Boolean inheritConfigurationAndTexts) {
		this.inheritConfigurationAndTexts = inheritConfigurationAndTexts;
		return this;
	}

	/**
	 * True if the conversation inherits all configuration and texts from its conversation template. If omitted, the value based
	 * on&#x60;ConversationTemplate.inheritConfigurationAndTexts&#x60; will be used.
	 * 
	 * @return inheritConfigurationAndTexts
	 **/
	@ApiModelProperty(value = "True if the conversation inherits all configuration and texts from its conversation template. If omitted, the value based on`ConversationTemplate.inheritConfigurationAndTexts` will be used.")
	public Boolean isInheritConfigurationAndTexts() {
		return inheritConfigurationAndTexts;
	}

	public void setInheritConfigurationAndTexts(Boolean inheritConfigurationAndTexts) {
		this.inheritConfigurationAndTexts = inheritConfigurationAndTexts;
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
	 * Links to open the conversation
	 * 
	 * @return links
	 **/
	@ApiModelProperty(value = "Links to open the conversation")
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
	 * ID of the external messenger channel the conversation is linked to. If this property is null the conversation is an Unblu conversation and not linked to a
	 * messenger channel.
	 * 
	 * @return externalMessengerChannelId
	 **/
	@ApiModelProperty(value = "ID of the external messenger channel the conversation is linked to. If this property is null the conversation is an Unblu conversation and not linked to a messenger channel.")
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
	 * Custom ID to identify the source of the conversation. Typically used in connection with an external messenger to create a link to the external conversation.
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "Custom ID to identify the source of the conversation. Typically used in connection with an external messenger to create a link to the external conversation.")
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
	 * Unix timestamp (ms) when the awaited person type last changed
	 * 
	 * @return awaitedPersonTypeChangeTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the awaited person type last changed")
	public Long getAwaitedPersonTypeChangeTimestamp() {
		return awaitedPersonTypeChangeTimestamp;
	}

	public void setAwaitedPersonTypeChangeTimestamp(Long awaitedPersonTypeChangeTimestamp) {
		this.awaitedPersonTypeChangeTimestamp = awaitedPersonTypeChangeTimestamp;
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
				Objects.equals(this.externalParticipants, conversationData.externalParticipants) &&
				Objects.equals(this.botParticipants, conversationData.botParticipants) &&
				Objects.equals(this.state, conversationData.state) &&
				Objects.equals(this.initialEngagementType, conversationData.initialEngagementType) &&
				Objects.equals(this.conversationVisibility, conversationData.conversationVisibility) &&
				Objects.equals(this.locale, conversationData.locale) &&
				Objects.equals(this.tokboxSessionId, conversationData.tokboxSessionId) &&
				Objects.equals(this.visitorData, conversationData.visitorData) &&
				Objects.equals(this.conversationTemplateId, conversationData.conversationTemplateId) &&
				Objects.equals(this.inheritConfigurationAndTexts, conversationData.inheritConfigurationAndTexts) &&
				Objects.equals(this.links, conversationData.links) &&
				Objects.equals(this.externalMessengerChannelId, conversationData.externalMessengerChannelId) &&
				Objects.equals(this.sourceId, conversationData.sourceId) &&
				Objects.equals(this.sourceUrl, conversationData.sourceUrl) &&
				Objects.equals(this.endReason, conversationData.endReason) &&
				Objects.equals(this.initialEngagementUrl, conversationData.initialEngagementUrl) &&
				Objects.equals(this.awaitedPersonType, conversationData.awaitedPersonType) &&
				Objects.equals(this.awaitedPersonTypeChangeTimestamp, conversationData.awaitedPersonTypeChangeTimestamp) &&
				Objects.equals(this.metadata, conversationData.metadata) &&
				Objects.equals(this._configuration, conversationData._configuration) &&
				Objects.equals(this.text, conversationData.text);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, creationTimestamp, endTimestamp, id, accountId, topic, scheduledTimestamp, recipient, participants, externalParticipants, botParticipants, state, initialEngagementType, conversationVisibility, locale, tokboxSessionId, visitorData, conversationTemplateId, inheritConfigurationAndTexts, links, externalMessengerChannelId, sourceId, sourceUrl, endReason, initialEngagementUrl, awaitedPersonType, awaitedPersonTypeChangeTimestamp, metadata, _configuration, text);
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
		sb.append("    externalParticipants: ").append(toIndentedString(externalParticipants)).append("\n");
		sb.append("    botParticipants: ").append(toIndentedString(botParticipants)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    initialEngagementType: ").append(toIndentedString(initialEngagementType)).append("\n");
		sb.append("    conversationVisibility: ").append(toIndentedString(conversationVisibility)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    tokboxSessionId: ").append(toIndentedString(tokboxSessionId)).append("\n");
		sb.append("    visitorData: ").append(toIndentedString(visitorData)).append("\n");
		sb.append("    conversationTemplateId: ").append(toIndentedString(conversationTemplateId)).append("\n");
		sb.append("    inheritConfigurationAndTexts: ").append(toIndentedString(inheritConfigurationAndTexts)).append("\n");
		sb.append("    links: ").append(toIndentedString(links)).append("\n");
		sb.append("    externalMessengerChannelId: ").append(toIndentedString(externalMessengerChannelId)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
		sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
		sb.append("    endReason: ").append(toIndentedString(endReason)).append("\n");
		sb.append("    initialEngagementUrl: ").append(toIndentedString(initialEngagementUrl)).append("\n");
		sb.append("    awaitedPersonType: ").append(toIndentedString(awaitedPersonType)).append("\n");
		sb.append("    awaitedPersonTypeChangeTimestamp: ").append(toIndentedString(awaitedPersonTypeChangeTimestamp)).append("\n");
		sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
		sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
