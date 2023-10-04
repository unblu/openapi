package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EmptyChatSuggestionResponse.class, name = "EMPTY"),
	@JsonSubTypes.Type(value = TextChatSuggestionResponse.class, name = "TEXT"),
})
public interface ChatSuggestionResponse {
	void setType(EChatSuggestionResponseType type);

	EChatSuggestionResponseType getType();

	ChatSuggestionResponse type(EChatSuggestionResponseType type);

}
