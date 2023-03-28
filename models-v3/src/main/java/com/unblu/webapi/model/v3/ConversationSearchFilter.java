package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AssigneePersonIdConversationSearchFilter.class, name = "ASSIGNEE_PERSON_ID"),
	@JsonSubTypes.Type(value = AwaitedPersonTypeConversationSearchFilter.class, name = "AWAITED_PERSON_TYPE"),
	@JsonSubTypes.Type(value = AwaitedPersonTypeChangeTimestampConversationSearchFilter.class, name = "AWAITED_PERSON_TYPE_CHANGE_TIMESTAMP"),
	@JsonSubTypes.Type(value = ContextPersonIdConversationSearchFilter.class, name = "CONTEXT_PERSON_ID"),
	@JsonSubTypes.Type(value = ConversationTemplateIdConversationSearchFilter.class, name = "CONVERSATION_TEMPLATE_ID"),
	@JsonSubTypes.Type(value = CreationTimestampConversationSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = EndReasonConversationSearchFilter.class, name = "END_REASON"),
	@JsonSubTypes.Type(value = EndTimestampConversationSearchFilter.class, name = "END_TIMESTAMP"),
	@JsonSubTypes.Type(value = ExternalMessengerChannelIdConversationSearchFilter.class, name = "EXTERNAL_MESSENGER_CHANNEL_ID"),
	@JsonSubTypes.Type(value = InitialEngagementTypeConversationSearchFilter.class, name = "INITIAL_ENGAGEMENT_TYPE"),
	@JsonSubTypes.Type(value = ParticipantPersonIdConversationSearchFilter.class, name = "PARTICIPANT_PERSON_ID"),
	@JsonSubTypes.Type(value = RecipientIdConversationSearchFilter.class, name = "RECIPIENT_ID"),
	@JsonSubTypes.Type(value = RecipientTypeConversationSearchFilter.class, name = "RECIPIENT_TYPE"),
	@JsonSubTypes.Type(value = ScheduledTimestampConversationSearchFilter.class, name = "SCHEDULED_TIMESTAMP"),
	@JsonSubTypes.Type(value = SourceIdConversationSearchFilter.class, name = "SOURCE_ID"),
	@JsonSubTypes.Type(value = StateConversationSearchFilter.class, name = "STATE"),
	@JsonSubTypes.Type(value = TokboxSessionIdConversationSearchFilter.class, name = "TOKBOX_SESSION_ID"),
	@JsonSubTypes.Type(value = TopicConversationSearchFilter.class, name = "TOPIC"),
})
public interface ConversationSearchFilter {
	void setField(EConversationSearchFilterField field);

	EConversationSearchFilterField getField();

	ConversationSearchFilter field(EConversationSearchFilterField field);

}
