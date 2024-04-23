package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsAuditChangeInteractionTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InAuditChangeInteractionTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsAuditChangeInteractionTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInAuditChangeInteractionTypeOperator.class, name = "NOT_IN"),
})
public interface AuditChangeInteractionTypeOperator {
	void setType(EAuditChangeInteractionTypeOperatorType type);

	EAuditChangeInteractionTypeOperatorType getType();

	AuditChangeInteractionTypeOperator type(EAuditChangeInteractionTypeOperatorType type);

}
