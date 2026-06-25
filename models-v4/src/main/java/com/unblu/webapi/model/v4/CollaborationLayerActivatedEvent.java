
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
 * An event triggered every time a collaboration layer is activated in a conversation. At this point, the layer is fully functional and can be used.
 */
@ApiModel(description = "An event triggered every time a collaboration layer is activated in a conversation. At this point, the layer is fully functional and can be used.")

@JsonPropertyOrder({
	CollaborationLayerActivatedEvent.JSON_PROPERTY_$_TYPE,
	CollaborationLayerActivatedEvent.JSON_PROPERTY_TIMESTAMP,
	CollaborationLayerActivatedEvent.JSON_PROPERTY_EVENT_TYPE,
	CollaborationLayerActivatedEvent.JSON_PROPERTY_ACCOUNT_ID,
	CollaborationLayerActivatedEvent.JSON_PROPERTY_CONVERSATION_ID,
	CollaborationLayerActivatedEvent.JSON_PROPERTY_LAYER_TYPE,
	CollaborationLayerActivatedEvent.JSON_PROPERTY_LAYER_OWNER_PERSON_DATA,
	CollaborationLayerActivatedEvent.JSON_PROPERTY_STARTING_PERSON_DATA,
	CollaborationLayerActivatedEvent.JSON_PROPERTY_STARTING_TIMESTAMP,
	CollaborationLayerActivatedEvent.JSON_PROPERTY_ACTIVATION_TIMESTAMP,
	CollaborationLayerActivatedEvent.JSON_PROPERTY_APPROVAL_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CollaborationLayerActivatedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		COLLABORATIONLAYERACTIVATEDEVENT("CollaborationLayerActivatedEvent");

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
			return TypeEnum.COLLABORATIONLAYERACTIVATEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.COLLABORATIONLAYERACTIVATEDEVENT;

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

	public static final String JSON_PROPERTY_ACTIVATION_TIMESTAMP = "activationTimestamp";
	@JsonProperty(JSON_PROPERTY_ACTIVATION_TIMESTAMP)
	private Long activationTimestamp;

	public static final String JSON_PROPERTY_APPROVAL_TIMESTAMP = "approvalTimestamp";
	@JsonProperty(JSON_PROPERTY_APPROVAL_TIMESTAMP)
	private Long approvalTimestamp;

	public CollaborationLayerActivatedEvent $type(TypeEnum $type) {
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

	public CollaborationLayerActivatedEvent timestamp(Long timestamp) {
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

	public CollaborationLayerActivatedEvent eventType(String eventType) {
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

	public CollaborationLayerActivatedEvent accountId(String accountId) {
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

	public CollaborationLayerActivatedEvent conversationId(String conversationId) {
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

	public CollaborationLayerActivatedEvent layerType(ELayerType layerType) {
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

	public CollaborationLayerActivatedEvent layerOwnerPersonData(PersonData layerOwnerPersonData) {
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

	public CollaborationLayerActivatedEvent startingPersonData(PersonData startingPersonData) {
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

	public CollaborationLayerActivatedEvent startingTimestamp(Long startingTimestamp) {
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

	public CollaborationLayerActivatedEvent activationTimestamp(Long activationTimestamp) {
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

	public CollaborationLayerActivatedEvent approvalTimestamp(Long approvalTimestamp) {
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
		CollaborationLayerActivatedEvent collaborationLayerActivatedEvent = (CollaborationLayerActivatedEvent) o;
		return Objects.equals(this.$type, collaborationLayerActivatedEvent.$type) &&
				Objects.equals(this.timestamp, collaborationLayerActivatedEvent.timestamp) &&
				Objects.equals(this.eventType, collaborationLayerActivatedEvent.eventType) &&
				Objects.equals(this.accountId, collaborationLayerActivatedEvent.accountId) &&
				Objects.equals(this.conversationId, collaborationLayerActivatedEvent.conversationId) &&
				Objects.equals(this.layerType, collaborationLayerActivatedEvent.layerType) &&
				Objects.equals(this.layerOwnerPersonData, collaborationLayerActivatedEvent.layerOwnerPersonData) &&
				Objects.equals(this.startingPersonData, collaborationLayerActivatedEvent.startingPersonData) &&
				Objects.equals(this.startingTimestamp, collaborationLayerActivatedEvent.startingTimestamp) &&
				Objects.equals(this.activationTimestamp, collaborationLayerActivatedEvent.activationTimestamp) &&
				Objects.equals(this.approvalTimestamp, collaborationLayerActivatedEvent.approvalTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationId, layerType, layerOwnerPersonData, startingPersonData, startingTimestamp, activationTimestamp, approvalTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CollaborationLayerActivatedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    layerType: ").append(toIndentedString(layerType)).append("\n");
		sb.append("    layerOwnerPersonData: ").append(toIndentedString(layerOwnerPersonData)).append("\n");
		sb.append("    startingPersonData: ").append(toIndentedString(startingPersonData)).append("\n");
		sb.append("    startingTimestamp: ").append(toIndentedString(startingTimestamp)).append("\n");
		sb.append("    activationTimestamp: ").append(toIndentedString(activationTimestamp)).append("\n");
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
