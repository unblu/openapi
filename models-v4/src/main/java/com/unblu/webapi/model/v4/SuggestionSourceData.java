package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true, defaultImpl = CustomSuggestionSourceData.class)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CopilotSuggestionSourceData.class, name = "COPILOT"),
	@JsonSubTypes.Type(value = CustomSuggestionSourceData.class, name = "CUSTOM"),
})
public interface SuggestionSourceData {
	void setId(String id);

	String getId();

	SuggestionSourceData id(String id);

	void setCreationTimestamp(Long creationTimestamp);

	Long getCreationTimestamp();

	SuggestionSourceData creationTimestamp(Long creationTimestamp);

	void setModificationTimestamp(Long modificationTimestamp);

	Long getModificationTimestamp();

	SuggestionSourceData modificationTimestamp(Long modificationTimestamp);

	void setVersion(Long version);

	Long getVersion();

	SuggestionSourceData version(Long version);

	void setAccountId(String accountId);

	String getAccountId();

	SuggestionSourceData accountId(String accountId);

	void setName(String name);

	String getName();

	SuggestionSourceData name(String name);

	void setDescription(String description);

	String getDescription();

	SuggestionSourceData description(String description);

	void setOutboundStatus(EOutboundEndpointStatus outboundStatus);

	EOutboundEndpointStatus getOutboundStatus();

	SuggestionSourceData outboundStatus(EOutboundEndpointStatus outboundStatus);

	void setOutboundEndpoint(String outboundEndpoint);

	String getOutboundEndpoint();

	SuggestionSourceData outboundEndpoint(String outboundEndpoint);

	void setOutboundTimeoutMillis(Long outboundTimeoutMillis);

	Long getOutboundTimeoutMillis();

	SuggestionSourceData outboundTimeoutMillis(Long outboundTimeoutMillis);

	void setType(ESuggestionSourceType type);

	ESuggestionSourceType getType();

	SuggestionSourceData type(ESuggestionSourceType type);

}
