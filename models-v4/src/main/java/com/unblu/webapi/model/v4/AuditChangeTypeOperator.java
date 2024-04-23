package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsAuditChangeTypeOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InAuditChangeTypeOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsAuditChangeTypeOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInAuditChangeTypeOperator.class, name = "NOT_IN"),
})
public interface AuditChangeTypeOperator {
	void setType(EAuditChangeTypeOperatorType type);

	EAuditChangeTypeOperatorType getType();

	AuditChangeTypeOperator type(EAuditChangeTypeOperatorType type);

}
