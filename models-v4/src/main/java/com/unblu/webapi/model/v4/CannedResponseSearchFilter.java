package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampCannedResponseSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = KeyCannedResponseSearchFilter.class, name = "KEY"),
	@JsonSubTypes.Type(value = ModificationTimestampCannedResponseSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = OwnerIdCannedResponseSearchFilter.class, name = "OWNER_ID"),
	@JsonSubTypes.Type(value = OwnerTypeCannedResponseSearchFilter.class, name = "OWNER_TYPE"),
	@JsonSubTypes.Type(value = TextCannedResponseSearchFilter.class, name = "TEXT"),
	@JsonSubTypes.Type(value = TitleCannedResponseSearchFilter.class, name = "TITLE"),
})
public interface CannedResponseSearchFilter {
	void setField(ECannedResponseSearchFilterField field);

	ECannedResponseSearchFilterField getField();

	CannedResponseSearchFilter field(ECannedResponseSearchFilterField field);

}
