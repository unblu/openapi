package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsPauseNotificationsStateOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = NotEqualsPauseNotificationsStateOperator.class, name = "NOT_EQUALS"),
})
public interface PauseNotificationsStateOperator {
	void setType(EPauseNotificationsStateOperatorType type);

	EPauseNotificationsStateOperatorType getType();

	PauseNotificationsStateOperator type(EPauseNotificationsStateOperatorType type);

	void setValue(EPauseNotificationsState value);

	EPauseNotificationsState getValue();

	PauseNotificationsStateOperator value(EPauseNotificationsState value);

}
