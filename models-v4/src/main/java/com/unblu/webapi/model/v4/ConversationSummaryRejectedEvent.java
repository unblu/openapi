
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
 * An event triggered every time a conversation summary is rejected during review.
 */
@ApiModel(description = "An event triggered every time a conversation summary is rejected during review.")

@JsonPropertyOrder({
	ConversationSummaryRejectedEvent.JSON_PROPERTY_$_TYPE,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_TIMESTAMP,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_EVENT_TYPE,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_ACCOUNT_ID,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_SUMMARY_TRIGGER_TYPE,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_CONVERSATION_ID,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_CONVERSATION_SUMMARY_TEMPLATE_ID,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_CONVERSATION_SUMMARY_ID,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_REQUESTING_AGENT_PERSON_ID,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_FIRST_MESSAGE_ID,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_LAST_MESSAGE_ID,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_FIRST_CALL_TRANSCRIPT_ID,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_LAST_CALL_TRANSCRIPT_ID,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_PARTICIPATING_PERSON_IDS,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_START_TIMESTAMP,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_END_TIMESTAMP,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_PROCESSING_TIME,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_SUMMARY_SERVICE_PROVIDER,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_SUMMARY_SERVICE_DETAILS,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_SUMMARIZED_CONTENT_LENGTH,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_SUMMARY_LANGUAGE,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_SUMMARIZATION_TIME_FRAME,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_GENERATED_SUMMARY,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_REVIEW_REQUIRED,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_REVIEWABLE_BY,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_VISIBLE_TO,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_REVIEWING_AGENT_PERSON_ID,
	ConversationSummaryRejectedEvent.JSON_PROPERTY_REVIEW_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationSummaryRejectedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONSUMMARYREJECTEDEVENT("ConversationSummaryRejectedEvent");

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
			return TypeEnum.CONVERSATIONSUMMARYREJECTEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONSUMMARYREJECTEDEVENT;

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

	public ConversationSummaryRejectedEvent $type(TypeEnum $type) {
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

	public ConversationSummaryRejectedEvent timestamp(Long timestamp) {
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

	public ConversationSummaryRejectedEvent eventType(String eventType) {
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

	public ConversationSummaryRejectedEvent accountId(String accountId) {
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

	public ConversationSummaryRejectedEvent summaryTriggerType(EConversationSummaryTriggerType summaryTriggerType) {
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

	public ConversationSummaryRejectedEvent conversationId(String conversationId) {
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

	public ConversationSummaryRejectedEvent conversationSummaryTemplateId(String conversationSummaryTemplateId) {
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

	public ConversationSummaryRejectedEvent conversationSummaryId(String conversationSummaryId) {
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

	public ConversationSummaryRejectedEvent requestingAgentPersonId(String requestingAgentPersonId) {
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

	public ConversationSummaryRejectedEvent firstMessageId(String firstMessageId) {
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

	public ConversationSummaryRejectedEvent lastMessageId(String lastMessageId) {
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

	public ConversationSummaryRejectedEvent firstCallTranscriptId(String firstCallTranscriptId) {
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

	public ConversationSummaryRejectedEvent lastCallTranscriptId(String lastCallTranscriptId) {
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

	public ConversationSummaryRejectedEvent participatingPersonIds(List<String> participatingPersonIds) {
		this.participatingPersonIds = participatingPersonIds;
		return this;
	}

	public ConversationSummaryRejectedEvent addParticipatingPersonIdsItem(String participatingPersonIdsItem) {
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

	public ConversationSummaryRejectedEvent startTimestamp(Long startTimestamp) {
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

	public ConversationSummaryRejectedEvent endTimestamp(Long endTimestamp) {
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

	public ConversationSummaryRejectedEvent processingTime(Long processingTime) {
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

	public ConversationSummaryRejectedEvent summaryServiceProvider(EConversationSummaryProvider summaryServiceProvider) {
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

	public ConversationSummaryRejectedEvent summaryServiceDetails(String summaryServiceDetails) {
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

	public ConversationSummaryRejectedEvent summarizedContentLength(Long summarizedContentLength) {
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

	public ConversationSummaryRejectedEvent summaryLanguage(String summaryLanguage) {
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

	public ConversationSummaryRejectedEvent summarizationTimeFrame(ESummarizationTimeFrame summarizationTimeFrame) {
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

	public ConversationSummaryRejectedEvent generatedSummary(String generatedSummary) {
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

	public ConversationSummaryRejectedEvent reviewRequired(Boolean reviewRequired) {
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

	public ConversationSummaryRejectedEvent reviewableBy(List<EConversationAgentParticipationType> reviewableBy) {
		this.reviewableBy = reviewableBy;
		return this;
	}

	public ConversationSummaryRejectedEvent addReviewableByItem(EConversationAgentParticipationType reviewableByItem) {
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

	public ConversationSummaryRejectedEvent visibleTo(List<EConversationAgentParticipationType> visibleTo) {
		this.visibleTo = visibleTo;
		return this;
	}

	public ConversationSummaryRejectedEvent addVisibleToItem(EConversationAgentParticipationType visibleToItem) {
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

	public ConversationSummaryRejectedEvent reviewingAgentPersonId(String reviewingAgentPersonId) {
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

	public ConversationSummaryRejectedEvent reviewTimestamp(Long reviewTimestamp) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationSummaryRejectedEvent conversationSummaryRejectedEvent = (ConversationSummaryRejectedEvent) o;
		return Objects.equals(this.$type, conversationSummaryRejectedEvent.$type) &&
				Objects.equals(this.timestamp, conversationSummaryRejectedEvent.timestamp) &&
				Objects.equals(this.eventType, conversationSummaryRejectedEvent.eventType) &&
				Objects.equals(this.accountId, conversationSummaryRejectedEvent.accountId) &&
				Objects.equals(this.summaryTriggerType, conversationSummaryRejectedEvent.summaryTriggerType) &&
				Objects.equals(this.conversationId, conversationSummaryRejectedEvent.conversationId) &&
				Objects.equals(this.conversationSummaryTemplateId, conversationSummaryRejectedEvent.conversationSummaryTemplateId) &&
				Objects.equals(this.conversationSummaryId, conversationSummaryRejectedEvent.conversationSummaryId) &&
				Objects.equals(this.requestingAgentPersonId, conversationSummaryRejectedEvent.requestingAgentPersonId) &&
				Objects.equals(this.firstMessageId, conversationSummaryRejectedEvent.firstMessageId) &&
				Objects.equals(this.lastMessageId, conversationSummaryRejectedEvent.lastMessageId) &&
				Objects.equals(this.firstCallTranscriptId, conversationSummaryRejectedEvent.firstCallTranscriptId) &&
				Objects.equals(this.lastCallTranscriptId, conversationSummaryRejectedEvent.lastCallTranscriptId) &&
				Objects.equals(this.participatingPersonIds, conversationSummaryRejectedEvent.participatingPersonIds) &&
				Objects.equals(this.startTimestamp, conversationSummaryRejectedEvent.startTimestamp) &&
				Objects.equals(this.endTimestamp, conversationSummaryRejectedEvent.endTimestamp) &&
				Objects.equals(this.processingTime, conversationSummaryRejectedEvent.processingTime) &&
				Objects.equals(this.summaryServiceProvider, conversationSummaryRejectedEvent.summaryServiceProvider) &&
				Objects.equals(this.summaryServiceDetails, conversationSummaryRejectedEvent.summaryServiceDetails) &&
				Objects.equals(this.summarizedContentLength, conversationSummaryRejectedEvent.summarizedContentLength) &&
				Objects.equals(this.summaryLanguage, conversationSummaryRejectedEvent.summaryLanguage) &&
				Objects.equals(this.summarizationTimeFrame, conversationSummaryRejectedEvent.summarizationTimeFrame) &&
				Objects.equals(this.generatedSummary, conversationSummaryRejectedEvent.generatedSummary) &&
				Objects.equals(this.reviewRequired, conversationSummaryRejectedEvent.reviewRequired) &&
				Objects.equals(this.reviewableBy, conversationSummaryRejectedEvent.reviewableBy) &&
				Objects.equals(this.visibleTo, conversationSummaryRejectedEvent.visibleTo) &&
				Objects.equals(this.reviewingAgentPersonId, conversationSummaryRejectedEvent.reviewingAgentPersonId) &&
				Objects.equals(this.reviewTimestamp, conversationSummaryRejectedEvent.reviewTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, summaryTriggerType, conversationId, conversationSummaryTemplateId, conversationSummaryId, requestingAgentPersonId, firstMessageId, lastMessageId, firstCallTranscriptId, lastCallTranscriptId, participatingPersonIds, startTimestamp, endTimestamp, processingTime, summaryServiceProvider, summaryServiceDetails, summarizedContentLength, summaryLanguage, summarizationTimeFrame, generatedSummary, reviewRequired, reviewableBy, visibleTo, reviewingAgentPersonId, reviewTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationSummaryRejectedEvent {\n");
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
		sb.append("    generatedSummary: ").append(toIndentedString(generatedSummary)).append("\n");
		sb.append("    reviewRequired: ").append(toIndentedString(reviewRequired)).append("\n");
		sb.append("    reviewableBy: ").append(toIndentedString(reviewableBy)).append("\n");
		sb.append("    visibleTo: ").append(toIndentedString(visibleTo)).append("\n");
		sb.append("    reviewingAgentPersonId: ").append(toIndentedString(reviewingAgentPersonId)).append("\n");
		sb.append("    reviewTimestamp: ").append(toIndentedString(reviewTimestamp)).append("\n");
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
