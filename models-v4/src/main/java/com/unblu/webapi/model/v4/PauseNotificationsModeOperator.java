package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsPauseNotificationsModeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = NotEqualsPauseNotificationsModeOperator.class, name = "NOT_EQUALS"),
})
public interface PauseNotificationsModeOperator {
	void setType(EPauseNotificationsModeOperatorType type);

	EPauseNotificationsModeOperatorType getType();

	PauseNotificationsModeOperator type(EPauseNotificationsModeOperatorType type);

	void setValue(EPauseNotificationsMode value);

	EPauseNotificationsMode getValue();

	PauseNotificationsModeOperator value(EPauseNotificationsMode value);

}
