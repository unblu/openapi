package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampContactSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = ModificationTimestampContactSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
})
public interface ContactSearchFilter {
	void setField(EContactSearchFilterField field);

	EContactSearchFilterField getField();

	ContactSearchFilter field(EContactSearchFilterField field);

	void setOperator(TimestampOperator operator);

	TimestampOperator getOperator();

	ContactSearchFilter operator(TimestampOperator operator);

}
