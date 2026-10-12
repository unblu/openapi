package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampConversationContextPanelSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = EnabledConversationContextPanelSearchFilter.class, name = "ENABLED"),
	@JsonSubTypes.Type(value = ModificationTimestampConversationContextPanelSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameConversationContextPanelSearchFilter.class, name = "NAME"),
})
public interface ConversationContextPanelSearchFilter {
	void setField(EConversationContextPanelSearchFilterField field);

	EConversationContextPanelSearchFilterField getField();

	ConversationContextPanelSearchFilter field(EConversationContextPanelSearchFilterField field);

}
