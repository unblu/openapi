package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsLongOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = GreaterThanLongOperator.class, name = "GREATER_THAN"),
	@JsonSubTypes.Type(value = InRangeLongOperator.class, name = "IN_RANGE"),
	@JsonSubTypes.Type(value = LowerThanLongOperator.class, name = "LOWER_THAN"),
	@JsonSubTypes.Type(value = NotEqualsLongOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInRangeLongOperator.class, name = "NOT_IN_RANGE"),
})
public interface LongOperator {
	void setType(ELongOperatorType type);

	ELongOperatorType getType();

	LongOperator type(ELongOperatorType type);

}
