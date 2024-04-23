package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "$_type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = PersonData.class, name = "PersonData"),
	@JsonSubTypes.Type(value = TeamData.class, name = "TeamData"),
})
public interface AgentTargetData {
	void setId(String id);

	String getId();

	AgentTargetData id(String id);

	void setAccountId(String accountId);

	String getAccountId();

	AgentTargetData accountId(String accountId);

	void setDisplayName(String displayName);

	String getDisplayName();

	AgentTargetData displayName(String displayName);

	void setAvatar(ExpandableField<Avatar> avatar);

	ExpandableField<Avatar> getAvatar();

	AgentTargetData avatar(ExpandableField<Avatar> avatar);

}
