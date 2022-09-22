package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsInitialEngagementTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InInitialEngagementTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsInitialEngagementTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInInitialEngagementTypeOperator.class, name = "NOT_IN"),
})
public interface InitialEngagementTypeOperator {
	void setType(EInitialEngagementTypeOperatorType type);

	EInitialEngagementTypeOperatorType getType();

	InitialEngagementTypeOperator type(EInitialEngagementTypeOperatorType type);

}
