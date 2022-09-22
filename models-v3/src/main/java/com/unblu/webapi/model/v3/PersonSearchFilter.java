package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AuthorizationRolePersonSearchFilter.class, name = "AUTHORIZATION_ROLE"),
	@JsonSubTypes.Type(value = EmailPersonSearchFilter.class, name = "EMAIL"),
	@JsonSubTypes.Type(value = FirstNamePersonSearchFilter.class, name = "FIRST_NAME"),
	@JsonSubTypes.Type(value = LastNamePersonSearchFilter.class, name = "LAST_NAME"),
	@JsonSubTypes.Type(value = NicknamePersonSearchFilter.class, name = "NICKNAME"),
	@JsonSubTypes.Type(value = PersonSourcePersonSearchFilter.class, name = "PERSON_SOURCE"),
	@JsonSubTypes.Type(value = PersonTypePersonSearchFilter.class, name = "PERSON_TYPE"),
	@JsonSubTypes.Type(value = PhonePersonSearchFilter.class, name = "PHONE"),
	@JsonSubTypes.Type(value = SourceDataPersonSearchFilter.class, name = "SOURCE_DATA"),
	@JsonSubTypes.Type(value = SourceIdPersonSearchFilter.class, name = "SOURCE_ID"),
	@JsonSubTypes.Type(value = TeamIdPersonSearchFilter.class, name = "TEAM_ID"),
	@JsonSubTypes.Type(value = UsernamePersonSearchFilter.class, name = "USERNAME"),
})
public interface PersonSearchFilter {
	void setField(EPersonSearchFilterField field);

	EPersonSearchFilterField getField();

	PersonSearchFilter field(EPersonSearchFilterField field);

}
