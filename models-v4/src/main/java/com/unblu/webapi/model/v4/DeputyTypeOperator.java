package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsDeputyTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InDeputyTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsDeputyTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInDeputyTypeOperator.class, name = "NOT_IN"),
})
public interface DeputyTypeOperator {
	void setType(EDeputyTypeOperatorType type);

	EDeputyTypeOperatorType getType();

	DeputyTypeOperator type(EDeputyTypeOperatorType type);

}
