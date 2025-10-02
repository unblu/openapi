package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ConversationIdConversationSummarySearchFilter.class, name = "CONVERSATION_ID"),
	@JsonSubTypes.Type(value = ConversationSummaryTemplateIdConversationSummarySearchFilter.class, name = "CONVERSATION_SUMMARY_TEMPLATE_ID"),
	@JsonSubTypes.Type(value = CreationTimestampConversationSummarySearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = ModificationTimestampConversationSummarySearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = SummaryTriggerTypeConversationSummarySearchFilter.class, name = "SUMMARY_TRIGGER_TYPE"),
})
public interface ConversationSummarySearchFilter {
	void setField(EConversationSummarySearchFilterField field);

	EConversationSummarySearchFilterField getField();

	ConversationSummarySearchFilter field(EConversationSummarySearchFilterField field);

}
