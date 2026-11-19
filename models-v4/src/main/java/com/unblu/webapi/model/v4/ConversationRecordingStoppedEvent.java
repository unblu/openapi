
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
 * Event emitted when a conversation recording ended. Sent for every recording system; &#x60;recordingSystem&#x60; states the system. A built-in conversation
 * recording then goes on to postprocessing or becomes available.
 */
@ApiModel(description = "Event emitted when a conversation recording ended. Sent for every recording system; `recordingSystem` states the system. A built-in conversation recording then goes on to postprocessing or becomes available.")

@JsonPropertyOrder({
	ConversationRecordingStoppedEvent.JSON_PROPERTY_$_TYPE,
	ConversationRecordingStoppedEvent.JSON_PROPERTY_TIMESTAMP,
	ConversationRecordingStoppedEvent.JSON_PROPERTY_EVENT_TYPE,
	ConversationRecordingStoppedEvent.JSON_PROPERTY_ACCOUNT_ID,
	ConversationRecordingStoppedEvent.JSON_PROPERTY_CONVERSATION_ID,
	ConversationRecordingStoppedEvent.JSON_PROPERTY_CONVERSATION_RECORDING_ID,
	ConversationRecordingStoppedEvent.JSON_PROPERTY_RECORDING_SYSTEM,
	ConversationRecordingStoppedEvent.JSON_PROPERTY_RECORDING_TYPE,
	ConversationRecordingStoppedEvent.JSON_PROPERTY_RECORDING_START_TIMESTAMP,
	ConversationRecordingStoppedEvent.JSON_PROPERTY_RECORDING_END_TIMESTAMP,
	ConversationRecordingStoppedEvent.JSON_PROPERTY_END_REASON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationRecordingStoppedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONRECORDINGSTOPPEDEVENT("ConversationRecordingStoppedEvent");

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
			return TypeEnum.CONVERSATIONRECORDINGSTOPPEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONRECORDINGSTOPPEDEVENT;

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

	public static final String JSON_PROPERTY_CONVERSATION_RECORDING_ID = "conversationRecordingId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_RECORDING_ID)
	private String conversationRecordingId;

	public static final String JSON_PROPERTY_RECORDING_SYSTEM = "recordingSystem";
	@JsonProperty(JSON_PROPERTY_RECORDING_SYSTEM)
	private ERecordingSystem recordingSystem;

	public static final String JSON_PROPERTY_RECORDING_TYPE = "recordingType";
	@JsonProperty(JSON_PROPERTY_RECORDING_TYPE)
	private ERecordingType recordingType;

	public static final String JSON_PROPERTY_RECORDING_START_TIMESTAMP = "recordingStartTimestamp";
	@JsonProperty(JSON_PROPERTY_RECORDING_START_TIMESTAMP)
	private Long recordingStartTimestamp;

	public static final String JSON_PROPERTY_RECORDING_END_TIMESTAMP = "recordingEndTimestamp";
	@JsonProperty(JSON_PROPERTY_RECORDING_END_TIMESTAMP)
	private Long recordingEndTimestamp;

	public static final String JSON_PROPERTY_END_REASON = "endReason";
	@JsonProperty(JSON_PROPERTY_END_REASON)
	private ERecordingEndReason endReason;

	public ConversationRecordingStoppedEvent $type(TypeEnum $type) {
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

	public ConversationRecordingStoppedEvent timestamp(Long timestamp) {
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

	public ConversationRecordingStoppedEvent eventType(String eventType) {
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

	public ConversationRecordingStoppedEvent accountId(String accountId) {
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

	public ConversationRecordingStoppedEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * ID of the conversation that the recording belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "ID of the conversation that the recording belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ConversationRecordingStoppedEvent conversationRecordingId(String conversationRecordingId) {
		this.conversationRecordingId = conversationRecordingId;
		return this;
	}

	/**
	 * The ID of the recording.
	 * 
	 * @return conversationRecordingId
	 **/
	@ApiModelProperty(value = "The ID of the recording.")
	public String getConversationRecordingId() {
		return conversationRecordingId;
	}

	public void setConversationRecordingId(String conversationRecordingId) {
		this.conversationRecordingId = conversationRecordingId;
	}

	public ConversationRecordingStoppedEvent recordingSystem(ERecordingSystem recordingSystem) {
		this.recordingSystem = recordingSystem;
		return this;
	}

	/**
	 * Get recordingSystem
	 * 
	 * @return recordingSystem
	 **/
	@ApiModelProperty(value = "")
	public ERecordingSystem getRecordingSystem() {
		return recordingSystem;
	}

	public void setRecordingSystem(ERecordingSystem recordingSystem) {
		this.recordingSystem = recordingSystem;
	}

	public ConversationRecordingStoppedEvent recordingType(ERecordingType recordingType) {
		this.recordingType = recordingType;
		return this;
	}

	/**
	 * Get recordingType
	 * 
	 * @return recordingType
	 **/
	@ApiModelProperty(value = "")
	public ERecordingType getRecordingType() {
		return recordingType;
	}

	public void setRecordingType(ERecordingType recordingType) {
		this.recordingType = recordingType;
	}

	public ConversationRecordingStoppedEvent recordingStartTimestamp(Long recordingStartTimestamp) {
		this.recordingStartTimestamp = recordingStartTimestamp;
		return this;
	}

	/**
	 * UTC timestamp when the conversation recording started
	 * 
	 * @return recordingStartTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp when the conversation recording started")
	public Long getRecordingStartTimestamp() {
		return recordingStartTimestamp;
	}

	public void setRecordingStartTimestamp(Long recordingStartTimestamp) {
		this.recordingStartTimestamp = recordingStartTimestamp;
	}

	public ConversationRecordingStoppedEvent recordingEndTimestamp(Long recordingEndTimestamp) {
		this.recordingEndTimestamp = recordingEndTimestamp;
		return this;
	}

	/**
	 * UTC timestamp when the conversation recording ended
	 * 
	 * @return recordingEndTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp when the conversation recording ended")
	public Long getRecordingEndTimestamp() {
		return recordingEndTimestamp;
	}

	public void setRecordingEndTimestamp(Long recordingEndTimestamp) {
		this.recordingEndTimestamp = recordingEndTimestamp;
	}

	public ConversationRecordingStoppedEvent endReason(ERecordingEndReason endReason) {
		this.endReason = endReason;
		return this;
	}

	/**
	 * Get endReason
	 * 
	 * @return endReason
	 **/
	@ApiModelProperty(value = "")
	public ERecordingEndReason getEndReason() {
		return endReason;
	}

	public void setEndReason(ERecordingEndReason endReason) {
		this.endReason = endReason;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationRecordingStoppedEvent conversationRecordingStoppedEvent = (ConversationRecordingStoppedEvent) o;
		return Objects.equals(this.$type, conversationRecordingStoppedEvent.$type) &&
				Objects.equals(this.timestamp, conversationRecordingStoppedEvent.timestamp) &&
				Objects.equals(this.eventType, conversationRecordingStoppedEvent.eventType) &&
				Objects.equals(this.accountId, conversationRecordingStoppedEvent.accountId) &&
				Objects.equals(this.conversationId, conversationRecordingStoppedEvent.conversationId) &&
				Objects.equals(this.conversationRecordingId, conversationRecordingStoppedEvent.conversationRecordingId) &&
				Objects.equals(this.recordingSystem, conversationRecordingStoppedEvent.recordingSystem) &&
				Objects.equals(this.recordingType, conversationRecordingStoppedEvent.recordingType) &&
				Objects.equals(this.recordingStartTimestamp, conversationRecordingStoppedEvent.recordingStartTimestamp) &&
				Objects.equals(this.recordingEndTimestamp, conversationRecordingStoppedEvent.recordingEndTimestamp) &&
				Objects.equals(this.endReason, conversationRecordingStoppedEvent.endReason);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationId, conversationRecordingId, recordingSystem, recordingType, recordingStartTimestamp, recordingEndTimestamp, endReason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationRecordingStoppedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    conversationRecordingId: ").append(toIndentedString(conversationRecordingId)).append("\n");
		sb.append("    recordingSystem: ").append(toIndentedString(recordingSystem)).append("\n");
		sb.append("    recordingType: ").append(toIndentedString(recordingType)).append("\n");
		sb.append("    recordingStartTimestamp: ").append(toIndentedString(recordingStartTimestamp)).append("\n");
		sb.append("    recordingEndTimestamp: ").append(toIndentedString(recordingEndTimestamp)).append("\n");
		sb.append("    endReason: ").append(toIndentedString(endReason)).append("\n");
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
