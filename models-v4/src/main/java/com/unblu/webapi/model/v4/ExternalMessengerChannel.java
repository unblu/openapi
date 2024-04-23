package com.unblu.webapi.model.v4;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CustomExternalMessengerChannel.class, name = "CUSTOM"),
	@JsonSubTypes.Type(value = SmsExternalMessengerChannel.class, name = "SMS"),
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

	void setSupportsMultipleConversationsPerContact(Boolean supportsMultipleConversationsPerContact);

	Boolean isSupportsMultipleConversationsPerContact();

	ExternalMessengerChannel supportsMultipleConversationsPerContact(Boolean supportsMultipleConversationsPerContact);

	void setMetadata(Map<String, String> metadata);

	Map<String, String> getMetadata();

	ExternalMessengerChannel metadata(Map<String, String> metadata);

}
