package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = NameBranchSearchFilter.class, name = "NAME"),
})
public interface BranchSearchFilter {
	void setField(EBranchSearchFilterField field);

	EBranchSearchFilterField getField();

	BranchSearchFilter field(EBranchSearchFilterField field);

	void setOperator(StringOperator operator);

	StringOperator getOperator();

	BranchSearchFilter operator(StringOperator operator);

}
