package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CannedResponseIdCannedResponseUsageSearchFilter.class, name = "CANNED_RESPONSE_ID"),
	@JsonSubTypes.Type(value = ConversationIdCannedResponseUsageSearchFilter.class, name = "CONVERSATION_ID"),
	@JsonSubTypes.Type(value = CreationTimestampCannedResponseUsageSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = MessageIdCannedResponseUsageSearchFilter.class, name = "MESSAGE_ID"),
	@JsonSubTypes.Type(value = PersonIdCannedResponseUsageSearchFilter.class, name = "PERSON_ID"),
})
public interface CannedResponseUsageSearchFilter {
	void setField(ECannedResponseUsageSearchFilterField field);

	ECannedResponseUsageSearchFilterField getField();

	CannedResponseUsageSearchFilter field(ECannedResponseUsageSearchFilterField field);

}
