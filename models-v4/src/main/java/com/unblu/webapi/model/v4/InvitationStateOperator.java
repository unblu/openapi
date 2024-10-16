package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsInvitationStateOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = NotEqualsInvitationStateOperator.class, name = "NOT_EQUALS"),
})
public interface InvitationStateOperator {
	void setType(EInvitationStateOperatorType type);

	EInvitationStateOperatorType getType();

	InvitationStateOperator type(EInvitationStateOperatorType type);

	void setValue(EInvitationState value);

	EInvitationState getValue();

	InvitationStateOperator value(EInvitationState value);

}
