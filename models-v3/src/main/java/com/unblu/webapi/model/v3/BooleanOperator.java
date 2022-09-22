package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsBooleanOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = IsNotNullBooleanOperator.class, name = "IS_NOT_NULL"),
	@JsonSubTypes.Type(value = IsNullBooleanOperator.class, name = "IS_NULL"),
	@JsonSubTypes.Type(value = NotEqualsBooleanOperator.class, name = "NOT_EQUALS"),
})
public interface BooleanOperator {
	void setType(EBooleanOperatorType type);

	EBooleanOperatorType getType();

	BooleanOperator type(EBooleanOperatorType type);

}
