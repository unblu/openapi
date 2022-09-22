package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AuthorizationRoleUserSearchFilter.class, name = "AUTHORIZATION_ROLE"),
	@JsonSubTypes.Type(value = CreationTimestampUserSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = EmailUserSearchFilter.class, name = "EMAIL"),
	@JsonSubTypes.Type(value = FirstNameUserSearchFilter.class, name = "FIRST_NAME"),
	@JsonSubTypes.Type(value = LastNameUserSearchFilter.class, name = "LAST_NAME"),
	@JsonSubTypes.Type(value = ModificationTimestampUserSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = TeamIdUserSearchFilter.class, name = "TEAM_ID"),
	@JsonSubTypes.Type(value = UsernameUserSearchFilter.class, name = "USERNAME"),
	@JsonSubTypes.Type(value = VirtualUserUserSearchFilter.class, name = "VIRTUAL_USER"),
})
public interface UserSearchFilter {
	void setField(EUserSearchFilterField field);

	EUserSearchFilterField getField();

	UserSearchFilter field(EUserSearchFilterField field);

}
