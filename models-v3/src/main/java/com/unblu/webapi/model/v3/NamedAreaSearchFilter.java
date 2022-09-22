package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampNamedAreaSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = DescriptionNamedAreaSearchFilter.class, name = "DESCRIPTION"),
	@JsonSubTypes.Type(value = ModificationTimestampNamedAreaSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameNamedAreaSearchFilter.class, name = "NAME"),
	@JsonSubTypes.Type(value = SiteIdNamedAreaSearchFilter.class, name = "SITE_ID"),
})
public interface NamedAreaSearchFilter {
	void setField(ENamedAreaSearchFilterField field);

	ENamedAreaSearchFilterField getField();

	NamedAreaSearchFilter field(ENamedAreaSearchFilterField field);

}
