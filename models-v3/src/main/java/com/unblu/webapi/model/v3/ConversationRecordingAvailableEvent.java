
package com.unblu.webapi.model.v3;

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
 * Event emitted when a conversation recording is available
 */
@ApiModel(description = "Event emitted when a conversation recording is available")

@JsonPropertyOrder({
	ConversationRecordingAvailableEvent.JSON_PROPERTY_$_TYPE,
	ConversationRecordingAvailableEvent.JSON_PROPERTY_TIMESTAMP,
	ConversationRecordingAvailableEvent.JSON_PROPERTY_EVENT_TYPE,
	ConversationRecordingAvailableEvent.JSON_PROPERTY_ACCOUNT_ID,
	ConversationRecordingAvailableEvent.JSON_PROPERTY_CONVERSATION_ID,
	ConversationRecordingAvailableEvent.JSON_PROPERTY_BLOB_STORE_ID,
	ConversationRecordingAvailableEvent.JSON_PROPERTY_MIME_TYPE,
	ConversationRecordingAvailableEvent.JSON_PROPERTY_TOTAL_SIZE,
	ConversationRecordingAvailableEvent.JSON_PROPERTY_DOWNLOAD_LINK,
	ConversationRecordingAvailableEvent.JSON_PROPERTY_RECORDING_START_TIMESTAMP,
	ConversationRecordingAvailableEvent.JSON_PROPERTY_RECORDING_END_TIMESTAMP,
	ConversationRecordingAvailableEvent.JSON_PROPERTY_END_REASON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationRecordingAvailableEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONRECORDINGAVAILABLEEVENT("ConversationRecordingAvailableEvent");

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
			return TypeEnum.CONVERSATIONRECORDINGAVAILABLEEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONRECORDINGAVAILABLEEVENT;

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

	public static final String JSON_PROPERTY_DOWNLOAD_LINK = "downloadLink";
	@JsonProperty(JSON_PROPERTY_DOWNLOAD_LINK)
	private String downloadLink;

	public static final String JSON_PROPERTY_RECORDING_START_TIMESTAMP = "recordingStartTimestamp";
	@JsonProperty(JSON_PROPERTY_RECORDING_START_TIMESTAMP)
	private Long recordingStartTimestamp;

	public static final String JSON_PROPERTY_RECORDING_END_TIMESTAMP = "recordingEndTimestamp";
	@JsonProperty(JSON_PROPERTY_RECORDING_END_TIMESTAMP)
	private Long recordingEndTimestamp;

	public static final String JSON_PROPERTY_END_REASON = "endReason";
	@JsonProperty(JSON_PROPERTY_END_REASON)
	private ERecordingEndReason endReason;

	public ConversationRecordingAvailableEvent $type(TypeEnum $type) {
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

	public ConversationRecordingAvailableEvent timestamp(Long timestamp) {
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

	public ConversationRecordingAvailableEvent eventType(String eventType) {
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

	public ConversationRecordingAvailableEvent accountId(String accountId) {
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

	public ConversationRecordingAvailableEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * Id of the conversation this recording belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "Id of the conversation this recording belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ConversationRecordingAvailableEvent blobStoreId(String blobStoreId) {
		this.blobStoreId = blobStoreId;
		return this;
	}

	/**
	 * The blob store id of the actual recording.
	 * 
	 * @return blobStoreId
	 **/
	@ApiModelProperty(value = "The blob store id of the actual recording.")
	public String getBlobStoreId() {
		return blobStoreId;
	}

	public void setBlobStoreId(String blobStoreId) {
		this.blobStoreId = blobStoreId;
	}

	public ConversationRecordingAvailableEvent mimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	/**
	 * The mime type of the recording
	 * 
	 * @return mimeType
	 **/
	@ApiModelProperty(value = "The mime type of the recording")
	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public ConversationRecordingAvailableEvent totalSize(Long totalSize) {
		this.totalSize = totalSize;
		return this;
	}

	/**
	 * The total size in bytes of this recording
	 * 
	 * @return totalSize
	 **/
	@ApiModelProperty(value = "The total size in bytes of this recording")
	public Long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public ConversationRecordingAvailableEvent downloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
		return this;
	}

	/**
	 * The url link to download the recording. Note that the access must be done from an authenticated user with admin rights. This may either be done using basic
	 * authentication or a valid session cookie.
	 * 
	 * @return downloadLink
	 **/
	@ApiModelProperty(value = "The url link to download the recording. Note that the access must be done from an authenticated user with admin rights. This may either be done using basic authentication or a valid session cookie.")
	public String getDownloadLink() {
		return downloadLink;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}

	public ConversationRecordingAvailableEvent recordingStartTimestamp(Long recordingStartTimestamp) {
		this.recordingStartTimestamp = recordingStartTimestamp;
		return this;
	}

	/**
	 * utc timestamp when the conversation recording has started
	 * 
	 * @return recordingStartTimestamp
	 **/
	@ApiModelProperty(value = "utc timestamp when the conversation recording has started")
	public Long getRecordingStartTimestamp() {
		return recordingStartTimestamp;
	}

	public void setRecordingStartTimestamp(Long recordingStartTimestamp) {
		this.recordingStartTimestamp = recordingStartTimestamp;
	}

	public ConversationRecordingAvailableEvent recordingEndTimestamp(Long recordingEndTimestamp) {
		this.recordingEndTimestamp = recordingEndTimestamp;
		return this;
	}

	/**
	 * utc timestamp when the conversation recording has ended
	 * 
	 * @return recordingEndTimestamp
	 **/
	@ApiModelProperty(value = "utc timestamp when the conversation recording has ended")
	public Long getRecordingEndTimestamp() {
		return recordingEndTimestamp;
	}

	public void setRecordingEndTimestamp(Long recordingEndTimestamp) {
		this.recordingEndTimestamp = recordingEndTimestamp;
	}

	public ConversationRecordingAvailableEvent endReason(ERecordingEndReason endReason) {
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
		ConversationRecordingAvailableEvent conversationRecordingAvailableEvent = (ConversationRecordingAvailableEvent) o;
		return Objects.equals(this.$type, conversationRecordingAvailableEvent.$type) &&
				Objects.equals(this.timestamp, conversationRecordingAvailableEvent.timestamp) &&
				Objects.equals(this.eventType, conversationRecordingAvailableEvent.eventType) &&
				Objects.equals(this.accountId, conversationRecordingAvailableEvent.accountId) &&
				Objects.equals(this.conversationId, conversationRecordingAvailableEvent.conversationId) &&
				Objects.equals(this.blobStoreId, conversationRecordingAvailableEvent.blobStoreId) &&
				Objects.equals(this.mimeType, conversationRecordingAvailableEvent.mimeType) &&
				Objects.equals(this.totalSize, conversationRecordingAvailableEvent.totalSize) &&
				Objects.equals(this.downloadLink, conversationRecordingAvailableEvent.downloadLink) &&
				Objects.equals(this.recordingStartTimestamp, conversationRecordingAvailableEvent.recordingStartTimestamp) &&
				Objects.equals(this.recordingEndTimestamp, conversationRecordingAvailableEvent.recordingEndTimestamp) &&
				Objects.equals(this.endReason, conversationRecordingAvailableEvent.endReason);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationId, blobStoreId, mimeType, totalSize, downloadLink, recordingStartTimestamp, recordingEndTimestamp, endReason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationRecordingAvailableEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    blobStoreId: ").append(toIndentedString(blobStoreId)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
		sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
		sb.append("    downloadLink: ").append(toIndentedString(downloadLink)).append("\n");
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
