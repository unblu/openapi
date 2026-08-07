
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
 * Records a collaboration session (such as co-browsing or screen sharing) within a conversation, with one entry per session that has stopped or been aborted.
 */
@ApiModel(description = "Records a collaboration session (such as co-browsing or screen sharing) within a conversation, with one entry per session that has stopped or been aborted.")

@JsonPropertyOrder({
	CollaborationLayersAnalyticsKpiData.JSON_PROPERTY_$_TYPE,
	CollaborationLayersAnalyticsKpiData.JSON_PROPERTY_ID,
	CollaborationLayersAnalyticsKpiData.JSON_PROPERTY_EVENT_TIMESTAMP,
	CollaborationLayersAnalyticsKpiData.JSON_PROPERTY_START_TIMESTAMP,
	CollaborationLayersAnalyticsKpiData.JSON_PROPERTY_ACTIVATION_TIMESTAMP,
	CollaborationLayersAnalyticsKpiData.JSON_PROPERTY_STOP_TIMESTAMP,
	CollaborationLayersAnalyticsKpiData.JSON_PROPERTY_ACTIVE_DURATION_MS,
	CollaborationLayersAnalyticsKpiData.JSON_PROPERTY_TYPE,
	CollaborationLayersAnalyticsKpiData.JSON_PROPERTY_STOP_REASON,
	CollaborationLayersAnalyticsKpiData.JSON_PROPERTY_CONVERSATION,
	CollaborationLayersAnalyticsKpiData.JSON_PROPERTY_STARTING_PERSON,
	CollaborationLayersAnalyticsKpiData.JSON_PROPERTY_STOPPING_PERSON,
	CollaborationLayersAnalyticsKpiData.JSON_PROPERTY_OWNER_PERSON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CollaborationLayersAnalyticsKpiData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		COLLABORATIONLAYERSANALYTICSKPIDATA("CollaborationLayersAnalyticsKpiData");

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
			return TypeEnum.COLLABORATIONLAYERSANALYTICSKPIDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.COLLABORATIONLAYERSANALYTICSKPIDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_EVENT_TIMESTAMP = "eventTimestamp";
	@JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
	private Long eventTimestamp;

	public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
	@JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
	private Long startTimestamp;

	public static final String JSON_PROPERTY_ACTIVATION_TIMESTAMP = "activationTimestamp";
	@JsonProperty(JSON_PROPERTY_ACTIVATION_TIMESTAMP)
	private Long activationTimestamp;

	public static final String JSON_PROPERTY_STOP_TIMESTAMP = "stopTimestamp";
	@JsonProperty(JSON_PROPERTY_STOP_TIMESTAMP)
	private Long stopTimestamp;

	public static final String JSON_PROPERTY_ACTIVE_DURATION_MS = "activeDurationMs";
	@JsonProperty(JSON_PROPERTY_ACTIVE_DURATION_MS)
	private Long activeDurationMs;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ELayerType type;

	public static final String JSON_PROPERTY_STOP_REASON = "stopReason";
	@JsonProperty(JSON_PROPERTY_STOP_REASON)
	private ELayerStopReason stopReason;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationAnalyticsKpiData conversation = null;

	public static final String JSON_PROPERTY_STARTING_PERSON = "startingPerson";
	@JsonProperty(JSON_PROPERTY_STARTING_PERSON)
	private PersonAnalyticsKpiData startingPerson = null;

	public static final String JSON_PROPERTY_STOPPING_PERSON = "stoppingPerson";
	@JsonProperty(JSON_PROPERTY_STOPPING_PERSON)
	private PersonAnalyticsKpiData stoppingPerson = null;

	public static final String JSON_PROPERTY_OWNER_PERSON = "ownerPerson";
	@JsonProperty(JSON_PROPERTY_OWNER_PERSON)
	private PersonAnalyticsKpiData ownerPerson = null;

	public CollaborationLayersAnalyticsKpiData $type(TypeEnum $type) {
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

	public CollaborationLayersAnalyticsKpiData id(String id) {
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

	public CollaborationLayersAnalyticsKpiData eventTimestamp(Long eventTimestamp) {
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

	public CollaborationLayersAnalyticsKpiData startTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) of when the layer initialization was started.
	 * 
	 * @return startTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) of when the layer initialization was started.")
	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public CollaborationLayersAnalyticsKpiData activationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) of activation of the layer. Optional, may be &#x60;null&#x60; if the layer was never activated.
	 * 
	 * @return activationTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) of activation of the layer. Optional, may be `null` if the layer was never activated.")
	public Long getActivationTimestamp() {
		return activationTimestamp;
	}

	public void setActivationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
	}

	public CollaborationLayersAnalyticsKpiData stopTimestamp(Long stopTimestamp) {
		this.stopTimestamp = stopTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) of when the layer was stopped.
	 * 
	 * @return stopTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) of when the layer was stopped.")
	public Long getStopTimestamp() {
		return stopTimestamp;
	}

	public void setStopTimestamp(Long stopTimestamp) {
		this.stopTimestamp = stopTimestamp;
	}

	public CollaborationLayersAnalyticsKpiData activeDurationMs(Long activeDurationMs) {
		this.activeDurationMs = activeDurationMs;
		return this;
	}

	/**
	 * The duration (ms) between the time the layer was activated and stopped.
	 * 
	 * @return activeDurationMs
	 **/
	@ApiModelProperty(value = "The duration (ms) between the time the layer was activated and stopped.")
	public Long getActiveDurationMs() {
		return activeDurationMs;
	}

	public void setActiveDurationMs(Long activeDurationMs) {
		this.activeDurationMs = activeDurationMs;
	}

	public CollaborationLayersAnalyticsKpiData type(ELayerType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public ELayerType getType() {
		return type;
	}

	public void setType(ELayerType type) {
		this.type = type;
	}

	public CollaborationLayersAnalyticsKpiData stopReason(ELayerStopReason stopReason) {
		this.stopReason = stopReason;
		return this;
	}

	/**
	 * Get stopReason
	 * 
	 * @return stopReason
	 **/
	@ApiModelProperty(value = "")
	public ELayerStopReason getStopReason() {
		return stopReason;
	}

	public void setStopReason(ELayerStopReason stopReason) {
		this.stopReason = stopReason;
	}

	public CollaborationLayersAnalyticsKpiData conversation(ConversationAnalyticsKpiData conversation) {
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

	public CollaborationLayersAnalyticsKpiData startingPerson(PersonAnalyticsKpiData startingPerson) {
		this.startingPerson = startingPerson;
		return this;
	}

	/**
	 * Get startingPerson
	 * 
	 * @return startingPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonAnalyticsKpiData getStartingPerson() {
		return startingPerson;
	}

	public void setStartingPerson(PersonAnalyticsKpiData startingPerson) {
		this.startingPerson = startingPerson;
	}

	public CollaborationLayersAnalyticsKpiData stoppingPerson(PersonAnalyticsKpiData stoppingPerson) {
		this.stoppingPerson = stoppingPerson;
		return this;
	}

	/**
	 * Get stoppingPerson
	 * 
	 * @return stoppingPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonAnalyticsKpiData getStoppingPerson() {
		return stoppingPerson;
	}

	public void setStoppingPerson(PersonAnalyticsKpiData stoppingPerson) {
		this.stoppingPerson = stoppingPerson;
	}

	public CollaborationLayersAnalyticsKpiData ownerPerson(PersonAnalyticsKpiData ownerPerson) {
		this.ownerPerson = ownerPerson;
		return this;
	}

	/**
	 * Get ownerPerson
	 * 
	 * @return ownerPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonAnalyticsKpiData getOwnerPerson() {
		return ownerPerson;
	}

	public void setOwnerPerson(PersonAnalyticsKpiData ownerPerson) {
		this.ownerPerson = ownerPerson;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CollaborationLayersAnalyticsKpiData collaborationLayersAnalyticsKpiData = (CollaborationLayersAnalyticsKpiData) o;
		return Objects.equals(this.$type, collaborationLayersAnalyticsKpiData.$type) &&
				Objects.equals(this.id, collaborationLayersAnalyticsKpiData.id) &&
				Objects.equals(this.eventTimestamp, collaborationLayersAnalyticsKpiData.eventTimestamp) &&
				Objects.equals(this.startTimestamp, collaborationLayersAnalyticsKpiData.startTimestamp) &&
				Objects.equals(this.activationTimestamp, collaborationLayersAnalyticsKpiData.activationTimestamp) &&
				Objects.equals(this.stopTimestamp, collaborationLayersAnalyticsKpiData.stopTimestamp) &&
				Objects.equals(this.activeDurationMs, collaborationLayersAnalyticsKpiData.activeDurationMs) &&
				Objects.equals(this.type, collaborationLayersAnalyticsKpiData.type) &&
				Objects.equals(this.stopReason, collaborationLayersAnalyticsKpiData.stopReason) &&
				Objects.equals(this.conversation, collaborationLayersAnalyticsKpiData.conversation) &&
				Objects.equals(this.startingPerson, collaborationLayersAnalyticsKpiData.startingPerson) &&
				Objects.equals(this.stoppingPerson, collaborationLayersAnalyticsKpiData.stoppingPerson) &&
				Objects.equals(this.ownerPerson, collaborationLayersAnalyticsKpiData.ownerPerson);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, eventTimestamp, startTimestamp, activationTimestamp, stopTimestamp, activeDurationMs, type, stopReason, conversation, startingPerson, stoppingPerson, ownerPerson);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CollaborationLayersAnalyticsKpiData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
		sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
		sb.append("    activationTimestamp: ").append(toIndentedString(activationTimestamp)).append("\n");
		sb.append("    stopTimestamp: ").append(toIndentedString(stopTimestamp)).append("\n");
		sb.append("    activeDurationMs: ").append(toIndentedString(activeDurationMs)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    stopReason: ").append(toIndentedString(stopReason)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    startingPerson: ").append(toIndentedString(startingPerson)).append("\n");
		sb.append("    stoppingPerson: ").append(toIndentedString(stoppingPerson)).append("\n");
		sb.append("    ownerPerson: ").append(toIndentedString(ownerPerson)).append("\n");
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
