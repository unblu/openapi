package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsOnlineStateOperator.class, name = "EQUALS"),
})
public interface OnlineStateOperator {
	void setType(EOnlineStateOperatorType type);

	EOnlineStateOperatorType getType();

	OnlineStateOperator type(EOnlineStateOperatorType type);

	void setValue(EOnlineState value);

	EOnlineState getValue();

	OnlineStateOperator value(EOnlineState value);

}
