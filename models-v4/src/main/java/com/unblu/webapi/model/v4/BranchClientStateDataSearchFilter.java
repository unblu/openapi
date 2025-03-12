package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ActiveConversationIdBranchClientStateDataSearchFilter.class, name = "ACTIVE_CONVERSATION_ID"),
	@JsonSubTypes.Type(value = BranchClientIdBranchClientStateDataSearchFilter.class, name = "BRANCH_CLIENT_ID"),
})
public interface BranchClientStateDataSearchFilter {
	void setField(EBranchClientStateDataSearchFilterField field);

	EBranchClientStateDataSearchFilterField getField();

	BranchClientStateDataSearchFilter field(EBranchClientStateDataSearchFilterField field);

	void setOperator(StringOperator operator);

	StringOperator getOperator();

	BranchClientStateDataSearchFilter operator(StringOperator operator);

}
