package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = MessageInterceptorOutboundApproveResponse.class, name = "APPROVE"),
	@JsonSubTypes.Type(value = MessageInterceptorOutboundRejectResponse.class, name = "REJECT"),
})
public interface MessageInterceptorOutboundResponse {
	void setType(EMessageInterceptorOutboundResponseType type);

	EMessageInterceptorOutboundResponseType getType();

	MessageInterceptorOutboundResponse type(EMessageInterceptorOutboundResponseType type);

}
