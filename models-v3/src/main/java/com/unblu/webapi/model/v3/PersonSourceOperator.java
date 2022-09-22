package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsPersonSourceOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InPersonSourceOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsPersonSourceOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInPersonSourceOperator.class, name = "NOT_IN"),
})
public interface PersonSourceOperator {
	void setType(EPersonSourceOperatorType type);

	EPersonSourceOperatorType getType();

	PersonSourceOperator type(EPersonSourceOperatorType type);

}
