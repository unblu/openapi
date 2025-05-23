
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
 * An event emitted when the postprocessing of a conversation recording starts
 */
@ApiModel(description = "An event emitted when the postprocessing of a conversation recording starts")

@JsonPropertyOrder({
	ConversationRecordingPostprocessingEvent.JSON_PROPERTY_$_TYPE,
	ConversationRecordingPostprocessingEvent.JSON_PROPERTY_TIMESTAMP,
	ConversationRecordingPostprocessingEvent.JSON_PROPERTY_EVENT_TYPE,
	ConversationRecordingPostprocessingEvent.JSON_PROPERTY_ACCOUNT_ID,
	ConversationRecordingPostprocessingEvent.JSON_PROPERTY_CONVERSATION_ID,
	ConversationRecordingPostprocessingEvent.JSON_PROPERTY_BLOB_STORE_ID,
	ConversationRecordingPostprocessingEvent.JSON_PROPERTY_MIME_TYPE,
	ConversationRecordingPostprocessingEvent.JSON_PROPERTY_TOTAL_SIZE,
	ConversationRecordingPostprocessingEvent.JSON_PROPERTY_RECORDING_START_TIMESTAMP,
	ConversationRecordingPostprocessingEvent.JSON_PROPERTY_RECORDING_END_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationRecordingPostprocessingEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONRECORDINGPOSTPROCESSINGEVENT("ConversationRecordingPostprocessingEvent");

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
			return TypeEnum.CONVERSATIONRECORDINGPOSTPROCESSINGEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONRECORDINGPOSTPROCESSINGEVENT;

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

	public static final String JSON_PROPERTY_BLOB_STORE_ID = "blobStoreId";
	@JsonProperty(JSON_PROPERTY_BLOB_STORE_ID)
	private String blobStoreId;

	public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
	@JsonProperty(JSON_PROPERTY_MIME_TYPE)
	private String mimeType;

	public static final String JSON_PROPERTY_TOTAL_SIZE = "totalSize";
	@JsonProperty(JSON_PROPERTY_TOTAL_SIZE)
	private Long totalSize;

	public static final String JSON_PROPERTY_RECORDING_START_TIMESTAMP = "recordingStartTimestamp";
	@JsonProperty(JSON_PROPERTY_RECORDING_START_TIMESTAMP)
	private Long recordingStartTimestamp;

	public static final String JSON_PROPERTY_RECORDING_END_TIMESTAMP = "recordingEndTimestamp";
	@JsonProperty(JSON_PROPERTY_RECORDING_END_TIMESTAMP)
	private Long recordingEndTimestamp;

	public ConversationRecordingPostprocessingEvent $type(TypeEnum $type) {
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

	public ConversationRecordingPostprocessingEvent timestamp(Long timestamp) {
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

	public ConversationRecordingPostprocessingEvent eventType(String eventType) {
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

	public ConversationRecordingPostprocessingEvent accountId(String accountId) {
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

	public ConversationRecordingPostprocessingEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * ID of the conversation the recording belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "ID of the conversation the recording belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ConversationRecordingPostprocessingEvent blobStoreId(String blobStoreId) {
		this.blobStoreId = blobStoreId;
		return this;
	}

	/**
	 * The blob store ID of the recording
	 * 
	 * @return blobStoreId
	 **/
	@ApiModelProperty(value = "The blob store ID of the recording")
	public String getBlobStoreId() {
		return blobStoreId;
	}

	public void setBlobStoreId(String blobStoreId) {
		this.blobStoreId = blobStoreId;
	}

	public ConversationRecordingPostprocessingEvent mimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	/**
	 * The MIME type of the recording
	 * 
	 * @return mimeType
	 **/
	@ApiModelProperty(value = "The MIME type of the recording")
	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public ConversationRecordingPostprocessingEvent totalSize(Long totalSize) {
		this.totalSize = totalSize;
		return this;
	}

	/**
	 * The total size of the recording in bytes
	 * 
	 * @return totalSize
	 **/
	@ApiModelProperty(value = "The total size of the recording in bytes")
	public Long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public ConversationRecordingPostprocessingEvent recordingStartTimestamp(Long recordingStartTimestamp) {
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

	public ConversationRecordingPostprocessingEvent recordingEndTimestamp(Long recordingEndTimestamp) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationRecordingPostprocessingEvent conversationRecordingPostprocessingEvent = (ConversationRecordingPostprocessingEvent) o;
		return Objects.equals(this.$type, conversationRecordingPostprocessingEvent.$type) &&
				Objects.equals(this.timestamp, conversationRecordingPostprocessingEvent.timestamp) &&
				Objects.equals(this.eventType, conversationRecordingPostprocessingEvent.eventType) &&
				Objects.equals(this.accountId, conversationRecordingPostprocessingEvent.accountId) &&
				Objects.equals(this.conversationId, conversationRecordingPostprocessingEvent.conversationId) &&
				Objects.equals(this.blobStoreId, conversationRecordingPostprocessingEvent.blobStoreId) &&
				Objects.equals(this.mimeType, conversationRecordingPostprocessingEvent.mimeType) &&
				Objects.equals(this.totalSize, conversationRecordingPostprocessingEvent.totalSize) &&
				Objects.equals(this.recordingStartTimestamp, conversationRecordingPostprocessingEvent.recordingStartTimestamp) &&
				Objects.equals(this.recordingEndTimestamp, conversationRecordingPostprocessingEvent.recordingEndTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationId, blobStoreId, mimeType, totalSize, recordingStartTimestamp, recordingEndTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationRecordingPostprocessingEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    blobStoreId: ").append(toIndentedString(blobStoreId)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
		sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
		sb.append("    recordingStartTimestamp: ").append(toIndentedString(recordingStartTimestamp)).append("\n");
		sb.append("    recordingEndTimestamp: ").append(toIndentedString(recordingEndTimestamp)).append("\n");
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
