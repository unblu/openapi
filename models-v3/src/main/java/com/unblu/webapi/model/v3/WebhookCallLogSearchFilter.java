package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampWebhookCallLogSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = EndpointWebhookCallLogSearchFilter.class, name = "ENDPOINT"),
	@JsonSubTypes.Type(value = EventNameWebhookCallLogSearchFilter.class, name = "EVENT_NAME"),
	@JsonSubTypes.Type(value = ExecutionTimestampWebhookCallLogSearchFilter.class, name = "EXECUTION_TIMESTAMP"),
	@JsonSubTypes.Type(value = HttpResponseCodeWebhookCallLogSearchFilter.class, name = "HTTP_RESPONSE_CODE"),
	@JsonSubTypes.Type(value = RegistrationIdWebhookCallLogSearchFilter.class, name = "REGISTRATION_ID"),
	@JsonSubTypes.Type(value = RequestIdWebhookCallLogSearchFilter.class, name = "REQUEST_ID"),
	@JsonSubTypes.Type(value = RetryNrWebhookCallLogSearchFilter.class, name = "RETRY_NR"),
})
public interface WebhookCallLogSearchFilter {
	void setField(EWebhookCallLogSearchFilterField field);

	EWebhookCallLogSearchFilterField getField();

	WebhookCallLogSearchFilter field(EWebhookCallLogSearchFilterField field);

}
