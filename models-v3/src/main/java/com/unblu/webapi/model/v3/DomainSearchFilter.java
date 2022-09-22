package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampDomainSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = DomainNameDomainSearchFilter.class, name = "DOMAIN_NAME"),
	@JsonSubTypes.Type(value = ModificationTimestampDomainSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
})
public interface DomainSearchFilter {
	void setField(EDomainSearchFilterField field);

	EDomainSearchFilterField getField();

	DomainSearchFilter field(EDomainSearchFilterField field);

}
