package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ConversationIdCollaborationLayerEventSearchFilter.class, name = "CONVERSATION_ID"),
	@JsonSubTypes.Type(value = EventSourceTypeCollaborationLayerEventSearchFilter.class, name = "EVENT_SOURCE_TYPE"),
	@JsonSubTypes.Type(value = EventTimestampCollaborationLayerEventSearchFilter.class, name = "EVENT_TIMESTAMP"),
	@JsonSubTypes.Type(value = TriggeringPersonIdCollaborationLayerEventSearchFilter.class, name = "TRIGGERING_PERSON_ID"),
})
public interface CollaborationLayerEventSearchFilter {
	void setField(ECollaborationLayerEventSearchFilterField field);

	ECollaborationLayerEventSearchFilterField getField();

	CollaborationLayerEventSearchFilter field(ECollaborationLayerEventSearchFilterField field);

}
