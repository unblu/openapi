package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ApiKeyApiKeySearchFilter.class, name = "API_KEY"),
	@JsonSubTypes.Type(value = CreationTimestampApiKeySearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = DescriptionApiKeySearchFilter.class, name = "DESCRIPTION"),
	@JsonSubTypes.Type(value = ModificationTimestampApiKeySearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameApiKeySearchFilter.class, name = "NAME"),
})
public interface ApiKeySearchFilter {
	void setField(EApiKeySearchFilterField field);

	EApiKeySearchFilterField getField();

	ApiKeySearchFilter field(EApiKeySearchFilterField field);

}
