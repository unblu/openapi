package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AgentLabelSelectionConversationVisibilityRuleSearchFilter.class, name = "AGENT_LABEL_SELECTION"),
	@JsonSubTypes.Type(value = ConversationLabelSelectionConversationVisibilityRuleSearchFilter.class, name = "CONVERSATION_LABEL_SELECTION"),
	@JsonSubTypes.Type(value = NameConversationVisibilityRuleSearchFilter.class, name = "NAME"),
})
public interface ConversationVisibilityRuleSearchFilter {
	void setField(EConversationVisibilityRuleSearchFilterField field);

	EConversationVisibilityRuleSearchFilterField getField();

	ConversationVisibilityRuleSearchFilter field(EConversationVisibilityRuleSearchFilterField field);

}
