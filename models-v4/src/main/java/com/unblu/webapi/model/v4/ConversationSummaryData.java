
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
 * A model that represents a conversation summary.
 */
@ApiModel(description = "A model that represents a conversation summary.")

@JsonPropertyOrder({
	ConversationSummaryData.JSON_PROPERTY_$_TYPE,
	ConversationSummaryData.JSON_PROPERTY_ID,
	ConversationSummaryData.JSON_PROPERTY_CREATION_TIMESTAMP,
	ConversationSummaryData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	ConversationSummaryData.JSON_PROPERTY_ACCOUNT_ID,
	ConversationSummaryData.JSON_PROPERTY_SUMMARY_TRIGGER_TYPE,
	ConversationSummaryData.JSON_PROPERTY_CONVERSATION_SUMMARY_TEMPLATE_ID,
	ConversationSummaryData.JSON_PROPERTY_SUMMARIZATION_STATE,
	ConversationSummaryData.JSON_PROPERTY_REQUESTING_AGENT_PERSON_ID,
	ConversationSummaryData.JSON_PROPERTY_REVIEWING_AGENT_PERSON_ID,
	ConversationSummaryData.JSON_PROPERTY_REVIEW_TIMESTAMP,
	ConversationSummaryData.JSON_PROPERTY_REJECTING_REASON,
	ConversationSummaryData.JSON_PROPERTY_FAIL_REASON,
	ConversationSummaryData.JSON_PROPERTY_CONVERSATION_ID,
	ConversationSummaryData.JSON_PROPERTY_FIRST_MESSAGE_ID,
	ConversationSummaryData.JSON_PROPERTY_LAST_MESSAGE_ID,
	ConversationSummaryData.JSON_PROPERTY_SUMMARIZED_MESSAGES_COUNT,
	ConversationSummaryData.JSON_PROPERTY_FIRST_CALL_TRANSCRIPT_ID,
	ConversationSummaryData.JSON_PROPERTY_LAST_CALL_TRANSCRIPT_ID,
	ConversationSummaryData.JSON_PROPERTY_PARTICIPATING_PERSON_IDS,
	ConversationSummaryData.JSON_PROPERTY_START_TIMESTAMP,
	ConversationSummaryData.JSON_PROPERTY_END_TIMESTAMP,
	ConversationSummaryData.JSON_PROPERTY_PROCESSING_TIME,
	ConversationSummaryData.JSON_PROPERTY_SUMMARY_SERVICE_PROVIDER,
	ConversationSummaryData.JSON_PROPERTY_SUMMARY_SERVICE_DETAILS,
	ConversationSummaryData.JSON_PROPERTY_SUMMARIZED_CONTENT_LENGTH,
	ConversationSummaryData.JSON_PROPERTY_GENERATED_SUMMARY,
	ConversationSummaryData.JSON_PROPERTY_REVIEWED_SUMMARY,
	ConversationSummaryData.JSON_PROPERTY_SUMMARY_LANGUAGE,
	ConversationSummaryData.JSON_PROPERTY_REVIEW_REQUIRED,
	ConversationSummaryData.JSON_PROPERTY_REVIEWABLE_BY,
	ConversationSummaryData.JSON_PROPERTY_VISIBLE_TO,
	ConversationSummaryData.JSON_PROPERTY_SUMMARIZATION_TIME_FRAME,
	ConversationSummaryData.JSON_PROPERTY_INCLUDE_INTERNAL_MESSAGES,
	ConversationSummaryData.JSON_PROPERTY_INCLUDE_ONBOARDING_MESSAGES,
	ConversationSummaryData.JSON_PROPERTY_INCLUDE_OFFBOARDING_MESSAGES,
	ConversationSummaryData.JSON_PROPERTY_INCLUDE_REBOARDING_MESSAGES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationSummaryData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONSUMMARYDATA("ConversationSummaryData");

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
			return TypeEnum.CONVERSATIONSUMMARYDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONSUMMARYDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SUMMARY_TRIGGER_TYPE = "summaryTriggerType";
	@JsonProperty(JSON_PROPERTY_SUMMARY_TRIGGER_TYPE)
	private EConversationSummaryTriggerType summaryTriggerType;

	public static final String JSON_PROPERTY_CONVERSATION_SUMMARY_TEMPLATE_ID = "conversationSummaryTemplateId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_SUMMARY_TEMPLATE_ID)
	private String conversationSummaryTemplateId;

	public static final String JSON_PROPERTY_SUMMARIZATION_STATE = "summarizationState";
	@JsonProperty(JSON_PROPERTY_SUMMARIZATION_STATE)
	private EConversationSummarizationState summarizationState;

	public static final String JSON_PROPERTY_REQUESTING_AGENT_PERSON_ID = "requestingAgentPersonId";
	@JsonProperty(JSON_PROPERTY_REQUESTING_AGENT_PERSON_ID)
	private String requestingAgentPersonId;

	public static final String JSON_PROPERTY_REVIEWING_AGENT_PERSON_ID = "reviewingAgentPersonId";
	@JsonProperty(JSON_PROPERTY_REVIEWING_AGENT_PERSON_ID)
	private String reviewingAgentPersonId;

	public static final String JSON_PROPERTY_REVIEW_TIMESTAMP = "reviewTimestamp";
	@JsonProperty(JSON_PROPERTY_REVIEW_TIMESTAMP)
	private Long reviewTimestamp;

	public static final String JSON_PROPERTY_REJECTING_REASON = "rejectingReason";
	@JsonProperty(JSON_PROPERTY_REJECTING_REASON)
	private String rejectingReason;

	public static final String JSON_PROPERTY_FAIL_REASON = "failReason";
	@JsonProperty(JSON_PROPERTY_FAIL_REASON)
	private EConversationSummaryFailReason failReason;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_FIRST_MESSAGE_ID = "firstMessageId";
	@JsonProperty(JSON_PROPERTY_FIRST_MESSAGE_ID)
	private String firstMessageId;

	public static final String JSON_PROPERTY_LAST_MESSAGE_ID = "lastMessageId";
	@JsonProperty(JSON_PROPERTY_LAST_MESSAGE_ID)
	private String lastMessageId;

	public static final String JSON_PROPERTY_SUMMARIZED_MESSAGES_COUNT = "summarizedMessagesCount";
	@JsonProperty(JSON_PROPERTY_SUMMARIZED_MESSAGES_COUNT)
	private Long summarizedMessagesCount;

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

	public static final String JSON_PROPERTY_GENERATED_SUMMARY = "generatedSummary";
	@JsonProperty(JSON_PROPERTY_GENERATED_SUMMARY)
	private String generatedSummary;

	public static final String JSON_PROPERTY_REVIEWED_SUMMARY = "reviewedSummary";
	@JsonProperty(JSON_PROPERTY_REVIEWED_SUMMARY)
	private String reviewedSummary;

	public static final String JSON_PROPERTY_SUMMARY_LANGUAGE = "summaryLanguage";
	@JsonProperty(JSON_PROPERTY_SUMMARY_LANGUAGE)
	private String summaryLanguage;

	public static final String JSON_PROPERTY_REVIEW_REQUIRED = "reviewRequired";
	@JsonProperty(JSON_PROPERTY_REVIEW_REQUIRED)
	private Boolean reviewRequired;

	public static final String JSON_PROPERTY_REVIEWABLE_BY = "reviewableBy";
	@JsonProperty(JSON_PROPERTY_REVIEWABLE_BY)
	private List<EConversationAgentParticipationType> reviewableBy = null;

	public static final String JSON_PROPERTY_VISIBLE_TO = "visibleTo";
	@JsonProperty(JSON_PROPERTY_VISIBLE_TO)
	private List<EConversationAgentParticipationType> visibleTo = null;

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

	public ConversationSummaryData $type(TypeEnum $type) {
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

	public ConversationSummaryData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique ID of the entity. When creating an entity, this property can be omitted; it&#39;s generated by the server.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique ID of the entity. When creating an entity, this property can be omitted; it's generated by the server.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ConversationSummaryData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be
	 * omitted. Note: If you set this property, Unblu returns the same value, but it isn&#39;t written to storage and doesn&#39;t affect data consistency.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be omitted. Note: If you set this property, Unblu returns the same value, but it isn't written to storage and doesn't affect data consistency.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public ConversationSummaryData modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational
	 * character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it
	 * will not be written to the storage and will not effect the data consistency.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data consistency.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public ConversationSummaryData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It is filled by the Unblu server with the account ID of the
	 * user currently logged in. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It is filled by the Unblu server with the account ID of the user currently logged in. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public ConversationSummaryData summaryTriggerType(EConversationSummaryTriggerType summaryTriggerType) {
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

	public ConversationSummaryData conversationSummaryTemplateId(String conversationSummaryTemplateId) {
		this.conversationSummaryTemplateId = conversationSummaryTemplateId;
		return this;
	}

	/**
	 * ID of the template to use for the summary.
	 * 
	 * @return conversationSummaryTemplateId
	 **/
	@ApiModelProperty(value = "ID of the template to use for the summary.")
	public String getConversationSummaryTemplateId() {
		return conversationSummaryTemplateId;
	}

	public void setConversationSummaryTemplateId(String conversationSummaryTemplateId) {
		this.conversationSummaryTemplateId = conversationSummaryTemplateId;
	}

	public ConversationSummaryData summarizationState(EConversationSummarizationState summarizationState) {
		this.summarizationState = summarizationState;
		return this;
	}

	/**
	 * Get summarizationState
	 * 
	 * @return summarizationState
	 **/
	@ApiModelProperty(value = "")
	public EConversationSummarizationState getSummarizationState() {
		return summarizationState;
	}

	public void setSummarizationState(EConversationSummarizationState summarizationState) {
		this.summarizationState = summarizationState;
	}

	public ConversationSummaryData requestingAgentPersonId(String requestingAgentPersonId) {
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

	public ConversationSummaryData reviewingAgentPersonId(String reviewingAgentPersonId) {
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

	public ConversationSummaryData reviewTimestamp(Long reviewTimestamp) {
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

	public ConversationSummaryData rejectingReason(String rejectingReason) {
		this.rejectingReason = rejectingReason;
		return this;
	}

	/**
	 * The reason why the summary was rejected.
	 * 
	 * @return rejectingReason
	 **/
	@ApiModelProperty(value = "The reason why the summary was rejected.")
	public String getRejectingReason() {
		return rejectingReason;
	}

	public void setRejectingReason(String rejectingReason) {
		this.rejectingReason = rejectingReason;
	}

	public ConversationSummaryData failReason(EConversationSummaryFailReason failReason) {
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

	public ConversationSummaryData conversationId(String conversationId) {
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

	public ConversationSummaryData firstMessageId(String firstMessageId) {
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

	public ConversationSummaryData lastMessageId(String lastMessageId) {
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

	public ConversationSummaryData summarizedMessagesCount(Long summarizedMessagesCount) {
		this.summarizedMessagesCount = summarizedMessagesCount;
		return this;
	}

	/**
	 * The number of messages summarized.
	 * 
	 * @return summarizedMessagesCount
	 **/
	@ApiModelProperty(value = "The number of messages summarized.")
	public Long getSummarizedMessagesCount() {
		return summarizedMessagesCount;
	}

	public void setSummarizedMessagesCount(Long summarizedMessagesCount) {
		this.summarizedMessagesCount = summarizedMessagesCount;
	}

	public ConversationSummaryData firstCallTranscriptId(String firstCallTranscriptId) {
		this.firstCallTranscriptId = firstCallTranscriptId;
		return this;
	}

	/**
	 * ID of the first call transcript included in the summary. Only present if at least one call transcript was part of the summarized content.
	 * 
	 * @return firstCallTranscriptId
	 **/
	@ApiModelProperty(value = "ID of the first call transcript included in the summary. Only present if at least one call transcript was part of the summarized content.")
	public String getFirstCallTranscriptId() {
		return firstCallTranscriptId;
	}

	public void setFirstCallTranscriptId(String firstCallTranscriptId) {
		this.firstCallTranscriptId = firstCallTranscriptId;
	}

	public ConversationSummaryData lastCallTranscriptId(String lastCallTranscriptId) {
		this.lastCallTranscriptId = lastCallTranscriptId;
		return this;
	}

	/**
	 * ID of the last call transcript included in the summary. Only present if at least one call transcript was part of the summarized content.
	 * 
	 * @return lastCallTranscriptId
	 **/
	@ApiModelProperty(value = "ID of the last call transcript included in the summary. Only present if at least one call transcript was part of the summarized content.")
	public String getLastCallTranscriptId() {
		return lastCallTranscriptId;
	}

	public void setLastCallTranscriptId(String lastCallTranscriptId) {
		this.lastCallTranscriptId = lastCallTranscriptId;
	}

	public ConversationSummaryData participatingPersonIds(List<String> participatingPersonIds) {
		this.participatingPersonIds = participatingPersonIds;
		return this;
	}

	public ConversationSummaryData addParticipatingPersonIdsItem(String participatingPersonIdsItem) {
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

	public ConversationSummaryData startTimestamp(Long startTimestamp) {
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

	public ConversationSummaryData endTimestamp(Long endTimestamp) {
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

	public ConversationSummaryData processingTime(Long processingTime) {
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

	public ConversationSummaryData summaryServiceProvider(EConversationSummaryProvider summaryServiceProvider) {
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

	public ConversationSummaryData summaryServiceDetails(String summaryServiceDetails) {
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

	public ConversationSummaryData summarizedContentLength(Long summarizedContentLength) {
		this.summarizedContentLength = summarizedContentLength;
		return this;
	}

	/**
	 * Number of characters in the summarized content
	 * 
	 * @return summarizedContentLength
	 **/
	@ApiModelProperty(value = "Number of characters in the summarized content")
	public Long getSummarizedContentLength() {
		return summarizedContentLength;
	}

	public void setSummarizedContentLength(Long summarizedContentLength) {
		this.summarizedContentLength = summarizedContentLength;
	}

	public ConversationSummaryData generatedSummary(String generatedSummary) {
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

	public ConversationSummaryData reviewedSummary(String reviewedSummary) {
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

	public ConversationSummaryData summaryLanguage(String summaryLanguage) {
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

	public ConversationSummaryData reviewRequired(Boolean reviewRequired) {
		this.reviewRequired = reviewRequired;
		return this;
	}

	/**
	 * Specify whether the summary requires reviewing. &lt;p&gt; The value is inherited from the corresponding value of the &#x60;ConversationSummaryTemplate&#x60;
	 * used.
	 * 
	 * @return reviewRequired
	 **/
	@ApiModelProperty(value = "Specify whether the summary requires reviewing. <p> The value is inherited from the corresponding value of the `ConversationSummaryTemplate` used.")
	public Boolean isReviewRequired() {
		return reviewRequired;
	}

	public void setReviewRequired(Boolean reviewRequired) {
		this.reviewRequired = reviewRequired;
	}

	public ConversationSummaryData reviewableBy(List<EConversationAgentParticipationType> reviewableBy) {
		this.reviewableBy = reviewableBy;
		return this;
	}

	public ConversationSummaryData addReviewableByItem(EConversationAgentParticipationType reviewableByItem) {
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

	public ConversationSummaryData visibleTo(List<EConversationAgentParticipationType> visibleTo) {
		this.visibleTo = visibleTo;
		return this;
	}

	public ConversationSummaryData addVisibleToItem(EConversationAgentParticipationType visibleToItem) {
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

	public ConversationSummaryData summarizationTimeFrame(ESummarizationTimeFrame summarizationTimeFrame) {
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

	public ConversationSummaryData includeInternalMessages(Boolean includeInternalMessages) {
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

	public ConversationSummaryData includeOnboardingMessages(Boolean includeOnboardingMessages) {
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

	public ConversationSummaryData includeOffboardingMessages(Boolean includeOffboardingMessages) {
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

	public ConversationSummaryData includeReboardingMessages(Boolean includeReboardingMessages) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationSummaryData conversationSummaryData = (ConversationSummaryData) o;
		return Objects.equals(this.$type, conversationSummaryData.$type) &&
				Objects.equals(this.id, conversationSummaryData.id) &&
				Objects.equals(this.creationTimestamp, conversationSummaryData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, conversationSummaryData.modificationTimestamp) &&
				Objects.equals(this.accountId, conversationSummaryData.accountId) &&
				Objects.equals(this.summaryTriggerType, conversationSummaryData.summaryTriggerType) &&
				Objects.equals(this.conversationSummaryTemplateId, conversationSummaryData.conversationSummaryTemplateId) &&
				Objects.equals(this.summarizationState, conversationSummaryData.summarizationState) &&
				Objects.equals(this.requestingAgentPersonId, conversationSummaryData.requestingAgentPersonId) &&
				Objects.equals(this.reviewingAgentPersonId, conversationSummaryData.reviewingAgentPersonId) &&
				Objects.equals(this.reviewTimestamp, conversationSummaryData.reviewTimestamp) &&
				Objects.equals(this.rejectingReason, conversationSummaryData.rejectingReason) &&
				Objects.equals(this.failReason, conversationSummaryData.failReason) &&
				Objects.equals(this.conversationId, conversationSummaryData.conversationId) &&
				Objects.equals(this.firstMessageId, conversationSummaryData.firstMessageId) &&
				Objects.equals(this.lastMessageId, conversationSummaryData.lastMessageId) &&
				Objects.equals(this.summarizedMessagesCount, conversationSummaryData.summarizedMessagesCount) &&
				Objects.equals(this.firstCallTranscriptId, conversationSummaryData.firstCallTranscriptId) &&
				Objects.equals(this.lastCallTranscriptId, conversationSummaryData.lastCallTranscriptId) &&
				Objects.equals(this.participatingPersonIds, conversationSummaryData.participatingPersonIds) &&
				Objects.equals(this.startTimestamp, conversationSummaryData.startTimestamp) &&
				Objects.equals(this.endTimestamp, conversationSummaryData.endTimestamp) &&
				Objects.equals(this.processingTime, conversationSummaryData.processingTime) &&
				Objects.equals(this.summaryServiceProvider, conversationSummaryData.summaryServiceProvider) &&
				Objects.equals(this.summaryServiceDetails, conversationSummaryData.summaryServiceDetails) &&
				Objects.equals(this.summarizedContentLength, conversationSummaryData.summarizedContentLength) &&
				Objects.equals(this.generatedSummary, conversationSummaryData.generatedSummary) &&
				Objects.equals(this.reviewedSummary, conversationSummaryData.reviewedSummary) &&
				Objects.equals(this.summaryLanguage, conversationSummaryData.summaryLanguage) &&
				Objects.equals(this.reviewRequired, conversationSummaryData.reviewRequired) &&
				Objects.equals(this.reviewableBy, conversationSummaryData.reviewableBy) &&
				Objects.equals(this.visibleTo, conversationSummaryData.visibleTo) &&
				Objects.equals(this.summarizationTimeFrame, conversationSummaryData.summarizationTimeFrame) &&
				Objects.equals(this.includeInternalMessages, conversationSummaryData.includeInternalMessages) &&
				Objects.equals(this.includeOnboardingMessages, conversationSummaryData.includeOnboardingMessages) &&
				Objects.equals(this.includeOffboardingMessages, conversationSummaryData.includeOffboardingMessages) &&
				Objects.equals(this.includeReboardingMessages, conversationSummaryData.includeReboardingMessages);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, accountId, summaryTriggerType, conversationSummaryTemplateId, summarizationState, requestingAgentPersonId, reviewingAgentPersonId, reviewTimestamp, rejectingReason, failReason, conversationId, firstMessageId, lastMessageId, summarizedMessagesCount, firstCallTranscriptId, lastCallTranscriptId, participatingPersonIds, startTimestamp, endTimestamp, processingTime, summaryServiceProvider, summaryServiceDetails, summarizedContentLength, generatedSummary, reviewedSummary, summaryLanguage, reviewRequired, reviewableBy, visibleTo, summarizationTimeFrame, includeInternalMessages, includeOnboardingMessages, includeOffboardingMessages, includeReboardingMessages);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationSummaryData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    summaryTriggerType: ").append(toIndentedString(summaryTriggerType)).append("\n");
		sb.append("    conversationSummaryTemplateId: ").append(toIndentedString(conversationSummaryTemplateId)).append("\n");
		sb.append("    summarizationState: ").append(toIndentedString(summarizationState)).append("\n");
		sb.append("    requestingAgentPersonId: ").append(toIndentedString(requestingAgentPersonId)).append("\n");
		sb.append("    reviewingAgentPersonId: ").append(toIndentedString(reviewingAgentPersonId)).append("\n");
		sb.append("    reviewTimestamp: ").append(toIndentedString(reviewTimestamp)).append("\n");
		sb.append("    rejectingReason: ").append(toIndentedString(rejectingReason)).append("\n");
		sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    firstMessageId: ").append(toIndentedString(firstMessageId)).append("\n");
		sb.append("    lastMessageId: ").append(toIndentedString(lastMessageId)).append("\n");
		sb.append("    summarizedMessagesCount: ").append(toIndentedString(summarizedMessagesCount)).append("\n");
		sb.append("    firstCallTranscriptId: ").append(toIndentedString(firstCallTranscriptId)).append("\n");
		sb.append("    lastCallTranscriptId: ").append(toIndentedString(lastCallTranscriptId)).append("\n");
		sb.append("    participatingPersonIds: ").append(toIndentedString(participatingPersonIds)).append("\n");
		sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
		sb.append("    processingTime: ").append(toIndentedString(processingTime)).append("\n");
		sb.append("    summaryServiceProvider: ").append(toIndentedString(summaryServiceProvider)).append("\n");
		sb.append("    summaryServiceDetails: ").append(toIndentedString(summaryServiceDetails)).append("\n");
		sb.append("    summarizedContentLength: ").append(toIndentedString(summarizedContentLength)).append("\n");
		sb.append("    generatedSummary: ").append(toIndentedString(generatedSummary)).append("\n");
		sb.append("    reviewedSummary: ").append(toIndentedString(reviewedSummary)).append("\n");
		sb.append("    summaryLanguage: ").append(toIndentedString(summaryLanguage)).append("\n");
		sb.append("    reviewRequired: ").append(toIndentedString(reviewRequired)).append("\n");
		sb.append("    reviewableBy: ").append(toIndentedString(reviewableBy)).append("\n");
		sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
		sb.append("    summarizationTimeFrame: ").append(toIndentedString(summarizationTimeFrame)).append("\n");
		sb.append("    includeInternalMessages: ").append(toIndentedString(includeInternalMessages)).append("\n");
		sb.append("    includeOnboardingMessages: ").append(toIndentedString(includeOnboardingMessages)).append("\n");
		sb.append("    includeOffboardingMessages: ").append(toIndentedString(includeOffboardingMessages)).append("\n");
		sb.append("    includeReboardingMessages: ").append(toIndentedString(includeReboardingMessages)).append("\n");
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
