package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CreationTimestampWebhookRegistrationSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = DescriptionWebhookRegistrationSearchFilter.class, name = "DESCRIPTION"),
	@JsonSubTypes.Type(value = EndpointWebhookRegistrationSearchFilter.class, name = "ENDPOINT"),
	@JsonSubTypes.Type(value = ModificationTimestampWebhookRegistrationSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameWebhookRegistrationSearchFilter.class, name = "NAME"),
})
public interface WebhookRegistrationSearchFilter {
	void setField(EWebhookRegistrationSearchFilterField field);

	EWebhookRegistrationSearchFilterField getField();

	WebhookRegistrationSearchFilter field(EWebhookRegistrationSearchFilterField field);

}
