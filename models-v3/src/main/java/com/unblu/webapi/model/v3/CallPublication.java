package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CallDialInPublication.class, name = "DIAL_IN"),
	@JsonSubTypes.Type(value = CallMediaPublication.class, name = "MEDIA"),
})
public interface CallPublication {
	void setId(String id);

	String getId();

	CallPublication id(String id);

	void setCreationTimestamp(Long creationTimestamp);

	Long getCreationTimestamp();

	CallPublication creationTimestamp(Long creationTimestamp);

	void setModificationTimestamp(Long modificationTimestamp);

	Long getModificationTimestamp();

	CallPublication modificationTimestamp(Long modificationTimestamp);

	void setAccountId(String accountId);

	String getAccountId();

	CallPublication accountId(String accountId);

	void setType(ECallPublicationType type);

	ECallPublicationType getType();

	CallPublication type(ECallPublicationType type);

}
