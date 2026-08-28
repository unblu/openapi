package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ConversationIdConversationPresenceSearchFilter.class, name = "CONVERSATION_ID"),
	@JsonSubTypes.Type(value = JoinedTimestampConversationPresenceSearchFilter.class, name = "JOINED_TIMESTAMP"),
	@JsonSubTypes.Type(value = LeftTimestampConversationPresenceSearchFilter.class, name = "LEFT_TIMESTAMP"),
	@JsonSubTypes.Type(value = PersonIdConversationPresenceSearchFilter.class, name = "PERSON_ID"),
})
public interface ConversationPresenceSearchFilter {
	void setField(EConversationPresenceSearchFilterField field);

	EConversationPresenceSearchFilterField getField();

	ConversationPresenceSearchFilter field(EConversationPresenceSearchFilterField field);

}
