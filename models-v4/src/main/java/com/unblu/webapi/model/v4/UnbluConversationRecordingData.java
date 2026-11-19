
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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A built-in conversation recording. Unblu stores the recorded file.
 */
@ApiModel(description = "A built-in conversation recording. Unblu stores the recorded file.")

@JsonPropertyOrder({
	UnbluConversationRecordingData.JSON_PROPERTY_$_TYPE,
	UnbluConversationRecordingData.JSON_PROPERTY_ID,
	UnbluConversationRecordingData.JSON_PROPERTY_ACCOUNT_ID,
	UnbluConversationRecordingData.JSON_PROPERTY_CONVERSATION_ID,
	UnbluConversationRecordingData.JSON_PROPERTY_CALL_IDS,
	UnbluConversationRecordingData.JSON_PROPERTY_RECORDING_SYSTEM,
	UnbluConversationRecordingData.JSON_PROPERTY_START_TIMESTAMP,
	UnbluConversationRecordingData.JSON_PROPERTY_END_TIMESTAMP,
	UnbluConversationRecordingData.JSON_PROPERTY_STATUS,
	UnbluConversationRecordingData.JSON_PROPERTY_END_REASON,
	UnbluConversationRecordingData.JSON_PROPERTY_RECORDING_TYPE,
	UnbluConversationRecordingData.JSON_PROPERTY_FILE_NAME,
	UnbluConversationRecordingData.JSON_PROPERTY_MIME_TYPE,
	UnbluConversationRecordingData.JSON_PROPERTY_TOTAL_SIZE,
	UnbluConversationRecordingData.JSON_PROPERTY_DOWNLOAD_LINKS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class UnbluConversationRecordingData implements ConversationRecordingData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		UNBLUCONVERSATIONRECORDINGDATA("UnbluConversationRecordingData");

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
			return TypeEnum.UNBLUCONVERSATIONRECORDINGDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.UNBLUCONVERSATIONRECORDINGDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_CALL_IDS = "callIds";
	@JsonProperty(JSON_PROPERTY_CALL_IDS)
	private List<String> callIds = null;

	public static final String JSON_PROPERTY_RECORDING_SYSTEM = "recordingSystem";
	@JsonProperty(JSON_PROPERTY_RECORDING_SYSTEM)
	private ERecordingSystem recordingSystem = ERecordingSystem.UNBLU;

	public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
	@JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
	private Long startTimestamp;

	public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
	@JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
	private Long endTimestamp;

	public static final String JSON_PROPERTY_STATUS = "status";
	@JsonProperty(JSON_PROPERTY_STATUS)
	private ERecordingStatus status;

	public static final String JSON_PROPERTY_END_REASON = "endReason";
	@JsonProperty(JSON_PROPERTY_END_REASON)
	private ERecordingEndReason endReason;

	public static final String JSON_PROPERTY_RECORDING_TYPE = "recordingType";
	@JsonProperty(JSON_PROPERTY_RECORDING_TYPE)
	private ERecordingType recordingType;

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

	public UnbluConversationRecordingData $type(TypeEnum $type) {
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

	public UnbluConversationRecordingData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID of the recording
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The ID of the recording")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UnbluConversationRecordingData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The ID of the account the recording belongs to
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The ID of the account the recording belongs to")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public UnbluConversationRecordingData conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation the recording belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation the recording belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public UnbluConversationRecordingData callIds(List<String> callIds) {
		this.callIds = callIds;
		return this;
	}

	public UnbluConversationRecordingData addCallIdsItem(String callIdsItem) {
		if (this.callIds == null) {
			this.callIds = new ArrayList<>();
		}
		this.callIds.add(callIdsItem);
		return this;
	}

	/**
	 * The IDs of the calls held during the recording
	 * 
	 * @return callIds
	 **/
	@ApiModelProperty(value = "The IDs of the calls held during the recording")
	public List<String> getCallIds() {
		return callIds;
	}

	public void setCallIds(List<String> callIds) {
		this.callIds = callIds;
	}

	public UnbluConversationRecordingData recordingSystem(ERecordingSystem recordingSystem) {
		this.recordingSystem = recordingSystem;
		return this;
	}

	/**
	 * Get recordingSystem
	 * 
	 * @return recordingSystem
	 **/
	@ApiModelProperty(required = true, value = "")
	public ERecordingSystem getRecordingSystem() {
		return recordingSystem;
	}

	public void setRecordingSystem(ERecordingSystem recordingSystem) {
		this.recordingSystem = recordingSystem;
	}

	public UnbluConversationRecordingData startTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		return this;
	}

	/**
	 * UTC timestamp when the recording started
	 * 
	 * @return startTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp when the recording started")
	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public UnbluConversationRecordingData endTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		return this;
	}

	/**
	 * UTC timestamp when the recording ended. Empty while the recording is running.
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp when the recording ended. Empty while the recording is running.")
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public UnbluConversationRecordingData status(ERecordingStatus status) {
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

	public UnbluConversationRecordingData endReason(ERecordingEndReason endReason) {
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

	public UnbluConversationRecordingData recordingType(ERecordingType recordingType) {
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

	public UnbluConversationRecordingData fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	/**
	 * The filename of the recording
	 * 
	 * @return fileName
	 **/
	@ApiModelProperty(value = "The filename of the recording")
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public UnbluConversationRecordingData mimeType(String mimeType) {
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

	public UnbluConversationRecordingData totalSize(Long totalSize) {
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

	public UnbluConversationRecordingData downloadLinks(List<DownloadLink> downloadLinks) {
		this.downloadLinks = downloadLinks;
		return this;
	}

	public UnbluConversationRecordingData addDownloadLinksItem(DownloadLink downloadLinksItem) {
		if (this.downloadLinks == null) {
			this.downloadLinks = new ArrayList<>();
		}
		this.downloadLinks.add(downloadLinksItem);
		return this;
	}

	/**
	 * URLs to download the recording. The URLs are only accessible to authenticated users that have access to the referenced conversation. Authentication is
	 * possible with either basic authentication or a valid session cookie.
	 * 
	 * @return downloadLinks
	 **/
	@ApiModelProperty(value = "URLs to download the recording. The URLs are only accessible to authenticated users that have access to the referenced conversation. Authentication is possible with either basic authentication or a valid session cookie.")
	public List<DownloadLink> getDownloadLinks() {
		return downloadLinks;
	}

	public void setDownloadLinks(List<DownloadLink> downloadLinks) {
		this.downloadLinks = downloadLinks;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UnbluConversationRecordingData unbluConversationRecordingData = (UnbluConversationRecordingData) o;
		return Objects.equals(this.$type, unbluConversationRecordingData.$type) &&
				Objects.equals(this.id, unbluConversationRecordingData.id) &&
				Objects.equals(this.accountId, unbluConversationRecordingData.accountId) &&
				Objects.equals(this.conversationId, unbluConversationRecordingData.conversationId) &&
				Objects.equals(this.callIds, unbluConversationRecordingData.callIds) &&
				Objects.equals(this.recordingSystem, unbluConversationRecordingData.recordingSystem) &&
				Objects.equals(this.startTimestamp, unbluConversationRecordingData.startTimestamp) &&
				Objects.equals(this.endTimestamp, unbluConversationRecordingData.endTimestamp) &&
				Objects.equals(this.status, unbluConversationRecordingData.status) &&
				Objects.equals(this.endReason, unbluConversationRecordingData.endReason) &&
				Objects.equals(this.recordingType, unbluConversationRecordingData.recordingType) &&
				Objects.equals(this.fileName, unbluConversationRecordingData.fileName) &&
				Objects.equals(this.mimeType, unbluConversationRecordingData.mimeType) &&
				Objects.equals(this.totalSize, unbluConversationRecordingData.totalSize) &&
				Objects.equals(this.downloadLinks, unbluConversationRecordingData.downloadLinks);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, conversationId, callIds, recordingSystem, startTimestamp, endTimestamp, status, endReason, recordingType, fileName, mimeType, totalSize, downloadLinks);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UnbluConversationRecordingData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    callIds: ").append(toIndentedString(callIds)).append("\n");
		sb.append("    recordingSystem: ").append(toIndentedString(recordingSystem)).append("\n");
		sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    endReason: ").append(toIndentedString(endReason)).append("\n");
		sb.append("    recordingType: ").append(toIndentedString(recordingType)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
		sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
		sb.append("    downloadLinks: ").append(toIndentedString(downloadLinks)).append("\n");
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
