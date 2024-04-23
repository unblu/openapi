package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = OnlineStateVisitorStateSearchFilter.class, name = "ONLINE_STATE"),
	@JsonSubTypes.Type(value = PersonIdVisitorStateSearchFilter.class, name = "PERSON_ID"),
})
public interface VisitorStateSearchFilter {
	void setField(EVisitorStateSearchFilterField field);

	EVisitorStateSearchFilterField getField();

	VisitorStateSearchFilter field(EVisitorStateSearchFilterField field);

}
