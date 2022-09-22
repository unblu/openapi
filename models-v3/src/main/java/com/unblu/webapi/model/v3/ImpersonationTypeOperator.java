package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsImpersonationTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InImpersonationTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsImpersonationTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInImpersonationTypeOperator.class, name = "NOT_IN"),
})
public interface ImpersonationTypeOperator {
	void setType(EImpersonationTypeOperatorType type);

	EImpersonationTypeOperatorType getType();

	ImpersonationTypeOperator type(EImpersonationTypeOperatorType type);

}
