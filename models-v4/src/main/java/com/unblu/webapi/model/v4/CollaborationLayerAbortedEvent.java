
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
 * An event triggered every time collaboration layer in a conversation aborts
 */
@ApiModel(description = "An event triggered every time collaboration layer in a conversation aborts")

@JsonPropertyOrder({
	CollaborationLayerAbortedEvent.JSON_PROPERTY_$_TYPE,
	CollaborationLayerAbortedEvent.JSON_PROPERTY_TIMESTAMP,
	CollaborationLayerAbortedEvent.JSON_PROPERTY_EVENT_TYPE,
	CollaborationLayerAbortedEvent.JSON_PROPERTY_ACCOUNT_ID,
	CollaborationLayerAbortedEvent.JSON_PROPERTY_CONVERSATION_ID,
	CollaborationLayerAbortedEvent.JSON_PROPERTY_LAYER_TYPE,
	CollaborationLayerAbortedEvent.JSON_PROPERTY_LAYER_OWNER_PERSON_DATA,
	CollaborationLayerAbortedEvent.JSON_PROPERTY_STARTING_PERSON_DATA,
	CollaborationLayerAbortedEvent.JSON_PROPERTY_STARTING_TIMESTAMP,
	CollaborationLayerAbortedEvent.JSON_PROPERTY_STOPPING_PERSON_DATA,
	CollaborationLayerAbortedEvent.JSON_PROPERTY_ABORT_TIMESTAMP,
	CollaborationLayerAbortedEvent.JSON_PROPERTY_LAYER_STOP_REASON,
	CollaborationLayerAbortedEvent.JSON_PROPERTY_APPROVAL_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CollaborationLayerAbortedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		COLLABORATIONLAYERABORTEDEVENT("CollaborationLayerAbortedEvent");

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
			return TypeEnum.COLLABORATIONLAYERABORTEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.COLLABORATIONLAYERABORTEDEVENT;

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

	public static final String JSON_PROPERTY_ABORT_TIMESTAMP = "abortTimestamp";
	@JsonProperty(JSON_PROPERTY_ABORT_TIMESTAMP)
	private Long abortTimestamp;

	public static final String JSON_PROPERTY_LAYER_STOP_REASON = "layerStopReason";
	@JsonProperty(JSON_PROPERTY_LAYER_STOP_REASON)
	private ELayerStopReason layerStopReason;

	public static final String JSON_PROPERTY_APPROVAL_TIMESTAMP = "approvalTimestamp";
	@JsonProperty(JSON_PROPERTY_APPROVAL_TIMESTAMP)
	private Long approvalTimestamp;

	public CollaborationLayerAbortedEvent $type(TypeEnum $type) {
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

	public CollaborationLayerAbortedEvent timestamp(Long timestamp) {
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

	public CollaborationLayerAbortedEvent eventType(String eventType) {
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

	public CollaborationLayerAbortedEvent accountId(String accountId) {
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

	public CollaborationLayerAbortedEvent conversationId(String conversationId) {
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

	public CollaborationLayerAbortedEvent layerType(ELayerType layerType) {
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

	public CollaborationLayerAbortedEvent layerOwnerPersonData(PersonData layerOwnerPersonData) {
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

	public CollaborationLayerAbortedEvent startingPersonData(PersonData startingPersonData) {
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

	public CollaborationLayerAbortedEvent startingTimestamp(Long startingTimestamp) {
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

	public CollaborationLayerAbortedEvent stoppingPersonData(PersonData stoppingPersonData) {
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

	public CollaborationLayerAbortedEvent abortTimestamp(Long abortTimestamp) {
		this.abortTimestamp = abortTimestamp;
		return this;
	}

	/**
	 * The timestamp when the layer was aborted
	 * 
	 * @return abortTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp when the layer was aborted")
	public Long getAbortTimestamp() {
		return abortTimestamp;
	}

	public void setAbortTimestamp(Long abortTimestamp) {
		this.abortTimestamp = abortTimestamp;
	}

	public CollaborationLayerAbortedEvent layerStopReason(ELayerStopReason layerStopReason) {
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

	public CollaborationLayerAbortedEvent approvalTimestamp(Long approvalTimestamp) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CollaborationLayerAbortedEvent collaborationLayerAbortedEvent = (CollaborationLayerAbortedEvent) o;
		return Objects.equals(this.$type, collaborationLayerAbortedEvent.$type) &&
				Objects.equals(this.timestamp, collaborationLayerAbortedEvent.timestamp) &&
				Objects.equals(this.eventType, collaborationLayerAbortedEvent.eventType) &&
				Objects.equals(this.accountId, collaborationLayerAbortedEvent.accountId) &&
				Objects.equals(this.conversationId, collaborationLayerAbortedEvent.conversationId) &&
				Objects.equals(this.layerType, collaborationLayerAbortedEvent.layerType) &&
				Objects.equals(this.layerOwnerPersonData, collaborationLayerAbortedEvent.layerOwnerPersonData) &&
				Objects.equals(this.startingPersonData, collaborationLayerAbortedEvent.startingPersonData) &&
				Objects.equals(this.startingTimestamp, collaborationLayerAbortedEvent.startingTimestamp) &&
				Objects.equals(this.stoppingPersonData, collaborationLayerAbortedEvent.stoppingPersonData) &&
				Objects.equals(this.abortTimestamp, collaborationLayerAbortedEvent.abortTimestamp) &&
				Objects.equals(this.layerStopReason, collaborationLayerAbortedEvent.layerStopReason) &&
				Objects.equals(this.approvalTimestamp, collaborationLayerAbortedEvent.approvalTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationId, layerType, layerOwnerPersonData, startingPersonData, startingTimestamp, stoppingPersonData, abortTimestamp, layerStopReason, approvalTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CollaborationLayerAbortedEvent {\n");
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
		sb.append("    abortTimestamp: ").append(toIndentedString(abortTimestamp)).append("\n");
		sb.append("    layerStopReason: ").append(toIndentedString(layerStopReason)).append("\n");
		sb.append("    approvalTimestamp: ").append(toIndentedString(approvalTimestamp)).append("\n");
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
