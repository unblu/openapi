package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsPersonTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InPersonTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsPersonTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInPersonTypeOperator.class, name = "NOT_IN"),
})
public interface PersonTypeOperator {
	void setType(EPersonTypeOperatorType type);

	EPersonTypeOperatorType getType();

	PersonTypeOperator type(EPersonTypeOperatorType type);

}
