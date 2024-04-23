package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampConversationTemplateSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = DefaultTemplateConversationTemplateSearchFilter.class, name = "DEFAULT_TEMPLATE"),
	@JsonSubTypes.Type(value = DescriptionConversationTemplateSearchFilter.class, name = "DESCRIPTION"),
	@JsonSubTypes.Type(value = InitialEngagementTypeConversationTemplateSearchFilter.class, name = "INITIAL_ENGAGEMENT_TYPE"),
	@JsonSubTypes.Type(value = ModificationTimestampConversationTemplateSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameConversationTemplateSearchFilter.class, name = "NAME"),
})
public interface ConversationTemplateSearchFilter {
	void setField(EConversationTemplateSearchFilterField field);

	EConversationTemplateSearchFilterField getField();

	ConversationTemplateSearchFilter field(EConversationTemplateSearchFilterField field);

}
