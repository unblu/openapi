package com.unblu.webapi.model.v3;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "$_type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CustomExternalMessengerChannel.class, name = "CustomExternalMessengerChannel"),
})
public interface ExternalMessengerChannel {
	void setId(String id);

	String getId();

	ExternalMessengerChannel id(String id);

	void setCreationTimestamp(Long creationTimestamp);

	Long getCreationTimestamp();

	ExternalMessengerChannel creationTimestamp(Long creationTimestamp);

	void setModificationTimestamp(Long modificationTimestamp);

	Long getModificationTimestamp();

	ExternalMessengerChannel modificationTimestamp(Long modificationTimestamp);

	void setVersion(Long version);

	Long getVersion();

	ExternalMessengerChannel version(Long version);

	void setAccountId(String accountId);

	String getAccountId();

	ExternalMessengerChannel accountId(String accountId);

	void setName(String name);

	String getName();

	ExternalMessengerChannel name(String name);

	void setDescription(String description);

	String getDescription();

	ExternalMessengerChannel description(String description);

	void setChannelIcon(ExpandableField<Avatar> channelIcon);

	ExpandableField<Avatar> getChannelIcon();

	ExternalMessengerChannel channelIcon(ExpandableField<Avatar> channelIcon);

	void setSourceId(String sourceId);

	String getSourceId();

	ExternalMessengerChannel sourceId(String sourceId);

	void setType(EExternalMessengerChannelType type);

	EExternalMessengerChannelType getType();

	ExternalMessengerChannel type(EExternalMessengerChannelType type);

	void setWebhookEndpoint(String webhookEndpoint);

	String getWebhookEndpoint();

	ExternalMessengerChannel webhookEndpoint(String webhookEndpoint);

	void setWebhookSecret(String webhookSecret);

	String getWebhookSecret();

	ExternalMessengerChannel webhookSecret(String webhookSecret);

	void setWebhookStatus(ERegistrationStatus webhookStatus);

	ERegistrationStatus getWebhookStatus();

	ExternalMessengerChannel webhookStatus(ERegistrationStatus webhookStatus);

	void setMessageStateHandledExternally(Boolean messageStateHandledExternally);

	Boolean isMessageStateHandledExternally();

	ExternalMessengerChannel messageStateHandledExternally(Boolean messageStateHandledExternally);

	void setMetadata(Map<String, String> metadata);

	Map<String, String> getMetadata();

	ExternalMessengerChannel metadata(Map<String, String> metadata);

}
