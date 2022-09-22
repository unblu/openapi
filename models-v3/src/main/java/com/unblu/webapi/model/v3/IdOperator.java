package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsIdOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InIdOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = IsNotNullIdOperator.class, name = "IS_NOT_NULL"),
	@JsonSubTypes.Type(value = IsNullIdOperator.class, name = "IS_NULL"),
	@JsonSubTypes.Type(value = NotEqualsIdOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInIdOperator.class, name = "NOT_IN"),
	@JsonSubTypes.Type(value = StartsWithIdOperator.class, name = "STARTS_WITH"),
})
public interface IdOperator {
	void setType(EIdOperatorType type);

	EIdOperatorType getType();

	IdOperator type(EIdOperatorType type);

}
