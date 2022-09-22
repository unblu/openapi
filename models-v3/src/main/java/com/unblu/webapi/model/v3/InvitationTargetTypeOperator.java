package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsInvitationTargetTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InInvitationTargetTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsInvitationTargetTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInInvitationTargetTypeOperator.class, name = "NOT_IN"),
})
public interface InvitationTargetTypeOperator {
	void setType(EInvitationTargetTypeOperatorType type);

	EInvitationTargetTypeOperatorType getType();

	InvitationTargetTypeOperator type(EInvitationTargetTypeOperatorType type);

}
