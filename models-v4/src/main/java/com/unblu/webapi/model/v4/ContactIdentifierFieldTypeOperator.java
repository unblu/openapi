package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsContactIdentifierFieldTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InContactIdentifierFieldTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsContactIdentifierFieldTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInContactIdentifierFieldTypeOperator.class, name = "NOT_IN"),
})
public interface ContactIdentifierFieldTypeOperator {
	void setType(EContactIdentifierFieldTypeOperatorType type);

	EContactIdentifierFieldTypeOperatorType getType();

	ContactIdentifierFieldTypeOperator type(EContactIdentifierFieldTypeOperatorType type);

}
