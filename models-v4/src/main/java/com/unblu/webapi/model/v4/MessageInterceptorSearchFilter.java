package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampMessageInterceptorSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = ModificationTimestampMessageInterceptorSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameMessageInterceptorSearchFilter.class, name = "NAME"),
})
public interface MessageInterceptorSearchFilter {
	void setField(EMessageInterceptorSearchFilterField field);

	EMessageInterceptorSearchFilterField getField();

	MessageInterceptorSearchFilter field(EMessageInterceptorSearchFilterField field);

}
