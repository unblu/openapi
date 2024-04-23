package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsCallServiceProviderOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = NotEqualsCallServiceProviderOperator.class, name = "NOT_EQUALS"),
})
public interface CallServiceProviderOperator {
	void setType(ECallServiceProviderOperatorType type);

	ECallServiceProviderOperatorType getType();

	CallServiceProviderOperator type(ECallServiceProviderOperatorType type);

	void setValue(ECallServiceProvider value);

	ECallServiceProvider getValue();

	CallServiceProviderOperator value(ECallServiceProvider value);

}
