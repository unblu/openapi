package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ContainsStringOperator.class, name = "CONTAINS"),
	@JsonSubTypes.Type(value = EqualsStringOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InStringOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = IsNotNullStringOperator.class, name = "IS_NOT_NULL"),
	@JsonSubTypes.Type(value = IsNullStringOperator.class, name = "IS_NULL"),
	@JsonSubTypes.Type(value = NotEqualsStringOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInStringOperator.class, name = "NOT_IN"),
})
public interface StringOperator {
	void setType(EStringOperatorType type);

	EStringOperatorType getType();

	StringOperator type(EStringOperatorType type);

}
