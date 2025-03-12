package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = BranchClientKeyBranchClientSearchFilter.class, name = "BRANCH_CLIENT_KEY"),
	@JsonSubTypes.Type(value = BranchIdBranchClientSearchFilter.class, name = "BRANCH_ID"),
	@JsonSubTypes.Type(value = NameBranchClientSearchFilter.class, name = "NAME"),
})
public interface BranchClientSearchFilter {
	void setField(EBranchClientSearchFilterField field);

	EBranchClientSearchFilterField getField();

	BranchClientSearchFilter field(EBranchClientSearchFilterField field);

	void setOperator(StringOperator operator);

	StringOperator getOperator();

	BranchClientSearchFilter operator(StringOperator operator);

}
