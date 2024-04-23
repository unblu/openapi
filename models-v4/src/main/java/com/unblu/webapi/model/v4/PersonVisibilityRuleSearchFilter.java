package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AgentLabelSelectionPersonVisibilityRuleSearchFilter.class, name = "AGENT_LABEL_SELECTION"),
	@JsonSubTypes.Type(value = NamePersonVisibilityRuleSearchFilter.class, name = "NAME"),
	@JsonSubTypes.Type(value = VisitorLabelSelectionPersonVisibilityRuleSearchFilter.class, name = "VISITOR_LABEL_SELECTION"),
})
public interface PersonVisibilityRuleSearchFilter {
	void setField(EPersonVisibilityRuleSearchFilterField field);

	EPersonVisibilityRuleSearchFilterField getField();

	PersonVisibilityRuleSearchFilter field(EPersonVisibilityRuleSearchFilterField field);

}
