
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
 * Data model object for a File (ConversationFile), which was shared/sent in a conversation
 */
@ApiModel(description = "Data model object for a File (ConversationFile), which was shared/sent in a conversation")

@JsonPropertyOrder({
	ConversationFileData.JSON_PROPERTY_$_TYPE,
	ConversationFileData.JSON_PROPERTY_CONVERSATION_ID,
	ConversationFileData.JSON_PROPERTY_OWNER_PERSON_ID,
	ConversationFileData.JSON_PROPERTY_NAME,
	ConversationFileData.JSON_PROPERTY_MIME_TYPE,
	ConversationFileData.JSON_PROPERTY_SOURCE,
	ConversationFileData.JSON_PROPERTY_FILE_STORE_ID,
	ConversationFileData.JSON_PROPERTY_TOTAL_SIZE,
	ConversationFileData.JSON_PROPERTY_DOWNLOAD_LINK,
	ConversationFileData.JSON_PROPERTY_CREATION_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationFileData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONFILEDATA("ConversationFileData");

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
			return TypeEnum.CONVERSATIONFILEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONFILEDATA;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_OWNER_PERSON_ID = "ownerPersonId";
	@JsonProperty(JSON_PROPERTY_OWNER_PERSON_ID)
	private String ownerPersonId;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
	@JsonProperty(JSON_PROPERTY_MIME_TYPE)
	private String mimeType;

	public static final String JSON_PROPERTY_SOURCE = "source";
	@JsonProperty(JSON_PROPERTY_SOURCE)
	private String source;

	public static final String JSON_PROPERTY_FILE_STORE_ID = "fileStoreId";
	@JsonProperty(JSON_PROPERTY_FILE_STORE_ID)
	private String fileStoreId;

	public static final String JSON_PROPERTY_TOTAL_SIZE = "totalSize";
	@JsonProperty(JSON_PROPERTY_TOTAL_SIZE)
	private Long totalSize;

	public static final String JSON_PROPERTY_DOWNLOAD_LINK = "downloadLink";
	@JsonProperty(JSON_PROPERTY_DOWNLOAD_LINK)
	private String downloadLink;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public ConversationFileData $type(TypeEnum $type) {
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

	public ConversationFileData conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The id of the Conversation, in which the file was shared/sent
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The id of the Conversation, in which the file was shared/sent")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ConversationFileData ownerPersonId(String ownerPersonId) {
		this.ownerPersonId = ownerPersonId;
		return this;
	}

	/**
	 * The id of the owner Person, who shared/sent this file in the conversation
	 * 
	 * @return ownerPersonId
	 **/
	@ApiModelProperty(value = "The id of the owner Person, who shared/sent this file in the conversation")
	public String getOwnerPersonId() {
		return ownerPersonId;
	}

	public void setOwnerPersonId(String ownerPersonId) {
		this.ownerPersonId = ownerPersonId;
	}

	public ConversationFileData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The name of the file, which was shared/sent in the conversation
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "The name of the file, which was shared/sent in the conversation")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ConversationFileData mimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	/**
	 * The mime type of the file, which was shared/sent in the conversation
	 * 
	 * @return mimeType
	 **/
	@ApiModelProperty(value = "The mime type of the file, which was shared/sent in the conversation")
	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public ConversationFileData source(String source) {
		this.source = source;
		return this;
	}

	/**
	 * The source of the file, which was shared/sent in the conversation (is either the name of the uploading person or the uploading system)
	 * 
	 * @return source
	 **/
	@ApiModelProperty(value = "The source of the file, which was shared/sent in the conversation (is either the name of the uploading person or the uploading system)")
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public ConversationFileData fileStoreId(String fileStoreId) {
		this.fileStoreId = fileStoreId;
		return this;
	}

	/**
	 * The file store id of the actual content of the file, which was shared/sent in the conversation. Stored at the collaboration server.
	 * 
	 * @return fileStoreId
	 **/
	@ApiModelProperty(value = "The file store id of the actual content of the file, which was shared/sent in the conversation. Stored at the collaboration server.")
	public String getFileStoreId() {
		return fileStoreId;
	}

	public void setFileStoreId(String fileStoreId) {
		this.fileStoreId = fileStoreId;
	}

	public ConversationFileData totalSize(Long totalSize) {
		this.totalSize = totalSize;
		return this;
	}

	/**
	 * The total size in bytes of the file, which was shared/sent in the conversation. Note that it is not always set.
	 * 
	 * @return totalSize
	 **/
	@ApiModelProperty(value = "The total size in bytes of the file, which was shared/sent in the conversation. Note that it is not always set.")
	public Long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public ConversationFileData downloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
		return this;
	}

	/**
	 * The URL to download the file. Access is only permitted for authenticated users with admin rights. Authentication is possible using basic authentication or a
	 * valid session cookie.&lt;br&gt; If the file is currently being reviewed by one or more file interceptors, calling the URL returns a 403 code until the file
	 * upload has been approved.
	 * 
	 * @return downloadLink
	 **/
	@ApiModelProperty(value = "The URL to download the file. Access is only permitted for authenticated users with admin rights. Authentication is possible using basic authentication or a valid session cookie.<br> If the file is currently being reviewed by one or more file interceptors, calling the URL returns a 403 code until the file upload has been approved.")
	public String getDownloadLink() {
		return downloadLink;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}

	public ConversationFileData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp, when the file was shared/sent in the conversation
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp, when the file was shared/sent in the conversation")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationFileData conversationFileData = (ConversationFileData) o;
		return Objects.equals(this.$type, conversationFileData.$type) &&
				Objects.equals(this.conversationId, conversationFileData.conversationId) &&
				Objects.equals(this.ownerPersonId, conversationFileData.ownerPersonId) &&
				Objects.equals(this.name, conversationFileData.name) &&
				Objects.equals(this.mimeType, conversationFileData.mimeType) &&
				Objects.equals(this.source, conversationFileData.source) &&
				Objects.equals(this.fileStoreId, conversationFileData.fileStoreId) &&
				Objects.equals(this.totalSize, conversationFileData.totalSize) &&
				Objects.equals(this.downloadLink, conversationFileData.downloadLink) &&
				Objects.equals(this.creationTimestamp, conversationFileData.creationTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, conversationId, ownerPersonId, name, mimeType, source, fileStoreId, totalSize, downloadLink, creationTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationFileData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    ownerPersonId: ").append(toIndentedString(ownerPersonId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
		sb.append("    source: ").append(toIndentedString(source)).append("\n");
		sb.append("    fileStoreId: ").append(toIndentedString(fileStoreId)).append("\n");
		sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
		sb.append("    downloadLink: ").append(toIndentedString(downloadLink)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
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
