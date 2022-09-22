package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsInvitationCreatorTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InInvitationCreatorTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsInvitationCreatorTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInInvitationCreatorTypeOperator.class, name = "NOT_IN"),
})
public interface InvitationCreatorTypeOperator {
	void setType(EInvitationCreatorTypeOperatorType type);

	EInvitationCreatorTypeOperatorType getType();

	InvitationCreatorTypeOperator type(EInvitationCreatorTypeOperatorType type);

}
