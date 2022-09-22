package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsTimestampOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = GreaterThanTimestampOperator.class, name = "GREATER_THAN"),
	@JsonSubTypes.Type(value = InTimestampOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = InRangeTimestampOperator.class, name = "IN_RANGE"),
	@JsonSubTypes.Type(value = IsNotNullTimestampOperator.class, name = "IS_NOT_NULL"),
	@JsonSubTypes.Type(value = IsNullTimestampOperator.class, name = "IS_NULL"),
	@JsonSubTypes.Type(value = LowerThanTimestampOperator.class, name = "LOWER_THAN"),
	@JsonSubTypes.Type(value = NotEqualsTimestampOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInTimestampOperator.class, name = "NOT_IN"),
	@JsonSubTypes.Type(value = NotInRangeTimestampOperator.class, name = "NOT_IN_RANGE"),
})
public interface TimestampOperator {
	void setType(ETimestampOperatorType type);

	ETimestampOperatorType getType();

	TimestampOperator type(ETimestampOperatorType type);

}
