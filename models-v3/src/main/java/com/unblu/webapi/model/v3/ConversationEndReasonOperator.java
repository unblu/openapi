package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsConversationEndReasonOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InConversationEndReasonOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsConversationEndReasonOperator.class, name = "NOT_EQUALS"),
})
public interface ConversationEndReasonOperator {
	void setType(EConversationEndReasonOperatorType type);

	EConversationEndReasonOperatorType getType();

	ConversationEndReasonOperator type(EConversationEndReasonOperatorType type);

}
