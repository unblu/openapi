package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CustomActionInvocationErrorResponse.class, name = "ERROR"),
	@JsonSubTypes.Type(value = CustomActionInvocationExecutedResponse.class, name = "EXECUTED"),
	@JsonSubTypes.Type(value = CustomActionInvocationExecutionStartedResponse.class, name = "EXECUTION_STARTED"),
})
public interface CustomActionInvocationResponse {
	void setType(ECustomActionInvocationResponseType type);

	ECustomActionInvocationResponseType getType();

	CustomActionInvocationResponse type(ECustomActionInvocationResponseType type);

}
