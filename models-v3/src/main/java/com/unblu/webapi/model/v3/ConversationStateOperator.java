package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsConversationStateOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InConversationStateOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsConversationStateOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInConversationStateOperator.class, name = "NOT_IN"),
})
public interface ConversationStateOperator {
	void setType(EConversationStateOperatorType type);

	EConversationStateOperatorType getType();

	ConversationStateOperator type(EConversationStateOperatorType type);

}
