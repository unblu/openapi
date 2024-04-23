package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampExternalMessengerChannelSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = ModificationTimestampExternalMessengerChannelSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameExternalMessengerChannelSearchFilter.class, name = "NAME"),
	@JsonSubTypes.Type(value = TypeExternalMessengerChannelSearchFilter.class, name = "TYPE"),
})
public interface ExternalMessengerChannelSearchFilter {
	void setField(EExternalMessengerChannelSearchFilterField field);

	EExternalMessengerChannelSearchFilterField getField();

	ExternalMessengerChannelSearchFilter field(EExternalMessengerChannelSearchFilterField field);

}
