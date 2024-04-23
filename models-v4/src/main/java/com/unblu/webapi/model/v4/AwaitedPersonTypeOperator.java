package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsAwaitedPersonTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InAwaitedPersonTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsAwaitedPersonTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInAwaitedPersonTypeOperator.class, name = "NOT_IN"),
})
public interface AwaitedPersonTypeOperator {
	void setType(EAwaitedPersonTypeOperatorType type);

	EAwaitedPersonTypeOperatorType getType();

	AwaitedPersonTypeOperator type(EAwaitedPersonTypeOperatorType type);

}
