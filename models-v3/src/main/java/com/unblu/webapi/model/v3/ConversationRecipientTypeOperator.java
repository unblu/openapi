package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsConversationRecipientTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InConversationRecipientTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsConversationRecipientTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInConversationRecipientTypeOperator.class, name = "NOT_IN"),
})
public interface ConversationRecipientTypeOperator {
	void setType(EConversationRecipientTypeOperatorType type);

	EConversationRecipientTypeOperatorType getType();

	ConversationRecipientTypeOperator type(EConversationRecipientTypeOperatorType type);

}
