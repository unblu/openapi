
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
 * Event emitted when a conversation recording failed
 */
@ApiModel(description = "Event emitted when a conversation recording failed")

@JsonPropertyOrder({
	ConversationRecordingFailedEvent.JSON_PROPERTY_$_TYPE,
	ConversationRecordingFailedEvent.JSON_PROPERTY_TIMESTAMP,
	ConversationRecordingFailedEvent.JSON_PROPERTY_EVENT_TYPE,
	ConversationRecordingFailedEvent.JSON_PROPERTY_ACCOUNT_ID,
	ConversationRecordingFailedEvent.JSON_PROPERTY_CONVERSATION_ID,
	ConversationRecordingFailedEvent.JSON_PROPERTY_RECORDING_TYPE,
	ConversationRecordingFailedEvent.JSON_PROPERTY_RECORDING_START_TIMESTAMP,
	ConversationRecordingFailedEvent.JSON_PROPERTY_FAILURE_REASON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationRecordingFailedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONRECORDINGFAILEDEVENT("ConversationRecordingFailedEvent");

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
			return TypeEnum.CONVERSATIONRECORDINGFAILEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONRECORDINGFAILEDEVENT;

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

	public static final String JSON_PROPERTY_RECORDING_TYPE = "recordingType";
	@JsonProperty(JSON_PROPERTY_RECORDING_TYPE)
	private ERecordingType recordingType;

	public static final String JSON_PROPERTY_RECORDING_START_TIMESTAMP = "recordingStartTimestamp";
	@JsonProperty(JSON_PROPERTY_RECORDING_START_TIMESTAMP)
	private Long recordingStartTimestamp;

	public static final String JSON_PROPERTY_FAILURE_REASON = "failureReason";
	@JsonProperty(JSON_PROPERTY_FAILURE_REASON)
	private ERecordingFailedReason failureReason;

	public ConversationRecordingFailedEvent $type(TypeEnum $type) {
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

	public ConversationRecordingFailedEvent timestamp(Long timestamp) {
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

	public ConversationRecordingFailedEvent eventType(String eventType) {
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

	public ConversationRecordingFailedEvent accountId(String accountId) {
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

	public ConversationRecordingFailedEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * ID of the conversation this recording belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "ID of the conversation this recording belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ConversationRecordingFailedEvent recordingType(ERecordingType recordingType) {
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

	public ConversationRecordingFailedEvent recordingStartTimestamp(Long recordingStartTimestamp) {
		this.recordingStartTimestamp = recordingStartTimestamp;
		return this;
	}

	/**
	 * UTC timestamp when the conversation recording has started. Null if the recording failed to start.
	 * 
	 * @return recordingStartTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp when the conversation recording has started. Null if the recording failed to start.")
	public Long getRecordingStartTimestamp() {
		return recordingStartTimestamp;
	}

	public void setRecordingStartTimestamp(Long recordingStartTimestamp) {
		this.recordingStartTimestamp = recordingStartTimestamp;
	}

	public ConversationRecordingFailedEvent failureReason(ERecordingFailedReason failureReason) {
		this.failureReason = failureReason;
		return this;
	}

	/**
	 * Get failureReason
	 * 
	 * @return failureReason
	 **/
	@ApiModelProperty(value = "")
	public ERecordingFailedReason getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(ERecordingFailedReason failureReason) {
		this.failureReason = failureReason;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationRecordingFailedEvent conversationRecordingFailedEvent = (ConversationRecordingFailedEvent) o;
		return Objects.equals(this.$type, conversationRecordingFailedEvent.$type) &&
				Objects.equals(this.timestamp, conversationRecordingFailedEvent.timestamp) &&
				Objects.equals(this.eventType, conversationRecordingFailedEvent.eventType) &&
				Objects.equals(this.accountId, conversationRecordingFailedEvent.accountId) &&
				Objects.equals(this.conversationId, conversationRecordingFailedEvent.conversationId) &&
				Objects.equals(this.recordingType, conversationRecordingFailedEvent.recordingType) &&
				Objects.equals(this.recordingStartTimestamp, conversationRecordingFailedEvent.recordingStartTimestamp) &&
				Objects.equals(this.failureReason, conversationRecordingFailedEvent.failureReason);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationId, recordingType, recordingStartTimestamp, failureReason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationRecordingFailedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    recordingType: ").append(toIndentedString(recordingType)).append("\n");
		sb.append("    recordingStartTimestamp: ").append(toIndentedString(recordingStartTimestamp)).append("\n");
		sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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
