package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AuthorizationRolePersonTypedSearchFilter.class, name = "AUTHORIZATION_ROLE"),
	@JsonSubTypes.Type(value = PersonTypedCompoundSearchFilter.class, name = "COMPOUND"),
	@JsonSubTypes.Type(value = EmailPersonTypedSearchFilter.class, name = "EMAIL"),
	@JsonSubTypes.Type(value = FirstNamePersonTypedSearchFilter.class, name = "FIRST_NAME"),
	@JsonSubTypes.Type(value = LastNamePersonTypedSearchFilter.class, name = "LAST_NAME"),
	@JsonSubTypes.Type(value = NicknamePersonTypedSearchFilter.class, name = "NICKNAME"),
	@JsonSubTypes.Type(value = PersonLabelsPersonTypedSearchFilter.class, name = "PERSON_LABELS"),
	@JsonSubTypes.Type(value = PhonePersonTypedSearchFilter.class, name = "PHONE"),
	@JsonSubTypes.Type(value = SourceIdPersonTypedSearchFilter.class, name = "SOURCE_ID"),
	@JsonSubTypes.Type(value = TeamIdPersonTypedSearchFilter.class, name = "TEAM_ID"),
	@JsonSubTypes.Type(value = UsernamePersonTypedSearchFilter.class, name = "USERNAME"),
})
public interface PersonTypedSearchFilter {
	void setField(EPersonTypedSearchFilterField field);

	EPersonTypedSearchFilterField getField();

	PersonTypedSearchFilter field(EPersonTypedSearchFilterField field);

}
