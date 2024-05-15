
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
 * Data for creating a new conversation
 */
@ApiModel(description = "Data for creating a new conversation")

@JsonPropertyOrder({
	ConversationCreationData.JSON_PROPERTY_$_TYPE,
	ConversationCreationData.JSON_PROPERTY_TOPIC,
	ConversationCreationData.JSON_PROPERTY_SCHEDULED_TIMESTAMP,
	ConversationCreationData.JSON_PROPERTY_RECIPIENT,
	ConversationCreationData.JSON_PROPERTY_PARTICIPANTS,
	ConversationCreationData.JSON_PROPERTY_EXTERNAL_PARTICIPANTS,
	ConversationCreationData.JSON_PROPERTY_BOT_PARTICIPANTS,
	ConversationCreationData.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE,
	ConversationCreationData.JSON_PROPERTY_CONVERSATION_VISIBILITY,
	ConversationCreationData.JSON_PROPERTY_LOCALE,
	ConversationCreationData.JSON_PROPERTY_VISITOR_DATA,
	ConversationCreationData.JSON_PROPERTY_CONVERSATION_TEMPLATE_ID,
	ConversationCreationData.JSON_PROPERTY_INHERIT_CONFIGURATION_AND_TEXTS,
	ConversationCreationData.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
	ConversationCreationData.JSON_PROPERTY_SOURCE_ID,
	ConversationCreationData.JSON_PROPERTY_SOURCE_URL,
	ConversationCreationData.JSON_PROPERTY_INITIAL_ENGAGEMENT_URL,
	ConversationCreationData.JSON_PROPERTY_METADATA,
	ConversationCreationData.JSON_PROPERTY_CONFIGURATION,
	ConversationCreationData.JSON_PROPERTY_TEXT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationCreationData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONCREATIONDATA("ConversationCreationData");

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
			return TypeEnum.CONVERSATIONCREATIONDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONCREATIONDATA;

	public static final String JSON_PROPERTY_TOPIC = "topic";
	@JsonProperty(JSON_PROPERTY_TOPIC)
	private String topic;

	public static final String JSON_PROPERTY_SCHEDULED_TIMESTAMP = "scheduledTimestamp";
	@JsonProperty(JSON_PROPERTY_SCHEDULED_TIMESTAMP)
	private Long scheduledTimestamp;

	public static final String JSON_PROPERTY_RECIPIENT = "recipient";
	@JsonProperty(JSON_PROPERTY_RECIPIENT)
	private ConversationCreationRecipientData recipient = null;

	public static final String JSON_PROPERTY_PARTICIPANTS = "participants";
	@JsonProperty(JSON_PROPERTY_PARTICIPANTS)
	private List<ConversationCreationParticipantData> participants = null;

	public static final String JSON_PROPERTY_EXTERNAL_PARTICIPANTS = "externalParticipants";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_PARTICIPANTS)
	private List<ConversationCreationExternalParticipantData> externalParticipants = null;

	public static final String JSON_PROPERTY_BOT_PARTICIPANTS = "botParticipants";
	@JsonProperty(JSON_PROPERTY_BOT_PARTICIPANTS)
	private List<ConversationCreationBotParticipantData> botParticipants = null;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE = "initialEngagementType";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE)
	private EInitialEngagementType initialEngagementType;

	public static final String JSON_PROPERTY_CONVERSATION_VISIBILITY = "conversationVisibility";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_VISIBILITY)
	private EConversationVisibility conversationVisibility;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public static final String JSON_PROPERTY_VISITOR_DATA = "visitorData";
	@JsonProperty(JSON_PROPERTY_VISITOR_DATA)
	private String visitorData;

	public static final String JSON_PROPERTY_CONVERSATION_TEMPLATE_ID = "conversationTemplateId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_TEMPLATE_ID)
	private String conversationTemplateId;

	public static final String JSON_PROPERTY_INHERIT_CONFIGURATION_AND_TEXTS = "inheritConfigurationAndTexts";
	@JsonProperty(JSON_PROPERTY_INHERIT_CONFIGURATION_AND_TEXTS)
	private Boolean inheritConfigurationAndTexts;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID = "externalMessengerChannelId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID)
	private String externalMessengerChannelId;

	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public static final String JSON_PROPERTY_SOURCE_URL = "sourceUrl";
	@JsonProperty(JSON_PROPERTY_SOURCE_URL)
	private String sourceUrl;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_URL = "initialEngagementUrl";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_URL)
	private String initialEngagementUrl;

	public static final String JSON_PROPERTY_METADATA = "metadata";
	@JsonProperty(JSON_PROPERTY_METADATA)
	private Map<String, String> metadata = null;

	public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
	@JsonProperty(JSON_PROPERTY_CONFIGURATION)
	private Map<String, String> _configuration = null;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private Map<String, Map<String, String>> text = null;

	public ConversationCreationData $type(TypeEnum $type) {
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

	public ConversationCreationData topic(String topic) {
		this.topic = topic;
		return this;
	}

	/**
	 * Topic of the conversation. Optional unless the initial engagement type is &#x60;EInitialEngagementType.SCHEDULED_CONVERSATION&#x60;, in which case it&#39;s
	 * mandatory.
	 * 
	 * @return topic
	 **/
	@ApiModelProperty(value = "Topic of the conversation. Optional unless the initial engagement type is `EInitialEngagementType.SCHEDULED_CONVERSATION`, in which case it's mandatory.")
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public ConversationCreationData scheduledTimestamp(Long scheduledTimestamp) {
		this.scheduledTimestamp = scheduledTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the conversation is scheduled. Can only be set for conversations with the initial engagement
	 * type&#x60;EInitialEngagementType.SCHEDULED_CONVERSATION&#x60;.
	 * 
	 * @return scheduledTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the conversation is scheduled. Can only be set for conversations with the initial engagement type`EInitialEngagementType.SCHEDULED_CONVERSATION`.")
	public Long getScheduledTimestamp() {
		return scheduledTimestamp;
	}

	public void setScheduledTimestamp(Long scheduledTimestamp) {
		this.scheduledTimestamp = scheduledTimestamp;
	}

	public ConversationCreationData recipient(ConversationCreationRecipientData recipient) {
		this.recipient = recipient;
		return this;
	}

	/**
	 * Get recipient
	 * 
	 * @return recipient
	 **/
	@ApiModelProperty(value = "")
	public ConversationCreationRecipientData getRecipient() {
		return recipient;
	}

	public void setRecipient(ConversationCreationRecipientData recipient) {
		this.recipient = recipient;
	}

	public ConversationCreationData participants(List<ConversationCreationParticipantData> participants) {
		this.participants = participants;
		return this;
	}

	public ConversationCreationData addParticipantsItem(ConversationCreationParticipantData participantsItem) {
		if (this.participants == null) {
			this.participants = new ArrayList<>();
		}
		this.participants.add(participantsItem);
		return this;
	}

	/**
	 * Participants taking part in the conversation through Unblu. There must be at least one participant in this list or in the &#x60;externalParticipants&#x60;
	 * list.
	 * 
	 * @return participants
	 **/
	@ApiModelProperty(value = "Participants taking part in the conversation through Unblu. There must be at least one participant in this list or in the `externalParticipants` list.")
	public List<ConversationCreationParticipantData> getParticipants() {
		return participants;
	}

	public void setParticipants(List<ConversationCreationParticipantData> participants) {
		this.participants = participants;
	}

	public ConversationCreationData externalParticipants(List<ConversationCreationExternalParticipantData> externalParticipants) {
		this.externalParticipants = externalParticipants;
		return this;
	}

	public ConversationCreationData addExternalParticipantsItem(ConversationCreationExternalParticipantData externalParticipantsItem) {
		if (this.externalParticipants == null) {
			this.externalParticipants = new ArrayList<>();
		}
		this.externalParticipants.add(externalParticipantsItem);
		return this;
	}

	/**
	 * Participants taking part in the conversation through an external messenger. There must be at least one participant in this list or in
	 * the&#x60;participants&#x60; list. It must be omitted if &#x60;externalMessengerChannelId&#x60; is not set.
	 * 
	 * @return externalParticipants
	 **/
	@ApiModelProperty(value = "Participants taking part in the conversation through an external messenger. There must be at least one participant in this list or in the`participants` list. It must be omitted if `externalMessengerChannelId` is not set.")
	public List<ConversationCreationExternalParticipantData> getExternalParticipants() {
		return externalParticipants;
	}

	public void setExternalParticipants(List<ConversationCreationExternalParticipantData> externalParticipants) {
		this.externalParticipants = externalParticipants;
	}

	public ConversationCreationData botParticipants(List<ConversationCreationBotParticipantData> botParticipants) {
		this.botParticipants = botParticipants;
		return this;
	}

	public ConversationCreationData addBotParticipantsItem(ConversationCreationBotParticipantData botParticipantsItem) {
		if (this.botParticipants == null) {
			this.botParticipants = new ArrayList<>();
		}
		this.botParticipants.add(botParticipantsItem);
		return this;
	}

	/**
	 * Bots taking part in the conversation. Optional.
	 * 
	 * @return botParticipants
	 **/
	@ApiModelProperty(value = "Bots taking part in the conversation. Optional.")
	public List<ConversationCreationBotParticipantData> getBotParticipants() {
		return botParticipants;
	}

	public void setBotParticipants(List<ConversationCreationBotParticipantData> botParticipants) {
		this.botParticipants = botParticipants;
	}

	public ConversationCreationData initialEngagementType(EInitialEngagementType initialEngagementType) {
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

	public ConversationCreationData conversationVisibility(EConversationVisibility conversationVisibility) {
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

	public ConversationCreationData locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * The locale of the conversation language as a BCP 47 language tag, including the region if available. Optional, if not provided, the account default locale
	 * will be used.
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "The locale of the conversation language as a BCP 47 language tag, including the region if available. Optional, if not provided, the account default locale will be used.")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public ConversationCreationData visitorData(String visitorData) {
		this.visitorData = visitorData;
		return this;
	}

	/**
	 * Custom data for the visitor. This has no specific format. Optional.
	 * 
	 * @return visitorData
	 **/
	@ApiModelProperty(value = "Custom data for the visitor. This has no specific format. Optional.")
	public String getVisitorData() {
		return visitorData;
	}

	public void setVisitorData(String visitorData) {
		this.visitorData = visitorData;
	}

	public ConversationCreationData conversationTemplateId(String conversationTemplateId) {
		this.conversationTemplateId = conversationTemplateId;
		return this;
	}

	/**
	 * Template ID of the conversation. If omitted, the default conversation template is retrieved based on the initial engagement type. If provided the value
	 * of&#x60;initialEngagementType&#x60; has to match the initial engagement type of the template.
	 * 
	 * @return conversationTemplateId
	 **/
	@ApiModelProperty(value = "Template ID of the conversation. If omitted, the default conversation template is retrieved based on the initial engagement type. If provided the value of`initialEngagementType` has to match the initial engagement type of the template.")
	public String getConversationTemplateId() {
		return conversationTemplateId;
	}

	public void setConversationTemplateId(String conversationTemplateId) {
		this.conversationTemplateId = conversationTemplateId;
	}

	public ConversationCreationData inheritConfigurationAndTexts(Boolean inheritConfigurationAndTexts) {
		this.inheritConfigurationAndTexts = inheritConfigurationAndTexts;
		return this;
	}

	/**
	 * True if the conversation inherits all configuration and text properties from its conversation template. If omitted, the
	 * value&#x60;ConversationTemplate.inheritConfigurationAndTexts&#x60; from its conversation template is used.
	 * 
	 * @return inheritConfigurationAndTexts
	 **/
	@ApiModelProperty(value = "True if the conversation inherits all configuration and text properties from its conversation template. If omitted, the value`ConversationTemplate.inheritConfigurationAndTexts` from its conversation template is used.")
	public Boolean isInheritConfigurationAndTexts() {
		return inheritConfigurationAndTexts;
	}

	public void setInheritConfigurationAndTexts(Boolean inheritConfigurationAndTexts) {
		this.inheritConfigurationAndTexts = inheritConfigurationAndTexts;
	}

	public ConversationCreationData externalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
		return this;
	}

	/**
	 * ID of the external messenger channel the conversation should be linked to. If this property is null the conversation is an Unblu conversation and not linked
	 * to an external messenger channel.
	 * 
	 * @return externalMessengerChannelId
	 **/
	@ApiModelProperty(value = "ID of the external messenger channel the conversation should be linked to. If this property is null the conversation is an Unblu conversation and not linked to an external messenger channel.")
	public String getExternalMessengerChannelId() {
		return externalMessengerChannelId;
	}

	public void setExternalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
	}

	public ConversationCreationData sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * Custom ID to identify the source of the conversation. Typically used in connection with an external messenger to create a link to the external
	 * conversation.&lt;br&gt; If this ID is specified, it has to be unique for each external channel. Even if the external channel is not used (null), the custom
	 * ID must be unique for this \&quot;null\&quot;.
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "Custom ID to identify the source of the conversation. Typically used in connection with an external messenger to create a link to the external conversation.<br> If this ID is specified, it has to be unique for each external channel. Even if the external channel is not used (null), the custom ID must be unique for this \"null\".")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public ConversationCreationData sourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
		return this;
	}

	/**
	 * URL identifying the system where the conversation was created, for example a CRM. Optional.
	 * 
	 * @return sourceUrl
	 **/
	@ApiModelProperty(value = "URL identifying the system where the conversation was created, for example a CRM. Optional.")
	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public ConversationCreationData initialEngagementUrl(String initialEngagementUrl) {
		this.initialEngagementUrl = initialEngagementUrl;
		return this;
	}

	/**
	 * The URL where the conversation originated. Optional.
	 * 
	 * @return initialEngagementUrl
	 **/
	@ApiModelProperty(value = "The URL where the conversation originated. Optional.")
	public String getInitialEngagementUrl() {
		return initialEngagementUrl;
	}

	public void setInitialEngagementUrl(String initialEngagementUrl) {
		this.initialEngagementUrl = initialEngagementUrl;
	}

	public ConversationCreationData metadata(Map<String, String> metadata) {
		this.metadata = metadata;
		return this;
	}

	public ConversationCreationData putMetadataItem(String key, String metadataItem) {
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

	public ConversationCreationData _configuration(Map<String, String> _configuration) {
		this._configuration = _configuration;
		return this;
	}

	public ConversationCreationData putConfigurationItem(String key, String _configurationItem) {
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

	public ConversationCreationData text(Map<String, Map<String, String>> text) {
		this.text = text;
		return this;
	}

	public ConversationCreationData putTextItem(String key, Map<String, String> textItem) {
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
		ConversationCreationData conversationCreationData = (ConversationCreationData) o;
		return Objects.equals(this.$type, conversationCreationData.$type) &&
				Objects.equals(this.topic, conversationCreationData.topic) &&
				Objects.equals(this.scheduledTimestamp, conversationCreationData.scheduledTimestamp) &&
				Objects.equals(this.recipient, conversationCreationData.recipient) &&
				Objects.equals(this.participants, conversationCreationData.participants) &&
				Objects.equals(this.externalParticipants, conversationCreationData.externalParticipants) &&
				Objects.equals(this.botParticipants, conversationCreationData.botParticipants) &&
				Objects.equals(this.initialEngagementType, conversationCreationData.initialEngagementType) &&
				Objects.equals(this.conversationVisibility, conversationCreationData.conversationVisibility) &&
				Objects.equals(this.locale, conversationCreationData.locale) &&
				Objects.equals(this.visitorData, conversationCreationData.visitorData) &&
				Objects.equals(this.conversationTemplateId, conversationCreationData.conversationTemplateId) &&
				Objects.equals(this.inheritConfigurationAndTexts, conversationCreationData.inheritConfigurationAndTexts) &&
				Objects.equals(this.externalMessengerChannelId, conversationCreationData.externalMessengerChannelId) &&
				Objects.equals(this.sourceId, conversationCreationData.sourceId) &&
				Objects.equals(this.sourceUrl, conversationCreationData.sourceUrl) &&
				Objects.equals(this.initialEngagementUrl, conversationCreationData.initialEngagementUrl) &&
				Objects.equals(this.metadata, conversationCreationData.metadata) &&
				Objects.equals(this._configuration, conversationCreationData._configuration) &&
				Objects.equals(this.text, conversationCreationData.text);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, topic, scheduledTimestamp, recipient, participants, externalParticipants, botParticipants, initialEngagementType, conversationVisibility, locale, visitorData, conversationTemplateId, inheritConfigurationAndTexts, externalMessengerChannelId, sourceId, sourceUrl, initialEngagementUrl, metadata, _configuration, text);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationCreationData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
		sb.append("    scheduledTimestamp: ").append(toIndentedString(scheduledTimestamp)).append("\n");
		sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
		sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
		sb.append("    externalParticipants: ").append(toIndentedString(externalParticipants)).append("\n");
		sb.append("    botParticipants: ").append(toIndentedString(botParticipants)).append("\n");
		sb.append("    initialEngagementType: ").append(toIndentedString(initialEngagementType)).append("\n");
		sb.append("    conversationVisibility: ").append(toIndentedString(conversationVisibility)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    visitorData: ").append(toIndentedString(visitorData)).append("\n");
		sb.append("    conversationTemplateId: ").append(toIndentedString(conversationTemplateId)).append("\n");
		sb.append("    inheritConfigurationAndTexts: ").append(toIndentedString(inheritConfigurationAndTexts)).append("\n");
		sb.append("    externalMessengerChannelId: ").append(toIndentedString(externalMessengerChannelId)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
		sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
		sb.append("    initialEngagementUrl: ").append(toIndentedString(initialEngagementUrl)).append("\n");
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
