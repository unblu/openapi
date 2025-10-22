
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
 * An event triggered every time a conversation summary is reviewed.
 */
@ApiModel(description = "An event triggered every time a conversation summary is reviewed.")

@JsonPropertyOrder({
	ConversationSummaryApprovedEvent.JSON_PROPERTY_$_TYPE,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_TIMESTAMP,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_EVENT_TYPE,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_ACCOUNT_ID,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_SUMMARY_TRIGGER_TYPE,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_CONVERSATION_ID,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_CONVERSATION_SUMMARY_TEMPLATE_ID,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_CONVERSATION_SUMMARY_ID,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_REQUESTING_AGENT_PERSON_ID,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_FIRST_MESSAGE_ID,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_LAST_MESSAGE_ID,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_FIRST_CALL_TRANSCRIPT_ID,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_LAST_CALL_TRANSCRIPT_ID,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_PARTICIPATING_PERSON_IDS,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_START_TIMESTAMP,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_END_TIMESTAMP,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_PROCESSING_TIME,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_SUMMARY_SERVICE_PROVIDER,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_SUMMARY_SERVICE_DETAILS,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_SUMMARIZED_CONTENT_LENGTH,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_SUMMARY_LANGUAGE,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_SUMMARIZATION_TIME_FRAME,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_INCLUDE_INTERNAL_MESSAGES,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_INCLUDE_ONBOARDING_MESSAGES,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_INCLUDE_OFFBOARDING_MESSAGES,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_INCLUDE_REBOARDING_MESSAGES,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_GENERATED_SUMMARY,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_REVIEW_REQUIRED,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_REVIEWABLE_BY,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_VISIBLE_TO,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_REVIEWING_AGENT_PERSON_ID,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_REVIEW_TIMESTAMP,
	ConversationSummaryApprovedEvent.JSON_PROPERTY_REVIEWED_SUMMARY,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationSummaryApprovedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONSUMMARYAPPROVEDEVENT("ConversationSummaryApprovedEvent");

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
			return TypeEnum.CONVERSATIONSUMMARYAPPROVEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONSUMMARYAPPROVEDEVENT;

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

	public static final String JSON_PROPERTY_GENERATED_SUMMARY = "generatedSummary";
	@JsonProperty(JSON_PROPERTY_GENERATED_SUMMARY)
	private String generatedSummary;

	public static final String JSON_PROPERTY_REVIEW_REQUIRED = "reviewRequired";
	@JsonProperty(JSON_PROPERTY_REVIEW_REQUIRED)
	private Boolean reviewRequired;

	public static final String JSON_PROPERTY_REVIEWABLE_BY = "reviewableBy";
	@JsonProperty(JSON_PROPERTY_REVIEWABLE_BY)
	private List<EConversationAgentParticipationType> reviewableBy = null;

	public static final String JSON_PROPERTY_VISIBLE_TO = "visibleTo";
	@JsonProperty(JSON_PROPERTY_VISIBLE_TO)
	private List<EConversationAgentParticipationType> visibleTo = null;

	public static final String JSON_PROPERTY_REVIEWING_AGENT_PERSON_ID = "reviewingAgentPersonId";
	@JsonProperty(JSON_PROPERTY_REVIEWING_AGENT_PERSON_ID)
	private String reviewingAgentPersonId;

	public static final String JSON_PROPERTY_REVIEW_TIMESTAMP = "reviewTimestamp";
	@JsonProperty(JSON_PROPERTY_REVIEW_TIMESTAMP)
	private Long reviewTimestamp;

	public static final String JSON_PROPERTY_REVIEWED_SUMMARY = "reviewedSummary";
	@JsonProperty(JSON_PROPERTY_REVIEWED_SUMMARY)
	private String reviewedSummary;

	public ConversationSummaryApprovedEvent $type(TypeEnum $type) {
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

	public ConversationSummaryApprovedEvent timestamp(Long timestamp) {
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

	public ConversationSummaryApprovedEvent eventType(String eventType) {
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

	public ConversationSummaryApprovedEvent accountId(String accountId) {
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

	public ConversationSummaryApprovedEvent summaryTriggerType(EConversationSummaryTriggerType summaryTriggerType) {
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

	public ConversationSummaryApprovedEvent conversationId(String conversationId) {
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

	public ConversationSummaryApprovedEvent conversationSummaryTemplateId(String conversationSummaryTemplateId) {
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

	public ConversationSummaryApprovedEvent conversationSummaryId(String conversationSummaryId) {
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

	public ConversationSummaryApprovedEvent requestingAgentPersonId(String requestingAgentPersonId) {
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

	public ConversationSummaryApprovedEvent firstMessageId(String firstMessageId) {
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

	public ConversationSummaryApprovedEvent lastMessageId(String lastMessageId) {
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

	public ConversationSummaryApprovedEvent firstCallTranscriptId(String firstCallTranscriptId) {
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

	public ConversationSummaryApprovedEvent lastCallTranscriptId(String lastCallTranscriptId) {
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

	public ConversationSummaryApprovedEvent participatingPersonIds(List<String> participatingPersonIds) {
		this.participatingPersonIds = participatingPersonIds;
		return this;
	}

	public ConversationSummaryApprovedEvent addParticipatingPersonIdsItem(String participatingPersonIdsItem) {
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

	public ConversationSummaryApprovedEvent startTimestamp(Long startTimestamp) {
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

	public ConversationSummaryApprovedEvent endTimestamp(Long endTimestamp) {
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

	public ConversationSummaryApprovedEvent processingTime(Long processingTime) {
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

	public ConversationSummaryApprovedEvent summaryServiceProvider(EConversationSummaryProvider summaryServiceProvider) {
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

	public ConversationSummaryApprovedEvent summaryServiceDetails(String summaryServiceDetails) {
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

	public ConversationSummaryApprovedEvent summarizedContentLength(Long summarizedContentLength) {
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

	public ConversationSummaryApprovedEvent summaryLanguage(String summaryLanguage) {
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

	public ConversationSummaryApprovedEvent summarizationTimeFrame(ESummarizationTimeFrame summarizationTimeFrame) {
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

	public ConversationSummaryApprovedEvent includeInternalMessages(Boolean includeInternalMessages) {
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

	public ConversationSummaryApprovedEvent includeOnboardingMessages(Boolean includeOnboardingMessages) {
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

	public ConversationSummaryApprovedEvent includeOffboardingMessages(Boolean includeOffboardingMessages) {
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

	public ConversationSummaryApprovedEvent includeReboardingMessages(Boolean includeReboardingMessages) {
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

	public ConversationSummaryApprovedEvent generatedSummary(String generatedSummary) {
		this.generatedSummary = generatedSummary;
		return this;
	}

	/**
	 * The generated summary
	 * 
	 * @return generatedSummary
	 **/
	@ApiModelProperty(value = "The generated summary")
	public String getGeneratedSummary() {
		return generatedSummary;
	}

	public void setGeneratedSummary(String generatedSummary) {
		this.generatedSummary = generatedSummary;
	}

	public ConversationSummaryApprovedEvent reviewRequired(Boolean reviewRequired) {
		this.reviewRequired = reviewRequired;
		return this;
	}

	/**
	 * Specify whether the summary requires reviewing. &lt;p&gt; Its value is defined by the corresponding value of the &#x60;ConversationSummaryTemplate&#x60; when
	 * it was created.
	 * 
	 * @return reviewRequired
	 **/
	@ApiModelProperty(value = "Specify whether the summary requires reviewing. <p> Its value is defined by the corresponding value of the `ConversationSummaryTemplate` when it was created.")
	public Boolean isReviewRequired() {
		return reviewRequired;
	}

	public void setReviewRequired(Boolean reviewRequired) {
		this.reviewRequired = reviewRequired;
	}

	public ConversationSummaryApprovedEvent reviewableBy(List<EConversationAgentParticipationType> reviewableBy) {
		this.reviewableBy = reviewableBy;
		return this;
	}

	public ConversationSummaryApprovedEvent addReviewableByItem(EConversationAgentParticipationType reviewableByItem) {
		if (this.reviewableBy == null) {
			this.reviewableBy = new ArrayList<>();
		}
		this.reviewableBy.add(reviewableByItem);
		return this;
	}

	/**
	 * Conversation participant types allowed to review the summary. Only relevant if &#x60;reviewRequired&#x60; is \&quot;true\&quot;. &lt;p&gt; The value is
	 * inherited from the corresponding value of the &#x60;ConversationSummaryTemplate&#x60; used.
	 * 
	 * @return reviewableBy
	 **/
	@ApiModelProperty(value = "Conversation participant types allowed to review the summary. Only relevant if `reviewRequired` is \"true\". <p> The value is inherited from the corresponding value of the `ConversationSummaryTemplate` used.")
	public List<EConversationAgentParticipationType> getReviewableBy() {
		return reviewableBy;
	}

	public void setReviewableBy(List<EConversationAgentParticipationType> reviewableBy) {
		this.reviewableBy = reviewableBy;
	}

	public ConversationSummaryApprovedEvent visibleTo(List<EConversationAgentParticipationType> visibleTo) {
		this.visibleTo = visibleTo;
		return this;
	}

	public ConversationSummaryApprovedEvent addVisibleToItem(EConversationAgentParticipationType visibleToItem) {
		if (this.visibleTo == null) {
			this.visibleTo = new ArrayList<>();
		}
		this.visibleTo.add(visibleToItem);
		return this;
	}

	/**
	 * Conversation participation types allowed to see the summary. &lt;p&gt; The value is inherited from the corresponding value of the
	 * &#x60;ConversationSummaryTemplate&#x60; used.
	 * 
	 * @return visibleTo
	 **/
	@ApiModelProperty(value = "Conversation participation types allowed to see the summary. <p> The value is inherited from the corresponding value of the `ConversationSummaryTemplate` used.")
	public List<EConversationAgentParticipationType> getVisibleTo() {
		return visibleTo;
	}

	public void setVisibleTo(List<EConversationAgentParticipationType> visibleTo) {
		this.visibleTo = visibleTo;
	}

	public ConversationSummaryApprovedEvent reviewingAgentPersonId(String reviewingAgentPersonId) {
		this.reviewingAgentPersonId = reviewingAgentPersonId;
		return this;
	}

	/**
	 * ID of the agent who reviewed the summary. Only present if review is required and has been completed.
	 * 
	 * @return reviewingAgentPersonId
	 **/
	@ApiModelProperty(value = "ID of the agent who reviewed the summary. Only present if review is required and has been completed.")
	public String getReviewingAgentPersonId() {
		return reviewingAgentPersonId;
	}

	public void setReviewingAgentPersonId(String reviewingAgentPersonId) {
		this.reviewingAgentPersonId = reviewingAgentPersonId;
	}

	public ConversationSummaryApprovedEvent reviewTimestamp(Long reviewTimestamp) {
		this.reviewTimestamp = reviewTimestamp;
		return this;
	}

	/**
	 * Timestamp of the review.
	 * 
	 * @return reviewTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the review.")
	public Long getReviewTimestamp() {
		return reviewTimestamp;
	}

	public void setReviewTimestamp(Long reviewTimestamp) {
		this.reviewTimestamp = reviewTimestamp;
	}

	public ConversationSummaryApprovedEvent reviewedSummary(String reviewedSummary) {
		this.reviewedSummary = reviewedSummary;
		return this;
	}

	/**
	 * The summary after being reviewed. This version of the summary may have been edited by the person who reviewed it.
	 * 
	 * @return reviewedSummary
	 **/
	@ApiModelProperty(value = "The summary after being reviewed. This version of the summary may have been edited by the person who reviewed it.")
	public String getReviewedSummary() {
		return reviewedSummary;
	}

	public void setReviewedSummary(String reviewedSummary) {
		this.reviewedSummary = reviewedSummary;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationSummaryApprovedEvent conversationSummaryApprovedEvent = (ConversationSummaryApprovedEvent) o;
		return Objects.equals(this.$type, conversationSummaryApprovedEvent.$type) &&
				Objects.equals(this.timestamp, conversationSummaryApprovedEvent.timestamp) &&
				Objects.equals(this.eventType, conversationSummaryApprovedEvent.eventType) &&
				Objects.equals(this.accountId, conversationSummaryApprovedEvent.accountId) &&
				Objects.equals(this.summaryTriggerType, conversationSummaryApprovedEvent.summaryTriggerType) &&
				Objects.equals(this.conversationId, conversationSummaryApprovedEvent.conversationId) &&
				Objects.equals(this.conversationSummaryTemplateId, conversationSummaryApprovedEvent.conversationSummaryTemplateId) &&
				Objects.equals(this.conversationSummaryId, conversationSummaryApprovedEvent.conversationSummaryId) &&
				Objects.equals(this.requestingAgentPersonId, conversationSummaryApprovedEvent.requestingAgentPersonId) &&
				Objects.equals(this.firstMessageId, conversationSummaryApprovedEvent.firstMessageId) &&
				Objects.equals(this.lastMessageId, conversationSummaryApprovedEvent.lastMessageId) &&
				Objects.equals(this.firstCallTranscriptId, conversationSummaryApprovedEvent.firstCallTranscriptId) &&
				Objects.equals(this.lastCallTranscriptId, conversationSummaryApprovedEvent.lastCallTranscriptId) &&
				Objects.equals(this.participatingPersonIds, conversationSummaryApprovedEvent.participatingPersonIds) &&
				Objects.equals(this.startTimestamp, conversationSummaryApprovedEvent.startTimestamp) &&
				Objects.equals(this.endTimestamp, conversationSummaryApprovedEvent.endTimestamp) &&
				Objects.equals(this.processingTime, conversationSummaryApprovedEvent.processingTime) &&
				Objects.equals(this.summaryServiceProvider, conversationSummaryApprovedEvent.summaryServiceProvider) &&
				Objects.equals(this.summaryServiceDetails, conversationSummaryApprovedEvent.summaryServiceDetails) &&
				Objects.equals(this.summarizedContentLength, conversationSummaryApprovedEvent.summarizedContentLength) &&
				Objects.equals(this.summaryLanguage, conversationSummaryApprovedEvent.summaryLanguage) &&
				Objects.equals(this.summarizationTimeFrame, conversationSummaryApprovedEvent.summarizationTimeFrame) &&
				Objects.equals(this.includeInternalMessages, conversationSummaryApprovedEvent.includeInternalMessages) &&
				Objects.equals(this.includeOnboardingMessages, conversationSummaryApprovedEvent.includeOnboardingMessages) &&
				Objects.equals(this.includeOffboardingMessages, conversationSummaryApprovedEvent.includeOffboardingMessages) &&
				Objects.equals(this.includeReboardingMessages, conversationSummaryApprovedEvent.includeReboardingMessages) &&
				Objects.equals(this.generatedSummary, conversationSummaryApprovedEvent.generatedSummary) &&
				Objects.equals(this.reviewRequired, conversationSummaryApprovedEvent.reviewRequired) &&
				Objects.equals(this.reviewableBy, conversationSummaryApprovedEvent.reviewableBy) &&
				Objects.equals(this.visibleTo, conversationSummaryApprovedEvent.visibleTo) &&
				Objects.equals(this.reviewingAgentPersonId, conversationSummaryApprovedEvent.reviewingAgentPersonId) &&
				Objects.equals(this.reviewTimestamp, conversationSummaryApprovedEvent.reviewTimestamp) &&
				Objects.equals(this.reviewedSummary, conversationSummaryApprovedEvent.reviewedSummary);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, summaryTriggerType, conversationId, conversationSummaryTemplateId, conversationSummaryId, requestingAgentPersonId, firstMessageId, lastMessageId, firstCallTranscriptId, lastCallTranscriptId, participatingPersonIds, startTimestamp, endTimestamp, processingTime, summaryServiceProvider, summaryServiceDetails, summarizedContentLength, summaryLanguage, summarizationTimeFrame, includeInternalMessages, includeOnboardingMessages, includeOffboardingMessages, includeReboardingMessages, generatedSummary, reviewRequired, reviewableBy, visibleTo, reviewingAgentPersonId, reviewTimestamp, reviewedSummary);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationSummaryApprovedEvent {\n");
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
		sb.append("    generatedSummary: ").append(toIndentedString(generatedSummary)).append("\n");
		sb.append("    reviewRequired: ").append(toIndentedString(reviewRequired)).append("\n");
		sb.append("    reviewableBy: ").append(toIndentedString(reviewableBy)).append("\n");
		sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
		sb.append("    reviewingAgentPersonId: ").append(toIndentedString(reviewingAgentPersonId)).append("\n");
		sb.append("    reviewTimestamp: ").append(toIndentedString(reviewTimestamp)).append("\n");
		sb.append("    reviewedSummary: ").append(toIndentedString(reviewedSummary)).append("\n");
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
