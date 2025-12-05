
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
 * An event triggered every time a new URL is accessed in the universal co-browsing collaboration layer
 */
@ApiModel(description = "An event triggered every time a new URL is accessed in the universal co-browsing collaboration layer")

@JsonPropertyOrder({
	UniversalCobrowsingCollaborationLayerEventData.JSON_PROPERTY_$_TYPE,
	UniversalCobrowsingCollaborationLayerEventData.JSON_PROPERTY_LAYER_ID,
	UniversalCobrowsingCollaborationLayerEventData.JSON_PROPERTY_LAYER_OWNER_PERSON_ID,
	UniversalCobrowsingCollaborationLayerEventData.JSON_PROPERTY_LAYER_OWNER_PERSON_PRESENCE_ID,
	UniversalCobrowsingCollaborationLayerEventData.JSON_PROPERTY_TRIGGERING_PERSON_ID,
	UniversalCobrowsingCollaborationLayerEventData.JSON_PROPERTY_TRIGGERING_PERSON_PRESENCE_ID,
	UniversalCobrowsingCollaborationLayerEventData.JSON_PROPERTY_CONVERSATION_ID,
	UniversalCobrowsingCollaborationLayerEventData.JSON_PROPERTY_EVENT_TIMESTAMP,
	UniversalCobrowsingCollaborationLayerEventData.JSON_PROPERTY_LAYER_SOURCE_TYPE,
	UniversalCobrowsingCollaborationLayerEventData.JSON_PROPERTY_URL,
	UniversalCobrowsingCollaborationLayerEventData.JSON_PROPERTY_PAGE_TITLE,
	UniversalCobrowsingCollaborationLayerEventData.JSON_PROPERTY_NAVIGATION_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class UniversalCobrowsingCollaborationLayerEventData implements CollaborationLayerEventData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		UNIVERSALCOBROWSINGCOLLABORATIONLAYEREVENTDATA("UniversalCobrowsingCollaborationLayerEventData");

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
			return TypeEnum.UNIVERSALCOBROWSINGCOLLABORATIONLAYEREVENTDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.UNIVERSALCOBROWSINGCOLLABORATIONLAYEREVENTDATA;

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
	private ECollaborationLayerEventSourceType layerSourceType = ECollaborationLayerEventSourceType.UNIVERSAL_COBROWSING;

	public static final String JSON_PROPERTY_URL = "url";
	@JsonProperty(JSON_PROPERTY_URL)
	private String url;

	public static final String JSON_PROPERTY_PAGE_TITLE = "pageTitle";
	@JsonProperty(JSON_PROPERTY_PAGE_TITLE)
	private String pageTitle;

	public static final String JSON_PROPERTY_NAVIGATION_TYPE = "navigationType";
	@JsonProperty(JSON_PROPERTY_NAVIGATION_TYPE)
	private ENavigationType navigationType;

	public UniversalCobrowsingCollaborationLayerEventData $type(TypeEnum $type) {
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

	public UniversalCobrowsingCollaborationLayerEventData layerId(String layerId) {
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

	public UniversalCobrowsingCollaborationLayerEventData layerOwnerPersonId(String layerOwnerPersonId) {
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

	public UniversalCobrowsingCollaborationLayerEventData layerOwnerPersonPresenceId(String layerOwnerPersonPresenceId) {
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

	public UniversalCobrowsingCollaborationLayerEventData triggeringPersonId(String triggeringPersonId) {
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

	public UniversalCobrowsingCollaborationLayerEventData triggeringPersonPresenceId(String triggeringPersonPresenceId) {
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

	public UniversalCobrowsingCollaborationLayerEventData conversationId(String conversationId) {
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

	public UniversalCobrowsingCollaborationLayerEventData eventTimestamp(Long eventTimestamp) {
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

	public UniversalCobrowsingCollaborationLayerEventData layerSourceType(ECollaborationLayerEventSourceType layerSourceType) {
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

	public UniversalCobrowsingCollaborationLayerEventData url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * The URL of the visited web site
	 * 
	 * @return url
	 **/
	@ApiModelProperty(value = "The URL of the visited web site")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public UniversalCobrowsingCollaborationLayerEventData pageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
		return this;
	}

	/**
	 * The page title of the visited web site
	 * 
	 * @return pageTitle
	 **/
	@ApiModelProperty(value = "The page title of the visited web site")
	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public UniversalCobrowsingCollaborationLayerEventData navigationType(ENavigationType navigationType) {
		this.navigationType = navigationType;
		return this;
	}

	/**
	 * Get navigationType
	 * 
	 * @return navigationType
	 **/
	@ApiModelProperty(value = "")
	public ENavigationType getNavigationType() {
		return navigationType;
	}

	public void setNavigationType(ENavigationType navigationType) {
		this.navigationType = navigationType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UniversalCobrowsingCollaborationLayerEventData universalCobrowsingCollaborationLayerEventData = (UniversalCobrowsingCollaborationLayerEventData) o;
		return Objects.equals(this.$type, universalCobrowsingCollaborationLayerEventData.$type) &&
				Objects.equals(this.layerId, universalCobrowsingCollaborationLayerEventData.layerId) &&
				Objects.equals(this.layerOwnerPersonId, universalCobrowsingCollaborationLayerEventData.layerOwnerPersonId) &&
				Objects.equals(this.layerOwnerPersonPresenceId, universalCobrowsingCollaborationLayerEventData.layerOwnerPersonPresenceId) &&
				Objects.equals(this.triggeringPersonId, universalCobrowsingCollaborationLayerEventData.triggeringPersonId) &&
				Objects.equals(this.triggeringPersonPresenceId, universalCobrowsingCollaborationLayerEventData.triggeringPersonPresenceId) &&
				Objects.equals(this.conversationId, universalCobrowsingCollaborationLayerEventData.conversationId) &&
				Objects.equals(this.eventTimestamp, universalCobrowsingCollaborationLayerEventData.eventTimestamp) &&
				Objects.equals(this.layerSourceType, universalCobrowsingCollaborationLayerEventData.layerSourceType) &&
				Objects.equals(this.url, universalCobrowsingCollaborationLayerEventData.url) &&
				Objects.equals(this.pageTitle, universalCobrowsingCollaborationLayerEventData.pageTitle) &&
				Objects.equals(this.navigationType, universalCobrowsingCollaborationLayerEventData.navigationType);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, layerId, layerOwnerPersonId, layerOwnerPersonPresenceId, triggeringPersonId, triggeringPersonPresenceId, conversationId, eventTimestamp, layerSourceType, url, pageTitle, navigationType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UniversalCobrowsingCollaborationLayerEventData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    layerId: ").append(toIndentedString(layerId)).append("\n");
		sb.append("    layerOwnerPersonId: ").append(toIndentedString(layerOwnerPersonId)).append("\n");
		sb.append("    layerOwnerPersonPresenceId: ").append(toIndentedString(layerOwnerPersonPresenceId)).append("\n");
		sb.append("    triggeringPersonId: ").append(toIndentedString(triggeringPersonId)).append("\n");
		sb.append("    triggeringPersonPresenceId: ").append(toIndentedString(triggeringPersonPresenceId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
		sb.append("    layerSourceType: ").append(toIndentedString(layerSourceType)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
		sb.append("    navigationType: ").append(toIndentedString(navigationType)).append("\n");
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
