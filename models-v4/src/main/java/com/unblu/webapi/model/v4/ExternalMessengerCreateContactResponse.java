package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ExternalMessengerCreateContactContactToPersonMismatchResponse.class, name = "CONTACT_TO_PERSON_MISMATCH"),
	@JsonSubTypes.Type(value = ExternalMessengerCreateContactCreateResponse.class, name = "CREATE"),
	@JsonSubTypes.Type(value = ExternalMessengerCreateContactErrorResponse.class, name = "ERROR"),
	@JsonSubTypes.Type(value = ExternalMessengerCreateContactInvalidContactIdentifierResponse.class, name = "INVALID_CONTACT_IDENTIFIER"),
	@JsonSubTypes.Type(value = ExternalMessengerCreateContactUseExistingResponse.class, name = "USE_EXISTING"),
})
public interface ExternalMessengerCreateContactResponse {
	void setType(EExternalMessengerContactCreationResponseType type);

	EExternalMessengerContactCreationResponseType getType();

	ExternalMessengerCreateContactResponse type(EExternalMessengerContactCreationResponseType type);

}
