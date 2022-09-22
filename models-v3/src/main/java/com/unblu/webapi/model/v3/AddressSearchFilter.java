package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampAddressSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = ModificationTimestampAddressSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
})
public interface AddressSearchFilter {
	void setField(EAddressSearchFilterField field);

	EAddressSearchFilterField getField();

	AddressSearchFilter field(EAddressSearchFilterField field);

	void setOperator(TimestampOperator operator);

	TimestampOperator getOperator();

	AddressSearchFilter operator(TimestampOperator operator);

}
