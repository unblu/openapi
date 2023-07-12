package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = KeyCustomActionSearchFilter.class, name = "KEY"),
})
public interface CustomActionSearchFilter {
	void setField(ECustomActionSearchFilterField field);

	ECustomActionSearchFilterField getField();

	CustomActionSearchFilter field(ECustomActionSearchFilterField field);

	void setOperator(StringOperator operator);

	StringOperator getOperator();

	CustomActionSearchFilter operator(StringOperator operator);

}
