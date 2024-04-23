package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ExternalMessengerCreateConversationCreateResponse.class, name = "CREATE"),
	@JsonSubTypes.Type(value = ExternalMessengerCreateConversationErrorResponse.class, name = "ERROR"),
	@JsonSubTypes.Type(value = ExternalMessengerCreateConversationUseExistingResponse.class, name = "USE_EXISTING"),
})
public interface ExternalMessengerCreateConversationResponse {
	void setType(EExternalMessengerConversationCreationResponseType type);

	EExternalMessengerConversationCreationResponseType getType();

	ExternalMessengerCreateConversationResponse type(EExternalMessengerConversationCreationResponseType type);

}
