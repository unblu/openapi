package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "layerSourceType", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = DocumentCobrowsingCollaborationLayerEventData.class, name = "DOCUMENT_COBROWSING"),
	@JsonSubTypes.Type(value = EmbeddedCobrowsingCollaborationLayerEventData.class, name = "EMBEDDED_COBROWSING"),
	@JsonSubTypes.Type(value = UniversalCobrowsingCollaborationLayerEventData.class, name = "UNIVERSAL_COBROWSING"),
})
public interface CollaborationLayerEventData {
	void setLayerId(String layerId);

	String getLayerId();

	CollaborationLayerEventData layerId(String layerId);

	void setLayerOwnerPersonId(String layerOwnerPersonId);

	String getLayerOwnerPersonId();

	CollaborationLayerEventData layerOwnerPersonId(String layerOwnerPersonId);

	void setLayerOwnerPersonPresenceId(String layerOwnerPersonPresenceId);

	String getLayerOwnerPersonPresenceId();

	CollaborationLayerEventData layerOwnerPersonPresenceId(String layerOwnerPersonPresenceId);

	void setTriggeringPersonId(String triggeringPersonId);

	String getTriggeringPersonId();

	CollaborationLayerEventData triggeringPersonId(String triggeringPersonId);

	void setTriggeringPersonPresenceId(String triggeringPersonPresenceId);

	String getTriggeringPersonPresenceId();

	CollaborationLayerEventData triggeringPersonPresenceId(String triggeringPersonPresenceId);

	void setConversationId(String conversationId);

	String getConversationId();

	CollaborationLayerEventData conversationId(String conversationId);

	void setEventTimestamp(Long eventTimestamp);

	Long getEventTimestamp();

	CollaborationLayerEventData eventTimestamp(Long eventTimestamp);

	void setLayerSourceType(ECollaborationLayerEventSourceType layerSourceType);

	ECollaborationLayerEventSourceType getLayerSourceType();

	CollaborationLayerEventData layerSourceType(ECollaborationLayerEventSourceType layerSourceType);

}
