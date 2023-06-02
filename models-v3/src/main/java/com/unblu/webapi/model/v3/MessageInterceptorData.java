package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ExternalMessageInterceptorData.class, name = "EXTERNAL"),
	@JsonSubTypes.Type(value = InternalMessageInterceptorData.class, name = "INTERNAL"),
})
public interface MessageInterceptorData {
	void setId(String id);

	String getId();

	MessageInterceptorData id(String id);

	void setCreationTimestamp(Long creationTimestamp);

	Long getCreationTimestamp();

	MessageInterceptorData creationTimestamp(Long creationTimestamp);

	void setModificationTimestamp(Long modificationTimestamp);

	Long getModificationTimestamp();

	MessageInterceptorData modificationTimestamp(Long modificationTimestamp);

	void setVersion(Long version);

	Long getVersion();

	MessageInterceptorData version(Long version);

	void setAccountId(String accountId);

	String getAccountId();

	MessageInterceptorData accountId(String accountId);

	void setName(String name);

	String getName();

	MessageInterceptorData name(String name);

	void setDescription(String description);

	String getDescription();

	MessageInterceptorData description(String description);

	void setMessageFilter(EMessageInterceptorMessageFilter messageFilter);

	EMessageInterceptorMessageFilter getMessageFilter();

	MessageInterceptorData messageFilter(EMessageInterceptorMessageFilter messageFilter);

	void setTimeoutBehavior(EMessageInterceptorTimeoutBehavior timeoutBehavior);

	EMessageInterceptorTimeoutBehavior getTimeoutBehavior();

	MessageInterceptorData timeoutBehavior(EMessageInterceptorTimeoutBehavior timeoutBehavior);

	void setType(EMessageInterceptorType type);

	EMessageInterceptorType getType();

	MessageInterceptorData type(EMessageInterceptorType type);

}
