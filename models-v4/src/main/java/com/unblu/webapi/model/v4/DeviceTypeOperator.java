package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsDeviceTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InDeviceTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsDeviceTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInDeviceTypeOperator.class, name = "NOT_IN"),
})
public interface DeviceTypeOperator {
	void setType(EDeviceTypeOperatorType type);

	EDeviceTypeOperatorType getType();

	DeviceTypeOperator type(EDeviceTypeOperatorType type);

}
