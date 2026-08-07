package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = NameLabelSearchFilter.class, name = "NAME"),
})
public interface LabelSearchFilter {
	void setField(ELabelSearchFilterField field);

	ELabelSearchFilterField getField();

	LabelSearchFilter field(ELabelSearchFilterField field);

	void setOperator(StringOperator operator);

	StringOperator getOperator();

	LabelSearchFilter operator(StringOperator operator);

}
