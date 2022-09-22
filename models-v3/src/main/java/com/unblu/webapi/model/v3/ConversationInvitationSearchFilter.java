package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ConversationIdConversationInvitationSearchFilter.class, name = "CONVERSATION_ID"),
	@JsonSubTypes.Type(value = CreationTimestampConversationInvitationSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = CreatorPersonIdConversationInvitationSearchFilter.class, name = "CREATOR_PERSON_ID"),
	@JsonSubTypes.Type(value = CreatorTypeConversationInvitationSearchFilter.class, name = "CREATOR_TYPE"),
	@JsonSubTypes.Type(value = ExpirationTimestampConversationInvitationSearchFilter.class, name = "EXPIRATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = InvitationTypeConversationInvitationSearchFilter.class, name = "INVITATION_TYPE"),
	@JsonSubTypes.Type(value = RedeemingPersonIdConversationInvitationSearchFilter.class, name = "REDEEMING_PERSON_ID"),
	@JsonSubTypes.Type(value = TargetIdConversationInvitationSearchFilter.class, name = "TARGET_ID"),
	@JsonSubTypes.Type(value = TargetTypeConversationInvitationSearchFilter.class, name = "TARGET_TYPE"),
})
public interface ConversationInvitationSearchFilter {
	void setField(EConversationInvitationSearchFilterField field);

	EConversationInvitationSearchFilterField getField();

	ConversationInvitationSearchFilter field(EConversationInvitationSearchFilterField field);

}
