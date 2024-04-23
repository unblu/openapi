package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = SendTimestampMessageExportFilter.class, name = "SEND_TIMESTAMP"),
})
public interface MessageExportFilter {
	void setField(EMessageExportFilterField field);

	EMessageExportFilterField getField();

	MessageExportFilter field(EMessageExportFilterField field);

	void setOperator(TimestampOperator operator);

	TimestampOperator getOperator();

	MessageExportFilter operator(TimestampOperator operator);

}
