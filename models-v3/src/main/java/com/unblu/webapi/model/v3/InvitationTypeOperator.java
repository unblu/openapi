package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsInvitationTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InInvitationTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsInvitationTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInInvitationTypeOperator.class, name = "NOT_IN"),
})
public interface InvitationTypeOperator {
	void setType(EInvitationTypeOperatorType type);

	EInvitationTypeOperatorType getType();

	InvitationTypeOperator type(EInvitationTypeOperatorType type);

}
