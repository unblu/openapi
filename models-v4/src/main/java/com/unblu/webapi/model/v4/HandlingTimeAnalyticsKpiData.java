
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
 * Records how long an assigned agent spent handling a conversation. A conversation may have multiple handling time entries if it is forwarded, pushed back to a
 * queue, or handled by several agents over its lifecycle.
 */
@ApiModel(description = "Records how long an assigned agent spent handling a conversation. A conversation may have multiple handling time entries if it is forwarded, pushed back to a queue, or handled by several agents over its lifecycle.")

@JsonPropertyOrder({
	HandlingTimeAnalyticsKpiData.JSON_PROPERTY_$_TYPE,
	HandlingTimeAnalyticsKpiData.JSON_PROPERTY_ID,
	HandlingTimeAnalyticsKpiData.JSON_PROPERTY_EVENT_TIMESTAMP,
	HandlingTimeAnalyticsKpiData.JSON_PROPERTY_START_TIMESTAMP,
	HandlingTimeAnalyticsKpiData.JSON_PROPERTY_RESOLUTION_TIMESTAMP,
	HandlingTimeAnalyticsKpiData.JSON_PROPERTY_HANDLING_TIME_DURATION_MS,
	HandlingTimeAnalyticsKpiData.JSON_PROPERTY_RESOLUTION_TYPE,
	HandlingTimeAnalyticsKpiData.JSON_PROPERTY_CONVERSATION,
	HandlingTimeAnalyticsKpiData.JSON_PROPERTY_METRICS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class HandlingTimeAnalyticsKpiData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		HANDLINGTIMEANALYTICSKPIDATA("HandlingTimeAnalyticsKpiData");

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
			return TypeEnum.HANDLINGTIMEANALYTICSKPIDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.HANDLINGTIMEANALYTICSKPIDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_EVENT_TIMESTAMP = "eventTimestamp";
	@JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
	private Long eventTimestamp;

	public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
	@JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
	private Long startTimestamp;

	public static final String JSON_PROPERTY_RESOLUTION_TIMESTAMP = "resolutionTimestamp";
	@JsonProperty(JSON_PROPERTY_RESOLUTION_TIMESTAMP)
	private Long resolutionTimestamp;

	public static final String JSON_PROPERTY_HANDLING_TIME_DURATION_MS = "handlingTimeDurationMs";
	@JsonProperty(JSON_PROPERTY_HANDLING_TIME_DURATION_MS)
	private Long handlingTimeDurationMs;

	public static final String JSON_PROPERTY_RESOLUTION_TYPE = "resolutionType";
	@JsonProperty(JSON_PROPERTY_RESOLUTION_TYPE)
	private EHandlingTimeTrigger resolutionType;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationAnalyticsKpiData conversation = null;

	public static final String JSON_PROPERTY_METRICS = "metrics";
	@JsonProperty(JSON_PROPERTY_METRICS)
	private ConversationMetricsAnalyticsKpiData metrics = null;

	public HandlingTimeAnalyticsKpiData $type(TypeEnum $type) {
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

	public HandlingTimeAnalyticsKpiData id(String id) {
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

	public HandlingTimeAnalyticsKpiData eventTimestamp(Long eventTimestamp) {
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

	public HandlingTimeAnalyticsKpiData startTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		return this;
	}

	/**
	 * The UTC timestamp (ms) when the agent&#39;s invitation was resolved and handling started.
	 * 
	 * @return startTimestamp
	 **/
	@ApiModelProperty(value = "The UTC timestamp (ms) when the agent's invitation was resolved and handling started.")
	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public HandlingTimeAnalyticsKpiData resolutionTimestamp(Long resolutionTimestamp) {
		this.resolutionTimestamp = resolutionTimestamp;
		return this;
	}

	/**
	 * The UTC timestamp (ms) when the handling period concluded.
	 * 
	 * @return resolutionTimestamp
	 **/
	@ApiModelProperty(value = "The UTC timestamp (ms) when the handling period concluded.")
	public Long getResolutionTimestamp() {
		return resolutionTimestamp;
	}

	public void setResolutionTimestamp(Long resolutionTimestamp) {
		this.resolutionTimestamp = resolutionTimestamp;
	}

	public HandlingTimeAnalyticsKpiData handlingTimeDurationMs(Long handlingTimeDurationMs) {
		this.handlingTimeDurationMs = handlingTimeDurationMs;
		return this;
	}

	/**
	 * Duration (ms) of the handling time between start and resolution.
	 * 
	 * @return handlingTimeDurationMs
	 **/
	@ApiModelProperty(value = "Duration (ms) of the handling time between start and resolution.")
	public Long getHandlingTimeDurationMs() {
		return handlingTimeDurationMs;
	}

	public void setHandlingTimeDurationMs(Long handlingTimeDurationMs) {
		this.handlingTimeDurationMs = handlingTimeDurationMs;
	}

	public HandlingTimeAnalyticsKpiData resolutionType(EHandlingTimeTrigger resolutionType) {
		this.resolutionType = resolutionType;
		return this;
	}

	/**
	 * Get resolutionType
	 * 
	 * @return resolutionType
	 **/
	@ApiModelProperty(value = "")
	public EHandlingTimeTrigger getResolutionType() {
		return resolutionType;
	}

	public void setResolutionType(EHandlingTimeTrigger resolutionType) {
		this.resolutionType = resolutionType;
	}

	public HandlingTimeAnalyticsKpiData conversation(ConversationAnalyticsKpiData conversation) {
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

	public HandlingTimeAnalyticsKpiData metrics(ConversationMetricsAnalyticsKpiData metrics) {
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
		HandlingTimeAnalyticsKpiData handlingTimeAnalyticsKpiData = (HandlingTimeAnalyticsKpiData) o;
		return Objects.equals(this.$type, handlingTimeAnalyticsKpiData.$type) &&
				Objects.equals(this.id, handlingTimeAnalyticsKpiData.id) &&
				Objects.equals(this.eventTimestamp, handlingTimeAnalyticsKpiData.eventTimestamp) &&
				Objects.equals(this.startTimestamp, handlingTimeAnalyticsKpiData.startTimestamp) &&
				Objects.equals(this.resolutionTimestamp, handlingTimeAnalyticsKpiData.resolutionTimestamp) &&
				Objects.equals(this.handlingTimeDurationMs, handlingTimeAnalyticsKpiData.handlingTimeDurationMs) &&
				Objects.equals(this.resolutionType, handlingTimeAnalyticsKpiData.resolutionType) &&
				Objects.equals(this.conversation, handlingTimeAnalyticsKpiData.conversation) &&
				Objects.equals(this.metrics, handlingTimeAnalyticsKpiData.metrics);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, eventTimestamp, startTimestamp, resolutionTimestamp, handlingTimeDurationMs, resolutionType, conversation, metrics);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HandlingTimeAnalyticsKpiData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
		sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
		sb.append("    resolutionTimestamp: ").append(toIndentedString(resolutionTimestamp)).append("\n");
		sb.append("    handlingTimeDurationMs: ").append(toIndentedString(handlingTimeDurationMs)).append("\n");
		sb.append("    resolutionType: ").append(toIndentedString(resolutionType)).append("\n");
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
