
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
 * Represents a completed call lifecycle within a conversation. Each entry is backed by a @code{ conversation.call.ended} event and records the details and
 * metadata of audio or video calls.
 */
@ApiModel(description = "Represents a completed call lifecycle within a conversation. Each entry is backed by a @code{ conversation.call.ended} event and records the details and metadata of audio or video calls.")

@JsonPropertyOrder({
	CallsAnalyticsKpiData.JSON_PROPERTY_$_TYPE,
	CallsAnalyticsKpiData.JSON_PROPERTY_ID,
	CallsAnalyticsKpiData.JSON_PROPERTY_EVENT_TIMESTAMP,
	CallsAnalyticsKpiData.JSON_PROPERTY_INITIATION_TIMESTAMP,
	CallsAnalyticsKpiData.JSON_PROPERTY_ACCEPT_TIMESTAMP,
	CallsAnalyticsKpiData.JSON_PROPERTY_ESTABLISHED_TIMESTAMP,
	CallsAnalyticsKpiData.JSON_PROPERTY_END_TIMESTAMP,
	CallsAnalyticsKpiData.JSON_PROPERTY_ACTIVE_DURATION_MS,
	CallsAnalyticsKpiData.JSON_PROPERTY_SERVICE_PROVIDER_TYPE,
	CallsAnalyticsKpiData.JSON_PROPERTY_END_REASON,
	CallsAnalyticsKpiData.JSON_PROPERTY_TYPE,
	CallsAnalyticsKpiData.JSON_PROPERTY_OVERALL_CALL_PARTICIPANTS_COUNT,
	CallsAnalyticsKpiData.JSON_PROPERTY_CONVERSATION,
	CallsAnalyticsKpiData.JSON_PROPERTY_INITIATOR,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CallsAnalyticsKpiData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CALLSANALYTICSKPIDATA("CallsAnalyticsKpiData");

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
			return TypeEnum.CALLSANALYTICSKPIDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CALLSANALYTICSKPIDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_EVENT_TIMESTAMP = "eventTimestamp";
	@JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
	private Long eventTimestamp;

	public static final String JSON_PROPERTY_INITIATION_TIMESTAMP = "initiationTimestamp";
	@JsonProperty(JSON_PROPERTY_INITIATION_TIMESTAMP)
	private Long initiationTimestamp;

	public static final String JSON_PROPERTY_ACCEPT_TIMESTAMP = "acceptTimestamp";
	@JsonProperty(JSON_PROPERTY_ACCEPT_TIMESTAMP)
	private Long acceptTimestamp;

	public static final String JSON_PROPERTY_ESTABLISHED_TIMESTAMP = "establishedTimestamp";
	@JsonProperty(JSON_PROPERTY_ESTABLISHED_TIMESTAMP)
	private Long establishedTimestamp;

	public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
	@JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
	private Long endTimestamp;

	public static final String JSON_PROPERTY_ACTIVE_DURATION_MS = "activeDurationMs";
	@JsonProperty(JSON_PROPERTY_ACTIVE_DURATION_MS)
	private Long activeDurationMs;

	public static final String JSON_PROPERTY_SERVICE_PROVIDER_TYPE = "serviceProviderType";
	@JsonProperty(JSON_PROPERTY_SERVICE_PROVIDER_TYPE)
	private ECallServiceProvider serviceProviderType;

	public static final String JSON_PROPERTY_END_REASON = "endReason";
	@JsonProperty(JSON_PROPERTY_END_REASON)
	private ECallEndReason endReason;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ECallType type;

	public static final String JSON_PROPERTY_OVERALL_CALL_PARTICIPANTS_COUNT = "overallCallParticipantsCount";
	@JsonProperty(JSON_PROPERTY_OVERALL_CALL_PARTICIPANTS_COUNT)
	private Integer overallCallParticipantsCount;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationAnalyticsKpiData conversation = null;

	public static final String JSON_PROPERTY_INITIATOR = "initiator";
	@JsonProperty(JSON_PROPERTY_INITIATOR)
	private PersonAnalyticsKpiData initiator = null;

	public CallsAnalyticsKpiData $type(TypeEnum $type) {
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

	public CallsAnalyticsKpiData id(String id) {
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

	public CallsAnalyticsKpiData eventTimestamp(Long eventTimestamp) {
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

	public CallsAnalyticsKpiData initiationTimestamp(Long initiationTimestamp) {
		this.initiationTimestamp = initiationTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when the call was initiated.
	 * 
	 * @return initiationTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when the call was initiated.")
	public Long getInitiationTimestamp() {
		return initiationTimestamp;
	}

	public void setInitiationTimestamp(Long initiationTimestamp) {
		this.initiationTimestamp = initiationTimestamp;
	}

	public CallsAnalyticsKpiData acceptTimestamp(Long acceptTimestamp) {
		this.acceptTimestamp = acceptTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when the call was first accepted by a participant marking the start of that participant&#39;s connection phase. Optional, may be @code{
	 * null}if the call was never accepted.
	 * 
	 * @return acceptTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when the call was first accepted by a participant marking the start of that participant's connection phase. Optional, may be @code{ null}if the call was never accepted.")
	public Long getAcceptTimestamp() {
		return acceptTimestamp;
	}

	public void setAcceptTimestamp(Long acceptTimestamp) {
		this.acceptTimestamp = acceptTimestamp;
	}

	public CallsAnalyticsKpiData establishedTimestamp(Long establishedTimestamp) {
		this.establishedTimestamp = establishedTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when at least two participants successfully connected to the call service provider. Optional, may be @code{ null} if the call was never
	 * established.
	 * 
	 * @return establishedTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when at least two participants successfully connected to the call service provider. Optional, may be @code{ null} if the call was never established.")
	public Long getEstablishedTimestamp() {
		return establishedTimestamp;
	}

	public void setEstablishedTimestamp(Long establishedTimestamp) {
		this.establishedTimestamp = establishedTimestamp;
	}

	public CallsAnalyticsKpiData endTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when the call ended.
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when the call ended.")
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public CallsAnalyticsKpiData activeDurationMs(Long activeDurationMs) {
		this.activeDurationMs = activeDurationMs;
		return this;
	}

	/**
	 * The duration (ms) between the time the call was established and when it ended.
	 * 
	 * @return activeDurationMs
	 **/
	@ApiModelProperty(value = "The duration (ms) between the time the call was established and when it ended.")
	public Long getActiveDurationMs() {
		return activeDurationMs;
	}

	public void setActiveDurationMs(Long activeDurationMs) {
		this.activeDurationMs = activeDurationMs;
	}

	public CallsAnalyticsKpiData serviceProviderType(ECallServiceProvider serviceProviderType) {
		this.serviceProviderType = serviceProviderType;
		return this;
	}

	/**
	 * Get serviceProviderType
	 * 
	 * @return serviceProviderType
	 **/
	@ApiModelProperty(value = "")
	public ECallServiceProvider getServiceProviderType() {
		return serviceProviderType;
	}

	public void setServiceProviderType(ECallServiceProvider serviceProviderType) {
		this.serviceProviderType = serviceProviderType;
	}

	public CallsAnalyticsKpiData endReason(ECallEndReason endReason) {
		this.endReason = endReason;
		return this;
	}

	/**
	 * Get endReason
	 * 
	 * @return endReason
	 **/
	@ApiModelProperty(value = "")
	public ECallEndReason getEndReason() {
		return endReason;
	}

	public void setEndReason(ECallEndReason endReason) {
		this.endReason = endReason;
	}

	public CallsAnalyticsKpiData type(ECallType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public ECallType getType() {
		return type;
	}

	public void setType(ECallType type) {
		this.type = type;
	}

	public CallsAnalyticsKpiData overallCallParticipantsCount(Integer overallCallParticipantsCount) {
		this.overallCallParticipantsCount = overallCallParticipantsCount;
		return this;
	}

	/**
	 * The total number of unique participants in the call.
	 * 
	 * @return overallCallParticipantsCount
	 **/
	@ApiModelProperty(value = "The total number of unique participants in the call.")
	public Integer getOverallCallParticipantsCount() {
		return overallCallParticipantsCount;
	}

	public void setOverallCallParticipantsCount(Integer overallCallParticipantsCount) {
		this.overallCallParticipantsCount = overallCallParticipantsCount;
	}

	public CallsAnalyticsKpiData conversation(ConversationAnalyticsKpiData conversation) {
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

	public CallsAnalyticsKpiData initiator(PersonAnalyticsKpiData initiator) {
		this.initiator = initiator;
		return this;
	}

	/**
	 * Get initiator
	 * 
	 * @return initiator
	 **/
	@ApiModelProperty(value = "")
	public PersonAnalyticsKpiData getInitiator() {
		return initiator;
	}

	public void setInitiator(PersonAnalyticsKpiData initiator) {
		this.initiator = initiator;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CallsAnalyticsKpiData callsAnalyticsKpiData = (CallsAnalyticsKpiData) o;
		return Objects.equals(this.$type, callsAnalyticsKpiData.$type) &&
				Objects.equals(this.id, callsAnalyticsKpiData.id) &&
				Objects.equals(this.eventTimestamp, callsAnalyticsKpiData.eventTimestamp) &&
				Objects.equals(this.initiationTimestamp, callsAnalyticsKpiData.initiationTimestamp) &&
				Objects.equals(this.acceptTimestamp, callsAnalyticsKpiData.acceptTimestamp) &&
				Objects.equals(this.establishedTimestamp, callsAnalyticsKpiData.establishedTimestamp) &&
				Objects.equals(this.endTimestamp, callsAnalyticsKpiData.endTimestamp) &&
				Objects.equals(this.activeDurationMs, callsAnalyticsKpiData.activeDurationMs) &&
				Objects.equals(this.serviceProviderType, callsAnalyticsKpiData.serviceProviderType) &&
				Objects.equals(this.endReason, callsAnalyticsKpiData.endReason) &&
				Objects.equals(this.type, callsAnalyticsKpiData.type) &&
				Objects.equals(this.overallCallParticipantsCount, callsAnalyticsKpiData.overallCallParticipantsCount) &&
				Objects.equals(this.conversation, callsAnalyticsKpiData.conversation) &&
				Objects.equals(this.initiator, callsAnalyticsKpiData.initiator);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, eventTimestamp, initiationTimestamp, acceptTimestamp, establishedTimestamp, endTimestamp, activeDurationMs, serviceProviderType, endReason, type, overallCallParticipantsCount, conversation, initiator);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CallsAnalyticsKpiData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
		sb.append("    initiationTimestamp: ").append(toIndentedString(initiationTimestamp)).append("\n");
		sb.append("    acceptTimestamp: ").append(toIndentedString(acceptTimestamp)).append("\n");
		sb.append("    establishedTimestamp: ").append(toIndentedString(establishedTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
		sb.append("    activeDurationMs: ").append(toIndentedString(activeDurationMs)).append("\n");
		sb.append("    serviceProviderType: ").append(toIndentedString(serviceProviderType)).append("\n");
		sb.append("    endReason: ").append(toIndentedString(endReason)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    overallCallParticipantsCount: ").append(toIndentedString(overallCallParticipantsCount)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
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
