
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * ConversationRecordingHistoryData
 */

@JsonPropertyOrder({
	ConversationRecordingHistoryData.JSON_PROPERTY_$_TYPE,
	ConversationRecordingHistoryData.JSON_PROPERTY_CONVERSATION_ID,
	ConversationRecordingHistoryData.JSON_PROPERTY_BLOB_STORE_ID,
	ConversationRecordingHistoryData.JSON_PROPERTY_FILE_NAME,
	ConversationRecordingHistoryData.JSON_PROPERTY_MIME_TYPE,
	ConversationRecordingHistoryData.JSON_PROPERTY_TOTAL_SIZE,
	ConversationRecordingHistoryData.JSON_PROPERTY_DOWNLOAD_LINKS,
	ConversationRecordingHistoryData.JSON_PROPERTY_RECORDING_START_TIMESTAMP,
	ConversationRecordingHistoryData.JSON_PROPERTY_RECORDING_END_TIMESTAMP,
	ConversationRecordingHistoryData.JSON_PROPERTY_STATUS,
	ConversationRecordingHistoryData.JSON_PROPERTY_END_REASON,
	ConversationRecordingHistoryData.JSON_PROPERTY_RECORDING_TYPE,
	ConversationRecordingHistoryData.JSON_PROPERTY_CALL_IDS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationRecordingHistoryData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONRECORDINGHISTORYDATA("ConversationRecordingHistoryData");

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
			return TypeEnum.CONVERSATIONRECORDINGHISTORYDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONRECORDINGHISTORYDATA;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_BLOB_STORE_ID = "blobStoreId";
	@JsonProperty(JSON_PROPERTY_BLOB_STORE_ID)
	private String blobStoreId;

	public static final String JSON_PROPERTY_FILE_NAME = "fileName";
	@JsonProperty(JSON_PROPERTY_FILE_NAME)
	private String fileName;

	public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
	@JsonProperty(JSON_PROPERTY_MIME_TYPE)
	private String mimeType;

	public static final String JSON_PROPERTY_TOTAL_SIZE = "totalSize";
	@JsonProperty(JSON_PROPERTY_TOTAL_SIZE)
	private Long totalSize;

	public static final String JSON_PROPERTY_DOWNLOAD_LINKS = "downloadLinks";
	@JsonProperty(JSON_PROPERTY_DOWNLOAD_LINKS)
	private List<DownloadLink> downloadLinks = null;

	public static final String JSON_PROPERTY_RECORDING_START_TIMESTAMP = "recordingStartTimestamp";
	@JsonProperty(JSON_PROPERTY_RECORDING_START_TIMESTAMP)
	private Long recordingStartTimestamp;

	public static final String JSON_PROPERTY_RECORDING_END_TIMESTAMP = "recordingEndTimestamp";
	@JsonProperty(JSON_PROPERTY_RECORDING_END_TIMESTAMP)
	private Long recordingEndTimestamp;

	public static final String JSON_PROPERTY_STATUS = "status";
	@JsonProperty(JSON_PROPERTY_STATUS)
	private ERecordingStatus status;

	public static final String JSON_PROPERTY_END_REASON = "endReason";
	@JsonProperty(JSON_PROPERTY_END_REASON)
	private ERecordingEndReason endReason;

	public static final String JSON_PROPERTY_RECORDING_TYPE = "recordingType";
	@JsonProperty(JSON_PROPERTY_RECORDING_TYPE)
	private ERecordingType recordingType;

	public static final String JSON_PROPERTY_CALL_IDS = "callIds";
	@JsonProperty(JSON_PROPERTY_CALL_IDS)
	private List<String> callIds = null;

	public ConversationRecordingHistoryData $type(TypeEnum $type) {
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

	public ConversationRecordingHistoryData conversationId(String conversationId) {
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

	public ConversationRecordingHistoryData blobStoreId(String blobStoreId) {
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

	public ConversationRecordingHistoryData fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	/**
	 * The filename of this recording
	 * 
	 * @return fileName
	 **/
	@ApiModelProperty(value = "The filename of this recording")
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public ConversationRecordingHistoryData mimeType(String mimeType) {
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

	public ConversationRecordingHistoryData totalSize(Long totalSize) {
		this.totalSize = totalSize;
		return this;
	}

	/**
	 * The total size of this recording in bytes
	 * 
	 * @return totalSize
	 **/
	@ApiModelProperty(value = "The total size of this recording in bytes")
	public Long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public ConversationRecordingHistoryData downloadLinks(List<DownloadLink> downloadLinks) {
		this.downloadLinks = downloadLinks;
		return this;
	}

	public ConversationRecordingHistoryData addDownloadLinksItem(DownloadLink downloadLinksItem) {
		if (this.downloadLinks == null) {
			this.downloadLinks = new ArrayList<>();
		}
		this.downloadLinks.add(downloadLinksItem);
		return this;
	}

	/**
	 * URLs to download the recordings. The URLs are only accessible to authenticated users that have access to the referenced conversation. Authentication is
	 * possible with either basic authentication or a valid session cookie.
	 * 
	 * @return downloadLinks
	 **/
	@ApiModelProperty(value = "URLs to download the recordings. The URLs are only accessible to authenticated users that have access to the referenced conversation. Authentication is possible with either basic authentication or a valid session cookie.")
	public List<DownloadLink> getDownloadLinks() {
		return downloadLinks;
	}

	public void setDownloadLinks(List<DownloadLink> downloadLinks) {
		this.downloadLinks = downloadLinks;
	}

	public ConversationRecordingHistoryData recordingStartTimestamp(Long recordingStartTimestamp) {
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

	public ConversationRecordingHistoryData recordingEndTimestamp(Long recordingEndTimestamp) {
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

	public ConversationRecordingHistoryData status(ERecordingStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "")
	public ERecordingStatus getStatus() {
		return status;
	}

	public void setStatus(ERecordingStatus status) {
		this.status = status;
	}

	public ConversationRecordingHistoryData endReason(ERecordingEndReason endReason) {
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

	public ConversationRecordingHistoryData recordingType(ERecordingType recordingType) {
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

	public ConversationRecordingHistoryData callIds(List<String> callIds) {
		this.callIds = callIds;
		return this;
	}

	public ConversationRecordingHistoryData addCallIdsItem(String callIdsItem) {
		if (this.callIds == null) {
			this.callIds = new ArrayList<>();
		}
		this.callIds.add(callIdsItem);
		return this;
	}

	/**
	 * A list of call IDs held during this recording
	 * 
	 * @return callIds
	 **/
	@ApiModelProperty(value = "A list of call IDs held during this recording")
	public List<String> getCallIds() {
		return callIds;
	}

	public void setCallIds(List<String> callIds) {
		this.callIds = callIds;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationRecordingHistoryData conversationRecordingHistoryData = (ConversationRecordingHistoryData) o;
		return Objects.equals(this.$type, conversationRecordingHistoryData.$type) &&
				Objects.equals(this.conversationId, conversationRecordingHistoryData.conversationId) &&
				Objects.equals(this.blobStoreId, conversationRecordingHistoryData.blobStoreId) &&
				Objects.equals(this.fileName, conversationRecordingHistoryData.fileName) &&
				Objects.equals(this.mimeType, conversationRecordingHistoryData.mimeType) &&
				Objects.equals(this.totalSize, conversationRecordingHistoryData.totalSize) &&
				Objects.equals(this.downloadLinks, conversationRecordingHistoryData.downloadLinks) &&
				Objects.equals(this.recordingStartTimestamp, conversationRecordingHistoryData.recordingStartTimestamp) &&
				Objects.equals(this.recordingEndTimestamp, conversationRecordingHistoryData.recordingEndTimestamp) &&
				Objects.equals(this.status, conversationRecordingHistoryData.status) &&
				Objects.equals(this.endReason, conversationRecordingHistoryData.endReason) &&
				Objects.equals(this.recordingType, conversationRecordingHistoryData.recordingType) &&
				Objects.equals(this.callIds, conversationRecordingHistoryData.callIds);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, conversationId, blobStoreId, fileName, mimeType, totalSize, downloadLinks, recordingStartTimestamp, recordingEndTimestamp, status, endReason, recordingType, callIds);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationRecordingHistoryData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    blobStoreId: ").append(toIndentedString(blobStoreId)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
		sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
		sb.append("    downloadLinks: ").append(toIndentedString(downloadLinks)).append("\n");
		sb.append("    recordingStartTimestamp: ").append(toIndentedString(recordingStartTimestamp)).append("\n");
		sb.append("    recordingEndTimestamp: ").append(toIndentedString(recordingEndTimestamp)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    endReason: ").append(toIndentedString(endReason)).append("\n");
		sb.append("    recordingType: ").append(toIndentedString(recordingType)).append("\n");
		sb.append("    callIds: ").append(toIndentedString(callIds)).append("\n");
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
