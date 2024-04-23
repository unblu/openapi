package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = NamePersonLabelSearchFilter.class, name = "NAME"),
})
public interface PersonLabelSearchFilter {
	void setField(EPersonLabelSearchFilterField field);

	EPersonLabelSearchFilterField getField();

	PersonLabelSearchFilter field(EPersonLabelSearchFilterField field);

	void setOperator(StringOperator operator);

	StringOperator getOperator();

	PersonLabelSearchFilter operator(StringOperator operator);

}
