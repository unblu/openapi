
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
 * An event triggered every time a conversation summary request fails.
 */
@ApiModel(description = "An event triggered every time a conversation summary request fails.")

@JsonPropertyOrder({
	ConversationSummaryFailedEvent.JSON_PROPERTY_$_TYPE,
	ConversationSummaryFailedEvent.JSON_PROPERTY_TIMESTAMP,
	ConversationSummaryFailedEvent.JSON_PROPERTY_EVENT_TYPE,
	ConversationSummaryFailedEvent.JSON_PROPERTY_ACCOUNT_ID,
	ConversationSummaryFailedEvent.JSON_PROPERTY_SUMMARY_TRIGGER_TYPE,
	ConversationSummaryFailedEvent.JSON_PROPERTY_CONVERSATION_ID,
	ConversationSummaryFailedEvent.JSON_PROPERTY_CONVERSATION_SUMMARY_TEMPLATE_ID,
	ConversationSummaryFailedEvent.JSON_PROPERTY_CONVERSATION_SUMMARY_ID,
	ConversationSummaryFailedEvent.JSON_PROPERTY_REQUESTING_AGENT_PERSON_ID,
	ConversationSummaryFailedEvent.JSON_PROPERTY_FIRST_MESSAGE_ID,
	ConversationSummaryFailedEvent.JSON_PROPERTY_LAST_MESSAGE_ID,
	ConversationSummaryFailedEvent.JSON_PROPERTY_FIRST_CALL_TRANSCRIPT_ID,
	ConversationSummaryFailedEvent.JSON_PROPERTY_LAST_CALL_TRANSCRIPT_ID,
	ConversationSummaryFailedEvent.JSON_PROPERTY_PARTICIPATING_PERSON_IDS,
	ConversationSummaryFailedEvent.JSON_PROPERTY_START_TIMESTAMP,
	ConversationSummaryFailedEvent.JSON_PROPERTY_END_TIMESTAMP,
	ConversationSummaryFailedEvent.JSON_PROPERTY_PROCESSING_TIME,
	ConversationSummaryFailedEvent.JSON_PROPERTY_SUMMARY_SERVICE_PROVIDER,
	ConversationSummaryFailedEvent.JSON_PROPERTY_SUMMARY_SERVICE_DETAILS,
	ConversationSummaryFailedEvent.JSON_PROPERTY_SUMMARIZED_CONTENT_LENGTH,
	ConversationSummaryFailedEvent.JSON_PROPERTY_SUMMARY_LANGUAGE,
	ConversationSummaryFailedEvent.JSON_PROPERTY_SUMMARIZATION_TIME_FRAME,
	ConversationSummaryFailedEvent.JSON_PROPERTY_INCLUDE_INTERNAL_MESSAGES,
	ConversationSummaryFailedEvent.JSON_PROPERTY_INCLUDE_ONBOARDING_MESSAGES,
	ConversationSummaryFailedEvent.JSON_PROPERTY_INCLUDE_OFFBOARDING_MESSAGES,
	ConversationSummaryFailedEvent.JSON_PROPERTY_INCLUDE_REBOARDING_MESSAGES,
	ConversationSummaryFailedEvent.JSON_PROPERTY_FAIL_REASON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationSummaryFailedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONSUMMARYFAILEDEVENT("ConversationSummaryFailedEvent");

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
			return TypeEnum.CONVERSATIONSUMMARYFAILEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONSUMMARYFAILEDEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SUMMARY_TRIGGER_TYPE = "summaryTriggerType";
	@JsonProperty(JSON_PROPERTY_SUMMARY_TRIGGER_TYPE)
	private EConversationSummaryTriggerType summaryTriggerType;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_CONVERSATION_SUMMARY_TEMPLATE_ID = "conversationSummaryTemplateId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_SUMMARY_TEMPLATE_ID)
	private String conversationSummaryTemplateId;

	public static final String JSON_PROPERTY_CONVERSATION_SUMMARY_ID = "conversationSummaryId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_SUMMARY_ID)
	private String conversationSummaryId;

	public static final String JSON_PROPERTY_REQUESTING_AGENT_PERSON_ID = "requestingAgentPersonId";
	@JsonProperty(JSON_PROPERTY_REQUESTING_AGENT_PERSON_ID)
	private String requestingAgentPersonId;

	public static final String JSON_PROPERTY_FIRST_MESSAGE_ID = "firstMessageId";
	@JsonProperty(JSON_PROPERTY_FIRST_MESSAGE_ID)
	private String firstMessageId;

	public static final String JSON_PROPERTY_LAST_MESSAGE_ID = "lastMessageId";
	@JsonProperty(JSON_PROPERTY_LAST_MESSAGE_ID)
	private String lastMessageId;

	public static final String JSON_PROPERTY_FIRST_CALL_TRANSCRIPT_ID = "firstCallTranscriptId";
	@JsonProperty(JSON_PROPERTY_FIRST_CALL_TRANSCRIPT_ID)
	private String firstCallTranscriptId;

	public static final String JSON_PROPERTY_LAST_CALL_TRANSCRIPT_ID = "lastCallTranscriptId";
	@JsonProperty(JSON_PROPERTY_LAST_CALL_TRANSCRIPT_ID)
	private String lastCallTranscriptId;

	public static final String JSON_PROPERTY_PARTICIPATING_PERSON_IDS = "participatingPersonIds";
	@JsonProperty(JSON_PROPERTY_PARTICIPATING_PERSON_IDS)
	private List<String> participatingPersonIds = null;

	public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
	@JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
	private Long startTimestamp;

	public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
	@JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
	private Long endTimestamp;

	public static final String JSON_PROPERTY_PROCESSING_TIME = "processingTime";
	@JsonProperty(JSON_PROPERTY_PROCESSING_TIME)
	private Long processingTime;

	public static final String JSON_PROPERTY_SUMMARY_SERVICE_PROVIDER = "summaryServiceProvider";
	@JsonProperty(JSON_PROPERTY_SUMMARY_SERVICE_PROVIDER)
	private EConversationSummaryProvider summaryServiceProvider;

	public static final String JSON_PROPERTY_SUMMARY_SERVICE_DETAILS = "summaryServiceDetails";
	@JsonProperty(JSON_PROPERTY_SUMMARY_SERVICE_DETAILS)
	private String summaryServiceDetails;

	public static final String JSON_PROPERTY_SUMMARIZED_CONTENT_LENGTH = "summarizedContentLength";
	@JsonProperty(JSON_PROPERTY_SUMMARIZED_CONTENT_LENGTH)
	private Long summarizedContentLength;

	public static final String JSON_PROPERTY_SUMMARY_LANGUAGE = "summaryLanguage";
	@JsonProperty(JSON_PROPERTY_SUMMARY_LANGUAGE)
	private String summaryLanguage;

	public static final String JSON_PROPERTY_SUMMARIZATION_TIME_FRAME = "summarizationTimeFrame";
	@JsonProperty(JSON_PROPERTY_SUMMARIZATION_TIME_FRAME)
	private ESummarizationTimeFrame summarizationTimeFrame;

	public static final String JSON_PROPERTY_INCLUDE_INTERNAL_MESSAGES = "includeInternalMessages";
	@JsonProperty(JSON_PROPERTY_INCLUDE_INTERNAL_MESSAGES)
	private Boolean includeInternalMessages;

	public static final String JSON_PROPERTY_INCLUDE_ONBOARDING_MESSAGES = "includeOnboardingMessages";
	@JsonProperty(JSON_PROPERTY_INCLUDE_ONBOARDING_MESSAGES)
	private Boolean includeOnboardingMessages;

	public static final String JSON_PROPERTY_INCLUDE_OFFBOARDING_MESSAGES = "includeOffboardingMessages";
	@JsonProperty(JSON_PROPERTY_INCLUDE_OFFBOARDING_MESSAGES)
	private Boolean includeOffboardingMessages;

	public static final String JSON_PROPERTY_INCLUDE_REBOARDING_MESSAGES = "includeReboardingMessages";
	@JsonProperty(JSON_PROPERTY_INCLUDE_REBOARDING_MESSAGES)
	private Boolean includeReboardingMessages;

	public static final String JSON_PROPERTY_FAIL_REASON = "failReason";
	@JsonProperty(JSON_PROPERTY_FAIL_REASON)
	private EConversationSummaryFailReason failReason;

	public ConversationSummaryFailedEvent $type(TypeEnum $type) {
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

	public ConversationSummaryFailedEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (Unix time in ms) when the event was generated
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (Unix time in ms) when the event was generated")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public ConversationSummaryFailedEvent eventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * The name of the event
	 * 
	 * @return eventType
	 **/
	@ApiModelProperty(value = "The name of the event")
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public ConversationSummaryFailedEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public ConversationSummaryFailedEvent summaryTriggerType(EConversationSummaryTriggerType summaryTriggerType) {
		this.summaryTriggerType = summaryTriggerType;
		return this;
	}

	/**
	 * Get summaryTriggerType
	 * 
	 * @return summaryTriggerType
	 **/
	@ApiModelProperty(value = "")
	public EConversationSummaryTriggerType getSummaryTriggerType() {
		return summaryTriggerType;
	}

	public void setSummaryTriggerType(EConversationSummaryTriggerType summaryTriggerType) {
		this.summaryTriggerType = summaryTriggerType;
	}

	public ConversationSummaryFailedEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation that the event originated from.
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation that the event originated from.")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ConversationSummaryFailedEvent conversationSummaryTemplateId(String conversationSummaryTemplateId) {
		this.conversationSummaryTemplateId = conversationSummaryTemplateId;
		return this;
	}

	/**
	 * ID of the template used for the summary.
	 * 
	 * @return conversationSummaryTemplateId
	 **/
	@ApiModelProperty(value = "ID of the template used for the summary.")
	public String getConversationSummaryTemplateId() {
		return conversationSummaryTemplateId;
	}

	public void setConversationSummaryTemplateId(String conversationSummaryTemplateId) {
		this.conversationSummaryTemplateId = conversationSummaryTemplateId;
	}

	public ConversationSummaryFailedEvent conversationSummaryId(String conversationSummaryId) {
		this.conversationSummaryId = conversationSummaryId;
		return this;
	}

	/**
	 * ID identifying the conversation summary
	 * 
	 * @return conversationSummaryId
	 **/
	@ApiModelProperty(value = "ID identifying the conversation summary")
	public String getConversationSummaryId() {
		return conversationSummaryId;
	}

	public void setConversationSummaryId(String conversationSummaryId) {
		this.conversationSummaryId = conversationSummaryId;
	}

	public ConversationSummaryFailedEvent requestingAgentPersonId(String requestingAgentPersonId) {
		this.requestingAgentPersonId = requestingAgentPersonId;
		return this;
	}

	/**
	 * ID of the agent who requested the summary. Only present if the summary was requested manually.
	 * 
	 * @return requestingAgentPersonId
	 **/
	@ApiModelProperty(value = "ID of the agent who requested the summary. Only present if the summary was requested manually.")
	public String getRequestingAgentPersonId() {
		return requestingAgentPersonId;
	}

	public void setRequestingAgentPersonId(String requestingAgentPersonId) {
		this.requestingAgentPersonId = requestingAgentPersonId;
	}

	public ConversationSummaryFailedEvent firstMessageId(String firstMessageId) {
		this.firstMessageId = firstMessageId;
		return this;
	}

	/**
	 * ID of the first message included in the summary.
	 * 
	 * @return firstMessageId
	 **/
	@ApiModelProperty(value = "ID of the first message included in the summary.")
	public String getFirstMessageId() {
		return firstMessageId;
	}

	public void setFirstMessageId(String firstMessageId) {
		this.firstMessageId = firstMessageId;
	}

	public ConversationSummaryFailedEvent lastMessageId(String lastMessageId) {
		this.lastMessageId = lastMessageId;
		return this;
	}

	/**
	 * ID of the last message included in the summary.
	 * 
	 * @return lastMessageId
	 **/
	@ApiModelProperty(value = "ID of the last message included in the summary.")
	public String getLastMessageId() {
		return lastMessageId;
	}

	public void setLastMessageId(String lastMessageId) {
		this.lastMessageId = lastMessageId;
	}

	public ConversationSummaryFailedEvent firstCallTranscriptId(String firstCallTranscriptId) {
		this.firstCallTranscriptId = firstCallTranscriptId;
		return this;
	}

	/**
	 * ID of the first call transcript included in the summary.
	 * 
	 * @return firstCallTranscriptId
	 **/
	@ApiModelProperty(value = "ID of the first call transcript included in the summary.")
	public String getFirstCallTranscriptId() {
		return firstCallTranscriptId;
	}

	public void setFirstCallTranscriptId(String firstCallTranscriptId) {
		this.firstCallTranscriptId = firstCallTranscriptId;
	}

	public ConversationSummaryFailedEvent lastCallTranscriptId(String lastCallTranscriptId) {
		this.lastCallTranscriptId = lastCallTranscriptId;
		return this;
	}

	/**
	 * ID of the last call transcript included in the summary.
	 * 
	 * @return lastCallTranscriptId
	 **/
	@ApiModelProperty(value = "ID of the last call transcript included in the summary.")
	public String getLastCallTranscriptId() {
		return lastCallTranscriptId;
	}

	public void setLastCallTranscriptId(String lastCallTranscriptId) {
		this.lastCallTranscriptId = lastCallTranscriptId;
	}

	public ConversationSummaryFailedEvent participatingPersonIds(List<String> participatingPersonIds) {
		this.participatingPersonIds = participatingPersonIds;
		return this;
	}

	public ConversationSummaryFailedEvent addParticipatingPersonIdsItem(String participatingPersonIdsItem) {
		if (this.participatingPersonIds == null) {
			this.participatingPersonIds = new ArrayList<>();
		}
		this.participatingPersonIds.add(participatingPersonIdsItem);
		return this;
	}

	/**
	 * IDs of all the conversation participants in the summarized part of the conversation. This includes participants who didn&#39;t play an active part in the
	 * conversation during the part summarized.
	 * 
	 * @return participatingPersonIds
	 **/
	@ApiModelProperty(value = "IDs of all the conversation participants in the summarized part of the conversation. This includes participants who didn't play an active part in the conversation during the part summarized.")
	public List<String> getParticipatingPersonIds() {
		return participatingPersonIds;
	}

	public void setParticipatingPersonIds(List<String> participatingPersonIds) {
		this.participatingPersonIds = participatingPersonIds;
	}

	public ConversationSummaryFailedEvent startTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		return this;
	}

	/**
	 * Timestamp of the first conversation item (message or call transcript) included in the summary.
	 * 
	 * @return startTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the first conversation item (message or call transcript) included in the summary.")
	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public ConversationSummaryFailedEvent endTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last conversation item (message or call transcript) used in the summary.
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last conversation item (message or call transcript) used in the summary.")
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public ConversationSummaryFailedEvent processingTime(Long processingTime) {
		this.processingTime = processingTime;
		return this;
	}

	/**
	 * How long it took to generate the summary.
	 * 
	 * @return processingTime
	 **/
	@ApiModelProperty(value = "How long it took to generate the summary.")
	public Long getProcessingTime() {
		return processingTime;
	}

	public void setProcessingTime(Long processingTime) {
		this.processingTime = processingTime;
	}

	public ConversationSummaryFailedEvent summaryServiceProvider(EConversationSummaryProvider summaryServiceProvider) {
		this.summaryServiceProvider = summaryServiceProvider;
		return this;
	}

	/**
	 * Get summaryServiceProvider
	 * 
	 * @return summaryServiceProvider
	 **/
	@ApiModelProperty(value = "")
	public EConversationSummaryProvider getSummaryServiceProvider() {
		return summaryServiceProvider;
	}

	public void setSummaryServiceProvider(EConversationSummaryProvider summaryServiceProvider) {
		this.summaryServiceProvider = summaryServiceProvider;
	}

	public ConversationSummaryFailedEvent summaryServiceDetails(String summaryServiceDetails) {
		this.summaryServiceDetails = summaryServiceDetails;
		return this;
	}

	/**
	 * Details of the service used to generate the summary.
	 * 
	 * @return summaryServiceDetails
	 **/
	@ApiModelProperty(value = "Details of the service used to generate the summary.")
	public String getSummaryServiceDetails() {
		return summaryServiceDetails;
	}

	public void setSummaryServiceDetails(String summaryServiceDetails) {
		this.summaryServiceDetails = summaryServiceDetails;
	}

	public ConversationSummaryFailedEvent summarizedContentLength(Long summarizedContentLength) {
		this.summarizedContentLength = summarizedContentLength;
		return this;
	}

	/**
	 * Number of characters in the summarized content.
	 * 
	 * @return summarizedContentLength
	 **/
	@ApiModelProperty(value = "Number of characters in the summarized content.")
	public Long getSummarizedContentLength() {
		return summarizedContentLength;
	}

	public void setSummarizedContentLength(Long summarizedContentLength) {
		this.summarizedContentLength = summarizedContentLength;
	}

	public ConversationSummaryFailedEvent summaryLanguage(String summaryLanguage) {
		this.summaryLanguage = summaryLanguage;
		return this;
	}

	/**
	 * Original language of the summary
	 * 
	 * @return summaryLanguage
	 **/
	@ApiModelProperty(value = "Original language of the summary")
	public String getSummaryLanguage() {
		return summaryLanguage;
	}

	public void setSummaryLanguage(String summaryLanguage) {
		this.summaryLanguage = summaryLanguage;
	}

	public ConversationSummaryFailedEvent summarizationTimeFrame(ESummarizationTimeFrame summarizationTimeFrame) {
		this.summarizationTimeFrame = summarizationTimeFrame;
		return this;
	}

	/**
	 * Get summarizationTimeFrame
	 * 
	 * @return summarizationTimeFrame
	 **/
	@ApiModelProperty(value = "")
	public ESummarizationTimeFrame getSummarizationTimeFrame() {
		return summarizationTimeFrame;
	}

	public void setSummarizationTimeFrame(ESummarizationTimeFrame summarizationTimeFrame) {
		this.summarizationTimeFrame = summarizationTimeFrame;
	}

	public ConversationSummaryFailedEvent includeInternalMessages(Boolean includeInternalMessages) {
		this.includeInternalMessages = includeInternalMessages;
		return this;
	}

	/**
	 * Specify whether internal messages are taken into account for the summary. Mandatory.
	 * 
	 * @return includeInternalMessages
	 **/
	@ApiModelProperty(value = "Specify whether internal messages are taken into account for the summary. Mandatory.")
	public Boolean isIncludeInternalMessages() {
		return includeInternalMessages;
	}

	public void setIncludeInternalMessages(Boolean includeInternalMessages) {
		this.includeInternalMessages = includeInternalMessages;
	}

	public ConversationSummaryFailedEvent includeOnboardingMessages(Boolean includeOnboardingMessages) {
		this.includeOnboardingMessages = includeOnboardingMessages;
		return this;
	}

	/**
	 * Specify whether messages sent during onboarding are taken into account for the summary. Mandatory.
	 * 
	 * @return includeOnboardingMessages
	 **/
	@ApiModelProperty(value = "Specify whether messages sent during onboarding are taken into account for the summary. Mandatory.")
	public Boolean isIncludeOnboardingMessages() {
		return includeOnboardingMessages;
	}

	public void setIncludeOnboardingMessages(Boolean includeOnboardingMessages) {
		this.includeOnboardingMessages = includeOnboardingMessages;
	}

	public ConversationSummaryFailedEvent includeOffboardingMessages(Boolean includeOffboardingMessages) {
		this.includeOffboardingMessages = includeOffboardingMessages;
		return this;
	}

	/**
	 * Specify whether messages sent during offboarding are taken into account for the summary. Mandatory.
	 * 
	 * @return includeOffboardingMessages
	 **/
	@ApiModelProperty(value = "Specify whether messages sent during offboarding are taken into account for the summary. Mandatory.")
	public Boolean isIncludeOffboardingMessages() {
		return includeOffboardingMessages;
	}

	public void setIncludeOffboardingMessages(Boolean includeOffboardingMessages) {
		this.includeOffboardingMessages = includeOffboardingMessages;
	}

	public ConversationSummaryFailedEvent includeReboardingMessages(Boolean includeReboardingMessages) {
		this.includeReboardingMessages = includeReboardingMessages;
		return this;
	}

	/**
	 * Specify whether messages sent during reboarding are taken into account for the summary. Mandatory.
	 * 
	 * @return includeReboardingMessages
	 **/
	@ApiModelProperty(value = "Specify whether messages sent during reboarding are taken into account for the summary. Mandatory.")
	public Boolean isIncludeReboardingMessages() {
		return includeReboardingMessages;
	}

	public void setIncludeReboardingMessages(Boolean includeReboardingMessages) {
		this.includeReboardingMessages = includeReboardingMessages;
	}

	public ConversationSummaryFailedEvent failReason(EConversationSummaryFailReason failReason) {
		this.failReason = failReason;
		return this;
	}

	/**
	 * Get failReason
	 * 
	 * @return failReason
	 **/
	@ApiModelProperty(value = "")
	public EConversationSummaryFailReason getFailReason() {
		return failReason;
	}

	public void setFailReason(EConversationSummaryFailReason failReason) {
		this.failReason = failReason;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationSummaryFailedEvent conversationSummaryFailedEvent = (ConversationSummaryFailedEvent) o;
		return Objects.equals(this.$type, conversationSummaryFailedEvent.$type) &&
				Objects.equals(this.timestamp, conversationSummaryFailedEvent.timestamp) &&
				Objects.equals(this.eventType, conversationSummaryFailedEvent.eventType) &&
				Objects.equals(this.accountId, conversationSummaryFailedEvent.accountId) &&
				Objects.equals(this.summaryTriggerType, conversationSummaryFailedEvent.summaryTriggerType) &&
				Objects.equals(this.conversationId, conversationSummaryFailedEvent.conversationId) &&
				Objects.equals(this.conversationSummaryTemplateId, conversationSummaryFailedEvent.conversationSummaryTemplateId) &&
				Objects.equals(this.conversationSummaryId, conversationSummaryFailedEvent.conversationSummaryId) &&
				Objects.equals(this.requestingAgentPersonId, conversationSummaryFailedEvent.requestingAgentPersonId) &&
				Objects.equals(this.firstMessageId, conversationSummaryFailedEvent.firstMessageId) &&
				Objects.equals(this.lastMessageId, conversationSummaryFailedEvent.lastMessageId) &&
				Objects.equals(this.firstCallTranscriptId, conversationSummaryFailedEvent.firstCallTranscriptId) &&
				Objects.equals(this.lastCallTranscriptId, conversationSummaryFailedEvent.lastCallTranscriptId) &&
				Objects.equals(this.participatingPersonIds, conversationSummaryFailedEvent.participatingPersonIds) &&
				Objects.equals(this.startTimestamp, conversationSummaryFailedEvent.startTimestamp) &&
				Objects.equals(this.endTimestamp, conversationSummaryFailedEvent.endTimestamp) &&
				Objects.equals(this.processingTime, conversationSummaryFailedEvent.processingTime) &&
				Objects.equals(this.summaryServiceProvider, conversationSummaryFailedEvent.summaryServiceProvider) &&
				Objects.equals(this.summaryServiceDetails, conversationSummaryFailedEvent.summaryServiceDetails) &&
				Objects.equals(this.summarizedContentLength, conversationSummaryFailedEvent.summarizedContentLength) &&
				Objects.equals(this.summaryLanguage, conversationSummaryFailedEvent.summaryLanguage) &&
				Objects.equals(this.summarizationTimeFrame, conversationSummaryFailedEvent.summarizationTimeFrame) &&
				Objects.equals(this.includeInternalMessages, conversationSummaryFailedEvent.includeInternalMessages) &&
				Objects.equals(this.includeOnboardingMessages, conversationSummaryFailedEvent.includeOnboardingMessages) &&
				Objects.equals(this.includeOffboardingMessages, conversationSummaryFailedEvent.includeOffboardingMessages) &&
				Objects.equals(this.includeReboardingMessages, conversationSummaryFailedEvent.includeReboardingMessages) &&
				Objects.equals(this.failReason, conversationSummaryFailedEvent.failReason);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, summaryTriggerType, conversationId, conversationSummaryTemplateId, conversationSummaryId, requestingAgentPersonId, firstMessageId, lastMessageId, firstCallTranscriptId, lastCallTranscriptId, participatingPersonIds, startTimestamp, endTimestamp, processingTime, summaryServiceProvider, summaryServiceDetails, summarizedContentLength, summaryLanguage, summarizationTimeFrame, includeInternalMessages, includeOnboardingMessages, includeOffboardingMessages, includeReboardingMessages, failReason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationSummaryFailedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    summaryTriggerType: ").append(toIndentedString(summaryTriggerType)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    conversationSummaryTemplateId: ").append(toIndentedString(conversationSummaryTemplateId)).append("\n");
		sb.append("    conversationSummaryId: ").append(toIndentedString(conversationSummaryId)).append("\n");
		sb.append("    requestingAgentPersonId: ").append(toIndentedString(requestingAgentPersonId)).append("\n");
		sb.append("    firstMessageId: ").append(toIndentedString(firstMessageId)).append("\n");
		sb.append("    lastMessageId: ").append(toIndentedString(lastMessageId)).append("\n");
		sb.append("    firstCallTranscriptId: ").append(toIndentedString(firstCallTranscriptId)).append("\n");
		sb.append("    lastCallTranscriptId: ").append(toIndentedString(lastCallTranscriptId)).append("\n");
		sb.append("    participatingPersonIds: ").append(toIndentedString(participatingPersonIds)).append("\n");
		sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
		sb.append("    processingTime: ").append(toIndentedString(processingTime)).append("\n");
		sb.append("    summaryServiceProvider: ").append(toIndentedString(summaryServiceProvider)).append("\n");
		sb.append("    summaryServiceDetails: ").append(toIndentedString(summaryServiceDetails)).append("\n");
		sb.append("    summarizedContentLength: ").append(toIndentedString(summarizedContentLength)).append("\n");
		sb.append("    summaryLanguage: ").append(toIndentedString(summaryLanguage)).append("\n");
		sb.append("    summarizationTimeFrame: ").append(toIndentedString(summarizationTimeFrame)).append("\n");
		sb.append("    includeInternalMessages: ").append(toIndentedString(includeInternalMessages)).append("\n");
		sb.append("    includeOnboardingMessages: ").append(toIndentedString(includeOnboardingMessages)).append("\n");
		sb.append("    includeOffboardingMessages: ").append(toIndentedString(includeOffboardingMessages)).append("\n");
		sb.append("    includeReboardingMessages: ").append(toIndentedString(includeReboardingMessages)).append("\n");
		sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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
