package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampConversationSummaryTemplateSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = ModificationTimestampConversationSummaryTemplateSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameConversationSummaryTemplateSearchFilter.class, name = "NAME"),
})
public interface ConversationSummaryTemplateSearchFilter {
	void setField(EConversationSummaryTemplateSearchFilterField field);

	EConversationSummaryTemplateSearchFilterField getField();

	ConversationSummaryTemplateSearchFilter field(EConversationSummaryTemplateSearchFilterField field);

}
