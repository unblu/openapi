
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
 * An event triggered every time collaboration layer in a conversation stops
 */
@ApiModel(description = "An event triggered every time collaboration layer in a conversation stops")

@JsonPropertyOrder({
	CollaborationLayerStoppedEvent.JSON_PROPERTY_$_TYPE,
	CollaborationLayerStoppedEvent.JSON_PROPERTY_TIMESTAMP,
	CollaborationLayerStoppedEvent.JSON_PROPERTY_EVENT_TYPE,
	CollaborationLayerStoppedEvent.JSON_PROPERTY_ACCOUNT_ID,
	CollaborationLayerStoppedEvent.JSON_PROPERTY_CONVERSATION_ID,
	CollaborationLayerStoppedEvent.JSON_PROPERTY_LAYER_TYPE,
	CollaborationLayerStoppedEvent.JSON_PROPERTY_LAYER_OWNER_PERSON_DATA,
	CollaborationLayerStoppedEvent.JSON_PROPERTY_STARTING_PERSON_DATA,
	CollaborationLayerStoppedEvent.JSON_PROPERTY_STARTING_TIMESTAMP,
	CollaborationLayerStoppedEvent.JSON_PROPERTY_STOPPING_PERSON_DATA,
	CollaborationLayerStoppedEvent.JSON_PROPERTY_STOP_TIMESTAMP,
	CollaborationLayerStoppedEvent.JSON_PROPERTY_ACTIVATION_TIMESTAMP,
	CollaborationLayerStoppedEvent.JSON_PROPERTY_APPROVAL_TIMESTAMP,
	CollaborationLayerStoppedEvent.JSON_PROPERTY_LAYER_STOP_REASON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CollaborationLayerStoppedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		COLLABORATIONLAYERSTOPPEDEVENT("CollaborationLayerStoppedEvent");

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
			return TypeEnum.COLLABORATIONLAYERSTOPPEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.COLLABORATIONLAYERSTOPPEDEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_LAYER_TYPE = "layerType";
	@JsonProperty(JSON_PROPERTY_LAYER_TYPE)
	private ELayerType layerType;

	public static final String JSON_PROPERTY_LAYER_OWNER_PERSON_DATA = "layerOwnerPersonData";
	@JsonProperty(JSON_PROPERTY_LAYER_OWNER_PERSON_DATA)
	private PersonData layerOwnerPersonData = null;

	public static final String JSON_PROPERTY_STARTING_PERSON_DATA = "startingPersonData";
	@JsonProperty(JSON_PROPERTY_STARTING_PERSON_DATA)
	private PersonData startingPersonData = null;

	public static final String JSON_PROPERTY_STARTING_TIMESTAMP = "startingTimestamp";
	@JsonProperty(JSON_PROPERTY_STARTING_TIMESTAMP)
	private Long startingTimestamp;

	public static final String JSON_PROPERTY_STOPPING_PERSON_DATA = "stoppingPersonData";
	@JsonProperty(JSON_PROPERTY_STOPPING_PERSON_DATA)
	private PersonData stoppingPersonData = null;

	public static final String JSON_PROPERTY_STOP_TIMESTAMP = "stopTimestamp";
	@JsonProperty(JSON_PROPERTY_STOP_TIMESTAMP)
	private Long stopTimestamp;

	public static final String JSON_PROPERTY_ACTIVATION_TIMESTAMP = "activationTimestamp";
	@JsonProperty(JSON_PROPERTY_ACTIVATION_TIMESTAMP)
	private Long activationTimestamp;

	public static final String JSON_PROPERTY_APPROVAL_TIMESTAMP = "approvalTimestamp";
	@JsonProperty(JSON_PROPERTY_APPROVAL_TIMESTAMP)
	private Long approvalTimestamp;

	public static final String JSON_PROPERTY_LAYER_STOP_REASON = "layerStopReason";
	@JsonProperty(JSON_PROPERTY_LAYER_STOP_REASON)
	private ELayerStopReason layerStopReason;

	public CollaborationLayerStoppedEvent $type(TypeEnum $type) {
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

	public CollaborationLayerStoppedEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The server time (Unix timestamp in ms) when the event occurred.
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The server time (Unix timestamp in ms) when the event occurred.")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public CollaborationLayerStoppedEvent eventType(String eventType) {
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

	public CollaborationLayerStoppedEvent accountId(String accountId) {
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

	public CollaborationLayerStoppedEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation the event originated from
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation the event originated from")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public CollaborationLayerStoppedEvent layerType(ELayerType layerType) {
		this.layerType = layerType;
		return this;
	}

	/**
	 * Get layerType
	 * 
	 * @return layerType
	 **/
	@ApiModelProperty(value = "")
	public ELayerType getLayerType() {
		return layerType;
	}

	public void setLayerType(ELayerType layerType) {
		this.layerType = layerType;
	}

	public CollaborationLayerStoppedEvent layerOwnerPersonData(PersonData layerOwnerPersonData) {
		this.layerOwnerPersonData = layerOwnerPersonData;
		return this;
	}

	/**
	 * Get layerOwnerPersonData
	 * 
	 * @return layerOwnerPersonData
	 **/
	@ApiModelProperty(value = "")
	public PersonData getLayerOwnerPersonData() {
		return layerOwnerPersonData;
	}

	public void setLayerOwnerPersonData(PersonData layerOwnerPersonData) {
		this.layerOwnerPersonData = layerOwnerPersonData;
	}

	public CollaborationLayerStoppedEvent startingPersonData(PersonData startingPersonData) {
		this.startingPersonData = startingPersonData;
		return this;
	}

	/**
	 * Get startingPersonData
	 * 
	 * @return startingPersonData
	 **/
	@ApiModelProperty(value = "")
	public PersonData getStartingPersonData() {
		return startingPersonData;
	}

	public void setStartingPersonData(PersonData startingPersonData) {
		this.startingPersonData = startingPersonData;
	}

	public CollaborationLayerStoppedEvent startingTimestamp(Long startingTimestamp) {
		this.startingTimestamp = startingTimestamp;
		return this;
	}

	/**
	 * The timestamp when the layer initialization was started. The layer only will become active after all necessary participants approve it and the actual content
	 * is shared. The starting of the layer may also be aborted if e.g. not all participants accept it.
	 * 
	 * @return startingTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp when the layer initialization was started. The layer only will become active after all necessary participants approve it and the actual content is shared. The starting of the layer may also be aborted if e.g. not all participants accept it.")
	public Long getStartingTimestamp() {
		return startingTimestamp;
	}

	public void setStartingTimestamp(Long startingTimestamp) {
		this.startingTimestamp = startingTimestamp;
	}

	public CollaborationLayerStoppedEvent stoppingPersonData(PersonData stoppingPersonData) {
		this.stoppingPersonData = stoppingPersonData;
		return this;
	}

	/**
	 * Get stoppingPersonData
	 * 
	 * @return stoppingPersonData
	 **/
	@ApiModelProperty(value = "")
	public PersonData getStoppingPersonData() {
		return stoppingPersonData;
	}

	public void setStoppingPersonData(PersonData stoppingPersonData) {
		this.stoppingPersonData = stoppingPersonData;
	}

	public CollaborationLayerStoppedEvent stopTimestamp(Long stopTimestamp) {
		this.stopTimestamp = stopTimestamp;
		return this;
	}

	/**
	 * The timestamp when the layer was stopped
	 * 
	 * @return stopTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp when the layer was stopped")
	public Long getStopTimestamp() {
		return stopTimestamp;
	}

	public void setStopTimestamp(Long stopTimestamp) {
		this.stopTimestamp = stopTimestamp;
	}

	public CollaborationLayerStoppedEvent activationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
		return this;
	}

	/**
	 * The timestamp when the layer was activated after approval
	 * 
	 * @return activationTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp when the layer was activated after approval")
	public Long getActivationTimestamp() {
		return activationTimestamp;
	}

	public void setActivationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
	}

	public CollaborationLayerStoppedEvent approvalTimestamp(Long approvalTimestamp) {
		this.approvalTimestamp = approvalTimestamp;
		return this;
	}

	/**
	 * The timestamp when the layer was approved by all necessary participants
	 * 
	 * @return approvalTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp when the layer was approved by all necessary participants")
	public Long getApprovalTimestamp() {
		return approvalTimestamp;
	}

	public void setApprovalTimestamp(Long approvalTimestamp) {
		this.approvalTimestamp = approvalTimestamp;
	}

	public CollaborationLayerStoppedEvent layerStopReason(ELayerStopReason layerStopReason) {
		this.layerStopReason = layerStopReason;
		return this;
	}

	/**
	 * Get layerStopReason
	 * 
	 * @return layerStopReason
	 **/
	@ApiModelProperty(value = "")
	public ELayerStopReason getLayerStopReason() {
		return layerStopReason;
	}

	public void setLayerStopReason(ELayerStopReason layerStopReason) {
		this.layerStopReason = layerStopReason;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CollaborationLayerStoppedEvent collaborationLayerStoppedEvent = (CollaborationLayerStoppedEvent) o;
		return Objects.equals(this.$type, collaborationLayerStoppedEvent.$type) &&
				Objects.equals(this.timestamp, collaborationLayerStoppedEvent.timestamp) &&
				Objects.equals(this.eventType, collaborationLayerStoppedEvent.eventType) &&
				Objects.equals(this.accountId, collaborationLayerStoppedEvent.accountId) &&
				Objects.equals(this.conversationId, collaborationLayerStoppedEvent.conversationId) &&
				Objects.equals(this.layerType, collaborationLayerStoppedEvent.layerType) &&
				Objects.equals(this.layerOwnerPersonData, collaborationLayerStoppedEvent.layerOwnerPersonData) &&
				Objects.equals(this.startingPersonData, collaborationLayerStoppedEvent.startingPersonData) &&
				Objects.equals(this.startingTimestamp, collaborationLayerStoppedEvent.startingTimestamp) &&
				Objects.equals(this.stoppingPersonData, collaborationLayerStoppedEvent.stoppingPersonData) &&
				Objects.equals(this.stopTimestamp, collaborationLayerStoppedEvent.stopTimestamp) &&
				Objects.equals(this.activationTimestamp, collaborationLayerStoppedEvent.activationTimestamp) &&
				Objects.equals(this.approvalTimestamp, collaborationLayerStoppedEvent.approvalTimestamp) &&
				Objects.equals(this.layerStopReason, collaborationLayerStoppedEvent.layerStopReason);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationId, layerType, layerOwnerPersonData, startingPersonData, startingTimestamp, stoppingPersonData, stopTimestamp, activationTimestamp, approvalTimestamp, layerStopReason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CollaborationLayerStoppedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    layerType: ").append(toIndentedString(layerType)).append("\n");
		sb.append("    layerOwnerPersonData: ").append(toIndentedString(layerOwnerPersonData)).append("\n");
		sb.append("    startingPersonData: ").append(toIndentedString(startingPersonData)).append("\n");
		sb.append("    startingTimestamp: ").append(toIndentedString(startingTimestamp)).append("\n");
		sb.append("    stoppingPersonData: ").append(toIndentedString(stoppingPersonData)).append("\n");
		sb.append("    stopTimestamp: ").append(toIndentedString(stopTimestamp)).append("\n");
		sb.append("    activationTimestamp: ").append(toIndentedString(activationTimestamp)).append("\n");
		sb.append("    approvalTimestamp: ").append(toIndentedString(approvalTimestamp)).append("\n");
		sb.append("    layerStopReason: ").append(toIndentedString(layerStopReason)).append("\n");
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
