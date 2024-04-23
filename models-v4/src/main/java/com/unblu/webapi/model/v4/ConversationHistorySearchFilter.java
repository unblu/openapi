package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AssigneePersonIdConversationHistorySearchFilter.class, name = "ASSIGNEE_PERSON_ID"),
	@JsonSubTypes.Type(value = AwaitedPersonTypeConversationHistorySearchFilter.class, name = "AWAITED_PERSON_TYPE"),
	@JsonSubTypes.Type(value = AwaitedPersonTypeChangeTimestampConversationHistorySearchFilter.class, name = "AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP"),
	@JsonSubTypes.Type(value = ContextPersonIdConversationHistorySearchFilter.class, name = "CONTEXT_PERSON_ID"),
	@JsonSubTypes.Type(value = ConversationTemplateIdConversationHistorySearchFilter.class, name = "CONVERSATION_TEMPLATE_ID"),
	@JsonSubTypes.Type(value = CreationTimestampConversationHistorySearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = EndReasonConversationHistorySearchFilter.class, name = "END_REASON"),
	@JsonSubTypes.Type(value = EndTimestampConversationHistorySearchFilter.class, name = "END_TIMESTAMP"),
	@JsonSubTypes.Type(value = InitialEngagementTypeConversationHistorySearchFilter.class, name = "INITIAL_ENGAGEMENT_TYPE"),
	@JsonSubTypes.Type(value = LastCompletedRecordingTimestampConversationHistorySearchFilter.class, name = "LAST_COMPLETED_RECORDING_TIMESTAMP"),
	@JsonSubTypes.Type(value = LastMessageTimestampConversationHistorySearchFilter.class, name = "LAST_MESSAGE_TIMESTAMP"),
	@JsonSubTypes.Type(value = ParticipantExternalMessengerContactIdConversationHistorySearchFilter.class, name = "PARTICIPANT_EXTERNAL_MESSENGER_CONTACT_ID"),
	@JsonSubTypes.Type(value = ParticipantPersonIdConversationHistorySearchFilter.class, name = "PARTICIPANT_PERSON_ID"),
	@JsonSubTypes.Type(value = RecipientIdConversationHistorySearchFilter.class, name = "RECIPIENT_ID"),
	@JsonSubTypes.Type(value = RecipientTypeConversationHistorySearchFilter.class, name = "RECIPIENT_TYPE"),
	@JsonSubTypes.Type(value = ScheduledTimestampConversationHistorySearchFilter.class, name = "SCHEDULED_TIMESTAMP"),
	@JsonSubTypes.Type(value = StateConversationHistorySearchFilter.class, name = "STATE"),
	@JsonSubTypes.Type(value = TokboxSessionIdConversationHistorySearchFilter.class, name = "TOKBOX_SESSION_ID"),
	@JsonSubTypes.Type(value = TopicConversationHistorySearchFilter.class, name = "TOPIC"),
	@JsonSubTypes.Type(value = VisibilityConversationHistorySearchFilter.class, name = "VISIBILITY"),
})
public interface ConversationHistorySearchFilter {
	void setField(EConversationHistorySearchFilterField field);

	EConversationHistorySearchFilterField getField();

	ConversationHistorySearchFilter field(EConversationHistorySearchFilterField field);

}
