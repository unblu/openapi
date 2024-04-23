package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsConversationVisibilityOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = NotEqualsConversationVisibilityOperator.class, name = "NOT_EQUALS"),
})
public interface ConversationVisibilityOperator {
	void setType(EConversationVisibilityOperatorType type);

	EConversationVisibilityOperatorType getType();

	ConversationVisibilityOperator type(EConversationVisibilityOperatorType type);

	void setValue(EConversationVisibility value);

	EConversationVisibility getValue();

	ConversationVisibilityOperator value(EConversationVisibility value);

}
