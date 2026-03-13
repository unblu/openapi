package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampAccountIngressSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = EntryPathAccountIngressSearchFilter.class, name = "ENTRY_PATH"),
	@JsonSubTypes.Type(value = ModificationTimestampAccountIngressSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = OriginAccountIngressSearchFilter.class, name = "ORIGIN"),
})
public interface AccountIngressSearchFilter {
	void setField(EAccountIngressSearchFilterField field);

	EAccountIngressSearchFilterField getField();

	AccountIngressSearchFilter field(EAccountIngressSearchFilterField field);

}
