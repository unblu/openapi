package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsDeputyDelegationEscalationLevelOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InDeputyDelegationEscalationLevelOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsDeputyDelegationEscalationLevelOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInDeputyDelegationEscalationLevelOperator.class, name = "NOT_IN"),
})
public interface DeputyDelegationEscalationLevelOperator {
	void setType(EDeputyDelegationEscalationLevelOperatorType type);

	EDeputyDelegationEscalationLevelOperatorType getType();

	DeputyDelegationEscalationLevelOperator type(EDeputyDelegationEscalationLevelOperatorType type);

}
