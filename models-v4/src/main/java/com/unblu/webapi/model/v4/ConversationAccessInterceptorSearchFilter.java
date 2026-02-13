package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampConversationAccessInterceptorSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = ModificationTimestampConversationAccessInterceptorSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameConversationAccessInterceptorSearchFilter.class, name = "NAME"),
})
public interface ConversationAccessInterceptorSearchFilter {
	void setField(EConversationAccessInterceptorSearchFilterField field);

	EConversationAccessInterceptorSearchFilterField getField();

	ConversationAccessInterceptorSearchFilter field(EConversationAccessInterceptorSearchFilterField field);

}
