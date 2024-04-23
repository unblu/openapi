
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
 * History information about a conversation
 */
@ApiModel(description = "History information about a conversation")

@JsonPropertyOrder({
	ConversationHistoryData.JSON_PROPERTY_$_TYPE,
	ConversationHistoryData.JSON_PROPERTY_ID,
	ConversationHistoryData.JSON_PROPERTY_RECIPIENT,
	ConversationHistoryData.JSON_PROPERTY_END_PERSON,
	ConversationHistoryData.JSON_PROPERTY_PARTICIPANTS,
	ConversationHistoryData.JSON_PROPERTY_EXTERNAL_PARTICIPANTS,
	ConversationHistoryData.JSON_PROPERTY_BOT_PARTICIPANTS,
	ConversationHistoryData.JSON_PROPERTY_CREATED_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_ASSIGNEE_JOIN_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_END_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_LAST_MESSAGE_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_LAST_COMPLETED_RECORDING_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_STATE,
	ConversationHistoryData.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE,
	ConversationHistoryData.JSON_PROPERTY_LOCALE,
	ConversationHistoryData.JSON_PROPERTY_END_REASON,
	ConversationHistoryData.JSON_PROPERTY_END_COMMENT,
	ConversationHistoryData.JSON_PROPERTY_TOKBOX_SESSION_ID,
	ConversationHistoryData.JSON_PROPERTY_CONVERSATION_TEMPLATE_ID,
	ConversationHistoryData.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ICON_ID,
	ConversationHistoryData.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_NAME,
	ConversationHistoryData.JSON_PROPERTY_TOPIC,
	ConversationHistoryData.JSON_PROPERTY_SOURCE_URL,
	ConversationHistoryData.JSON_PROPERTY_SCHEDULED_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_DUE_DELETION_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_INITIAL_ENGAGEMENT_URL,
	ConversationHistoryData.JSON_PROPERTY_AWAITED_PERSON_TYPE,
	ConversationHistoryData.JSON_PROPERTY_AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_CONVERSATION_VISIBILITY,
	ConversationHistoryData.JSON_PROPERTY_STATE_CHANGES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationHistoryData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONHISTORYDATA("ConversationHistoryData");

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
			return TypeEnum.CONVERSATIONHISTORYDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONHISTORYDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_RECIPIENT = "recipient";
	@JsonProperty(JSON_PROPERTY_RECIPIENT)
	private ConversationRecipientData recipient = null;

	public static final String JSON_PROPERTY_END_PERSON = "endPerson";
	@JsonProperty(JSON_PROPERTY_END_PERSON)
	private PersonData endPerson = null;

	public static final String JSON_PROPERTY_PARTICIPANTS = "participants";
	@JsonProperty(JSON_PROPERTY_PARTICIPANTS)
	private List<ParticipantHistoryData> participants = null;

	public static final String JSON_PROPERTY_EXTERNAL_PARTICIPANTS = "externalParticipants";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_PARTICIPANTS)
	private List<ExternalParticipantHistoryData> externalParticipants = null;

	public static final String JSON_PROPERTY_BOT_PARTICIPANTS = "botParticipants";
	@JsonProperty(JSON_PROPERTY_BOT_PARTICIPANTS)
	private List<BotParticipantHistoryData> botParticipants = null;

	public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATED_TIMESTAMP)
	private Long createdTimestamp;

	public static final String JSON_PROPERTY_ASSIGNEE_JOIN_TIMESTAMP = "assigneeJoinTimestamp";
	@JsonProperty(JSON_PROPERTY_ASSIGNEE_JOIN_TIMESTAMP)
	private Long assigneeJoinTimestamp;

	public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
	@JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
	private Long endTimestamp;

	public static final String JSON_PROPERTY_LAST_MESSAGE_TIMESTAMP = "lastMessageTimestamp";
	@JsonProperty(JSON_PROPERTY_LAST_MESSAGE_TIMESTAMP)
	private Long lastMessageTimestamp;

	public static final String JSON_PROPERTY_LAST_COMPLETED_RECORDING_TIMESTAMP = "lastCompletedRecordingTimestamp";
	@JsonProperty(JSON_PROPERTY_LAST_COMPLETED_RECORDING_TIMESTAMP)
	private Long lastCompletedRecordingTimestamp;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private EConversationState state;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE = "initialEngagementType";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE)
	private EInitialEngagementType initialEngagementType;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public static final String JSON_PROPERTY_END_REASON = "endReason";
	@JsonProperty(JSON_PROPERTY_END_REASON)
	private EConversationEndReason endReason;

	public static final String JSON_PROPERTY_END_COMMENT = "endComment";
	@JsonProperty(JSON_PROPERTY_END_COMMENT)
	private String endComment;

	public static final String JSON_PROPERTY_TOKBOX_SESSION_ID = "tokboxSessionId";
	@JsonProperty(JSON_PROPERTY_TOKBOX_SESSION_ID)
	private String tokboxSessionId;

	public static final String JSON_PROPERTY_CONVERSATION_TEMPLATE_ID = "conversationTemplateId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_TEMPLATE_ID)
	private String conversationTemplateId;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ICON_ID = "externalMessengerChannelIconId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ICON_ID)
	private String externalMessengerChannelIconId;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_NAME = "externalMessengerChannelName";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_NAME)
	private String externalMessengerChannelName;

	public static final String JSON_PROPERTY_TOPIC = "topic";
	@JsonProperty(JSON_PROPERTY_TOPIC)
	private String topic;

	public static final String JSON_PROPERTY_SOURCE_URL = "sourceUrl";
	@JsonProperty(JSON_PROPERTY_SOURCE_URL)
	private String sourceUrl;

	public static final String JSON_PROPERTY_SCHEDULED_TIMESTAMP = "scheduledTimestamp";
	@JsonProperty(JSON_PROPERTY_SCHEDULED_TIMESTAMP)
	private Long scheduledTimestamp;

	public static final String JSON_PROPERTY_DUE_DELETION_TIMESTAMP = "dueDeletionTimestamp";
	@JsonProperty(JSON_PROPERTY_DUE_DELETION_TIMESTAMP)
	private Long dueDeletionTimestamp;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_URL = "initialEngagementUrl";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_URL)
	private String initialEngagementUrl;

	public static final String JSON_PROPERTY_AWAITED_PERSON_TYPE = "awaitedPersonType";
	@JsonProperty(JSON_PROPERTY_AWAITED_PERSON_TYPE)
	private EAwaitedPersonType awaitedPersonType;

	public static final String JSON_PROPERTY_AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP = "awaitedPersonTypeChangeTimestamp";
	@JsonProperty(JSON_PROPERTY_AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP)
	private Long awaitedPersonTypeChangeTimestamp;

	public static final String JSON_PROPERTY_CONVERSATION_VISIBILITY = "conversationVisibility";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_VISIBILITY)
	private EConversationVisibility conversationVisibility;

	public static final String JSON_PROPERTY_STATE_CHANGES = "stateChanges";
	@JsonProperty(JSON_PROPERTY_STATE_CHANGES)
	private List<ConversationStateChangeData> stateChanges = null;

	public ConversationHistoryData $type(TypeEnum $type) {
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

	public ConversationHistoryData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Id of the conversation
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Id of the conversation")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ConversationHistoryData recipient(ConversationRecipientData recipient) {
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

	public ConversationHistoryData endPerson(PersonData endPerson) {
		this.endPerson = endPerson;
		return this;
	}

	/**
	 * Get endPerson
	 * 
	 * @return endPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getEndPerson() {
		return endPerson;
	}

	public void setEndPerson(PersonData endPerson) {
		this.endPerson = endPerson;
	}

	public ConversationHistoryData participants(List<ParticipantHistoryData> participants) {
		this.participants = participants;
		return this;
	}

	public ConversationHistoryData addParticipantsItem(ParticipantHistoryData participantsItem) {
		if (this.participants == null) {
			this.participants = new ArrayList<>();
		}
		this.participants.add(participantsItem);
		return this;
	}

	/**
	 * The (current and earlier) participants of the conversation
	 * 
	 * @return participants
	 **/
	@ApiModelProperty(value = "The (current and earlier) participants of the conversation")
	public List<ParticipantHistoryData> getParticipants() {
		return participants;
	}

	public void setParticipants(List<ParticipantHistoryData> participants) {
		this.participants = participants;
	}

	public ConversationHistoryData externalParticipants(List<ExternalParticipantHistoryData> externalParticipants) {
		this.externalParticipants = externalParticipants;
		return this;
	}

	public ConversationHistoryData addExternalParticipantsItem(ExternalParticipantHistoryData externalParticipantsItem) {
		if (this.externalParticipants == null) {
			this.externalParticipants = new ArrayList<>();
		}
		this.externalParticipants.add(externalParticipantsItem);
		return this;
	}

	/**
	 * The (current and earlier) participants of the conversation who are connected through an external messenger
	 * 
	 * @return externalParticipants
	 **/
	@ApiModelProperty(value = "The (current and earlier) participants of the conversation who are connected through an external messenger")
	public List<ExternalParticipantHistoryData> getExternalParticipants() {
		return externalParticipants;
	}

	public void setExternalParticipants(List<ExternalParticipantHistoryData> externalParticipants) {
		this.externalParticipants = externalParticipants;
	}

	public ConversationHistoryData botParticipants(List<BotParticipantHistoryData> botParticipants) {
		this.botParticipants = botParticipants;
		return this;
	}

	public ConversationHistoryData addBotParticipantsItem(BotParticipantHistoryData botParticipantsItem) {
		if (this.botParticipants == null) {
			this.botParticipants = new ArrayList<>();
		}
		this.botParticipants.add(botParticipantsItem);
		return this;
	}

	/**
	 * The (current and earlier) bots of the conversation
	 * 
	 * @return botParticipants
	 **/
	@ApiModelProperty(value = "The (current and earlier) bots of the conversation")
	public List<BotParticipantHistoryData> getBotParticipants() {
		return botParticipants;
	}

	public void setBotParticipants(List<BotParticipantHistoryData> botParticipants) {
		this.botParticipants = botParticipants;
	}

	public ConversationHistoryData createdTimestamp(Long createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the conversation was created (timestamp when the state was set to &#x60;EConversationState.CREATED&#x60;)
	 * 
	 * @return createdTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the conversation was created (timestamp when the state was set to `EConversationState.CREATED`)")
	public Long getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Long createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public ConversationHistoryData assigneeJoinTimestamp(Long assigneeJoinTimestamp) {
		this.assigneeJoinTimestamp = assigneeJoinTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the assignee joined the conversation (timestamp when the state of the first agent participant was set
	 * to&#x60;EConversationParticipationState.ACTIVE&#x60;) Value is null of no assignee has joined yet.
	 * 
	 * @return assigneeJoinTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the assignee joined the conversation (timestamp when the state of the first agent participant was set to`EConversationParticipationState.ACTIVE`) Value is null of no assignee has joined yet.")
	public Long getAssigneeJoinTimestamp() {
		return assigneeJoinTimestamp;
	}

	public void setAssigneeJoinTimestamp(Long assigneeJoinTimestamp) {
		this.assigneeJoinTimestamp = assigneeJoinTimestamp;
	}

	public ConversationHistoryData endTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the conversation has ended (all active participants have finished their offboarding; timestamp when the state was set
	 * to&#x60;EConversationState.ENDED&#x60;)
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the conversation has ended (all active participants have finished their offboarding; timestamp when the state was set to`EConversationState.ENDED`)")
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public ConversationHistoryData lastMessageTimestamp(Long lastMessageTimestamp) {
		this.lastMessageTimestamp = lastMessageTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the last conversation message was sent. Null if there hasn&#39;t been any yet.
	 * 
	 * @return lastMessageTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the last conversation message was sent. Null if there hasn't been any yet.")
	public Long getLastMessageTimestamp() {
		return lastMessageTimestamp;
	}

	public void setLastMessageTimestamp(Long lastMessageTimestamp) {
		this.lastMessageTimestamp = lastMessageTimestamp;
	}

	public ConversationHistoryData lastCompletedRecordingTimestamp(Long lastCompletedRecordingTimestamp) {
		this.lastCompletedRecordingTimestamp = lastCompletedRecordingTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the last recording was completed. Null if there hasn&#39;t been any yet.
	 * 
	 * @return lastCompletedRecordingTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the last recording was completed. Null if there hasn't been any yet.")
	public Long getLastCompletedRecordingTimestamp() {
		return lastCompletedRecordingTimestamp;
	}

	public void setLastCompletedRecordingTimestamp(Long lastCompletedRecordingTimestamp) {
		this.lastCompletedRecordingTimestamp = lastCompletedRecordingTimestamp;
	}

	public ConversationHistoryData state(EConversationState state) {
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

	public ConversationHistoryData initialEngagementType(EInitialEngagementType initialEngagementType) {
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

	public ConversationHistoryData locale(String locale) {
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

	public ConversationHistoryData endReason(EConversationEndReason endReason) {
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

	public ConversationHistoryData endComment(String endComment) {
		this.endComment = endComment;
		return this;
	}

	/**
	 * Get endComment
	 * 
	 * @return endComment
	 **/
	@ApiModelProperty(value = "")
	public String getEndComment() {
		return endComment;
	}

	public void setEndComment(String endComment) {
		this.endComment = endComment;
	}

	public ConversationHistoryData tokboxSessionId(String tokboxSessionId) {
		this.tokboxSessionId = tokboxSessionId;
		return this;
	}

	/**
	 * Tokbox sessionId.
	 * 
	 * @return tokboxSessionId
	 **/
	@ApiModelProperty(value = "Tokbox sessionId.")
	public String getTokboxSessionId() {
		return tokboxSessionId;
	}

	public void setTokboxSessionId(String tokboxSessionId) {
		this.tokboxSessionId = tokboxSessionId;
	}

	public ConversationHistoryData conversationTemplateId(String conversationTemplateId) {
		this.conversationTemplateId = conversationTemplateId;
		return this;
	}

	/**
	 * Template ID of the conversation.
	 * 
	 * @return conversationTemplateId
	 **/
	@ApiModelProperty(value = "Template ID of the conversation.")
	public String getConversationTemplateId() {
		return conversationTemplateId;
	}

	public void setConversationTemplateId(String conversationTemplateId) {
		this.conversationTemplateId = conversationTemplateId;
	}

	public ConversationHistoryData externalMessengerChannelIconId(String externalMessengerChannelIconId) {
		this.externalMessengerChannelIconId = externalMessengerChannelIconId;
		return this;
	}

	/**
	 * External messenger channel id.
	 * 
	 * @return externalMessengerChannelIconId
	 **/
	@ApiModelProperty(value = "External messenger channel id.")
	public String getExternalMessengerChannelIconId() {
		return externalMessengerChannelIconId;
	}

	public void setExternalMessengerChannelIconId(String externalMessengerChannelIconId) {
		this.externalMessengerChannelIconId = externalMessengerChannelIconId;
	}

	public ConversationHistoryData externalMessengerChannelName(String externalMessengerChannelName) {
		this.externalMessengerChannelName = externalMessengerChannelName;
		return this;
	}

	/**
	 * External messenger name.
	 * 
	 * @return externalMessengerChannelName
	 **/
	@ApiModelProperty(value = "External messenger name.")
	public String getExternalMessengerChannelName() {
		return externalMessengerChannelName;
	}

	public void setExternalMessengerChannelName(String externalMessengerChannelName) {
		this.externalMessengerChannelName = externalMessengerChannelName;
	}

	public ConversationHistoryData topic(String topic) {
		this.topic = topic;
		return this;
	}

	/**
	 * Topic of the conversation.
	 * 
	 * @return topic
	 **/
	@ApiModelProperty(value = "Topic of the conversation.")
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public ConversationHistoryData sourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
		return this;
	}

	/**
	 * Source URL of the conversation.
	 * 
	 * @return sourceUrl
	 **/
	@ApiModelProperty(value = "Source URL of the conversation.")
	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public ConversationHistoryData scheduledTimestamp(Long scheduledTimestamp) {
		this.scheduledTimestamp = scheduledTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the conversation is scheduled for. Can be set only for conversations with initialEngagementType
	 * :&#x60;EInitialEngagementType.SCHEDULED_CONVERSATION&#x60;
	 * 
	 * @return scheduledTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the conversation is scheduled for. Can be set only for conversations with initialEngagementType :`EInitialEngagementType.SCHEDULED_CONVERSATION`")
	public Long getScheduledTimestamp() {
		return scheduledTimestamp;
	}

	public void setScheduledTimestamp(Long scheduledTimestamp) {
		this.scheduledTimestamp = scheduledTimestamp;
	}

	public ConversationHistoryData dueDeletionTimestamp(Long dueDeletionTimestamp) {
		this.dueDeletionTimestamp = dueDeletionTimestamp;
		return this;
	}

	/**
	 * * Unix timestamp (ms) when this conversation will be automatically deleted. See &#x60;getRetentionIntervalConversationSeconds&#x60; for details.
	 * 
	 * @return dueDeletionTimestamp
	 **/
	@ApiModelProperty(value = "* Unix timestamp (ms) when this conversation will be automatically deleted. See `getRetentionIntervalConversationSeconds` for details.")
	public Long getDueDeletionTimestamp() {
		return dueDeletionTimestamp;
	}

	public void setDueDeletionTimestamp(Long dueDeletionTimestamp) {
		this.dueDeletionTimestamp = dueDeletionTimestamp;
	}

	public ConversationHistoryData initialEngagementUrl(String initialEngagementUrl) {
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

	public ConversationHistoryData awaitedPersonType(EAwaitedPersonType awaitedPersonType) {
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

	public ConversationHistoryData awaitedPersonTypeChangeTimestamp(Long awaitedPersonTypeChangeTimestamp) {
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

	public ConversationHistoryData conversationVisibility(EConversationVisibility conversationVisibility) {
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

	public ConversationHistoryData stateChanges(List<ConversationStateChangeData> stateChanges) {
		this.stateChanges = stateChanges;
		return this;
	}

	public ConversationHistoryData addStateChangesItem(ConversationStateChangeData stateChangesItem) {
		if (this.stateChanges == null) {
			this.stateChanges = new ArrayList<>();
		}
		this.stateChanges.add(stateChangesItem);
		return this;
	}

	/**
	 * List of conversation state changes that occurred in a conversation with corresponding time stamps
	 * 
	 * @return stateChanges
	 **/
	@ApiModelProperty(value = "List of conversation state changes that occurred in a conversation with corresponding time stamps")
	public List<ConversationStateChangeData> getStateChanges() {
		return stateChanges;
	}

	public void setStateChanges(List<ConversationStateChangeData> stateChanges) {
		this.stateChanges = stateChanges;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationHistoryData conversationHistoryData = (ConversationHistoryData) o;
		return Objects.equals(this.$type, conversationHistoryData.$type) &&
				Objects.equals(this.id, conversationHistoryData.id) &&
				Objects.equals(this.recipient, conversationHistoryData.recipient) &&
				Objects.equals(this.endPerson, conversationHistoryData.endPerson) &&
				Objects.equals(this.participants, conversationHistoryData.participants) &&
				Objects.equals(this.externalParticipants, conversationHistoryData.externalParticipants) &&
				Objects.equals(this.botParticipants, conversationHistoryData.botParticipants) &&
				Objects.equals(this.createdTimestamp, conversationHistoryData.createdTimestamp) &&
				Objects.equals(this.assigneeJoinTimestamp, conversationHistoryData.assigneeJoinTimestamp) &&
				Objects.equals(this.endTimestamp, conversationHistoryData.endTimestamp) &&
				Objects.equals(this.lastMessageTimestamp, conversationHistoryData.lastMessageTimestamp) &&
				Objects.equals(this.lastCompletedRecordingTimestamp, conversationHistoryData.lastCompletedRecordingTimestamp) &&
				Objects.equals(this.state, conversationHistoryData.state) &&
				Objects.equals(this.initialEngagementType, conversationHistoryData.initialEngagementType) &&
				Objects.equals(this.locale, conversationHistoryData.locale) &&
				Objects.equals(this.endReason, conversationHistoryData.endReason) &&
				Objects.equals(this.endComment, conversationHistoryData.endComment) &&
				Objects.equals(this.tokboxSessionId, conversationHistoryData.tokboxSessionId) &&
				Objects.equals(this.conversationTemplateId, conversationHistoryData.conversationTemplateId) &&
				Objects.equals(this.externalMessengerChannelIconId, conversationHistoryData.externalMessengerChannelIconId) &&
				Objects.equals(this.externalMessengerChannelName, conversationHistoryData.externalMessengerChannelName) &&
				Objects.equals(this.topic, conversationHistoryData.topic) &&
				Objects.equals(this.sourceUrl, conversationHistoryData.sourceUrl) &&
				Objects.equals(this.scheduledTimestamp, conversationHistoryData.scheduledTimestamp) &&
				Objects.equals(this.dueDeletionTimestamp, conversationHistoryData.dueDeletionTimestamp) &&
				Objects.equals(this.initialEngagementUrl, conversationHistoryData.initialEngagementUrl) &&
				Objects.equals(this.awaitedPersonType, conversationHistoryData.awaitedPersonType) &&
				Objects.equals(this.awaitedPersonTypeChangeTimestamp, conversationHistoryData.awaitedPersonTypeChangeTimestamp) &&
				Objects.equals(this.conversationVisibility, conversationHistoryData.conversationVisibility) &&
				Objects.equals(this.stateChanges, conversationHistoryData.stateChanges);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, recipient, endPerson, participants, externalParticipants, botParticipants, createdTimestamp, assigneeJoinTimestamp, endTimestamp, lastMessageTimestamp, lastCompletedRecordingTimestamp, state, initialEngagementType, locale, endReason, endComment, tokboxSessionId, conversationTemplateId, externalMessengerChannelIconId, externalMessengerChannelName, topic, sourceUrl, scheduledTimestamp, dueDeletionTimestamp, initialEngagementUrl, awaitedPersonType, awaitedPersonTypeChangeTimestamp, conversationVisibility, stateChanges);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationHistoryData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
		sb.append("    endPerson: ").append(toIndentedString(endPerson)).append("\n");
		sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
		sb.append("    externalParticipants: ").append(toIndentedString(externalParticipants)).append("\n");
		sb.append("    botParticipants: ").append(toIndentedString(botParticipants)).append("\n");
		sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
		sb.append("    assigneeJoinTimestamp: ").append(toIndentedString(assigneeJoinTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
		sb.append("    lastMessageTimestamp: ").append(toIndentedString(lastMessageTimestamp)).append("\n");
		sb.append("    lastCompletedRecordingTimestamp: ").append(toIndentedString(lastCompletedRecordingTimestamp)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    initialEngagementType: ").append(toIndentedString(initialEngagementType)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    endReason: ").append(toIndentedString(endReason)).append("\n");
		sb.append("    endComment: ").append(toIndentedString(endComment)).append("\n");
		sb.append("    tokboxSessionId: ").append(toIndentedString(tokboxSessionId)).append("\n");
		sb.append("    conversationTemplateId: ").append(toIndentedString(conversationTemplateId)).append("\n");
		sb.append("    externalMessengerChannelIconId: ").append(toIndentedString(externalMessengerChannelIconId)).append("\n");
		sb.append("    externalMessengerChannelName: ").append(toIndentedString(externalMessengerChannelName)).append("\n");
		sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
		sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
		sb.append("    scheduledTimestamp: ").append(toIndentedString(scheduledTimestamp)).append("\n");
		sb.append("    dueDeletionTimestamp: ").append(toIndentedString(dueDeletionTimestamp)).append("\n");
		sb.append("    initialEngagementUrl: ").append(toIndentedString(initialEngagementUrl)).append("\n");
		sb.append("    awaitedPersonType: ").append(toIndentedString(awaitedPersonType)).append("\n");
		sb.append("    awaitedPersonTypeChangeTimestamp: ").append(toIndentedString(awaitedPersonTypeChangeTimestamp)).append("\n");
		sb.append("    conversationVisibility: ").append(toIndentedString(conversationVisibility)).append("\n");
		sb.append("    stateChanges: ").append(toIndentedString(stateChanges)).append("\n");
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
