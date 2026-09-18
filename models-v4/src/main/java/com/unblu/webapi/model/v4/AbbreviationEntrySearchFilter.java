package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AbbreviationAbbreviationEntrySearchFilter.class, name = "ABBREVIATION"),
	@JsonSubTypes.Type(value = CaseSensitiveAbbreviationEntrySearchFilter.class, name = "CASE_SENSITIVE"),
	@JsonSubTypes.Type(value = CreationTimestampAbbreviationEntrySearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = ExpansionAbbreviationEntrySearchFilter.class, name = "EXPANSION"),
	@JsonSubTypes.Type(value = LanguageAbbreviationEntrySearchFilter.class, name = "LANGUAGE"),
	@JsonSubTypes.Type(value = ModificationTimestampAbbreviationEntrySearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = OwnerIdAbbreviationEntrySearchFilter.class, name = "OWNER_ID"),
	@JsonSubTypes.Type(value = OwnerTypeAbbreviationEntrySearchFilter.class, name = "OWNER_TYPE"),
})
public interface AbbreviationEntrySearchFilter {
	void setField(EAbbreviationEntrySearchFilterField field);

	EAbbreviationEntrySearchFilterField getField();

	AbbreviationEntrySearchFilter field(EAbbreviationEntrySearchFilterField field);

}
