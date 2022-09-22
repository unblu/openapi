package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampDialogBotSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = ModificationTimestampDialogBotSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameDialogBotSearchFilter.class, name = "NAME"),
})
public interface DialogBotSearchFilter {
	void setField(EDialogBotSearchFilterField field);

	EDialogBotSearchFilterField getField();

	DialogBotSearchFilter field(EDialogBotSearchFilterField field);

}
