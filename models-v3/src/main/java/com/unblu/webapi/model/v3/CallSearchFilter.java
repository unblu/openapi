package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AcceptTimestampCallSearchFilter.class, name = "ACCEPT_TIMESTAMP"),
	@JsonSubTypes.Type(value = ConversationIdCallSearchFilter.class, name = "CONVERSATION_ID"),
	@JsonSubTypes.Type(value = EndTimestampCallSearchFilter.class, name = "END_TIMESTAMP"),
	@JsonSubTypes.Type(value = EstablishedTimestampCallSearchFilter.class, name = "ESTABLISHED_TIMESTAMP"),
	@JsonSubTypes.Type(value = InitiationTimestampCallSearchFilter.class, name = "INITIATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = InitiatorPersonIdCallSearchFilter.class, name = "INITIATOR_PERSON_ID"),
	@JsonSubTypes.Type(value = ServiceProviderCallIdCallSearchFilter.class, name = "SERVICE_PROVIDER_CALL_ID"),
	@JsonSubTypes.Type(value = ServiceProviderTypeCallSearchFilter.class, name = "SERVICE_PROVIDER_TYPE"),
})
public interface CallSearchFilter {
	void setField(ECallSearchFilterField field);

	ECallSearchFilterField getField();

	CallSearchFilter field(ECallSearchFilterField field);

}
