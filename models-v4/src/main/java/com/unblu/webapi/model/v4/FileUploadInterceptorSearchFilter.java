package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampFileUploadInterceptorSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = ModificationTimestampFileUploadInterceptorSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameFileUploadInterceptorSearchFilter.class, name = "NAME"),
})
public interface FileUploadInterceptorSearchFilter {
	void setField(EFileUploadInterceptorSearchFilterField field);

	EFileUploadInterceptorSearchFilterField getField();

	FileUploadInterceptorSearchFilter field(EFileUploadInterceptorSearchFilterField field);

}
