package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsExternalMessengerChannelTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InExternalMessengerChannelTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsExternalMessengerChannelTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInExternalMessengerChannelTypeOperator.class, name = "NOT_IN"),
})
public interface ExternalMessengerChannelTypeOperator {
	void setType(EExternalMessengerChannelTypeOperatorType type);

	EExternalMessengerChannelTypeOperatorType getType();

	ExternalMessengerChannelTypeOperator type(EExternalMessengerChannelTypeOperatorType type);

}
