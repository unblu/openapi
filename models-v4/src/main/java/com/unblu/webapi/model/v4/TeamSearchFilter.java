package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampTeamSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = DescriptionTeamSearchFilter.class, name = "DESCRIPTION"),
	@JsonSubTypes.Type(value = ModificationTimestampTeamSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameTeamSearchFilter.class, name = "NAME"),
	@JsonSubTypes.Type(value = ParentIdTeamSearchFilter.class, name = "PARENT_ID"),
})
public interface TeamSearchFilter {
	void setField(ETeamSearchFilterField field);

	ETeamSearchFilterField getField();

	TeamSearchFilter field(ETeamSearchFilterField field);

}
