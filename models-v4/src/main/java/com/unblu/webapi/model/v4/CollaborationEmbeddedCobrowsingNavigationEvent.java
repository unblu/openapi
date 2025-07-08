
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
 * An event triggered every time a new URL is accessed in an embedded co-browsing collaboration layer
 */
@ApiModel(description = "An event triggered every time a new URL is accessed in an embedded co-browsing collaboration layer")

@JsonPropertyOrder({
	CollaborationEmbeddedCobrowsingNavigationEvent.JSON_PROPERTY_$_TYPE,
	CollaborationEmbeddedCobrowsingNavigationEvent.JSON_PROPERTY_TIMESTAMP,
	CollaborationEmbeddedCobrowsingNavigationEvent.JSON_PROPERTY_EVENT_TYPE,
	CollaborationEmbeddedCobrowsingNavigationEvent.JSON_PROPERTY_ACCOUNT_ID,
	CollaborationEmbeddedCobrowsingNavigationEvent.JSON_PROPERTY_LAYER_ID,
	CollaborationEmbeddedCobrowsingNavigationEvent.JSON_PROPERTY_CONVERSATION_ID,
	CollaborationEmbeddedCobrowsingNavigationEvent.JSON_PROPERTY_EVENT_TIMESTAMP,
	CollaborationEmbeddedCobrowsingNavigationEvent.JSON_PROPERTY_LAYER_OWNER_PERSON_ID,
	CollaborationEmbeddedCobrowsingNavigationEvent.JSON_PROPERTY_LAYER_OWNER_PERSON_PRESENCE_ID,
	CollaborationEmbeddedCobrowsingNavigationEvent.JSON_PROPERTY_TRIGGERING_PERSON_ID,
	CollaborationEmbeddedCobrowsingNavigationEvent.JSON_PROPERTY_TRIGGERING_PERSON_PRESENCE_ID,
	CollaborationEmbeddedCobrowsingNavigationEvent.JSON_PROPERTY_URL,
	CollaborationEmbeddedCobrowsingNavigationEvent.JSON_PROPERTY_PAGE_TITLE,
	CollaborationEmbeddedCobrowsingNavigationEvent.JSON_PROPERTY_NAVIGATION_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CollaborationEmbeddedCobrowsingNavigationEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		COLLABORATIONEMBEDDEDCOBROWSINGNAVIGATIONEVENT("CollaborationEmbeddedCobrowsingNavigationEvent");

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
			return TypeEnum.COLLABORATIONEMBEDDEDCOBROWSINGNAVIGATIONEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.COLLABORATIONEMBEDDEDCOBROWSINGNAVIGATIONEVENT;

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

	public static final String JSON_PROPERTY_URL = "url";
	@JsonProperty(JSON_PROPERTY_URL)
	private String url;

	public static final String JSON_PROPERTY_PAGE_TITLE = "pageTitle";
	@JsonProperty(JSON_PROPERTY_PAGE_TITLE)
	private String pageTitle;

	public static final String JSON_PROPERTY_NAVIGATION_TYPE = "navigationType";
	@JsonProperty(JSON_PROPERTY_NAVIGATION_TYPE)
	private ENavigationType navigationType;

	public CollaborationEmbeddedCobrowsingNavigationEvent $type(TypeEnum $type) {
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

	public CollaborationEmbeddedCobrowsingNavigationEvent timestamp(Long timestamp) {
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

	public CollaborationEmbeddedCobrowsingNavigationEvent eventType(String eventType) {
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

	public CollaborationEmbeddedCobrowsingNavigationEvent accountId(String accountId) {
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

	public CollaborationEmbeddedCobrowsingNavigationEvent layerId(String layerId) {
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

	public CollaborationEmbeddedCobrowsingNavigationEvent conversationId(String conversationId) {
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

	public CollaborationEmbeddedCobrowsingNavigationEvent eventTimestamp(Long eventTimestamp) {
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

	public CollaborationEmbeddedCobrowsingNavigationEvent layerOwnerPersonId(String layerOwnerPersonId) {
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

	public CollaborationEmbeddedCobrowsingNavigationEvent layerOwnerPersonPresenceId(String layerOwnerPersonPresenceId) {
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

	public CollaborationEmbeddedCobrowsingNavigationEvent triggeringPersonId(String triggeringPersonId) {
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

	public CollaborationEmbeddedCobrowsingNavigationEvent triggeringPersonPresenceId(String triggeringPersonPresenceId) {
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

	public CollaborationEmbeddedCobrowsingNavigationEvent url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * The URL of the web page visited
	 * 
	 * @return url
	 **/
	@ApiModelProperty(value = "The URL of the web page visited")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public CollaborationEmbeddedCobrowsingNavigationEvent pageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
		return this;
	}

	/**
	 * The page title of the web page visited
	 * 
	 * @return pageTitle
	 **/
	@ApiModelProperty(value = "The page title of the web page visited")
	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public CollaborationEmbeddedCobrowsingNavigationEvent navigationType(ENavigationType navigationType) {
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
		CollaborationEmbeddedCobrowsingNavigationEvent collaborationEmbeddedCobrowsingNavigationEvent = (CollaborationEmbeddedCobrowsingNavigationEvent) o;
		return Objects.equals(this.$type, collaborationEmbeddedCobrowsingNavigationEvent.$type) &&
				Objects.equals(this.timestamp, collaborationEmbeddedCobrowsingNavigationEvent.timestamp) &&
				Objects.equals(this.eventType, collaborationEmbeddedCobrowsingNavigationEvent.eventType) &&
				Objects.equals(this.accountId, collaborationEmbeddedCobrowsingNavigationEvent.accountId) &&
				Objects.equals(this.layerId, collaborationEmbeddedCobrowsingNavigationEvent.layerId) &&
				Objects.equals(this.conversationId, collaborationEmbeddedCobrowsingNavigationEvent.conversationId) &&
				Objects.equals(this.eventTimestamp, collaborationEmbeddedCobrowsingNavigationEvent.eventTimestamp) &&
				Objects.equals(this.layerOwnerPersonId, collaborationEmbeddedCobrowsingNavigationEvent.layerOwnerPersonId) &&
				Objects.equals(this.layerOwnerPersonPresenceId, collaborationEmbeddedCobrowsingNavigationEvent.layerOwnerPersonPresenceId) &&
				Objects.equals(this.triggeringPersonId, collaborationEmbeddedCobrowsingNavigationEvent.triggeringPersonId) &&
				Objects.equals(this.triggeringPersonPresenceId, collaborationEmbeddedCobrowsingNavigationEvent.triggeringPersonPresenceId) &&
				Objects.equals(this.url, collaborationEmbeddedCobrowsingNavigationEvent.url) &&
				Objects.equals(this.pageTitle, collaborationEmbeddedCobrowsingNavigationEvent.pageTitle) &&
				Objects.equals(this.navigationType, collaborationEmbeddedCobrowsingNavigationEvent.navigationType);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, layerId, conversationId, eventTimestamp, layerOwnerPersonId, layerOwnerPersonPresenceId, triggeringPersonId, triggeringPersonPresenceId, url, pageTitle, navigationType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CollaborationEmbeddedCobrowsingNavigationEvent {\n");
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
