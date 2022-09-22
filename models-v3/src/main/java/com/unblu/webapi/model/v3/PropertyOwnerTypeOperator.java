package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsPropertyOwnerTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InPropertyOwnerTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsPropertyOwnerTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInPropertyOwnerTypeOperator.class, name = "NOT_IN"),
})
public interface PropertyOwnerTypeOperator {
	void setType(EPropertyOwnerTypeOperatorType type);

	EPropertyOwnerTypeOperatorType getType();

	PropertyOwnerTypeOperator type(EPropertyOwnerTypeOperatorType type);

}
