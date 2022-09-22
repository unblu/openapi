package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "$_type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AccountData.class, name = "AccountData"),
	@JsonSubTypes.Type(value = NamedAreaData.class, name = "NamedAreaData"),
	@JsonSubTypes.Type(value = PersonData.class, name = "PersonData"),
	@JsonSubTypes.Type(value = TeamData.class, name = "TeamData"),
})
public interface ConversationRecipientData {
	void setId(String id);

	String getId();

	ConversationRecipientData id(String id);

	void setDisplayName(String displayName);

	String getDisplayName();

	ConversationRecipientData displayName(String displayName);

	void setAvatar(ExpandableField<Avatar> avatar);

	ExpandableField<Avatar> getAvatar();

	ConversationRecipientData avatar(ExpandableField<Avatar> avatar);

}
