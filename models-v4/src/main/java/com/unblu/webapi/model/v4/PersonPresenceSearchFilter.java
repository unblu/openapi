package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = JoinedTimestampPersonPresenceSearchFilter.class, name = "JOINED_TIMESTAMP"),
	@JsonSubTypes.Type(value = LeftTimestampPersonPresenceSearchFilter.class, name = "LEFT_TIMESTAMP"),
	@JsonSubTypes.Type(value = PersonIdPersonPresenceSearchFilter.class, name = "PERSON_ID"),
})
public interface PersonPresenceSearchFilter {
	void setField(EPersonPresenceSearchFilterField field);

	EPersonPresenceSearchFilterField getField();

	PersonPresenceSearchFilter field(EPersonPresenceSearchFilterField field);

}
