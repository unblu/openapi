
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
 * Summarizes a conversation&#39;s entire lifecycle and aggregate metrics once it has ended. There is exactly one entry per conversation.
 */
@ApiModel(description = "Summarizes a conversation's entire lifecycle and aggregate metrics once it has ended. There is exactly one entry per conversation.")

@JsonPropertyOrder({
	ConversationsEndedAnalyticsKpiData.JSON_PROPERTY_$_TYPE,
	ConversationsEndedAnalyticsKpiData.JSON_PROPERTY_ID,
	ConversationsEndedAnalyticsKpiData.JSON_PROPERTY_EVENT_TIMESTAMP,
	ConversationsEndedAnalyticsKpiData.JSON_PROPERTY_CREATION_TIMESTAMP,
	ConversationsEndedAnalyticsKpiData.JSON_PROPERTY_ONBOARDING_TIMESTAMP,
	ConversationsEndedAnalyticsKpiData.JSON_PROPERTY_FIRST_QUEUED_TIMESTAMP,
	ConversationsEndedAnalyticsKpiData.JSON_PROPERTY_FIRST_ACTIVE_TIMESTAMP,
	ConversationsEndedAnalyticsKpiData.JSON_PROPERTY_OFFBOARDING_TIMESTAMP,
	ConversationsEndedAnalyticsKpiData.JSON_PROPERTY_END_TIMESTAMP,
	ConversationsEndedAnalyticsKpiData.JSON_PROPERTY_END_REASON,
	ConversationsEndedAnalyticsKpiData.JSON_PROPERTY_CONVERSATION,
	ConversationsEndedAnalyticsKpiData.JSON_PROPERTY_METRICS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationsEndedAnalyticsKpiData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONSENDEDANALYTICSKPIDATA("ConversationsEndedAnalyticsKpiData");

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
			return TypeEnum.CONVERSATIONSENDEDANALYTICSKPIDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONSENDEDANALYTICSKPIDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_EVENT_TIMESTAMP = "eventTimestamp";
	@JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
	private Long eventTimestamp;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_ONBOARDING_TIMESTAMP = "onboardingTimestamp";
	@JsonProperty(JSON_PROPERTY_ONBOARDING_TIMESTAMP)
	private Long onboardingTimestamp;

	public static final String JSON_PROPERTY_FIRST_QUEUED_TIMESTAMP = "firstQueuedTimestamp";
	@JsonProperty(JSON_PROPERTY_FIRST_QUEUED_TIMESTAMP)
	private Long firstQueuedTimestamp;

	public static final String JSON_PROPERTY_FIRST_ACTIVE_TIMESTAMP = "firstActiveTimestamp";
	@JsonProperty(JSON_PROPERTY_FIRST_ACTIVE_TIMESTAMP)
	private Long firstActiveTimestamp;

	public static final String JSON_PROPERTY_OFFBOARDING_TIMESTAMP = "offboardingTimestamp";
	@JsonProperty(JSON_PROPERTY_OFFBOARDING_TIMESTAMP)
	private Long offboardingTimestamp;

	public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
	@JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
	private Long endTimestamp;

	public static final String JSON_PROPERTY_END_REASON = "endReason";
	@JsonProperty(JSON_PROPERTY_END_REASON)
	private EConversationEndReason endReason;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationAnalyticsKpiData conversation = null;

	public static final String JSON_PROPERTY_METRICS = "metrics";
	@JsonProperty(JSON_PROPERTY_METRICS)
	private ConversationMetricsAnalyticsKpiData metrics = null;

	public ConversationsEndedAnalyticsKpiData $type(TypeEnum $type) {
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

	public ConversationsEndedAnalyticsKpiData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The unique identifier of the data entry in the analytics KPI table
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The unique identifier of the data entry in the analytics KPI table")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ConversationsEndedAnalyticsKpiData eventTimestamp(Long eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) for the KPI entry. This is the timestamp used for filtering
	 * 
	 * @return eventTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) for the KPI entry. This is the timestamp used for filtering")
	public Long getEventTimestamp() {
		return eventTimestamp;
	}

	public void setEventTimestamp(Long eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
	}

	public ConversationsEndedAnalyticsKpiData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) of when the conversation was created
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) of when the conversation was created")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public ConversationsEndedAnalyticsKpiData onboardingTimestamp(Long onboardingTimestamp) {
		this.onboardingTimestamp = onboardingTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) of when the conversation was onboarded. Optional, may be &#x60;null&#x60; if the conversation was never onboarded.
	 * 
	 * @return onboardingTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) of when the conversation was onboarded. Optional, may be `null` if the conversation was never onboarded.")
	public Long getOnboardingTimestamp() {
		return onboardingTimestamp;
	}

	public void setOnboardingTimestamp(Long onboardingTimestamp) {
		this.onboardingTimestamp = onboardingTimestamp;
	}

	public ConversationsEndedAnalyticsKpiData firstQueuedTimestamp(Long firstQueuedTimestamp) {
		this.firstQueuedTimestamp = firstQueuedTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) of when the conversation was queued for the first time. Optional, may be &#x60;null&#x60; if the conversation was never queued.
	 * 
	 * @return firstQueuedTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) of when the conversation was queued for the first time. Optional, may be `null` if the conversation was never queued.")
	public Long getFirstQueuedTimestamp() {
		return firstQueuedTimestamp;
	}

	public void setFirstQueuedTimestamp(Long firstQueuedTimestamp) {
		this.firstQueuedTimestamp = firstQueuedTimestamp;
	}

	public ConversationsEndedAnalyticsKpiData firstActiveTimestamp(Long firstActiveTimestamp) {
		this.firstActiveTimestamp = firstActiveTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) of when the conversation became active for the first time. Optional, may be &#x60;null&#x60; if the conversation was never active.
	 * 
	 * @return firstActiveTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) of when the conversation became active for the first time. Optional, may be `null` if the conversation was never active.")
	public Long getFirstActiveTimestamp() {
		return firstActiveTimestamp;
	}

	public void setFirstActiveTimestamp(Long firstActiveTimestamp) {
		this.firstActiveTimestamp = firstActiveTimestamp;
	}

	public ConversationsEndedAnalyticsKpiData offboardingTimestamp(Long offboardingTimestamp) {
		this.offboardingTimestamp = offboardingTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) of when the conversation was offboarded. Optional, may be &#x60;null&#x60; if the conversation was never offboarded.
	 * 
	 * @return offboardingTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) of when the conversation was offboarded. Optional, may be `null` if the conversation was never offboarded.")
	public Long getOffboardingTimestamp() {
		return offboardingTimestamp;
	}

	public void setOffboardingTimestamp(Long offboardingTimestamp) {
		this.offboardingTimestamp = offboardingTimestamp;
	}

	public ConversationsEndedAnalyticsKpiData endTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) of when the conversation ended.
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) of when the conversation ended.")
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public ConversationsEndedAnalyticsKpiData endReason(EConversationEndReason endReason) {
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

	public ConversationsEndedAnalyticsKpiData conversation(ConversationAnalyticsKpiData conversation) {
		this.conversation = conversation;
		return this;
	}

	/**
	 * Get conversation
	 * 
	 * @return conversation
	 **/
	@ApiModelProperty(value = "")
	public ConversationAnalyticsKpiData getConversation() {
		return conversation;
	}

	public void setConversation(ConversationAnalyticsKpiData conversation) {
		this.conversation = conversation;
	}

	public ConversationsEndedAnalyticsKpiData metrics(ConversationMetricsAnalyticsKpiData metrics) {
		this.metrics = metrics;
		return this;
	}

	/**
	 * Get metrics
	 * 
	 * @return metrics
	 **/
	@ApiModelProperty(value = "")
	public ConversationMetricsAnalyticsKpiData getMetrics() {
		return metrics;
	}

	public void setMetrics(ConversationMetricsAnalyticsKpiData metrics) {
		this.metrics = metrics;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationsEndedAnalyticsKpiData conversationsEndedAnalyticsKpiData = (ConversationsEndedAnalyticsKpiData) o;
		return Objects.equals(this.$type, conversationsEndedAnalyticsKpiData.$type) &&
				Objects.equals(this.id, conversationsEndedAnalyticsKpiData.id) &&
				Objects.equals(this.eventTimestamp, conversationsEndedAnalyticsKpiData.eventTimestamp) &&
				Objects.equals(this.creationTimestamp, conversationsEndedAnalyticsKpiData.creationTimestamp) &&
				Objects.equals(this.onboardingTimestamp, conversationsEndedAnalyticsKpiData.onboardingTimestamp) &&
				Objects.equals(this.firstQueuedTimestamp, conversationsEndedAnalyticsKpiData.firstQueuedTimestamp) &&
				Objects.equals(this.firstActiveTimestamp, conversationsEndedAnalyticsKpiData.firstActiveTimestamp) &&
				Objects.equals(this.offboardingTimestamp, conversationsEndedAnalyticsKpiData.offboardingTimestamp) &&
				Objects.equals(this.endTimestamp, conversationsEndedAnalyticsKpiData.endTimestamp) &&
				Objects.equals(this.endReason, conversationsEndedAnalyticsKpiData.endReason) &&
				Objects.equals(this.conversation, conversationsEndedAnalyticsKpiData.conversation) &&
				Objects.equals(this.metrics, conversationsEndedAnalyticsKpiData.metrics);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, eventTimestamp, creationTimestamp, onboardingTimestamp, firstQueuedTimestamp, firstActiveTimestamp, offboardingTimestamp, endTimestamp, endReason, conversation, metrics);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationsEndedAnalyticsKpiData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    onboardingTimestamp: ").append(toIndentedString(onboardingTimestamp)).append("\n");
		sb.append("    firstQueuedTimestamp: ").append(toIndentedString(firstQueuedTimestamp)).append("\n");
		sb.append("    firstActiveTimestamp: ").append(toIndentedString(firstActiveTimestamp)).append("\n");
		sb.append("    offboardingTimestamp: ").append(toIndentedString(offboardingTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
		sb.append("    endReason: ").append(toIndentedString(endReason)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
