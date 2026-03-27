package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AbortedTimestampCollaborationLayerLogEntrySearchFilter.class, name = "ABORTED_TIMESTAMP"),
	@JsonSubTypes.Type(value = ConversationIdCollaborationLayerLogEntrySearchFilter.class, name = "CONVERSATION_ID"),
	@JsonSubTypes.Type(value = ConversationRecordingIdCollaborationLayerLogEntrySearchFilter.class, name = "CONVERSATION_RECORDING_ID"),
	@JsonSubTypes.Type(value = LayerStopReasonCollaborationLayerLogEntrySearchFilter.class, name = "LAYER_STOP_REASON"),
	@JsonSubTypes.Type(value = LayerTypeCollaborationLayerLogEntrySearchFilter.class, name = "LAYER_TYPE"),
	@JsonSubTypes.Type(value = ParticipantPersonIdCollaborationLayerLogEntrySearchFilter.class, name = "PARTICIPANT_PERSON_ID"),
	@JsonSubTypes.Type(value = StartingPersonIdCollaborationLayerLogEntrySearchFilter.class, name = "STARTING_PERSON_ID"),
	@JsonSubTypes.Type(value = StartingTimestampCollaborationLayerLogEntrySearchFilter.class, name = "STARTING_TIMESTAMP"),
	@JsonSubTypes.Type(value = StoppingPersonIdCollaborationLayerLogEntrySearchFilter.class, name = "STOPPING_PERSON_ID"),
	@JsonSubTypes.Type(value = StopTimestampCollaborationLayerLogEntrySearchFilter.class, name = "STOP_TIMESTAMP"),
})
public interface CollaborationLayerLogEntrySearchFilter {
	void setField(ECollaborationLayerLogEntrySearchFilterField field);

	ECollaborationLayerLogEntrySearchFilterField getField();

	CollaborationLayerLogEntrySearchFilter field(ECollaborationLayerLogEntrySearchFilterField field);

}
