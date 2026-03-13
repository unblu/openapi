package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsAccountIngressEntryPathOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InAccountIngressEntryPathOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsAccountIngressEntryPathOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInAccountIngressEntryPathOperator.class, name = "NOT_IN"),
})
public interface AccountIngressEntryPathOperator {
	void setType(EAccountIngressEntryPathOperatorType type);

	EAccountIngressEntryPathOperatorType getType();

	AccountIngressEntryPathOperator type(EAccountIngressEntryPathOperatorType type);

}
