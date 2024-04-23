package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampExternalMessengerContactSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = ExternalMessengerChannelIdExternalMessengerContactSearchFilter.class, name = "EXTERNAL_MESSENGER_CHANNEL_ID"),
	@JsonSubTypes.Type(value = IdExternalMessengerContactSearchFilter.class, name = "ID"),
	@JsonSubTypes.Type(value = ModificationTimestampExternalMessengerContactSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameExternalMessengerContactSearchFilter.class, name = "NAME"),
	@JsonSubTypes.Type(value = PersonIdExternalMessengerContactSearchFilter.class, name = "PERSON_ID"),
	@JsonSubTypes.Type(value = SourceIdExternalMessengerContactSearchFilter.class, name = "SOURCE_ID"),
})
public interface ExternalMessengerContactSearchFilter {
	void setField(EExternalMessengerContactSearchFilterField field);

	EExternalMessengerContactSearchFilterField getField();

	ExternalMessengerContactSearchFilter field(EExternalMessengerContactSearchFilterField field);

}
