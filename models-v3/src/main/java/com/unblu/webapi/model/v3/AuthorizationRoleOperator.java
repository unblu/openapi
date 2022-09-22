package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = EqualsAuthorizationRoleOperator.class, name = "EQUALS"),
	@JsonSubTypes.Type(value = InAuthorizationRoleOperator.class, name = "IN"),
	@JsonSubTypes.Type(value = NotEqualsAuthorizationRoleOperator.class, name = "NOT_EQUALS"),
	@JsonSubTypes.Type(value = NotInAuthorizationRoleOperator.class, name = "NOT_IN"),
})
public interface AuthorizationRoleOperator {
	void setType(EAuthorizationRoleOperatorType type);

	EAuthorizationRoleOperatorType getType();

	AuthorizationRoleOperator type(EAuthorizationRoleOperatorType type);

}
