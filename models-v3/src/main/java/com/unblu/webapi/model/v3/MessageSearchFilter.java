package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = SendTimestampMessageSearchFilter.class, name = "SEND_TIMESTAMP"),
})
public interface MessageSearchFilter {
	void setField(EMessageSearchFilterField field);

	EMessageSearchFilterField getField();

	MessageSearchFilter field(EMessageSearchFilterField field);

	void setOperator(TimestampOperator operator);

	TimestampOperator getOperator();

	MessageSearchFilter operator(TimestampOperator operator);

}
