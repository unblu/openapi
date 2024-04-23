package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampSuggestionSourceSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = ModificationTimestampSuggestionSourceSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameSuggestionSourceSearchFilter.class, name = "NAME"),
})
public interface SuggestionSourceSearchFilter {
	void setField(ESuggestionSourceSearchFilterField field);

	ESuggestionSourceSearchFilterField getField();

	SuggestionSourceSearchFilter field(ESuggestionSourceSearchFilterField field);

}
