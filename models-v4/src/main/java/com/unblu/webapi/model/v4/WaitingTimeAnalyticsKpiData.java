
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
 * Records the duration between the moment a conversation assignment or forwarding invitation is created and when it is resolved (accepted or aborted). A
 * conversation may have multiple waiting time entries if it is forwarded and reassigned multiple times during its lifecycle.
 */
@ApiModel(description = "Records the duration between the moment a conversation assignment or forwarding invitation is created and when it is resolved (accepted or aborted). A conversation may have multiple waiting time entries if it is forwarded and reassigned multiple times during its lifecycle.")

@JsonPropertyOrder({
	WaitingTimeAnalyticsKpiData.JSON_PROPERTY_$_TYPE,
	WaitingTimeAnalyticsKpiData.JSON_PROPERTY_ID,
	WaitingTimeAnalyticsKpiData.JSON_PROPERTY_EVENT_TIMESTAMP,
	WaitingTimeAnalyticsKpiData.JSON_PROPERTY_START_TIMESTAMP,
	WaitingTimeAnalyticsKpiData.JSON_PROPERTY_END_TIMESTAMP,
	WaitingTimeAnalyticsKpiData.JSON_PROPERTY_WAITING_TIME_DURATION_MS,
	WaitingTimeAnalyticsKpiData.JSON_PROPERTY_OUTCOME,
	WaitingTimeAnalyticsKpiData.JSON_PROPERTY_TYPE,
	WaitingTimeAnalyticsKpiData.JSON_PROPERTY_TARGET,
	WaitingTimeAnalyticsKpiData.JSON_PROPERTY_CONVERSATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WaitingTimeAnalyticsKpiData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WAITINGTIMEANALYTICSKPIDATA("WaitingTimeAnalyticsKpiData");

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
			return TypeEnum.WAITINGTIMEANALYTICSKPIDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WAITINGTIMEANALYTICSKPIDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_EVENT_TIMESTAMP = "eventTimestamp";
	@JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
	private Long eventTimestamp;

	public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
	@JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
	private Long startTimestamp;

	public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
	@JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
	private Long endTimestamp;

	public static final String JSON_PROPERTY_WAITING_TIME_DURATION_MS = "waitingTimeDurationMs";
	@JsonProperty(JSON_PROPERTY_WAITING_TIME_DURATION_MS)
	private Long waitingTimeDurationMs;

	public static final String JSON_PROPERTY_OUTCOME = "outcome";
	@JsonProperty(JSON_PROPERTY_OUTCOME)
	private EAnalyticsWaitingTimeOutcome outcome;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EAnalyticsWaitingTimeType type;

	public static final String JSON_PROPERTY_TARGET = "target";
	@JsonProperty(JSON_PROPERTY_TARGET)
	private RecipientAnalyticsKpiData target = null;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationAnalyticsKpiData conversation = null;

	public WaitingTimeAnalyticsKpiData $type(TypeEnum $type) {
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

	public WaitingTimeAnalyticsKpiData id(String id) {
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

	public WaitingTimeAnalyticsKpiData eventTimestamp(Long eventTimestamp) {
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

	public WaitingTimeAnalyticsKpiData startTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		return this;
	}

	/**
	 * The UTC timestamp (ms) when the waiting time started.
	 * 
	 * @return startTimestamp
	 **/
	@ApiModelProperty(value = "The UTC timestamp (ms) when the waiting time started.")
	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public WaitingTimeAnalyticsKpiData endTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		return this;
	}

	/**
	 * The UTC timestamp (ms) when the waiting time ended.
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "The UTC timestamp (ms) when the waiting time ended.")
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public WaitingTimeAnalyticsKpiData waitingTimeDurationMs(Long waitingTimeDurationMs) {
		this.waitingTimeDurationMs = waitingTimeDurationMs;
		return this;
	}

	/**
	 * The duration (ms) between the start and end of the waiting time.
	 * 
	 * @return waitingTimeDurationMs
	 **/
	@ApiModelProperty(value = "The duration (ms) between the start and end of the waiting time.")
	public Long getWaitingTimeDurationMs() {
		return waitingTimeDurationMs;
	}

	public void setWaitingTimeDurationMs(Long waitingTimeDurationMs) {
		this.waitingTimeDurationMs = waitingTimeDurationMs;
	}

	public WaitingTimeAnalyticsKpiData outcome(EAnalyticsWaitingTimeOutcome outcome) {
		this.outcome = outcome;
		return this;
	}

	/**
	 * Get outcome
	 * 
	 * @return outcome
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsWaitingTimeOutcome getOutcome() {
		return outcome;
	}

	public void setOutcome(EAnalyticsWaitingTimeOutcome outcome) {
		this.outcome = outcome;
	}

	public WaitingTimeAnalyticsKpiData type(EAnalyticsWaitingTimeType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsWaitingTimeType getType() {
		return type;
	}

	public void setType(EAnalyticsWaitingTimeType type) {
		this.type = type;
	}

	public WaitingTimeAnalyticsKpiData target(RecipientAnalyticsKpiData target) {
		this.target = target;
		return this;
	}

	/**
	 * Get target
	 * 
	 * @return target
	 **/
	@ApiModelProperty(value = "")
	public RecipientAnalyticsKpiData getTarget() {
		return target;
	}

	public void setTarget(RecipientAnalyticsKpiData target) {
		this.target = target;
	}

	public WaitingTimeAnalyticsKpiData conversation(ConversationAnalyticsKpiData conversation) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WaitingTimeAnalyticsKpiData waitingTimeAnalyticsKpiData = (WaitingTimeAnalyticsKpiData) o;
		return Objects.equals(this.$type, waitingTimeAnalyticsKpiData.$type) &&
				Objects.equals(this.id, waitingTimeAnalyticsKpiData.id) &&
				Objects.equals(this.eventTimestamp, waitingTimeAnalyticsKpiData.eventTimestamp) &&
				Objects.equals(this.startTimestamp, waitingTimeAnalyticsKpiData.startTimestamp) &&
				Objects.equals(this.endTimestamp, waitingTimeAnalyticsKpiData.endTimestamp) &&
				Objects.equals(this.waitingTimeDurationMs, waitingTimeAnalyticsKpiData.waitingTimeDurationMs) &&
				Objects.equals(this.outcome, waitingTimeAnalyticsKpiData.outcome) &&
				Objects.equals(this.type, waitingTimeAnalyticsKpiData.type) &&
				Objects.equals(this.target, waitingTimeAnalyticsKpiData.target) &&
				Objects.equals(this.conversation, waitingTimeAnalyticsKpiData.conversation);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, eventTimestamp, startTimestamp, endTimestamp, waitingTimeDurationMs, outcome, type, target, conversation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WaitingTimeAnalyticsKpiData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
		sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
		sb.append("    waitingTimeDurationMs: ").append(toIndentedString(waitingTimeDurationMs)).append("\n");
		sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    target: ").append(toIndentedString(target)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
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
