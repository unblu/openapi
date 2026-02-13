package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ConversationAccessInterceptorOutboundDenyResponse.class, name = "DENY"),
	@JsonSubTypes.Type(value = ConversationAccessInterceptorOutboundGrantResponse.class, name = "GRANT"),
})
public interface ConversationAccessInterceptorOutboundResponse {
	void setType(EConversationAccessInterceptorOutboundResponseType type);

	EConversationAccessInterceptorOutboundResponseType getType();

	ConversationAccessInterceptorOutboundResponse type(EConversationAccessInterceptorOutboundResponseType type);

}
