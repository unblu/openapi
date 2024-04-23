package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ContactIdentifierFieldNameCustomExternalMessengerChannelSearchFilter.class, name = "CONTACT_IDENTIFIER_FIELD_NAME"),
	@JsonSubTypes.Type(value = ContactIdentifierFieldTypeCustomExternalMessengerChannelSearchFilter.class, name = "CONTACT_IDENTIFIER_FIELD_TYPE"),
	@JsonSubTypes.Type(value = CreationTimestampCustomExternalMessengerChannelSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = ModificationTimestampCustomExternalMessengerChannelSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameCustomExternalMessengerChannelSearchFilter.class, name = "NAME"),
})
public interface CustomExternalMessengerChannelSearchFilter {
	void setField(ECustomExternalMessengerChannelSearchFilterField field);

	ECustomExternalMessengerChannelSearchFilterField getField();

	CustomExternalMessengerChannelSearchFilter field(ECustomExternalMessengerChannelSearchFilterField field);

}
