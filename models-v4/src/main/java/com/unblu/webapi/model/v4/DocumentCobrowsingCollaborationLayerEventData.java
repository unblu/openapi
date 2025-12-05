
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
 * An event triggered every time a document action happens in a document co-browsing collaboration layer
 */
@ApiModel(description = "An event triggered every time a document action happens in a document co-browsing collaboration layer")

@JsonPropertyOrder({
	DocumentCobrowsingCollaborationLayerEventData.JSON_PROPERTY_$_TYPE,
	DocumentCobrowsingCollaborationLayerEventData.JSON_PROPERTY_LAYER_ID,
	DocumentCobrowsingCollaborationLayerEventData.JSON_PROPERTY_LAYER_OWNER_PERSON_ID,
	DocumentCobrowsingCollaborationLayerEventData.JSON_PROPERTY_LAYER_OWNER_PERSON_PRESENCE_ID,
	DocumentCobrowsingCollaborationLayerEventData.JSON_PROPERTY_TRIGGERING_PERSON_ID,
	DocumentCobrowsingCollaborationLayerEventData.JSON_PROPERTY_TRIGGERING_PERSON_PRESENCE_ID,
	DocumentCobrowsingCollaborationLayerEventData.JSON_PROPERTY_CONVERSATION_ID,
	DocumentCobrowsingCollaborationLayerEventData.JSON_PROPERTY_EVENT_TIMESTAMP,
	DocumentCobrowsingCollaborationLayerEventData.JSON_PROPERTY_LAYER_SOURCE_TYPE,
	DocumentCobrowsingCollaborationLayerEventData.JSON_PROPERTY_FILE_ID,
	DocumentCobrowsingCollaborationLayerEventData.JSON_PROPERTY_DOCUMENT_ACTION_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DocumentCobrowsingCollaborationLayerEventData implements CollaborationLayerEventData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DOCUMENTCOBROWSINGCOLLABORATIONLAYEREVENTDATA("DocumentCobrowsingCollaborationLayerEventData");

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
			return TypeEnum.DOCUMENTCOBROWSINGCOLLABORATIONLAYEREVENTDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DOCUMENTCOBROWSINGCOLLABORATIONLAYEREVENTDATA;

	public static final String JSON_PROPERTY_LAYER_ID = "layerId";
	@JsonProperty(JSON_PROPERTY_LAYER_ID)
	private String layerId;

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

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_EVENT_TIMESTAMP = "eventTimestamp";
	@JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
	private Long eventTimestamp;

	public static final String JSON_PROPERTY_LAYER_SOURCE_TYPE = "layerSourceType";
	@JsonProperty(JSON_PROPERTY_LAYER_SOURCE_TYPE)
	private ECollaborationLayerEventSourceType layerSourceType = ECollaborationLayerEventSourceType.DOCUMENT_COBROWSING;

	public static final String JSON_PROPERTY_FILE_ID = "fileId";
	@JsonProperty(JSON_PROPERTY_FILE_ID)
	private String fileId;

	public static final String JSON_PROPERTY_DOCUMENT_ACTION_TYPE = "documentActionType";
	@JsonProperty(JSON_PROPERTY_DOCUMENT_ACTION_TYPE)
	private EDocumentActionType documentActionType;

	public DocumentCobrowsingCollaborationLayerEventData $type(TypeEnum $type) {
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

	public DocumentCobrowsingCollaborationLayerEventData layerId(String layerId) {
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

	public DocumentCobrowsingCollaborationLayerEventData layerOwnerPersonId(String layerOwnerPersonId) {
		this.layerOwnerPersonId = layerOwnerPersonId;
		return this;
	}

	/**
	 * The ID of the person who provided the layer. Null if the layer is provided by the system.
	 * 
	 * @return layerOwnerPersonId
	 **/
	@ApiModelProperty(value = "The ID of the person who provided the layer. Null if the layer is provided by the system.")
	public String getLayerOwnerPersonId() {
		return layerOwnerPersonId;
	}

	public void setLayerOwnerPersonId(String layerOwnerPersonId) {
		this.layerOwnerPersonId = layerOwnerPersonId;
	}

	public DocumentCobrowsingCollaborationLayerEventData layerOwnerPersonPresenceId(String layerOwnerPersonPresenceId) {
		this.layerOwnerPersonPresenceId = layerOwnerPersonPresenceId;
		return this;
	}

	/**
	 * he ID of the person presence in the conversation who provided the layer. Null if the layer is provided by the system.
	 * 
	 * @return layerOwnerPersonPresenceId
	 **/
	@ApiModelProperty(value = "he ID of the person presence in the conversation who provided the layer. Null if the layer is provided by the system.")
	public String getLayerOwnerPersonPresenceId() {
		return layerOwnerPersonPresenceId;
	}

	public void setLayerOwnerPersonPresenceId(String layerOwnerPersonPresenceId) {
		this.layerOwnerPersonPresenceId = layerOwnerPersonPresenceId;
	}

	public DocumentCobrowsingCollaborationLayerEventData triggeringPersonId(String triggeringPersonId) {
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

	public DocumentCobrowsingCollaborationLayerEventData triggeringPersonPresenceId(String triggeringPersonPresenceId) {
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

	public DocumentCobrowsingCollaborationLayerEventData conversationId(String conversationId) {
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

	public DocumentCobrowsingCollaborationLayerEventData eventTimestamp(Long eventTimestamp) {
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

	public DocumentCobrowsingCollaborationLayerEventData layerSourceType(ECollaborationLayerEventSourceType layerSourceType) {
		this.layerSourceType = layerSourceType;
		return this;
	}

	/**
	 * Get layerSourceType
	 * 
	 * @return layerSourceType
	 **/
	@ApiModelProperty(required = true, value = "")
	public ECollaborationLayerEventSourceType getLayerSourceType() {
		return layerSourceType;
	}

	public void setLayerSourceType(ECollaborationLayerEventSourceType layerSourceType) {
		this.layerSourceType = layerSourceType;
	}

	public DocumentCobrowsingCollaborationLayerEventData fileId(String fileId) {
		this.fileId = fileId;
		return this;
	}

	/**
	 * The ID of the file in the file store
	 * 
	 * @return fileId
	 **/
	@ApiModelProperty(value = "The ID of the file in the file store")
	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public DocumentCobrowsingCollaborationLayerEventData documentActionType(EDocumentActionType documentActionType) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DocumentCobrowsingCollaborationLayerEventData documentCobrowsingCollaborationLayerEventData = (DocumentCobrowsingCollaborationLayerEventData) o;
		return Objects.equals(this.$type, documentCobrowsingCollaborationLayerEventData.$type) &&
				Objects.equals(this.layerId, documentCobrowsingCollaborationLayerEventData.layerId) &&
				Objects.equals(this.layerOwnerPersonId, documentCobrowsingCollaborationLayerEventData.layerOwnerPersonId) &&
				Objects.equals(this.layerOwnerPersonPresenceId, documentCobrowsingCollaborationLayerEventData.layerOwnerPersonPresenceId) &&
				Objects.equals(this.triggeringPersonId, documentCobrowsingCollaborationLayerEventData.triggeringPersonId) &&
				Objects.equals(this.triggeringPersonPresenceId, documentCobrowsingCollaborationLayerEventData.triggeringPersonPresenceId) &&
				Objects.equals(this.conversationId, documentCobrowsingCollaborationLayerEventData.conversationId) &&
				Objects.equals(this.eventTimestamp, documentCobrowsingCollaborationLayerEventData.eventTimestamp) &&
				Objects.equals(this.layerSourceType, documentCobrowsingCollaborationLayerEventData.layerSourceType) &&
				Objects.equals(this.fileId, documentCobrowsingCollaborationLayerEventData.fileId) &&
				Objects.equals(this.documentActionType, documentCobrowsingCollaborationLayerEventData.documentActionType);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, layerId, layerOwnerPersonId, layerOwnerPersonPresenceId, triggeringPersonId, triggeringPersonPresenceId, conversationId, eventTimestamp, layerSourceType, fileId, documentActionType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DocumentCobrowsingCollaborationLayerEventData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    layerId: ").append(toIndentedString(layerId)).append("\n");
		sb.append("    layerOwnerPersonId: ").append(toIndentedString(layerOwnerPersonId)).append("\n");
		sb.append("    layerOwnerPersonPresenceId: ").append(toIndentedString(layerOwnerPersonPresenceId)).append("\n");
		sb.append("    triggeringPersonId: ").append(toIndentedString(triggeringPersonId)).append("\n");
		sb.append("    triggeringPersonPresenceId: ").append(toIndentedString(triggeringPersonPresenceId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
		sb.append("    layerSourceType: ").append(toIndentedString(layerSourceType)).append("\n");
		sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
		sb.append("    documentActionType: ").append(toIndentedString(documentActionType)).append("\n");
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
