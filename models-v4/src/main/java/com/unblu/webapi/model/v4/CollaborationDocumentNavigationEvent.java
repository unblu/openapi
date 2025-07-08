
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
 * An event triggered every time a document action takes place in a document co-browsing collaboration layer
 */
@ApiModel(description = "An event triggered every time a document action takes place in a document co-browsing collaboration layer")

@JsonPropertyOrder({
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_$_TYPE,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_TIMESTAMP,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_EVENT_TYPE,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_ACCOUNT_ID,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_LAYER_ID,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_CONVERSATION_ID,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_EVENT_TIMESTAMP,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_LAYER_OWNER_PERSON_ID,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_LAYER_OWNER_PERSON_PRESENCE_ID,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_TRIGGERING_PERSON_ID,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_TRIGGERING_PERSON_PRESENCE_ID,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_FILE_ID,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_DOCUMENT_ACTION_TYPE,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_FILE_NAME,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_FILE_SIZE,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_MIME_TYPE,
	CollaborationDocumentNavigationEvent.JSON_PROPERTY_LINKS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CollaborationDocumentNavigationEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		COLLABORATIONDOCUMENTNAVIGATIONEVENT("CollaborationDocumentNavigationEvent");

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
			return TypeEnum.COLLABORATIONDOCUMENTNAVIGATIONEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.COLLABORATIONDOCUMENTNAVIGATIONEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_LAYER_ID = "layerId";
	@JsonProperty(JSON_PROPERTY_LAYER_ID)
	private String layerId;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_EVENT_TIMESTAMP = "eventTimestamp";
	@JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
	private Long eventTimestamp;

	public static final String JSON_PROPERTY_LAYER_OWNER_PERSON_ID = "layerOwnerPersonId";
	@JsonProperty(JSON_PROPERTY_LAYER_OWNER_PERSON_ID)
	private String layerOwnerPersonId;

	public static final String JSON_PROPERTY_LAYER_OWNER_PERSON_PRESENCE_ID = "layerOwnerPersonPresenceId";
	@JsonProperty(JSON_PROPERTY_LAYER_OWNER_PERSON_PRESENCE_ID)
	private String layerOwnerPersonPresenceId;

	public static final String JSON_PROPERTY_TRIGGERING_PERSON_ID = "triggeringPersonId";
	@JsonProperty(JSON_PROPERTY_TRIGGERING_PERSON_ID)
	private String triggeringPersonId;

	public static final String JSON_PROPERTY_TRIGGERING_PERSON_PRESENCE_ID = "triggeringPersonPresenceId";
	@JsonProperty(JSON_PROPERTY_TRIGGERING_PERSON_PRESENCE_ID)
	private String triggeringPersonPresenceId;

	public static final String JSON_PROPERTY_FILE_ID = "fileId";
	@JsonProperty(JSON_PROPERTY_FILE_ID)
	private String fileId;

	public static final String JSON_PROPERTY_DOCUMENT_ACTION_TYPE = "documentActionType";
	@JsonProperty(JSON_PROPERTY_DOCUMENT_ACTION_TYPE)
	private EDocumentActionType documentActionType;

	public static final String JSON_PROPERTY_FILE_NAME = "fileName";
	@JsonProperty(JSON_PROPERTY_FILE_NAME)
	private String fileName;

	public static final String JSON_PROPERTY_FILE_SIZE = "fileSize";
	@JsonProperty(JSON_PROPERTY_FILE_SIZE)
	private Long fileSize;

	public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
	@JsonProperty(JSON_PROPERTY_MIME_TYPE)
	private String mimeType;

	public static final String JSON_PROPERTY_LINKS = "links";
	@JsonProperty(JSON_PROPERTY_LINKS)
	private List<DownloadLink> links = null;

	public CollaborationDocumentNavigationEvent $type(TypeEnum $type) {
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

	public CollaborationDocumentNavigationEvent timestamp(Long timestamp) {
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

	public CollaborationDocumentNavigationEvent eventType(String eventType) {
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

	public CollaborationDocumentNavigationEvent accountId(String accountId) {
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

	public CollaborationDocumentNavigationEvent layerId(String layerId) {
		this.layerId = layerId;
		return this;
	}

	/**
	 * The ID of the collaboration layer
	 * 
	 * @return layerId
	 **/
	@ApiModelProperty(value = "The ID of the collaboration layer")
	public String getLayerId() {
		return layerId;
	}

	public void setLayerId(String layerId) {
		this.layerId = layerId;
	}

	public CollaborationDocumentNavigationEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation that the layer belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation that the layer belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public CollaborationDocumentNavigationEvent eventTimestamp(Long eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
		return this;
	}

	/**
	 * The timestamp when the event occurred
	 * 
	 * @return eventTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp when the event occurred")
	public Long getEventTimestamp() {
		return eventTimestamp;
	}

	public void setEventTimestamp(Long eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
	}

	public CollaborationDocumentNavigationEvent layerOwnerPersonId(String layerOwnerPersonId) {
		this.layerOwnerPersonId = layerOwnerPersonId;
		return this;
	}

	/**
	 * The ID of the person who started the layer
	 * 
	 * @return layerOwnerPersonId
	 **/
	@ApiModelProperty(value = "The ID of the person who started the layer")
	public String getLayerOwnerPersonId() {
		return layerOwnerPersonId;
	}

	public void setLayerOwnerPersonId(String layerOwnerPersonId) {
		this.layerOwnerPersonId = layerOwnerPersonId;
	}

	public CollaborationDocumentNavigationEvent layerOwnerPersonPresenceId(String layerOwnerPersonPresenceId) {
		this.layerOwnerPersonPresenceId = layerOwnerPersonPresenceId;
		return this;
	}

	/**
	 * The ID of the person presence in the conversation who started the layer
	 * 
	 * @return layerOwnerPersonPresenceId
	 **/
	@ApiModelProperty(value = "The ID of the person presence in the conversation who started the layer")
	public String getLayerOwnerPersonPresenceId() {
		return layerOwnerPersonPresenceId;
	}

	public void setLayerOwnerPersonPresenceId(String layerOwnerPersonPresenceId) {
		this.layerOwnerPersonPresenceId = layerOwnerPersonPresenceId;
	}

	public CollaborationDocumentNavigationEvent triggeringPersonId(String triggeringPersonId) {
		this.triggeringPersonId = triggeringPersonId;
		return this;
	}

	/**
	 * The ID of the person currently in control of navigation
	 * 
	 * @return triggeringPersonId
	 **/
	@ApiModelProperty(value = "The ID of the person currently in control of navigation")
	public String getTriggeringPersonId() {
		return triggeringPersonId;
	}

	public void setTriggeringPersonId(String triggeringPersonId) {
		this.triggeringPersonId = triggeringPersonId;
	}

	public CollaborationDocumentNavigationEvent triggeringPersonPresenceId(String triggeringPersonPresenceId) {
		this.triggeringPersonPresenceId = triggeringPersonPresenceId;
		return this;
	}

	/**
	 * The person presence ID of the person currently in control of navigation
	 * 
	 * @return triggeringPersonPresenceId
	 **/
	@ApiModelProperty(value = "The person presence ID of the person currently in control of navigation")
	public String getTriggeringPersonPresenceId() {
		return triggeringPersonPresenceId;
	}

	public void setTriggeringPersonPresenceId(String triggeringPersonPresenceId) {
		this.triggeringPersonPresenceId = triggeringPersonPresenceId;
	}

	public CollaborationDocumentNavigationEvent fileId(String fileId) {
		this.fileId = fileId;
		return this;
	}

	/**
	 * The file store ID of the actual content of the file, which was shared in the conversation. Stored by the Collaboration Server.
	 * 
	 * @return fileId
	 **/
	@ApiModelProperty(value = "The file store ID of the actual content of the file, which was shared in the conversation. Stored by the Collaboration Server.")
	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public CollaborationDocumentNavigationEvent documentActionType(EDocumentActionType documentActionType) {
		this.documentActionType = documentActionType;
		return this;
	}

	/**
	 * Get documentActionType
	 * 
	 * @return documentActionType
	 **/
	@ApiModelProperty(value = "")
	public EDocumentActionType getDocumentActionType() {
		return documentActionType;
	}

	public void setDocumentActionType(EDocumentActionType documentActionType) {
		this.documentActionType = documentActionType;
	}

	public CollaborationDocumentNavigationEvent fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	/**
	 * The name of the file shared in the conversation
	 * 
	 * @return fileName
	 **/
	@ApiModelProperty(value = "The name of the file shared in the conversation")
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public CollaborationDocumentNavigationEvent fileSize(Long fileSize) {
		this.fileSize = fileSize;
		return this;
	}

	/**
	 * The total size, in bytes, of the file, which was shared in the conversation. Not always set.
	 * 
	 * @return fileSize
	 **/
	@ApiModelProperty(value = "The total size, in bytes, of the file, which was shared in the conversation. Not always set.")
	public Long getFileSize() {
		return fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public CollaborationDocumentNavigationEvent mimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	/**
	 * The MIME type of the file shared in the conversation
	 * 
	 * @return mimeType
	 **/
	@ApiModelProperty(value = "The MIME type of the file shared in the conversation")
	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public CollaborationDocumentNavigationEvent links(List<DownloadLink> links) {
		this.links = links;
		return this;
	}

	public CollaborationDocumentNavigationEvent addLinksItem(DownloadLink linksItem) {
		if (this.links == null) {
			this.links = new ArrayList<>();
		}
		this.links.add(linksItem);
		return this;
	}

	/**
	 * URLs to download the file. One link is to download the file via the web API, the other is to download the file from the Agent Desk. The URLs are only
	 * accessible to authenticated users that have access to the referenced conversation. Authentication is possible with basic authentication or a valid session
	 * cookie.&lt;br&gt; If the file is currently being reviewed by one or more file interceptors, calling one of the URLs returns a 403 code until the file upload
	 * has been approved.
	 * 
	 * @return links
	 **/
	@ApiModelProperty(value = "URLs to download the file. One link is to download the file via the web API, the other is to download the file from the Agent Desk. The URLs are only accessible to authenticated users that have access to the referenced conversation. Authentication is possible with basic authentication or a valid session cookie.<br> If the file is currently being reviewed by one or more file interceptors, calling one of the URLs returns a 403 code until the file upload has been approved.")
	public List<DownloadLink> getLinks() {
		return links;
	}

	public void setLinks(List<DownloadLink> links) {
		this.links = links;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CollaborationDocumentNavigationEvent collaborationDocumentNavigationEvent = (CollaborationDocumentNavigationEvent) o;
		return Objects.equals(this.$type, collaborationDocumentNavigationEvent.$type) &&
				Objects.equals(this.timestamp, collaborationDocumentNavigationEvent.timestamp) &&
				Objects.equals(this.eventType, collaborationDocumentNavigationEvent.eventType) &&
				Objects.equals(this.accountId, collaborationDocumentNavigationEvent.accountId) &&
				Objects.equals(this.layerId, collaborationDocumentNavigationEvent.layerId) &&
				Objects.equals(this.conversationId, collaborationDocumentNavigationEvent.conversationId) &&
				Objects.equals(this.eventTimestamp, collaborationDocumentNavigationEvent.eventTimestamp) &&
				Objects.equals(this.layerOwnerPersonId, collaborationDocumentNavigationEvent.layerOwnerPersonId) &&
				Objects.equals(this.layerOwnerPersonPresenceId, collaborationDocumentNavigationEvent.layerOwnerPersonPresenceId) &&
				Objects.equals(this.triggeringPersonId, collaborationDocumentNavigationEvent.triggeringPersonId) &&
				Objects.equals(this.triggeringPersonPresenceId, collaborationDocumentNavigationEvent.triggeringPersonPresenceId) &&
				Objects.equals(this.fileId, collaborationDocumentNavigationEvent.fileId) &&
				Objects.equals(this.documentActionType, collaborationDocumentNavigationEvent.documentActionType) &&
				Objects.equals(this.fileName, collaborationDocumentNavigationEvent.fileName) &&
				Objects.equals(this.fileSize, collaborationDocumentNavigationEvent.fileSize) &&
				Objects.equals(this.mimeType, collaborationDocumentNavigationEvent.mimeType) &&
				Objects.equals(this.links, collaborationDocumentNavigationEvent.links);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, layerId, conversationId, eventTimestamp, layerOwnerPersonId, layerOwnerPersonPresenceId, triggeringPersonId, triggeringPersonPresenceId, fileId, documentActionType, fileName, fileSize, mimeType, links);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CollaborationDocumentNavigationEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    layerId: ").append(toIndentedString(layerId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
		sb.append("    layerOwnerPersonId: ").append(toIndentedString(layerOwnerPersonId)).append("\n");
		sb.append("    layerOwnerPersonPresenceId: ").append(toIndentedString(layerOwnerPersonPresenceId)).append("\n");
		sb.append("    triggeringPersonId: ").append(toIndentedString(triggeringPersonId)).append("\n");
		sb.append("    triggeringPersonPresenceId: ").append(toIndentedString(triggeringPersonPresenceId)).append("\n");
		sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
		sb.append("    documentActionType: ").append(toIndentedString(documentActionType)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
		sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
		sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
